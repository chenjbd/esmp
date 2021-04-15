package com.cc.app.core.controller;

import com.cc.app.base.common.CurrentUser;
import com.cc.app.base.common.PageModel;
import com.cc.app.base.common.RtnData;
import com.cc.app.base.model.LoginUser;
import com.cc.app.base.utils.DataUtil;
import com.cc.app.base.utils.DateUtils;
import com.cc.app.core.service.WgActService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Api(value = "/core/api/wgact", description = "违规信息管理")
@RestController
@RequestMapping("/core/api/wgact")
public class WgActController {

    private final static Logger logger = LoggerFactory.getLogger(WgActController.class);

    @Autowired
    private WgActService service;

    /**
     * 分页查询列表
     * @param pageSize
     * @param pageIndex
     * @param beginDateStr
     * @param paperNo
     * @param customerName
     * @param isConfirm
     * @param ruleIdStr
     * @return
     */
    @ApiOperation(value = "分页查询违规行为列表",notes = "查询违规行为列表，查询条件：")
    @GetMapping("/list")
    public Object list(@RequestParam(required = false, name = "limit", defaultValue = "10") int pageSize,
                       @RequestParam(required = false, name = "page", defaultValue = "1") int pageIndex,
                       @RequestParam(required = false, name = "dateType") String dateType,
                       @RequestParam(required = false, name = "beginDate") String beginDateStr,
                       @RequestParam(required = false, name = "paperNo") String paperNo,
                       @RequestParam(required = false, name = "customerName") String customerName,
                       @RequestParam(required = false, name = "isConfirm") String isConfirm,
                       @RequestParam(required = false, name = "ruleId") String ruleIdStr,
                       @RequestParam(required = false, name = "wgType") String wgType) {
        Map<String, Object> params = new HashMap<>();
        if(!StringUtils.isBlank(ruleIdStr)){
            String[] ruleIds = ruleIdStr.split(",");
            params.put("ruleIds", ruleIds);
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
        if (StringUtils.isNotBlank(customerName)) {
            params.put("customerName", "%" + DataUtil.escapeSqlLikeStr(customerName) + "%");
        }
        if (StringUtils.isNotBlank(paperNo)) {
            params.put("paperNo", paperNo);
        }
        if (StringUtils.isNotBlank(isConfirm)) {
            params.put("isConfirm", isConfirm);
        }
        if (StringUtils.isNotBlank(wgType)) {
            params.put("wgType", wgType);
        }
        PageModel result = service.queryPageList(params, pageIndex, pageSize);
        return result;
    }

    @ApiOperation(value = "根据用id查询违规信息",notes = "根据用id查询违规信息")
    @GetMapping("/getInfo")
    public Object getInfo(@RequestParam("id") String id){
        return RtnData.ok(service.getInfo(id));
    }

    @ApiOperation(value = "根据用id查询违规图片",notes = "根据用id查询违规图片")
    @GetMapping("/getImgList")
    public Object getImgList(@RequestParam("id") String id){
        return RtnData.ok(service.getImgList(id));
    }

    @ApiOperation(value = "分页查询人脸识别列表",notes = "分页查询人脸识别列表，查询条件：")
    @GetMapping("/imgAlsList")
    public Object imgAlsList(@RequestParam(required = false, name = "limit", defaultValue = "1") int pageSize,
                       @RequestParam(required = false, name = "page", defaultValue = "1") int pageIndex,
                       @RequestParam(required = true, name = "busiId") String busiId,
                       @RequestParam(required = false, name = "customerName") String customerName,
                       @RequestParam(required = false, name = "paperNo") String paperNo) {
        Map<String, Object> params = new HashMap<>();
        params.put("busiId", busiId);
        if (StringUtils.isNotBlank(customerName)) {
            params.put("customerName", "%" + DataUtil.escapeSqlLikeStr(customerName) + "%");
        }
        if (StringUtils.isNotBlank(paperNo)) {
            params.put("paperNo", paperNo);
        }
        PageModel result = service.queryWgImgAlsPageList(params, pageIndex, pageSize);
        return result;
    }

    @ApiOperation(value = "复核确认",notes = "复核确认")
    @PostMapping("/confirm")
    public Object confirm(@CurrentUser LoginUser user, @RequestBody Map<String,Object> params){
        try {
            params.put("lstOpr", user.getUserNo());
            return service.confirm(params);
        } catch (Exception e) {
            logger.error("复核确认异常", e);
            return RtnData.fail(e.getMessage());
        }
    }
}
