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
* auto generate LoadInventory_managementTableView1CustomizeService logic
*
* @author sys
*/
@Service
public class LoadInventory_managementTableView1CustomizeService {
    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
	@Autowired private LoadInventory_managementTableView1CustomizeServiceMapper loadInventory_managementTableView1CustomizeServiceMapper;

	public com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_8ECE4E13E599F6BD7343D19240C27301  loadInventory_managementTableView1(Long page,Long size,String sort,String order,InventoryEntity filter,Long warehouseId) {
		com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_8ECE4E13E599F6BD7343D19240C27301 result = new com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_8ECE4E13E599F6BD7343D19240C27301();
		result=CommonFunctionUtil.createListPage(loadInventory_managementTableView1CustomizeServiceMapper.getAnonymousStructure_8ECE4E13E599F6BD7343D19240C27301(filter,size,warehouseId,getTableField("AnonymousStructure_CFB8CE5FC8814213A70B859C53A46F48",sort),page,order), loadInventory_managementTableView1CustomizeServiceMapper.countAnonymousStructure_8ECE4E13E599F6BD7343D19240C27301(filter,size,warehouseId,getTableField("AnonymousStructure_CFB8CE5FC8814213A70B859C53A46F48",sort),page,order).intValue(), com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_8ECE4E13E599F6BD7343D19240C27301.class);
		return result;
	}

    private static Map<String, Map<String, String>> structureTableColumnMap = new HashMap<>();
    private static Map<String, Map<String, List<String>>> structurePropFieldMap = new HashMap<>();
    static {
        Map<String, List<String>> propColumnMap = null;
        Map<String,String> tableColumnMap = null;
        if (structureTableColumnMap.get("AnonymousStructure_CFB8CE5FC8814213A70B859C53A46F48") == null) {
        structureTableColumnMap.put("AnonymousStructure_CFB8CE5FC8814213A70B859C53A46F48",new HashMap<String, String>());
        }
        tableColumnMap = structureTableColumnMap.get("AnonymousStructure_CFB8CE5FC8814213A70B859C53A46F48");
            tableColumnMap.put("warehouse.id","`warehouse`.`id`");
            tableColumnMap.put("lCAPUser.userId","`lcap_user_6568a7`.`user_id`");
            tableColumnMap.put("inventory.createdTime","`inventory`.`created_time`");
            tableColumnMap.put("lCAPUser.roleId","`lcap_user_6568a7`.`role_id`");
            tableColumnMap.put("warehouse.createdTime","`warehouse`.`created_time`");
            tableColumnMap.put("product.id","`product`.`id`");
            tableColumnMap.put("inventory.shelfId","`inventory`.`shelf_id`");
            tableColumnMap.put("warehouse.createdBy","`warehouse`.`created_by`");
            tableColumnMap.put("lCAPUser.status","`lcap_user_6568a7`.`status`");
            tableColumnMap.put("product.description","`product`.`description`");
            tableColumnMap.put("product.supillerId","`product`.`supiller_id`");
            tableColumnMap.put("shelf.createdTime","`shelf`.`created_time`");
            tableColumnMap.put("product.createdTime","`product`.`created_time`");
            tableColumnMap.put("shelf.createdBy","`shelf`.`created_by`");
            tableColumnMap.put("inventory.supplierId","`inventory`.`supplier_id`");
            tableColumnMap.put("product.productName","`product`.`product_name`");
            tableColumnMap.put("inventory.productnumber","`inventory`.`productnumber`");
            tableColumnMap.put("warehouse.updatedTime","`warehouse`.`updated_time`");
            tableColumnMap.put("lCAPUser.createdTime","`lcap_user_6568a7`.`created_time`");
            tableColumnMap.put("lCAPUser.password","`lcap_user_6568a7`.`password`");
            tableColumnMap.put("inventory.updatedBy","`inventory`.`updated_by`");
            tableColumnMap.put("inventory.id","`inventory`.`id`");
            tableColumnMap.put("inventory.createdBy","`inventory`.`created_by`");
            tableColumnMap.put("lCAPUser.id","`lcap_user_6568a7`.`id`");
            tableColumnMap.put("lCAPUser.displayName","`lcap_user_6568a7`.`display_name`");
            tableColumnMap.put("shelf.updatedBy","`shelf`.`updated_by`");
            tableColumnMap.put("warehouse.updatedBy","`warehouse`.`updated_by`");
            tableColumnMap.put("warehouse.warehouseName","`warehouse`.`warehouse_name`");
            tableColumnMap.put("inventory.inwarehouseId","`inventory`.`inwarehouse_id`");
            tableColumnMap.put("lCAPUser.updatedTime","`lcap_user_6568a7`.`updated_time`");
            tableColumnMap.put("inventory.updatedTime","`inventory`.`updated_time`");
            tableColumnMap.put("shelf.shelfName","`shelf`.`shelf_name`");
            tableColumnMap.put("lCAPUser.userName","`lcap_user_6568a7`.`user_name`");
            tableColumnMap.put("product.updatedTime","`product`.`updated_time`");
            tableColumnMap.put("inventory.productId","`inventory`.`product_id`");
            tableColumnMap.put("product.stockQuantity","`product`.`stock_quantity`");
            tableColumnMap.put("lCAPUser.email","`lcap_user_6568a7`.`email`");
            tableColumnMap.put("product.updatedBy","`product`.`updated_by`");
            tableColumnMap.put("shelf.id","`shelf`.`id`");
            tableColumnMap.put("product.product_potot","`product`.`product_potot`");
            tableColumnMap.put("product.unit1","`product`.`unit1`");
            tableColumnMap.put("lCAPUser.phone","`lcap_user_6568a7`.`phone`");
            tableColumnMap.put("shelf.updatedTime","`shelf`.`updated_time`");
            tableColumnMap.put("product.supplierName","`product`.`supplier_name`");
            tableColumnMap.put("shelf.wareId","`shelf`.`ware_id`");
            tableColumnMap.put("product.createdBy","`product`.`created_by`");
            tableColumnMap.put("lCAPUser.source","`lcap_user_6568a7`.`source`");
        if (structurePropFieldMap.get("AnonymousStructure_CFB8CE5FC8814213A70B859C53A46F48") == null) {
            structurePropFieldMap.put("AnonymousStructure_CFB8CE5FC8814213A70B859C53A46F48",new HashMap<String, List<String>>());
        }
         propColumnMap = structurePropFieldMap.get("AnonymousStructure_CFB8CE5FC8814213A70B859C53A46F48");
        if (propColumnMap.get("shelfId") == null){
            propColumnMap.put("shelfId", new ArrayList<>());
            }
            propColumnMap.get("shelfId").add("inventory.shelfId");
        if (propColumnMap.get("supplierId") == null){
            propColumnMap.put("supplierId", new ArrayList<>());
            }
            propColumnMap.get("supplierId").add("inventory.supplierId");
        if (propColumnMap.get("displayName") == null){
            propColumnMap.put("displayName", new ArrayList<>());
            }
            propColumnMap.get("displayName").add("lCAPUser.displayName");
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
        if (propColumnMap.get("source") == null){
            propColumnMap.put("source", new ArrayList<>());
            }
            propColumnMap.get("source").add("lCAPUser.source");
        if (propColumnMap.get("warehouseName") == null){
            propColumnMap.put("warehouseName", new ArrayList<>());
            }
            propColumnMap.get("warehouseName").add("warehouse.warehouseName");
        if (propColumnMap.get("shelfName") == null){
            propColumnMap.put("shelfName", new ArrayList<>());
            }
            propColumnMap.get("shelfName").add("shelf.shelfName");
        if (propColumnMap.get("productName") == null){
            propColumnMap.put("productName", new ArrayList<>());
            }
            propColumnMap.get("productName").add("product.productName");
        if (propColumnMap.get("password") == null){
            propColumnMap.put("password", new ArrayList<>());
            }
            propColumnMap.get("password").add("lCAPUser.password");
        if (propColumnMap.get("createdTime") == null){
            propColumnMap.put("createdTime", new ArrayList<>());
            }
            propColumnMap.get("createdTime").add("product.createdTime");
            propColumnMap.get("createdTime").add("warehouse.createdTime");
            propColumnMap.get("createdTime").add("lCAPUser.createdTime");
            propColumnMap.get("createdTime").add("inventory.createdTime");
            propColumnMap.get("createdTime").add("shelf.createdTime");
        if (propColumnMap.get("product_potot") == null){
            propColumnMap.put("product_potot", new ArrayList<>());
            }
            propColumnMap.get("product_potot").add("product.product_potot");
        if (propColumnMap.get("id") == null){
            propColumnMap.put("id", new ArrayList<>());
            }
            propColumnMap.get("id").add("product.id");
            propColumnMap.get("id").add("warehouse.id");
            propColumnMap.get("id").add("lCAPUser.id");
            propColumnMap.get("id").add("inventory.id");
            propColumnMap.get("id").add("shelf.id");
        if (propColumnMap.get("email") == null){
            propColumnMap.put("email", new ArrayList<>());
            }
            propColumnMap.get("email").add("lCAPUser.email");
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
            propColumnMap.get("updatedTime").add("warehouse.updatedTime");
            propColumnMap.get("updatedTime").add("lCAPUser.updatedTime");
            propColumnMap.get("updatedTime").add("inventory.updatedTime");
            propColumnMap.get("updatedTime").add("shelf.updatedTime");
        if (propColumnMap.get("updatedBy") == null){
            propColumnMap.put("updatedBy", new ArrayList<>());
            }
            propColumnMap.get("updatedBy").add("product.updatedBy");
            propColumnMap.get("updatedBy").add("warehouse.updatedBy");
            propColumnMap.get("updatedBy").add("inventory.updatedBy");
            propColumnMap.get("updatedBy").add("shelf.updatedBy");
        if (propColumnMap.get("wareId") == null){
            propColumnMap.put("wareId", new ArrayList<>());
            }
            propColumnMap.get("wareId").add("shelf.wareId");
        if (propColumnMap.get("productId") == null){
            propColumnMap.put("productId", new ArrayList<>());
            }
            propColumnMap.get("productId").add("inventory.productId");
        if (propColumnMap.get("roleId") == null){
            propColumnMap.put("roleId", new ArrayList<>());
            }
            propColumnMap.get("roleId").add("lCAPUser.roleId");
        if (propColumnMap.get("inwarehouseId") == null){
            propColumnMap.put("inwarehouseId", new ArrayList<>());
            }
            propColumnMap.get("inwarehouseId").add("inventory.inwarehouseId");
        if (propColumnMap.get("userName") == null){
            propColumnMap.put("userName", new ArrayList<>());
            }
            propColumnMap.get("userName").add("lCAPUser.userName");
        if (propColumnMap.get("userId") == null){
            propColumnMap.put("userId", new ArrayList<>());
            }
            propColumnMap.get("userId").add("lCAPUser.userId");
        if (propColumnMap.get("phone") == null){
            propColumnMap.put("phone", new ArrayList<>());
            }
            propColumnMap.get("phone").add("lCAPUser.phone");
        if (propColumnMap.get("createdBy") == null){
            propColumnMap.put("createdBy", new ArrayList<>());
            }
            propColumnMap.get("createdBy").add("product.createdBy");
            propColumnMap.get("createdBy").add("warehouse.createdBy");
            propColumnMap.get("createdBy").add("inventory.createdBy");
            propColumnMap.get("createdBy").add("shelf.createdBy");
        if (propColumnMap.get("productnumber") == null){
            propColumnMap.put("productnumber", new ArrayList<>());
            }
            propColumnMap.get("productnumber").add("inventory.productnumber");
        if (propColumnMap.get("status") == null){
            propColumnMap.put("status", new ArrayList<>());
            }
            propColumnMap.get("status").add("lCAPUser.status");
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
