package com.cc.app.core.dao;

import com.cc.app.core.model.WgImg;
import com.cc.app.core.model.WgImgExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface WgImgMapper {
    int countByExample(WgImgExample example);

    int deleteByExample(WgImgExample example);

    int deleteByPrimaryKey(String id);

    int insert(WgImg record);

    int insertSelective(WgImg record);

    List<WgImg> selectByExample(WgImgExample example);

    WgImg selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") WgImg record, @Param("example") WgImgExample example);

    int updateByExample(@Param("record") WgImg record, @Param("example") WgImgExample example);

    int updateByPrimaryKeySelective(WgImg record);

    int updateByPrimaryKey(WgImg record);

    List<Map<String,Object>> selectWgImgListByActId(Map<String,Object> params);

    int batchInsert(List<WgImg> list);
}