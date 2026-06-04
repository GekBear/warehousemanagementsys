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
* auto generate LCAPGetUserResourcesCustomizeService logic
*
* @author sys
*/
@Service
public class LCAPGetUserResourcesCustomizeService {
    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
	@Autowired private LCAPGetUserResourcesCustomizeServiceMapper lCAPGetUserResourcesCustomizeServiceMapper;

	public List<LCAPGetResourceResultStructure>  lCAPGetUserResources(String userId) {
		com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_FA75F69B8BA9C34178F71FC536D2D824 variable1 = new com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_FA75F69B8BA9C34178F71FC536D2D824();
		List<String> variable2 = new ArrayList <>();
		LCAPGetResourceResultStructure variable3 = new LCAPGetResourceResultStructure();
		List<LCAPGetResourceResultStructure> variable4 = new ArrayList <>();
		LCAPGetResourceResultStructure variable5 = new LCAPGetResourceResultStructure();
		List<LCAPGetResourceResultStructure> result = new ArrayList <>();
		variable1=CommonFunctionUtil.createListPage(lCAPGetUserResourcesCustomizeServiceMapper.getAnonymousStructure_FA75F69B8BA9C34178F71FC536D2D824(userId), lCAPGetUserResourcesCustomizeServiceMapper.countAnonymousStructure_FA75F69B8BA9C34178F71FC536D2D824(userId).intValue(), com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_FA75F69B8BA9C34178F71FC536D2D824.class);
		for(Long i = 0L; i < CommonFunctionUtil.length(variable1.list); i++ ) {
			com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_B202841ADEE061731D68863F55003B0E  item = variable1.list.get(i.intValue());
			if(CommonFunctionUtil.contains(variable2,item.lCAPResource.name)) {
			} else {
				CommonFunctionUtil.add(variable2,item.lCAPResource.name);
				variable3.resourceValue=item.lCAPResource.name;
				variable3.resourceType=item.lCAPResource.type;
				variable5=CommonFunctionUtil.clone(variable3);
				CommonFunctionUtil.add(variable4,variable5);
			}
		}
		result=variable4;
		return result;
	}

}
