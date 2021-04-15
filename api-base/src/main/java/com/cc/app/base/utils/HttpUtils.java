package com.cc.app.base.utils;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Component
public class HttpUtils {

    private static Logger logger = LoggerFactory.getLogger(HttpUtils.class);

    private HttpUtils(){
    }

    private static HttpUtils httpUtils;

    public static HttpUtils getInstance(){
        if(httpUtils == null){
            synchronized(HttpUtils.class){
                httpUtils = SpringUtil.getBean(HttpUtils.class);
            }
        }
        return httpUtils;
    }

    @Autowired
    private RestTemplate restTemplate;

    /**
     * get方法
     * @param url
     * @return
     */
    public String get(String url) {
        return get(url, null);
    }

    /**
     * get方法
     * key=value&key=value参数拼接
     * @param url
     * @param data
     * @return
     */
    public String get(String url, Map<String, String> data) {
        return get(url, data, null);
    }

    /**
     * get方法
     * key=value&key=value参数拼接
     * 带请求header
     * @param url
     * @param data
     * @param headers
     * @return
     */
    public String get(String url, Map<String, String> data, Map<String,String> headers) {
        logger.info("请求地址：{}", url);

        //todo 处理header数据

        String paramUrl = getParamUrl(data);
        if(paramUrl != null && paramUrl.length() > 0){
            logger.info("请求参数：{}", paramUrl);
            url = url + "?" +  paramUrl;
        }
        String str = restTemplate.getForObject(url, String.class);
        logger.info("返回报文: {}" , str);
        return str;
    }

    /**
     * 参数URL拼接
     * @param map
     * @return
     */
    private String getParamUrl(Map<String, String> map) {
        String paramUrl = "";
        if (map != null && map.size() > 0) {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, String> item : map.entrySet()) {
                if (!StringUtils.isBlank(item.getKey().trim())) {
                    sb.append("&" + item.getKey().trim() + "=");
                    if (!StringUtils.isBlank(item.getValue())) {
                        sb.append(item.getValue().trim());
                    }
                }
            }
            paramUrl = sb.substring(1);
        }
        return paramUrl;
    }


    /**
     * post方法
     * @param url
     * @return
     */
    public String post(String url, Map<String,Object> bodyMap) {
        return post(url, bodyMap, null);
    }

    public String post(String url, Map<String,Object> bodyMap, Map<String,String> headersMap) {
        //请求头参数
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
        if(headersMap != null){
            for(Map.Entry<String, String> entry : headersMap.entrySet()){
                headers.add(entry.getKey(), entry.getValue());
            }
        }
        HttpEntity<Map<String,Object>> request = new HttpEntity<>(bodyMap, headers);
        String result = restTemplate.postForObject(url, request, String.class);
        return result;
    }
}
