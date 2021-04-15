package com.cc.app.core.controller;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.util.Map;

@RestController
@RequestMapping("/test/Team")
public class TestController {
    private final static Logger logger = LoggerFactory.getLogger(TestController.class);

    @PostMapping("/qyeryWorkPlanByTime")
    public Object qyeryWorkPlanByTime(@RequestBody Map<String, Object> map) throws UnsupportedEncodingException {
        logger.info("qyeryWorkPlanByTime：{}", JSONObject.toJSONString(map));
        String result = "[{\"id\":\"1f183f3ac64d460bad108c1069f08afa\", \"planCode\":\"JH20151101000018\", \"workContent\":\"110kV安宁变电站第二次日常巡检\",\"property\":1,\"workType\":3,\"workTeamOid\":\"1AB92FB5B6021481E05337050A0A024D\",\"workTeamOcode\":\"05013310\",\"workTeamOname\":\"500kV草铺巡维中心\",\"planBeginDate\":1614140902000,\"planEndDate\":1614140902000,\"workSiteNames\":\"110kV安宁变电站\",\"planType\":2,\"working\":2,\"planState\":70,\"planSourceType\":1,\"createUid\":\"00023288\",\"createUname\":\"母钧丞\",\"createDate\":1614847306433,\"planClassify\":1,\"lightRemind\":10,\"workMasterUid\":\"1A82AF81504A612DE05337050A0A5922\",\"workMasterUname\":\"苏航\",\"workMemberUnames\":\"耿齐朋\",\"realBeginDate\":1448154600000,\"realEndDate\":1448190660000,\"completionCondition\":\"11月第二次巡检： 1、全站一二次设备巡视检查 2、一二次设备红外测温 3、草铺扩：二次设备Ⅱ级防拒动管控设备、通信直流设备、监控告警信号、直流系统、户外开关机构箱/汇控箱/端子箱特巡 4、全站开关场蜘蛛网清理保护屏、端子箱、机构箱、汇控柜灰尘清扫\\\" 5、微机打印纸检查、微机保护及自动装置校时 6、变电注油设备检查 7、行波测距装置检查 8、全站应急事故照明巡视检查 9、全站普通照明检查并更换损坏灯具 10、微机五防系统维护检查 11、防小动物检查 12、全站建筑物与构筑物检查（含通讯机房） 13、全站通风设施检查 14、调度电话录音系统、办公设备、站内应急电话检查 15、备品备件检查 16、后台信号检查、“四遥量”核对 17、全站标识、划线检查 18、主控室桌面、电脑键盘及屏幕清洁整理（并关闭电脑显示器） 19、通信机房、变电站内OPGW、ADSS光缆检查 20、保安值勤情况检查，保卫人员的用电及生活安全检查 21、重点管控设备：110kV2号主变特巡、特级保供电用户35kV 501Ⅰ、Ⅱ回断路间隔特巡测温。\",\"voltageLevel\":110000,\"workDay\":1,\"speciality\":10,\"workHour\":9,\"planBeginWeek\":7,\"isExteriorDept\":2,\"personnelCount\":2,\"workDeptOid\":\"1AB92FB59A6D1481E05337050A0A024D\",\"workDeptOname\":\"变电管理二所\",\"isBequeathQuestion\":1,\"monitorOpinion\":\"优\",\"affirmUid\":\"1A82AF81504A612DE05337050A0A5922\",\"affirmUname\":\"苏航\",\"affirmDate\":1448190780000,\"workSmallType\":101,\"executionBackFlag\":1,\"isDealDefect\":2,\"riskLevel\":5,\"riskValue\":0,\"patrolClassify\":1,\"patrolObjectSelectType\":1,\"dispatchWorkUid\":\"1A82AF8150E1612DE05337050A0A5922\",\"dispatchWorkUname\":\"陈超\",\"downloadState\":1,\"isSendNoteMaster\":0,\"isSendNoteMember\":0,\"powerGridFlag\":1,\"bequeathQuestion\":\"10kV高压室220V插座空开1跳闸，断路无法给上。\",\"optimisticLockVersion\":5,\"updateTime\":1614140902000,\"dataFrom\":\"05013303\",\"bureauCode\":\"0501\",\"provinceCode\":\"05\",\"flowState\":2,\"processInsId\":\"73d5988dc1254915bd36a625e50aa6d7_102\",\"isNeedOutageApply\":1,\"isAeronefPatrolCooperate\":2,\"relTaskFormType\":1,\"isGriddingPatrol\":2,\"isUavPatrol\":0,\"implementMode\":0,\"isCableChannelPatrol\":0,\"patrolMode\":0,\"workSourceType\":0}]";
//        return JSONObject.parseArray(result);
        return result;
    }
    @PostMapping("/queryWticketByTime")
    public Object queryWticketByTime(@RequestBody Map<String, Object> map) {
        logger.info("queryWticketByTime：{}", JSONObject.toJSONString(map));
        String result = "[{\"id\":\"00924f0047fe4d1db64b8adf73fb6014\",\"ticketType\":22,\"workState\":11,\"workPrincipalUid\":\"7C3970B83B284A87BE57244A2B790604\",\"departmentOid\":\"1AB92FB5B0281481E05337050A0A024D\",\"planStartTime\":1459384236000,\"planEndTime\":1459418436000,\"createTime\":1459324296000,\"flowState\":0,\"workMemberCount\":1,\"whetherOuterDept\":1,\"isCommunicationTicket\":2,\"secondbillCount\":0,\"isExitSwitch\":2,\"whetherSecondbill\":2,\"whetherGuardianSign\":2,\"createOid\":\"1AB92FB5B0281481E05337050A0A024D\",\"createUid\":\"7C3970B83B284A87BE57244A2B790604\",\"departmentOname\":\"云南网能建设工程有限公司\",\"optimisticLockVersion\":0,\"updateTime\":1614141096000,\"dataFrom\":\"EX03zF\",\"bureauCode\":\"0501\",\"provinceCode\":\"05\",\"powerGridFlag\":1,\"outOrIn\":1,\"workMemberUname\":\"田建华、李小柱、李启能、刘国群、郭仁志、张吉强、刘宣祥、杨红军\",\"workPrincipalUname\":\"测试0\",\"ticketSignUname\":\"测试1\",\"watchUname\":\"测试2\",\"workPermissionUname\":\"测试3\",\"workEndPermissionUname\":\"测试4\",\"ticketCounterSignUname\":\"测试5\",\"ticketReceiveUname\":\"测试6\"}]";
        return result;
    }
    @PostMapping("/queryWticketReByTime")
    public Object queryWticketReByTime(@RequestBody Map<String, Object> map) {
        logger.info("queryWticketReByTime：{}", JSONObject.toJSONString(map));
        String result = "[{\"id\":\"601eccb06d244448b702113559109e23\",\"wticketId\":\"4d4bc878c3a641b3a4d9e195d45047e7\",\"ticketType\":11,\"optimisticLockVersion\":0,\"updateTime\":1614141073000,\"dataFrom\":\"05013412\",\"bureauCode\":\"0501\",\"provinceCode\":\"05\",\"businessId\":\"d25cdd4afb5b433094b95875ea9c5c4b\",\"businessType\":\"plan\",\"businessName\":\"JH20160629003933\"}]";
        return result;
    }
}