package com.cc.app.pms.controller;
import com.alibaba.fastjson.JSONObject;
import com.cc.app.base.common.CurrentUser;
import com.cc.app.base.common.PageModel;
import com.cc.app.base.common.RtnData;
import com.cc.app.base.common.SignValidIgnore;
import com.cc.app.base.model.LoginUser;
import com.cc.app.pms.model.AccountInfo;
import com.cc.app.pms.service.AccountInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Api(value = "/pms/api/account", description = "后台用户管理")
@RestController
@RequestMapping("/pms/api/account")
public class AccountInfoController {

    private static Logger logger = LoggerFactory.getLogger(AccountInfoController.class);

    @Autowired
    private AccountInfoService service;

    /**
     * 分页查询列表
     * @param pageSize
     * @param pageIndex
     * @param queryJosn
     * @return
     */
    @ApiOperation(value = "分页查询用户列表",notes = "查询用户列表，查询条件：accName")
    @GetMapping("/list")
    public Object searchList(@RequestParam(required = false, defaultValue = "20", name = "limit") int pageSize,
                             @RequestParam(required = false, defaultValue = "1", name = "page") int pageIndex,
                             @RequestParam (required = false, name = "searchParams") String queryJosn) {
        Map<String,Object> params = new HashMap<>();
        if(StringUtils.isNotBlank(queryJosn)){
            params = (Map<String, Object>) JSONObject.parse(queryJosn);
        }
        String name = (String) params.get("name");
        if(StringUtils.isNotBlank(name)){
            params.put("name", "%" + name + "%");
        }
        PageModel result = service.queryPageList(params, pageIndex, pageSize);
        return result;
    }

    @ApiOperation(value = "根据用户id查询用户信息",notes = "根据用户id查询用户信息")
    @GetMapping("/get")
    public Object get(@RequestParam("id") String id){
        return RtnData.ok(service.get(id));
    }

    @ApiOperation(value = "新增用户",notes = "新增用户")
    @PostMapping("/insert")
    public Object insert(@RequestBody AccountInfo entity, HttpServletRequest request){
        try {
            String loginId = request.getHeader("loginId");
            return RtnData.ok(service.insert(entity,loginId));
        } catch (Exception e) {
            logger.error("新增用户异常", e);
            return RtnData.fail(e.getMessage());
        }
    }

    @ApiOperation(value = "修改用户",notes = "修改用户信息")
    @PostMapping("/update")
    public Object update(@RequestBody AccountInfo entity){
        try {
            return RtnData.ok(service.update(entity));
        } catch (Exception e) {
            logger.error("修改用户异常", e);
            return RtnData.fail(e.getMessage());
        }
    }

    /**
     * 登录
     * @param data
     * @return
     */
    @ApiOperation(value = "用户登录",notes = "用户登录:accName,accPwd")
    @PostMapping("/login")
    @SignValidIgnore
    public Object login(@RequestBody Map<String,Object> data, HttpServletRequest request){
        try {
            return RtnData.ok(service.doLogin(data));
        } catch (Exception e) {
            logger.error("登录失败", e);
            return RtnData.fail(e.getMessage());
        }
    }

    /**
     * 登录
     * @param data
     * @return
     */
    @ApiOperation(value = "用户登录",notes = "用户登录:accName,accPwd")
    @PostMapping("/webLogin")
    @SignValidIgnore
    public Object webLogin(@RequestBody Map<String,Object> data, HttpServletRequest request){
        try {
            return RtnData.ok(service.doWebLogin(data));
        } catch (Exception e) {
            return RtnData.fail(e.getMessage());
        }
    }

    /**
     * 小程序-用户登录检查
     * @param data
     * @return
     */
    @ApiOperation(value = "小程序-用户登录检查",notes = "用户登录检查:loginId,code")
    @PostMapping("/miniLoginCheck")
    @SignValidIgnore
    public Object miniLoginCheck(@RequestBody Map<String,Object> data){
        try {
            return RtnData.ok(service.miniLoginCheck(data));
        } catch (Exception e) {
            logger.error("小程序-用户登录检查异常", e);
            return RtnData.fail(e.getMessage());
        }
    }

    /**
     * 小程序-用户登录
     * @param data
     * @return
     */
    @ApiOperation(value = "小程序-用户登录",notes = "用户登录:userName,passwd")
    @PostMapping("/miniLogin")
    @SignValidIgnore
    public Object miniLogin(@RequestBody Map<String,Object> data){
        try {
            return RtnData.ok(service.loginMini(data));
        } catch (Exception e) {
            logger.error("小程序-用户登录异常", e);
            return RtnData.fail(e.getMessage());
        }
    }

    /**
     * 小程序-绑定微信
     * @param data
     * @return
     */
    @ApiOperation(value = "小程序-绑定微信",notes = "绑定微信:loginId,code")
    @PostMapping("/bindWx")
    public Object bindWx(@RequestBody Map<String,Object> data){
        try {
            return RtnData.ok(service.bindWx(data));
        } catch (Exception e) {
            logger.error("小程序-绑定微信异常", e);
            return RtnData.fail(e.getMessage());
        }
    }

    /**
     * 小程序-解绑微信
     * @param data
     * @return
     */
    @ApiOperation(value = "小程序-解绑微信",notes = "解绑微信:loginId")
    @PostMapping("/unbindWx")
    public Object unbindWx(@RequestBody Map<String,Object> data){
        try {
            return RtnData.ok(service.unbindWx(data));
        } catch (Exception e) {
            logger.error("小程序-解绑微信异常", e);
            return RtnData.fail(e.getMessage());
        }
    }

    @ApiOperation(value = "查询用户角色",notes = "查询用户角色：accId")
    @GetMapping("/acc-role")
    public Object findAccRole(@RequestParam("accId") String accId){
        return RtnData.ok(service.findAccRole(accId));
    }

    /**
     * 设置账户角色
     * @param
     * @return
     */
    @ApiOperation(value = "新增用户角色",notes = "新增用户角色：accId，rIds-角色id,分割")
    @PostMapping("add-role")
    public Object addAccRole(@RequestBody Map<String,Object> data){
        try {
            return RtnData.ok(service.setAccRole(data));
        } catch (Exception e) {
            return RtnData.fail(e.getMessage());
        }

    }

    /**
     * 查找账户所有的资源
     * @param loginId
     * @return
     */
    @ApiOperation(value = "查询用户菜单",notes = "查询用户菜单：loginId")
    @GetMapping("/acc-res")
    public Object findAccRes(@RequestParam("loginId") String loginId){
        return RtnData.ok(service.findAllAccRes(loginId));
    }

    @ApiOperation(value = "修改密码",notes = "用户修改密码，loginId-登录id，oldPwd-旧密码，newPwd-新密码")
    @PostMapping("/set-pwd")
    public Object setpwd(@RequestBody Map<String,String> data){
        try {
            return RtnData.ok(service.setpwd(data));
        } catch (Exception e) {
            return RtnData.fail(e.getMessage());
        }
    }


    @ApiOperation(value = "退出登录",notes = "退出登录:loginId-登录id")
    @PostMapping("/logout")
    public Object logout(@CurrentUser LoginUser user){
        try {
            return service.doLogout(user);
        } catch (Exception e) {
            return RtnData.fail(e.getMessage());
        }
    }

    @ApiOperation(value = "根据登录id获取用户信息",notes = "根据登录id获取用户信息，loginId")
    @GetMapping("/get2")
    public Object getByloginId(@RequestParam("loginId") String loginId){
        try {
            return RtnData.ok(service.getByloginId(loginId));
        } catch (Exception e) {
            return RtnData.fail(e.getMessage());
        }
    }

    @ApiOperation(value = "根据用户id获取用户登录信息",notes = "根据用户id获取用户登录信息，id")
    @GetMapping("/query-login-log")
    public Object queryLoginLog(@RequestParam("id") String id){
        try {
            return RtnData.ok(service.queryLoginLog(id));
        } catch (Exception e) {
            return RtnData.fail(e.getMessage());
        }
    }

    @ApiOperation(value = "根据loginId获取用户登录信息",notes = "根据loginId获取用户登录信息，loginId")
    @GetMapping("/get-user-login")
    public Object getUserLogin(@RequestParam("loginId") String id){
        try {
            return service.findUserLogin(id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
