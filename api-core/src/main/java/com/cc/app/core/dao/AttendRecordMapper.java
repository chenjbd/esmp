package com.cc.app.core.dao;

import com.cc.app.core.model.AttendRecord;
import com.cc.app.core.model.AttendRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AttendRecordMapper {
    int countByExample(AttendRecordExample example);

    int deleteByExample(AttendRecordExample example);

    int deleteByPrimaryKey(String id);

    int insert(AttendRecord record);

    int insertSelective(AttendRecord record);

    List<AttendRecord> selectByExample(AttendRecordExample example);

    AttendRecord selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AttendRecord record, @Param("example") AttendRecordExample example);

    int updateByExample(@Param("record") AttendRecord record, @Param("example") AttendRecordExample example);

    int updateByPrimaryKeySelective(AttendRecord record);

    int updateByPrimaryKey(AttendRecord record);
}