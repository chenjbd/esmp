package com.cc.app.core.service;

import com.cc.app.base.common.RtnData;
import com.cc.app.base.ex.ServiceException;
import com.cc.app.base.util.JwtConfig;
import com.cc.app.base.util.JwtHelper;
import com.cc.app.base.utils.UUIDGenUtil;
import com.cc.app.base.utils.ValidatorUtils;
import com.cc.app.core.dao.PersonalInfoMapper;
import com.cc.app.core.model.PersonalInfo;
import com.cc.app.core.model.PhotoInfo;
import com.cc.app.pms.dao.AccountInfoMapper;
import com.cc.app.pms.dao.ResInfoMapper;
import com.cc.app.pms.dao.RoleResMapper;
import com.cc.app.pms.dao.UserLoginMapper;
import com.cc.app.pms.model.AccountInfo;
import com.cc.app.pms.model.ResInfo;
import com.cc.app.pms.model.UserLogin;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
public class FrontService {

    private final static Logger logger = LoggerFactory.getLogger(FrontService.class);

    @Value("${system.login-expire-time-app}")
    private int app_login_expire_time;
    @Autowired
    private JwtConfig jwtConfig;

    @Autowired
    private AccountInfoMapper accountInfoMapper;
    @Autowired
    private UserLoginMapper userLoginMapper;
    @Autowired
    private PersonalInfoMapper personalInfoMapper;
    @Autowired
    private PersonalInfoService personalInfoService;
    @Autowired
    private PhotoInfoService photoInfoService;
    @Autowired
    private CommonsService commonsService;
    @Autowired
    private ResInfoMapper resInfoMapper;
    @Autowired
    private RoleResMapper roleResMapper;

    public RtnData login(Map<String,Object> params) throws Exception {
        String loginType = (String) params.get("loginType");
        if(StringUtils.isBlank(loginType) || (!"0".equals(loginType) && !"1".equals(loginType))){
            loginType = "0";
        }
        String userNo = (String) params.get("userNo");
        String userPwd = (String) params.get("userPwd");
        if(StringUtils.isBlank(userNo)){
            logger.error("??????????????????");
            return RtnData.fail("??????????????????");
        }
        if(StringUtils.isBlank(userPwd)){
            logger.error("????????????????????????");
            return RtnData.fail("????????????????????????");
        }
        AccountInfo accountInfo = this.getAccountInfoByUserNo(userNo, loginType);
        if(accountInfo == null){
            logger.error("???????????????");
            return RtnData.fail("???????????????");
        }
        if("9".equals(accountInfo.getStatus())){
            logger.error("???????????????");
            return RtnData.fail("???????????????");
        }
        if(!userPwd.equals(accountInfo.getAccPwd())){
            logger.error("??????????????????");
            return RtnData.fail("??????????????????");
        }

        boolean hasMenu = this.checkFrontMenu(accountInfo.getAccId());
        if(!hasMenu){
            throw new ServiceException("???????????????");
        }

        //??????????????????
        Date now = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);
        calendar.add(Calendar.DAY_OF_MONTH, app_login_expire_time);
        Date expireTime = calendar.getTime();//??????????????????
        String loginKey = UUIDGenUtil.uuid();
        String loginId = UUIDGenUtil.uuid();
        UserLogin userLogin = new UserLogin();
        userLogin.setLoginId(loginId);
        userLogin.setuId(accountInfo.getAccId());
        userLogin.setLoginKey(loginKey);
        userLogin.setLoginTime(now);
        userLogin.setExpireTime(expireTime);
        userLogin.setLoginType("2");//0-?????????1-?????????2-app
        userLogin.setUnitNo(accountInfo.getUnitNo());
        userLoginMapper.insert(userLogin);

        //??????jwt
        String token = JwtHelper.generateJWT(loginId, accountInfo.getName(), app_login_expire_time, jwtConfig.getJwt_secret());

        //????????????
        Map<String,Object> ret = new HashMap<>();
        ret.put("token", token);
        ret.put("userNo", accountInfo.getAccName());
        ret.put("name", accountInfo.getName());
        ret.put("mobile", accountInfo.getPhone());

        logger.info("?????????????????????userNo???{}", userNo);
        return RtnData.ok(ret);
    }

    private boolean checkFrontMenu(String accId){
        List<ResInfo> resList = resInfoMapper.selectByAppId("app");
        if(resList==null || resList.size()<=0){
            return false;
        }
        ResInfo resInfo = resList.get(0);

        //APP??????ID
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

    private AccountInfo getAccountInfoByUserNo(String userNo) throws Exception {
        return this.getAccountInfoByUserNo(userNo, "1");
    }

    private AccountInfo getAccountInfoByUserNo(String userNo, String queryType) throws Exception {
        if("0".equals(queryType)){
            List<AccountInfo> accountInfos = accountInfoMapper.selectByPhone(userNo);
            if(accountInfos == null || accountInfos.size() <= 0){
                throw new ServiceException("???????????????");
            }else if(accountInfos.size() > 1){
                throw new ServiceException("????????????");
            }else {
                return accountInfos.get(0);
            }
        } else {
            return accountInfoMapper.selectByAcc(userNo);
        }
    }

    public RtnData setPwd(String userNo, Map<String,Object> params) throws Exception {
        String oldPwd = (String) params.get("oldPwd");
        String newPwd = (String) params.get("newPwd");
        if(StringUtils.isBlank(userNo)){
            logger.error("??????????????????");
            return RtnData.fail("??????????????????");
        }
        if(StringUtils.isBlank(oldPwd)){
            logger.error("?????????????????????");
            return RtnData.fail("?????????????????????");
        }
        if(StringUtils.isBlank(newPwd)){
            logger.error("?????????????????????");
            return RtnData.fail("?????????????????????");
        }
        AccountInfo accountInfo = this.getAccountInfoByUserNo(userNo);
        if(accountInfo == null){
            logger.error("???????????????");
            return RtnData.fail("???????????????");
        }
        if(!oldPwd.equals(accountInfo.getAccPwd())){
            logger.error("???????????????");
            return RtnData.fail("???????????????");
        }
        AccountInfo uptEntity = new AccountInfo();
        uptEntity.setAccId(accountInfo.getAccId());
        uptEntity.setAccPwd(newPwd);
        uptEntity.setLstTime(new Date());
        accountInfoMapper.updateByPrimaryKeySelective(uptEntity);
        logger.info("???????????????????????????userNo???{}", userNo);
        return RtnData.ok();
    }

    @Transactional(rollbackFor = Exception.class)
    public Object addPerson(Map<String,Object> params) throws Exception {
        String customerName = (String) params.get("customerName");
        String paperNo = (String) params.get("paperNo");
        String mobile = (String) params.get("mobile");
        String deptNo = (String) params.get("deptNo");
        String posNo = (String) params.get("posNo");
        String certName = (String) params.get("certName");
        String personType = (String) params.get("personType");
        String photoUrl = (String) params.get("photoUrl");
        String crtOpr = (String) params.get("crtOpr");

        //????????????
        this.checkPersonParams(params, null);

        //???????????????????????????????????????
        String gender = this.getGenderCode(paperNo);

        Date now = new Date();
        String personalId = UUIDGenUtil.uuid();

        PersonalInfo entity = new PersonalInfo();
        entity.setuId(personalId);
        entity.setCustomerName(customerName);
        entity.setPaperType("0");//??????????????????
        entity.setPaperNo(paperNo);
        entity.setPhoneNo(mobile);
        entity.setGender(gender);
        entity.setJobId(null);
        entity.setDeptNo(deptNo);
        entity.setPosNo(posNo);
        entity.setCertName(certName);
        entity.setPersonType(personType);
        entity.setStatus("1");//????????????0-?????????1-??????
        entity.setCrtTime(now);
        entity.setCrtOpr(crtOpr);
        personalInfoMapper.insert(entity);

        PhotoInfo photoInfo = new PhotoInfo();
        photoInfo.setPersonalId(personalId);
        photoInfo.setPhotoUrl(photoUrl);
        photoInfo.setCrtTime(now);
        photoInfo.setCrtOpr(crtOpr);
        photoInfoService.addFace(entity, photoInfo);
        return RtnData.ok();
    }

    private String getGenderCode(String paperNo) {
        String gender = "1";//1-??????2-???
        String genderCodeStr = paperNo.substring(16, 17);
        int genderCode = Integer.parseInt(genderCodeStr);
        if(genderCode % 2 == 0){
            gender = "2";
        }
        return gender;
    }

    @Transactional(rollbackFor = Exception.class)
    public Object uptPerson(Map<String,Object> params) throws Exception {
        String uid = (String) params.get("uid");
        String customerName = (String) params.get("customerName");
        String paperNo = (String) params.get("paperNo");
        String mobile = (String) params.get("mobile");
        String deptNo = (String) params.get("deptNo");
        String posNo = (String) params.get("posNo");
        String certName = (String) params.get("certName");
        String personType = (String) params.get("personType");
        String photoUrl = (String) params.get("photoUrl");
        String lstOpr = (String) params.get("lstOpr");

        if(StringUtils.isBlank(uid)){
            throw new ServiceException("??????ID????????????");
        }

        //uid??????
        PersonalInfo personalInfo = personalInfoMapper.selectByPrimaryKey(uid);
        if(personalInfo == null){
            throw new ServiceException("??????ID?????????");
        }

        //????????????
        this.checkPersonParams(params, uid);

        //???????????????????????????????????????
        String gender = this.getGenderCode(paperNo);

        Date now = new Date();

        PersonalInfo entity = new PersonalInfo();
        entity.setuId(uid);
        entity.setCustomerName(customerName);
        entity.setPaperType("0");//??????????????????
        entity.setPaperNo(paperNo);
        entity.setPhoneNo(mobile);
        entity.setGender(gender);
        entity.setJobId(null);
        entity.setDeptNo(deptNo);
        entity.setPosNo(posNo);
        entity.setCertName(certName);
        entity.setPersonType(personType);
        entity.setStatus("1");//????????????0-?????????1-??????
        entity.setLstTime(now);
        entity.setLstOpr(lstOpr);
        personalInfoMapper.updateByPrimaryKeySelective(entity);

        //????????????????????????????????????????????????
        PhotoInfo hasPhotoInfo = photoInfoService.photoInfo(uid);
        if(hasPhotoInfo != null){
            photoInfoService.deleteFace(hasPhotoInfo.getPhotoId(), false);
        }

        PhotoInfo photoInfo = new PhotoInfo();
        photoInfo.setPersonalId(uid);
        photoInfo.setPhotoUrl(photoUrl);
        photoInfo.setCrtTime(now);
        photoInfo.setCrtOpr(lstOpr);
        photoInfoService.addFace(entity, photoInfo);
        return RtnData.ok();
    }

    private void checkPersonParams(Map<String,Object> params, String personalId) throws Exception {
        String customerName = (String) params.get("customerName");
        String paperNo = (String) params.get("paperNo");
        String mobile = (String) params.get("mobile");
        String deptNo = (String) params.get("deptNo");
        String posNo = (String) params.get("posNo");
        String certName = (String) params.get("certName");
        String personType = (String) params.get("personType");
        String photoUrl = (String) params.get("photoUrl");

        customerName = customerName == null ? "" : customerName.trim();
        if(StringUtils.isEmpty(customerName)){
            throw new ServiceException("??????????????????");
        }else if(customerName.length() > 20){
            throw new ServiceException("?????????????????????20");
        }
        paperNo = paperNo == null ? "" : paperNo.trim();
        if(StringUtils.isEmpty(paperNo)){
            throw new ServiceException("????????????????????????");
        }else if(paperNo.length() != 18 || !ValidatorUtils.IdCard(paperNo)){
            throw new ServiceException("?????????????????????");
        }

        mobile = mobile == null ? "" : mobile.trim();
        if(StringUtils.isEmpty(mobile)){
            throw new ServiceException("????????????????????????");
        }else if(mobile.length() != 11 || !mobile.startsWith("1")){
            throw new ServiceException("?????????????????????");
        }

        personType = personType == null ? "" : personType.trim();
        if(StringUtils.isEmpty(personType)){
            throw new ServiceException("????????????????????????");
        }else if(!"1".equals(personType) && !"2".equals(personType) && !"3".equals(personType)){
            throw new ServiceException("?????????????????????");
        }

        deptNo = deptNo == null ? "" : deptNo.trim();
        if(StringUtils.isEmpty(deptNo)){
            throw new ServiceException("????????????????????????");
        }else if(!commonsService.hasDeptNo(deptNo)){
            throw new ServiceException("??????????????????");
        }

        posNo = posNo == null ? "" : posNo.trim();
        if(StringUtils.isEmpty(posNo)){
            throw new ServiceException("??????????????????");
        }else if(!commonsService.hasPosNo(posNo)){
            throw new ServiceException("????????????");
        }

        certName = certName == null ? "" : certName.trim();
        if(!StringUtils.isEmpty(certName) && certName.length() > 2000){
            throw new ServiceException("???????????????????????????2000");
        }

        photoUrl = photoUrl == null ? "" : photoUrl.trim();
        if(StringUtils.isEmpty(photoUrl)){
            throw new ServiceException("????????????????????????");
        }else if(photoUrl.length() > 200){
            throw new ServiceException("?????????????????????????????????200");
        }

        boolean hasPerson = personalInfoService.checkPaperNo(paperNo, personalId);
        if(hasPerson){
            logger.error("paperNo???{}", paperNo);
            throw new ServiceException("?????????????????????");
        }
    }

    @Transactional(rollbackFor = Exception.class)
    public RtnData delPerson(Map<String,Object> params) throws Exception {
        String id = (String) params.get("uid");
        if(StringUtils.isBlank(id)){
            throw new ServiceException("??????ID????????????");
        }
        personalInfoService.deletePersonalInfo(id);

        PhotoInfo photoInfo = photoInfoService.photoInfo(id);
        if(photoInfo != null){
            photoInfoService.deleteFace(photoInfo.getPhotoId(), false);
        }
        return RtnData.ok();
    }

    public Object personInfo(Map<String,Object> params) throws Exception {
        String id = (String) params.get("uid");
        if(StringUtils.isBlank(id)){
            throw new ServiceException("??????ID????????????");
        }
        Map<String,Object> info = personalInfoService.getInfo(id);
        if(info==null){
            throw new ServiceException("?????????????????????");
        }
        Map<String,Object> photoInfo = photoInfoService.list(id);
        if(photoInfo!=null){
            info.put("PHOTO_URL", photoInfo.get("PHOTO_URL"));
        }
        return RtnData.ok(info);
    }
}
