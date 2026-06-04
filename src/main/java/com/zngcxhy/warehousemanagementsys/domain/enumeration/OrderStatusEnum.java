package com.zngcxhy.warehousemanagementsys.domain.enumeration;

import com.zngcxhy.warehousemanagementsys.domain.enumeration.BaseEnum;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonValue;

/**
* auto generate OrderStatusEnum enum
*
* @author sys
*/
public enum OrderStatusEnum implements BaseEnum<OrderStatusEnum, String> {
    FIELD_0("0", "待审批"),
    FIELD_1("1", "已批准"),
    FIELD_2("2", "已发货"),
    FIELD_3("3", "已收货"),
    FIELD_4("4", "已驳回"),
    ;
    public final String code;
    public final String desc;

    OrderStatusEnum(String code, String desc) {
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