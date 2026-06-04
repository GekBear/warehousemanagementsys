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
import com.zngcxhy.warehousemanagementsys.domain.entities.ShelfEntity;
import com.zngcxhy.warehousemanagementsys.domain.enumeration.*;
import com.zngcxhy.warehousemanagementsys.service.entities.ShelfEntityService;
import com.zngcxhy.warehousemanagementsys.web.ApiReturn;
import com.zngcxhy.warehousemanagementsys.service.dto.filters.EntityFilter;
import com.zngcxhy.warehousemanagementsys.service.dto.filters.AbstractQueryFilter;
import com.zngcxhy.warehousemanagementsys.service.dto.filters.FilterWrapper;
import com.zngcxhy.warehousemanagementsys.domain.PageOf;
import com.zngcxhy.warehousemanagementsys.util.JacksonUtils;
import com.zngcxhy.warehousemanagementsys.web.validation.*;

/**
* auto generate ShelfEntity controller
*
* @author sys
*/
@RestController
public class ShelfEntityController {
    @Resource
    private ShelfEntityService service;

    /**
    * auto gen create method
    **/
    @Validation(value = {
        @ValidationRuleGroup(
                value = "48ee061721444ddead4ba7e91981ce2e",
                rules = {
                @ValidationRule(value = "required", targetName = "body.shelfName", argvs = ""),
                }
        ),
    })
    @PostMapping("/api/shelf")
    public ApiReturn<ShelfEntity> create(@RequestBody ShelfEntity body) {
        return ApiReturn.of(service.create(body));
    }


    /**
    * auto gen update method
    **/
    @Validation(value = {
        @ValidationRuleGroup(
                value = "e18e03c29bde4cd18949aa1734f3196e",
                rules = {
                @ValidationRule(value = "required", targetName = "filter.entity.shelfName", argvs = ""),
                }
        ),
    })
    @PutMapping("/api/shelf")
    public ApiReturn<ShelfEntity> update(@RequestBody EntityFilter filter) {
        if (filter == null || filter.getEntity() == null) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, "");
        }
        Map map = filter.getEntity();
        ShelfEntity entity = JacksonUtils.fromJson(map, ShelfEntity.class);
        List<String> updateFields = filter.getProperties();
        return ApiReturn.of(service.update(entity, updateFields));
    }



    /**
    * auto gen delete method
    **/
    @Validation(value = {
        @ValidationRuleGroup(
                value = "1336bd88d6ba4eae892789e48e8736ed",
                rules = {
                }
        ),
    })
    @DeleteMapping("/api/shelf")
    public ApiReturn<Long> delete( @RequestParam(required = true) Long id ) { 
        return ApiReturn.of(service.delete( id )); 
    }



    /**
    * auto gen import method
    **/
    @PostMapping("/api/shelf/import")
    public ApiReturn<String> importEntities(@RequestParam("file") MultipartFile file) {
        return ApiReturn.of(service.importFile(file));
    }



}