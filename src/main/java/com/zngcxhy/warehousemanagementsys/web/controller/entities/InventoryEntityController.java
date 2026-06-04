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
import com.zngcxhy.warehousemanagementsys.domain.entities.InventoryEntity;
import com.zngcxhy.warehousemanagementsys.domain.enumeration.*;
import com.zngcxhy.warehousemanagementsys.service.entities.InventoryEntityService;
import com.zngcxhy.warehousemanagementsys.web.ApiReturn;
import com.zngcxhy.warehousemanagementsys.service.dto.filters.EntityFilter;
import com.zngcxhy.warehousemanagementsys.service.dto.filters.AbstractQueryFilter;
import com.zngcxhy.warehousemanagementsys.service.dto.filters.FilterWrapper;
import com.zngcxhy.warehousemanagementsys.domain.PageOf;
import com.zngcxhy.warehousemanagementsys.util.JacksonUtils;
import com.zngcxhy.warehousemanagementsys.web.validation.*;

/**
* auto generate InventoryEntity controller
*
* @author sys
*/
@RestController
public class InventoryEntityController {
    @Resource
    private InventoryEntityService service;

    /**
    * auto gen create method
    **/
    @Validation(value = {
        @ValidationRuleGroup(
                value = "67ae62b6430a45de91c0936479566d50",
                rules = {
                @ValidationRule(value = "required", targetName = "body.productId", argvs = ""),
                @ValidationRule(value = "required", targetName = "body.supplierId", argvs = ""),
                @ValidationRule(value = "required", targetName = "body.shelfId", argvs = ""),
                @ValidationRule(value = "required", targetName = "body.productnumber", argvs = ""),
                @ValidationRule(value = "required", targetName = "body.inwarehouseId", argvs = ""),
                }
        ),
        @ValidationRuleGroup(
                value = "2110891bdaf04e22b98e52336ac35c13",
                rules = {
                @ValidationRule(value = "required", targetName = "body.productId", argvs = ""),
                @ValidationRule(value = "required", targetName = "body.supplierId", argvs = ""),
                @ValidationRule(value = "required", targetName = "body.shelfId", argvs = ""),
                @ValidationRule(value = "required", targetName = "body.productnumber", argvs = ""),
                @ValidationRule(value = "required", targetName = "body.inwarehouseId", argvs = ""),
                }
        ),
    })
    @PostMapping("/api/inventory")
    public ApiReturn<InventoryEntity> create(@RequestBody InventoryEntity body) {
        return ApiReturn.of(service.create(body));
    }


    /**
    * auto gen update method
    **/
    @Validation(value = {
        @ValidationRuleGroup(
                value = "af9c6c57769147519d5b5f66c7680607",
                rules = {
                @ValidationRule(value = "required", targetName = "filter.entity.productId", argvs = ""),
                @ValidationRule(value = "required", targetName = "filter.entity.supplierId", argvs = ""),
                @ValidationRule(value = "required", targetName = "filter.entity.shelfId", argvs = ""),
                @ValidationRule(value = "required", targetName = "filter.entity.productnumber", argvs = ""),
                @ValidationRule(value = "required", targetName = "filter.entity.inwarehouseId", argvs = ""),
                }
        ),
        @ValidationRuleGroup(
                value = "d36c9ffcf8654de7a7e08cb90c1b19cc",
                rules = {
                }
        ),
    })
    @PutMapping("/api/inventory")
    public ApiReturn<InventoryEntity> update(@RequestBody EntityFilter filter) {
        if (filter == null || filter.getEntity() == null) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, "");
        }
        Map map = filter.getEntity();
        InventoryEntity entity = JacksonUtils.fromJson(map, InventoryEntity.class);
        List<String> updateFields = filter.getProperties();
        return ApiReturn.of(service.update(entity, updateFields));
    }



    /**
    * auto gen delete method
    **/
    @Validation(value = {
        @ValidationRuleGroup(
                value = "d52514aa9c9a4dcfa474604338212f57",
                rules = {
                }
        ),
    })
    @DeleteMapping("/api/inventory")
    public ApiReturn<Long> delete( @RequestParam(required = true) Long id ) { 
        return ApiReturn.of(service.delete( id )); 
    }



    /**
    * auto gen import method
    **/
    @PostMapping("/api/inventory/import")
    public ApiReturn<String> importEntities(@RequestParam("file") MultipartFile file) {
        return ApiReturn.of(service.importFile(file));
    }



}