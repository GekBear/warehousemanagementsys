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
* auto generate LaodinvCustomizeController logic
*
* @author sys
*/
@RestController
public class LaodinvCustomizeController {

@Autowired private LaodinvCustomizeService laodinvCustomizeService;

@Validation(value = {
    @ValidationRuleGroup(
            value = "1b4dfed0f0ff45efb80eeaa0e56310b5",
            rules = {
            }
    ),
})
@PostMapping("/api/lcplogics/laodinv")
public ApiReturn<List<com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_B0D6BA4B2283DC4DA976DAF31C826073>> laodinv() throws Exception {
 return ApiReturn.of(laodinvCustomizeService.laodinv());
}
}
