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
* auto generate LoadSupplier_managerTableViewCustomizeService Mapper
*
* @author sys
*/
public interface LoadSupplier_managerTableViewCustomizeServiceMapper {

List<com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_B0D6BA4B2283DC4DA976DAF31C826073> getAnonymousStructure_15236DED8CD807484AC741CD838A113B(@Param("filter") PurchaseOrderEntity filter,@Param("supplierID") Long supplierID,@Param("size") Long size,@Param("sort") String sort,@Param("page") Long page,@Param("order") String order);
Long countAnonymousStructure_15236DED8CD807484AC741CD838A113B(@Param("filter") PurchaseOrderEntity filter,@Param("supplierID") Long supplierID,@Param("size") Long size,@Param("sort") String sort,@Param("page") Long page,@Param("order") String order);

}
