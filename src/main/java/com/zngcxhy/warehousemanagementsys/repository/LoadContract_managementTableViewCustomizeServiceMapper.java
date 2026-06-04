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
* auto generate LoadContract_managementTableViewCustomizeService Mapper
*
* @author sys
*/
public interface LoadContract_managementTableViewCustomizeServiceMapper {

List<com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_389101111E722268CBFFC734E5A696C9> getAnonymousStructure_3F17D6E4D1852D7625F270B1D360C0D8(@Param("filter") PurchaseContractEntity filter,@Param("size") Long size,@Param("sort") String sort,@Param("page") Long page,@Param("order") String order);
Long countAnonymousStructure_3F17D6E4D1852D7625F270B1D360C0D8(@Param("filter") PurchaseContractEntity filter,@Param("size") Long size,@Param("sort") String sort,@Param("page") Long page,@Param("order") String order);

}
