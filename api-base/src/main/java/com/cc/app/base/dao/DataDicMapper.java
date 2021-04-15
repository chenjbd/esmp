package com.cc.app.base.dao;

import com.cc.app.base.model.DataDic;
import com.cc.app.base.model.DataDicExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface DataDicMapper {
    int countByExample(DataDicExample example);

    int deleteByExample(DataDicExample example);

    int deleteByPrimaryKey(Integer dicId);

    int insert(DataDic record);

    int insertSelective(DataDic record);

    List<DataDic> selectByExample(DataDicExample example);

    DataDic selectByPrimaryKey(Integer dicId);

    int updateByExampleSelective(@Param("record") DataDic record, @Param("example") DataDicExample example);

    int updateByExample(@Param("record") DataDic record, @Param("example") DataDicExample example);

    int updateByPrimaryKeySelective(DataDic record);

    int updateByPrimaryKey(DataDic record);

    List<Map<String,Object>> findByDicNo(Map<String,Object> params);
}