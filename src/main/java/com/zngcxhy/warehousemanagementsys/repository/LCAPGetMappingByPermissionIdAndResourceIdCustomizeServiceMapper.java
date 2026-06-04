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
* auto generate LCAPGetMappingByPermissionIdAndResourceIdCustomizeService Mapper
*
* @author sys
*/
public interface LCAPGetMappingByPermissionIdAndResourceIdCustomizeServiceMapper {

List<com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_D99966CE0A06FAAEEADD3A36C43F7DFF> getAnonymousStructure_38593AA815D055EA90DAB07FE4542F93(@Param("permissionId") Long permissionId,@Param("resourceId") Long resourceId);
Long countAnonymousStructure_38593AA815D055EA90DAB07FE4542F93(@Param("permissionId") Long permissionId,@Param("resourceId") Long resourceId);

}
