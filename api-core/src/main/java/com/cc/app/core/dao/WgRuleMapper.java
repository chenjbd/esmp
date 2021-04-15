package com.cc.app.core.dao;

import com.cc.app.core.model.WgRule;
import com.cc.app.core.model.WgRuleExample;
import java.util.List;
import java.util.Map;

import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Param;

public interface WgRuleMapper {
    int countByExample(WgRuleExample example);

    int deleteByExample(WgRuleExample example);

    int deleteByPrimaryKey(String id);

    int insert(WgRule record);

    int insertSelective(WgRule record);

    List<WgRule> selectByExample(WgRuleExample example);

    WgRule selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") WgRule record, @Param("example") WgRuleExample example);

    int updateByExample(@Param("record") WgRule record, @Param("example") WgRuleExample example);

    int updateByPrimaryKeySelective(WgRule record);

    int updateByPrimaryKey(WgRule record);

    Page queryPageList(Map<String,Object> params);

    Map<String,Object> getInfo(String id);

    List<Map<String,Object>> findDic();

    Page queryPageList_app(Map<String,Object> params);
}