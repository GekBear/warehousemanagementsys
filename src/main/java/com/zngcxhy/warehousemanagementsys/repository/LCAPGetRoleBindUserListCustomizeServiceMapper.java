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
* auto generate LCAPGetRoleBindUserListCustomizeService Mapper
*
* @author sys
*/
public interface LCAPGetRoleBindUserListCustomizeServiceMapper {

List<com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_E69C6A05AFC359D00B28F67D0E02C8E5> getAnonymousStructure_53DE9B8001DA9BE446985BA45040CA18(@Param("inputRoleId") Long inputRoleId);
Long countAnonymousStructure_53DE9B8001DA9BE446985BA45040CA18(@Param("inputRoleId") Long inputRoleId);

}
