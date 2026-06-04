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
* auto generate LoadInventory_managementTableView1CustomizeService Mapper
*
* @author sys
*/
public interface LoadInventory_managementTableView1CustomizeServiceMapper {

List<com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_CFB8CE5FC8814213A70B859C53A46F48> getAnonymousStructure_8ECE4E13E599F6BD7343D19240C27301(@Param("filter") InventoryEntity filter,@Param("size") Long size,@Param("warehouseId") Long warehouseId,@Param("sort") String sort,@Param("page") Long page,@Param("order") String order);
Long countAnonymousStructure_8ECE4E13E599F6BD7343D19240C27301(@Param("filter") InventoryEntity filter,@Param("size") Long size,@Param("warehouseId") Long warehouseId,@Param("sort") String sort,@Param("page") Long page,@Param("order") String order);

}
