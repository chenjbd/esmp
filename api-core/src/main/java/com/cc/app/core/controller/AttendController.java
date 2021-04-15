package com.cc.app.core.controller;

import com.cc.app.base.common.CurrentUser;
import com.cc.app.base.common.PageModel;
import com.cc.app.base.common.RtnData;
import com.cc.app.base.model.LoginUser;
import com.cc.app.base.utils.HttpUtils;
import com.cc.app.core.model.AttendRule;
import com.cc.app.core.service.AttendService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Api(value = "/core/api/attend", description = "考勤管理")
@RestController
@RequestMapping("/core/api/attend")
public class AttendController {

    private final static Logger logger = LoggerFactory.getLogger(AttendController.class);

    @Autowired
    private AttendService service;
    /**
     * 分页查询考勤规则列表
     * @param pageSize
     * @param pageIndex
     * @return
     */
    @ApiOperation(value = "分页查询考勤规则列表",notes = "分页查询考勤规则列表")
    @GetMapping("/ruleList")
    public Object ruleList(@RequestParam(required = false, name = "limit", defaultValue = "10") int pageSize,
                       @RequestParam(required = false, name = "page", defaultValue = "1") int pageIndex) {
        Map<String, Object> params = new HashMap<>();
        PageModel result = service.queryRulePageList(params, pageIndex, pageSize);
        return result;
    }

    @ApiOperation(value = "根据考勤规则ID查询规则信息",notes = "根据考勤规则ID查询规则信息")
    @GetMapping("/getRule")
    public Object getRule(@RequestParam("id") String id){
        return RtnData.ok(service.getRule(id));
    }

    @ApiOperation(value = "保存考勤规则",notes = "保存考勤规则")
    @PostMapping("/saveRule")
    public Object saveRule(@CurrentUser LoginUser user, @RequestBody AttendRule entity){
        try {
            entity.setLstOpr(user.getUserNo());
            return service.saveRule(entity);
        } catch (Exception e) {
            logger.error("保存考勤规则异常", e);
            return RtnData.fail(e.getMessage());
        }
    }

    @GetMapping("/reverse_geocoding")
    public Object reverse_geocoding(@RequestParam(value = "lng", required = true) String lng,
                                    @RequestParam(value = "lat", required = true) String lat,
                                    @RequestParam(value = "coordtype", required = true) String coordtype){
        String url = "http://api.map.baidu.com/reverse_geocoding/v3/?ak=OudlHm1zPRTNMs40Oqgjmode4GAstjXV&output=json";
        url = url + "&coordtype=" + coordtype;
        url = url + "&location=" + lat + "," + lng;
        String result = HttpUtils.getInstance().get(url);
        return RtnData.ok(result);
    }
}
