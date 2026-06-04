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
* auto generate LoadAfter_sale_managementTableView2CustomizeService Mapper
*
* @author sys
*/
public interface LoadAfter_sale_managementTableView2CustomizeServiceMapper {

List<com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_549508BDC1898EC803BEBB94E48237F8> getAnonymousStructure_3155819A39245BFBE1F9D48E70DC8203(@Param("supplierID") Long supplierID,@Param("size") Long size,@Param("sort") String sort,@Param("page") Long page,@Param("order") String order);
Long countAnonymousStructure_3155819A39245BFBE1F9D48E70DC8203(@Param("supplierID") Long supplierID,@Param("size") Long size,@Param("sort") String sort,@Param("page") Long page,@Param("order") String order);

}
