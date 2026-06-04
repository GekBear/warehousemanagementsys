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
* auto generate LCAPGetPermissionByRoleIdCustomizeController logic
*
* @author sys
*/
@RestController
public class LCAPGetPermissionByRoleIdCustomizeController {

@Autowired private LCAPGetPermissionByRoleIdCustomizeService lCAPGetPermissionByRoleIdCustomizeService;

@Validation(value = {
    @ValidationRuleGroup(
            value = "022bb889b29a436fb1b677d2997625b4",
            rules = {
            }
    ),
    @ValidationRuleGroup(
            value = "c56618e87d774f40b513f51de20bfc64",
            rules = {
            }
    ),
    @ValidationRuleGroup(
            value = "69b84106325d4839a497f515e7a7557c",
            rules = {
            }
    ),
})
@PostMapping("/api/lcplogics/LCAPGetPermissionByRoleId")
public ApiReturn<List<LCAPPermission>> lCAPGetPermissionByRoleId(@RequestBody LCAPGetPermissionByRoleIdCustomizeControllerDto body) throws Exception {
 return ApiReturn.of(lCAPGetPermissionByRoleIdCustomizeService.lCAPGetPermissionByRoleId(body.getRoleId()));
}
}
