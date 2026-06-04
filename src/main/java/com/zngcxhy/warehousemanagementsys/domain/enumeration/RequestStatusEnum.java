package com.zngcxhy.warehousemanagementsys.domain.enumeration;

import com.zngcxhy.warehousemanagementsys.domain.enumeration.BaseEnum;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonValue;

/**
* auto generate RequestStatusEnum enum
*
* @author sys
*/
public enum RequestStatusEnum implements BaseEnum<RequestStatusEnum, String> {
    FIELD_0("0", "待处理"),
    FIELD_1("1", "处理中"),
    FIELD_2("2", "已完成"),
    ;
    public final String code;
    public final String desc;

    RequestStatusEnum(String code, String desc) {
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