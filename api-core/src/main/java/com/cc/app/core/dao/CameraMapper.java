package com.cc.app.core.dao;

import com.cc.app.core.model.Camera;
import com.cc.app.core.model.CameraExample;
import java.util.List;
import java.util.Map;

import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Param;

public interface CameraMapper {
    int countByExample(CameraExample example);

    int deleteByExample(CameraExample example);

    int deleteByPrimaryKey(String indexCode);

    int insert(Camera record);

    int insertSelective(Camera record);

    List<Camera> selectByExample(CameraExample example);

    Camera selectByPrimaryKey(String indexCode);

    int updateByExampleSelective(@Param("record") Camera record, @Param("example") CameraExample example);

    int updateByExample(@Param("record") Camera record, @Param("example") CameraExample example);

    int updateByPrimaryKeySelective(Camera record);

    int updateByPrimaryKey(Camera record);

    Page queryPageList(Map<String,Object> params);
}