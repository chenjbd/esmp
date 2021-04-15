package com.cc.app.core.service;

import com.cc.app.base.common.PageModel;
import com.cc.app.base.common.RtnData;
import com.cc.app.base.utils.UUIDGenUtil;
import com.cc.app.core.dao.WgRuleMapper;
import com.cc.app.core.model.WgRule;
import com.cc.app.core.model.WgRuleExample;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class WgRuleService {

    private final static Logger logger = LoggerFactory.getLogger(WgRuleService.class);

    @Autowired
    private WgRuleMapper mapper;

    public PageModel queryPageList(Map<String, Object> params, int pageIndex, int pageSize) {
        PageHelper.startPage(pageIndex, pageSize);
        Page page = mapper.queryPageList(params);//Page本身是一个ArrayList对象，转换为json时不会保留分页信息
        PageInfo pageInfo = page.toPageInfo();//将page转换成pageInfo会保存分页信息返回
        return new PageModel(pageInfo);
    }

    public Map<String,Object> getInfo(String id) {
        Map<String,Object> infoMap = mapper.getInfo(id);
        return infoMap;
    }

    public Object insert(Map<String,Object> params) {
        String ruleNo = (String) params.get("ruleNo");
        String ruleName = (String) params.get("ruleName");
        String ruleDesc = (String) params.get("ruleDesc");
        String status = (String) params.get("status");
        String crtOpr = (String) params.get("crtOpr");

        boolean hasRule = this.checkRuleNo(ruleNo, null);
        if(hasRule){
            logger.error("条款编号已存在，ruleNo：{}", ruleNo);
            return RtnData.fail("条款编号已存在");
        }

        Date now = new Date();
        String ruleId = UUIDGenUtil.uuid();
        WgRule entity = new WgRule();
        entity.setId(ruleId);
        entity.setRuleNo(ruleNo);
        entity.setRuleName(ruleName);
        entity.setRuleDesc(ruleDesc);
        entity.setStatus(status);
        entity.setCrtOpr(crtOpr);
        entity.setCrtTime(now);
        mapper.insert(entity);
        return RtnData.ok();
    }

    private boolean checkRuleNo(String ruleNo, String ruleId) {
        WgRuleExample example = new WgRuleExample();
        WgRuleExample.Criteria criteria = example.createCriteria();
        criteria.andRuleNoEqualTo(ruleNo);
        if(!StringUtils.isBlank(ruleId)){
            criteria.andRuleNoNotEqualTo(ruleId);
        }
        int count = mapper.countByExample(example);
        if(count > 0){
            return true;
        }else{
            return false;
        }
    }

    public Object update(Map<String,Object> params) {
        String id = (String) params.get("id");
        if(StringUtils.isBlank(id)){
            logger.error("条款ID不能为空");
            return RtnData.fail("条款ID不能为空");
        }
//        String ruleNo = (String) params.get("ruleNo");
        String ruleName = (String) params.get("ruleName");
        String ruleDesc = (String) params.get("ruleDesc");
        String status = (String) params.get("status");
        String lstOpr = (String) params.get("lstOpr");

//        boolean hasRule = this.checkRuleNo(ruleNo, id);
//        if(hasRule){
//            logger.error("条款编号已存在，ruleNo：{}", ruleNo);
//            return RtnData.fail("条款编号已存在");
//        }
        Date now = new Date();
        WgRule entity = new WgRule();
        entity.setId(id);
        entity.setRuleName(ruleName);
        entity.setRuleDesc(ruleDesc);
        entity.setStatus(status);
        entity.setLstOpr(lstOpr);
        entity.setLstTime(now);
        mapper.updateByPrimaryKeySelective(entity);
        return RtnData.ok();
    }

    public Object delete(Map<String,Object> params) {
        String id = (String) params.get("id");
        if(StringUtils.isBlank(id)){
            logger.error("条款ID不能为空");
            return RtnData.fail("条款ID不能为空");
        }
        WgRule wgRule = mapper.selectByPrimaryKey(id);
        if(wgRule == null){
            logger.error("条款信息不存在，ID：{}", id);
            return RtnData.fail("条款信息不存在");
        }
        mapper.deleteByPrimaryKey(id);
        return RtnData.ok();
    }

    public List<Map<String,Object>> findDic() {
        return mapper.findDic();
    }

    public PageModel queryPageList_app(Map<String, Object> params, int pageIndex, int pageSize) {
        PageHelper.startPage(pageIndex, pageSize);
        Page page = mapper.queryPageList_app(params);//Page本身是一个ArrayList对象，转换为json时不会保留分页信息
        PageInfo pageInfo = page.toPageInfo();//将page转换成pageInfo会保存分页信息返回
        return new PageModel(pageInfo);
    }

    public boolean hasWgRule(String ruleId){
        WgRuleExample example = new WgRuleExample();
        WgRuleExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(ruleId);
        int count = mapper.countByExample(example);
        return count > 0 ? true : false;
    }
}
