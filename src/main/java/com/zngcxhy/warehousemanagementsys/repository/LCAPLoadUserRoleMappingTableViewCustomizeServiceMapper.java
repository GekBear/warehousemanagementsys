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
* auto generate LCAPLoadUserRoleMappingTableViewCustomizeService Mapper
*
* @author sys
*/
public interface LCAPLoadUserRoleMappingTableViewCustomizeServiceMapper {

List<com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_99BA20F3093BB3AC3F3CA0BCA6D65EB8> getAnonymousStructure_A43B95DDE943F37E89AA74CCF8732C90(@Param("filter") LCAPUserRoleMapping filter,@Param("size") Long size,@Param("sort") String sort,@Param("page") Long page,@Param("order") String order);
Long countAnonymousStructure_A43B95DDE943F37E89AA74CCF8732C90(@Param("filter") LCAPUserRoleMapping filter,@Param("size") Long size,@Param("sort") String sort,@Param("page") Long page,@Param("order") String order);

}
