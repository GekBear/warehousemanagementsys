package com.zngcxhy.warehousemanagementsys.web.controller.entities;

import java.io.Serializable;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Arrays;
import java.math.BigDecimal;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.http.*;

import com.zngcxhy.warehousemanagementsys.exception.HttpCodeException;
import com.zngcxhy.warehousemanagementsys.domain.entities.PurchaseContractEntity;
import com.zngcxhy.warehousemanagementsys.domain.enumeration.*;
import com.zngcxhy.warehousemanagementsys.service.entities.PurchaseContractEntityService;
import com.zngcxhy.warehousemanagementsys.web.ApiReturn;
import com.zngcxhy.warehousemanagementsys.service.dto.filters.EntityFilter;
import com.zngcxhy.warehousemanagementsys.service.dto.filters.AbstractQueryFilter;
import com.zngcxhy.warehousemanagementsys.service.dto.filters.FilterWrapper;
import com.zngcxhy.warehousemanagementsys.domain.PageOf;
import com.zngcxhy.warehousemanagementsys.util.JacksonUtils;
import com.zngcxhy.warehousemanagementsys.web.validation.*;

/**
* auto generate PurchaseContractEntity controller
*
* @author sys
*/
@RestController
public class PurchaseContractEntityController {
    @Resource
    private PurchaseContractEntityService service;

    /**
    * auto gen create method
    **/
    @Validation(value = {
        @ValidationRuleGroup(
                value = "6e0eddcd5279492fa830af321328cc01",
                rules = {
                }
        ),
    })
    @PostMapping("/api/purchase-contract")
    public ApiReturn<PurchaseContractEntity> create(@RequestBody PurchaseContractEntity body) {
        return ApiReturn.of(service.create(body));
    }


    /**
    * auto gen update method
    **/
    @Validation(value = {
        @ValidationRuleGroup(
                value = "b41120937dff4f82a4e495f819bb1bfd",
                rules = {
                @ValidationRule(value = "maxLength", targetName = "filter.entity.contractName", argvs = "{\"max\":4000}"),
                @ValidationRule(value = "maxLength", targetName = "filter.entity.contractFile", argvs = "{\"max\":4000}"),
                }
        ),
        @ValidationRuleGroup(
                value = "722e4d098a7847a4a531c3a54c5ebed1",
                rules = {
                @ValidationRule(value = "maxLength", targetName = "filter.entity.contractName", argvs = "{\"max\":4000}"),
                @ValidationRule(value = "maxLength", targetName = "filter.entity.contractFile", argvs = "{\"max\":4000}"),
                }
        ),
    })
    @PutMapping("/api/purchase-contract")
    public ApiReturn<PurchaseContractEntity> update(@RequestBody EntityFilter filter) {
        if (filter == null || filter.getEntity() == null) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, "");
        }
        Map map = filter.getEntity();
        PurchaseContractEntity entity = JacksonUtils.fromJson(map, PurchaseContractEntity.class);
        List<String> updateFields = filter.getProperties();
        return ApiReturn.of(service.update(entity, updateFields));
    }






    /**
    * auto gen import method
    **/
    @PostMapping("/api/purchase-contract/import")
    public ApiReturn<String> importEntities(@RequestParam("file") MultipartFile file) {
        return ApiReturn.of(service.importFile(file));
    }



}