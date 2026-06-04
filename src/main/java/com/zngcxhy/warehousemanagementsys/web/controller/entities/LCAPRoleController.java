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
import com.zngcxhy.warehousemanagementsys.domain.entities.LCAPRole;
import com.zngcxhy.warehousemanagementsys.domain.enumeration.*;
import com.zngcxhy.warehousemanagementsys.service.entities.LCAPRoleService;
import com.zngcxhy.warehousemanagementsys.web.ApiReturn;
import com.zngcxhy.warehousemanagementsys.service.dto.filters.EntityFilter;
import com.zngcxhy.warehousemanagementsys.service.dto.filters.AbstractQueryFilter;
import com.zngcxhy.warehousemanagementsys.service.dto.filters.FilterWrapper;
import com.zngcxhy.warehousemanagementsys.domain.PageOf;
import com.zngcxhy.warehousemanagementsys.util.JacksonUtils;
import com.zngcxhy.warehousemanagementsys.web.validation.*;

/**
* auto generate LCAPRole controller
*
* @author sys
*/
@RestController
public class LCAPRoleController {
    @Resource
    private LCAPRoleService service;

    /**
    * auto gen create method
    **/
    @Validation(value = {
        @ValidationRuleGroup(
                value = "24984f03f7664239aed2d7da2523fab5",
                rules = {
                @ValidationRule(value = "required", targetName = "body.name", argvs = ""),
                }
        ),
        @ValidationRuleGroup(
                value = "4bf39a3e86284c09a9d03e64b1d293b5",
                rules = {
                @ValidationRule(value = "required", targetName = "body.name", argvs = ""),
                }
        ),
    })
    @PostMapping("/api/l-c-a-p-role")
    public ApiReturn<LCAPRole> create(@RequestBody LCAPRole body) {
        return ApiReturn.of(service.create(body));
    }


    /**
    * auto gen update method
    **/
    @Validation(value = {
        @ValidationRuleGroup(
                value = "fd59b09e022d498c8f78a3a9b460f34f",
                rules = {
                @ValidationRule(value = "required", targetName = "filter.entity.name", argvs = ""),
                }
        ),
        @ValidationRuleGroup(
                value = "31f8f52ddb7542279626f06a58eb2dd4",
                rules = {
                }
        ),
    })
    @PutMapping("/api/l-c-a-p-role")
    public ApiReturn<LCAPRole> update(@RequestBody EntityFilter filter) {
        if (filter == null || filter.getEntity() == null) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, "");
        }
        Map map = filter.getEntity();
        LCAPRole entity = JacksonUtils.fromJson(map, LCAPRole.class);
        List<String> updateFields = filter.getProperties();
        return ApiReturn.of(service.update(entity, updateFields));
    }



    /**
    * auto gen delete method
    **/
    @Validation(value = {
        @ValidationRuleGroup(
                value = "a0ff47a13c7e4062a0e450f65c05f517",
                rules = {
                }
        ),
        @ValidationRuleGroup(
                value = "32abe51881c744b1935571e693189b96",
                rules = {
                }
        ),
    })
    @DeleteMapping("/api/l-c-a-p-role")
    public ApiReturn<Long> delete( @RequestParam(required = true) Long id ) { 
        return ApiReturn.of(service.delete( id )); 
    }


    /**
    * auto gen get method
    **/
    @Validation(value = {
        @ValidationRuleGroup(
                value = "8ca6393c14ab479b8369d2b3bf7f149b",
                rules = {
                }
        ),
    })
    @GetMapping("/api/l-c-a-p-role")
    public ApiReturn<LCAPRole> get( @RequestParam(required = true) Long id ) { 
        return ApiReturn.of(service.get( id )); 
    }

    /**
    * auto gen import method
    **/
    @PostMapping("/api/l-c-a-p-role/import")
    public ApiReturn<String> importEntities(@RequestParam("file") MultipartFile file) {
        return ApiReturn.of(service.importFile(file));
    }



}