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
* auto generate Logic1order2CustomizeService logic
*
* @author sys
*/
@Service
public class Logic1order2CustomizeService {
    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
	@Autowired private Logic1order2CustomizeServiceMapper logic1order2CustomizeServiceMapper;

	public LCAPUser  logic1order2(String name) {
		List<com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_47C167E7217746A55100F50A57F637C0> variable1 = new ArrayList <>();
		com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_47C167E7217746A55100F50A57F637C0 variable2 = new com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_47C167E7217746A55100F50A57F637C0();
		LCAPUser result = new LCAPUser();
		variable1=CommonFunctionUtil.createListPage(logic1order2CustomizeServiceMapper.getAnonymousStructure_90BB04F104917B26166C550B4A1B0632(name), logic1order2CustomizeServiceMapper.countAnonymousStructure_90BB04F104917B26166C550B4A1B0632(name).intValue(), com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_90BB04F104917B26166C550B4A1B0632.class).list;
		if((CommonFunctionUtil.length(variable1).compareTo(0L) > 0)) {
			variable2=CommonFunctionUtil.get(variable1,0L);
			result=variable2.lCAPUser;
		} else {
		}
		return result;
	}

}
