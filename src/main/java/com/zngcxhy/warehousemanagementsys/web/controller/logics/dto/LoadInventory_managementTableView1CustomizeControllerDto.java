package com.zngcxhy.warehousemanagementsys.web.controller.logics.dto;

import java.io.Serializable;
import com.zngcxhy.warehousemanagementsys.domain.*;
import com.zngcxhy.warehousemanagementsys.domain.enumeration.*;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.sql.Blob;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import com.zngcxhy.warehousemanagementsys.domain.structure.*;
import com.zngcxhy.warehousemanagementsys.domain.entities.*;

/**
* auto generate LoadInventory_managementTableView1CustomizeControllerDto
*
* @author sys
*/
public class LoadInventory_managementTableView1CustomizeControllerDto {
    
    public InventoryEntity filter;
    
    public Long size;
    
    public Long warehouseId;
    
    public String sort;
    
    public Long page;
    
    public String order;

    public InventoryEntity getFilter() {
        return filter;
    }

    public void setFilter(InventoryEntity filter) {
        this.filter = filter;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public Long getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public Long getPage() {
        return page;
    }

    public void setPage(Long page) {
        this.page = page;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

}
