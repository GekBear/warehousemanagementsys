package com.zngcxhy.warehousemanagementsys.domain.enumeration;

public interface BaseEnum <E extends  Enum<E>, T>{
    T getCode();

    String getDesc();
}