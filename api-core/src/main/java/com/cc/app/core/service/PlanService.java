package com.cc.app.core.service;

import com.cc.app.base.common.PageModel;
import com.cc.app.core.dao.PdPpInfoMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class PlanService {

    private Logger logger = LoggerFactory.getLogger(PlanService.class);

    @Autowired
    private PdPpInfoMapper mapper;

    public PageModel queryPageList(Map<String, Object> params, int pageIndex, int pageSize) {
        PageHelper.startPage(pageIndex, pageSize);
        Page page = mapper.queryPageList(params);//Page本身是一个ArrayList对象，转换为json时不会保留分页信息
        PageInfo pageInfo = page.toPageInfo();//将page转换成pageInfo会保存分页信息返回
        return new PageModel(pageInfo);
    }

    public Object getInfo(String id) {
        return mapper.getInfo(id);
    }
}
