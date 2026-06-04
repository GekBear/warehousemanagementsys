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
* auto generate LoadInventory_managementSelect3CustomizeController logic
*
* @author sys
*/
@RestController
public class LoadInventory_managementSelect3CustomizeController {

@Autowired private LoadInventory_managementSelect3CustomizeService loadInventory_managementSelect3CustomizeService;

@Validation(value = {
    @ValidationRuleGroup(
            value = "ac16d03541164659b65568638553fefd",
            rules = {
            }
    ),
})
@PostMapping("/api/lcplogics/loadInventory_managementSelect3")
public ApiReturn<com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_D973E5D521E557621AB6C7C329CD488F> loadInventory_managementSelect3(@RequestBody LoadInventory_managementSelect3CustomizeControllerDto body) throws Exception {
 return ApiReturn.of(loadInventory_managementSelect3CustomizeService.loadInventory_managementSelect3(body.getPage(),body.getSize()));
}
}
