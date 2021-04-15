package com.cc.app.core.model;

import java.math.BigDecimal;
import java.util.Date;

public class PdPpInfo {
    private String id;

    private String planCode;

    private String workContent;

    private Integer property;

    private Integer workType;

    private String workTeamOid;

    private String workTeamOcode;

    private String workTeamOname;

    private Date planBeginDate;

    private Date planEndDate;

    private String workSiteNames;

    private Integer planType;

    private Integer working;

    private Integer planState;

    private Integer planSourceType;

    private String createUid;

    private String createUname;

    private Date createDate;

    private Integer planClassify;

    private Integer lightRemind;

    private String workMasterUid;

    private String workMasterUname;

    private String workMemberUnames;

    private Date realBeginDate;

    private Date realEndDate;

    private String completionCondition;

    private Integer voltageLevel;

    private Integer workDay;

    private Integer speciality;

    private Integer workHour;

    private Integer planBeginWeek;

    private Integer isExteriorDept;

    private Integer personnelCount;

    private String workDeptOid;

    private String workDeptOname;

    private Integer isBequeathQuestion;

    private String monitorOpinion;

    private String affirmUid;

    private String affirmUname;

    private Date affirmDate;

    private String advertProceeding;

    private Integer workSmallType;

    private Integer executionBackFlag;

    private Integer isDealDefect;

    private Date currentExperimentDate;

    private Integer riskLevel;

    private BigDecimal riskValue;

    private Integer patrolClassify;

    private Integer patrolObjectSelectType;

    private String dispatchWorkUid;

    private String dispatchWorkUname;

    private Integer downloadState;

    private Integer isSendNoteMaster;

    private Integer isSendNoteMember;

    private String planRemark;

    private Integer powerGridFlag;

    private String exteriorDeptName;

    private String bequeathQuestion;

    private Integer optimisticLockVersion;

    private Date updateTime;

    private String dataFrom;

    private String bureauCode;

    private String provinceCode;

    private Integer flowState;

    private String processInsId;

    private Integer isNeedOutageApply;

    private Integer isAeronefPatrolCooperate;

    private Integer notRelTaskform;

    private Integer relTaskFormType;

    private Integer isGriddingPatrol;

    private Integer isUavPatrol;

    private Integer implementMode;

    private Integer isCableChannelPatrol;

    private Integer patrolMode;

    private Integer workSourceType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPlanCode() {
        return planCode;
    }

    public void setPlanCode(String planCode) {
        this.planCode = planCode == null ? null : planCode.trim();
    }

    public String getWorkContent() {
        return workContent;
    }

    public void setWorkContent(String workContent) {
        this.workContent = workContent == null ? null : workContent.trim();
    }

    public Integer getProperty() {
        return property;
    }

    public void setProperty(Integer property) {
        this.property = property;
    }

    public Integer getWorkType() {
        return workType;
    }

    public void setWorkType(Integer workType) {
        this.workType = workType;
    }

    public String getWorkTeamOid() {
        return workTeamOid;
    }

    public void setWorkTeamOid(String workTeamOid) {
        this.workTeamOid = workTeamOid == null ? null : workTeamOid.trim();
    }

    public String getWorkTeamOcode() {
        return workTeamOcode;
    }

    public void setWorkTeamOcode(String workTeamOcode) {
        this.workTeamOcode = workTeamOcode == null ? null : workTeamOcode.trim();
    }

    public String getWorkTeamOname() {
        return workTeamOname;
    }

    public void setWorkTeamOname(String workTeamOname) {
        this.workTeamOname = workTeamOname == null ? null : workTeamOname.trim();
    }

    public Date getPlanBeginDate() {
        return planBeginDate;
    }

    public void setPlanBeginDate(Date planBeginDate) {
        this.planBeginDate = planBeginDate;
    }

    public Date getPlanEndDate() {
        return planEndDate;
    }

    public void setPlanEndDate(Date planEndDate) {
        this.planEndDate = planEndDate;
    }

    public String getWorkSiteNames() {
        return workSiteNames;
    }

    public void setWorkSiteNames(String workSiteNames) {
        this.workSiteNames = workSiteNames == null ? null : workSiteNames.trim();
    }

    public Integer getPlanType() {
        return planType;
    }

    public void setPlanType(Integer planType) {
        this.planType = planType;
    }

    public Integer getWorking() {
        return working;
    }

    public void setWorking(Integer working) {
        this.working = working;
    }

    public Integer getPlanState() {
        return planState;
    }

    public void setPlanState(Integer planState) {
        this.planState = planState;
    }

    public Integer getPlanSourceType() {
        return planSourceType;
    }

    public void setPlanSourceType(Integer planSourceType) {
        this.planSourceType = planSourceType;
    }

    public String getCreateUid() {
        return createUid;
    }

    public void setCreateUid(String createUid) {
        this.createUid = createUid == null ? null : createUid.trim();
    }

    public String getCreateUname() {
        return createUname;
    }

    public void setCreateUname(String createUname) {
        this.createUname = createUname == null ? null : createUname.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getPlanClassify() {
        return planClassify;
    }

    public void setPlanClassify(Integer planClassify) {
        this.planClassify = planClassify;
    }

    public Integer getLightRemind() {
        return lightRemind;
    }

    public void setLightRemind(Integer lightRemind) {
        this.lightRemind = lightRemind;
    }

    public String getWorkMasterUid() {
        return workMasterUid;
    }

    public void setWorkMasterUid(String workMasterUid) {
        this.workMasterUid = workMasterUid == null ? null : workMasterUid.trim();
    }

    public String getWorkMasterUname() {
        return workMasterUname;
    }

    public void setWorkMasterUname(String workMasterUname) {
        this.workMasterUname = workMasterUname == null ? null : workMasterUname.trim();
    }

    public String getWorkMemberUnames() {
        return workMemberUnames;
    }

    public void setWorkMemberUnames(String workMemberUnames) {
        this.workMemberUnames = workMemberUnames == null ? null : workMemberUnames.trim();
    }

    public Date getRealBeginDate() {
        return realBeginDate;
    }

    public void setRealBeginDate(Date realBeginDate) {
        this.realBeginDate = realBeginDate;
    }

    public Date getRealEndDate() {
        return realEndDate;
    }

    public void setRealEndDate(Date realEndDate) {
        this.realEndDate = realEndDate;
    }

    public String getCompletionCondition() {
        return completionCondition;
    }

    public void setCompletionCondition(String completionCondition) {
        this.completionCondition = completionCondition == null ? null : completionCondition.trim();
    }

    public Integer getVoltageLevel() {
        return voltageLevel;
    }

    public void setVoltageLevel(Integer voltageLevel) {
        this.voltageLevel = voltageLevel;
    }

    public Integer getWorkDay() {
        return workDay;
    }

    public void setWorkDay(Integer workDay) {
        this.workDay = workDay;
    }

    public Integer getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Integer speciality) {
        this.speciality = speciality;
    }

    public Integer getWorkHour() {
        return workHour;
    }

    public void setWorkHour(Integer workHour) {
        this.workHour = workHour;
    }

    public Integer getPlanBeginWeek() {
        return planBeginWeek;
    }

    public void setPlanBeginWeek(Integer planBeginWeek) {
        this.planBeginWeek = planBeginWeek;
    }

    public Integer getIsExteriorDept() {
        return isExteriorDept;
    }

    public void setIsExteriorDept(Integer isExteriorDept) {
        this.isExteriorDept = isExteriorDept;
    }

    public Integer getPersonnelCount() {
        return personnelCount;
    }

    public void setPersonnelCount(Integer personnelCount) {
        this.personnelCount = personnelCount;
    }

    public String getWorkDeptOid() {
        return workDeptOid;
    }

    public void setWorkDeptOid(String workDeptOid) {
        this.workDeptOid = workDeptOid == null ? null : workDeptOid.trim();
    }

    public String getWorkDeptOname() {
        return workDeptOname;
    }

    public void setWorkDeptOname(String workDeptOname) {
        this.workDeptOname = workDeptOname == null ? null : workDeptOname.trim();
    }

    public Integer getIsBequeathQuestion() {
        return isBequeathQuestion;
    }

    public void setIsBequeathQuestion(Integer isBequeathQuestion) {
        this.isBequeathQuestion = isBequeathQuestion;
    }

    public String getMonitorOpinion() {
        return monitorOpinion;
    }

    public void setMonitorOpinion(String monitorOpinion) {
        this.monitorOpinion = monitorOpinion == null ? null : monitorOpinion.trim();
    }

    public String getAffirmUid() {
        return affirmUid;
    }

    public void setAffirmUid(String affirmUid) {
        this.affirmUid = affirmUid == null ? null : affirmUid.trim();
    }

    public String getAffirmUname() {
        return affirmUname;
    }

    public void setAffirmUname(String affirmUname) {
        this.affirmUname = affirmUname == null ? null : affirmUname.trim();
    }

    public Date getAffirmDate() {
        return affirmDate;
    }

    public void setAffirmDate(Date affirmDate) {
        this.affirmDate = affirmDate;
    }

    public String getAdvertProceeding() {
        return advertProceeding;
    }

    public void setAdvertProceeding(String advertProceeding) {
        this.advertProceeding = advertProceeding == null ? null : advertProceeding.trim();
    }

    public Integer getWorkSmallType() {
        return workSmallType;
    }

    public void setWorkSmallType(Integer workSmallType) {
        this.workSmallType = workSmallType;
    }

    public Integer getExecutionBackFlag() {
        return executionBackFlag;
    }

    public void setExecutionBackFlag(Integer executionBackFlag) {
        this.executionBackFlag = executionBackFlag;
    }

    public Integer getIsDealDefect() {
        return isDealDefect;
    }

    public void setIsDealDefect(Integer isDealDefect) {
        this.isDealDefect = isDealDefect;
    }

    public Date getCurrentExperimentDate() {
        return currentExperimentDate;
    }

    public void setCurrentExperimentDate(Date currentExperimentDate) {
        this.currentExperimentDate = currentExperimentDate;
    }

    public Integer getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(Integer riskLevel) {
        this.riskLevel = riskLevel;
    }

    public BigDecimal getRiskValue() {
        return riskValue;
    }

    public void setRiskValue(BigDecimal riskValue) {
        this.riskValue = riskValue;
    }

    public Integer getPatrolClassify() {
        return patrolClassify;
    }

    public void setPatrolClassify(Integer patrolClassify) {
        this.patrolClassify = patrolClassify;
    }

    public Integer getPatrolObjectSelectType() {
        return patrolObjectSelectType;
    }

    public void setPatrolObjectSelectType(Integer patrolObjectSelectType) {
        this.patrolObjectSelectType = patrolObjectSelectType;
    }

    public String getDispatchWorkUid() {
        return dispatchWorkUid;
    }

    public void setDispatchWorkUid(String dispatchWorkUid) {
        this.dispatchWorkUid = dispatchWorkUid == null ? null : dispatchWorkUid.trim();
    }

    public String getDispatchWorkUname() {
        return dispatchWorkUname;
    }

    public void setDispatchWorkUname(String dispatchWorkUname) {
        this.dispatchWorkUname = dispatchWorkUname == null ? null : dispatchWorkUname.trim();
    }

    public Integer getDownloadState() {
        return downloadState;
    }

    public void setDownloadState(Integer downloadState) {
        this.downloadState = downloadState;
    }

    public Integer getIsSendNoteMaster() {
        return isSendNoteMaster;
    }

    public void setIsSendNoteMaster(Integer isSendNoteMaster) {
        this.isSendNoteMaster = isSendNoteMaster;
    }

    public Integer getIsSendNoteMember() {
        return isSendNoteMember;
    }

    public void setIsSendNoteMember(Integer isSendNoteMember) {
        this.isSendNoteMember = isSendNoteMember;
    }

    public String getPlanRemark() {
        return planRemark;
    }

    public void setPlanRemark(String planRemark) {
        this.planRemark = planRemark == null ? null : planRemark.trim();
    }

    public Integer getPowerGridFlag() {
        return powerGridFlag;
    }

    public void setPowerGridFlag(Integer powerGridFlag) {
        this.powerGridFlag = powerGridFlag;
    }

    public String getExteriorDeptName() {
        return exteriorDeptName;
    }

    public void setExteriorDeptName(String exteriorDeptName) {
        this.exteriorDeptName = exteriorDeptName == null ? null : exteriorDeptName.trim();
    }

    public String getBequeathQuestion() {
        return bequeathQuestion;
    }

    public void setBequeathQuestion(String bequeathQuestion) {
        this.bequeathQuestion = bequeathQuestion == null ? null : bequeathQuestion.trim();
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

    public Integer getFlowState() {
        return flowState;
    }

    public void setFlowState(Integer flowState) {
        this.flowState = flowState;
    }

    public String getProcessInsId() {
        return processInsId;
    }

    public void setProcessInsId(String processInsId) {
        this.processInsId = processInsId == null ? null : processInsId.trim();
    }

    public Integer getIsNeedOutageApply() {
        return isNeedOutageApply;
    }

    public void setIsNeedOutageApply(Integer isNeedOutageApply) {
        this.isNeedOutageApply = isNeedOutageApply;
    }

    public Integer getIsAeronefPatrolCooperate() {
        return isAeronefPatrolCooperate;
    }

    public void setIsAeronefPatrolCooperate(Integer isAeronefPatrolCooperate) {
        this.isAeronefPatrolCooperate = isAeronefPatrolCooperate;
    }

    public Integer getNotRelTaskform() {
        return notRelTaskform;
    }

    public void setNotRelTaskform(Integer notRelTaskform) {
        this.notRelTaskform = notRelTaskform;
    }

    public Integer getRelTaskFormType() {
        return relTaskFormType;
    }

    public void setRelTaskFormType(Integer relTaskFormType) {
        this.relTaskFormType = relTaskFormType;
    }

    public Integer getIsGriddingPatrol() {
        return isGriddingPatrol;
    }

    public void setIsGriddingPatrol(Integer isGriddingPatrol) {
        this.isGriddingPatrol = isGriddingPatrol;
    }

    public Integer getIsUavPatrol() {
        return isUavPatrol;
    }

    public void setIsUavPatrol(Integer isUavPatrol) {
        this.isUavPatrol = isUavPatrol;
    }

    public Integer getImplementMode() {
        return implementMode;
    }

    public void setImplementMode(Integer implementMode) {
        this.implementMode = implementMode;
    }

    public Integer getIsCableChannelPatrol() {
        return isCableChannelPatrol;
    }

    public void setIsCableChannelPatrol(Integer isCableChannelPatrol) {
        this.isCableChannelPatrol = isCableChannelPatrol;
    }

    public Integer getPatrolMode() {
        return patrolMode;
    }

    public void setPatrolMode(Integer patrolMode) {
        this.patrolMode = patrolMode;
    }

    public Integer getWorkSourceType() {
        return workSourceType;
    }

    public void setWorkSourceType(Integer workSourceType) {
        this.workSourceType = workSourceType;
    }
}