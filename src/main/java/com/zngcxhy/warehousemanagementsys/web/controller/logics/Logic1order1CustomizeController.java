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
* auto generate Logic1order1CustomizeController logic
*
* @author sys
*/
@RestController
public class Logic1order1CustomizeController {

@Autowired private Logic1order1CustomizeService logic1order1CustomizeService;

@Validation(value = {
    @ValidationRuleGroup(
            value = "31e3c4ea62594d668fc39457bffc82e3",
            rules = {
            }
    ),
    @ValidationRuleGroup(
            value = "9a987bb6e204460897996212d73c2cc8",
            rules = {
            @ValidationRule(value = "required", targetName = "body.id", argvs = "", errorMsg = ""),
            }
    ),
})
@PostMapping("/api/lcplogics/logic1order1")
public ApiReturn<PurchaseOrderEntity> logic1order1(@RequestBody Logic1order1CustomizeControllerDto body) throws Exception {
 return ApiReturn.of(logic1order1CustomizeService.logic1order1(body.getId()));
}
}
