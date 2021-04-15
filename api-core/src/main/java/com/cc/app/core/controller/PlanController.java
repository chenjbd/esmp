package com.cc.app.core.controller;

import com.cc.app.base.common.PageModel;
import com.cc.app.base.common.RtnData;
import com.cc.app.base.utils.DataUtil;
import com.cc.app.base.utils.DateUtils;
import com.cc.app.core.service.PlanService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Api(value = "/core/api/plan", description = "作业计划管理")
@RestController
@RequestMapping("/core/api/plan")
public class PlanController {

    private final static Logger logger = LoggerFactory.getLogger(PlanController.class);

    @Autowired
    private PlanService service;

    /**
     * 分页查询列表
     * @param pageSize
     * @param pageIndex
     * @param planBeginDate
     * @param planCode
     * @param workMasterUname
     * @param workContent
     * @param workSiteNames
     * @param planState
     * @return
     */
    @ApiOperation(value = "分页查询作业计划列表",notes = "查询作业计划列表，查询条件：planBeginDate-计划开始时间，planEndDate-计划结束时间，planCode-计划编号，workMasterUname-工作负责人")
    @GetMapping("/list")
    public Object list(@RequestParam(required = false, name = "limit", defaultValue = "10") int pageSize,
                       @RequestParam(required = false, name = "page", defaultValue = "1") int pageIndex,
                       @RequestParam(required = false, name = "planBeginDate") String planBeginDate,
                       @RequestParam(required = false, name = "planCode") String planCode,
                       @RequestParam(required = false, name = "workMasterUname") String workMasterUname,
                       @RequestParam(required = false, name = "workContent") String workContent,
                       @RequestParam(required = false, name = "workSiteNames") String workSiteNames,
                       @RequestParam(required = false, name = "planState") Integer planState) {
        Map<String, Object> params = new HashMap<>();
        if (StringUtils.isNotBlank(planBeginDate)) {
            String[] planDate = planBeginDate.split(" - ");
            String beginDate = planDate[0];
            String endDate = planDate[1];
            Date dtPlanBeginDate = DateUtils.parseDate(beginDate, "yyyy-MM-dd");
            params.put("planBeginDate", dtPlanBeginDate);
            Date dtPlanEndDate = DateUtils.parseDate(endDate, "yyyy-MM-dd");
            dtPlanEndDate = DateUtils.addDays(dtPlanEndDate, 1);
            params.put("planEndDate", dtPlanEndDate);
        }
        if (StringUtils.isNotBlank(planCode)) {
            params.put("planCode", planCode);
        }
        if (StringUtils.isNotBlank(workMasterUname)) {
            params.put("workMasterUname", "%" + DataUtil.escapeSqlLikeStr(workMasterUname) + "%");
        }
        if (StringUtils.isNotBlank(workContent)) {
            params.put("workContent", "%" + DataUtil.escapeSqlLikeStr(workContent) + "%");
        }
        if (StringUtils.isNotBlank(workSiteNames)) {
            params.put("workSiteNames", "%" + DataUtil.escapeSqlLikeStr(workSiteNames) + "%");
        }
        if (planState!=null) {
            params.put("planState", planState);
        }
        PageModel result = service.queryPageList(params, pageIndex, pageSize);
        return result;
    }

    @ApiOperation(value = "根据用id查询作业计划",notes = "根据用id查询作业计划")
    @GetMapping("/getInfo")
    public Object getInfo(@RequestParam("id") String id){
        return RtnData.ok(service.getInfo(id));
    }
}
