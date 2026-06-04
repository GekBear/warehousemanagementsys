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
* auto generate LoadSupplier_managerTableView2CustomizeController logic
*
* @author sys
*/
@RestController
public class LoadSupplier_managerTableView2CustomizeController {

@Autowired private LoadSupplier_managerTableView2CustomizeService loadSupplier_managerTableView2CustomizeService;

@Validation(value = {
    @ValidationRuleGroup(
            value = "0d5a4af4-a579-4650-aad9-a2c39797f333",
            rules = {
            }
    ),
    @ValidationRuleGroup(
            value = "b295d2d8e6794286a5b4b3526b89d1de",
            rules = {
            }
    ),
})
@PostMapping("/api/lcplogics/loadSupplier_managerTableView2")
public ApiReturn<com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_00C696A2C37E41565D1436EC4B43FEA3> loadSupplier_managerTableView2(@RequestBody LoadSupplier_managerTableView2CustomizeControllerDto body) throws Exception {
 return ApiReturn.of(loadSupplier_managerTableView2CustomizeService.loadSupplier_managerTableView2(body.getPage(),body.getSize(),body.getSort(),body.getOrder(),body.getPurchaisId()));
}
}
