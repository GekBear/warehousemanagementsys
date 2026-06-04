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
* auto generate LoadShelf_management2TableViewCustomizeService logic
*
* @author sys
*/
@Service
public class LoadShelf_management2TableViewCustomizeService {
    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
	@Autowired private LoadShelf_management2TableViewCustomizeServiceMapper loadShelf_management2TableViewCustomizeServiceMapper;

	public com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_C44A97AE66B0191EB85DF6302F208131  loadShelf_management2TableView(Long page,Long size,String sort,String order,ShelfEntity filter) {
		com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_C44A97AE66B0191EB85DF6302F208131 result = new com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_C44A97AE66B0191EB85DF6302F208131();
		result=CommonFunctionUtil.createListPage(loadShelf_management2TableViewCustomizeServiceMapper.getAnonymousStructure_C44A97AE66B0191EB85DF6302F208131(filter,size,getTableField("AnonymousStructure_526C85F2D10E7248E14A48D4B7183AB9",sort),page,order), loadShelf_management2TableViewCustomizeServiceMapper.countAnonymousStructure_C44A97AE66B0191EB85DF6302F208131(filter,size,getTableField("AnonymousStructure_526C85F2D10E7248E14A48D4B7183AB9",sort),page,order).intValue(), com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_C44A97AE66B0191EB85DF6302F208131.class);
		return result;
	}

    private static Map<String, Map<String, String>> structureTableColumnMap = new HashMap<>();
    private static Map<String, Map<String, List<String>>> structurePropFieldMap = new HashMap<>();
    static {
        Map<String, List<String>> propColumnMap = null;
        Map<String,String> tableColumnMap = null;
        if (structureTableColumnMap.get("AnonymousStructure_526C85F2D10E7248E14A48D4B7183AB9") == null) {
        structureTableColumnMap.put("AnonymousStructure_526C85F2D10E7248E14A48D4B7183AB9",new HashMap<String, String>());
        }
        tableColumnMap = structureTableColumnMap.get("AnonymousStructure_526C85F2D10E7248E14A48D4B7183AB9");
            tableColumnMap.put("warehouse.id","`warehouse`.`id`");
            tableColumnMap.put("warehouse.updatedBy","`warehouse`.`updated_by`");
            tableColumnMap.put("warehouse.warehouseName","`warehouse`.`warehouse_name`");
            tableColumnMap.put("warehouse.createdTime","`warehouse`.`created_time`");
            tableColumnMap.put("warehouse.createdBy","`warehouse`.`created_by`");
            tableColumnMap.put("shelf.shelfName","`shelf`.`shelf_name`");
            tableColumnMap.put("shelf.createdTime","`shelf`.`created_time`");
            tableColumnMap.put("shelf.createdBy","`shelf`.`created_by`");
            tableColumnMap.put("warehouse.updatedTime","`warehouse`.`updated_time`");
            tableColumnMap.put("shelf.id","`shelf`.`id`");
            tableColumnMap.put("shelf.updatedTime","`shelf`.`updated_time`");
            tableColumnMap.put("shelf.wareId","`shelf`.`ware_id`");
            tableColumnMap.put("shelf.updatedBy","`shelf`.`updated_by`");
        if (structurePropFieldMap.get("AnonymousStructure_526C85F2D10E7248E14A48D4B7183AB9") == null) {
            structurePropFieldMap.put("AnonymousStructure_526C85F2D10E7248E14A48D4B7183AB9",new HashMap<String, List<String>>());
        }
         propColumnMap = structurePropFieldMap.get("AnonymousStructure_526C85F2D10E7248E14A48D4B7183AB9");
        if (propColumnMap.get("updatedTime") == null){
            propColumnMap.put("updatedTime", new ArrayList<>());
            }
            propColumnMap.get("updatedTime").add("warehouse.updatedTime");
            propColumnMap.get("updatedTime").add("shelf.updatedTime");
        if (propColumnMap.get("updatedBy") == null){
            propColumnMap.put("updatedBy", new ArrayList<>());
            }
            propColumnMap.get("updatedBy").add("warehouse.updatedBy");
            propColumnMap.get("updatedBy").add("shelf.updatedBy");
        if (propColumnMap.get("wareId") == null){
            propColumnMap.put("wareId", new ArrayList<>());
            }
            propColumnMap.get("wareId").add("shelf.wareId");
        if (propColumnMap.get("createdBy") == null){
            propColumnMap.put("createdBy", new ArrayList<>());
            }
            propColumnMap.get("createdBy").add("warehouse.createdBy");
            propColumnMap.get("createdBy").add("shelf.createdBy");
        if (propColumnMap.get("createdTime") == null){
            propColumnMap.put("createdTime", new ArrayList<>());
            }
            propColumnMap.get("createdTime").add("warehouse.createdTime");
            propColumnMap.get("createdTime").add("shelf.createdTime");
        if (propColumnMap.get("id") == null){
            propColumnMap.put("id", new ArrayList<>());
            }
            propColumnMap.get("id").add("warehouse.id");
            propColumnMap.get("id").add("shelf.id");
        if (propColumnMap.get("warehouseName") == null){
            propColumnMap.put("warehouseName", new ArrayList<>());
            }
            propColumnMap.get("warehouseName").add("warehouse.warehouseName");
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
