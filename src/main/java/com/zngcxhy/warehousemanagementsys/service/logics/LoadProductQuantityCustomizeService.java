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
* auto generate LoadProductQuantityCustomizeService logic
*
* @author sys
*/
@Service
public class LoadProductQuantityCustomizeService {
    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
	@Autowired private LoadProductQuantityCustomizeServiceMapper loadProductQuantityCustomizeServiceMapper;

	public Long  loadProductQuantity(Long productId) {
		List<com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_9ECE35F6B2A89475F87BB2D49DE0DDB8> variable1 = new ArrayList <>();
		com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_9ECE35F6B2A89475F87BB2D49DE0DDB8 variable2 = new com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_9ECE35F6B2A89475F87BB2D49DE0DDB8();
		Long result = 0L;
		variable1=CommonFunctionUtil.createListPage(loadProductQuantityCustomizeServiceMapper.getAnonymousStructure_D973E5D521E557621AB6C7C329CD488F(productId), loadProductQuantityCustomizeServiceMapper.countAnonymousStructure_D973E5D521E557621AB6C7C329CD488F(productId).intValue(), com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_D973E5D521E557621AB6C7C329CD488F.class).list;
		if((CommonFunctionUtil.length(variable1).compareTo(0L) > 0)) {
			variable2=CommonFunctionUtil.get(variable1,0L);
			result=variable2.product.stockQuantity;
		} else {
		}
		return result;
	}

}
