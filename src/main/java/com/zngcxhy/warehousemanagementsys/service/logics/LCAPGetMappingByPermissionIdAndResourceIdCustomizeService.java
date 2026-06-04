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
* auto generate LCAPGetMappingByPermissionIdAndResourceIdCustomizeService logic
*
* @author sys
*/
@Service
public class LCAPGetMappingByPermissionIdAndResourceIdCustomizeService {
    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
	@Autowired private LCAPGetMappingByPermissionIdAndResourceIdCustomizeServiceMapper lCAPGetMappingByPermissionIdAndResourceIdCustomizeServiceMapper;

	public List<Long>  lCAPGetMappingByPermissionIdAndResourceId(Long permissionId,Long resourceId) {
		com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_38593AA815D055EA90DAB07FE4542F93 variable1 = new com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_38593AA815D055EA90DAB07FE4542F93();
		List<Long> mappingIdList = new ArrayList <>();
		CommonFunctionUtil.clear(mappingIdList);
		variable1=CommonFunctionUtil.createListPage(lCAPGetMappingByPermissionIdAndResourceIdCustomizeServiceMapper.getAnonymousStructure_38593AA815D055EA90DAB07FE4542F93(permissionId,resourceId), lCAPGetMappingByPermissionIdAndResourceIdCustomizeServiceMapper.countAnonymousStructure_38593AA815D055EA90DAB07FE4542F93(permissionId,resourceId).intValue(), com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_38593AA815D055EA90DAB07FE4542F93.class);
		for(Long i = 0L; i < CommonFunctionUtil.length(variable1.list); i++ ) {
			com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_D99966CE0A06FAAEEADD3A36C43F7DFF  item = variable1.list.get(i.intValue());
			CommonFunctionUtil.add(mappingIdList,item.lCAPPerResMapping.id);
		}
		return mappingIdList;
	}

}
