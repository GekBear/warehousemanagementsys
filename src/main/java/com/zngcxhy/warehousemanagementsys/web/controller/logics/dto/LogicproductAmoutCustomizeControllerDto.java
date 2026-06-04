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
* auto generate LogicproductAmoutCustomizeControllerDto
*
* @author sys
*/
public class LogicproductAmoutCustomizeControllerDto {
    
    public Long supplierID;

    public Long getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(Long supplierID) {
        this.supplierID = supplierID;
    }

}
