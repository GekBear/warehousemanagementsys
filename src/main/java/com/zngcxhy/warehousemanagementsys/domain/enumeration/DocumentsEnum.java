package com.zngcxhy.warehousemanagementsys.domain.enumeration;

import com.zngcxhy.warehousemanagementsys.domain.enumeration.BaseEnum;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonValue;

/**
* auto generate DocumentsEnum enum
*
* @author sys
*/
public enum DocumentsEnum implements BaseEnum<DocumentsEnum, String> {
    FIELD_0("0", "未开发票"),
    FIELD_1("1", "已开发票"),
    ;
    public final String code;
    public final String desc;

    DocumentsEnum(String code, String desc) {
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