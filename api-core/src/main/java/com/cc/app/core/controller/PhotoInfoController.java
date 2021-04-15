package com.cc.app.core.controller;

import com.cc.app.base.common.CurrentUser;
import com.cc.app.base.common.RtnData;
import com.cc.app.base.model.LoginUser;
import com.cc.app.core.model.PhotoInfo;
import com.cc.app.core.service.PhotoInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Api(value = "/core/api/photo", description = "人脸信息管理")
@RestController
@RequestMapping("/core/api/photo")
public class PhotoInfoController {

    private final static Logger logger = LoggerFactory.getLogger(PhotoInfoController.class);


    @Autowired
    private PhotoInfoService service;

    @ApiOperation(value = "根据人员id查询人脸列表",notes = "根据人员id查询人脸列表")
    @GetMapping("/list")
    public Object list(@RequestParam("personalId") String personalId){
        return RtnData.ok(service.list(personalId));
    }

    @ApiOperation(value = "新增人脸",notes = "新增人脸")
    @PostMapping("/add")
    public Object add(@CurrentUser LoginUser user, @RequestBody PhotoInfo entity){
        try {
            entity.setCrtOpr(user.getUserNo());
            return service.add(entity);
        } catch (Exception e) {
            logger.error("新增人脸异常", e);
            return RtnData.fail(e.getMessage());
        }
    }

    @ApiOperation(value = "删除人脸",notes = "删除人脸，id-人脸ID")
    @PostMapping("/delete")
    public Object delete(@RequestBody Map<String,Object> params){
        try {
            return service.delete(params);
        } catch (Exception e) {
            logger.error("删除人脸异常", e);
            return RtnData.fail(e.getMessage());
        }
    }
}
