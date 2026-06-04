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
import com.zngcxhy.warehousemanagementsys.domain.entities.ProductEntity;
import com.zngcxhy.warehousemanagementsys.domain.enumeration.*;
import com.zngcxhy.warehousemanagementsys.service.entities.ProductEntityService;
import com.zngcxhy.warehousemanagementsys.web.ApiReturn;
import com.zngcxhy.warehousemanagementsys.service.dto.filters.EntityFilter;
import com.zngcxhy.warehousemanagementsys.service.dto.filters.AbstractQueryFilter;
import com.zngcxhy.warehousemanagementsys.service.dto.filters.FilterWrapper;
import com.zngcxhy.warehousemanagementsys.domain.PageOf;
import com.zngcxhy.warehousemanagementsys.util.JacksonUtils;
import com.zngcxhy.warehousemanagementsys.web.validation.*;

/**
* auto generate ProductEntity controller
*
* @author sys
*/
@RestController
public class ProductEntityController {
    @Resource
    private ProductEntityService service;

    /**
    * auto gen create method
    **/
    @Validation(value = {
        @ValidationRuleGroup(
                value = "666642f8105a4ee08ed27aee4640ef02",
                rules = {
                @ValidationRule(value = "required", targetName = "body.productName", argvs = ""),
                @ValidationRule(value = "required", targetName = "body.description", argvs = ""),
                @ValidationRule(value = "required", targetName = "body.unit1", argvs = ""),
                @ValidationRule(value = "required", targetName = "body.stockQuantity", argvs = ""),
                @ValidationRule(value = "maxLength", targetName = "body.product_potot", argvs = "{\"max\":4000}"),
                @ValidationRule(value = "required", targetName = "body.product_potot", argvs = ""),
                }
        ),
    })
    @PostMapping("/api/product")
    public ApiReturn<ProductEntity> create(@RequestBody ProductEntity body) {
        return ApiReturn.of(service.create(body));
    }


    /**
    * auto gen update method
    **/
    @Validation(value = {
        @ValidationRuleGroup(
                value = "f3c115483db34cfaba0abe41ba92ce4d",
                rules = {
                }
        ),
        @ValidationRuleGroup(
                value = "e217182dcdf142ff8d8de025b148c073",
                rules = {
                @ValidationRule(value = "required", targetName = "filter.entity.productName", argvs = ""),
                @ValidationRule(value = "required", targetName = "filter.entity.description", argvs = ""),
                @ValidationRule(value = "required", targetName = "filter.entity.unit1", argvs = ""),
                @ValidationRule(value = "required", targetName = "filter.entity.stockQuantity", argvs = ""),
                @ValidationRule(value = "maxLength", targetName = "filter.entity.product_potot", argvs = "{\"max\":4000}"),
                @ValidationRule(value = "required", targetName = "filter.entity.product_potot", argvs = ""),
                }
        ),
    })
    @PutMapping("/api/product")
    public ApiReturn<ProductEntity> update(@RequestBody EntityFilter filter) {
        if (filter == null || filter.getEntity() == null) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, "");
        }
        Map map = filter.getEntity();
        ProductEntity entity = JacksonUtils.fromJson(map, ProductEntity.class);
        List<String> updateFields = filter.getProperties();
        return ApiReturn.of(service.update(entity, updateFields));
    }



    /**
    * auto gen delete method
    **/
    @Validation(value = {
        @ValidationRuleGroup(
                value = "e198c8b3fa3f4f15825660ce008ae553",
                rules = {
                }
        ),
    })
    @DeleteMapping("/api/product")
    public ApiReturn<Long> delete( @RequestParam(required = true) Long id ) { 
        return ApiReturn.of(service.delete( id )); 
    }



    /**
    * auto gen import method
    **/
    @PostMapping("/api/product/import")
    public ApiReturn<String> importEntities(@RequestParam("file") MultipartFile file) {
        return ApiReturn.of(service.importFile(file));
    }



}