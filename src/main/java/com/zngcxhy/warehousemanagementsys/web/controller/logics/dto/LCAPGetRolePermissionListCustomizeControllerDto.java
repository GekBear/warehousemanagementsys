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
* auto generate LCAPGetRolePermissionListCustomizeControllerDto
*
* @author sys
*/
public class LCAPGetRolePermissionListCustomizeControllerDto {
    
    public Long inputRoleId;

    public Long getInputRoleId() {
        return inputRoleId;
    }

    public void setInputRoleId(Long inputRoleId) {
        this.inputRoleId = inputRoleId;
    }

}
