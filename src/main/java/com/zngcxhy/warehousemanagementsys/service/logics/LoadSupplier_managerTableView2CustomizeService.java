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
* auto generate LoadSupplier_managerTableView2CustomizeService logic
*
* @author sys
*/
@Service
public class LoadSupplier_managerTableView2CustomizeService {
    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
	@Autowired private LoadSupplier_managerTableView2CustomizeServiceMapper loadSupplier_managerTableView2CustomizeServiceMapper;

	public com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_00C696A2C37E41565D1436EC4B43FEA3  loadSupplier_managerTableView2(Long page,Long size,String sort,String order,Long purchaisId) {
		com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_00C696A2C37E41565D1436EC4B43FEA3 result = new com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_00C696A2C37E41565D1436EC4B43FEA3();
		result=CommonFunctionUtil.createListPage(loadSupplier_managerTableView2CustomizeServiceMapper.getAnonymousStructure_00C696A2C37E41565D1436EC4B43FEA3(purchaisId,size,getTableField("AnonymousStructure_28406730B11920D8D74F4BCB897DBD72",sort),page,order), loadSupplier_managerTableView2CustomizeServiceMapper.countAnonymousStructure_00C696A2C37E41565D1436EC4B43FEA3(purchaisId,size,getTableField("AnonymousStructure_28406730B11920D8D74F4BCB897DBD72",sort),page,order).intValue(), com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_00C696A2C37E41565D1436EC4B43FEA3.class);
		return result;
	}

    private static Map<String, Map<String, String>> structureTableColumnMap = new HashMap<>();
    private static Map<String, Map<String, List<String>>> structurePropFieldMap = new HashMap<>();
    static {
        Map<String, List<String>> propColumnMap = null;
        Map<String,String> tableColumnMap = null;
        if (structureTableColumnMap.get("AnonymousStructure_28406730B11920D8D74F4BCB897DBD72") == null) {
        structureTableColumnMap.put("AnonymousStructure_28406730B11920D8D74F4BCB897DBD72",new HashMap<String, String>());
        }
        tableColumnMap = structureTableColumnMap.get("AnonymousStructure_28406730B11920D8D74F4BCB897DBD72");
            tableColumnMap.put("purchaseOrderDetai.productID","`purchase_order_detai`.`product_i_d`");
            tableColumnMap.put("purchaseOrderDetai.unitPrice","`purchase_order_detai`.`unit_price`");
            tableColumnMap.put("purchaseOrderDetai.totalAmount","`purchase_order_detai`.`total_amount`");
            tableColumnMap.put("purchaseOrderDetai.productname","`purchase_order_detai`.`productname`");
            tableColumnMap.put("purchaseOrderDetai.createdBy","`purchase_order_detai`.`created_by`");
            tableColumnMap.put("purchaseOrderDetai.orderID","`purchase_order_detai`.`order_i_d`");
            tableColumnMap.put("purchaseOrderDetai.id","`purchase_order_detai`.`id`");
            tableColumnMap.put("purchaseOrderDetai.createdTime","`purchase_order_detai`.`created_time`");
            tableColumnMap.put("purchaseOrderDetai.updatedTime","`purchase_order_detai`.`updated_time`");
            tableColumnMap.put("purchaseOrderDetai.updatedBy","`purchase_order_detai`.`updated_by`");
            tableColumnMap.put("purchaseOrderDetai.quantity","`purchase_order_detai`.`quantity`");
        if (structurePropFieldMap.get("AnonymousStructure_28406730B11920D8D74F4BCB897DBD72") == null) {
            structurePropFieldMap.put("AnonymousStructure_28406730B11920D8D74F4BCB897DBD72",new HashMap<String, List<String>>());
        }
         propColumnMap = structurePropFieldMap.get("AnonymousStructure_28406730B11920D8D74F4BCB897DBD72");
        if (propColumnMap.get("unitPrice") == null){
            propColumnMap.put("unitPrice", new ArrayList<>());
            }
            propColumnMap.get("unitPrice").add("purchaseOrderDetai.unitPrice");
        if (propColumnMap.get("totalAmount") == null){
            propColumnMap.put("totalAmount", new ArrayList<>());
            }
            propColumnMap.get("totalAmount").add("purchaseOrderDetai.totalAmount");
        if (propColumnMap.get("updatedTime") == null){
            propColumnMap.put("updatedTime", new ArrayList<>());
            }
            propColumnMap.get("updatedTime").add("purchaseOrderDetai.updatedTime");
        if (propColumnMap.get("quantity") == null){
            propColumnMap.put("quantity", new ArrayList<>());
            }
            propColumnMap.get("quantity").add("purchaseOrderDetai.quantity");
        if (propColumnMap.get("updatedBy") == null){
            propColumnMap.put("updatedBy", new ArrayList<>());
            }
            propColumnMap.get("updatedBy").add("purchaseOrderDetai.updatedBy");
        if (propColumnMap.get("productID") == null){
            propColumnMap.put("productID", new ArrayList<>());
            }
            propColumnMap.get("productID").add("purchaseOrderDetai.productID");
        if (propColumnMap.get("orderID") == null){
            propColumnMap.put("orderID", new ArrayList<>());
            }
            propColumnMap.get("orderID").add("purchaseOrderDetai.orderID");
        if (propColumnMap.get("createdBy") == null){
            propColumnMap.put("createdBy", new ArrayList<>());
            }
            propColumnMap.get("createdBy").add("purchaseOrderDetai.createdBy");
        if (propColumnMap.get("productname") == null){
            propColumnMap.put("productname", new ArrayList<>());
            }
            propColumnMap.get("productname").add("purchaseOrderDetai.productname");
        if (propColumnMap.get("createdTime") == null){
            propColumnMap.put("createdTime", new ArrayList<>());
            }
            propColumnMap.get("createdTime").add("purchaseOrderDetai.createdTime");
        if (propColumnMap.get("id") == null){
            propColumnMap.put("id", new ArrayList<>());
            }
            propColumnMap.get("id").add("purchaseOrderDetai.id");
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
