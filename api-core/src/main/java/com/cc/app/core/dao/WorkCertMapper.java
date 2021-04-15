package com.cc.app.core.dao;

import com.cc.app.core.model.WorkCert;
import com.cc.app.core.model.WorkCertExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkCertMapper {
    int countByExample(WorkCertExample example);

    int deleteByExample(WorkCertExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WorkCert record);

    int insertSelective(WorkCert record);

    List<WorkCert> selectByExample(WorkCertExample example);

    WorkCert selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WorkCert record, @Param("example") WorkCertExample example);

    int updateByExample(@Param("record") WorkCert record, @Param("example") WorkCertExample example);

    int updateByPrimaryKeySelective(WorkCert record);

    int updateByPrimaryKey(WorkCert record);
}