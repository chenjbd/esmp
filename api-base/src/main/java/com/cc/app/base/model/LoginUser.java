package com.cc.app.base.model;

import lombok.Data;

@Data
public class LoginUser {
    //登录ID
    private String loginId;
    //登录用户账号
    private String userNo;
    //登录用户所属机构编号
    private String orgNo;
}
