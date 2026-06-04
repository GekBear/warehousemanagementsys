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
* auto generate PurchaseOrderEntity entity
*
* @author sys
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)
public class PurchaseOrderEntity {
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
    @Label("供应商ID")
    @javax.validation.constraints.NotNull
    public Long supplierID;
    @Label("预计交货日期")
    @javax.validation.constraints.NotNull
    @JsonFormat(pattern=DateTimeFormatConfiguration.LOCAL_DATE_FORMAT)
    public java.time.LocalDate expectedDeliveryDate;
    @Label("订单状态")
    @javax.validation.constraints.NotNull
    public OrderStatusEnum orderStatus = OrderStatusEnum.FIELD_0;
    @Label("供应商名称")
    @javax.validation.constraints.NotNull
    public String supplierName;
    @Label("经理意见")
    @javax.validation.constraints.NotNull
    public Long manager = 0L;
    @Label("供应商意见")
    @javax.validation.constraints.NotNull
    public Long supplier = 0L;
    @Label("驳回原因")
    public String no;
    @Label("供应商驳回原因")
    public String supplierno;
    @Label("有无售后")
    @javax.validation.constraints.NotNull
    public AfterstatusEnum after = AfterstatusEnum.FIELD_0;
    @Label("收货地址")
    @javax.validation.constraints.NotNull
    public String delivery_order;
    @Label("发票生成")
    @javax.validation.constraints.NotNull
    public DocumentsEnum documents = DocumentsEnum.FIELD_0;

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

    public Long getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(Long supplierID) {
        this.supplierID = supplierID;
    }

    public java.time.LocalDate getExpectedDeliveryDate() {
        return expectedDeliveryDate;
    }

    public void setExpectedDeliveryDate(java.time.LocalDate expectedDeliveryDate) {
        this.expectedDeliveryDate = expectedDeliveryDate;
    }

    public OrderStatusEnum getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatusEnum orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public Long getManager() {
        return manager;
    }

    public void setManager(Long manager) {
        this.manager = manager;
    }

    public Long getSupplier() {
        return supplier;
    }

    public void setSupplier(Long supplier) {
        this.supplier = supplier;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getSupplierno() {
        return supplierno;
    }

    public void setSupplierno(String supplierno) {
        this.supplierno = supplierno;
    }

    public AfterstatusEnum getAfter() {
        return after;
    }

    public void setAfter(AfterstatusEnum after) {
        this.after = after;
    }

    public String getDelivery_order() {
        return delivery_order;
    }

    public void setDelivery_order(String delivery_order) {
        this.delivery_order = delivery_order;
    }

    public DocumentsEnum getDocuments() {
        return documents;
    }

    public void setDocuments(DocumentsEnum documents) {
        this.documents = documents;
    }

}