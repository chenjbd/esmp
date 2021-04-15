package com.cc.app.core.controller;

import com.cc.app.base.common.PageModel;
import com.cc.app.base.common.RtnData;
import com.cc.app.base.utils.DataUtil;
import com.cc.app.base.utils.DateUtils;
import com.cc.app.core.service.TicketService;
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

@Api(value = "/core/api/ticket", description = "工作票管理")
@RestController
@RequestMapping("/core/api/ticket")
public class TicketController {

    private final static Logger logger = LoggerFactory.getLogger(TicketController.class);

    @Autowired
    private TicketService service;

    /**
     * 分页查询列表
     * @param pageSize
     * @param pageIndex
     * @param planCode
     * @param dateType
     * @param beginDateStr
     * @param workPrincipalUname
     * @param workTask
     * @param workPlace
     * @param workState
     * @return
     */
    @ApiOperation(value = "分页查询工作票列表",notes = "查询工作票列表，查询条件：")
    @GetMapping("/list")
    public Object list(@RequestParam(required = false, name = "limit", defaultValue = "10") int pageSize,
                       @RequestParam(required = false, name = "page", defaultValue = "1") int pageIndex,
                       @RequestParam(required = false, name = "planCode") String planCode,
                       @RequestParam(required = false, name = "dateType") String dateType,
                       @RequestParam(required = false, name = "beginDate") String beginDateStr,
                       @RequestParam(required = false, name = "workPrincipalUname") String workPrincipalUname,
                       @RequestParam(required = false, name = "workTask") String workTask,
                       @RequestParam(required = false, name = "workPlace") String workPlace,
                       @RequestParam(required = false, name = "workState") Integer workState) {
        Map<String, Object> params = new HashMap<>();
        if (StringUtils.isNotBlank(planCode)) {
            params.put("planCode", planCode);
        }
        if (StringUtils.isNotBlank(dateType)) {
            params.put("dateType", dateType);

            if (StringUtils.isNotBlank(beginDateStr)) {
                String[] date = beginDateStr.split(" - ");
                String beginDate = date[0];
                String endDate = date[1];
                Date dtBeginDate = DateUtils.parseDate(beginDate, "yyyy-MM-dd");
                params.put("beginDate", dtBeginDate);
                Date dtEndDate = DateUtils.parseDate(endDate, "yyyy-MM-dd");
                dtEndDate = DateUtils.addDays(dtEndDate, 1);
                params.put("endDate", dtEndDate);
            }
        }
        if (StringUtils.isNotBlank(workPrincipalUname)) {
            params.put("workPrincipalUname", "%" + DataUtil.escapeSqlLikeStr(workPrincipalUname) + "%");
        }
        if (StringUtils.isNotBlank(workTask)) {
            params.put("workTask", "%" + DataUtil.escapeSqlLikeStr(workTask) + "%");
        }
        if (StringUtils.isNotBlank(workPlace)) {
            params.put("workPlace", "%" + DataUtil.escapeSqlLikeStr(workPlace) + "%");
        }
        if (workState!=null) {
            params.put("workState", workState);
        }
        PageModel result = service.queryPageList(params, pageIndex, pageSize);
        return result;
    }

    @ApiOperation(value = "根据用id查询工作票",notes = "根据用id查询工作票")
    @GetMapping("/getInfo")
    public Object getInfo(@RequestParam("id") String id){
        return RtnData.ok(service.getInfo(id, true));
    }

    @ApiOperation(value = "违规行为-关联工作票分页查询列表",notes = "违规行为-关联工作票分页查询列表，查询条件：")
    @GetMapping("/table")
    public Object table(@RequestParam(required = false, name = "limit", defaultValue = "10") int pageSize,
                       @RequestParam(required = false, name = "page", defaultValue = "1") int pageIndex,
                       @RequestParam(required = true, name = "paperNo") String paperNo,
                       @RequestParam(required = false, name = "customerName") String customerName,
                       @RequestParam(required = false, name = "workTask") String workTask) {
        Map<String, Object> params = new HashMap<>();
        if (StringUtils.isNotBlank(paperNo)) {
            params.put("paperNo", paperNo);
        }
        if (StringUtils.isNotBlank(customerName)) {
            params.put("customerName", "%" + DataUtil.escapeSqlLikeStr(customerName) + "%");
        }
        if (StringUtils.isNotBlank(workTask)) {
            params.put("workTask", "%" + DataUtil.escapeSqlLikeStr(workTask) + "%");
        }
        PageModel result = service.queryWithTicketList(params, pageIndex, pageSize);
        return result;
    }
}
