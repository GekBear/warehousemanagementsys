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
* auto generate LoadPurchasin_managementSelect_2CustomizeService Mapper
*
* @author sys
*/
public interface LoadPurchasin_managementSelect_2CustomizeServiceMapper {

List<com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_5BFE9D1921AC7A0CDB712B5358BCC1D5> getAnonymousStructure_89B0C97E88C1D12537DDD2C5E5CDB937(@Param("size") Long size,@Param("page") Long page);
Long countAnonymousStructure_89B0C97E88C1D12537DDD2C5E5CDB937(@Param("size") Long size,@Param("page") Long page);

}
