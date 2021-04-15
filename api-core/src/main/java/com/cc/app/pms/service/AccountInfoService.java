package com.cc.app.pms.service;

import com.alibaba.fastjson.JSONObject;
import com.cc.app.base.common.AppConfig;
import com.cc.app.base.common.PageModel;
import com.cc.app.base.common.RtnData;
import com.cc.app.base.model.LoginUser;
import com.cc.app.base.util.JwtConfig;
import com.cc.app.base.util.JwtHelper;
import com.cc.app.base.utils.HttpUtils;
import com.cc.app.base.utils.UUIDGenUtil;
import com.cc.app.pms.dao.*;
import com.cc.app.pms.model.*;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import java.util.*;

@Service
public class AccountInfoService {

    private Logger logger = LoggerFactory.getLogger(AccountInfoService.class);

    @Value("${system.login-expire-time-pc}")
    private int login_expire_time;
    @Value("${system.login-expire-time-app}")
    private int app_login_expire_time;

    @Autowired
    private JwtConfig jwtConfig;

    @Autowired
    private AccountInfoMapper mapper;

    @Autowired
    private UserLoginMapper userLoginMapper;

    @Autowired
    private AccRoleMapper accRoleMapper;

    @Autowired
    private CodeService codeService;

    @Autowired
    private PhoneCodeMapper phoneCodeMapper;
    @Autowired
    private AppConfig appConfig;
    @Autowired
    private ResInfoMapper resInfoMapper;

    public PageModel queryPageList(Map<String, Object> params, int pageIndex, int pageSize) {
        PageHelper.startPage(pageIndex, pageSize);
        Page page = mapper.queryPageList(params);//Page本身是一个ArrayList对象，转换为json时不会保留分页信息
        PageInfo pageInfo = page.toPageInfo();//将page转换成pageInfo会保存分页信息返回
        return new PageModel(pageInfo);
    }

    public Object get(String id) {
        AccountInfo accountInfo =  mapper.selectByPrimaryKey(id);
        accountInfo.setAccPwd(null);//去除密码项
        return accountInfo;
    }

    public Object insert(AccountInfo entity, String loginId) throws Exception {
        Assert.hasText(loginId, "登录id不能为空");
        Assert.hasText(entity.getAccName(), "账户名不能为空");
        Assert.hasText(entity.getAccPwd(), "账户密码不能为空");

        //查询账户名是否已经存在
        AccountInfo accountInfo = mapper.selectByAcc(entity.getAccName());
        if(accountInfo != null){
            logger.error("账户名已存在");
            throw new Exception("账户名已存在");
        }
        //查询手机号码是否已存在
        AccountInfoExample accountInfoExample = new AccountInfoExample();
        accountInfoExample.createCriteria().andPhoneEqualTo(entity.getPhone());
        List<AccountInfo> list = mapper.selectByExample(accountInfoExample);
        if(list.size()>0){
            logger.error("该手机号码已存在");
            throw new Exception("该手机号码已存在");
        }
        entity.setAccId(UUIDGenUtil.uuid());
        entity.setLstTime(new Date());
        return mapper.insert(entity);
    }

    public Object update(AccountInfo entity) throws Exception {
        Assert.hasText(entity.getAccId() + "", "账户ID不能为空");
        Assert.hasText(entity.getAccName(), "账户名不能为空");
        AccountInfo accountInfo = mapper.selectByPrimaryKey(entity.getAccId());
        if(accountInfo == null){
            logger.error("账户不存在");
            throw  new Exception("账户不存在");
        }
        if(!entity.getAccName().equals(accountInfo.getAccName())){
            logger.error("账户名不允许修改");
            throw new Exception("账户名不允许修改");
        }
        //查询手机号码是否已存在
        AccountInfoExample accountInfoExample = new AccountInfoExample();
        accountInfoExample.createCriteria().andPhoneEqualTo(entity.getPhone()).andAccIdNotEqualTo(entity.getAccId());
        List<AccountInfo> list = mapper.selectByExample(accountInfoExample);
        if(list.size()>0){
            logger.error("该手机号码已存在");
            throw new Exception("该手机号码已存在");
        }
        entity.setLstTime(new Date());
        if(StringUtils.isBlank(entity.getAccPwd())){
            entity.setAccPwd(null);
        }
        return mapper.updateByPrimaryKeySelective(entity);
    }

    public Object doLogin(Map<String, Object> data) throws Exception {

        String accName = (String) data.get("accName");
        String accPwd = (String) data.get("accPwd");
        String code = (String) data.get("code");
        String codeId = (String) data.get("codeId");

        Assert.hasText(accName, "账户名不能为空");
        Assert.hasText(accPwd, "密码不能为空");

        //验证码验证
        Assert.hasText(codeId, "验证码错误");
        PhoneCode phoneCode = codeService.validImgCode(codeId, code);

        AccountInfo accountInfo = mapper.selectByAcc(accName);
        if(accountInfo == null){
            logger.error("找不到账号");
            throw new Exception("账号不存在");
        }
        if("9".equals(accountInfo.getStatus())){
            logger.error("账号已注销");
            throw new Exception("账号已注销");
        }
        if(!accPwd.equals(accountInfo.getAccPwd())){
            logger.error("账号密码错误");
            throw new Exception("账号密码错误");
        }

        //保存登录信息
        Date now = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);
        calendar.add(Calendar.HOUR_OF_DAY, login_expire_time);
        Date expireTime = calendar.getTime();//登录过期时间
        String loginKey = UUIDGenUtil.uuid();
        String loginId = UUIDGenUtil.uuid();
        UserLogin userLogin = new UserLogin();
        userLogin.setLoginId(loginId);
        userLogin.setuId(accountInfo.getAccId());
        userLogin.setLoginKey(loginKey);
        userLogin.setLoginTime(now);
        userLogin.setExpireTime(expireTime);
        userLogin.setLoginType("0");
        userLogin.setUnitNo(accountInfo.getUnitNo());
        userLoginMapper.insert(userLogin);

        //验证码失效
        phoneCode.setUseTime(now);
        phoneCode.setExpireTime(now);
        phoneCodeMapper.updateByPrimaryKey(phoneCode);

        //生成jwt
        String token = JwtHelper.generateJWT(loginId, accountInfo.getName(), login_expire_time, jwtConfig.getJwt_secret());

        //返回结果
        Map<String,Object> ret = new HashMap<String,Object>();
        ret.put("loginId", loginId);
        ret.put("token", token);
        ret.put("job", accountInfo.getJob());//返回职位
        logger.info("用户登录成功，userNo：{}", accName);
        return ret;
    }

    public Object doWebLogin(Map<String, Object> data) throws Exception {

        String accName = (String) data.get("accName");
        String accPwd = (String) data.get("accPwd");

        Assert.hasText(accName, "账户名不能为空");
        Assert.hasText(accPwd, "密码不能为空");

        AccountInfo accountInfo = mapper.selectByAcc(accName);
        if(accountInfo == null){
            logger.error("找不到账号");
            throw new Exception("账号不存在");
        }
        if("9".equals(accountInfo.getStatus())){
            logger.error("账号已注销");
            throw new Exception("账号已注销");
        }
        if(!accPwd.equals(accountInfo.getAccPwd())){
            logger.error("账号密码错误");
            throw new Exception("账号密码错误");
        }

        //保存登录信息
        Date now = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);
        calendar.add(Calendar.HOUR_OF_DAY, login_expire_time);
        Date expireTime = calendar.getTime();//登录过期时间
        String loginKey = UUIDGenUtil.uuid();
        String loginId = UUIDGenUtil.uuid();
        UserLogin userLogin = new UserLogin();
        userLogin.setLoginId(loginId);
        userLogin.setuId(accountInfo.getAccId());
        userLogin.setLoginKey(loginKey);
        userLogin.setLoginTime(now);
        userLogin.setExpireTime(expireTime);
        userLogin.setLoginType("2");
        userLogin.setUnitNo(accountInfo.getUnitNo());
        userLoginMapper.insert(userLogin);

        //生成jwt
        String token = JwtHelper.generateJWT(loginId, accountInfo.getName(), login_expire_time, jwtConfig.getJwt_secret());

        //返回结果
        Map<String,Object> ret = new HashMap<String,Object>();
        ret.put("loginId", loginId);
        ret.put("loginKey", token);
        ret.put("job", accountInfo.getJob());//返回职位
        return ret;
    }

    private JSONObject getCode2Session(String code) throws Exception {
        //appid=APPID&secret=SECRET&js_code=JSCODE&grant_type=authorization_code
        Map<String,String> codeParams = new HashMap<>();
        codeParams.put("appid", appConfig.getAppid());
        codeParams.put("secret", appConfig.getSecret());
        codeParams.put("js_code", code);
        codeParams.put("grant_type", "authorization_code");

        String codeValidRes = HttpUtils.getInstance().get(appConfig.getCode2SessionUrl(), codeParams);
        JSONObject codeValidJson = JSONObject.parseObject(codeValidRes);
        return codeValidJson;
    }

    @Transactional(rollbackFor = Exception.class)
    public Object miniLoginCheck(Map<String, Object> data) throws Exception {
        String loginId = (String) data.get("loginId");
        String code = (String) data.get("code");

        Assert.hasText(loginId, "loginId不能为空");
        Assert.hasText(code, "登录凭证code不能为空");

        JSONObject sessionMap = this.getCode2Session(code);
        //{"session_key":"rnLC7FOMQUipyyB18ORsUg==","openid":"oaQ2w4g7UH8b_t7xZB5uPAPvFNI4"}
        String openid = sessionMap.getString("openid");
        String session_key = sessionMap.getString("session_key");
        String unionid = sessionMap.getString("unionid");//有可能为空
        if(StringUtils.isBlank(openid)){
            throw new Exception("登陆凭证校验失败");
        }
        //查找登录信息
        UserLogin userLogin = userLoginMapper.selectByPrimaryKey(loginId);
        if(userLogin == null){
            logger.error("登录信息不存在，请重新登录");
            throw new Exception("登录信息不存在");
        }
        if(userLogin.getLogoutTime()!=null){
            logger.error("用户已注销，请重新登录");
            throw new Exception("用户未登录");
        }
        Date now = new Date();
        if(userLogin.getExpireTime().compareTo(now) < 0){
            logger.error("登录信息已过期，请重新登录");
            throw new Exception("登录信息已过期");
        }
        String uid = userLogin.getuId();
        AccountInfo accountInfo = mapper.selectByPrimaryKey(uid);
        if(accountInfo==null || "9".equals(accountInfo.getStatus())){
            logger.error("用户信息不存在或已注销");
            throw new Exception("登录信息无效");
        }
        String accOpenid = accountInfo.getOpenId();
        if(StringUtils.isBlank(accOpenid) || !openid.equals(accOpenid)){
            logger.error("登录账号未绑定该微信号，请重新登录");
            throw new Exception("登录信息不存在");
        }

        boolean hasMenu = this.checkMiniMenu(accountInfo.getAccId());
        if(!hasMenu){
            logger.error("用户未授权");
            throw new Exception("用户未授权");
        }

        logger.info("小程序登录有效，手机号：{}", accountInfo.getPhone());

        //生成jwt
        String token = JwtHelper.generateJWT(
                loginId, accountInfo.getName(), app_login_expire_time * 24, jwtConfig.getJwt_secret());

        //返回结果
        Map<String,Object> ret = new HashMap<>();
        ret.put("loginId", loginId);
        ret.put("loginKey", token);
        Map<String,Object> userInfo = new HashMap<>();
        userInfo.put("userNo", accountInfo.getAccName());
        userInfo.put("userName", accountInfo.getName());
        userInfo.put("bindWx", "1");
        userInfo.put("isOwner", "1");
        ret.put("userInfo", userInfo);
        return ret;
    }

    @Transactional(rollbackFor = Exception.class)
    public Object loginMini(Map<String, Object> data) throws Exception {
        String userName = (String) data.get("userName");
        String passwd = (String) data.get("passwd");
        String code = (String) data.get("code");

        Assert.hasText(userName, "手机号不能为空");
        Assert.hasText(passwd, "密码不能为空");
        Assert.hasText(code, "登录凭证code不能为空");

        JSONObject sessionMap = this.getCode2Session(code);
        //{"session_key":"rnLC7FOMQUipyyB18ORsUg==","openid":"oaQ2w4g7UH8b_t7xZB5uPAPvFNI4"}
        String openid = sessionMap.getString("openid");
        String session_key = sessionMap.getString("session_key");
        String unionid = sessionMap.getString("unionid");//有可能为空
        if(StringUtils.isBlank(openid)){
            throw new Exception("登陆凭证校验失败");
        }

        List<AccountInfo> accountInfoList = mapper.selectByPhone(userName);
        if(accountInfoList==null || accountInfoList.size()<=0){
            logger.error("手机号未注册");
            throw new Exception("手机号未注册");
        }
        if(accountInfoList.size()!=1){
            logger.error("用户数据异常，用户信息存在多条，手机号：{}", userName);
            throw new Exception("用户数据异常");
        }
        AccountInfo accountInfo = accountInfoList.get(0);
        if("9".equals(accountInfo.getStatus())){
            logger.error("用户已注销");
            throw new Exception("用户已注销");
        }
        if(!passwd.equals(accountInfo.getAccPwd())){
            logger.error("密码错误");
            throw new Exception("密码错误");
        }

        boolean hasMenu = this.checkMiniMenu(accountInfo.getAccId());
        if(!hasMenu){
            logger.error("用户未授权");
            throw new Exception("用户未授权");
        }

        String accOpenid = accountInfo.getOpenId();
        boolean isBindWx = false;
        boolean isCurrWx = false;
        if(!StringUtils.isBlank(accOpenid)){
            isBindWx = true;
            if(openid.equals(accOpenid)){
                isCurrWx = true;
            }
        }

        logger.info("保存登录信息");
        Date now = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);
        calendar.add(Calendar.DAY_OF_MONTH, app_login_expire_time);
        Date expireTime = calendar.getTime();//登录过期时间
        String loginId = UUIDGenUtil.uuid();
        UserLogin userLogin = new UserLogin();
        userLogin.setLoginId(loginId);
        userLogin.setuId(accountInfo.getAccId());
        userLogin.setLoginTime(now);
        userLogin.setExpireTime(expireTime);
        userLogin.setLoginType("1");//0-后台，1-微信
        userLogin.setUnitNo(accountInfo.getUnitNo());
        userLoginMapper.insert(userLogin);

        logger.info("小程序登录成功，手机号：{}", userName);

        //生成jwt
        String token = JwtHelper.generateJWT(
                loginId, accountInfo.getName(), app_login_expire_time * 24, jwtConfig.getJwt_secret());

        //返回结果
        Map<String,Object> ret = new HashMap<>();
        ret.put("loginId", loginId);
        ret.put("loginKey", token);
        Map<String,Object> userInfo = new HashMap<>();
        userInfo.put("userNo", accountInfo.getAccName());
        userInfo.put("userName", accountInfo.getName());
        userInfo.put("bindWx", isBindWx ? "1" : "0");
        userInfo.put("isOwner", isCurrWx ? "1" : "0");
        ret.put("userInfo", userInfo);
//        ret.put("job", accountInfo.getJob());//返回职位
        return ret;
    }


    @Transactional(rollbackFor = Exception.class)
    public Object bindWx(Map<String, Object> data) throws Exception {
        String loginId = (String) data.get("loginId");
        String code = (String) data.get("code");

        Assert.hasText(loginId, "登录凭证ID不能为空");
        Assert.hasText(code, "登录凭证code不能为空");

        JSONObject sessionMap = this.getCode2Session(code);
        //{"session_key":"rnLC7FOMQUipyyB18ORsUg==","openid":"oaQ2w4g7UH8b_t7xZB5uPAPvFNI4"}
        String openid = sessionMap.getString("openid");
        String session_key = sessionMap.getString("session_key");
        String unionid = sessionMap.getString("unionid");//有可能为空
        if(StringUtils.isBlank(openid)){
            throw new Exception("登陆凭证校验失败");
        }

        UserLogin userLogin = userLoginMapper.selectByPrimaryKey(loginId);
        if(userLogin==null){
            throw new Exception("用户登录状态异常");
        }

        //获取用户ID
        String uid = userLogin.getuId();
        AccountInfo accountInfo = mapper.selectByPrimaryKey(uid);
        if(accountInfo == null){
            throw new Exception("用户信息异常");
        }
        String accOpenid = accountInfo.getOpenId();
        if(!StringUtils.isBlank(accOpenid)){
            if(openid.equals(accOpenid)){
                throw new Exception("该账户已绑定当前微信");
            }else{
                throw new Exception("该账户已绑定其他微信，请先解绑");
            }
        }else{
            //判断openId是否存在已绑定其他账号
            List<AccountInfo> boundList =  mapper.selectByOpenId(openid);
            if(boundList != null && boundList.size()>0){
                throw new Exception("该账户已绑定其他微信，请先解绑");
            }
        }

        logger.info("绑定微信openid、unionid");
        AccountInfo wxInfo = new AccountInfo();
        wxInfo.setAccId(uid);
        wxInfo.setOpenId(openid);
        wxInfo.setUnionId(unionid);
        mapper.updateOpenIdByAccId(wxInfo);

        logger.info("小程序-绑定微信成功，loginId：{}", loginId);
        //返回结果
        Map<String,Object> ret = new HashMap<>();
        return ret;
    }

    @Transactional(rollbackFor = Exception.class)
    public Object unbindWx(Map<String, Object> data) throws Exception {
        String loginId = (String) data.get("loginId");
        String code = (String) data.get("code");

        Assert.hasText(loginId, "登录凭证ID不能为空");
        Assert.hasText(code, "登录凭证code不能为空");

        JSONObject sessionMap = this.getCode2Session(code);
        //{"session_key":"rnLC7FOMQUipyyB18ORsUg==","openid":"oaQ2w4g7UH8b_t7xZB5uPAPvFNI4"}
        String openid = sessionMap.getString("openid");
        String session_key = sessionMap.getString("session_key");
        String unionid = sessionMap.getString("unionid");//有可能为空
        if(StringUtils.isBlank(openid)){
            throw new Exception("登陆凭证校验失败");
        }

        UserLogin userLogin = userLoginMapper.selectByPrimaryKey(loginId);
        if(userLogin==null){
            throw new Exception("用户登录状态异常");
        }

        //获取用户ID
        String uid = userLogin.getuId();
        AccountInfo accountInfo = mapper.selectByPrimaryKey(uid);
        if(accountInfo == null){
            throw new Exception("用户信息异常");
        }
        String accOpenid = accountInfo.getOpenId();
        if(!StringUtils.isBlank(accOpenid)){
            if(!openid.equals(accOpenid)){
                throw new Exception("该账户未绑定当前微信");
            }
        }else{
            throw new Exception("该账户未绑定当前微信");
        }

        logger.info("解绑微信openid、unionid");
        AccountInfo wxInfo = new AccountInfo();
        wxInfo.setAccId(uid);
        wxInfo.setOpenId(null);
        wxInfo.setUnionId(null);
        mapper.updateOpenIdByAccId(wxInfo);

        logger.info("小程序-解绑微信成功，loginId：{}", loginId);
        //返回结果
        Map<String,Object> ret = new HashMap<>();
        return ret;
    }

    private boolean checkMiniMenu(String accId){
        List<ResInfo> resList = resInfoMapper.selectByAppId("weixin");
        if(resList==null || resList.size()<=0){
            return false;
        }
        ResInfo resInfo = resList.get(0);
        //小程序菜单ID
        String resId = resInfo.getResId();

        Map<String,Object> countMap = new HashMap<>();
        countMap.put("accId", accId);
        countMap.put("resId", resId);
        int count = roleResMapper.countRoleRes(countMap);
        if(count>0){
            return true;
        }else{
            return false;
        }
    }

    /**
     * 查询角色信息，包含账户角色权限
     * @param accId
     * @return
     */
    public Object findAccRole(String accId){
        if(StringUtils.isBlank(accId)){
            return null;
        }
        return accRoleMapper.selectWithAcc(accId);
    }

    /**
     * 添加用户角色
     * @param data
     * @return
     */
    public Object addAccRole(Map<String, Object> data) {
        String accId = (String) data.get("accId");
        String rIds = (String) data.get("rIds");
        Assert.hasText(accId, "账号Id不能为空");

        //如果不穿角色id，则不添加
        if(StringUtils.isBlank(rIds)){
            return 0;
        }

        String[] rIdArr = rIds.split(",");
        int n = 0;
        for(String rid : rIdArr){
            AccRole accRole = new AccRole();
            accRole.setUrId(UUIDGenUtil.uuid());
            accRole.setAccId(accId);
            accRole.setRoleId(rid);
            int i = accRoleMapper.insert(accRole);
            n = n + i;
        }
        return n;
    }

    /**
     * 重设用户角色，添加新的用户角色关系，删除旧的
     * @param data
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public Object setAccRole(Map<String, Object> data) throws Exception{
        String accId = (String) data.get("accId");
        String rIds = (String) data.get("rIds");
        Assert.hasText(accId, "账号Id不能为空");

        //先删除旧的角色
        accRoleMapper.deleteByAccId(accId);
        return this.addAccRole(data);
    }

    @Autowired
    private RoleResMapper roleResMapper;

    /**
     * 查找账户所有资源
     * @param loginId 登录Id
     * @return
     */
    public Object findAllAccRes(String loginId){
        List<Map<String,Object>> tree = new ArrayList<Map<String,Object>>();

        //根据登录id获取用户信息
        UserLogin userLogin = userLoginMapper.selectByPrimaryKey(loginId);
        if(userLogin == null){
            logger.error("登录id错误");
            return tree;
        }
        AccountInfo accountInfo = mapper.selectByPrimaryKey(userLogin.getuId());
        if(accountInfo == null){
            return null;
        }
        //查找用户权限信息,先查一级菜单
        List<Map<String,Object>> list = null;
        Map<String,Object> params = null;
        String sRole = accountInfo.getAccRole();//角色类型
        if("admin".equals(sRole)){
            //管理员角色，获取所有权限
            list = roleResMapper.selectAllRes("0");
            if(list == null){
                return tree;
            }
            for(Map<String,Object> map : list){
                //查询二级菜单
                String pId = (String) map.get("resNo");
                List<Map<String,Object>> children = roleResMapper.selectAllRes(pId);
                if(children != null){
                    for(Map<String,Object> m : children){
                        //查询三级菜单
                        List<Map<String,Object>> child3 = roleResMapper.selectAllRes((String) m.get("resNo"));
                        if(child3 != null){
                            m.put("child", child3);
                        }
                    }
                    map.put("child", children);
                }
                tree.add(map);
            }
        }else {
            params = new HashMap<String, Object>();
            params.put("accId", userLogin.getuId());
            params.put("pId", "0");
            list = roleResMapper.selectAccRoleRes(params);
            if(list == null){
                return tree;
            }
            for(Map<String,Object> map : list){
                //查询二级菜单
                String pId = (String) map.get("resNo");
                params = new HashMap<String,Object>();
                params.put("accId", userLogin.getuId());
                params.put("pId", pId);
                List<Map<String,Object>> children = roleResMapper.selectAccRoleRes(params);
                if(children != null){
                    for(Map<String,Object> m : children){
                        //查询三级菜单
                        params = new HashMap<String,Object>();
                        params.put("accId", userLogin.getuId());
                        params.put("pId", (String) m.get("resNo"));
                        //List<Map<String,Object>> child3 = roleResMapper.selectAllRes((String) m.get("resNo"));
                        List<Map<String,Object>> child3 = roleResMapper.selectAccRoleRes(params);
                        if(child3 != null){
                            m.put("child", child3);
                        }
                    }
                    map.put("child", children);
                }
                tree.add(map);
            }
        }
        return tree;
    }

    /**
     * 修改密码
     * @param data
     * @return
     */
    public Object setpwd(Map<String, String> data) throws Exception {
        String loginId = (String) data.get("loginId");
        String oldPwd = (String) data.get("oldPwd");
        String newPwd = (String) data.get("newPwd");
        Assert.hasText(loginId, "登录Id不能为空");
        Assert.hasText(oldPwd, "旧密码不能为空");
        Assert.hasText(newPwd, "新密码不能为空");
        UserLogin userLogin = userLoginMapper.selectByPrimaryKey(loginId);
        if(userLogin == null){
            logger.error("登录id错误");
            throw new Exception("用户未登录");
        }
        AccountInfo accountInfo = mapper.selectByPrimaryKey(userLogin.getuId());
        if(accountInfo == null){
            logger.error("用户信息不存在");
            throw new Exception("用户信息不存在");
        }
        if(!oldPwd.equals(accountInfo.getAccPwd())){
            logger.error("旧密码错误");
            throw new Exception("旧密码错误");
        }
        accountInfo.setAccPwd(newPwd);
        accountInfo.setLstTime(new Date());
        int n = mapper.updateByPrimaryKeySelective(accountInfo);
        logger.info("---用户密码修改成功，loginId：{}---", loginId);
        return n;
    }

    /**
     * 退出登录
     * @param loginUser
     * @return
     */
    public Object doLogout(LoginUser loginUser) {
        String loginId = loginUser.getLoginId();
        if(!StringUtils.isBlank(loginId)){
            UserLogin userLogin = userLoginMapper.selectByPrimaryKey(loginId);
            if(userLogin != null){
                //设置登录失效
                Date now = new Date();
                UserLogin uptEntity = new UserLogin();
                uptEntity.setLoginId(loginId);
                uptEntity.setLogoutTime(now);
                uptEntity.setExpireTime(now);
                userLoginMapper.updateByPrimaryKeySelective(uptEntity);
                logger.info("登录注销成功，userNo：{}", loginUser.getUserNo());
            }else {
                logger.error("登录信息不存在");
            }
        } else {
            logger.error("登录ID为空");
        }
        return RtnData.ok();
    }

    /**
     * 根据登录id获取用户信息
     * @param loginId
     * @return
     */
    public AccountInfo  getByloginId(String loginId) throws Exception {
        Assert.hasText(loginId, "登录Id不能为空");
        UserLogin userLogin = userLoginMapper.selectByPrimaryKey(loginId);
        if(userLogin == null){
            logger.error("登录id错误");
            throw new Exception("用户未登录");
        }
        AccountInfo accountInfo = mapper.selectByPrimaryKey(userLogin.getuId());
        if(accountInfo == null){
            logger.error("用户信息不存在");
            throw new Exception("用户信息不存在");
        }
        return accountInfo;
    }

    /**
     * 查询帐户登录日志
     * @param id
     * @return
     */
    public List queryLoginLog(String id) {
        return userLoginMapper.queryLoginLog(id);
    }

    /**
     * 查询用户登录信息
     * @param loginId
     * @return
     */
    public UserLogin findUserLogin(String loginId){
        return userLoginMapper.selectByPrimaryKey(loginId);
    }

    public LoginUser getLoginUser(String loginId){
        LoginUser loginUser = null;
        if(!StringUtils.isBlank(loginId)){
            UserLogin userLoginInfo = userLoginMapper.selectByPrimaryKey(loginId);
            Date now = new Date();
            if(userLoginInfo!=null && userLoginInfo.getLogoutTime() == null && userLoginInfo.getExpireTime().compareTo(now) > 0){
                String uid = userLoginInfo.getuId();
                if(!StringUtils.isBlank(uid)){
                    AccountInfo accountInfo = mapper.selectByPrimaryKey(uid);
                    if(accountInfo!=null){
                        loginUser = new LoginUser();
                        loginUser.setUserNo(accountInfo.getAccName());
                        loginUser.setLoginId(loginId);
                    }
                }
            }
        }
        return loginUser;
    }
}
