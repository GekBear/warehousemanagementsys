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
import com.zngcxhy.warehousemanagementsys.domain.entities.AfterSalesRequestEntity;
import com.zngcxhy.warehousemanagementsys.domain.enumeration.*;
import com.zngcxhy.warehousemanagementsys.service.entities.AfterSalesRequestEntityService;
import com.zngcxhy.warehousemanagementsys.web.ApiReturn;
import com.zngcxhy.warehousemanagementsys.service.dto.filters.EntityFilter;
import com.zngcxhy.warehousemanagementsys.service.dto.filters.AbstractQueryFilter;
import com.zngcxhy.warehousemanagementsys.service.dto.filters.FilterWrapper;
import com.zngcxhy.warehousemanagementsys.domain.PageOf;
import com.zngcxhy.warehousemanagementsys.util.JacksonUtils;
import com.zngcxhy.warehousemanagementsys.web.validation.*;

/**
* auto generate AfterSalesRequestEntity controller
*
* @author sys
*/
@RestController
public class AfterSalesRequestEntityController {
    @Resource
    private AfterSalesRequestEntityService service;

    /**
    * auto gen create method
    **/
    @Validation(value = {
        @ValidationRuleGroup(
                value = "8352e3d399364ac18900ebf5644bdc97",
                rules = {
                @ValidationRule(value = "required", targetName = "body.orderID", argvs = ""),
                @ValidationRule(value = "required", targetName = "body.requestType", argvs = ""),
                @ValidationRule(value = "maxLength", targetName = "body.requestDescription", argvs = "{\"max\":4000}"),
                @ValidationRule(value = "required", targetName = "body.requestDescription", argvs = ""),
                @ValidationRule(value = "required", targetName = "body.requestType", argvs = ""),
                @ValidationRule(value = "maxLength", targetName = "body.requestDescription", argvs = "{\"max\":4000}"),
                @ValidationRule(value = "required", targetName = "body.requestDescription", argvs = ""),
                }
        ),
    })
    @PostMapping("/api/after-sales-request")
    public ApiReturn<AfterSalesRequestEntity> create(@RequestBody AfterSalesRequestEntity body) {
        return ApiReturn.of(service.create(body));
    }


    /**
    * auto gen update method
    **/
    @Validation(value = {
        @ValidationRuleGroup(
                value = "caaeb81186fd47e09542b33c28df1911",
                rules = {
                @ValidationRule(value = "required", targetName = "filter.entity.orderID", argvs = ""),
                @ValidationRule(value = "required", targetName = "filter.entity.requestType", argvs = ""),
                @ValidationRule(value = "maxLength", targetName = "filter.entity.requestDescription", argvs = "{\"max\":4000}"),
                @ValidationRule(value = "required", targetName = "filter.entity.requestDescription", argvs = ""),
                @ValidationRule(value = "required", targetName = "filter.entity.requestType", argvs = ""),
                @ValidationRule(value = "maxLength", targetName = "filter.entity.requestDescription", argvs = "{\"max\":4000}"),
                @ValidationRule(value = "required", targetName = "filter.entity.requestDescription", argvs = ""),
                }
        ),
        @ValidationRuleGroup(
                value = "c151a775c41849919e53468ad585b479",
                rules = {
                }
        ),
        @ValidationRuleGroup(
                value = "62c6f7f33850446e82ef138e83910dcc",
                rules = {
                }
        ),
    })
    @PutMapping("/api/after-sales-request")
    public ApiReturn<AfterSalesRequestEntity> update(@RequestBody EntityFilter filter) {
        if (filter == null || filter.getEntity() == null) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, "");
        }
        Map map = filter.getEntity();
        AfterSalesRequestEntity entity = JacksonUtils.fromJson(map, AfterSalesRequestEntity.class);
        List<String> updateFields = filter.getProperties();
        return ApiReturn.of(service.update(entity, updateFields));
    }



    /**
    * auto gen delete method
    **/
    @Validation(value = {
        @ValidationRuleGroup(
                value = "e27b5459-3c52-4baa-8d47-59bf378262b9",
                rules = {
                }
        ),
    })
    @DeleteMapping("/api/after-sales-request")
    public ApiReturn<Long> delete( @RequestParam(required = true) Long id ) { 
        return ApiReturn.of(service.delete( id )); 
    }



    /**
    * auto gen import method
    **/
    @PostMapping("/api/after-sales-request/import")
    public ApiReturn<String> importEntities(@RequestParam("file") MultipartFile file) {
        return ApiReturn.of(service.importFile(file));
    }



}