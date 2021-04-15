package com.cc.app.core.model;

import java.util.Date;

public class FaceGroup {
    private String groupId;

    private String groupName;

    private String groupDesc;

    private Date crtTime;

    private String crtOpr;

    private Date lstTime;

    private String lstOpr;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId == null ? null : groupId.trim();
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    public String getGroupDesc() {
        return groupDesc;
    }

    public void setGroupDesc(String groupDesc) {
        this.groupDesc = groupDesc == null ? null : groupDesc.trim();
    }

    public Date getCrtTime() {
        return crtTime;
    }

    public void setCrtTime(Date crtTime) {
        this.crtTime = crtTime;
    }

    public String getCrtOpr() {
        return crtOpr;
    }

    public void setCrtOpr(String crtOpr) {
        this.crtOpr = crtOpr == null ? null : crtOpr.trim();
    }

    public Date getLstTime() {
        return lstTime;
    }

    public void setLstTime(Date lstTime) {
        this.lstTime = lstTime;
    }

    public String getLstOpr() {
        return lstOpr;
    }

    public void setLstOpr(String lstOpr) {
        this.lstOpr = lstOpr == null ? null : lstOpr.trim();
    }
}