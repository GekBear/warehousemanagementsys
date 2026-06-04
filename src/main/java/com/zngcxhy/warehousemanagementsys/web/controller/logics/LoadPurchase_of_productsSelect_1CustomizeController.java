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
* auto generate LoadPurchase_of_productsSelect_1CustomizeController logic
*
* @author sys
*/
@RestController
public class LoadPurchase_of_productsSelect_1CustomizeController {

@Autowired private LoadPurchase_of_productsSelect_1CustomizeService loadPurchase_of_productsSelect_1CustomizeService;

@Validation(value = {
    @ValidationRuleGroup(
            value = "4b783d5be8c84f12bc989c0424ea5c76",
            rules = {
            }
    ),
})
@PostMapping("/api/lcplogics/loadPurchase_of_productsSelect_1")
public ApiReturn<com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_89B0C97E88C1D12537DDD2C5E5CDB937> loadPurchase_of_productsSelect_1(@RequestBody LoadPurchase_of_productsSelect_1CustomizeControllerDto body) throws Exception {
 return ApiReturn.of(loadPurchase_of_productsSelect_1CustomizeService.loadPurchase_of_productsSelect_1(body.getPage(),body.getSize()));
}
}
