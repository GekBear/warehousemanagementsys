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
* auto generate LoadAddRoleUserTableViewCustomizeService logic
*
* @author sys
*/
@Service
public class LoadAddRoleUserTableViewCustomizeService {
    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
	@Autowired private LoadAddRoleUserTableViewCustomizeServiceMapper loadAddRoleUserTableViewCustomizeServiceMapper;

	public com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_A43B95DDE943F37E89AA74CCF8732C90  loadAddRoleUserTableView(Long page,Long size,String sort,String order) {
		com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_A43B95DDE943F37E89AA74CCF8732C90 result = new com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_A43B95DDE943F37E89AA74CCF8732C90();
		result=CommonFunctionUtil.createListPage(loadAddRoleUserTableViewCustomizeServiceMapper.getAnonymousStructure_A43B95DDE943F37E89AA74CCF8732C90(size,getTableField("AnonymousStructure_99BA20F3093BB3AC3F3CA0BCA6D65EB8",sort),page,order), loadAddRoleUserTableViewCustomizeServiceMapper.countAnonymousStructure_A43B95DDE943F37E89AA74CCF8732C90(size,getTableField("AnonymousStructure_99BA20F3093BB3AC3F3CA0BCA6D65EB8",sort),page,order).intValue(), com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_A43B95DDE943F37E89AA74CCF8732C90.class);
		return result;
	}

    private static Map<String, Map<String, String>> structureTableColumnMap = new HashMap<>();
    private static Map<String, Map<String, List<String>>> structurePropFieldMap = new HashMap<>();
    static {
        Map<String, List<String>> propColumnMap = null;
        Map<String,String> tableColumnMap = null;
        if (structureTableColumnMap.get("AnonymousStructure_99BA20F3093BB3AC3F3CA0BCA6D65EB8") == null) {
        structureTableColumnMap.put("AnonymousStructure_99BA20F3093BB3AC3F3CA0BCA6D65EB8",new HashMap<String, String>());
        }
        tableColumnMap = structureTableColumnMap.get("AnonymousStructure_99BA20F3093BB3AC3F3CA0BCA6D65EB8");
            tableColumnMap.put("lCAPUserRoleMapping.createdTime","`lcap_user_role_mapping_6568a7`.`created_time`");
            tableColumnMap.put("lCAPRole.updatedTime","`lcap_role_6568a7`.`updated_time`");
            tableColumnMap.put("lCAPRole.updatedBy","`lcap_role_6568a7`.`updated_by`");
            tableColumnMap.put("lCAPRole.editable","`lcap_role_6568a7`.`editable`");
            tableColumnMap.put("lCAPUserRoleMapping.createdBy","`lcap_user_role_mapping_6568a7`.`created_by`");
            tableColumnMap.put("lCAPUserRoleMapping.updatedTime","`lcap_user_role_mapping_6568a7`.`updated_time`");
            tableColumnMap.put("lCAPUserRoleMapping.userName","`lcap_user_role_mapping_6568a7`.`user_name`");
            tableColumnMap.put("lCAPRole.roleStatus","`lcap_role_6568a7`.`role_status`");
            tableColumnMap.put("lCAPRole.name","`lcap_role_6568a7`.`name`");
            tableColumnMap.put("lCAPRole.createdBy","`lcap_role_6568a7`.`created_by`");
            tableColumnMap.put("lCAPRole.id","`lcap_role_6568a7`.`id`");
            tableColumnMap.put("lCAPRole.createdTime","`lcap_role_6568a7`.`created_time`");
            tableColumnMap.put("lCAPRole.description","`lcap_role_6568a7`.`description`");
            tableColumnMap.put("lCAPUserRoleMapping.updatedBy","`lcap_user_role_mapping_6568a7`.`updated_by`");
            tableColumnMap.put("lCAPUserRoleMapping.source","`lcap_user_role_mapping_6568a7`.`source`");
            tableColumnMap.put("lCAPUserRoleMapping.roleId","`lcap_user_role_mapping_6568a7`.`role_id`");
            tableColumnMap.put("lCAPUserRoleMapping.userId","`lcap_user_role_mapping_6568a7`.`user_id`");
            tableColumnMap.put("lCAPRole.uuid","`lcap_role_6568a7`.`uuid`");
            tableColumnMap.put("lCAPUserRoleMapping.id","`lcap_user_role_mapping_6568a7`.`id`");
        if (structurePropFieldMap.get("AnonymousStructure_99BA20F3093BB3AC3F3CA0BCA6D65EB8") == null) {
            structurePropFieldMap.put("AnonymousStructure_99BA20F3093BB3AC3F3CA0BCA6D65EB8",new HashMap<String, List<String>>());
        }
         propColumnMap = structurePropFieldMap.get("AnonymousStructure_99BA20F3093BB3AC3F3CA0BCA6D65EB8");
        if (propColumnMap.get("updatedTime") == null){
            propColumnMap.put("updatedTime", new ArrayList<>());
            }
            propColumnMap.get("updatedTime").add("lCAPRole.updatedTime");
            propColumnMap.get("updatedTime").add("lCAPUserRoleMapping.updatedTime");
        if (propColumnMap.get("updatedBy") == null){
            propColumnMap.put("updatedBy", new ArrayList<>());
            }
            propColumnMap.get("updatedBy").add("lCAPRole.updatedBy");
            propColumnMap.get("updatedBy").add("lCAPUserRoleMapping.updatedBy");
        if (propColumnMap.get("roleId") == null){
            propColumnMap.put("roleId", new ArrayList<>());
            }
            propColumnMap.get("roleId").add("lCAPUserRoleMapping.roleId");
        if (propColumnMap.get("editable") == null){
            propColumnMap.put("editable", new ArrayList<>());
            }
            propColumnMap.get("editable").add("lCAPRole.editable");
        if (propColumnMap.get("description") == null){
            propColumnMap.put("description", new ArrayList<>());
            }
            propColumnMap.get("description").add("lCAPRole.description");
        if (propColumnMap.get("source") == null){
            propColumnMap.put("source", new ArrayList<>());
            }
            propColumnMap.get("source").add("lCAPUserRoleMapping.source");
        if (propColumnMap.get("userName") == null){
            propColumnMap.put("userName", new ArrayList<>());
            }
            propColumnMap.get("userName").add("lCAPUserRoleMapping.userName");
        if (propColumnMap.get("userId") == null){
            propColumnMap.put("userId", new ArrayList<>());
            }
            propColumnMap.get("userId").add("lCAPUserRoleMapping.userId");
        if (propColumnMap.get("uuid") == null){
            propColumnMap.put("uuid", new ArrayList<>());
            }
            propColumnMap.get("uuid").add("lCAPRole.uuid");
        if (propColumnMap.get("roleStatus") == null){
            propColumnMap.put("roleStatus", new ArrayList<>());
            }
            propColumnMap.get("roleStatus").add("lCAPRole.roleStatus");
        if (propColumnMap.get("createdBy") == null){
            propColumnMap.put("createdBy", new ArrayList<>());
            }
            propColumnMap.get("createdBy").add("lCAPRole.createdBy");
            propColumnMap.get("createdBy").add("lCAPUserRoleMapping.createdBy");
        if (propColumnMap.get("name") == null){
            propColumnMap.put("name", new ArrayList<>());
            }
            propColumnMap.get("name").add("lCAPRole.name");
        if (propColumnMap.get("createdTime") == null){
            propColumnMap.put("createdTime", new ArrayList<>());
            }
            propColumnMap.get("createdTime").add("lCAPRole.createdTime");
            propColumnMap.get("createdTime").add("lCAPUserRoleMapping.createdTime");
        if (propColumnMap.get("id") == null){
            propColumnMap.put("id", new ArrayList<>());
            }
            propColumnMap.get("id").add("lCAPRole.id");
            propColumnMap.get("id").add("lCAPUserRoleMapping.id");
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
