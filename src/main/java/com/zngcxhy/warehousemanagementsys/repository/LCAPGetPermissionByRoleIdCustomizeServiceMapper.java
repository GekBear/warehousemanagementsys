package com.zngcxhy.warehousemanagementsys.repository;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import com.zngcxhy.warehousemanagementsys.domain.enumeration.*;
import com.zngcxhy.warehousemanagementsys.domain.*;
import com.zngcxhy.warehousemanagementsys.web.interceptor.annotation.*;
import com.zngcxhy.warehousemanagementsys.datasource.dynamic.DataSource;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.sql.Blob;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.ArrayList;

import com.zngcxhy.warehousemanagementsys.domain.structure.*;
import com.zngcxhy.warehousemanagementsys.domain.entities.*;

/**
* auto generate LCAPGetPermissionByRoleIdCustomizeService Mapper
*
* @author sys
*/
public interface LCAPGetPermissionByRoleIdCustomizeServiceMapper {

List<com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_1C8D1250B6DC21B85363C7974FAD68BD> getAnonymousStructure_1406A78D88BEF361C3C93B65A4E2AB5A(@Param("roleId") Long roleId);
Long countAnonymousStructure_1406A78D88BEF361C3C93B65A4E2AB5A(@Param("roleId") Long roleId);

}
