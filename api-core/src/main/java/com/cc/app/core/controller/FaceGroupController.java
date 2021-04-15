package com.cc.app.core.controller;

import com.cc.app.base.common.CurrentUser;
import com.cc.app.base.common.PageModel;
import com.cc.app.base.common.RtnData;
import com.cc.app.base.model.LoginUser;
import com.cc.app.core.model.FaceGroup;
import com.cc.app.core.service.FaceGroupService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Api(value = "/core/api/facegroup", description = "人脸分组管理")
@RestController
@RequestMapping("/core/api/facegroup")
public class FaceGroupController {

    private final static Logger logger = LoggerFactory.getLogger(FaceGroupController.class);


    @Autowired
    private FaceGroupService service;

    /**
     * 分页查询列表
     * @param pageSize
     * @param pageIndex
     * @param name
     * @return
     */
    @ApiOperation(value = "分页查询人脸分组列表",notes = "查询人脸分组列表，查询条件：name-分组名称")
    @GetMapping("/list")
    public Object list(@RequestParam(required = false, name = "limit", defaultValue = "10") int pageSize,
                       @RequestParam(required = false, name = "page", defaultValue = "1") int pageIndex,
                       @RequestParam(required = false, name = "name") String name) {
        Map<String, Object> params = new HashMap<>();
        if (StringUtils.isNotBlank(name)) {
            params.put("name", "%" + name + "%");
        }
        PageModel result = service.queryPageList(params, pageIndex, pageSize);
        return result;
    }

    @ApiOperation(value = "根据用id查询人员信息",notes = "根据用id查询人员信息")
    @GetMapping("/get")
    public Object get(@RequestParam("id") String id){
        return RtnData.ok(service.get(id));
    }

    @ApiOperation(value = "新增人脸分组",notes = "新增人脸分组")
    @PostMapping("/insert")
    public Object insert(@CurrentUser LoginUser user, @RequestBody FaceGroup entity){
        try {
            entity.setCrtOpr(user.getUserNo());
            return service.insert(entity);
        } catch (Exception e) {
            logger.error("新增人脸分组异常", e);
            return RtnData.fail(e.getMessage());
        }
    }

    @ApiOperation(value = "修改人脸分组信息",notes = "修改人脸分组信息")
    @PostMapping("/update")
    public Object update(@CurrentUser LoginUser user, @RequestBody FaceGroup entity){
        try {
            entity.setLstOpr(user.getUserNo());
            return service.update(entity);
        } catch (Exception e) {
            logger.error("修改人脸分组异常", e);
            return RtnData.fail(e.getMessage());
        }
    }

    @ApiOperation(value = "删除人脸分组",notes = "删除人脸分组，id-人脸分组Id")
    @PostMapping("/delete")
    public Object delete(@RequestBody Map<String,Object> params){
        try {
            return service.delete(params);
        } catch (Exception e) {
            logger.error("删除人脸分组异常", e);
            return RtnData.fail(e.getMessage());
        }
    }

    @ApiOperation(value = "人脸分组字典",notes = "人脸分组字典")
    @GetMapping("/dic")
    public Object dic(){
        return RtnData.ok(service.findDic());
    }

}
