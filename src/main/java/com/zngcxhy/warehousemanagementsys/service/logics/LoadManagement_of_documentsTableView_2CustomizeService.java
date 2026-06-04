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
* auto generate LoadManagement_of_documentsTableView_2CustomizeService logic
*
* @author sys
*/
@Service
public class LoadManagement_of_documentsTableView_2CustomizeService {
    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
	@Autowired private LoadManagement_of_documentsTableView_2CustomizeServiceMapper loadManagement_of_documentsTableView_2CustomizeServiceMapper;

	public com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_15236DED8CD807484AC741CD838A113B  loadManagement_of_documentsTableView_2(Long page,Long size,String sort,String order,PurchaseOrderEntity filter) {
		com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_15236DED8CD807484AC741CD838A113B result = new com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_15236DED8CD807484AC741CD838A113B();
		result=CommonFunctionUtil.createListPage(loadManagement_of_documentsTableView_2CustomizeServiceMapper.getAnonymousStructure_15236DED8CD807484AC741CD838A113B(filter,size,getTableField("AnonymousStructure_B0D6BA4B2283DC4DA976DAF31C826073",sort),page,order), loadManagement_of_documentsTableView_2CustomizeServiceMapper.countAnonymousStructure_15236DED8CD807484AC741CD838A113B(filter,size,getTableField("AnonymousStructure_B0D6BA4B2283DC4DA976DAF31C826073",sort),page,order).intValue(), com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_15236DED8CD807484AC741CD838A113B.class);
		return result;
	}

    private static Map<String, Map<String, String>> structureTableColumnMap = new HashMap<>();
    private static Map<String, Map<String, List<String>>> structurePropFieldMap = new HashMap<>();
    static {
        Map<String, List<String>> propColumnMap = null;
        Map<String,String> tableColumnMap = null;
        if (structureTableColumnMap.get("AnonymousStructure_B0D6BA4B2283DC4DA976DAF31C826073") == null) {
        structureTableColumnMap.put("AnonymousStructure_B0D6BA4B2283DC4DA976DAF31C826073",new HashMap<String, String>());
        }
        tableColumnMap = structureTableColumnMap.get("AnonymousStructure_B0D6BA4B2283DC4DA976DAF31C826073");
            tableColumnMap.put("purchaseOrder.supplierno","`purchase_order`.`supplierno`");
            tableColumnMap.put("purchaseOrder.supplierID","`purchase_order`.`supplier_i_d`");
            tableColumnMap.put("purchaseOrder.no","`purchase_order`.`no`");
            tableColumnMap.put("purchaseOrder.expectedDeliveryDate","`purchase_order`.`expected_delivery_date`");
            tableColumnMap.put("purchaseOrder.orderStatus","`purchase_order`.`order_status`");
            tableColumnMap.put("purchaseOrder.updatedBy","`purchase_order`.`updated_by`");
            tableColumnMap.put("purchaseOrder.createdBy","`purchase_order`.`created_by`");
            tableColumnMap.put("purchaseOrder.createdTime","`purchase_order`.`created_time`");
            tableColumnMap.put("purchaseOrder.supplierName","`purchase_order`.`supplier_name`");
            tableColumnMap.put("purchaseOrder.supplier","`purchase_order`.`supplier`");
            tableColumnMap.put("purchaseOrder.delivery_order","`purchase_order`.`delivery_order`");
            tableColumnMap.put("purchaseOrder.after","`purchase_order`.`after`");
            tableColumnMap.put("purchaseOrder.documents","`purchase_order`.`documents`");
            tableColumnMap.put("purchaseOrder.id","`purchase_order`.`id`");
            tableColumnMap.put("purchaseOrder.manager","`purchase_order`.`manager`");
            tableColumnMap.put("purchaseOrder.updatedTime","`purchase_order`.`updated_time`");
        if (structurePropFieldMap.get("AnonymousStructure_B0D6BA4B2283DC4DA976DAF31C826073") == null) {
            structurePropFieldMap.put("AnonymousStructure_B0D6BA4B2283DC4DA976DAF31C826073",new HashMap<String, List<String>>());
        }
         propColumnMap = structurePropFieldMap.get("AnonymousStructure_B0D6BA4B2283DC4DA976DAF31C826073");
        if (propColumnMap.get("supplierName") == null){
            propColumnMap.put("supplierName", new ArrayList<>());
            }
            propColumnMap.get("supplierName").add("purchaseOrder.supplierName");
        if (propColumnMap.get("no") == null){
            propColumnMap.put("no", new ArrayList<>());
            }
            propColumnMap.get("no").add("purchaseOrder.no");
        if (propColumnMap.get("updatedTime") == null){
            propColumnMap.put("updatedTime", new ArrayList<>());
            }
            propColumnMap.get("updatedTime").add("purchaseOrder.updatedTime");
        if (propColumnMap.get("supplierID") == null){
            propColumnMap.put("supplierID", new ArrayList<>());
            }
            propColumnMap.get("supplierID").add("purchaseOrder.supplierID");
        if (propColumnMap.get("updatedBy") == null){
            propColumnMap.put("updatedBy", new ArrayList<>());
            }
            propColumnMap.get("updatedBy").add("purchaseOrder.updatedBy");
        if (propColumnMap.get("manager") == null){
            propColumnMap.put("manager", new ArrayList<>());
            }
            propColumnMap.get("manager").add("purchaseOrder.manager");
        if (propColumnMap.get("documents") == null){
            propColumnMap.put("documents", new ArrayList<>());
            }
            propColumnMap.get("documents").add("purchaseOrder.documents");
        if (propColumnMap.get("expectedDeliveryDate") == null){
            propColumnMap.put("expectedDeliveryDate", new ArrayList<>());
            }
            propColumnMap.get("expectedDeliveryDate").add("purchaseOrder.expectedDeliveryDate");
        if (propColumnMap.get("supplierno") == null){
            propColumnMap.put("supplierno", new ArrayList<>());
            }
            propColumnMap.get("supplierno").add("purchaseOrder.supplierno");
        if (propColumnMap.get("orderStatus") == null){
            propColumnMap.put("orderStatus", new ArrayList<>());
            }
            propColumnMap.get("orderStatus").add("purchaseOrder.orderStatus");
        if (propColumnMap.get("delivery_order") == null){
            propColumnMap.put("delivery_order", new ArrayList<>());
            }
            propColumnMap.get("delivery_order").add("purchaseOrder.delivery_order");
        if (propColumnMap.get("createdBy") == null){
            propColumnMap.put("createdBy", new ArrayList<>());
            }
            propColumnMap.get("createdBy").add("purchaseOrder.createdBy");
        if (propColumnMap.get("supplier") == null){
            propColumnMap.put("supplier", new ArrayList<>());
            }
            propColumnMap.get("supplier").add("purchaseOrder.supplier");
        if (propColumnMap.get("createdTime") == null){
            propColumnMap.put("createdTime", new ArrayList<>());
            }
            propColumnMap.get("createdTime").add("purchaseOrder.createdTime");
        if (propColumnMap.get("after") == null){
            propColumnMap.put("after", new ArrayList<>());
            }
            propColumnMap.get("after").add("purchaseOrder.after");
        if (propColumnMap.get("id") == null){
            propColumnMap.put("id", new ArrayList<>());
            }
            propColumnMap.get("id").add("purchaseOrder.id");
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
