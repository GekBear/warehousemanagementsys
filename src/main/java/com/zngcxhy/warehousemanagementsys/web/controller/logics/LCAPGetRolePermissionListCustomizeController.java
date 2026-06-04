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
* auto generate LCAPGetRolePermissionListCustomizeController logic
*
* @author sys
*/
@RestController
public class LCAPGetRolePermissionListCustomizeController {

@Autowired private LCAPGetRolePermissionListCustomizeService lCAPGetRolePermissionListCustomizeService;

@Validation(value = {
    @ValidationRuleGroup(
            value = "bf227c1bf20f486ba4b2ea292f99e88d",
            rules = {
            }
    ),
})
@PostMapping("/api/lcplogics/LCAPGetRolePermissionList")
public ApiReturn<com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_0136396D558BF391361EA94F4EF87419> lCAPGetRolePermissionList(@RequestBody LCAPGetRolePermissionListCustomizeControllerDto body) throws Exception {
 return ApiReturn.of(lCAPGetRolePermissionListCustomizeService.lCAPGetRolePermissionList(body.getInputRoleId()));
}
}
