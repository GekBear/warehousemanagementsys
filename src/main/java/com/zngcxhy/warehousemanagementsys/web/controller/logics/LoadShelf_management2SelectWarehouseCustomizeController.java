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
* auto generate LoadShelf_management2SelectWarehouseCustomizeController logic
*
* @author sys
*/
@RestController
public class LoadShelf_management2SelectWarehouseCustomizeController {

@Autowired private LoadShelf_management2SelectWarehouseCustomizeService loadShelf_management2SelectWarehouseCustomizeService;

@Validation(value = {
    @ValidationRuleGroup(
            value = "e2a9c0c3f82c47b19f475aef1b8f7a65",
            rules = {
            }
    ),
    @ValidationRuleGroup(
            value = "d22822fad2214a29aa60d37e9e59eb41",
            rules = {
            }
    ),
})
@PostMapping("/api/lcplogics/loadShelf_management2SelectWarehouse")
public ApiReturn<com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_F38430154A940234D722FC75BC91969C> loadShelf_management2SelectWarehouse(@RequestBody LoadShelf_management2SelectWarehouseCustomizeControllerDto body) throws Exception {
 return ApiReturn.of(loadShelf_management2SelectWarehouseCustomizeService.loadShelf_management2SelectWarehouse(body.getPage(),body.getSize()));
}
}
