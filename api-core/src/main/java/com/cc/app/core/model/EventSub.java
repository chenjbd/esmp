package com.cc.app.core.model;

import java.util.Date;

public class EventSub {
    private String eventId;

    private String eventType;

    private String eventName;

    private String eventDest;

    private String subType;

    private String eventLvl;

    private Date crtTime;

    private String crtOpr;

    private Date lstTime;

    private String lstOpr;

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId == null ? null : eventId.trim();
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType == null ? null : eventType.trim();
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName == null ? null : eventName.trim();
    }

    public String getEventDest() {
        return eventDest;
    }

    public void setEventDest(String eventDest) {
        this.eventDest = eventDest == null ? null : eventDest.trim();
    }

    public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        this.subType = subType == null ? null : subType.trim();
    }

    public String getEventLvl() {
        return eventLvl;
    }

    public void setEventLvl(String eventLvl) {
        this.eventLvl = eventLvl == null ? null : eventLvl.trim();
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