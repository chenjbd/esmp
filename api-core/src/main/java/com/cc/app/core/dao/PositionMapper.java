package com.cc.app.core.dao;

import java.util.List;
import java.util.Map;

public interface PositionMapper {

    List<Map<String,Object>> getPosTreeData(Map<String, Object> params);

    int countPosNo(String posNo);
}