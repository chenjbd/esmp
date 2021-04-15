package com.cc.app.base.common;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HikConfig {
    @Value("${hik.enabled}")
    private boolean enabled;
    @Value("${hik.http}")
    private String http;
    @Value("${hik.host}")
    private String host;
    @Value("${hik.appKey}")
    private String appKey;
    @Value("${hik.appSecret}")
    private String appSecret;
    @Value("${hik.artemis_path}")
    private String artemis_path;

    //人脸分组接口
    @Value("${hik.urls.addFaceGroup}")
    private String addFaceGroupUrl;
    @Value("${hik.urls.delFaceGroup}")
    private String delFaceGroupUrl;
    @Value("${hik.urls.uptFaceGroup}")
    private String uptFaceGroupUrl;

    //人脸接口
    @Value("${hik.urls.addFace}")
    private String addFaceUrl;
    @Value("${hik.urls.delFace}")
    private String delFaceUrl;
    @Value("${hik.urls.findFace}")
    private String findFaceUrl;
    @Value(("${hik.urls.oneToMany}"))
    private String oneToManyUrl;

    //事件订阅接口
    @Value("${hik.urls.addEvent}")
    private String addEventUrl;
    @Value("${hik.urls.delEvent}")
    private String delEventUrl;

    @Value("${hik.urls.camera.timeRange}")
    private String cameraTimeRangeUrl;

    public boolean isEnabled() {
        return enabled;
    }

    public String getHttp() {
        return http;
    }

    public String getHost() {
        return host;
    }

    public String getAppKey() {
        return appKey;
    }

    public String getAppSecret() {
        return appSecret;
    }

    public String getArtemis_path() {
        return artemis_path;
    }

    public String getAddFaceGroupUrl() {
        return addFaceGroupUrl;
    }

    public String getDelFaceGroupUrl() {
        return delFaceGroupUrl;
    }

    public String getUptFaceGroupUrl() {
        return uptFaceGroupUrl;
    }

    public String getAddFaceUrl() {
        return addFaceUrl;
    }

    public String getDelFaceUrl() {
        return delFaceUrl;
    }

    public String getFindFaceUrl() {
        return findFaceUrl;
    }

    public String getAddEventUrl() {
        return addEventUrl;
    }

    public String getDelEventUrl() {
        return delEventUrl;
    }

    public String getOneToManyUrl() {
        return oneToManyUrl;
    }

    public String getCameraTimeRangeUrl() {
        return cameraTimeRangeUrl;
    }
}
