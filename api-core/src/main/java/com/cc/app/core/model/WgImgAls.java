package com.cc.app.core.model;

import java.util.Date;

public class WgImgAls {
    private String id;

    private String busiId;

    private String imageId;

    private Date crtTime;

    private Integer similarity;

    private String indexCode;

    private String faceName;

    private String faceSex;

    private String certificateType;

    private String certificateNum;

    private String faceUrl;

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

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId == null ? null : imageId.trim();
    }

    public Date getCrtTime() {
        return crtTime;
    }

    public void setCrtTime(Date crtTime) {
        this.crtTime = crtTime;
    }

    public Integer getSimilarity() {
        return similarity;
    }

    public void setSimilarity(Integer similarity) {
        this.similarity = similarity;
    }

    public String getIndexCode() {
        return indexCode;
    }

    public void setIndexCode(String indexCode) {
        this.indexCode = indexCode == null ? null : indexCode.trim();
    }

    public String getFaceName() {
        return faceName;
    }

    public void setFaceName(String faceName) {
        this.faceName = faceName == null ? null : faceName.trim();
    }

    public String getFaceSex() {
        return faceSex;
    }

    public void setFaceSex(String faceSex) {
        this.faceSex = faceSex == null ? null : faceSex.trim();
    }

    public String getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(String certificateType) {
        this.certificateType = certificateType == null ? null : certificateType.trim();
    }

    public String getCertificateNum() {
        return certificateNum;
    }

    public void setCertificateNum(String certificateNum) {
        this.certificateNum = certificateNum == null ? null : certificateNum.trim();
    }

    public String getFaceUrl() {
        return faceUrl;
    }

    public void setFaceUrl(String faceUrl) {
        this.faceUrl = faceUrl == null ? null : faceUrl.trim();
    }
}