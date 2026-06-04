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
* auto generate LoadAfter_sale_managementSelectPurchaseOrderCustomizeController logic
*
* @author sys
*/
@RestController
public class LoadAfter_sale_managementSelectPurchaseOrderCustomizeController {

@Autowired private LoadAfter_sale_managementSelectPurchaseOrderCustomizeService loadAfter_sale_managementSelectPurchaseOrderCustomizeService;

@Validation(value = {
    @ValidationRuleGroup(
            value = "a0b62e3efd714a9999d64a2cbcaaceef",
            rules = {
            }
    ),
    @ValidationRuleGroup(
            value = "48a6f556b5824a468a93d8467c291faf",
            rules = {
            }
    ),
})
@PostMapping("/api/lcplogics/loadAfter_sale_managementSelectPurchaseOrder")
public ApiReturn<com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_15236DED8CD807484AC741CD838A113B> loadAfter_sale_managementSelectPurchaseOrder(@RequestBody LoadAfter_sale_managementSelectPurchaseOrderCustomizeControllerDto body) throws Exception {
 return ApiReturn.of(loadAfter_sale_managementSelectPurchaseOrderCustomizeService.loadAfter_sale_managementSelectPurchaseOrder(body.getPage(),body.getSize()));
}
}
