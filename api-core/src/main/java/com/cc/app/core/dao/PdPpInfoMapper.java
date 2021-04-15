package com.cc.app.core.dao;

import com.cc.app.core.model.PdPpInfo;
import com.cc.app.core.model.PdPpInfoExample;
import java.util.List;
import java.util.Map;

import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Param;

public interface PdPpInfoMapper {
    int countByExample(PdPpInfoExample example);

    int deleteByExample(PdPpInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(PdPpInfo record);

    int insertSelective(PdPpInfo record);

    List<PdPpInfo> selectByExample(PdPpInfoExample example);

    PdPpInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PdPpInfo record, @Param("example") PdPpInfoExample example);

    int updateByExample(@Param("record") PdPpInfo record, @Param("example") PdPpInfoExample example);

    int updateByPrimaryKeySelective(PdPpInfo record);

    int updateByPrimaryKey(PdPpInfo record);

    Page queryPageList(Map<String,Object> params);

    Map<String,Object> getInfo(String id);

}