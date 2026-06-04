package com.zngcxhy.warehousemanagementsys.service.logics;

import com.zngcxhy.warehousemanagementsys.config.Constants;
import com.zngcxhy.warehousemanagementsys.context.UserContext;
import com.zngcxhy.warehousemanagementsys.util.*;
import com.zngcxhy.warehousemanagementsys.domain.*;
import com.zngcxhy.warehousemanagementsys.domain.enumeration.*;
import com.zngcxhy.warehousemanagementsys.service.*;
import com.zngcxhy.warehousemanagementsys.service.dto.filters.*;
import com.zngcxhy.warehousemanagementsys.service.dto.filters.atomic.*;
import com.zngcxhy.warehousemanagementsys.service.dto.filters.logic.binary.*;
import com.zngcxhy.warehousemanagementsys.service.dto.filters.logic.binary.calculate.*;
import com.zngcxhy.warehousemanagementsys.service.dto.filters.logic.binary.compare.*;
import com.zngcxhy.warehousemanagementsys.service.dto.filters.logic.binary.logicCalculate.*;
import com.zngcxhy.warehousemanagementsys.service.dto.filters.logic.binary.matching.*;
import com.zngcxhy.warehousemanagementsys.service.dto.filters.logic.unary.*;
import com.zngcxhy.warehousemanagementsys.repository.*;
import com.zngcxhy.warehousemanagementsys.exception.HttpCodeException;
import com.zngcxhy.warehousemanagementsys.service.system.configuration.*;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.sql.Blob;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
import java.lang.reflect.Field;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.scheduling.annotation.Scheduled;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.math.RoundingMode;
import com.zngcxhy.warehousemanagementsys.domain.structure.*;
import com.zngcxhy.warehousemanagementsys.domain.entities.*;
import com.zngcxhy.warehousemanagementsys.functional.FunctionContainer;
import com.zngcxhy.warehousemanagementsys.service.entities.*;

/**
* auto generate LCAPGetPermissionByRoleIdCustomizeService logic
*
* @author sys
*/
@Service
public class LCAPGetPermissionByRoleIdCustomizeService {
    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
	@Autowired private LCAPGetPermissionByRoleIdCustomizeServiceMapper lCAPGetPermissionByRoleIdCustomizeServiceMapper;
	@Autowired private LCAPPermissionService lCAPPermissionService;

	public List<LCAPPermission>  lCAPGetPermissionByRoleId(Long roleId) {
		com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_1406A78D88BEF361C3C93B65A4E2AB5A variable1 = new com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_1406A78D88BEF361C3C93B65A4E2AB5A();
		Long permissionId = 0L;
		List<com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_1C8D1250B6DC21B85363C7974FAD68BD> rolePermissionMappingList = new ArrayList <>();
		LCAPPermission permissionInfo = new LCAPPermission();
		List<LCAPPermission> permissionList = new ArrayList <>();
		if((roleId == null)) {
			return permissionList;
		} else {
		}
		variable1=CommonFunctionUtil.createListPage(lCAPGetPermissionByRoleIdCustomizeServiceMapper.getAnonymousStructure_1406A78D88BEF361C3C93B65A4E2AB5A(roleId), lCAPGetPermissionByRoleIdCustomizeServiceMapper.countAnonymousStructure_1406A78D88BEF361C3C93B65A4E2AB5A(roleId).intValue(), com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_1406A78D88BEF361C3C93B65A4E2AB5A.class);
		rolePermissionMappingList=variable1.list;
		for(Long i = 0L; i < CommonFunctionUtil.length(rolePermissionMappingList); i++ ) {
			com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_1C8D1250B6DC21B85363C7974FAD68BD  item = rolePermissionMappingList.get(i.intValue());
			permissionId=item.lCAPRolePerMapping.permissionId;
			permissionInfo=lCAPPermissionService.get(permissionId);
			CommonFunctionUtil.add(permissionList,permissionInfo);
		}
		return permissionList;
	}

}
