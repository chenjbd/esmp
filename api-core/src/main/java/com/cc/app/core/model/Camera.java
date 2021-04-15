package com.cc.app.core.model;

import java.math.BigDecimal;
import java.util.Date;

public class Camera {
    private String indexCode;

    private String resourceType;

    private String externalIndexCode;

    private String name;

    private Integer chanNum;

    private String cascadeCode;

    private String parentIndexCode;

    private BigDecimal longitude;

    private BigDecimal latitude;

    private String elevation;

    private Integer cameraType;

    private String capability;

    private String recordLocation;

    private String channelType;

    private String regionIndexCode;

    private Integer transType;

    private String treatyType;

    private String installLocation;

    private Date createTime;

    private Date updateTime;

    private Integer status;

    private Integer disOrder;

    public String getIndexCode() {
        return indexCode;
    }

    public void setIndexCode(String indexCode) {
        this.indexCode = indexCode == null ? null : indexCode.trim();
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType == null ? null : resourceType.trim();
    }

    public String getExternalIndexCode() {
        return externalIndexCode;
    }

    public void setExternalIndexCode(String externalIndexCode) {
        this.externalIndexCode = externalIndexCode == null ? null : externalIndexCode.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getChanNum() {
        return chanNum;
    }

    public void setChanNum(Integer chanNum) {
        this.chanNum = chanNum;
    }

    public String getCascadeCode() {
        return cascadeCode;
    }

    public void setCascadeCode(String cascadeCode) {
        this.cascadeCode = cascadeCode == null ? null : cascadeCode.trim();
    }

    public String getParentIndexCode() {
        return parentIndexCode;
    }

    public void setParentIndexCode(String parentIndexCode) {
        this.parentIndexCode = parentIndexCode == null ? null : parentIndexCode.trim();
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public String getElevation() {
        return elevation;
    }

    public void setElevation(String elevation) {
        this.elevation = elevation == null ? null : elevation.trim();
    }

    public Integer getCameraType() {
        return cameraType;
    }

    public void setCameraType(Integer cameraType) {
        this.cameraType = cameraType;
    }

    public String getCapability() {
        return capability;
    }

    public void setCapability(String capability) {
        this.capability = capability == null ? null : capability.trim();
    }

    public String getRecordLocation() {
        return recordLocation;
    }

    public void setRecordLocation(String recordLocation) {
        this.recordLocation = recordLocation == null ? null : recordLocation.trim();
    }

    public String getChannelType() {
        return channelType;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType == null ? null : channelType.trim();
    }

    public String getRegionIndexCode() {
        return regionIndexCode;
    }

    public void setRegionIndexCode(String regionIndexCode) {
        this.regionIndexCode = regionIndexCode == null ? null : regionIndexCode.trim();
    }

    public Integer getTransType() {
        return transType;
    }

    public void setTransType(Integer transType) {
        this.transType = transType;
    }

    public String getTreatyType() {
        return treatyType;
    }

    public void setTreatyType(String treatyType) {
        this.treatyType = treatyType == null ? null : treatyType.trim();
    }

    public String getInstallLocation() {
        return installLocation;
    }

    public void setInstallLocation(String installLocation) {
        this.installLocation = installLocation == null ? null : installLocation.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getDisOrder() {
        return disOrder;
    }

    public void setDisOrder(Integer disOrder) {
        this.disOrder = disOrder;
    }
}