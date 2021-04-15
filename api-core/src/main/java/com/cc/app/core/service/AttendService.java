package com.cc.app.core.service;

import com.alibaba.fastjson.JSONObject;
import com.cc.app.base.common.PageModel;
import com.cc.app.base.common.RtnData;
import com.cc.app.base.ex.ServiceException;
import com.cc.app.base.utils.DateUtils;
import com.cc.app.base.utils.UUIDGenUtil;
import com.cc.app.core.dao.AttendCheckRecordMapper;
import com.cc.app.core.dao.AttendRecordMapper;
import com.cc.app.core.dao.AttendRuleMapper;
import com.cc.app.core.model.AttendCheckRecord;
import com.cc.app.core.model.AttendRecord;
import com.cc.app.core.model.AttendRecordExample;
import com.cc.app.core.model.AttendRule;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
public class AttendService {

    private Logger logger = LoggerFactory.getLogger(AttendService.class);

    @Autowired
    private AttendRuleMapper attendRuleMapper;
    @Autowired
    private AttendRecordMapper attendRecordMapper;
    @Autowired
    private AttendCheckRecordMapper attendCheckRecordMapper;

    public PageModel queryRulePageList(Map<String, Object> params, int pageIndex, int pageSize) {
        PageHelper.startPage(pageIndex, pageSize);
        Page page = attendRuleMapper.queryPageList(params);//Page本身是一个ArrayList对象，转换为json时不会保留分页信息
        PageInfo pageInfo = page.toPageInfo();//将page转换成pageInfo会保存分页信息返回
        return new PageModel(pageInfo);
    }

    public Object getRule(String id) {
        return attendRuleMapper.selectByPrimaryKey(id);
    }

    public RtnData saveRule(AttendRule entity) throws Exception {
        Integer seriousLateMin = entity.getSeriousLateMin();
        Integer absentMin = entity.getAbsentMin();
        if(seriousLateMin == null){
            seriousLateMin = -1;
        }else if(seriousLateMin <= 0){
            throw new ServiceException("严重迟到分钟不能小于等于0");
        }
        if(absentMin == null){
            absentMin = -1;
        }else if(absentMin <= 0){
            throw new ServiceException("旷工分钟不能小于等于0");
        }
        if(seriousLateMin != -1 && absentMin != -1 && absentMin < seriousLateMin ){
            throw new ServiceException("旷工分钟必须大于迟到分钟");
        }
        Integer lateMin = entity.getLateMin();
        Integer earlyMin = entity.getEarlyMin();
        if(lateMin == null){
            lateMin = 0;
        }else if(lateMin < 0){
            throw new ServiceException("最多可晚到分钟不能小于0");
        }
        if(earlyMin == null){
            earlyMin = 0;
        }else if(earlyMin < 0){
            throw new ServiceException("最多可早走分钟不能小于0");
        }
        String onTime = entity.getOnTime();
        String offTime = entity.getOffTime();
        Date date_onTime = DateUtils.parseDate("2021-04-02 "+onTime+":00", "yyyy-MM-dd HH:mm:ss");
        Date date_offTime = DateUtils.parseDate("2021-04-02 "+offTime+":00", "yyyy-MM-dd HH:mm:ss");
        int workTime = (int) DateUtils.getDiffMin(date_onTime, date_offTime);
        if(lateMin + earlyMin >= workTime){
            throw new ServiceException("最多可晚到和最多可早走相加需小于工作总时长!");
        }
        entity.setWorkTime(workTime);
        entity.setSeriousLateMin(seriousLateMin);
        entity.setAbsentMin(absentMin);
        entity.setLateMin(lateMin);
        entity.setEarlyMin(earlyMin);
        entity.setLstTime(new Date());
        attendRuleMapper.updateByPrimaryKeySelective(entity);
        return RtnData.ok();
    }

    public RtnData getRuleInfo() throws Exception {
        Map<String,Object> infoMap = attendRuleMapper.getInfo();
        if(infoMap == null){
            throw new ServiceException("考勤规则未设置");
        }
        return RtnData.ok(infoMap);
    }

    @Transactional(rollbackFor = Exception.class)
    public RtnData check(JSONObject params) throws Exception {
        Date now = new Date();
        String attendDate = DateUtils.formatDate(now, "yyyy-MM-dd");

        String checkType = params.getString("checkType");
        String latitude = params.getString("latitude");
        String longitude = params.getString("longitude");
        String address = params.getString("address");
        String checkRemark = params.getString("checkRemark");
        String crtOpr = params.getString("crtOpr");
        String checkOpr = crtOpr;
        if(StringUtils.isBlank(checkType)){
            throw new ServiceException("考勤类型不能为空");
        }else if(!"0".equals(checkType) && !"1".equals(checkType)){
            throw new ServiceException("考勤类型不正确");
        }
        latitude = latitude == null ? "" : latitude.trim();
        if(StringUtils.isBlank(latitude)){
            throw new ServiceException("纬度不能为空");
        }else if(latitude.length() > 20){
            throw new ServiceException("纬度最大长度为20");
        }
        longitude = longitude == null ? "" : longitude.trim();
        if(StringUtils.isBlank(longitude)){
            throw new ServiceException("经度不能为空");
        }else if(longitude.length() > 20){
            throw new ServiceException("经度最大长度为20");
        }
        address = address == null ? "" : address.trim();
        if(StringUtils.isBlank(address)){
            throw new ServiceException("打卡地址不能为空");
        }else if(address.length() > 500){
            throw new ServiceException("打卡地址最大长度为500");
        }
        checkRemark = checkRemark == null ? "" : checkRemark.trim();
        if(checkRemark.length() > 200){
            throw new ServiceException("打卡备注最大长度为200");
        }

        Map<String,Object> ruleMap = attendRuleMapper.getInfo();
        if(ruleMap == null){
            throw new ServiceException("考勤规则未设置");
        }
        AttendRecord attendRecord = this.getAttendRecord(checkOpr, attendDate);
        if("0".equals(checkType)){
            //上班打卡
            String onTime = (String) ruleMap.get("ON_TIME");
            Integer lateMin = (Integer) ruleMap.get("LATE_MIN");
            String baseCheckTimeStr = attendDate + " " + onTime + ":00";
            Date baseCheckTime = DateUtils.parseDate(baseCheckTimeStr, "yyyy-MM-dd HH:mm:ss");
            Date baseCheckTime_flexible = DateUtils.addMinutes(baseCheckTime, lateMin);
            boolean hasCheckRecord = false;
            boolean checkOn = false;
            if(attendRecord != null){
                hasCheckRecord = true;
                if(attendRecord.getCheckOnTime() != null){
                    checkOn = true;
                }
            }
            if(checkOn){
                throw new ServiceException("今天已上班打卡");
            }
            String isLate = "2";//是否迟到，1-是，2-否
            if(baseCheckTime_flexible.compareTo(now) < 0){
                isLate = "1";
            }
            if(!hasCheckRecord){
                String recordId = UUIDGenUtil.uuid();
                AttendRecord entity = new AttendRecord();
                entity.setId(recordId);
                entity.setAttendDate(attendDate);
                entity.setCheckOpr(checkOpr);
                entity.setCheckOnTime(now);
                entity.setIsLate(isLate);
                entity.setCrtOpr(crtOpr);
                entity.setCrtTime(now);
                this.attendRecordMapper.insert(entity);
            } else {
                AttendRecord entity = new AttendRecord();
                entity.setId(attendRecord.getId());
                entity.setCheckOnTime(now);
                entity.setIsLate(isLate);
                entity.setLstOpr(crtOpr);
                entity.setLstTime(now);
                this.attendRecordMapper.updateByPrimaryKeySelective(entity);
            }
            String checkResult = "2".equals(isLate) ? "0" : "1";
            AttendCheckRecord checkRecord = new AttendCheckRecord();
            checkRecord.setId(UUIDGenUtil.uuid());
            checkRecord.setAttendDate(attendDate);
            checkRecord.setCheckType(checkType);
            checkRecord.setCheckTime(now);
            checkRecord.setCheckOpr(checkOpr);
            checkRecord.setCheckRemark(checkRemark);
            checkRecord.setAddress(address);
            checkRecord.setLatitude(latitude);
            checkRecord.setLongitude(longitude);
            checkRecord.setBaseCheckTime(baseCheckTime);
            checkRecord.setCheckResult(checkResult);//打卡结果0-正常，1-迟到，2-早退
            checkRecord.setCrtOpr(crtOpr);
            checkRecord.setCrtTime(new Date());
            this.attendCheckRecordMapper.insert(checkRecord);

            Map<String,Object> checkResultMap = new HashMap<>();
            checkResultMap.put("CHECK_RESULT", checkResult);
            return RtnData.ok(checkResultMap);
        }else{
            //下班打卡
            String offTime = (String) ruleMap.get("OFF_TIME");
            Integer earlyMin = (Integer) ruleMap.get("EARLY_MIN");
            String baseCheckTimeStr = attendDate + " " + offTime + ":00";
            Date baseCheckTime = DateUtils.parseDate(baseCheckTimeStr, "yyyy-MM-dd HH:mm:ss");
            Date baseCheckTime_flexible = DateUtils.addMinutes(baseCheckTime, -earlyMin);
            boolean hasCheckRecord = false;
            if(attendRecord != null){
                hasCheckRecord = true;
            }
            String isEarly = "2";//是否早退，1-是，2-否
            if(baseCheckTime_flexible.compareTo(now) > 0){
                isEarly = "1";
            }
            if(!hasCheckRecord){
                String recordId = UUIDGenUtil.uuid();
                AttendRecord entity = new AttendRecord();
                entity.setId(recordId);
                entity.setAttendDate(attendDate);
                entity.setCheckOpr(checkOpr);
                entity.setCheckOffTime(now);
                entity.setIsEarly(isEarly);
                entity.setCrtOpr(crtOpr);
                entity.setCrtTime(now);
                this.attendRecordMapper.insert(entity);
            } else {
                AttendRecord entity = new AttendRecord();
                entity.setId(attendRecord.getId());
                entity.setCheckOffTime(now);
                entity.setIsEarly(isEarly);
                entity.setLstOpr(crtOpr);
                entity.setLstTime(now);
                this.attendRecordMapper.updateByPrimaryKeySelective(entity);
            }
            String checkResult = "2".equals(isEarly) ? "0" : "2";
            AttendCheckRecord checkRecord = new AttendCheckRecord();
            checkRecord.setId(UUIDGenUtil.uuid());
            checkRecord.setAttendDate(attendDate);
            checkRecord.setCheckType(checkType);
            checkRecord.setCheckTime(now);
            checkRecord.setCheckOpr(checkOpr);
            checkRecord.setCheckRemark(checkRemark);
            checkRecord.setAddress(address);
            checkRecord.setLatitude(latitude);
            checkRecord.setLongitude(longitude);
            checkRecord.setBaseCheckTime(baseCheckTime);
            checkRecord.setCheckResult(checkResult);//打卡结果0-正常，1-迟到，2-早退
            checkRecord.setCrtOpr(crtOpr);
            checkRecord.setCrtTime(new Date());
            this.attendCheckRecordMapper.insert(checkRecord);

            Map<String,Object> checkResultMap = new HashMap<>();
            checkResultMap.put("CHECK_RESULT", checkResult);
            return RtnData.ok(checkResultMap);
        }
    }

    private AttendRecord getAttendRecord(String checkOpr, String attendDate) {
        AttendRecordExample example = new AttendRecordExample();
        AttendRecordExample.Criteria criteria = example.createCriteria();
        criteria.andAttendDateEqualTo(attendDate).andCheckOprEqualTo(checkOpr);
        List<AttendRecord> list = this.attendRecordMapper.selectByExample(example);
        if(list.size() > 0){
            return list.get(0);
        }
        return null;
    }

    public RtnData checkList(Map<String,Object> params) throws Exception {
        String attendDate = (String) params.get("attendDate");
        attendDate = attendDate == null ? "" : attendDate.trim();
        if(StringUtils.isBlank(attendDate)){
            attendDate = DateUtils.formatDate(new Date(), "yyyy-MM-dd");
        } else {
            if(attendDate.length() != 10){
                throw new ServiceException("查询日期格式不正确");
            }
            Date date_attendDate = DateUtils.parseDateL(attendDate, "yyyy-MM-dd");
            if(date_attendDate == null){
                throw new ServiceException("查询日期格式不正确");
            }
        }
        String crtOpr = (String) params.get("crtOpr");
        params.put("checkOpr", crtOpr);
        params.put("attendDate", attendDate);
        List<Map<String,Object>> checkOnList = this.attendCheckRecordMapper.getCheckOnList(params);
        List<Map<String,Object>> checkList = new ArrayList<>();
        if(checkOnList.size() > 0){
            checkList.add(checkOnList.get(0));
        }
        List<Map<String,Object>> checkOffList = this.attendCheckRecordMapper.getCheckOffList(params);
        if(checkOffList.size() > 0){
            checkList.add(checkOffList.get(0));
        }
        return RtnData.ok(checkList);
    }
}
