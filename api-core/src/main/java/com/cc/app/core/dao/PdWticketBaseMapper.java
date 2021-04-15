package com.cc.app.core.dao;

import com.cc.app.core.model.PdWticketBase;
import com.cc.app.core.model.PdWticketBaseExample;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface PdWticketBaseMapper {
    int countByExample(PdWticketBaseExample example);

    int deleteByExample(PdWticketBaseExample example);

    int deleteByPrimaryKey(String id);

    int insert(PdWticketBase record);

    int insertSelective(PdWticketBase record);

    List<PdWticketBase> selectByExample(PdWticketBaseExample example);

    PdWticketBase selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PdWticketBase record, @Param("example") PdWticketBaseExample example);

    int updateByExample(@Param("record") PdWticketBase record, @Param("example") PdWticketBaseExample example);

    int updateByPrimaryKeySelective(PdWticketBase record);

    int updateByPrimaryKey(PdWticketBase record);

    Page queryPageList(Map<String,Object> params);

    Map<String,Object> getInfo(String id);

    Page queryWithTicketList(Map<String,Object> params);

    Page queryPageList_app(Map<String,Object> params);

    List<Map<String,Object>> getMemberList(String ticketId);

    Map<String,Object> getTicketBaseInfo(String ticketId);
}