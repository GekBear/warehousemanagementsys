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
* auto generate LCAPLoadRoleManagementTableViewCustomizeController logic
*
* @author sys
*/
@RestController
public class LCAPLoadRoleManagementTableViewCustomizeController {

@Autowired private LCAPLoadRoleManagementTableViewCustomizeService lCAPLoadRoleManagementTableViewCustomizeService;

@Validation(value = {
    @ValidationRuleGroup(
            value = "43c894bde23345d48f4cecb81b3a8b97",
            rules = {
            }
    ),
})
@PostMapping("/api/lcplogics/LCAPLoadRoleManagementTableView")
public ApiReturn<com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_CAC5152BAE2C91DD609E3DFEE343ACC6> lCAPLoadRoleManagementTableView(@RequestBody LCAPLoadRoleManagementTableViewCustomizeControllerDto body) throws Exception {
 return ApiReturn.of(lCAPLoadRoleManagementTableViewCustomizeService.lCAPLoadRoleManagementTableView(body.getPage(),body.getSize(),body.getSort(),body.getOrder(),body.getFilter()));
}
}
