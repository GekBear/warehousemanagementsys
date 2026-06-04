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
import com.zngcxhy.warehousemanagementsys.domain.entities.PurchaseOrderEntity;
import com.zngcxhy.warehousemanagementsys.domain.enumeration.*;
import com.zngcxhy.warehousemanagementsys.service.entities.PurchaseOrderEntityService;
import com.zngcxhy.warehousemanagementsys.web.ApiReturn;
import com.zngcxhy.warehousemanagementsys.service.dto.filters.EntityFilter;
import com.zngcxhy.warehousemanagementsys.service.dto.filters.AbstractQueryFilter;
import com.zngcxhy.warehousemanagementsys.service.dto.filters.FilterWrapper;
import com.zngcxhy.warehousemanagementsys.domain.PageOf;
import com.zngcxhy.warehousemanagementsys.util.JacksonUtils;
import com.zngcxhy.warehousemanagementsys.web.validation.*;

/**
* auto generate PurchaseOrderEntity controller
*
* @author sys
*/
@RestController
public class PurchaseOrderEntityController {
    @Resource
    private PurchaseOrderEntityService service;

    /**
    * auto gen create method
    **/
    @Validation(value = {
        @ValidationRuleGroup(
                value = "6c1b05e70c2048ecbc830afeb1afe6d4",
                rules = {
                @ValidationRule(value = "required", targetName = "body.expectedDeliveryDate", argvs = ""),
                @ValidationRule(value = "required", targetName = "body.delivery_order", argvs = ""),
                }
        ),
        @ValidationRuleGroup(
                value = "4487ab22a4b44ce8bff2726e62f13ab9",
                rules = {
                @ValidationRule(value = "required", targetName = "body.expectedDeliveryDate", argvs = ""),
                @ValidationRule(value = "required", targetName = "body.delivery_order", argvs = ""),
                }
        ),
    })
    @PostMapping("/api/purchase-order")
    public ApiReturn<PurchaseOrderEntity> create(@RequestBody PurchaseOrderEntity body) {
        return ApiReturn.of(service.create(body));
    }


    /**
    * auto gen update method
    **/
    @Validation(value = {
        @ValidationRuleGroup(
                value = "5c04038396d34d309f8d7bf7f4641130",
                rules = {
                }
        ),
        @ValidationRuleGroup(
                value = "a989674da16a42b481cc5d752bd43e39",
                rules = {
                @ValidationRule(value = "required", targetName = "filter.entity.expectedDeliveryDate", argvs = ""),
                @ValidationRule(value = "required", targetName = "filter.entity.delivery_order", argvs = ""),
                }
        ),
        @ValidationRuleGroup(
                value = "220c3118d83b47559e5d73b10e0fdc92",
                rules = {
                @ValidationRule(value = "required", targetName = "filter.entity.expectedDeliveryDate", argvs = ""),
                @ValidationRule(value = "required", targetName = "filter.entity.delivery_order", argvs = ""),
                }
        ),
        @ValidationRuleGroup(
                value = "ebf769fea3114c489b87a3a188eec638",
                rules = {
                }
        ),
        @ValidationRuleGroup(
                value = "4d53fc9566064ae19f3210399ab49be6",
                rules = {
                @ValidationRule(value = "required", targetName = "filter.entity.id", argvs = ""),
                }
        ),
        @ValidationRuleGroup(
                value = "ad6469fc9caf465398df257a7013cbca",
                rules = {
                @ValidationRule(value = "required", targetName = "filter.entity.expectedDeliveryDate", argvs = ""),
                @ValidationRule(value = "required", targetName = "filter.entity.delivery_order", argvs = ""),
                }
        ),
        @ValidationRuleGroup(
                value = "88d4ce5546dd498d89e3c8baaa499808",
                rules = {
                }
        ),
        @ValidationRuleGroup(
                value = "37195fff8b2f4d529647839108c9689d",
                rules = {
                }
        ),
    })
    @PutMapping("/api/purchase-order")
    public ApiReturn<PurchaseOrderEntity> update(@RequestBody EntityFilter filter) {
        if (filter == null || filter.getEntity() == null) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, "");
        }
        Map map = filter.getEntity();
        PurchaseOrderEntity entity = JacksonUtils.fromJson(map, PurchaseOrderEntity.class);
        List<String> updateFields = filter.getProperties();
        return ApiReturn.of(service.update(entity, updateFields));
    }



    /**
    * auto gen delete method
    **/
    @Validation(value = {
        @ValidationRuleGroup(
                value = "c89590e5-7b1f-4dbb-9c6d-ad1d2cec38ba",
                rules = {
                }
        ),
        @ValidationRuleGroup(
                value = "7e182286-7063-4c6b-a57f-e67acb167914",
                rules = {
                }
        ),
    })
    @DeleteMapping("/api/purchase-order")
    public ApiReturn<Long> delete( @RequestParam(required = true) Long id ) { 
        return ApiReturn.of(service.delete( id )); 
    }



    /**
    * auto gen import method
    **/
    @PostMapping("/api/purchase-order/import")
    public ApiReturn<String> importEntities(@RequestParam("file") MultipartFile file) {
        return ApiReturn.of(service.importFile(file));
    }



}