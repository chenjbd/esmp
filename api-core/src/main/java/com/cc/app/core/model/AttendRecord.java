package com.cc.app.core.model;

import java.util.Date;

public class AttendRecord {
    private String id;

    private String attendDate;

    private String checkOpr;

    private Date checkOnTime;

    private Date checkOffTime;

    private String isLate;

    private String isEarly;

    private Date crtTime;

    private String crtOpr;

    private Date lstTime;

    private String lstOpr;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getAttendDate() {
        return attendDate;
    }

    public void setAttendDate(String attendDate) {
        this.attendDate = attendDate == null ? null : attendDate.trim();
    }

    public String getCheckOpr() {
        return checkOpr;
    }

    public void setCheckOpr(String checkOpr) {
        this.checkOpr = checkOpr == null ? null : checkOpr.trim();
    }

    public Date getCheckOnTime() {
        return checkOnTime;
    }

    public void setCheckOnTime(Date checkOnTime) {
        this.checkOnTime = checkOnTime;
    }

    public Date getCheckOffTime() {
        return checkOffTime;
    }

    public void setCheckOffTime(Date checkOffTime) {
        this.checkOffTime = checkOffTime;
    }

    public String getIsLate() {
        return isLate;
    }

    public void setIsLate(String isLate) {
        this.isLate = isLate == null ? null : isLate.trim();
    }

    public String getIsEarly() {
        return isEarly;
    }

    public void setIsEarly(String isEarly) {
        this.isEarly = isEarly == null ? null : isEarly.trim();
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