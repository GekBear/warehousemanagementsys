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
import com.zngcxhy.warehousemanagementsys.domain.structure.*;
import com.zngcxhy.warehousemanagementsys.domain.entities.*;
import com.zngcxhy.warehousemanagementsys.service.entities.*;

/**
* auto generate LogicshelfCustomizeController logic
*
* @author sys
*/
@RestController
public class LogicshelfCustomizeController {

@Autowired private LogicshelfCustomizeService logicshelfCustomizeService;

@Validation(value = {
    @ValidationRuleGroup(
            value = "1f6850bc41e64084955eb6b83f88e9b9",
            rules = {
            }
    ),
})
@PostMapping("/api/lcplogics/logicshelf")
public ApiReturn<List<com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_F30C4D4796DE57EC4963423784B62512>> logicshelf() throws Exception {
 return ApiReturn.of(logicshelfCustomizeService.logicshelf());
}
}
