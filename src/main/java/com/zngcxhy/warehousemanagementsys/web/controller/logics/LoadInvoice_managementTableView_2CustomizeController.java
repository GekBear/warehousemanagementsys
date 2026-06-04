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
* auto generate LoadInvoice_managementTableView_2CustomizeController logic
*
* @author sys
*/
@RestController
public class LoadInvoice_managementTableView_2CustomizeController {

@Autowired private LoadInvoice_managementTableView_2CustomizeService loadInvoice_managementTableView_2CustomizeService;

@Validation(value = {
    @ValidationRuleGroup(
            value = "63f9b9cc6e80464d959293c214aa1f88",
            rules = {
            }
    ),
})
@PostMapping("/api/lcplogics/loadInvoice_managementTableView_2")
public ApiReturn<com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_91499DCB05E3CB30C2E9EDADADB28861> loadInvoice_managementTableView_2(@RequestBody LoadInvoice_managementTableView_2CustomizeControllerDto body) throws Exception {
 return ApiReturn.of(loadInvoice_managementTableView_2CustomizeService.loadInvoice_managementTableView_2(body.getPage(),body.getSize(),body.getSort(),body.getOrder(),body.getFilter()));
}
}
