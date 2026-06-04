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
* auto generate LoadPurchasin_managementSelect_2CustomizeController logic
*
* @author sys
*/
@RestController
public class LoadPurchasin_managementSelect_2CustomizeController {

@Autowired private LoadPurchasin_managementSelect_2CustomizeService loadPurchasin_managementSelect_2CustomizeService;

@Validation(value = {
    @ValidationRuleGroup(
            value = "59f920311e2b4dab833e9144014ecdb9",
            rules = {
            }
    ),
})
@PostMapping("/api/lcplogics/loadPurchasin_managementSelect_2")
public ApiReturn<com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_89B0C97E88C1D12537DDD2C5E5CDB937> loadPurchasin_managementSelect_2(@RequestBody LoadPurchasin_managementSelect_2CustomizeControllerDto body) throws Exception {
 return ApiReturn.of(loadPurchasin_managementSelect_2CustomizeService.loadPurchasin_managementSelect_2(body.getPage(),body.getSize()));
}
}
