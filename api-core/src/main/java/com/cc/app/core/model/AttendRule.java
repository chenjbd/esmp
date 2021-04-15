package com.cc.app.core.model;

import java.util.Date;

public class AttendRule {
    private String id;

    private String attendName;

    private String onTime;

    private String offTime;

    private Integer workTime;

    private Integer seriousLateMin;

    private Integer absentMin;

    private Integer lateMin;

    private Integer earlyMin;

    private String addressName;

    private String address;

    private String longitude;

    private String latitude;

    private Integer radius;

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

    public String getAttendName() {
        return attendName;
    }

    public void setAttendName(String attendName) {
        this.attendName = attendName == null ? null : attendName.trim();
    }

    public String getOnTime() {
        return onTime;
    }

    public void setOnTime(String onTime) {
        this.onTime = onTime == null ? null : onTime.trim();
    }

    public String getOffTime() {
        return offTime;
    }

    public void setOffTime(String offTime) {
        this.offTime = offTime == null ? null : offTime.trim();
    }

    public Integer getWorkTime() {
        return workTime;
    }

    public void setWorkTime(Integer workTime) {
        this.workTime = workTime;
    }

    public Integer getSeriousLateMin() {
        return seriousLateMin;
    }

    public void setSeriousLateMin(Integer seriousLateMin) {
        this.seriousLateMin = seriousLateMin;
    }

    public Integer getAbsentMin() {
        return absentMin;
    }

    public void setAbsentMin(Integer absentMin) {
        this.absentMin = absentMin;
    }

    public Integer getLateMin() {
        return lateMin;
    }

    public void setLateMin(Integer lateMin) {
        this.lateMin = lateMin;
    }

    public Integer getEarlyMin() {
        return earlyMin;
    }

    public void setEarlyMin(Integer earlyMin) {
        this.earlyMin = earlyMin;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName == null ? null : addressName.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude == null ? null : longitude.trim();
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude == null ? null : latitude.trim();
    }

    public Integer getRadius() {
        return radius;
    }

    public void setRadius(Integer radius) {
        this.radius = radius;
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