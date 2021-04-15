package com.cc.app.core.controller;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/artemis")
public class HikTestController {
    private final static Logger logger = LoggerFactory.getLogger(HikTestController.class);

    @PostMapping("/api/resource/v1/camera/timeRange")
    public Object timeRange(@RequestBody Map<String, Object> map) {
        logger.info("timeRange：{}", JSONObject.toJSONString(map));
        String result = "{" +
                "    \"code\": \"0\"," +
                "    \"msg\": \"SUCCESS\"," +
                "    \"data\": {" +
                "        \"total\": 9," +
                "        \"list\": [" +
                "            {" +
                "                \"indexCode\": \"df8w8cr800283c24c\"," +
                "                \"resourceType\": \"camera\"," +
                "                \"externalIndexCode\": \"gb1231341\"," +
                "                \"name\": \"资源1\"," +
                "                \"chanNum\": 1," +
                "                \"cascadeCode\": \"8w8cy82c084y0289c3\"," +
                "                \"parentIndexCode\": \"80d9099q9e991231\"," +
                "                \"longitude\": 55.55555555," +
                "                \"latitude\": 33.33333333," +
                "                \"elevation\": \"12\"," +
                "                \"cameraType\": 1," +
                "                \"capability\": \"vss\"," +
                "                \"recordLocation\": \"12\"," +
                "                \"channelType\": \"analog\"," +
                "                \"regionIndexCode\": \"d8a5476e-25c0-4aa2-b7e3-db3788ba1f77\"," +
                "                \"transType\": 0," +
                "                \"treatyType\": \"hiksdk_net\"," +
                "                \"installLocation\": \"vault\"," +
                "                \"createTime\": \"2018-11-28T16:47:27.358+08:00\"," +
                "                \"updateTime\": \"2018-11-28T16:48:34.011+08:00\"," +
                "                \"status\": 0," +
                "                \"disOrder\": 123" +
                "            }" +
                "        ]" +
                "    }" +
                "}";
        return result;
    }
}