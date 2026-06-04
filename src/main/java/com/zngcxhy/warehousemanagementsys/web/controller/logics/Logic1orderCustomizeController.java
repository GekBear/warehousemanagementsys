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
* auto generate Logic1orderCustomizeController logic
*
* @author sys
*/
@RestController
public class Logic1orderCustomizeController {

@Autowired private Logic1orderCustomizeService logic1orderCustomizeService;

@Validation(value = {
    @ValidationRuleGroup(
            value = "bce7485e9ccb4072bd2481f92974429a",
            rules = {
            @ValidationRule(value = "required", targetName = "body.id", argvs = "", errorMsg = ""),
            }
    ),
    @ValidationRuleGroup(
            value = "b37af4171ea2451e846e7da2d0565a16",
            rules = {
            }
    ),
    @ValidationRuleGroup(
            value = "c9958cb310564c37a0a4192e4a8c0a9a",
            rules = {
            }
    ),
    @ValidationRuleGroup(
            value = "f030559bfa1e44efb0b68e25da9dbc9b",
            rules = {
            }
    ),
})
@PostMapping("/api/lcplogics/logic1order")
public ApiReturn<List<com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_28406730B11920D8D74F4BCB897DBD72>> logic1order(@RequestBody Logic1orderCustomizeControllerDto body) throws Exception {
 return ApiReturn.of(logic1orderCustomizeService.logic1order(body.getId()));
}
}
