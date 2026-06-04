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
* auto generate LoadInventory_managementTableViewCustomizeService logic
*
* @author sys
*/
@Service
public class LoadInventory_managementTableViewCustomizeService {
    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
	@Autowired private LoadInventory_managementTableViewCustomizeServiceMapper loadInventory_managementTableViewCustomizeServiceMapper;

	public com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_D973E5D521E557621AB6C7C329CD488F  loadInventory_managementTableView(Long page,Long size,String sort,String order,ProductEntity filter) {
		com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_D973E5D521E557621AB6C7C329CD488F result = new com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_D973E5D521E557621AB6C7C329CD488F();
		result=CommonFunctionUtil.createListPage(loadInventory_managementTableViewCustomizeServiceMapper.getAnonymousStructure_D973E5D521E557621AB6C7C329CD488F(filter,size,getTableField("AnonymousStructure_9ECE35F6B2A89475F87BB2D49DE0DDB8",sort),page,order), loadInventory_managementTableViewCustomizeServiceMapper.countAnonymousStructure_D973E5D521E557621AB6C7C329CD488F(filter,size,getTableField("AnonymousStructure_9ECE35F6B2A89475F87BB2D49DE0DDB8",sort),page,order).intValue(), com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_D973E5D521E557621AB6C7C329CD488F.class);
		return result;
	}

    private static Map<String, Map<String, String>> structureTableColumnMap = new HashMap<>();
    private static Map<String, Map<String, List<String>>> structurePropFieldMap = new HashMap<>();
    static {
        Map<String, List<String>> propColumnMap = null;
        Map<String,String> tableColumnMap = null;
        if (structureTableColumnMap.get("AnonymousStructure_9ECE35F6B2A89475F87BB2D49DE0DDB8") == null) {
        structureTableColumnMap.put("AnonymousStructure_9ECE35F6B2A89475F87BB2D49DE0DDB8",new HashMap<String, String>());
        }
        tableColumnMap = structureTableColumnMap.get("AnonymousStructure_9ECE35F6B2A89475F87BB2D49DE0DDB8");
            tableColumnMap.put("product.createdTime","`product`.`created_time`");
            tableColumnMap.put("product.stockQuantity","`product`.`stock_quantity`");
            tableColumnMap.put("product.productName","`product`.`product_name`");
            tableColumnMap.put("product.id","`product`.`id`");
            tableColumnMap.put("product.updatedBy","`product`.`updated_by`");
            tableColumnMap.put("product.product_potot","`product`.`product_potot`");
            tableColumnMap.put("product.unit1","`product`.`unit1`");
            tableColumnMap.put("product.supplierName","`product`.`supplier_name`");
            tableColumnMap.put("product.updatedTime","`product`.`updated_time`");
            tableColumnMap.put("product.description","`product`.`description`");
            tableColumnMap.put("product.supillerId","`product`.`supiller_id`");
            tableColumnMap.put("product.createdBy","`product`.`created_by`");
        if (structurePropFieldMap.get("AnonymousStructure_9ECE35F6B2A89475F87BB2D49DE0DDB8") == null) {
            structurePropFieldMap.put("AnonymousStructure_9ECE35F6B2A89475F87BB2D49DE0DDB8",new HashMap<String, List<String>>());
        }
         propColumnMap = structurePropFieldMap.get("AnonymousStructure_9ECE35F6B2A89475F87BB2D49DE0DDB8");
        if (propColumnMap.get("supplierName") == null){
            propColumnMap.put("supplierName", new ArrayList<>());
            }
            propColumnMap.get("supplierName").add("product.supplierName");
        if (propColumnMap.get("supillerId") == null){
            propColumnMap.put("supillerId", new ArrayList<>());
            }
            propColumnMap.get("supillerId").add("product.supillerId");
        if (propColumnMap.get("updatedTime") == null){
            propColumnMap.put("updatedTime", new ArrayList<>());
            }
            propColumnMap.get("updatedTime").add("product.updatedTime");
        if (propColumnMap.get("updatedBy") == null){
            propColumnMap.put("updatedBy", new ArrayList<>());
            }
            propColumnMap.get("updatedBy").add("product.updatedBy");
        if (propColumnMap.get("createdBy") == null){
            propColumnMap.put("createdBy", new ArrayList<>());
            }
            propColumnMap.get("createdBy").add("product.createdBy");
        if (propColumnMap.get("unit1") == null){
            propColumnMap.put("unit1", new ArrayList<>());
            }
            propColumnMap.get("unit1").add("product.unit1");
        if (propColumnMap.get("stockQuantity") == null){
            propColumnMap.put("stockQuantity", new ArrayList<>());
            }
            propColumnMap.get("stockQuantity").add("product.stockQuantity");
        if (propColumnMap.get("description") == null){
            propColumnMap.put("description", new ArrayList<>());
            }
            propColumnMap.get("description").add("product.description");
        if (propColumnMap.get("createdTime") == null){
            propColumnMap.put("createdTime", new ArrayList<>());
            }
            propColumnMap.get("createdTime").add("product.createdTime");
        if (propColumnMap.get("product_potot") == null){
            propColumnMap.put("product_potot", new ArrayList<>());
            }
            propColumnMap.get("product_potot").add("product.product_potot");
        if (propColumnMap.get("id") == null){
            propColumnMap.put("id", new ArrayList<>());
            }
            propColumnMap.get("id").add("product.id");
        if (propColumnMap.get("productName") == null){
            propColumnMap.put("productName", new ArrayList<>());
            }
            propColumnMap.get("productName").add("product.productName");
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
