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
* auto generate LoadinvaCustomizeController logic
*
* @author sys
*/
@RestController
public class LoadinvaCustomizeController {

@Autowired private LoadinvaCustomizeService loadinvaCustomizeService;

@Validation(value = {
    @ValidationRuleGroup(
            value = "d4bae603950043cbb07b2ee21aafcbdf",
            rules = {
            }
    ),
    @ValidationRuleGroup(
            value = "078f0177af934de3be7c0b8b7e570f7a",
            rules = {
            }
    ),
})
@PostMapping("/api/lcplogics/loadinva")
public ApiReturn<List<com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_6137BC56C51B4B79E581ABCB94F7B2CE>> loadinva() throws Exception {
 return ApiReturn.of(loadinvaCustomizeService.loadinva());
}
}
