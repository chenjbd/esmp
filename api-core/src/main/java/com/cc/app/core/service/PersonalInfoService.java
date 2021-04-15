package com.cc.app.core.service;

import com.cc.app.base.common.PageModel;
import com.cc.app.base.common.RtnData;
import com.cc.app.base.ex.ServiceException;
import com.cc.app.base.utils.UUIDGenUtil;
import com.cc.app.core.dao.PersonalInfoMapper;
import com.cc.app.core.model.PersonalInfo;
import com.cc.app.core.model.PersonalInfoExample;
import com.cc.app.core.model.PhotoInfo;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class PersonalInfoService {

    private Logger logger = LoggerFactory.getLogger(PersonalInfoService.class);

    @Autowired
    private PersonalInfoMapper mapper;
    @Autowired
    private PhotoInfoService photoInfoService;

    public PageModel queryPageList(Map<String, Object> params, int pageIndex, int pageSize) {
        PageHelper.startPage(pageIndex, pageSize);
        Page page = mapper.queryPageList(params);//Page本身是一个ArrayList对象，转换为json时不会保留分页信息
        PageInfo pageInfo = page.toPageInfo();//将page转换成pageInfo会保存分页信息返回
        return new PageModel(pageInfo);
    }

    public Object get(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    public Map<String,Object> getInfo(String id) {
        Map<String,Object> infoMap = mapper.getInfo(id);
        return infoMap;
    }

    public RtnData insert(Map<String,Object> params) {
        String customerName = (String) params.get("customerName");
        String paperType = (String) params.get("paperType");
        String paperNo = (String) params.get("paperNo");
        String phoneNo = (String) params.get("phoneNo");
        String gender = (String) params.get("gender");
        String jobId = (String) params.get("jobId");
        String deptNo = (String) params.get("deptNo");
        String posNo = (String) params.get("posNo");
        String certName = (String) params.get("certName");
        String personType = (String) params.get("personType");
        String status = (String) params.get("status");
        String crtOpr = (String) params.get("crtOpr");

        boolean hasPerson = this.checkPaperNo(paperNo, null);
        if(hasPerson){
            logger.error("身份证号已存在，paperNo：{}", paperNo);
            return RtnData.fail("身份证号已存在");
        }

        Date now = new Date();
        String personalId = UUIDGenUtil.uuid();

        PersonalInfo entity = new PersonalInfo();
        entity.setCustomerName(customerName);
        entity.setPaperNo(paperNo);
        entity.setPhoneNo(phoneNo);
        entity.setGender(gender);
        entity.setJobId(jobId);
        entity.setDeptNo(deptNo);
        entity.setPosNo(posNo);
        entity.setCertName(certName);
        entity.setPersonType(personType);
        entity.setStatus(status);
        //证件类型为空，则默认为身份证
        if(StringUtils.isBlank(paperType)){
            entity.setPaperType("0");
        }
        entity.setuId(personalId);
        entity.setCrtTime(now);
        entity.setCrtOpr(crtOpr);
        mapper.insert(entity);
        return RtnData.ok();
    }

    public boolean checkPaperNo(String paperNo, String uid) {
        PersonalInfoExample example = new PersonalInfoExample();
        PersonalInfoExample.Criteria criteria = example.createCriteria();
        criteria.andPaperNoEqualTo(paperNo);
        if(!StringUtils.isBlank(uid)){
            criteria.andUIdNotEqualTo(uid);
        }
        int count = mapper.countByExample(example);
        if(count > 0){
            return true;
        }else{
            return false;
        }
    }

    public RtnData update(Map<String,Object> params) {
        String uid = (String) params.get("uid");
        if(StringUtils.isBlank(uid)){
            logger.error("人员ID不能为空");
            return RtnData.fail("人员ID不能为空");
        }
        String customerName = (String) params.get("customerName");
        String paperType = (String) params.get("paperType");
        String paperNo = (String) params.get("paperNo");
        String phoneNo = (String) params.get("phoneNo");
        String gender = (String) params.get("gender");
        String jobId = (String) params.get("jobId");
        String deptNo = (String) params.get("deptNo");
        String posNo = (String) params.get("posNo");
        String certName = (String) params.get("certName");
        String personType = (String) params.get("personType");
        String status = (String) params.get("status");
        String lstOpr = (String) params.get("lstOpr");

        boolean hasPerson = this.checkPaperNo(paperNo, uid);
        if(hasPerson){
            logger.error("身份证号已存在，paperNo：{}", paperNo);
            return RtnData.fail("身份证号已存在");
        }

        Date now = new Date();

        PersonalInfo entity = new PersonalInfo();
        entity.setuId(uid);

        entity.setCustomerName(customerName);
        entity.setPaperNo(paperNo);
        entity.setPhoneNo(phoneNo);
        entity.setGender(gender);
        entity.setJobId(jobId);
        entity.setDeptNo(deptNo);
        entity.setPosNo(posNo);
        entity.setCertName(certName);
        entity.setPersonType(personType);
        entity.setStatus(status);

        //证件类型为空，则默认为身份证
        if(StringUtils.isBlank(paperType)){
            entity.setPaperType("0");
        }
        entity.setLstTime(new Date());
        entity.setLstOpr(lstOpr);
        mapper.updateByPrimaryKeySelective(entity);
        return RtnData.ok();
    }

    public RtnData delete(Map<String,Object> params) throws Exception {
        String id = (String) params.get("id");
        int count = photoInfoService.countPhoto(id);
        if(count>0){
            return RtnData.fail("请先删除人脸信息");
        }
        this.deletePersonalInfo(id);
        return RtnData.ok();
    }

    public void deletePersonalInfo(String personalId) throws Exception {
        int count = mapper.deleteByPrimaryKey(personalId);
        if(count<=0){
            throw new ServiceException("人员信息不存在");
        }
    }

    public PersonalInfo getInfoByPaperNo(String paperNo) {
        PersonalInfoExample example = new PersonalInfoExample();
        PersonalInfoExample.Criteria criteria = example.createCriteria();
        criteria.andPaperNoEqualTo(paperNo);
        List<PersonalInfo> list = mapper.selectByExample(example);
        if(list.size() > 0){
            return list.get(0);
        }
        return null;
    }

    public Map<String,Object> getWgPersonInfo(String paperNo){
        if(StringUtils.isBlank(paperNo)){
           return null;
        }
        Map<String,Object> infoMap = mapper.getWgPersonInfo(paperNo);
        if(infoMap!=null){
            String uid = (String) infoMap.get("U_ID");
            if(!StringUtils.isBlank(uid)){
                PhotoInfo photoInfo = photoInfoService.photoInfo(uid);
                if(photoInfo!=null){
                    infoMap.put("PHOTO_URL", photoInfo.getPhotoUrl());
                }
            }
        }
        return infoMap;
    }
}
