package com.cc.app.base.service;

import com.cc.app.base.dao.DataDicMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 数据字典
 * Created by Administrator on 2018/11/2.
 */
@Service
public class DataDicService {

    @Autowired
    private DataDicMapper dataDicMapper;


    /**
     * 根据字典代码查找所有字典项
     * @param params
     * @return
     */
    public List<Map<String, Object>> findByDicNo(Map<String,Object> params){
        return dataDicMapper.findByDicNo(params);
    }
}
