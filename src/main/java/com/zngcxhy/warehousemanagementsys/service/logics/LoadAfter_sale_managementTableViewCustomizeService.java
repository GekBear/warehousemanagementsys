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
* auto generate LoadAfter_sale_managementTableViewCustomizeService logic
*
* @author sys
*/
@Service
public class LoadAfter_sale_managementTableViewCustomizeService {
    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
	@Autowired private LoadAfter_sale_managementTableViewCustomizeServiceMapper loadAfter_sale_managementTableViewCustomizeServiceMapper;

	public com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_3155819A39245BFBE1F9D48E70DC8203  loadAfter_sale_managementTableView(Long page,Long size,String sort,String order,AfterSalesRequestEntity filter) {
		com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_3155819A39245BFBE1F9D48E70DC8203 result = new com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_3155819A39245BFBE1F9D48E70DC8203();
		result=CommonFunctionUtil.createListPage(loadAfter_sale_managementTableViewCustomizeServiceMapper.getAnonymousStructure_3155819A39245BFBE1F9D48E70DC8203(filter,size,getTableField("AnonymousStructure_549508BDC1898EC803BEBB94E48237F8",sort),page,order), loadAfter_sale_managementTableViewCustomizeServiceMapper.countAnonymousStructure_3155819A39245BFBE1F9D48E70DC8203(filter,size,getTableField("AnonymousStructure_549508BDC1898EC803BEBB94E48237F8",sort),page,order).intValue(), com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_3155819A39245BFBE1F9D48E70DC8203.class);
		return result;
	}

    private static Map<String, Map<String, String>> structureTableColumnMap = new HashMap<>();
    private static Map<String, Map<String, List<String>>> structurePropFieldMap = new HashMap<>();
    static {
        Map<String, List<String>> propColumnMap = null;
        Map<String,String> tableColumnMap = null;
        if (structureTableColumnMap.get("AnonymousStructure_549508BDC1898EC803BEBB94E48237F8") == null) {
        structureTableColumnMap.put("AnonymousStructure_549508BDC1898EC803BEBB94E48237F8",new HashMap<String, String>());
        }
        tableColumnMap = structureTableColumnMap.get("AnonymousStructure_549508BDC1898EC803BEBB94E48237F8");
            tableColumnMap.put("afterSalesRequest.updatedTime","`after_sales_request`.`updated_time`");
            tableColumnMap.put("afterSalesRequest.requestDescription","`after_sales_request`.`request_description`");
            tableColumnMap.put("lCAPUser.userId","`lcap_user_6568a7`.`user_id`");
            tableColumnMap.put("lCAPUser.roleId","`lcap_user_6568a7`.`role_id`");
            tableColumnMap.put("afterSalesRequest.requestType","`after_sales_request`.`request_type`");
            tableColumnMap.put("purchaseOrder.supplierID","`purchase_order`.`supplier_i_d`");
            tableColumnMap.put("purchaseOrder.no","`purchase_order`.`no`");
            tableColumnMap.put("purchaseOrder.expectedDeliveryDate","`purchase_order`.`expected_delivery_date`");
            tableColumnMap.put("purchaseOrder.orderStatus","`purchase_order`.`order_status`");
            tableColumnMap.put("lCAPUser.status","`lcap_user_6568a7`.`status`");
            tableColumnMap.put("purchaseOrder.supplier","`purchase_order`.`supplier`");
            tableColumnMap.put("afterSalesRequest.supplierID","`after_sales_request`.`supplier_i_d`");
            tableColumnMap.put("lCAPUser.createdTime","`lcap_user_6568a7`.`created_time`");
            tableColumnMap.put("lCAPUser.password","`lcap_user_6568a7`.`password`");
            tableColumnMap.put("afterSalesRequest.createdTime","`after_sales_request`.`created_time`");
            tableColumnMap.put("purchaseOrder.id","`purchase_order`.`id`");
            tableColumnMap.put("purchaseOrder.manager","`purchase_order`.`manager`");
            tableColumnMap.put("afterSalesRequest.id","`after_sales_request`.`id`");
            tableColumnMap.put("lCAPUser.id","`lcap_user_6568a7`.`id`");
            tableColumnMap.put("lCAPUser.displayName","`lcap_user_6568a7`.`display_name`");
            tableColumnMap.put("purchaseOrder.updatedTime","`purchase_order`.`updated_time`");
            tableColumnMap.put("purchaseOrder.supplierno","`purchase_order`.`supplierno`");
            tableColumnMap.put("lCAPUser.updatedTime","`lcap_user_6568a7`.`updated_time`");
            tableColumnMap.put("purchaseOrder.updatedBy","`purchase_order`.`updated_by`");
            tableColumnMap.put("afterSalesRequest.orderID","`after_sales_request`.`order_i_d`");
            tableColumnMap.put("lCAPUser.userName","`lcap_user_6568a7`.`user_name`");
            tableColumnMap.put("afterSalesRequest.requestStatus","`after_sales_request`.`request_status`");
            tableColumnMap.put("afterSalesRequest.updatedBy","`after_sales_request`.`updated_by`");
            tableColumnMap.put("purchaseOrder.createdBy","`purchase_order`.`created_by`");
            tableColumnMap.put("purchaseOrder.createdTime","`purchase_order`.`created_time`");
            tableColumnMap.put("purchaseOrder.supplierName","`purchase_order`.`supplier_name`");
            tableColumnMap.put("purchaseOrder.delivery_order","`purchase_order`.`delivery_order`");
            tableColumnMap.put("lCAPUser.email","`lcap_user_6568a7`.`email`");
            tableColumnMap.put("purchaseOrder.after","`purchase_order`.`after`");
            tableColumnMap.put("purchaseOrder.documents","`purchase_order`.`documents`");
            tableColumnMap.put("afterSalesRequest.createdBy","`after_sales_request`.`created_by`");
            tableColumnMap.put("lCAPUser.phone","`lcap_user_6568a7`.`phone`");
            tableColumnMap.put("afterSalesRequest.processresult","`after_sales_request`.`processresult`");
            tableColumnMap.put("lCAPUser.source","`lcap_user_6568a7`.`source`");
        if (structurePropFieldMap.get("AnonymousStructure_549508BDC1898EC803BEBB94E48237F8") == null) {
            structurePropFieldMap.put("AnonymousStructure_549508BDC1898EC803BEBB94E48237F8",new HashMap<String, List<String>>());
        }
         propColumnMap = structurePropFieldMap.get("AnonymousStructure_549508BDC1898EC803BEBB94E48237F8");
        if (propColumnMap.get("no") == null){
            propColumnMap.put("no", new ArrayList<>());
            }
            propColumnMap.get("no").add("purchaseOrder.no");
        if (propColumnMap.get("documents") == null){
            propColumnMap.put("documents", new ArrayList<>());
            }
            propColumnMap.get("documents").add("purchaseOrder.documents");
        if (propColumnMap.get("displayName") == null){
            propColumnMap.put("displayName", new ArrayList<>());
            }
            propColumnMap.get("displayName").add("lCAPUser.displayName");
        if (propColumnMap.get("supplierno") == null){
            propColumnMap.put("supplierno", new ArrayList<>());
            }
            propColumnMap.get("supplierno").add("purchaseOrder.supplierno");
        if (propColumnMap.get("orderStatus") == null){
            propColumnMap.put("orderStatus", new ArrayList<>());
            }
            propColumnMap.get("orderStatus").add("purchaseOrder.orderStatus");
        if (propColumnMap.get("source") == null){
            propColumnMap.put("source", new ArrayList<>());
            }
            propColumnMap.get("source").add("lCAPUser.source");
        if (propColumnMap.get("requestDescription") == null){
            propColumnMap.put("requestDescription", new ArrayList<>());
            }
            propColumnMap.get("requestDescription").add("afterSalesRequest.requestDescription");
        if (propColumnMap.get("password") == null){
            propColumnMap.put("password", new ArrayList<>());
            }
            propColumnMap.get("password").add("lCAPUser.password");
        if (propColumnMap.get("supplier") == null){
            propColumnMap.put("supplier", new ArrayList<>());
            }
            propColumnMap.get("supplier").add("purchaseOrder.supplier");
        if (propColumnMap.get("createdTime") == null){
            propColumnMap.put("createdTime", new ArrayList<>());
            }
            propColumnMap.get("createdTime").add("afterSalesRequest.createdTime");
            propColumnMap.get("createdTime").add("lCAPUser.createdTime");
            propColumnMap.get("createdTime").add("purchaseOrder.createdTime");
        if (propColumnMap.get("after") == null){
            propColumnMap.put("after", new ArrayList<>());
            }
            propColumnMap.get("after").add("purchaseOrder.after");
        if (propColumnMap.get("id") == null){
            propColumnMap.put("id", new ArrayList<>());
            }
            propColumnMap.get("id").add("afterSalesRequest.id");
            propColumnMap.get("id").add("lCAPUser.id");
            propColumnMap.get("id").add("purchaseOrder.id");
        if (propColumnMap.get("email") == null){
            propColumnMap.put("email", new ArrayList<>());
            }
            propColumnMap.get("email").add("lCAPUser.email");
        if (propColumnMap.get("supplierName") == null){
            propColumnMap.put("supplierName", new ArrayList<>());
            }
            propColumnMap.get("supplierName").add("purchaseOrder.supplierName");
        if (propColumnMap.get("updatedTime") == null){
            propColumnMap.put("updatedTime", new ArrayList<>());
            }
            propColumnMap.get("updatedTime").add("afterSalesRequest.updatedTime");
            propColumnMap.get("updatedTime").add("lCAPUser.updatedTime");
            propColumnMap.get("updatedTime").add("purchaseOrder.updatedTime");
        if (propColumnMap.get("supplierID") == null){
            propColumnMap.put("supplierID", new ArrayList<>());
            }
            propColumnMap.get("supplierID").add("afterSalesRequest.supplierID");
            propColumnMap.get("supplierID").add("purchaseOrder.supplierID");
        if (propColumnMap.get("updatedBy") == null){
            propColumnMap.put("updatedBy", new ArrayList<>());
            }
            propColumnMap.get("updatedBy").add("afterSalesRequest.updatedBy");
            propColumnMap.get("updatedBy").add("purchaseOrder.updatedBy");
        if (propColumnMap.get("manager") == null){
            propColumnMap.put("manager", new ArrayList<>());
            }
            propColumnMap.get("manager").add("purchaseOrder.manager");
        if (propColumnMap.get("requestType") == null){
            propColumnMap.put("requestType", new ArrayList<>());
            }
            propColumnMap.get("requestType").add("afterSalesRequest.requestType");
        if (propColumnMap.get("orderID") == null){
            propColumnMap.put("orderID", new ArrayList<>());
            }
            propColumnMap.get("orderID").add("afterSalesRequest.orderID");
        if (propColumnMap.get("expectedDeliveryDate") == null){
            propColumnMap.put("expectedDeliveryDate", new ArrayList<>());
            }
            propColumnMap.get("expectedDeliveryDate").add("purchaseOrder.expectedDeliveryDate");
        if (propColumnMap.get("roleId") == null){
            propColumnMap.put("roleId", new ArrayList<>());
            }
            propColumnMap.get("roleId").add("lCAPUser.roleId");
        if (propColumnMap.get("userName") == null){
            propColumnMap.put("userName", new ArrayList<>());
            }
            propColumnMap.get("userName").add("lCAPUser.userName");
        if (propColumnMap.get("processresult") == null){
            propColumnMap.put("processresult", new ArrayList<>());
            }
            propColumnMap.get("processresult").add("afterSalesRequest.processresult");
        if (propColumnMap.get("userId") == null){
            propColumnMap.put("userId", new ArrayList<>());
            }
            propColumnMap.get("userId").add("lCAPUser.userId");
        if (propColumnMap.get("delivery_order") == null){
            propColumnMap.put("delivery_order", new ArrayList<>());
            }
            propColumnMap.get("delivery_order").add("purchaseOrder.delivery_order");
        if (propColumnMap.get("phone") == null){
            propColumnMap.put("phone", new ArrayList<>());
            }
            propColumnMap.get("phone").add("lCAPUser.phone");
        if (propColumnMap.get("createdBy") == null){
            propColumnMap.put("createdBy", new ArrayList<>());
            }
            propColumnMap.get("createdBy").add("afterSalesRequest.createdBy");
            propColumnMap.get("createdBy").add("purchaseOrder.createdBy");
        if (propColumnMap.get("requestStatus") == null){
            propColumnMap.put("requestStatus", new ArrayList<>());
            }
            propColumnMap.get("requestStatus").add("afterSalesRequest.requestStatus");
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
