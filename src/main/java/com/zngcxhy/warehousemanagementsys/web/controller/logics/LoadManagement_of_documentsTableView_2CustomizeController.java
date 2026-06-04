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
* auto generate LoadManagement_of_documentsTableView_2CustomizeController logic
*
* @author sys
*/
@RestController
public class LoadManagement_of_documentsTableView_2CustomizeController {

@Autowired private LoadManagement_of_documentsTableView_2CustomizeService loadManagement_of_documentsTableView_2CustomizeService;

@Validation(value = {
    @ValidationRuleGroup(
            value = "8dda181386614674a34320082bb6f740",
            rules = {
            }
    ),
})
@PostMapping("/api/lcplogics/loadManagement_of_documentsTableView_2")
public ApiReturn<com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_15236DED8CD807484AC741CD838A113B> loadManagement_of_documentsTableView_2(@RequestBody LoadManagement_of_documentsTableView_2CustomizeControllerDto body) throws Exception {
 return ApiReturn.of(loadManagement_of_documentsTableView_2CustomizeService.loadManagement_of_documentsTableView_2(body.getPage(),body.getSize(),body.getSort(),body.getOrder(),body.getFilter()));
}
}
