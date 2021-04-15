package com.cc.app.core.controller;

import com.cc.app.base.common.CurrentUser;
import com.cc.app.base.common.PageModel;
import com.cc.app.base.common.RtnData;
import com.cc.app.base.model.LoginUser;
import com.cc.app.base.utils.DataUtil;
import com.cc.app.core.model.EventSub;
import com.cc.app.core.service.EventSubService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Api(value = "/core/api/eventsub", description = "事件订阅管理")
@RestController
@RequestMapping("/core/api/eventsub")
public class EventSubController {

    private final static Logger logger = LoggerFactory.getLogger(EventSubController.class);


    @Autowired
    private EventSubService service;

    /**
     * 分页查询列表
     * @param pageSize
     * @param pageIndex
     * @param name
     * @return
     */
    @ApiOperation(value = "分页查询事件订阅列表",notes = "查询事件订阅列表，查询条件：eventType-事件类型，name-事件名称")
    @GetMapping("/list")
    public Object list(@RequestParam(required = false, name = "limit", defaultValue = "10") int pageSize,
                       @RequestParam(required = false, name = "page", defaultValue = "1") int pageIndex,
                       @RequestParam(required = false, name = "eventType") String eventType,
                       @RequestParam(required = false, name = "name") String name) {
        Map<String, Object> params = new HashMap<>();
        if (StringUtils.isNotBlank(name)) {
            params.put("name", "%" + DataUtil.escapeSqlLikeStr(name) + "%");
        }
        if (StringUtils.isNotBlank(eventType)) {
            params.put("eventType", "%" + DataUtil.escapeSqlLikeStr(eventType) + "%");
        }
        PageModel result = service.queryPageList(params, pageIndex, pageSize);
        return result;
    }

    @ApiOperation(value = "新增事件订阅",notes = "新增事件订阅")
    @PostMapping("/insert")
    public Object insert(@CurrentUser LoginUser user, @RequestBody EventSub entity){
        try {
            entity.setCrtOpr(user.getUserNo());
            return service.insert(entity);
        } catch (Exception e) {
            logger.error("新增事件订阅异常", e);
            return RtnData.fail(e.getMessage());
        }
    }

    @ApiOperation(value = "根据用id查询事件订阅信息",notes = "根据用id查询事件订阅信息")
    @GetMapping("/get")
    public Object get(@RequestParam("id") String id){
        return RtnData.ok(service.get(id));
    }

    @ApiOperation(value = "修改事件订阅",notes = "修改事件订阅")
    @PostMapping("/update")
    public Object update(@CurrentUser LoginUser user, @RequestBody EventSub entity){
        try {
            entity.setLstOpr(user.getUserNo());
            return service.update(entity);
        } catch (Exception e) {
            logger.error("修改事件订阅异常", e);
            return RtnData.fail(e.getMessage());
        }
    }

    @ApiOperation(value = "删除事件订阅",notes = "删除事件订阅")
    @PostMapping("/delete")
    public Object delete(@RequestBody Map<String,Object> params){
        try {
            return service.delete(params);
        } catch (Exception e) {
            logger.error("删除事件订阅异常", e);
            return RtnData.fail(e.getMessage());
        }
    }
}
