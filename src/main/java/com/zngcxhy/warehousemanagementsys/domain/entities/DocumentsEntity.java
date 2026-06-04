package com.zngcxhy.warehousemanagementsys.domain.entities;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import java.util.ArrayList;
import java.util.HashMap;
import java.math.BigDecimal;
import java.util.UUID;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.util.List;
import java.util.Map;

import com.zngcxhy.warehousemanagementsys.domain.entities.*;
import com.zngcxhy.warehousemanagementsys.domain.structure.*;
import com.zngcxhy.warehousemanagementsys.domain.enumeration.*;
import com.zngcxhy.warehousemanagementsys.annotation.Label;
import com.zngcxhy.warehousemanagementsys.config.DateTimeFormatConfiguration;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
* auto generate DocumentsEntity entity
*
* @author sys
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)
public class DocumentsEntity {
    @Label("主键")
    @javax.validation.constraints.NotNull
    public Long id;
    @Label("创建时间")
    @JsonFormat(pattern=DateTimeFormatConfiguration.ZONED_DATETIME_FORMAT, timezone=DateTimeFormatConfiguration.DEFAULT_TIMEZONE)
    public java.time.ZonedDateTime createdTime;
    @Label("更新时间")
    @JsonFormat(pattern=DateTimeFormatConfiguration.ZONED_DATETIME_FORMAT, timezone=DateTimeFormatConfiguration.DEFAULT_TIMEZONE)
    public java.time.ZonedDateTime updatedTime;
    @Label("创建者")
    public String createdBy;
    @Label("更新者")
    public String updatedBy;
    @Label("销售方")
    @javax.validation.constraints.NotNull
    public Long sala;
    @Label("销售订单号")
    @javax.validation.constraints.NotNull
    public Long orderID;
    @Label("税率")
    @javax.validation.constraints.NotNull
    public Long tax_rate = 0L;
    @Label("价税合计")
    @javax.validation.constraints.NotNull
    public BigDecimal price_amout;
    @Label("付款方法")
    @javax.validation.constraints.NotNull
    public String pay;
    @Label("小计")
    @javax.validation.constraints.NotNull
    public BigDecimal xiaoji;
    @Label("购买方")
    @javax.validation.constraints.NotNull
    public String buyer;
    @Label("税费")
    @javax.validation.constraints.NotNull
    public BigDecimal suifri;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public java.time.ZonedDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(java.time.ZonedDateTime createdTime) {
        this.createdTime = createdTime;
    }

    public java.time.ZonedDateTime getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(java.time.ZonedDateTime updatedTime) {
        this.updatedTime = updatedTime;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Long getSala() {
        return sala;
    }

    public void setSala(Long sala) {
        this.sala = sala;
    }

    public Long getOrderID() {
        return orderID;
    }

    public void setOrderID(Long orderID) {
        this.orderID = orderID;
    }

    public Long getTax_rate() {
        return tax_rate;
    }

    public void setTax_rate(Long tax_rate) {
        this.tax_rate = tax_rate;
    }

    public BigDecimal getPrice_amout() {
        return price_amout;
    }

    public void setPrice_amout(BigDecimal price_amout) {
        this.price_amout = price_amout;
    }

    public String getPay() {
        return pay;
    }

    public void setPay(String pay) {
        this.pay = pay;
    }

    public BigDecimal getXiaoji() {
        return xiaoji;
    }

    public void setXiaoji(BigDecimal xiaoji) {
        this.xiaoji = xiaoji;
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public BigDecimal getSuifri() {
        return suifri;
    }

    public void setSuifri(BigDecimal suifri) {
        this.suifri = suifri;
    }

}