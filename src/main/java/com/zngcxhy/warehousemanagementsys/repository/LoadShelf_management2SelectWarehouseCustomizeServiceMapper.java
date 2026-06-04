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
* auto generate LoadShelf_management2SelectWarehouseCustomizeService Mapper
*
* @author sys
*/
public interface LoadShelf_management2SelectWarehouseCustomizeServiceMapper {

List<com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_F349DEC1E5A50FAAD59CBCBBFB541B93> getAnonymousStructure_F38430154A940234D722FC75BC91969C(@Param("size") Long size,@Param("page") Long page);
Long countAnonymousStructure_F38430154A940234D722FC75BC91969C(@Param("size") Long size,@Param("page") Long page);

}
