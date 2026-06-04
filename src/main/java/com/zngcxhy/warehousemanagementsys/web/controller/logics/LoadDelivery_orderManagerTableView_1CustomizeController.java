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
* auto generate LoadDelivery_orderManagerTableView_1CustomizeController logic
*
* @author sys
*/
@RestController
public class LoadDelivery_orderManagerTableView_1CustomizeController {

@Autowired private LoadDelivery_orderManagerTableView_1CustomizeService loadDelivery_orderManagerTableView_1CustomizeService;

@Validation(value = {
    @ValidationRuleGroup(
            value = "8be9e4fde14f42ad9c0c08afa004e8bd",
            rules = {
            }
    ),
})
@PostMapping("/api/lcplogics/loadDelivery_orderManagerTableView_1")
public ApiReturn<com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_89B0C97E88C1D12537DDD2C5E5CDB937> loadDelivery_orderManagerTableView_1(@RequestBody LoadDelivery_orderManagerTableView_1CustomizeControllerDto body) throws Exception {
 return ApiReturn.of(loadDelivery_orderManagerTableView_1CustomizeService.loadDelivery_orderManagerTableView_1(body.getPage(),body.getSize(),body.getSort(),body.getOrder(),body.getFilter()));
}
}
