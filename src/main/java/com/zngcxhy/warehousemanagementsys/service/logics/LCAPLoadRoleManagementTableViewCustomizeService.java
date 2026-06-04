package com.zngcxhy.warehousemanagementsys.service.logics;

import com.zngcxhy.warehousemanagementsys.config.Constants;
import com.zngcxhy.warehousemanagementsys.context.UserContext;
import com.zngcxhy.warehousemanagementsys.util.*;
import com.zngcxhy.warehousemanagementsys.domain.*;
import com.zngcxhy.warehousemanagementsys.domain.enumeration.*;
import com.zngcxhy.warehousemanagementsys.service.*;
import com.zngcxhy.warehousemanagementsys.service.dto.filters.*;
import com.zngcxhy.warehousemanagementsys.service.dto.filters.atomic.*;
import com.zngcxhy.warehousemanagementsys.service.dto.filters.logic.binary.*;
import com.zngcxhy.warehousemanagementsys.service.dto.filters.logic.binary.calculate.*;
import com.zngcxhy.warehousemanagementsys.service.dto.filters.logic.binary.compare.*;
import com.zngcxhy.warehousemanagementsys.service.dto.filters.logic.binary.logicCalculate.*;
import com.zngcxhy.warehousemanagementsys.service.dto.filters.logic.binary.matching.*;
import com.zngcxhy.warehousemanagementsys.service.dto.filters.logic.unary.*;
import com.zngcxhy.warehousemanagementsys.repository.*;
import com.zngcxhy.warehousemanagementsys.exception.HttpCodeException;
import com.zngcxhy.warehousemanagementsys.service.system.configuration.*;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.sql.Blob;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
import java.lang.reflect.Field;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.scheduling.annotation.Scheduled;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.math.RoundingMode;
import com.zngcxhy.warehousemanagementsys.domain.structure.*;
import com.zngcxhy.warehousemanagementsys.domain.entities.*;
import com.zngcxhy.warehousemanagementsys.functional.FunctionContainer;
import com.zngcxhy.warehousemanagementsys.service.entities.*;

/**
* auto generate LCAPLoadRoleManagementTableViewCustomizeService logic
*
* @author sys
*/
@Service
public class LCAPLoadRoleManagementTableViewCustomizeService {
    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
	@Autowired private LCAPLoadRoleManagementTableViewCustomizeServiceMapper lCAPLoadRoleManagementTableViewCustomizeServiceMapper;

	public com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_CAC5152BAE2C91DD609E3DFEE343ACC6  lCAPLoadRoleManagementTableView(Long page,Long size,String sort,String order,LCAPRole filter) {
		com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_CAC5152BAE2C91DD609E3DFEE343ACC6 result = new com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_CAC5152BAE2C91DD609E3DFEE343ACC6();
		result=CommonFunctionUtil.createListPage(lCAPLoadRoleManagementTableViewCustomizeServiceMapper.getAnonymousStructure_CAC5152BAE2C91DD609E3DFEE343ACC6(filter,size,getTableField("AnonymousStructure_70791B893F53C2EFB9E501591763B020",sort),page,order), lCAPLoadRoleManagementTableViewCustomizeServiceMapper.countAnonymousStructure_CAC5152BAE2C91DD609E3DFEE343ACC6(filter,size,getTableField("AnonymousStructure_70791B893F53C2EFB9E501591763B020",sort),page,order).intValue(), com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_CAC5152BAE2C91DD609E3DFEE343ACC6.class);
		return result;
	}

    private static Map<String, Map<String, String>> structureTableColumnMap = new HashMap<>();
    private static Map<String, Map<String, List<String>>> structurePropFieldMap = new HashMap<>();
    static {
        Map<String, List<String>> propColumnMap = null;
        Map<String,String> tableColumnMap = null;
        if (structureTableColumnMap.get("AnonymousStructure_70791B893F53C2EFB9E501591763B020") == null) {
        structureTableColumnMap.put("AnonymousStructure_70791B893F53C2EFB9E501591763B020",new HashMap<String, String>());
        }
        tableColumnMap = structureTableColumnMap.get("AnonymousStructure_70791B893F53C2EFB9E501591763B020");
            tableColumnMap.put("lCAPRole.name","`lcap_role_6568a7`.`name`");
            tableColumnMap.put("lCAPRole.createdBy","`lcap_role_6568a7`.`created_by`");
            tableColumnMap.put("lCAPRole.updatedTime","`lcap_role_6568a7`.`updated_time`");
            tableColumnMap.put("lCAPRole.updatedBy","`lcap_role_6568a7`.`updated_by`");
            tableColumnMap.put("lCAPRole.id","`lcap_role_6568a7`.`id`");
            tableColumnMap.put("lCAPRole.createdTime","`lcap_role_6568a7`.`created_time`");
            tableColumnMap.put("lCAPRole.description","`lcap_role_6568a7`.`description`");
            tableColumnMap.put("lCAPRole.editable","`lcap_role_6568a7`.`editable`");
            tableColumnMap.put("lCAPRole.uuid","`lcap_role_6568a7`.`uuid`");
            tableColumnMap.put("lCAPRole.roleStatus","`lcap_role_6568a7`.`role_status`");
        if (structurePropFieldMap.get("AnonymousStructure_70791B893F53C2EFB9E501591763B020") == null) {
            structurePropFieldMap.put("AnonymousStructure_70791B893F53C2EFB9E501591763B020",new HashMap<String, List<String>>());
        }
         propColumnMap = structurePropFieldMap.get("AnonymousStructure_70791B893F53C2EFB9E501591763B020");
        if (propColumnMap.get("updatedTime") == null){
            propColumnMap.put("updatedTime", new ArrayList<>());
            }
            propColumnMap.get("updatedTime").add("lCAPRole.updatedTime");
        if (propColumnMap.get("updatedBy") == null){
            propColumnMap.put("updatedBy", new ArrayList<>());
            }
            propColumnMap.get("updatedBy").add("lCAPRole.updatedBy");
        if (propColumnMap.get("createdBy") == null){
            propColumnMap.put("createdBy", new ArrayList<>());
            }
            propColumnMap.get("createdBy").add("lCAPRole.createdBy");
        if (propColumnMap.get("editable") == null){
            propColumnMap.put("editable", new ArrayList<>());
            }
            propColumnMap.get("editable").add("lCAPRole.editable");
        if (propColumnMap.get("name") == null){
            propColumnMap.put("name", new ArrayList<>());
            }
            propColumnMap.get("name").add("lCAPRole.name");
        if (propColumnMap.get("description") == null){
            propColumnMap.put("description", new ArrayList<>());
            }
            propColumnMap.get("description").add("lCAPRole.description");
        if (propColumnMap.get("createdTime") == null){
            propColumnMap.put("createdTime", new ArrayList<>());
            }
            propColumnMap.get("createdTime").add("lCAPRole.createdTime");
        if (propColumnMap.get("id") == null){
            propColumnMap.put("id", new ArrayList<>());
            }
            propColumnMap.get("id").add("lCAPRole.id");
        if (propColumnMap.get("uuid") == null){
            propColumnMap.put("uuid", new ArrayList<>());
            }
            propColumnMap.get("uuid").add("lCAPRole.uuid");
        if (propColumnMap.get("roleStatus") == null){
            propColumnMap.put("roleStatus", new ArrayList<>());
            }
            propColumnMap.get("roleStatus").add("lCAPRole.roleStatus");
    }
    private String getTableField(String structureName, String param) {
        if (structurePropFieldMap.get(structureName) == null) {
            return param;
        }
        if (param == null || "".equals(param)) {
            return null;
        }
        Map<String, String> tableColumnMap = structureTableColumnMap.get(structureName);
        Map<String, List<String>> propColumnMap = structurePropFieldMap.get(structureName);
        String[] paramSplit = param.split("\\.");
        if (paramSplit.length == 1) {
            List<String> propList = propColumnMap.get(paramSplit[0]);
            String tableColumn = getTableColumn(propList, tableColumnMap);
            if (tableColumn != null) {
                return tableColumn;
            }
        } else if (tableColumnMap.get(param) != null) {
            return tableColumnMap.get(param);
        }
        throw new HttpCodeException(404, "排序参数{" + param + "}不存在");
    }

    // for sonar check Cognitive Complexity
    private String getTableColumn(List<String> propList, Map<String, String> tableColumnMap) {
        String tableColumn = null;
        if (propList != null) {
            for (String prop : propList) {
                String str = tableColumnMap.get(prop);
                if (str == null || "".equals(str)) {
                    continue;
                }
                if (tableColumn == null) {
                    tableColumn = str;
                } else {
                    tableColumn = str.length() >= tableColumn.length() ? tableColumn : str;
                }
            }
        }

        return tableColumn;
    }

    public  <T> T getObjectTableField(String structureName,T obj,List<String> fieldNames) {
        try {
            T cloneObj = CommonFunctionUtil.clone(obj);
            for (String fieldRef : fieldNames) {
                String[] fieldNameSplit = fieldRef.split("\\.");
                Field field = obj.getClass().getDeclaredField(fieldNameSplit[0]);
                Object fieldObject = cloneObj;
                for (int fieldIndex = 1; fieldIndex < fieldNameSplit.length; fieldIndex++) {
                    fieldObject = field.get(fieldObject);
                    field = field.getType().getDeclaredField(fieldNameSplit[fieldIndex]);
                }
                    field.set(fieldObject, getTableField(structureName, (String) field.get(fieldObject)));
                }
                return cloneObj;
            } catch (Exception e) {
                throw new HttpCodeException("500", e);
            }
    }
}
