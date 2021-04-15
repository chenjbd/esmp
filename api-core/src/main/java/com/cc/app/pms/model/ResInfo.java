package com.cc.app.pms.model;

import java.math.BigDecimal;

public class ResInfo {
    private String resId;

    private String resNo;

    private String resName;

    private String resPath;

    private String resDesc;

    private String pId;

    private BigDecimal seq;

    private String icon;

    private String appId;

    public String getResId() {
        return resId;
    }

    public void setResId(String resId) {
        this.resId = resId == null ? null : resId.trim();
    }

    public String getResNo() {
        return resNo;
    }

    public void setResNo(String resNo) {
        this.resNo = resNo == null ? null : resNo.trim();
    }

    public String getResName() {
        return resName;
    }

    public void setResName(String resName) {
        this.resName = resName == null ? null : resName.trim();
    }

    public String getResPath() {
        return resPath;
    }

    public void setResPath(String resPath) {
        this.resPath = resPath == null ? null : resPath.trim();
    }

    public String getResDesc() {
        return resDesc;
    }

    public void setResDesc(String resDesc) {
        this.resDesc = resDesc == null ? null : resDesc.trim();
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId == null ? null : pId.trim();
    }

    public BigDecimal getSeq() {
        return seq;
    }

    public void setSeq(BigDecimal seq) {
        this.seq = seq;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
    }
}