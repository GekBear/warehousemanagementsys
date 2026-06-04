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
* auto generate LoadInventory_managementSelect5CustomizeService Mapper
*
* @author sys
*/
public interface LoadInventory_managementSelect5CustomizeServiceMapper {

List<com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_F30C4D4796DE57EC4963423784B62512> getAnonymousStructure_7F0FC9CD7C0E19CDEBEF556E681E6B3C(@Param("size") Long size,@Param("page") Long page);
Long countAnonymousStructure_7F0FC9CD7C0E19CDEBEF556E681E6B3C(@Param("size") Long size,@Param("page") Long page);

}
