package com.cc.app.base.utils;


import com.alibaba.fastjson.JSONObject;
import com.cc.app.base.common.HikConfig;
import com.hikvision.artemis.sdk.ArtemisHttpUtil;
import com.hikvision.artemis.sdk.config.ArtemisConfig;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class HikHttpUtils {

    private final static Logger logger = LoggerFactory.getLogger(HikHttpUtils.class);

    @Autowired
    private HikConfig hikConfig;

    private HikHttpUtils(){
    }

    private static HikHttpUtils hikHttpUtils;

    public static HikHttpUtils getInstance(){
        if(hikHttpUtils == null){
            synchronized(HikHttpUtils.class){
                hikHttpUtils = SpringUtil.getBean(HikHttpUtils.class);
                hikHttpUtils.setHikConfig();
            }
        }
        return hikHttpUtils;
    }

    private void setHikConfig(){
        ArtemisConfig.host = hikConfig.getHost();
        ArtemisConfig.appKey = hikConfig.getAppKey();
        ArtemisConfig.appSecret = hikConfig.getAppSecret();
    }

    public JSONObject post(String url, Map<String,Object> params){
        String body = JSONObject.toJSONString(params);
        String resulStr = this.post(url, body);
        JSONObject json;
        try{
            if(StringUtils.isBlank(resulStr)){
                json = new JSONObject();
                json.put("code", "-1");
                json.put("msg", "海康平台-返回报文为空");
            }else {
                json = JSONObject.parseObject(resulStr);
            }
        }catch (Exception e){
            logger.error("海康平台-返回报文不正确", e);
            json = new JSONObject();
            json.put("code", "-1");
            json.put("msg", "海康平台-返回报文不正确");
        }
        return json;
    }

    public String post(String url, String body){
        try {
            String ARTEMIS_PATH = hikConfig.getArtemis_path();
            String http = hikConfig.getHttp();

            String postUrl = ARTEMIS_PATH + url;
            Map<String, String> path = new HashMap<String, String>(2) {
                {
                    put(http, postUrl);
                }
            };

            String contentType = "application/json";
            logger.info("请求地址：{}", postUrl);
            logger.info("请求报文：{}", body);
            String resultStr = ArtemisHttpUtil.doPostStringArtemis(path, body, null,null, contentType ,null);// post请求application/json类型参数
            logger.info("响应报文：{}", resultStr);
            return resultStr;
        }catch (Exception e){
            logger.error("请求海康服务异常", e);
            return setErrResponse("请求海康服务异常" + e.getMessage());
        }

    }

    private String setErrResponse(String msg){
        return this.setResponse("-1", msg);
    }

    private String setResponse(String code, String msg){
        JSONObject json = new JSONObject();
        json.put("code", code);
        json.put("msg", msg);
        return json.toJSONString();
    }
}
