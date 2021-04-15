package com.cc.app.core.controller;

import com.cc.app.base.common.RtnData;
import com.cc.app.core.service.CommonsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.Map;

@Api(value = "/core/api/commons", description = "基础服务管理")
@RestController
@RequestMapping("/core/api/commons")
public class CommonsController {

    private final static Logger logger = LoggerFactory.getLogger(CommonsController.class);

    @Autowired
    private CommonsService commonsService;

    /**
     * 人脸照片上传
     * @param files
     * @return
     */

    @ApiOperation(value = "人脸照片上传",notes = "人脸照片上传")
    @PostMapping("/uploadFace")
    public Object uploadFile(@RequestParam("file") MultipartFile[] files) {
        return commonsService.uploadFace(files);
    }

    @ApiOperation(value = "隶属部门根据父节点获取子节点列表",notes = "隶属部门根据父节点获取子节点列表")
    @GetMapping("/getDeptTreeByPId")
    public Object getDeptTreeByPId(@RequestParam(required = false, name = "pId") String pId){
        if(StringUtils.isBlank(pId)){
            pId = "-1";
        }
        Map<String,Object> map = new HashMap<>();
        map.put("pId", pId);
        return RtnData.ok(commonsService.getDeptTreeByPId(map));
    }

    @ApiOperation(value = "获取岗位树形列表",notes = "获取岗位树形列表")
    @GetMapping("/getPosTreeData")
    public Object getPosTreeData(@RequestParam(name = "isTree", required = false) String isTree){
        isTree = StringUtils.isBlank(isTree) ? "0" : isTree;
        Map<String,Object> map = new HashMap<>();
        return RtnData.ok(commonsService.getPosTreeData(map, isTree));
    }

    @ApiOperation(value = "获取字典列表",notes = "获取字典列表")
    @GetMapping("/getDic")
    public Object getDic(@RequestParam(name = "dicNo") String dicNo){
        return RtnData.ok(commonsService.getDic(dicNo));
    }

    @ApiOperation(value = "获取字典集合",notes = "获取字典集合")
    @GetMapping("/getDics")
    public Object getDics(@RequestParam(name = "dicNo") String dicNo){
        return RtnData.ok(commonsService.getDics(dicNo));
    }
}
