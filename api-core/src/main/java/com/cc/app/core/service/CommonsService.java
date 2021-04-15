package com.cc.app.core.service;

import com.cc.app.base.common.RtnData;
import com.cc.app.base.service.DataDicService;
import com.cc.app.base.utils.DataUtil;
import com.cc.app.base.utils.DateUtils;
import com.cc.app.base.utils.UUIDGenUtil;
import com.cc.app.core.dao.OrganizationMapper;
import com.cc.app.core.dao.PositionMapper;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.*;

@Service
public class CommonsService {

    private Logger logger = LoggerFactory.getLogger(CommonsService.class);

    @Autowired
    private OrganizationMapper organizationMapper;
    @Autowired
    private PositionMapper positionMapper;
    @Autowired
    private DataDicService dataDicService;

    public List<Map<String,Object>> getDeptTreeByPId(Map<String,Object> params) {
        List<Map<String,Object>> list = organizationMapper.getDeptTreeByPId(params);
        return list;
    }

    public List<Map<String,Object>> getPosTreeData(Map<String,Object> params, String isTree) {
        List<Map<String,Object>> list = new ArrayList<>();
        if("1".equals(isTree)){
            String pId = "0";//第一层岗位数据
            this.getPosList(pId, list);
        }else {
            list = positionMapper.getPosTreeData(params);
        }
        return list;
    }

    private void getPosList(String pId, List<Map<String,Object>> list) {
        Map<String,Object> params = new HashMap<>();
        params.put("pId", pId);
        List<Map<String,Object>> posList = positionMapper.getPosTreeData(params);
        for(Map<String,Object> pos : posList){
            String id = (String) pos.get("id");
            List<Map<String,Object>> childrenList = new ArrayList<>();
            this.getPosList(id, childrenList);
            if(childrenList.size() > 0){
                pos.put("children", childrenList);
            }
            list.add(pos);
        }
    }

    public boolean hasDeptNo(String orgId) {
        int count = organizationMapper.countDeptNo(orgId);
        return count > 0 ? true : false;
    }

    public boolean hasPosNo(String posNo) {
        int count = positionMapper.countPosNo(posNo);
        return count > 0 ? true : false;
    }

    public Map<String,Object> getDics(String dicNoStr) {
        Map<String,Object> dicsMap = new HashMap<>();
        if(StringUtils.isBlank(dicNoStr)){
            logger.error("字典编号[dicNo]为空");
            return dicsMap;
        }
        String[] dicNos = dicNoStr.split(",");

        for(String dicNo : dicNos){
            if(StringUtils.isBlank(dicNo)) continue;

            Map<String,Object> map = new HashMap<>();
            map.put("dicNo", dicNo);
            List<Map<String,Object>> list = dataDicService.findByDicNo(map);
            dicsMap.put(dicNo, list);
        }
        return dicsMap;
    }

    public List<Map<String,Object>> getDic(String dicNo) {
        if(StringUtils.isBlank(dicNo)){
            return null;
        }
        Map<String,Object> map = new HashMap<>();
        map.put("dicNo", dicNo);
        List<Map<String,Object>> list = dataDicService.findByDicNo(map);
        return list;
    }

    public Map<String,Object> getOrgInfo(String orgId){
        return organizationMapper.getOrgInfo(orgId);
    }

    public String getOrgNameFullPath(String orgId) {
        String nameFullPath = null;
        Map<String,Object> orgMap = this.getOrgInfo(orgId);
        if(orgMap!=null){
            nameFullPath = (String) orgMap.get("NAME_FULL_PATH");
        }
        return nameFullPath;
    }

    public RtnData uploadFace(MultipartFile[] files) {
        Map<String,Object> resMap = new HashMap<>();
        try{
            if(files==null || files.length == 0) {
                logger.error("未上传人脸照片");
                return RtnData.fail("未上传人脸照片");
            } else {
                String fileServerDir = DataUtil.getProperty("fileServerDir");
                String date = DateUtils.formatDate(new Date(), "yyyyMMdd");

                String uploadPath = fileServerDir + "/" + date;
                File uploadDir = new File(uploadPath);
                if (!uploadDir.exists()) {
                    uploadDir.mkdirs();
                }
                String fileServerUrl = DataUtil.getProperty("fileServerUrl");
                MultipartFile file = files[0];
                if (!file.isEmpty()) {
                    String uploadFileName = file.getOriginalFilename();
                    if(uploadFileName.length()>50){
                        logger.error("人脸照片名称过长，最大限制为50，fileName：{}", uploadFileName);
                        return RtnData.fail("人脸照片名称过长，最大限制为50");
                    }
                    logger.info("检查文件名称，通过");
                    String fileExtName = "";
                    int dosPos = uploadFileName.lastIndexOf(".");
                    if(dosPos>-1){
                        fileExtName = uploadFileName.substring(dosPos);
                    }
                    if(!".jpg".equalsIgnoreCase(fileExtName)){
                        logger.error("人脸照片仅支持JPG格式，fileName：{}", uploadFileName);
                        return RtnData.fail("人脸照片仅支持JPG格式");
                    }
                    logger.info("检查文件格式，通过");
                    long fileSize = file.getSize();
                    long kb_fileSize = fileSize / 1024;
                    if(kb_fileSize < 10){
                        logger.error("人脸照片不能小于10KB，fileSize：{}KB", kb_fileSize);
                        return RtnData.fail("人脸照片不能小于10KB");
                    }else if(kb_fileSize > 200){
                        logger.error("人脸照片不能大于200KB，fileSize：{}KB", kb_fileSize);
                        return RtnData.fail("人脸照片不能大于200KB");
                    }
                    logger.info("检查文件大小，通过");
                    String newFileName = UUIDGenUtil.uuid() + fileExtName;
                    String uploadFilePath = uploadPath + "/" + newFileName;
                    File uploadFile = new File(uploadFilePath);
                    file.transferTo(uploadFile);

                    String filePath = date + "/" + newFileName;
                    String src = fileServerUrl + "/" + filePath;
                    resMap.put("fileName", uploadFileName);
                    resMap.put("filePath", filePath);
                    resMap.put("src", src);
                    logger.info("fileName：{}", uploadFileName);
                    logger.info("filePath：{}", filePath);
                    logger.info("src：{}", src);
                    logger.info("上传成功");
                }
            }
        }catch (Exception e){
            logger.error("上传失败", e);
            return RtnData.fail("上传失败");
        }
        logger.info("上传结束");
        return RtnData.ok(resMap);
    }

    public RtnData uploadWgImage(MultipartFile[] files) {
        List<Map<String,Object>> list = new ArrayList<>();
        try{
            if(files==null || files.length == 0) {
                logger.error("未上传违规照片");
                return RtnData.fail("未上传违规照片");
            }else if(files.length > 5) {
                logger.error("违规照片上传，一次不能超过5张");
                return RtnData.fail("违规照片上传，一次不能超过5张");
            }else {
                String fileServerDir = DataUtil.getProperty("fileServerDir");
                String date = DateUtils.formatDate(new Date(), "yyyyMMdd");
                String imageType = "wg";
                String uploadPath = fileServerDir + "/" + imageType + "/" + date;
                File uploadDir = new File(uploadPath);
                if (!uploadDir.exists()) {
                    uploadDir.mkdirs();
                }
                String fileServerUrl = DataUtil.getProperty("fileServerUrl");
                for(int i=0; i<files.length; i++){
                    Map<String,Object> resMap = new HashMap<>();

                    MultipartFile file = files[i];
                    int uploadFileNo = i+1;
                    String uploadFileNoStr = "第" + uploadFileNo + "张违规照片";
                    if (!file.isEmpty()) {
                        String uploadFileName = file.getOriginalFilename();
                        if(uploadFileName.length()>100){
                            logger.error("{}名称过长，最大限制为100，fileName：{}", uploadFileNoStr, uploadFileName);
                            return RtnData.fail(uploadFileNoStr + "名称过长，最大限制为100");
                        }
                        logger.info("{}-检查文件名称，通过", uploadFileNoStr);
                        String fileExtName = "";
                        int dosPos = uploadFileName.lastIndexOf(".");
                        if(dosPos>-1){
                            fileExtName = uploadFileName.substring(dosPos);
                        }
                        if(!".jpg".equalsIgnoreCase(fileExtName)
                                && !".jpeg".equalsIgnoreCase(fileExtName)
                                && !".png".equalsIgnoreCase(fileExtName)
                                && !".bmp".equalsIgnoreCase(fileExtName)){
                            logger.error("{}-格式不正确[jpg|jpeg|png|bmp]，fileName：{}", uploadFileNoStr, uploadFileName);
                            return RtnData.fail(uploadFileNoStr + "格式不正确[jpg|jpeg|png|bmp]");
                        }
                        logger.info("{}-检查文件格式，通过", uploadFileNoStr);
                        long fileSize = file.getSize();
                        long mb_fileSize = fileSize / 1024 / 1024;
                        if(mb_fileSize > 5){
                            logger.error("{}不能大于5MB，fileSize：{}M", uploadFileNoStr, mb_fileSize);
                            return RtnData.fail(uploadFileNoStr +"不能大于5MB");
                        }
                        logger.info("{}-检查文件大小，通过", uploadFileNoStr);
                        String newFileName = UUIDGenUtil.uuid() + fileExtName;
                        String uploadFilePath = uploadPath + "/" + newFileName;
                        File uploadFile = new File(uploadFilePath);
                        file.transferTo(uploadFile);

                        String filePath = imageType + "/" + date + "/" + newFileName;
                        String src = fileServerUrl + "/" + filePath;
                        resMap.put("fileName", uploadFileName);
                        resMap.put("filePath", filePath);
                        resMap.put("src", src);
                        logger.info("fileName：{}", uploadFileName);
                        logger.info("filePath：{}", filePath);
                        logger.info("src：{}", src);
                        logger.info("{}-上传成功", uploadFileNoStr);
                        list.add(resMap);
                    }
                }
            }
        }catch (Exception e){
            logger.error("上传失败", e);
            return RtnData.fail("上传失败");
        }
        logger.info("上传结束");
        return RtnData.ok(list);
    }

    public Object getProperty(String codeStr) {
        Map<String,Object> resMap = new HashMap<>();
        if (StringUtils.isBlank(codeStr)) {
            logger.error("参数[code]为空");
            return resMap;
        }
        String[] codes = codeStr.split(",");

        for (String code : codes) {
            if(StringUtils.isBlank(code)) continue;
            if(!resMap.containsKey(code)) {
                String value = DataUtil.getProperty(code);
                resMap.put(code, value);
            }
        }
        return resMap;
    }
}