package com.tinklabs.common;

/**
 * @description:
 * @author: Landin
 * @date: 2019-01-15
 **/
public enum LocationCodeEnum {
    LOCATION_EXCEPTION("402001","system exception ,please see the log for exception details"),
    LOCALE_CODE_EMPTY("402002", "The localeCode can't be empty"),
    COUNTRY_CODE_EMPTY("402003", "The countryCode can't be empty");
    private String code;
    private String message;
    LocationCodeEnum(String code, String message){
        this.code = code;
        this.message = message;
    }
    public String getCode(){
        return code;
    }
    public String getMessage(){
        return message;
    }
}
