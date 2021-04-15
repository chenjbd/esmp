package com.cc.app.core.dao;

import com.cc.app.core.model.AttendRule;
import com.cc.app.core.model.AttendRuleExample;
import java.util.List;
import java.util.Map;

import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Param;

public interface AttendRuleMapper {
    int countByExample(AttendRuleExample example);

    int deleteByExample(AttendRuleExample example);

    int deleteByPrimaryKey(String id);

    int insert(AttendRule record);

    int insertSelective(AttendRule record);

    List<AttendRule> selectByExample(AttendRuleExample example);

    AttendRule selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AttendRule record, @Param("example") AttendRuleExample example);

    int updateByExample(@Param("record") AttendRule record, @Param("example") AttendRuleExample example);

    int updateByPrimaryKeySelective(AttendRule record);

    int updateByPrimaryKey(AttendRule record);

    Page queryPageList(Map<String,Object> params);

    Map<String,Object> getInfo();
}