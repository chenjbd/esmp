package com.cc.app.core.model;

import java.util.Date;

public class WgAct {
    private String id;

    private String source;

    private Date wgTime;

    private String wgType;

    private String wgRemark;

    private String wgPhotoUrl;

    private String paperType;

    private String paperNo;

    private String customerName;

    private String ticketId;

    private String ticketNo;

    private String planId;

    private String planCode;

    private String eventId;

    private String isConfirm;

    private Date confirmTime;

    private String confirmOpr;

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

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public Date getWgTime() {
        return wgTime;
    }

    public void setWgTime(Date wgTime) {
        this.wgTime = wgTime;
    }

    public String getWgType() {
        return wgType;
    }

    public void setWgType(String wgType) {
        this.wgType = wgType == null ? null : wgType.trim();
    }

    public String getWgRemark() {
        return wgRemark;
    }

    public void setWgRemark(String wgRemark) {
        this.wgRemark = wgRemark == null ? null : wgRemark.trim();
    }

    public String getWgPhotoUrl() {
        return wgPhotoUrl;
    }

    public void setWgPhotoUrl(String wgPhotoUrl) {
        this.wgPhotoUrl = wgPhotoUrl == null ? null : wgPhotoUrl.trim();
    }

    public String getPaperType() {
        return paperType;
    }

    public void setPaperType(String paperType) {
        this.paperType = paperType == null ? null : paperType.trim();
    }

    public String getPaperNo() {
        return paperNo;
    }

    public void setPaperNo(String paperNo) {
        this.paperNo = paperNo == null ? null : paperNo.trim();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId == null ? null : ticketId.trim();
    }

    public String getTicketNo() {
        return ticketNo;
    }

    public void setTicketNo(String ticketNo) {
        this.ticketNo = ticketNo == null ? null : ticketNo.trim();
    }

    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId == null ? null : planId.trim();
    }

    public String getPlanCode() {
        return planCode;
    }

    public void setPlanCode(String planCode) {
        this.planCode = planCode == null ? null : planCode.trim();
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId == null ? null : eventId.trim();
    }

    public String getIsConfirm() {
        return isConfirm;
    }

    public void setIsConfirm(String isConfirm) {
        this.isConfirm = isConfirm == null ? null : isConfirm.trim();
    }

    public Date getConfirmTime() {
        return confirmTime;
    }

    public void setConfirmTime(Date confirmTime) {
        this.confirmTime = confirmTime;
    }

    public String getConfirmOpr() {
        return confirmOpr;
    }

    public void setConfirmOpr(String confirmOpr) {
        this.confirmOpr = confirmOpr == null ? null : confirmOpr.trim();
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