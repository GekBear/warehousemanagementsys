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
* auto generate LoadInventory_managementTableView1CustomizeController logic
*
* @author sys
*/
@RestController
public class LoadInventory_managementTableView1CustomizeController {

@Autowired private LoadInventory_managementTableView1CustomizeService loadInventory_managementTableView1CustomizeService;

@Validation(value = {
    @ValidationRuleGroup(
            value = "10aadd6cc66544d6bb98a8504ddb43b5",
            rules = {
            }
    ),
})
@PostMapping("/api/lcplogics/loadInventory_managementTableView1")
public ApiReturn<com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_8ECE4E13E599F6BD7343D19240C27301> loadInventory_managementTableView1(@RequestBody LoadInventory_managementTableView1CustomizeControllerDto body) throws Exception {
 return ApiReturn.of(loadInventory_managementTableView1CustomizeService.loadInventory_managementTableView1(body.getPage(),body.getSize(),body.getSort(),body.getOrder(),body.getFilter(),body.getWarehouseId()));
}
}
