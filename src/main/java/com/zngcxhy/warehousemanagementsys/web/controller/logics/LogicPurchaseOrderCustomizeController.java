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
* auto generate LogicPurchaseOrderCustomizeController logic
*
* @author sys
*/
@RestController
public class LogicPurchaseOrderCustomizeController {

@Autowired private LogicPurchaseOrderCustomizeService logicPurchaseOrderCustomizeService;

@Validation(value = {
    @ValidationRuleGroup(
            value = "c2658cbb2c88421c83ad965ac90250d4",
            rules = {
            }
    ),
    @ValidationRuleGroup(
            value = "8e7e73da94784019bff3f5c099374950",
            rules = {
            }
    ),
    @ValidationRuleGroup(
            value = "c817ce21d6ae40b7a1dd0450db026db9",
            rules = {
            @ValidationRule(value = "required", targetName = "body.purchaseOrderId", argvs = "", errorMsg = ""),
            }
    ),
    @ValidationRuleGroup(
            value = "2e1d6d2b003c46939fb24b4e7c390d27",
            rules = {
            }
    ),
})
@PostMapping("/api/lcplogics/logicPurchaseOrder")
public ApiReturn<PurchaseOrderEntity> logicPurchaseOrder(@RequestBody LogicPurchaseOrderCustomizeControllerDto body) throws Exception {
 return ApiReturn.of(logicPurchaseOrderCustomizeService.logicPurchaseOrder(body.getPurchaseOrderId()));
}
}
