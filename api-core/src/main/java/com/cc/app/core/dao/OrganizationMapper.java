package com.cc.app.core.dao;

import java.util.List;
import java.util.Map;

public interface OrganizationMapper {

    List<Map<String,Object>> getDeptTreeByPId(Map<String,Object> params);

    Map<String,Object> getOrgInfo(String orgId);

    int countDeptNo(String orgId);
}