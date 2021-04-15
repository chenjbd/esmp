package com.cc.app.core.service;

import com.cc.app.base.common.PageModel;
import com.cc.app.base.ex.ServiceException;
import com.cc.app.core.dao.PdPpInfoMapper;
import com.cc.app.core.dao.PdWticketBaseMapper;
import com.cc.app.core.model.PdWticketBase;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TicketService {

    private Logger logger = LoggerFactory.getLogger(TicketService.class);

    @Autowired
    private PdPpInfoMapper pdPpInfoMapper;
    @Autowired
    private PdWticketBaseMapper mapper;
    @Autowired
    private CommonsService commonsService;

    public PageModel queryPageList(Map<String, Object> params, int pageIndex, int pageSize) {
        PageHelper.startPage(pageIndex, pageSize);
        Page page = mapper.queryPageList(params);//Page本身是一个ArrayList对象，转换为json时不会保留分页信息
        PageInfo pageInfo = page.toPageInfo();//将page转换成pageInfo会保存分页信息返回
        return new PageModel(pageInfo);
    }

    public Map<String,Object> getInfo(String id, boolean deptNameFullDecode) {
        Map<String,Object> ticketInfo = mapper.getInfo(id);
        if(deptNameFullDecode && ticketInfo!=null){
            String DEPARTMENT_OID = (String) ticketInfo.get("DEPARTMENT_OID");
            if(!StringUtils.isBlank(DEPARTMENT_OID)){
                String DEPARTMENT_NAME_FULL = commonsService.getOrgNameFullPath(DEPARTMENT_OID);
                ticketInfo.put("DEPARTMENT_NAME_FULL", DEPARTMENT_NAME_FULL);
            }
        }
        return ticketInfo;
    }

    public PageModel queryWithTicketList(Map<String, Object> params, int pageIndex, int pageSize) {
        PageHelper.startPage(pageIndex, pageSize);
        Page page = mapper.queryWithTicketList(params);
        PageInfo pageInfo = page.toPageInfo();
        return new PageModel(pageInfo);
    }

    public PageModel queryPageList_app(Map<String, Object> params, int pageIndex, int pageSize) {
        PageHelper.startPage(pageIndex, pageSize);
        Page page = mapper.queryPageList_app(params);
        PageInfo pageInfo = page.toPageInfo();
        return new PageModel(pageInfo);
    }

    public Object getInfo_app(Map<String,Object> params) throws Exception {
        String id = (String) params.get("id");
        if(StringUtils.isBlank(id)){
            throw new ServiceException("工作票ID不能为空");
        }
        //获取工作票信息
        Map<String,Object> ticketResMap = this.getInfo(id, true);
        if(ticketResMap == null){
            throw new ServiceException("工作票信息不存在");
        }
        //作业计划ID
        String planId = (String) ticketResMap.get("BUSINESS_ID");

        Map<String,Object> infoMap = new HashMap<>();
        infoMap.put("ID", id);
        infoMap.put("TICKET_NO", ticketResMap.get("TICKET_NO"));
        infoMap.put("TICKET_TYPE", ticketResMap.get("TICKET_TYPE"));

        //工作票信息
        Map<String,Object> ticketInfo = new HashMap<>();
        ticketInfo.put("TICKET_NO", ticketResMap.get("TICKET_NO"));
        ticketInfo.put("DEPARTMENT_ONAME", ticketResMap.get("DEPARTMENT_ONAME"));
        ticketInfo.put("FUNCTION_LOCATION_NAME", ticketResMap.get("FUNCTION_LOCATION_NAME"));
        ticketInfo.put("DEPARTMENT_NAME_FULL", ticketResMap.get("DEPARTMENT_NAME_FULL"));
        ticketInfo.put("WORK_PRINCIPAL_UNAME", ticketResMap.get("WORK_PRINCIPAL_UNAME"));
        ticketInfo.put("WORK_PRINCIPAL_TEL", ticketResMap.get("WORK_PRINCIPAL_TEL"));
        ticketInfo.put("WORK_MEMBER_UNAME", ticketResMap.get("WORK_MEMBER_UNAME"));
        ticketInfo.put("WORK_PLACE", ticketResMap.get("WORK_PLACE"));
        ticketInfo.put("WORK_TASK", ticketResMap.get("WORK_TASK"));
        infoMap.put("TICKET_INFO", ticketInfo);
        //工作成员
        List<Map<String,Object>> memberList = mapper.getMemberList(id);
        if(memberList.size() > 0){
            infoMap.put("MEMBER_LIST", memberList);
        }
        //作业计划信息
        if(!StringUtils.isBlank(planId)){
            Map<String,Object> planInfo = new HashMap<>();
            Map<String,Object> planResMap = pdPpInfoMapper.getInfo(planId);
            if(planResMap!=null){
                planInfo.put("PLAN_CODE", planResMap.get("PLAN_CODE"));
                planInfo.put("WORK_CONTENT", planResMap.get("WORK_CONTENT"));
                planInfo.put("WORK_TYPE", planResMap.get("WORK_TYPE"));
                planInfo.put("WORK_SITE_NAMES", planResMap.get("WORK_SITE_NAMES"));
                planInfo.put("WORK_TEAM_ONAME", planResMap.get("WORK_TEAM_ONAME"));
                planInfo.put("WORK_DEPT_ONAME", planResMap.get("WORK_DEPT_ONAME"));
                planInfo.put("PLAN_BEGIN_DATE", planResMap.get("PLAN_BEGIN_DATE"));
                planInfo.put("PLAN_END_DATE", planResMap.get("PLAN_END_DATE"));
                planInfo.put("WORK_DAY", planResMap.get("WORK_DAY"));
                planInfo.put("IS_EXTERIOR_DEPT", planResMap.get("IS_EXTERIOR_DEPT"));
                planInfo.put("EXTERIOR_DEPT_NAME", planResMap.get("EXTERIOR_DEPT_NAME"));
            }
            infoMap.put("PLAN_INFO", planInfo);
        }
        return infoMap;
    }

    public PdWticketBase getBaseInfo(String id){
        PdWticketBase pdWticketBase = mapper.selectByPrimaryKey(id);
        return pdWticketBase;
    }
}
