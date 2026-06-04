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
* auto generate LoadShelf_managementTableViewCustomizeService logic
*
* @author sys
*/
@Service
public class LoadShelf_managementTableViewCustomizeService {
    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
	@Autowired private LoadShelf_managementTableViewCustomizeServiceMapper loadShelf_managementTableViewCustomizeServiceMapper;

	public com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_7F0FC9CD7C0E19CDEBEF556E681E6B3C  loadShelf_managementTableView(Long page,Long size,String sort,String order,ShelfEntity filter) {
		com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_7F0FC9CD7C0E19CDEBEF556E681E6B3C result = new com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_7F0FC9CD7C0E19CDEBEF556E681E6B3C();
		result=CommonFunctionUtil.createListPage(loadShelf_managementTableViewCustomizeServiceMapper.getAnonymousStructure_7F0FC9CD7C0E19CDEBEF556E681E6B3C(filter,size,getTableField("AnonymousStructure_F30C4D4796DE57EC4963423784B62512",sort),page,order), loadShelf_managementTableViewCustomizeServiceMapper.countAnonymousStructure_7F0FC9CD7C0E19CDEBEF556E681E6B3C(filter,size,getTableField("AnonymousStructure_F30C4D4796DE57EC4963423784B62512",sort),page,order).intValue(), com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_7F0FC9CD7C0E19CDEBEF556E681E6B3C.class);
		return result;
	}

    private static Map<String, Map<String, String>> structureTableColumnMap = new HashMap<>();
    private static Map<String, Map<String, List<String>>> structurePropFieldMap = new HashMap<>();
    static {
        Map<String, List<String>> propColumnMap = null;
        Map<String,String> tableColumnMap = null;
        if (structureTableColumnMap.get("AnonymousStructure_F30C4D4796DE57EC4963423784B62512") == null) {
        structureTableColumnMap.put("AnonymousStructure_F30C4D4796DE57EC4963423784B62512",new HashMap<String, String>());
        }
        tableColumnMap = structureTableColumnMap.get("AnonymousStructure_F30C4D4796DE57EC4963423784B62512");
            tableColumnMap.put("shelf.createdBy","`shelf`.`created_by`");
            tableColumnMap.put("shelf.id","`shelf`.`id`");
            tableColumnMap.put("shelf.updatedTime","`shelf`.`updated_time`");
            tableColumnMap.put("shelf.shelfName","`shelf`.`shelf_name`");
            tableColumnMap.put("shelf.wareId","`shelf`.`ware_id`");
            tableColumnMap.put("shelf.createdTime","`shelf`.`created_time`");
            tableColumnMap.put("shelf.updatedBy","`shelf`.`updated_by`");
        if (structurePropFieldMap.get("AnonymousStructure_F30C4D4796DE57EC4963423784B62512") == null) {
            structurePropFieldMap.put("AnonymousStructure_F30C4D4796DE57EC4963423784B62512",new HashMap<String, List<String>>());
        }
         propColumnMap = structurePropFieldMap.get("AnonymousStructure_F30C4D4796DE57EC4963423784B62512");
        if (propColumnMap.get("updatedTime") == null){
            propColumnMap.put("updatedTime", new ArrayList<>());
            }
            propColumnMap.get("updatedTime").add("shelf.updatedTime");
        if (propColumnMap.get("updatedBy") == null){
            propColumnMap.put("updatedBy", new ArrayList<>());
            }
            propColumnMap.get("updatedBy").add("shelf.updatedBy");
        if (propColumnMap.get("wareId") == null){
            propColumnMap.put("wareId", new ArrayList<>());
            }
            propColumnMap.get("wareId").add("shelf.wareId");
        if (propColumnMap.get("createdBy") == null){
            propColumnMap.put("createdBy", new ArrayList<>());
            }
            propColumnMap.get("createdBy").add("shelf.createdBy");
        if (propColumnMap.get("createdTime") == null){
            propColumnMap.put("createdTime", new ArrayList<>());
            }
            propColumnMap.get("createdTime").add("shelf.createdTime");
        if (propColumnMap.get("id") == null){
            propColumnMap.put("id", new ArrayList<>());
            }
            propColumnMap.get("id").add("shelf.id");
        if (propColumnMap.get("shelfName") == null){
            propColumnMap.put("shelfName", new ArrayList<>());
            }
            propColumnMap.get("shelfName").add("shelf.shelfName");
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
