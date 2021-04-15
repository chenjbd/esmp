package com.cc.app.core.service;

import com.cc.app.base.common.PageModel;
import com.cc.app.base.common.RtnData;
import com.cc.app.base.ex.ServiceException;
import com.cc.app.base.utils.DataUtil;
import com.cc.app.base.utils.DateUtils;
import com.cc.app.base.utils.UUIDGenUtil;
import com.cc.app.base.utils.ValidatorUtils;
import com.cc.app.core.dao.WgActMapper;
import com.cc.app.core.dao.WgActRuleMapper;
import com.cc.app.core.dao.WgImgAlsMapper;
import com.cc.app.core.dao.WgImgMapper;
import com.cc.app.core.model.*;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.util.*;

@Service
public class WgActService {

    private final static Logger logger = LoggerFactory.getLogger(WgActService.class);

    @Autowired
    private WgActMapper mapper;
    @Autowired
    private WgImgMapper wgImgMapper;
    @Autowired
    private WgImgAlsMapper wgImgAlsMapper;
    @Autowired
    private WgActRuleMapper wgActRuleMapper;
    @Autowired
    private WgRuleService wgRuleService;
    @Autowired
    private PersonalInfoService personalInfoService;
    @Autowired
    private TicketService ticketService;

    public PageModel queryPageList(Map<String, Object> params, int pageIndex, int pageSize) {
        PageHelper.startPage(pageIndex, pageSize);
        Page page = mapper.queryPageList(params);//Page本身是一个ArrayList对象，转换为json时不会保留分页信息
        PageInfo pageInfo = page.toPageInfo();//将page转换成pageInfo会保存分页信息返回
        return new PageModel(pageInfo);
    }

    public Object getInfo(String id) {
        Map<String,Object> infoMap = mapper.getInfo(id);
        if(infoMap!=null && infoMap.size()>0){
            //违规图片
            List<Map<String,Object>> imgList = this.getWgImgList(id);
            infoMap.put("imgList", imgList);
            //违规条款列表
            List<Map<String,Object>> ruleList = wgActRuleMapper.getWgRuleListByActId(id);
            infoMap.put("ruleList", ruleList);
        }
        return infoMap;
    }

    private List<Map<String,Object>> getWgImgList(String id) {
        Map<String,Object> params = new HashMap<>();
        params.put("id", id);
        String fileServerUrl = DataUtil.getProperty("fileServerUrl");
        fileServerUrl = fileServerUrl == null ? "" : fileServerUrl;
        params.put("fileServerUrl", fileServerUrl);
        return wgImgMapper.selectWgImgListByActId(params);
    }

    public Object getImgList(String id) {
        List<Map<String,Object>> list = this.getWgImgList(id);
        return list;
    }

    public PageModel queryWgImgAlsPageList(Map<String, Object> params, int pageIndex, int pageSize) {
        PageHelper.startPage(pageIndex, pageSize);
        List<Map<String,Object>> list = wgImgAlsMapper.queryWgImgAlsPageList(params);
        PageInfo<Map<String,Object>> pageInfo = new PageInfo<>(list);
        PageModel pageModel = new PageModel(pageInfo);
        return pageModel;
    }

    @Transactional(rollbackFor = Exception.class)
    public RtnData confirm(Map<String,Object> params) throws Exception {
        String id = (String) params.get("id");
        String paperNo = (String) params.get("paperNo");
        String ticketId = (String) params.get("ticketId");
        String ruleIdStr = (String) params.get("ruleId");
        String lstOpr = (String) params.get("lstOpr");

        if(StringUtils.isBlank(id)){
            logger.error("违规信息ID不能为空");
            return RtnData.fail("违规信息ID不能为空");
        }
        WgAct wgAct = mapper.selectByPrimaryKey(id);
        if(wgAct==null){
            logger.error("违规信息不存在");
            return RtnData.fail("违规信息不存在");
        }
        String isConfirm = wgAct.getIsConfirm();
        if("1".equals(isConfirm)){
            logger.error("违规信息已复核！");
            return RtnData.fail("违规信息已复核！");
        }

        logger.info("违规人员身份证号检查");
        if(StringUtils.isBlank(paperNo)){
            logger.error("违规人员身份证号不能为空");
            return RtnData.fail("违规人员身份证号不能为空");
        }else if(!ValidatorUtils.IdCard(paperNo)){
            logger.error("违规人员身份证号不正确");
            return RtnData.fail("违规人员身份证号不正确");
        }
        PersonalInfo personalInfo = personalInfoService.getInfoByPaperNo(paperNo);
        if(personalInfo == null){
            logger.error("违规人员身份证号不存在");
            return RtnData.fail("违规人员身份证号不存在");
        }
        String customerName = personalInfo.getCustomerName();

        logger.info("工作票检查");
        if(StringUtils.isBlank(ticketId)){
            logger.error("工作票ID不能为空");
            return RtnData.fail("工作票ID不能为空");
        }
        Map<String,Object> ticketInfo = ticketService.getInfo(ticketId, false);
        if(ticketInfo == null){
            logger.error("工作票ID不存在");
            return RtnData.fail("工作票ID不存在");
        }
        String ticketNo = (String) ticketInfo.get("TICKET_NO");
        String planId = (String) ticketInfo.get("BUSINESS_ID");
        String planCode = (String) ticketInfo.get("BUSINESS_NAME");

        logger.info("违规条款检查");
        ruleIdStr = StringUtils.isBlank(ruleIdStr) ? "" : ruleIdStr.replaceAll("^,+", "").replaceAll(",+$", "");
        if(StringUtils.isBlank(ruleIdStr)){
            logger.error("违规条款不能为空");
            return RtnData.fail("违规条款不能为空");
        }
        String[] ruleIds = ruleIdStr.split(",");
        Date now = new Date();

        logger.info("保存违规条款");
        List<WgActRule> actRuleList = new ArrayList<>();
        for(String ruleId : ruleIds){
            boolean hasRule = wgRuleService.hasWgRule(ruleId);
            if(!hasRule){
                throw new ServiceException("违规条款不存在");
            }
            WgActRule actRule = new WgActRule();
            actRule.setId(UUIDGenUtil.uuid());
            actRule.setActId(id);
            actRule.setRuleId(ruleId);
            actRuleList.add(actRule);
        }
        if(actRuleList.size()>0){
            this.deleteActRule(id);
            wgActRuleMapper.batchInsert(actRuleList);
        }

        logger.info("更新违规信息");
        WgAct uptEntity = new WgAct();
        uptEntity.setId(id);
        uptEntity.setIsConfirm("1");
        uptEntity.setConfirmTime(now);
        uptEntity.setConfirmOpr(lstOpr);
        uptEntity.setPaperType("0");
        uptEntity.setPaperNo(paperNo);
        uptEntity.setCustomerName(customerName);
        uptEntity.setTicketId(ticketId);
        uptEntity.setTicketNo(ticketNo);
        uptEntity.setPlanId(planId);
        uptEntity.setPlanCode(planCode);
        uptEntity.setLstOpr(lstOpr);
        uptEntity.setLstTime(now);
        mapper.updateByPrimaryKeySelective(uptEntity);

        logger.info("违规复核成功");
        return RtnData.ok();
    }

    private void deleteActRule(String actId){
        WgActRuleExample example = new WgActRuleExample();
        WgActRuleExample.Criteria criteria = example.createCriteria();
        criteria.andActIdEqualTo(actId);
        int count = wgActRuleMapper.countByExample(example);
        if(count>0){
            wgActRuleMapper.deleteByExample(example);
        }
    }

    public PageModel queryPageList_app(Map<String,Object> params, Integer pageIndex, Integer pageSize) {
        String fileServerUrl = DataUtil.getProperty("fileServerUrl");
        fileServerUrl = fileServerUrl == null ? "" : fileServerUrl;
        params.put("fileServerUrl", fileServerUrl);

        PageHelper.startPage(pageIndex, pageSize);
        Page page = mapper.queryPageList_app(params);
        PageInfo pageInfo = page.toPageInfo();
        return new PageModel(pageInfo);
    }

    public RtnData getInfo_app(Map<String,Object> params) throws Exception {
        String id = (String) params.get("id");
        if(StringUtils.isBlank(id)){
            throw new ServiceException("违规信息ID不能为空");
        }
        WgAct wgAct = mapper.selectByPrimaryKey(id);
        if(wgAct == null){
            throw new ServiceException("违规信息不存在");
        }
        //违规信息
        Map<String,Object> infoMap = new HashMap<>();
        infoMap.put("ID", id);
        infoMap.put("WG_TIME", wgAct.getWgTime());
        infoMap.put("WG_TYPE", wgAct.getWgType());
        infoMap.put("WG_REMARK", wgAct.getWgRemark());
        infoMap.put("SOURCE", wgAct.getSource());
        infoMap.put("IS_CONFIRM", wgAct.getIsConfirm());
        infoMap.put("CONFIRM_TIME", wgAct.getConfirmTime());
        //违规图片
        List<Map<String,Object>> imgList = this.getWgImgList(id);
        if(imgList != null && imgList.size() > 0) {
            infoMap.put("IMG_LIST", imgList);
        }
        //违规人员
        String paperNo = wgAct.getPaperNo();
        if(!StringUtils.isBlank(paperNo)){
            Map<String,Object> personMap = personalInfoService.getWgPersonInfo(paperNo);
            infoMap.put("PERSON_INFO", personMap);
        }
        //工作票信息
        String ticketId = wgAct.getTicketId();
        if(!StringUtils.isBlank(ticketId)){
            Map<String,Object> ticketInfo = new HashMap<>();
            ticketInfo.put("TICKET_ID", ticketId);
            ticketInfo.put("TICKET_NO", wgAct.getTicketNo());
            PdWticketBase ticket = ticketService.getBaseInfo(ticketId);
            if(ticket!=null){
                ticketInfo.put("WORK_TASK", ticket.getWorkTask());
            }
            infoMap.put("TICKET_INFO", ticketInfo);
        }
        //违规条款列表
        List<Map<String,Object>> ruleList = wgActRuleMapper.getWgRuleListByActId(id);
        if(ruleList != null && ruleList.size() > 0){
            infoMap.put("RULE_LIST", ruleList);
        }
        return RtnData.ok(infoMap);
    }

    @Transactional(rollbackFor = Exception.class)
    public RtnData save(Map<String,Object> params) throws Exception {
        String wgTimeStr = (String) params.get("wgTime");
        String imgUrlStr = (String) params.get("imgUrl");
        String wgRemark = (String) params.get("wgRemark");
        String wgType = (String) params.get("wgType");
        String paperNo = (String) params.get("paperNo");
        String ticketId = (String) params.get("ticketId");
        String ruleIdStr = (String) params.get("ruleId");
        String crtOpr = (String) params.get("crtOpr");
        if(StringUtils.isBlank(wgTimeStr)){
            logger.error("违规时间不能为空");
            return RtnData.fail("违规时间不能为空");
        }else if(wgTimeStr.length() != 14){
            logger.error("违规时间格式不正确");
            return RtnData.fail("违规时间格式不正确");
        }
        Date wgTime = DateUtils.parseDateL(wgTimeStr, "yyyyMMddHHmmss");
        if(wgTime == null){
            logger.error("违规时间格式不正确");
            return RtnData.fail("违规时间格式不正确");
        }
        wgRemark = wgRemark == null ? "" : wgRemark.trim();
        if(wgRemark.length() > 500){
            logger.error("违规说明最大长度不超过500");
            return RtnData.fail("违规说明最大长度不超过500");
        }
        imgUrlStr = StringUtils.isBlank(imgUrlStr) ? "" : imgUrlStr.replaceAll("^,+", "").replaceAll(",+$", "");
        if(StringUtils.isBlank(imgUrlStr)){
            logger.error("违规图片不能为空");
            return RtnData.fail("违规图片不能为空");
        }
        String[] imgUrls = imgUrlStr.split(",");

        if(StringUtils.isBlank(wgType)){
            logger.error("违规类型不能为空");
            return RtnData.fail("违规类型不能为空");
        }else if(!"1".equals(wgType) && !"2".equals(wgType) && !"3".equals(wgType)){
            logger.error("违规类型不正确");
            return RtnData.fail("违规类型不正确");
        }

        logger.info("违规人员身份证号检查");
        if(StringUtils.isBlank(paperNo)){
            logger.error("违规人员身份证号不能为空");
            return RtnData.fail("违规人员身份证号不能为空");
        }else if(!ValidatorUtils.IdCard(paperNo)){
            logger.error("违规人员身份证号不正确");
            return RtnData.fail("违规人员身份证号不正确");
        }
        PersonalInfo personalInfo = personalInfoService.getInfoByPaperNo(paperNo);
        if(personalInfo == null){
            logger.error("违规人员身份证号不存在");
            return RtnData.fail("违规人员身份证号不存在");
        }
        String customerName = personalInfo.getCustomerName();

        logger.info("工作票检查");
        if(StringUtils.isBlank(ticketId)){
            logger.error("工作票ID不能为空");
            return RtnData.fail("工作票ID不能为空");
        }
        Map<String,Object> ticketInfo = ticketService.getInfo(ticketId, false);
        if(ticketInfo == null){
            logger.error("工作票ID不存在");
            return RtnData.fail("工作票ID不存在");
        }
        String ticketNo = (String) ticketInfo.get("TICKET_NO");
        String planId = (String) ticketInfo.get("BUSINESS_ID");
        String planCode = (String) ticketInfo.get("BUSINESS_NAME");

        logger.info("违规条款检查");
        ruleIdStr = StringUtils.isBlank(ruleIdStr) ? "" : ruleIdStr.replaceAll("^,+", "").replaceAll(",+$", "");
        if(StringUtils.isBlank(ruleIdStr)){
            logger.error("违规条款不能为空");
            return RtnData.fail("违规条款不能为空");
        }
        String[] ruleIds = ruleIdStr.split(",");

        //违规信息ID
        String id = UUIDGenUtil.uuid();
        Date now = new Date();

        logger.info("保存违规条款");
        List<WgActRule> actRuleList = new ArrayList<>();
        for(String ruleId : ruleIds){
            boolean hasRule = wgRuleService.hasWgRule(ruleId);
            if(!hasRule){
                throw new ServiceException("违规条款不存在");
            }
            WgActRule actRule = new WgActRule();
            actRule.setId(UUIDGenUtil.uuid());
            actRule.setActId(id);
            actRule.setRuleId(ruleId);
            actRuleList.add(actRule);
        }
        if(actRuleList.size()>0){
            wgActRuleMapper.batchInsert(actRuleList);
        }

        logger.info("保存违规照片");
        String wgPhotoUrl = null;
        String fileServerDir = DataUtil.getProperty("fileServerDir");
        List<WgImg> wgImgList = new ArrayList<>();
        for(int i=0;i<imgUrls.length;i++){
            String imgUrl = imgUrls[i];

            String imgPath = fileServerDir + "/" + imgUrl;
            File imgFile = new File(imgPath);
            if(!imgFile.exists()){
                logger.error("违规照片路径：{}", imgPath);
                throw new ServiceException("违规照片不存在");
            }
            if(i == 0){
                wgPhotoUrl = imgUrl;//缓存第一张违规图片，用于列表展示
            }
            WgImg wgImg = new WgImg();
            wgImg.setId(UUIDGenUtil.uuid());
            wgImg.setBusiId(id);
            wgImg.setImgUrl(imgUrl);
            wgImg.setCrtTime(new Date());
            wgImg.setSeqno(i);
            wgImg.setIsOut("0");//外部链接0-否，1-是

            wgImgList.add(wgImg);
        }
        if(wgImgList.size()>0){
            wgImgMapper.batchInsert(wgImgList);
        }

        logger.info("保存违规信息");
        WgAct wgAct = new WgAct();
        wgAct.setId(id);
        wgAct.setSource("1");//违规来源，0-海康平台，1-app
        wgAct.setWgTime(wgTime);
        wgAct.setWgRemark(wgRemark);
        wgAct.setWgType(wgType);
        wgAct.setWgPhotoUrl(wgPhotoUrl);
        wgAct.setPaperType("0");
        wgAct.setPaperNo(paperNo);
        wgAct.setCustomerName(customerName);
        wgAct.setTicketId(ticketId);
        wgAct.setTicketNo(ticketNo);
        wgAct.setPlanId(planId);
        wgAct.setPlanCode(planCode);
        wgAct.setIsConfirm("1");
        wgAct.setConfirmTime(now);
        wgAct.setConfirmOpr(crtOpr);
        wgAct.setCrtOpr(crtOpr);
        wgAct.setCrtTime(now);
        mapper.insert(wgAct);

        logger.info("违规采集成功");
        return RtnData.ok();
    }
}