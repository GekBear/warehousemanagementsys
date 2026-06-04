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
* auto generate LoadPurchase_of_productsGridViewCustomizeService Mapper
*
* @author sys
*/
public interface LoadPurchase_of_productsGridViewCustomizeServiceMapper {

List<com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_9ECE35F6B2A89475F87BB2D49DE0DDB8> getAnonymousStructure_D973E5D521E557621AB6C7C329CD488F(@Param("supplierID") Long supplierID,@Param("size") Long size,@Param("idList") List<Long> idList,@Param("sort") String sort,@Param("page") Long page,@Param("order") String order);
Long countAnonymousStructure_D973E5D521E557621AB6C7C329CD488F(@Param("supplierID") Long supplierID,@Param("size") Long size,@Param("idList") List<Long> idList,@Param("sort") String sort,@Param("page") Long page,@Param("order") String order);

}
