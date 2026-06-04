package com.zngcxhy.warehousemanagementsys.service.logics.authlogic;

import com.zngcxhy.warehousemanagementsys.config.Constants;
import com.zngcxhy.warehousemanagementsys.util.*;
import com.zngcxhy.warehousemanagementsys.domain.*;
import com.zngcxhy.warehousemanagementsys.domain.enumeration.*;
import com.zngcxhy.warehousemanagementsys.service.*;
import com.zngcxhy.warehousemanagementsys.service.dto.filters.*;
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
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.scheduling.annotation.Scheduled;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.math.RoundingMode;
import com.zngcxhy.warehousemanagementsys.domain.structure.*;
import com.zngcxhy.warehousemanagementsys.domain.http.HttpRequest;
import com.zngcxhy.warehousemanagementsys.domain.entities.*;
import com.zngcxhy.warehousemanagementsys.functional.FunctionContainer;
import com.zngcxhy.warehousemanagementsys.domain.http.HttpParameter;
import com.zngcxhy.warehousemanagementsys.service.entities.*;

/**
* auto generate AkSkAuthAuthLogicForCallInterfaceService logic
*
* @author sys
*/
@Service
public class AkSkAuthAuthLogicForCallInterfaceService {
    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);


	public HttpRequest auth(HttpRequest<String> request) {
		String ak = "";
		String sk = "";
		String timestamp = "";
		String signature = "";
		ak="Codewave";
		CommonFunctionUtil.mapPut(request.headers,"ak",ak);
		sk="Codewave";
		timestamp=CommonFunctionUtil.toString(CommonFunctionUtil.currDateTime());
		CommonFunctionUtil.mapPut(request.headers,"timestamp",timestamp);
		signature=(ak + (sk + timestamp));
		CommonFunctionUtil.mapPut(request.headers,"signature",signature);
		return request;
	}
}
