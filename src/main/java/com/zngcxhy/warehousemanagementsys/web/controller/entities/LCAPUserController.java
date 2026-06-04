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
import com.zngcxhy.warehousemanagementsys.domain.entities.LCAPUser;
import com.zngcxhy.warehousemanagementsys.domain.enumeration.*;
import com.zngcxhy.warehousemanagementsys.service.entities.LCAPUserService;
import com.zngcxhy.warehousemanagementsys.web.ApiReturn;
import com.zngcxhy.warehousemanagementsys.service.dto.filters.EntityFilter;
import com.zngcxhy.warehousemanagementsys.service.dto.filters.AbstractQueryFilter;
import com.zngcxhy.warehousemanagementsys.service.dto.filters.FilterWrapper;
import com.zngcxhy.warehousemanagementsys.domain.PageOf;
import com.zngcxhy.warehousemanagementsys.util.JacksonUtils;
import com.zngcxhy.warehousemanagementsys.web.validation.*;

/**
* auto generate LCAPUser controller
*
* @author sys
*/
@RestController
public class LCAPUserController {
    @Resource
    private LCAPUserService service;

    /**
    * auto gen create method
    **/
    @Validation(value = {
        @ValidationRuleGroup(
                value = "775e97be796b4929aea9b35397f50854",
                rules = {
                @ValidationRule(value = "filled", targetName = "body.userName", argvs = ""),
                @ValidationRule(value = "mobile", targetName = "body.phone", argvs = "{\"locale\":\"zh-CN\",\"strict\":null}"),
                @ValidationRule(value = "email", targetName = "body.email", argvs = ""),
                }
        ),
        @ValidationRuleGroup(
                value = "ba4f6f45ce714697b95a5b8f7b2b06c5",
                rules = {
                }
        ),
    })
    @PostMapping("/api/l-c-a-p-user")
    public ApiReturn<LCAPUser> create(@RequestBody LCAPUser body) {
        return ApiReturn.of(service.create(body));
    }


    /**
    * auto gen update method
    **/
    @Validation(value = {
        @ValidationRuleGroup(
                value = "1a390860-6be2-4e63-95f3-feedf55ead41",
                rules = {
                }
        ),
        @ValidationRuleGroup(
                value = "6fd6deca1ba74926a27e76bb2d319250",
                rules = {
                @ValidationRule(value = "filled", targetName = "filter.entity.userName", argvs = ""),
                @ValidationRule(value = "mobile", targetName = "filter.entity.phone", argvs = "{\"locale\":\"zh-CN\",\"strict\":null}"),
                @ValidationRule(value = "email", targetName = "filter.entity.email", argvs = ""),
                }
        ),
        @ValidationRuleGroup(
                value = "0c302857-310b-40b6-856c-755723992483",
                rules = {
                }
        ),
        @ValidationRuleGroup(
                value = "450474a4-a2fb-4ac7-9271-196549a13873",
                rules = {
                }
        ),
        @ValidationRuleGroup(
                value = "da8b108a-0828-4954-9e72-8c92b6a46e4e",
                rules = {
                }
        ),
    })
    @PutMapping("/api/l-c-a-p-user")
    public ApiReturn<LCAPUser> update(@RequestBody EntityFilter filter) {
        if (filter == null || filter.getEntity() == null) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, "");
        }
        Map map = filter.getEntity();
        LCAPUser entity = JacksonUtils.fromJson(map, LCAPUser.class);
        List<String> updateFields = filter.getProperties();
        return ApiReturn.of(service.update(entity, updateFields));
    }



    /**
    * auto gen delete method
    **/
    @Validation(value = {
        @ValidationRuleGroup(
                value = "6d5e5bb1b1754825ab17a119e1433fdb",
                rules = {
                }
        ),
    })
    @DeleteMapping("/api/l-c-a-p-user")
    public ApiReturn<Long> delete( @RequestParam(required = true) Long id ) { 
        return ApiReturn.of(service.delete( id )); 
    }



    /**
    * auto gen import method
    **/
    @PostMapping("/api/l-c-a-p-user/import")
    public ApiReturn<String> importEntities(@RequestParam("file") MultipartFile file) {
        return ApiReturn.of(service.importFile(file));
    }



}