package com.cc.app.base.dao;

import com.cc.app.base.model.SystemConfig;
import com.cc.app.base.model.SystemConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemConfigMapper {
    int countByExample(SystemConfigExample example);

    int deleteByExample(SystemConfigExample example);

    int deleteByPrimaryKey(String code);

    int insert(SystemConfig record);

    int insertSelective(SystemConfig record);

    List<SystemConfig> selectByExample(SystemConfigExample example);

    SystemConfig selectByPrimaryKey(String code);

    int updateByExampleSelective(@Param("record") SystemConfig record, @Param("example") SystemConfigExample example);

    int updateByExample(@Param("record") SystemConfig record, @Param("example") SystemConfigExample example);

    int updateByPrimaryKeySelective(SystemConfig record);

    int updateByPrimaryKey(SystemConfig record);
}