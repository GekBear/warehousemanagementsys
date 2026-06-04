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
* auto generate LoadPurchase_of_productsGridViewCustomizeController logic
*
* @author sys
*/
@RestController
public class LoadPurchase_of_productsGridViewCustomizeController {

@Autowired private LoadPurchase_of_productsGridViewCustomizeService loadPurchase_of_productsGridViewCustomizeService;

@Validation(value = {
    @ValidationRuleGroup(
            value = "6ec5576bb36847588eaec4621a9f5ef5",
            rules = {
            }
    ),
})
@PostMapping("/api/lcplogics/loadPurchase_of_productsGridView")
public ApiReturn<com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_D973E5D521E557621AB6C7C329CD488F> loadPurchase_of_productsGridView(@RequestBody LoadPurchase_of_productsGridViewCustomizeControllerDto body) throws Exception {
 return ApiReturn.of(loadPurchase_of_productsGridViewCustomizeService.loadPurchase_of_productsGridView(body.getPage(),body.getSize(),body.getSort(),body.getOrder(),body.getSupplierID(),body.getIdList()));
}
}
