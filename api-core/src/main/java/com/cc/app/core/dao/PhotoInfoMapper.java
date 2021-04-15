package com.cc.app.core.dao;

import com.cc.app.core.model.PhotoInfo;
import com.cc.app.core.model.PhotoInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface PhotoInfoMapper {
    int countByExample(PhotoInfoExample example);

    int deleteByExample(PhotoInfoExample example);

    int deleteByPrimaryKey(String photoId);

    int insert(PhotoInfo record);

    int insertSelective(PhotoInfo record);

    List<PhotoInfo> selectByExample(PhotoInfoExample example);

    PhotoInfo selectByPrimaryKey(String photoId);

    int updateByExampleSelective(@Param("record") PhotoInfo record, @Param("example") PhotoInfoExample example);

    int updateByExample(@Param("record") PhotoInfo record, @Param("example") PhotoInfoExample example);

    int updateByPrimaryKeySelective(PhotoInfo record);

    int updateByPrimaryKey(PhotoInfo record);

    List<Map<String,Object>> getInfo(String personalId);
}