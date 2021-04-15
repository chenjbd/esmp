package com.cc.app.core.service;

import com.cc.app.base.common.PageModel;
import com.cc.app.core.dao.CameraMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class CameraService {

    private Logger logger = LoggerFactory.getLogger(CameraService.class);

    @Autowired
    private CameraMapper cameraMapper;

    public PageModel queryPageList(Map<String,Object> params, int pageIndex, int pageSize) {
        PageHelper.startPage(pageIndex, pageSize);
        Page page = cameraMapper.queryPageList(params);//Page本身是一个ArrayList对象，转换为json时不会保留分页信息
        PageInfo pageInfo = page.toPageInfo();//将page转换成pageInfo会保存分页信息返回
        return new PageModel(pageInfo);
    }
}
