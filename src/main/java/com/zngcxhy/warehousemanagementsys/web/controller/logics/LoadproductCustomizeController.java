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
* auto generate LoadproductCustomizeController logic
*
* @author sys
*/
@RestController
public class LoadproductCustomizeController {

@Autowired private LoadproductCustomizeService loadproductCustomizeService;

@Validation(value = {
    @ValidationRuleGroup(
            value = "8402635a-51b7-42ad-bfa2-d3cf5138b162",
            rules = {
            }
    ),
    @ValidationRuleGroup(
            value = "684a7040-9e44-4ec9-a29a-e95b640a253c",
            rules = {
            }
    ),
    @ValidationRuleGroup(
            value = "b8e05036f8694a2c9f95efb6be2a8297",
            rules = {
            }
    ),
})
@PostMapping("/api/lcplogics/loadproduct")
public ApiReturn<com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_E03BAD4CA7266D3FC9D0ED04DB665CDA> loadproduct(@RequestBody LoadproductCustomizeControllerDto body) throws Exception {
 return ApiReturn.of(loadproductCustomizeService.loadproduct(body.getSupplierId()));
}
}
