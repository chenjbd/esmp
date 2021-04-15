package com.cc.app.core.dao;

import com.cc.app.core.model.EventSub;
import com.cc.app.core.model.EventSubExample;
import java.util.List;
import java.util.Map;

import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Param;

public interface EventSubMapper {
    int countByExample(EventSubExample example);

    int deleteByExample(EventSubExample example);

    int deleteByPrimaryKey(String eventId);

    int insert(EventSub record);

    int insertSelective(EventSub record);

    List<EventSub> selectByExample(EventSubExample example);

    EventSub selectByPrimaryKey(String eventId);

    int updateByExampleSelective(@Param("record") EventSub record, @Param("example") EventSubExample example);

    int updateByExample(@Param("record") EventSub record, @Param("example") EventSubExample example);

    int updateByPrimaryKeySelective(EventSub record);

    int updateByPrimaryKey(EventSub record);

    Page queryPageList(Map<String,Object> params);
}