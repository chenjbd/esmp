package com.cc.app.core.dao;

import com.cc.app.core.model.WgAct;
import com.cc.app.core.model.WgActExample;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface WgActMapper {
    int countByExample(WgActExample example);

    int deleteByExample(WgActExample example);

    int deleteByPrimaryKey(String id);

    int insert(WgAct record);

    int insertSelective(WgAct record);

    List<WgAct> selectByExample(WgActExample example);

    WgAct selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") WgAct record, @Param("example") WgActExample example);

    int updateByExample(@Param("record") WgAct record, @Param("example") WgActExample example);

    int updateByPrimaryKeySelective(WgAct record);

    int updateByPrimaryKey(WgAct record);

    Page queryPageList(Map<String,Object> params);

    Map<String,Object> getInfo(String id);

    Page queryPageList_app(Map<String,Object> params);
}