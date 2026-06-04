package com.zngcxhy.warehousemanagementsys.domain.enumeration;

import com.zngcxhy.warehousemanagementsys.domain.enumeration.BaseEnum;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonValue;

/**
* auto generate ContractStatusEnum enum
*
* @author sys
*/
public enum ContractStatusEnum implements BaseEnum<ContractStatusEnum, String> {
    FIELD_0("0", "未上传"),
    FIELD_1("1", "已上传"),
    ;
    public final String code;
    public final String desc;

    ContractStatusEnum(String code, String desc) {
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