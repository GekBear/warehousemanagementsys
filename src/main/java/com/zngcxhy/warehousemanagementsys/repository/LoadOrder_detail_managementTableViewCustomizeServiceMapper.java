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
* auto generate LoadOrder_detail_managementTableViewCustomizeService Mapper
*
* @author sys
*/
public interface LoadOrder_detail_managementTableViewCustomizeServiceMapper {

List<com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_28406730B11920D8D74F4BCB897DBD72> getAnonymousStructure_00C696A2C37E41565D1436EC4B43FEA3(@Param("filter") PurchaseOrderDetaiEntity filter,@Param("size") Long size,@Param("sort") String sort,@Param("page") Long page,@Param("order") String order);
Long countAnonymousStructure_00C696A2C37E41565D1436EC4B43FEA3(@Param("filter") PurchaseOrderDetaiEntity filter,@Param("size") Long size,@Param("sort") String sort,@Param("page") Long page,@Param("order") String order);

}
