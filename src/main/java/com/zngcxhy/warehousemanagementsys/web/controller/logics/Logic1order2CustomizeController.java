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
* auto generate Logic1order2CustomizeController logic
*
* @author sys
*/
@RestController
public class Logic1order2CustomizeController {

@Autowired private Logic1order2CustomizeService logic1order2CustomizeService;

@Validation(value = {
    @ValidationRuleGroup(
            value = "7504f262569e435cb75b3f448e8df989",
            rules = {
            }
    ),
    @ValidationRuleGroup(
            value = "26bca1821269404b893311c1093600b3",
            rules = {
            }
    ),
})
@PostMapping("/api/lcplogics/logic1order2")
public ApiReturn<LCAPUser> logic1order2(@RequestBody Logic1order2CustomizeControllerDto body) throws Exception {
 return ApiReturn.of(logic1order2CustomizeService.logic1order2(body.getName()));
}
}
