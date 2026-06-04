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
* auto generate LCAPGetMappingIdByRoleIdAndUserIdCustomizeService logic
*
* @author sys
*/
@Service
public class LCAPGetMappingIdByRoleIdAndUserIdCustomizeService {
    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
	@Autowired private LCAPGetMappingIdByRoleIdAndUserIdCustomizeServiceMapper lCAPGetMappingIdByRoleIdAndUserIdCustomizeServiceMapper;

	public Long  lCAPGetMappingIdByRoleIdAndUserId(Long roleId,String userId) {
		com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_53DE9B8001DA9BE446985BA45040CA18 variable1 = new com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_53DE9B8001DA9BE446985BA45040CA18();
		Long result = 0L;
		result=0L;
		variable1=CommonFunctionUtil.createListPage(lCAPGetMappingIdByRoleIdAndUserIdCustomizeServiceMapper.getAnonymousStructure_53DE9B8001DA9BE446985BA45040CA18(), lCAPGetMappingIdByRoleIdAndUserIdCustomizeServiceMapper.countAnonymousStructure_53DE9B8001DA9BE446985BA45040CA18().intValue(), com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_53DE9B8001DA9BE446985BA45040CA18.class);
		for(Long i = 0L; i < CommonFunctionUtil.length(variable1.list); i++ ) {
			com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_E69C6A05AFC359D00B28F67D0E02C8E5  item = variable1.list.get(i.intValue());
			if(((item.lCAPUserRoleMapping.roleId.equals(roleId)) && (item.lCAPUserRoleMapping.userId.equals(userId)))) {
				result=item.lCAPUserRoleMapping.id;
			} else {
			}
		}
		return result;
	}

}
