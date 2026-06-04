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
* auto generate LoadAfter_sale_managementTableViewCustomizeController logic
*
* @author sys
*/
@RestController
public class LoadAfter_sale_managementTableViewCustomizeController {

@Autowired private LoadAfter_sale_managementTableViewCustomizeService loadAfter_sale_managementTableViewCustomizeService;

@Validation(value = {
    @ValidationRuleGroup(
            value = "90e49569df4347f38c45d4a780f82725",
            rules = {
            }
    ),
})
@PostMapping("/api/lcplogics/loadAfter_sale_managementTableView")
public ApiReturn<com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_3155819A39245BFBE1F9D48E70DC8203> loadAfter_sale_managementTableView(@RequestBody LoadAfter_sale_managementTableViewCustomizeControllerDto body) throws Exception {
 return ApiReturn.of(loadAfter_sale_managementTableViewCustomizeService.loadAfter_sale_managementTableView(body.getPage(),body.getSize(),body.getSort(),body.getOrder(),body.getFilter()));
}
}
