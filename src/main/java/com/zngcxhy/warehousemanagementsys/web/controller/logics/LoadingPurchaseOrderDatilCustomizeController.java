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
* auto generate LoadingPurchaseOrderDatilCustomizeController logic
*
* @author sys
*/
@RestController
public class LoadingPurchaseOrderDatilCustomizeController {

@Autowired private LoadingPurchaseOrderDatilCustomizeService loadingPurchaseOrderDatilCustomizeService;

@Validation(value = {
    @ValidationRuleGroup(
            value = "7e31e38d9d4b4f2cb9a8f424773d08d1",
            rules = {
            }
    ),
    @ValidationRuleGroup(
            value = "ca69e41cbaec465d8706c1e6df233422",
            rules = {
            }
    ),
})
@PostMapping("/api/lcplogics/loadingPurchaseOrderDatil")
public ApiReturn<com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_00C696A2C37E41565D1436EC4B43FEA3> loadingPurchaseOrderDatil(@RequestBody LoadingPurchaseOrderDatilCustomizeControllerDto body) throws Exception {
 return ApiReturn.of(loadingPurchaseOrderDatilCustomizeService.loadingPurchaseOrderDatil(body.getPurchaseOrderId()));
}
}
