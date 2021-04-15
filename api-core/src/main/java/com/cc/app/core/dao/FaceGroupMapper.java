package com.cc.app.core.dao;

import com.cc.app.core.model.FaceGroup;
import com.cc.app.core.model.FaceGroupExample;
import java.util.List;
import java.util.Map;

import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Param;

public interface FaceGroupMapper {
    int countByExample(FaceGroupExample example);

    int deleteByExample(FaceGroupExample example);

    int deleteByPrimaryKey(String groupId);

    int insert(FaceGroup record);

    int insertSelective(FaceGroup record);

    List<FaceGroup> selectByExample(FaceGroupExample example);

    FaceGroup selectByPrimaryKey(String groupId);

    int updateByExampleSelective(@Param("record") FaceGroup record, @Param("example") FaceGroupExample example);

    int updateByExample(@Param("record") FaceGroup record, @Param("example") FaceGroupExample example);

    int updateByPrimaryKeySelective(FaceGroup record);

    int updateByPrimaryKey(FaceGroup record);

    Page queryPageList(Map<String,Object> params);

    List<Map<String,Object>> findDic();

    FaceGroup selectGroupId();
}