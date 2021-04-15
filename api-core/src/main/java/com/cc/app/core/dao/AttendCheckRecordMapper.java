package com.cc.app.core.dao;

import com.cc.app.core.model.AttendCheckRecord;
import com.cc.app.core.model.AttendCheckRecordExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface AttendCheckRecordMapper {
    int countByExample(AttendCheckRecordExample example);

    int deleteByExample(AttendCheckRecordExample example);

    int deleteByPrimaryKey(String id);

    int insert(AttendCheckRecord record);

    int insertSelective(AttendCheckRecord record);

    List<AttendCheckRecord> selectByExample(AttendCheckRecordExample example);

    AttendCheckRecord selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AttendCheckRecord record, @Param("example") AttendCheckRecordExample example);

    int updateByExample(@Param("record") AttendCheckRecord record, @Param("example") AttendCheckRecordExample example);

    int updateByPrimaryKeySelective(AttendCheckRecord record);

    int updateByPrimaryKey(AttendCheckRecord record);

    List<Map<String,Object>> getCheckOnList(Map<String,Object> params);

    List<Map<String,Object>> getCheckOffList(Map<String,Object> params);
}