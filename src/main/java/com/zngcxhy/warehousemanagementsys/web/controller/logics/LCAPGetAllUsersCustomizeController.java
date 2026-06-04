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
* auto generate LCAPGetAllUsersCustomizeController logic
*
* @author sys
*/
@RestController
public class LCAPGetAllUsersCustomizeController {

@Autowired private LCAPGetAllUsersCustomizeService lCAPGetAllUsersCustomizeService;

@Validation(value = {
    @ValidationRuleGroup(
            value = "4cf74e40cae3410db8d2bcc2b95d19f1",
            rules = {
            }
    ),
    @ValidationRuleGroup(
            value = "edc3f7da-dc6b-4c45-ac5e-d796ef9082ff",
            rules = {
            }
    ),
    @ValidationRuleGroup(
            value = "36ea8f560eb24517a50069e0c21ffe17",
            rules = {
            }
    ),
    @ValidationRuleGroup(
            value = "1494c97c3e06493d9481f49b66a1757c",
            rules = {
            }
    ),
})
@PostMapping("/api/lcplogics/LCAPGetAllUsers")
public ApiReturn<com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_90BB04F104917B26166C550B4A1B0632> lCAPGetAllUsers() throws Exception {
 return ApiReturn.of(lCAPGetAllUsersCustomizeService.lCAPGetAllUsers());
}
}
