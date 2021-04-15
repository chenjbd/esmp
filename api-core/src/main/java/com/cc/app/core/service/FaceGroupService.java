package com.cc.app.core.service;

import com.alibaba.fastjson.JSONObject;
import com.cc.app.base.common.HikConfig;
import com.cc.app.base.common.PageModel;
import com.cc.app.base.common.RtnData;
import com.cc.app.base.utils.HikHttpUtils;
import com.cc.app.base.utils.UUIDGenUtil;
import com.cc.app.core.dao.FaceGroupMapper;
import com.cc.app.core.model.FaceGroup;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class FaceGroupService {

    private Logger logger = LoggerFactory.getLogger(FaceGroupService.class);

    @Autowired
    private FaceGroupMapper mapper;
    @Autowired
    private HikConfig hikConfig;

    public PageModel queryPageList(Map<String, Object> params, int pageIndex, int pageSize) {
        PageHelper.startPage(pageIndex, pageSize);
        Page page = mapper.queryPageList(params);//Page本身是一个ArrayList对象，转换为json时不会保留分页信息
        PageInfo pageInfo = page.toPageInfo();//将page转换成pageInfo会保存分页信息返回
        return new PageModel(pageInfo);
    }

    public Object get(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    public RtnData insert(FaceGroup entity) {
        String groupId;
        if(hikConfig.isEnabled()){
            Map<String,Object> groupMap = new HashMap<>();
            groupMap.put("name", entity.getGroupName());
            groupMap.put("description", entity.getGroupDesc());
            JSONObject result = HikHttpUtils.getInstance().post(hikConfig.getAddFaceGroupUrl(), groupMap);
            String code = result.getString("code");
            String msg = result.getString("msg");
            if(!"0".equals(code)){
                return RtnData.fail(msg);
            }
            JSONObject data = (JSONObject) result.get("data");
            groupId = data.getString("indexCode");

        }else{
            groupId = UUIDGenUtil.uuid();
        }
        entity.setGroupId(groupId);
        Date now = new Date();
        entity.setCrtTime(now);
        mapper.insert(entity);
        return RtnData.ok();
    }

    public RtnData update(FaceGroup entity) {
        if(hikConfig.isEnabled()){
            Map<String,Object> groupMap = new HashMap<>();
            groupMap.put("indexCode", entity.getGroupId());
            groupMap.put("name", entity.getGroupName());
            groupMap.put("description", entity.getGroupDesc());
            JSONObject result = HikHttpUtils.getInstance().post(hikConfig.getUptFaceGroupUrl(), groupMap);
            String code = result.getString("code");
            String msg = result.getString("msg");
            if(!"0".equals(code)){
                return RtnData.fail(msg);
            }
        }
        Date now = new Date();
        entity.setLstTime(now);
        mapper.updateByPrimaryKeySelective(entity);
        return RtnData.ok();
    }

    @Transactional(rollbackFor = Exception.class)
    public RtnData delete(Map<String,Object> params) throws Exception {
        String id = (String) params.get("id");
        String force = (String) params.get("force");
        boolean isForce = "1".equals(force) ? true : false;
        logger.info("是否为强制删除：{}", isForce);
        this.deleteFaceGroup(id, isForce);
        return RtnData.ok();
    }

    public void deleteFaceGroup(String groupId, boolean isForce) throws Exception {
        if(hikConfig.isEnabled()){
            Map<String,Object> groupMap = new HashMap<>();
            groupMap.put("indexCode", new String[]{ groupId });
            JSONObject result = HikHttpUtils.getInstance().post(hikConfig.getDelFaceGroupUrl(), groupMap);
            String code = result.getString("code");
            String msg = result.getString("msg");
            if(!"0".equals(code)){
                logger.error("人脸分组删除异常：{}", msg);
                if(!isForce){
                    throw new Exception(msg);
                }
            }
            boolean data = result.getBoolean("data");
            if(!data){
                logger.error("海康平台-人脸分组删除失败");
                if(!isForce){
                    throw new Exception("海康平台-人脸分组删除失败");
                }
            }
        }
        mapper.deleteByPrimaryKey(groupId);
    }

    public List<Map<String,Object>> findDic() {
        return mapper.findDic();
    }

    /**
     * 获取人脸分组ID
     * @return
     */
    public String getFaceGroupId(){
        FaceGroup faceGroup = mapper.selectGroupId();
        return faceGroup.getGroupId();
    }
}
