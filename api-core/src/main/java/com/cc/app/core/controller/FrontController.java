package com.cc.app.core.controller;

import com.alibaba.fastjson.JSONObject;
import com.cc.app.base.common.CurrentUser;
import com.cc.app.base.common.PageModel;
import com.cc.app.base.common.RtnData;
import com.cc.app.base.common.SignValidIgnore;
import com.cc.app.base.ex.ServiceException;
import com.cc.app.base.model.LoginUser;
import com.cc.app.base.utils.DataUtil;
import com.cc.app.base.utils.DateUtils;
import com.cc.app.core.service.*;
import com.cc.app.pms.service.AccountInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Api(value = "/front/api", description = "APP前端接口")
@RestController
@RequestMapping("/front/api")
public class FrontController {

    private final static Logger logger = LoggerFactory.getLogger(PersonalInfoController.class);

    @Autowired
    private FrontService frontService;
    @Autowired
    private CommonsService commonsService;
    @Autowired
    private PersonalInfoService personalInfoService;
    @Autowired
    private TicketService ticketService;
    @Autowired
    private WgActService wgActService;
    @Autowired
    private WgRuleService wgRuleService;
    @Autowired
    private AccountInfoService accountInfoService;
    @Autowired
    private AttendService attendService;

    @ApiOperation(value = "登录",notes = "登录")
    @PostMapping("/login")
    @SignValidIgnore
    public Object login(@RequestBody Map<String,Object> params){
        try{
            return frontService.login(params);
        }catch (ServiceException e){
            logger.error("登录失败", e);
            return RtnData.fail(e.getMessage());
        }catch (Exception e){
            logger.error("登录失败", e);
            return RtnData.fail("登录失败");
        }
    }

    @ApiOperation(value = "登录注销",notes = "登录注销")
    @PostMapping("/logout")
    public Object logout(@CurrentUser LoginUser user){
        try{
            return accountInfoService.doLogout(user);
        } catch (Exception e){
            logger.error("登录注销失败", e);
            return RtnData.fail("登录注销失败");
        }
    }

    @ApiOperation(value = "修改密码",notes = "修改密码")
    @PostMapping("/setPwd")
    public Object setPwd(@CurrentUser LoginUser user, @RequestBody Map<String,Object> params){
        try{
            return frontService.setPwd(user.getUserNo(), params);
        } catch (ServiceException e){
            logger.error("修改密码失败", e);
            return RtnData.fail(e.getMessage());
        } catch (Exception e){
            logger.error("修改密码失败", e);
            return RtnData.fail("修改密码失败");
        }
    }

    @ApiOperation(value = "查询字典",notes = "查询字典，以逗号分隔，可支持多字典查询")
    @PostMapping("/getDic")
    public Object getDic(@RequestBody Map<String,Object> params){
        try{
            String dicNo = (String) params.get("dicNo");
            return RtnData.ok(commonsService.getDics(dicNo));
        } catch (Exception e){
            logger.error("查询字典失败", e);
            return RtnData.fail("查询字典失败");
        }
    }

    @ApiOperation(value = "查询系统参数",notes = "查询系统参数，以逗号分隔，可支持多参数查询")
    @PostMapping("/getProperty")
    public Object getProperty(@RequestBody Map<String,Object> params){
        try{
            String code = (String) params.get("code");
            return RtnData.ok(commonsService.getProperty(code));
        } catch (Exception e){
            logger.error("查询系统参数失败", e);
            return RtnData.fail("查询系统参数失败");
        }
    }

    @ApiOperation(value = "隶属部门-根据父节点获取子节点列表",notes = "隶属部门-根据父节点获取子节点列表")
    @PostMapping("/getDeptTreeByPId")
    public Object getDeptTreeByPId(@RequestBody Map<String,Object> params){
        String pId = (String) params.get("pId");
        if(StringUtils.isBlank(pId)){
            pId = "-1";
        }
        Map<String,Object> map = new HashMap<>();
        map.put("pId", pId);
        return RtnData.ok(commonsService.getDeptTreeByPId(map));
    }

    @ApiOperation(value = "岗位-获取岗位列表",notes = "岗位-获取岗位列表")
    @PostMapping("/getPosTreeData")
    public Object getPosTreeData(@RequestBody(required = false) JSONObject json){
        Map<String,Object> map = new HashMap<>();
        String isTree = "0";//0-返回简单数据结构，1-返回树形结构数据
        if(json != null){
            isTree = json.getString("isTree");
        }
        isTree = StringUtils.isBlank(isTree) ? "0" : isTree;
        return RtnData.ok(commonsService.getPosTreeData(map, isTree));
    }

    /**
     * 人脸照片上传
     * @param files
     * @return
     */
    @ApiOperation(value = "人脸照片上传",notes = "人脸照片上传")
    @PostMapping("/uploadFace")
    public Object uploadFace(@RequestParam("file") MultipartFile[] files) {
        return commonsService.uploadFace(files);
    }


    @ApiOperation(value = "人员信息采集",notes = "人员信息采集")
    @PostMapping("/addPerson")
    public Object addPerson(@CurrentUser LoginUser user, @RequestBody Map<String,Object> params){
        try {
            params.put("crtOpr", user.getUserNo());
            return frontService.addPerson(params);
        } catch (Exception e) {
            logger.error("人员信息采集异常", e);
            return RtnData.fail(e.getMessage());
        }
    }

    @ApiOperation(value = "人员信息更新",notes = "人员信息更新")
    @PostMapping("/uptPerson")
    public Object uptPerson(@CurrentUser LoginUser user, @RequestBody Map<String,Object> params){
        try {
            params.put("lstOpr", user.getUserNo());
            return frontService.uptPerson(params);
        } catch (Exception e) {
            logger.error("人员信息更新异常", e);
            return RtnData.fail(e.getMessage());
        }
    }

    @ApiOperation(value = "分页查询人员信息列表",notes = "分页查询人员信息列表")
    @PostMapping("/personList")
    public Object personList(@RequestBody JSONObject json) {
        Integer pageIndex = this.getPageIndex(json);
        Integer pageSize = this.getPageSize(json);
        String customerName = json.getString("customerName");
        String paperNo = json.getString("paperNo");
        Map<String,Object> params = new HashMap<>();
        if (StringUtils.isNotBlank(customerName)) {
            params.put("customerName", "%" + DataUtil.escapeSqlLikeStr(customerName) + "%");
        }
        if (StringUtils.isNotBlank(paperNo)) {
            params.put("paperNo", paperNo);
        }
        PageModel result = personalInfoService.queryPageList(params, pageIndex, pageSize);
        return RtnData.ok(result);
    }

    @ApiOperation(value = "人员信息删除",notes = "人员信息删除")
    @PostMapping("/delPerson")
    public Object delPerson(@CurrentUser LoginUser user, @RequestBody Map<String,Object> params){
        try {
            params.put("lstOpr", user.getUserNo());
            return frontService.delPerson(params);
        } catch (Exception e) {
            logger.error("人员信息删除异常", e);
            return RtnData.fail(e.getMessage());
        }
    }

    @ApiOperation(value = "人员信息查询",notes = "人员信息查询")
    @PostMapping("/personInfo")
    public Object personInfo(@RequestBody Map<String,Object> params){
        try {
            return frontService.personInfo(params);
        } catch (Exception e) {
            logger.error("人员信息查询异常", e);
            return RtnData.fail(e.getMessage());
        }
    }

    @ApiOperation(value = "分页查询工作票信息列表",notes = "分页查询工作票信息列表")
    @PostMapping("/ticketList")
    public Object ticketList(@RequestBody JSONObject json) {
        Integer pageIndex = this.getPageIndex(json);
        Integer pageSize = this.getPageSize(json);
        String workPrincipalUname = json.getString("workPrincipalUname");
        String workTask = json.getString("workTask");
        String workPlace = json.getString("workPlace");
        Map<String,Object> params = new HashMap<>();
        if (StringUtils.isNotBlank(workPrincipalUname)) {
            params.put("workPrincipalUname", "%" + DataUtil.escapeSqlLikeStr(workPrincipalUname) + "%");
        }
        if (StringUtils.isNotBlank(workTask)) {
            params.put("workTask", "%" + DataUtil.escapeSqlLikeStr(workTask) + "%");
        }
        if (StringUtils.isNotBlank(workPlace)) {
            params.put("workPlace", "%" + DataUtil.escapeSqlLikeStr(workPlace) + "%");
        }
        PageModel result = ticketService.queryPageList_app(params, pageIndex, pageSize);
        return RtnData.ok(result);
    }

    @ApiOperation(value = "工作票详情查询",notes = "工作票详情查询")
    @PostMapping("/ticketInfo")
    public Object ticketInfo(@RequestBody Map<String,Object> params){
        try {
            return ticketService.getInfo_app(params);
        } catch (Exception e) {
            logger.error("工作票详情查询异常", e);
            return RtnData.fail(e.getMessage());
        }
    }

    @ApiOperation(value = "分页查询违规信息列表",notes = "分页查询违规信息列表")
    @PostMapping("/wgList")
    public Object wgList(@RequestBody JSONObject json) {
        Integer pageIndex = this.getPageIndex(json);
        Integer pageSize = this.getPageSize(json);
        String dateType = json.getString("dateType");
        String beginDate = json.getString("beginDate");
        String endDate = json.getString("endDate");
        String customerName = json.getString("customerName");
        String paperNo = json.getString("paperNo");
        String wgType = json.getString("wgType");
        String isConfirm = json.getString("isConfirm");
        String ruleIdStr = json.getString("ruleId");

        Map<String, Object> params = new HashMap<>();
        if(!StringUtils.isBlank(ruleIdStr)){
            String[] ruleIds = ruleIdStr.split(",");
            params.put("ruleIds", ruleIds);
        }
        if (StringUtils.isNotBlank(dateType)) {
            params.put("dateType", dateType);
            if (StringUtils.isNotBlank(beginDate)) {
                Date dtBeginDate = DateUtils.parseDate(beginDate, "yyyy-MM-dd");
                params.put("beginDate", dtBeginDate);
            }
            if (StringUtils.isNotBlank(endDate)) {
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
        PageModel result = wgActService.queryPageList_app(params, pageIndex, pageSize);
        return RtnData.ok(result);
    }

    @ApiOperation(value = "违规照片上传",notes = "违规照片上传")
    @PostMapping("/uploadWgImage")
    public Object uploadWgImage(@RequestParam("file") MultipartFile[] files) {
        return commonsService.uploadWgImage(files);
    }

    @ApiOperation(value = "违规信息查询",notes = "违规信息查询")
    @PostMapping("/wgInfo")
    public Object wgInfo(@RequestBody Map<String,Object> params){
        try {
            return wgActService.getInfo_app(params);
        } catch (Exception e) {
            logger.error("违规信息查询异常", e);
            return RtnData.fail(e.getMessage());
        }
    }

    @ApiOperation(value = "分页查询违规条款列表",notes = "分页查询违规条款列表")
    @PostMapping("/ruleList")
    public Object ruleList(@RequestBody JSONObject json) {
        Integer pageIndex = this.getPageIndex(json);
        Integer pageSize = this.getPageSize(json);
        String ruleName = json.getString("ruleName");

        Map<String, Object> params = new HashMap<>();
        if (StringUtils.isNotBlank(ruleName)) {
            params.put("ruleName", "%" + DataUtil.escapeSqlLikeStr(ruleName) + "%");
        }
        PageModel result = wgRuleService.queryPageList_app(params, pageIndex, pageSize);
        return RtnData.ok(result);
    }


    @ApiOperation(value = "分页查询关联工作票信息列表",notes = "分页查询关联工作票信息列表")
    @PostMapping("/withTicketList")
    public Object withTicketList(@RequestBody JSONObject json) {
        Integer pageIndex = this.getPageIndex(json);
        Integer pageSize = this.getPageSize(json);
        String customerName = json.getString("customerName");
        String paperNo = json.getString("paperNo");
        String workTask = json.getString("workTask");
        Map<String,Object> params = new HashMap<>();
        if (StringUtils.isNotBlank(paperNo)) {
            params.put("paperNo", paperNo);
        }
        if (StringUtils.isNotBlank(customerName)) {
            params.put("customerName", "%" + DataUtil.escapeSqlLikeStr(customerName) + "%");
        }
        if (StringUtils.isNotBlank(workTask)) {
            params.put("workTask", "%" + DataUtil.escapeSqlLikeStr(workTask) + "%");
        }
        PageModel result = ticketService.queryWithTicketList(params, pageIndex, pageSize);
        return RtnData.ok(result);
    }

    @ApiOperation(value = "违规复核",notes = "违规复核")
    @PostMapping("/wgConfirm")
    public Object wgConfirm(@CurrentUser LoginUser user, @RequestBody Map<String,Object> params){
        try {
            params.put("lstOpr", user.getUserNo());
            return wgActService.confirm(params);
        } catch (Exception e) {
            logger.error("违规复核异常", e);
            return RtnData.fail(e.getMessage());
        }
    }

    @ApiOperation(value = "违规采集",notes = "违规采集")
    @PostMapping("/wgSave")
    public Object wgSave(@CurrentUser LoginUser user, @RequestBody Map<String,Object> params){
        try {
            params.put("crtOpr", user.getUserNo());
            return wgActService.save(params);
        } catch (Exception e) {
            logger.error("违规采集异常", e);
            return RtnData.fail(e.getMessage());
        }
    }

    @ApiOperation(value = "考勤规则获取",notes = "考勤规则获取")
    @PostMapping("/attend/rule")
    public Object attendRule(){
        try {
            return attendService.getRuleInfo();
        } catch (Exception e) {
            logger.error("考勤规则获取异常", e);
            return RtnData.fail(e.getMessage());
        }
    }

    @ApiOperation(value = "考勤打卡",notes = "考勤打卡")
    @PostMapping("/attend/check")
    public Object attendCheck(@CurrentUser LoginUser user, @RequestBody JSONObject params){
        try {
            params.put("crtOpr", user.getUserNo());
            return attendService.check(params);
        } catch (Exception e) {
            logger.error("考勤打卡异常", e);
            return RtnData.fail(e.getMessage());
        }
    }

    @ApiOperation(value = "考勤记录查询",notes = "考勤记录查询")
    @PostMapping("/attend/checkList")
    public Object attendCheckList(@CurrentUser LoginUser user, @RequestBody Map<String,Object> params){
        try {
            params.put("crtOpr", user.getUserNo());
            return attendService.checkList(params);
        } catch (Exception e) {
            logger.error("考勤记录查询异常", e);
            return RtnData.fail(e.getMessage());
        }
    }

    private Integer getPageIndex(JSONObject params) {
        Integer pageIndex = params.getInteger("page");
        pageIndex = pageIndex == null ? 1 : pageIndex;
        return pageIndex;
    }

    private Integer getPageSize(JSONObject params) {
        Integer pageSize = params.getInteger("limit");
        pageSize = pageSize == null ? 10 : pageSize;
        return pageSize;
    }
}
