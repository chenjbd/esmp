package com.cc.app.core.dao;

import com.cc.app.core.model.WgImgAls;
import com.cc.app.core.model.WgImgAlsExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface WgImgAlsMapper {
    int countByExample(WgImgAlsExample example);

    int deleteByExample(WgImgAlsExample example);

    int deleteByPrimaryKey(String id);

    int insert(WgImgAls record);

    int insertSelective(WgImgAls record);

    List<WgImgAls> selectByExample(WgImgAlsExample example);

    WgImgAls selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") WgImgAls record, @Param("example") WgImgAlsExample example);

    int updateByExample(@Param("record") WgImgAls record, @Param("example") WgImgAlsExample example);

    int updateByPrimaryKeySelective(WgImgAls record);

    int updateByPrimaryKey(WgImgAls record);

    List<Map<String,Object>> queryWgImgAlsPageList(Map<String,Object> params);
}