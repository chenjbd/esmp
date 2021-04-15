package com.cc.app.base.common;

public enum  HikPaperTypeEnum {

    HikPaperTypeEnum_111 ("0","111","身份证"),
    HikPaperTypeEnum_990 ("9","990","其它证件");

    private String code;
    private String hikCode;
    private String hikName;

    HikPaperTypeEnum(String code, String hikCode, String hikName) {
        this.code = code;
        this.hikCode = hikCode;
        this.hikName = hikName;
    }

    public static String get(String code){
        for(HikPaperTypeEnum item : HikPaperTypeEnum.values()){
            if(item.code.equals(code)){
                return item.hikCode;
            }
        }
        return null;
    }
}
