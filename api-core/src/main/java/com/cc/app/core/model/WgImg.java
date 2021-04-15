package com.cc.app.core.model;

import java.util.Date;

public class WgImg {
    private String id;

    private String busiId;

    private String imgUrl;

    private Date crtTime;

    private Integer seqno;

    private String isOut;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getBusiId() {
        return busiId;
    }

    public void setBusiId(String busiId) {
        this.busiId = busiId == null ? null : busiId.trim();
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    public Date getCrtTime() {
        return crtTime;
    }

    public void setCrtTime(Date crtTime) {
        this.crtTime = crtTime;
    }

    public Integer getSeqno() {
        return seqno;
    }

    public void setSeqno(Integer seqno) {
        this.seqno = seqno;
    }

    public String getIsOut() {
        return isOut;
    }

    public void setIsOut(String isOut) {
        this.isOut = isOut == null ? null : isOut.trim();
    }
}