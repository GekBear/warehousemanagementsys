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
import com.zngcxhy.warehousemanagementsys.domain.entities.DocumentsEntity;
import com.zngcxhy.warehousemanagementsys.domain.enumeration.*;
import com.zngcxhy.warehousemanagementsys.service.entities.DocumentsEntityService;
import com.zngcxhy.warehousemanagementsys.web.ApiReturn;
import com.zngcxhy.warehousemanagementsys.service.dto.filters.EntityFilter;
import com.zngcxhy.warehousemanagementsys.service.dto.filters.AbstractQueryFilter;
import com.zngcxhy.warehousemanagementsys.service.dto.filters.FilterWrapper;
import com.zngcxhy.warehousemanagementsys.domain.PageOf;
import com.zngcxhy.warehousemanagementsys.util.JacksonUtils;
import com.zngcxhy.warehousemanagementsys.web.validation.*;

/**
* auto generate DocumentsEntity controller
*
* @author sys
*/
@RestController
public class DocumentsEntityController {
    @Resource
    private DocumentsEntityService service;

    /**
    * auto gen create method
    **/
    @Validation(value = {
        @ValidationRuleGroup(
                value = "27de3f41548345df923563d2d6c7094c",
                rules = {
                @ValidationRule(value = "required", targetName = "body.tax_rate", argvs = ""),
                @ValidationRule(value = "required", targetName = "body.pay", argvs = ""),
                }
        ),
        @ValidationRuleGroup(
                value = "67bda7223ea840fabbc4c277cec66921",
                rules = {
                @ValidationRule(value = "required", targetName = "body.tax_rate", argvs = ""),
                @ValidationRule(value = "required", targetName = "body.pay", argvs = ""),
                }
        ),
    })
    @PostMapping("/api/documents")
    public ApiReturn<DocumentsEntity> create(@RequestBody DocumentsEntity body) {
        return ApiReturn.of(service.create(body));
    }


    /**
    * auto gen update method
    **/
    @Validation(value = {
        @ValidationRuleGroup(
                value = "ed767fe6ff3b4f63a75eeb5b7a7aa07d",
                rules = {
                }
        ),
    })
    @PutMapping("/api/documents")
    public ApiReturn<DocumentsEntity> update(@RequestBody EntityFilter filter) {
        if (filter == null || filter.getEntity() == null) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, "");
        }
        Map map = filter.getEntity();
        DocumentsEntity entity = JacksonUtils.fromJson(map, DocumentsEntity.class);
        List<String> updateFields = filter.getProperties();
        return ApiReturn.of(service.update(entity, updateFields));
    }






    /**
    * auto gen import method
    **/
    @PostMapping("/api/documents/import")
    public ApiReturn<String> importEntities(@RequestParam("file") MultipartFile file) {
        return ApiReturn.of(service.importFile(file));
    }



}