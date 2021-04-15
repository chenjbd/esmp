package com.cc.app.core.model;

import java.util.Date;

public class PdWticketBase {
    private String id;

    private Integer ticketType;

    private Integer workState;

    private String workPrincipalUid;

    private String ticketReceiveUid;

    private String ticketSignUid;

    private String workPermissionUid;

    private String workEndPermissionUid;

    private String watchUid;

    private String ticketEndWatchUid;

    private String departmentOid;

    private Date planStartTime;

    private Date planEndTime;

    private Date receiveTime;

    private Date permissionTime;

    private Date workEndTime;

    private Date ticketEndTime;

    private Date createTime;

    private Integer flowState;

    private Integer workMemberCount;

    private Integer whetherOuterDept;

    private Integer isCommunicationTicket;

    private Integer secondbillCount;

    private Integer isExitSwitch;

    private Integer whetherSecondbill;

    private Integer whetherQualified;

    private Integer whetherNomative;

    private Integer qualifiedState;

    private Integer whetherGuardianSign;

    private String guardianUid;

    private String workPrincipalTel;

    private String ticketNo;

    private String createOid;

    private String createUid;

    private String processInsId;

    private String functionLocationId;

    private String functionLocationName;

    private String departmentOname;

    private Integer optimisticLockVersion;

    private Date updateTime;

    private String dataFrom;

    private String bureauCode;

    private String provinceCode;

    private String ticketCounterSignUid;

    private String workMemberUid;

    private String workMemberUname;

    private String workTask;

    private String workPlace;

    private Integer powerGridFlag;

    private Date ticketSignTime;

    private Date ticketCounterSignTime;

    private String functionName;

    private Integer permissionFlag;

    private String major;

    private Integer outOrIn;

    private String workPrincipalUname;

    private String ticketSignUname;

    private String watchUname;

    private String workPermissionUname;

    private String workEndPermissionUname;

    private String ticketCounterSignUname;

    private String ticketReceiveUname;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getTicketType() {
        return ticketType;
    }

    public void setTicketType(Integer ticketType) {
        this.ticketType = ticketType;
    }

    public Integer getWorkState() {
        return workState;
    }

    public void setWorkState(Integer workState) {
        this.workState = workState;
    }

    public String getWorkPrincipalUid() {
        return workPrincipalUid;
    }

    public void setWorkPrincipalUid(String workPrincipalUid) {
        this.workPrincipalUid = workPrincipalUid == null ? null : workPrincipalUid.trim();
    }

    public String getTicketReceiveUid() {
        return ticketReceiveUid;
    }

    public void setTicketReceiveUid(String ticketReceiveUid) {
        this.ticketReceiveUid = ticketReceiveUid == null ? null : ticketReceiveUid.trim();
    }

    public String getTicketSignUid() {
        return ticketSignUid;
    }

    public void setTicketSignUid(String ticketSignUid) {
        this.ticketSignUid = ticketSignUid == null ? null : ticketSignUid.trim();
    }

    public String getWorkPermissionUid() {
        return workPermissionUid;
    }

    public void setWorkPermissionUid(String workPermissionUid) {
        this.workPermissionUid = workPermissionUid == null ? null : workPermissionUid.trim();
    }

    public String getWorkEndPermissionUid() {
        return workEndPermissionUid;
    }

    public void setWorkEndPermissionUid(String workEndPermissionUid) {
        this.workEndPermissionUid = workEndPermissionUid == null ? null : workEndPermissionUid.trim();
    }

    public String getWatchUid() {
        return watchUid;
    }

    public void setWatchUid(String watchUid) {
        this.watchUid = watchUid == null ? null : watchUid.trim();
    }

    public String getTicketEndWatchUid() {
        return ticketEndWatchUid;
    }

    public void setTicketEndWatchUid(String ticketEndWatchUid) {
        this.ticketEndWatchUid = ticketEndWatchUid == null ? null : ticketEndWatchUid.trim();
    }

    public String getDepartmentOid() {
        return departmentOid;
    }

    public void setDepartmentOid(String departmentOid) {
        this.departmentOid = departmentOid == null ? null : departmentOid.trim();
    }

    public Date getPlanStartTime() {
        return planStartTime;
    }

    public void setPlanStartTime(Date planStartTime) {
        this.planStartTime = planStartTime;
    }

    public Date getPlanEndTime() {
        return planEndTime;
    }

    public void setPlanEndTime(Date planEndTime) {
        this.planEndTime = planEndTime;
    }

    public Date getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    public Date getPermissionTime() {
        return permissionTime;
    }

    public void setPermissionTime(Date permissionTime) {
        this.permissionTime = permissionTime;
    }

    public Date getWorkEndTime() {
        return workEndTime;
    }

    public void setWorkEndTime(Date workEndTime) {
        this.workEndTime = workEndTime;
    }

    public Date getTicketEndTime() {
        return ticketEndTime;
    }

    public void setTicketEndTime(Date ticketEndTime) {
        this.ticketEndTime = ticketEndTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getFlowState() {
        return flowState;
    }

    public void setFlowState(Integer flowState) {
        this.flowState = flowState;
    }

    public Integer getWorkMemberCount() {
        return workMemberCount;
    }

    public void setWorkMemberCount(Integer workMemberCount) {
        this.workMemberCount = workMemberCount;
    }

    public Integer getWhetherOuterDept() {
        return whetherOuterDept;
    }

    public void setWhetherOuterDept(Integer whetherOuterDept) {
        this.whetherOuterDept = whetherOuterDept;
    }

    public Integer getIsCommunicationTicket() {
        return isCommunicationTicket;
    }

    public void setIsCommunicationTicket(Integer isCommunicationTicket) {
        this.isCommunicationTicket = isCommunicationTicket;
    }

    public Integer getSecondbillCount() {
        return secondbillCount;
    }

    public void setSecondbillCount(Integer secondbillCount) {
        this.secondbillCount = secondbillCount;
    }

    public Integer getIsExitSwitch() {
        return isExitSwitch;
    }

    public void setIsExitSwitch(Integer isExitSwitch) {
        this.isExitSwitch = isExitSwitch;
    }

    public Integer getWhetherSecondbill() {
        return whetherSecondbill;
    }

    public void setWhetherSecondbill(Integer whetherSecondbill) {
        this.whetherSecondbill = whetherSecondbill;
    }

    public Integer getWhetherQualified() {
        return whetherQualified;
    }

    public void setWhetherQualified(Integer whetherQualified) {
        this.whetherQualified = whetherQualified;
    }

    public Integer getWhetherNomative() {
        return whetherNomative;
    }

    public void setWhetherNomative(Integer whetherNomative) {
        this.whetherNomative = whetherNomative;
    }

    public Integer getQualifiedState() {
        return qualifiedState;
    }

    public void setQualifiedState(Integer qualifiedState) {
        this.qualifiedState = qualifiedState;
    }

    public Integer getWhetherGuardianSign() {
        return whetherGuardianSign;
    }

    public void setWhetherGuardianSign(Integer whetherGuardianSign) {
        this.whetherGuardianSign = whetherGuardianSign;
    }

    public String getGuardianUid() {
        return guardianUid;
    }

    public void setGuardianUid(String guardianUid) {
        this.guardianUid = guardianUid == null ? null : guardianUid.trim();
    }

    public String getWorkPrincipalTel() {
        return workPrincipalTel;
    }

    public void setWorkPrincipalTel(String workPrincipalTel) {
        this.workPrincipalTel = workPrincipalTel == null ? null : workPrincipalTel.trim();
    }

    public String getTicketNo() {
        return ticketNo;
    }

    public void setTicketNo(String ticketNo) {
        this.ticketNo = ticketNo == null ? null : ticketNo.trim();
    }

    public String getCreateOid() {
        return createOid;
    }

    public void setCreateOid(String createOid) {
        this.createOid = createOid == null ? null : createOid.trim();
    }

    public String getCreateUid() {
        return createUid;
    }

    public void setCreateUid(String createUid) {
        this.createUid = createUid == null ? null : createUid.trim();
    }

    public String getProcessInsId() {
        return processInsId;
    }

    public void setProcessInsId(String processInsId) {
        this.processInsId = processInsId == null ? null : processInsId.trim();
    }

    public String getFunctionLocationId() {
        return functionLocationId;
    }

    public void setFunctionLocationId(String functionLocationId) {
        this.functionLocationId = functionLocationId == null ? null : functionLocationId.trim();
    }

    public String getFunctionLocationName() {
        return functionLocationName;
    }

    public void setFunctionLocationName(String functionLocationName) {
        this.functionLocationName = functionLocationName == null ? null : functionLocationName.trim();
    }

    public String getDepartmentOname() {
        return departmentOname;
    }

    public void setDepartmentOname(String departmentOname) {
        this.departmentOname = departmentOname == null ? null : departmentOname.trim();
    }

    public Integer getOptimisticLockVersion() {
        return optimisticLockVersion;
    }

    public void setOptimisticLockVersion(Integer optimisticLockVersion) {
        this.optimisticLockVersion = optimisticLockVersion;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getDataFrom() {
        return dataFrom;
    }

    public void setDataFrom(String dataFrom) {
        this.dataFrom = dataFrom == null ? null : dataFrom.trim();
    }

    public String getBureauCode() {
        return bureauCode;
    }

    public void setBureauCode(String bureauCode) {
        this.bureauCode = bureauCode == null ? null : bureauCode.trim();
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode == null ? null : provinceCode.trim();
    }

    public String getTicketCounterSignUid() {
        return ticketCounterSignUid;
    }

    public void setTicketCounterSignUid(String ticketCounterSignUid) {
        this.ticketCounterSignUid = ticketCounterSignUid == null ? null : ticketCounterSignUid.trim();
    }

    public String getWorkMemberUid() {
        return workMemberUid;
    }

    public void setWorkMemberUid(String workMemberUid) {
        this.workMemberUid = workMemberUid == null ? null : workMemberUid.trim();
    }

    public String getWorkMemberUname() {
        return workMemberUname;
    }

    public void setWorkMemberUname(String workMemberUname) {
        this.workMemberUname = workMemberUname == null ? null : workMemberUname.trim();
    }

    public String getWorkTask() {
        return workTask;
    }

    public void setWorkTask(String workTask) {
        this.workTask = workTask == null ? null : workTask.trim();
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace == null ? null : workPlace.trim();
    }

    public Integer getPowerGridFlag() {
        return powerGridFlag;
    }

    public void setPowerGridFlag(Integer powerGridFlag) {
        this.powerGridFlag = powerGridFlag;
    }

    public Date getTicketSignTime() {
        return ticketSignTime;
    }

    public void setTicketSignTime(Date ticketSignTime) {
        this.ticketSignTime = ticketSignTime;
    }

    public Date getTicketCounterSignTime() {
        return ticketCounterSignTime;
    }

    public void setTicketCounterSignTime(Date ticketCounterSignTime) {
        this.ticketCounterSignTime = ticketCounterSignTime;
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName == null ? null : functionName.trim();
    }

    public Integer getPermissionFlag() {
        return permissionFlag;
    }

    public void setPermissionFlag(Integer permissionFlag) {
        this.permissionFlag = permissionFlag;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public Integer getOutOrIn() {
        return outOrIn;
    }

    public void setOutOrIn(Integer outOrIn) {
        this.outOrIn = outOrIn;
    }

    public String getWorkPrincipalUname() {
        return workPrincipalUname;
    }

    public void setWorkPrincipalUname(String workPrincipalUname) {
        this.workPrincipalUname = workPrincipalUname == null ? null : workPrincipalUname.trim();
    }

    public String getTicketSignUname() {
        return ticketSignUname;
    }

    public void setTicketSignUname(String ticketSignUname) {
        this.ticketSignUname = ticketSignUname == null ? null : ticketSignUname.trim();
    }

    public String getWatchUname() {
        return watchUname;
    }

    public void setWatchUname(String watchUname) {
        this.watchUname = watchUname == null ? null : watchUname.trim();
    }

    public String getWorkPermissionUname() {
        return workPermissionUname;
    }

    public void setWorkPermissionUname(String workPermissionUname) {
        this.workPermissionUname = workPermissionUname == null ? null : workPermissionUname.trim();
    }

    public String getWorkEndPermissionUname() {
        return workEndPermissionUname;
    }

    public void setWorkEndPermissionUname(String workEndPermissionUname) {
        this.workEndPermissionUname = workEndPermissionUname == null ? null : workEndPermissionUname.trim();
    }

    public String getTicketCounterSignUname() {
        return ticketCounterSignUname;
    }

    public void setTicketCounterSignUname(String ticketCounterSignUname) {
        this.ticketCounterSignUname = ticketCounterSignUname == null ? null : ticketCounterSignUname.trim();
    }

    public String getTicketReceiveUname() {
        return ticketReceiveUname;
    }

    public void setTicketReceiveUname(String ticketReceiveUname) {
        this.ticketReceiveUname = ticketReceiveUname == null ? null : ticketReceiveUname.trim();
    }
}