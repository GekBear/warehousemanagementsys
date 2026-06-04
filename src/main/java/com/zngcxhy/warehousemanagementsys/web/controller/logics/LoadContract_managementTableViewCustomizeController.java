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
* auto generate LoadContract_managementTableViewCustomizeController logic
*
* @author sys
*/
@RestController
public class LoadContract_managementTableViewCustomizeController {

@Autowired private LoadContract_managementTableViewCustomizeService loadContract_managementTableViewCustomizeService;

@Validation(value = {
    @ValidationRuleGroup(
            value = "838b6b0b5f6c4c66a2a489903b1904b2",
            rules = {
            }
    ),
})
@PostMapping("/api/lcplogics/loadContract_managementTableView")
public ApiReturn<com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_3F17D6E4D1852D7625F270B1D360C0D8> loadContract_managementTableView(@RequestBody LoadContract_managementTableViewCustomizeControllerDto body) throws Exception {
 return ApiReturn.of(loadContract_managementTableViewCustomizeService.loadContract_managementTableView(body.getPage(),body.getSize(),body.getSort(),body.getOrder(),body.getFilter()));
}
}
