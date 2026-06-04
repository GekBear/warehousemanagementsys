package com.zngcxhy.warehousemanagementsys.domain.enumeration;

import com.zngcxhy.warehousemanagementsys.domain.enumeration.BaseEnum;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonValue;

/**
* auto generate AfterstatusEnum enum
*
* @author sys
*/
public enum AfterstatusEnum implements BaseEnum<AfterstatusEnum, String> {
    FIELD_0("0", "无售后"),
    FIELD_1("1", "有售后"),
    ;
    public final String code;
    public final String desc;

    AfterstatusEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    @JsonValue
    public String getJsonValue(){
        return this.code;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getDesc() {
        return desc;
    }

}