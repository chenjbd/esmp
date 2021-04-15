package com.cc.app.core.controller;

import com.cc.app.base.common.CurrentUser;
import com.cc.app.base.common.PageModel;
import com.cc.app.base.common.RtnData;
import com.cc.app.base.model.LoginUser;
import com.cc.app.base.utils.DataUtil;
import com.cc.app.core.service.WgRuleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Api(value = "/core/api/wgrule", description = "违规条款管理")
@RestController
@RequestMapping("/core/api/wgrule")
public class WgRuleController {

    private final static Logger logger = LoggerFactory.getLogger(WgRuleController.class);

    @Autowired
    private WgRuleService service;

    /**
     * 分页查询列表
     * @param pageSize
     * @param pageIndex
     * @param ruleName
     * @param status
     * @return
     */
    @ApiOperation(value = "分页查询违规条款列表",notes = "查询违规条款列表，查询条件：")
    @GetMapping("/list")
    public Object list(@RequestParam(required = false, name = "limit", defaultValue = "10") int pageSize,
                       @RequestParam(required = false, name = "page", defaultValue = "1") int pageIndex,
                       @RequestParam(required = false, name = "ruleName") String ruleName,
                       @RequestParam(required = false, name = "status") String status) {
        Map<String, Object> params = new HashMap<>();
        if (StringUtils.isNotBlank(ruleName)) {
            params.put("ruleName", "%" + DataUtil.escapeSqlLikeStr(ruleName) + "%");
        }
        if (StringUtils.isNotBlank(status)) {
            params.put("status", status);
        }
        PageModel result = service.queryPageList(params, pageIndex, pageSize);
        return result;
    }

    @ApiOperation(value = "根据用id查询条款信息",notes = "根据用id查询条款信息")
    @GetMapping("/getInfo")
    public Object getInfo(@RequestParam("id") String id){
        return RtnData.ok(service.getInfo(id));
    }

    @ApiOperation(value = "添加条款",notes = "添加条款")
    @PostMapping("/insert")
    public Object insert(@CurrentUser LoginUser user, @RequestBody Map<String,Object> params){
        try {
            params.put("crtOpr", user.getUserNo());
            return service.insert(params);
        } catch (Exception e) {
            logger.error("新增条款异常", e);
            return RtnData.fail(e.getMessage());
        }
    }

    @ApiOperation(value = "修改条款",notes = "修改条款")
    @PostMapping("/update")
    public Object update(@CurrentUser LoginUser user, @RequestBody Map<String,Object> params){
        try {
            params.put("lstOpr", user.getUserNo());
            return service.update(params);
        } catch (Exception e) {
            logger.error("修改条款异常", e);
            return RtnData.fail(e.getMessage());
        }
    }

    @ApiOperation(value = "删除条款",notes = "删除条款")
    @PostMapping("/delete")
    public Object delete(@RequestBody Map<String,Object> params){
        try {
            return service.delete(params);
        } catch (Exception e) {
            logger.error("删除条款异常", e);
            return RtnData.fail(e.getMessage());
        }
    }

    @ApiOperation(value = "条款字典",notes = "条款字典")
    @GetMapping("/dic")
    public Object dic(){
        return RtnData.ok(service.findDic());
    }
}
