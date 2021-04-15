package com.cc.app.core.dao;

import com.cc.app.core.model.WgActRule;
import com.cc.app.core.model.WgActRuleExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface WgActRuleMapper {
    int countByExample(WgActRuleExample example);

    int deleteByExample(WgActRuleExample example);

    int deleteByPrimaryKey(String id);

    int insert(WgActRule record);

    int insertSelective(WgActRule record);

    List<WgActRule> selectByExample(WgActRuleExample example);

    WgActRule selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") WgActRule record, @Param("example") WgActRuleExample example);

    int updateByExample(@Param("record") WgActRule record, @Param("example") WgActRuleExample example);

    int updateByPrimaryKeySelective(WgActRule record);

    int updateByPrimaryKey(WgActRule record);

    int batchInsert(List<WgActRule> list);

    List<Map<String,Object>> getWgRuleListByActId(String actId);
}