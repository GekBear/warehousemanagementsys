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
* auto generate LoadSupplier_managerTableView1CustomizeController logic
*
* @author sys
*/
@RestController
public class LoadSupplier_managerTableView1CustomizeController {

@Autowired private LoadSupplier_managerTableView1CustomizeService loadSupplier_managerTableView1CustomizeService;

@Validation(value = {
    @ValidationRuleGroup(
            value = "c6816161-2f68-4308-b613-55bd8bd71206",
            rules = {
            }
    ),
})
@PostMapping("/api/lcplogics/loadSupplier_managerTableView1")
public ApiReturn<com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_15236DED8CD807484AC741CD838A113B> loadSupplier_managerTableView1(@RequestBody LoadSupplier_managerTableView1CustomizeControllerDto body) throws Exception {
 return ApiReturn.of(loadSupplier_managerTableView1CustomizeService.loadSupplier_managerTableView1(body.getPage(),body.getSize(),body.getSort(),body.getOrder(),body.getFilter(),body.getSupplierID()));
}
}
