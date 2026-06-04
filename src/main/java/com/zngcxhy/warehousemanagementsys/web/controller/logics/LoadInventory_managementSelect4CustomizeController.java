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
* auto generate LoadInventory_managementSelect4CustomizeController logic
*
* @author sys
*/
@RestController
public class LoadInventory_managementSelect4CustomizeController {

@Autowired private LoadInventory_managementSelect4CustomizeService loadInventory_managementSelect4CustomizeService;

@Validation(value = {
    @ValidationRuleGroup(
            value = "794ad74fb8e94f46b44ad941dad1c1fe",
            rules = {
            }
    ),
    @ValidationRuleGroup(
            value = "7225b654f8e14a1a80c9f223cb3cd464",
            rules = {
            }
    ),
})
@PostMapping("/api/lcplogics/loadInventory_managementSelect4")
public ApiReturn<com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_90BB04F104917B26166C550B4A1B0632> loadInventory_managementSelect4(@RequestBody LoadInventory_managementSelect4CustomizeControllerDto body) throws Exception {
 return ApiReturn.of(loadInventory_managementSelect4CustomizeService.loadInventory_managementSelect4(body.getPage(),body.getSize()));
}
}
