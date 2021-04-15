package com.cc.app.core.service;

import com.alibaba.fastjson.JSONObject;
import com.cc.app.base.common.HikConfig;
import com.cc.app.base.common.HikPaperTypeEnum;
import com.cc.app.base.common.RtnData;
import com.cc.app.base.ex.ServiceException;
import com.cc.app.base.utils.DataUtil;
import com.cc.app.base.utils.FileUtil;
import com.cc.app.base.utils.HikHttpUtils;
import com.cc.app.base.utils.UUIDGenUtil;
import com.cc.app.core.dao.PersonalInfoMapper;
import com.cc.app.core.dao.PhotoInfoMapper;
import com.cc.app.core.model.PersonalInfo;
import com.cc.app.core.model.PhotoInfo;
import com.cc.app.core.model.PhotoInfoExample;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PhotoInfoService {

    private Logger logger = LoggerFactory.getLogger(PhotoInfoService.class);

    @Autowired
    private PersonalInfoMapper personalInfoMapper;
    @Autowired
    private PhotoInfoMapper photoInfoMapper;
    @Autowired
    private HikConfig hikConfig;
    @Autowired
    private FaceGroupService faceGroupService;

    public Map<String,Object> list(String personalId) {
        Map<String,Object> info = null;
        List<Map<String,Object>> list = photoInfoMapper.getInfo(personalId);
        if(list.size() > 0){
            info = list.get(0);
            String fileServerUrl = DataUtil.getProperty("fileServerUrl");
            fileServerUrl = fileServerUrl == null ? "" : fileServerUrl;
            info.put("FILE_SERVER_URL", fileServerUrl);
        }
        return info;
    }

    @Transactional(rollbackFor = Exception.class)
    public RtnData add(PhotoInfo entity) throws Exception {
        String personalId = entity.getPersonalId();
        if(StringUtils.isBlank(personalId)){
            logger.error("人员ID不能为空");
            return RtnData.fail("人员ID不能为空");
        }
        PersonalInfo personalInfo = personalInfoMapper.selectByPrimaryKey(personalId);
        if(personalInfo == null){
            logger.error("人员信息不存在");
            return RtnData.fail("人员信息不存在");
        }
        PhotoInfo photoInfo = photoInfo(entity.getPersonalId());
        //删除已存在的人脸
        if(photoInfo != null){
            this.deleteFace(photoInfo.getPhotoId(), false);
        }

        Date now = new Date();
        entity.setCrtTime(now);

        this.addFace(personalInfo, entity);
        return RtnData.ok();
    }

    public void addFace(PersonalInfo personalInfo, PhotoInfo photoInfo) throws Exception {
        String photoUrl = photoInfo.getPhotoUrl();

        //查询人脸分组
        String groupId = faceGroupService.getFaceGroupId();
        if(StringUtils.isBlank(groupId)){
            throw new ServiceException("人脸分组不存在，请先建立!");
        }
        photoInfo.setGroupId(groupId);

        String fileServerDir = DataUtil.getProperty("fileServerDir");
        String photoPath = fileServerDir + "/" + photoUrl;
        logger.info("照片文件存放目录：{}", photoPath);
        File photoFile = new File(photoPath);
        if(!photoFile.exists()){
            throw new ServiceException("照片不存在!");
        }

        String photoId;
        if(hikConfig.isEnabled()) {
            Map<String, Object> hikMap = new HashMap<>();
            hikMap.put("faceGroupIndexCode",groupId);

            Map<String, Object> faceInfo = new HashMap<>();
            faceInfo.put("name", personalInfo.getCustomerName());
            faceInfo.put("sex", personalInfo.getGender());
            faceInfo.put("certificateType", HikPaperTypeEnum.get(personalInfo.getPaperType()));
            faceInfo.put("certificateNum", personalInfo.getPaperNo());

            Map<String, Object> facePic = new HashMap<>();
            String photoBase64Str = FileUtil.fileToBase64String(photoFile);
            logger.debug("BASE64字符串-人脸文件：{}", photoBase64Str);
            facePic.put("faceBinaryData", photoBase64Str);

            hikMap.put("faceInfo", faceInfo);
            hikMap.put("facePic", facePic);
            JSONObject result = HikHttpUtils.getInstance().post(hikConfig.getAddFaceUrl(), hikMap);
            String code = result.getString("code");
            String msg = result.getString("msg");
            if (!"0".equals(code)) {
                logger.error("人脸添加失败：{}", msg);
                throw new Exception(msg);
            }
            JSONObject data = (JSONObject) result.get("data");
            photoId = data.getString("indexCode");
        }else{
            photoId = UUIDGenUtil.uuid();
        }
        photoInfo.setPhotoId(photoId);
        photoInfoMapper.insert(photoInfo);
    }

    public RtnData delete(Map<String,Object> params) throws Exception {
        String id = (String) params.get("id");
        String force = (String) params.get("force");
        boolean isForce = "1".equals(force) ? true : false;
        logger.info("是否为强制删除：{}", isForce);
        this.deleteFace(id, isForce);
        return RtnData.ok();
    }

    public void deleteFace(String photoId, boolean isForce) throws Exception {
        PhotoInfo entity = photoInfoMapper.selectByPrimaryKey(photoId);
        if(entity == null){
            logger.error("人脸信息不存在");
            throw new Exception("人脸信息不存在");
        }

        if(hikConfig.isEnabled()){
            Map<String,Object> hikMap = new HashMap<>();
            hikMap.put("faceGroupIndexCode", entity.getGroupId());
            hikMap.put("indexCodes", new String[]{ photoId });
            JSONObject result = HikHttpUtils.getInstance().post(hikConfig.getDelFaceUrl(), hikMap);
            String code = result.getString("code");
            String msg = result.getString("msg");
            if (!"0".equals(code)) {
                logger.error("人脸信息删除异常：{}", msg);
                if(!isForce){
                    throw new Exception(msg);
                }
            }
            boolean data = result.getBoolean("data");
            if(!data){
                logger.error("海康平台-人脸删除失败");
                if(!isForce){
                    throw new Exception("海康平台-人脸删除失败");
                }
            }
        }
        photoInfoMapper.deleteByPrimaryKey(photoId);
    }

    public PhotoInfo photoInfo(String personalId){
        PhotoInfoExample example = new PhotoInfoExample();
        PhotoInfoExample.Criteria criteria = example.createCriteria();
        criteria.andPersonalIdEqualTo(personalId);
        List<PhotoInfo> list = photoInfoMapper.selectByExample(example);
        if(list.size() > 0){
            return list.get(0);
        }
        return null;
    }

    public int countPhoto(String personalId){
        PhotoInfoExample example = new PhotoInfoExample();
        PhotoInfoExample.Criteria criteria = example.createCriteria();
        criteria.andPersonalIdEqualTo(personalId);
        return photoInfoMapper.countByExample(example);
    }
}
