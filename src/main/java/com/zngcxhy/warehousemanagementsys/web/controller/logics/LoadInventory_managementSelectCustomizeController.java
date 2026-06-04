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
* auto generate LoadInventory_managementSelectCustomizeController logic
*
* @author sys
*/
@RestController
public class LoadInventory_managementSelectCustomizeController {

@Autowired private LoadInventory_managementSelectCustomizeService loadInventory_managementSelectCustomizeService;

@Validation(value = {
    @ValidationRuleGroup(
            value = "778c49afbccf4b349c81c4044a1cb81e",
            rules = {
            }
    ),
})
@PostMapping("/api/lcplogics/loadInventory_managementSelect")
public ApiReturn<com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_F38430154A940234D722FC75BC91969C> loadInventory_managementSelect(@RequestBody LoadInventory_managementSelectCustomizeControllerDto body) throws Exception {
 return ApiReturn.of(loadInventory_managementSelectCustomizeService.loadInventory_managementSelect(body.getPage(),body.getSize()));
}
}
