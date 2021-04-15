package com.cc.app.core.controller;

import com.cc.app.base.common.PageModel;
import com.cc.app.base.utils.DataUtil;
import com.cc.app.core.service.CameraService;
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

import java.util.HashMap;
import java.util.Map;

@Api(value = "/core/api/camera", description = "监控点管理")
@RestController
@RequestMapping("/core/api/camera")
public class CameraController {

    private final static Logger logger = LoggerFactory.getLogger(CameraController.class);

    @Autowired
    private CameraService service;

    /**
     * 分页查询监控点列表
     * @param pageSize
     * @param pageIndex
     * @return
     */
    @ApiOperation(value = "分页查询监控点列表",notes = "分页查询监控点列表")
    @GetMapping("/list")
    public Object list(@RequestParam(required = false, name = "limit", defaultValue = "10") int pageSize,
                       @RequestParam(required = false, name = "page", defaultValue = "1") int pageIndex,
                       @RequestParam(required = false, name = "name") String name,
                       @RequestParam(required = false, name = "status") Integer status) {
        Map<String, Object> params = new HashMap<>();
        if (StringUtils.isNotBlank(name)) {
            params.put("name", "%" + DataUtil.escapeSqlLikeStr(name) + "%");
        }
        if(status != null){
            params.put("status", status);
        }
        PageModel result = service.queryPageList(params, pageIndex, pageSize);
        return result;
    }
}
