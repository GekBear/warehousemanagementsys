package com.zngcxhy.warehousemanagementsys.web.controller.logics;

import com.zngcxhy.warehousemanagementsys.util.*;
import com.zngcxhy.warehousemanagementsys.context.UserContext;
import com.zngcxhy.warehousemanagementsys.domain.*;
import com.zngcxhy.warehousemanagementsys.domain.enumeration.*;
import com.zngcxhy.warehousemanagementsys.service.*;
import com.zngcxhy.warehousemanagementsys.service.logics.*;
import com.zngcxhy.warehousemanagementsys.web.validation.*;
import com.zngcxhy.warehousemanagementsys.repository.*;
import com.zngcxhy.warehousemanagementsys.web.ApiReturn;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.sql.Blob;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import com.zngcxhy.warehousemanagementsys.web.controller.logics.dto.*;
import com.zngcxhy.warehousemanagementsys.domain.structure.*;
import com.zngcxhy.warehousemanagementsys.domain.entities.*;
import com.zngcxhy.warehousemanagementsys.service.entities.*;

/**
* auto generate LogiccreateCustomizeController logic
*
* @author sys
*/
@RestController
public class LogiccreateCustomizeController {

@Autowired private LogiccreateCustomizeService logiccreateCustomizeService;

@Validation(value = {
    @ValidationRuleGroup(
            value = "7dc3f3902b9f49e4bfd44282585dfb58",
            rules = {
            }
    ),
    @ValidationRuleGroup(
            value = "e9c25a1a2b6146b6bb6bb36b68351d91",
            rules = {
            }
    ),
})
@PostMapping("/api/lcplogics/logiccreate")
public ApiReturn<String> logiccreate(@RequestBody LogiccreateCustomizeControllerDto body) throws Exception {
 return ApiReturn.of(logiccreateCustomizeService.logiccreate(body.getDisplayName()));
}
}
