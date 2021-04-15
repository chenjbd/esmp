package com.cc.app.core.service;

import com.alibaba.fastjson.JSONObject;
import com.cc.app.base.common.HikConfig;
import com.cc.app.base.common.PageModel;
import com.cc.app.base.common.RtnData;
import com.cc.app.base.utils.HikHttpUtils;
import com.cc.app.base.utils.UUIDGenUtil;
import com.cc.app.core.dao.EventSubMapper;
import com.cc.app.core.model.EventSub;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class EventSubService {

    private Logger logger = LoggerFactory.getLogger(EventSubService.class);

    @Autowired
    private EventSubMapper mapper;
    @Autowired
    private HikConfig hikConfig;

    public PageModel queryPageList(Map<String, Object> params, int pageIndex, int pageSize) {
        PageHelper.startPage(pageIndex, pageSize);
        Page page = mapper.queryPageList(params);//Page本身是一个ArrayList对象，转换为json时不会保留分页信息
        PageInfo pageInfo = page.toPageInfo();//将page转换成pageInfo会保存分页信息返回
        return new PageModel(pageInfo);
    }

    public RtnData insert(EventSub entity) throws Exception {
        this.insertEvent(entity);
        return RtnData.ok();
    }

    public RtnData delete(Map<String,Object> params) throws Exception {
        String id = (String) params.get("id");
        String force = (String) params.get("force");
        boolean isForce = "1".equals(force) ? true : false;
        logger.info("是否为强制删除：{}", isForce);
        this.deleteEvent(id, isForce);
        return RtnData.ok();
    }

    public Object get(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Transactional(rollbackFor = Exception.class)
    public Object update(EventSub entity) throws Exception {
        String eventId = entity.getEventId();
        this.deleteEvent(eventId, false);
        this.insertEvent(entity);
        return RtnData.ok();
    }

    public void insertEvent(EventSub entity) throws Exception {
        if(hikConfig.isEnabled()){
            Map<String,Object> hikMap = new HashMap<>();
            String eventTypeStr = entity.getEventType();
            String[] eventTypes = eventTypeStr.split(",");
            hikMap.put("eventTypes", eventTypes);
            hikMap.put("eventDest", entity.getEventDest());
            String subType = entity.getSubType();
            if(!StringUtils.isBlank(subType)){
                hikMap.put("subType", subType);
            }
            String eventLvlStr = entity.getEventLvl();
            if(!StringUtils.isBlank(eventLvlStr)){
                String[] eventLvls = eventLvlStr.split(",");
                hikMap.put("eventLvl", eventLvls);
            }

            JSONObject result = HikHttpUtils.getInstance().post(hikConfig.getAddEventUrl(), hikMap);
            String code = result.getString("code");
            String msg = result.getString("msg");
            if(!"0".equals(code)){
                throw new Exception(msg);
            }
        }
        entity.setEventId(UUIDGenUtil.uuid());
        Date now = new Date();
        entity.setCrtTime(now);
        mapper.insert(entity);
    }

    public void deleteEvent(String eventId, boolean isForce) throws Exception {
        EventSub eventInfo = mapper.selectByPrimaryKey(eventId);
        if(eventInfo == null){
            logger.error("事件订阅ID不能为空");
            throw new Exception("事件订阅ID不能为空");
        }
        if(hikConfig.isEnabled()){
            Map<String,Object> hikMap = new HashMap<>();
            String eventTypeStr = eventInfo.getEventType();
            String[] eventType = eventTypeStr.split(",");
            hikMap.put("eventTypes", eventType);
            JSONObject result = HikHttpUtils.getInstance().post(hikConfig.getDelEventUrl(), hikMap);
            String code = result.getString("code");
            String msg = result.getString("msg");
            if(!"0".equals(code)){
                logger.error("事件订阅[{}]删除异常：{}", eventTypeStr, msg);
                if(!isForce){
                    throw new Exception(msg);
                }
            }
        }
        mapper.deleteByPrimaryKey(eventId);
    }
}
