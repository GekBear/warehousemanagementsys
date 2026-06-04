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
* auto generate LoadInvoice_managementTableView_2CustomizeService logic
*
* @author sys
*/
@Service
public class LoadInvoice_managementTableView_2CustomizeService {
    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
	@Autowired private LoadInvoice_managementTableView_2CustomizeServiceMapper loadInvoice_managementTableView_2CustomizeServiceMapper;

	public com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_91499DCB05E3CB30C2E9EDADADB28861  loadInvoice_managementTableView_2(Long page,Long size,String sort,String order,DocumentsEntity filter) {
		com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_91499DCB05E3CB30C2E9EDADADB28861 result = new com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_91499DCB05E3CB30C2E9EDADADB28861();
		result=CommonFunctionUtil.createListPage(loadInvoice_managementTableView_2CustomizeServiceMapper.getAnonymousStructure_91499DCB05E3CB30C2E9EDADADB28861(filter,size,getTableField("AnonymousStructure_12019DF2BBE99F3D26BA90AEB5B3AB60",sort),page,order), loadInvoice_managementTableView_2CustomizeServiceMapper.countAnonymousStructure_91499DCB05E3CB30C2E9EDADADB28861(filter,size,getTableField("AnonymousStructure_12019DF2BBE99F3D26BA90AEB5B3AB60",sort),page,order).intValue(), com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_91499DCB05E3CB30C2E9EDADADB28861.class);
		return result;
	}

    private static Map<String, Map<String, String>> structureTableColumnMap = new HashMap<>();
    private static Map<String, Map<String, List<String>>> structurePropFieldMap = new HashMap<>();
    static {
        Map<String, List<String>> propColumnMap = null;
        Map<String,String> tableColumnMap = null;
        if (structureTableColumnMap.get("AnonymousStructure_12019DF2BBE99F3D26BA90AEB5B3AB60") == null) {
        structureTableColumnMap.put("AnonymousStructure_12019DF2BBE99F3D26BA90AEB5B3AB60",new HashMap<String, String>());
        }
        tableColumnMap = structureTableColumnMap.get("AnonymousStructure_12019DF2BBE99F3D26BA90AEB5B3AB60");
            tableColumnMap.put("documents.xiaoji","`documents`.`xiaoji`");
            tableColumnMap.put("documents.tax_rate","`documents`.`tax_rate`");
            tableColumnMap.put("documents.updatedTime","`documents`.`updated_time`");
            tableColumnMap.put("documents.sala","`documents`.`sala`");
            tableColumnMap.put("documents.createdTime","`documents`.`created_time`");
            tableColumnMap.put("documents.pay","`documents`.`pay`");
            tableColumnMap.put("documents.id","`documents`.`id`");
            tableColumnMap.put("documents.orderID","`documents`.`order_i_d`");
            tableColumnMap.put("documents.buyer","`documents`.`buyer`");
            tableColumnMap.put("documents.suifri","`documents`.`suifri`");
            tableColumnMap.put("documents.createdBy","`documents`.`created_by`");
            tableColumnMap.put("documents.price_amout","`documents`.`price_amout`");
            tableColumnMap.put("documents.updatedBy","`documents`.`updated_by`");
        if (structurePropFieldMap.get("AnonymousStructure_12019DF2BBE99F3D26BA90AEB5B3AB60") == null) {
            structurePropFieldMap.put("AnonymousStructure_12019DF2BBE99F3D26BA90AEB5B3AB60",new HashMap<String, List<String>>());
        }
         propColumnMap = structurePropFieldMap.get("AnonymousStructure_12019DF2BBE99F3D26BA90AEB5B3AB60");
        if (propColumnMap.get("updatedTime") == null){
            propColumnMap.put("updatedTime", new ArrayList<>());
            }
            propColumnMap.get("updatedTime").add("documents.updatedTime");
        if (propColumnMap.get("updatedBy") == null){
            propColumnMap.put("updatedBy", new ArrayList<>());
            }
            propColumnMap.get("updatedBy").add("documents.updatedBy");
        if (propColumnMap.get("xiaoji") == null){
            propColumnMap.put("xiaoji", new ArrayList<>());
            }
            propColumnMap.get("xiaoji").add("documents.xiaoji");
        if (propColumnMap.get("orderID") == null){
            propColumnMap.put("orderID", new ArrayList<>());
            }
            propColumnMap.get("orderID").add("documents.orderID");
        if (propColumnMap.get("createdBy") == null){
            propColumnMap.put("createdBy", new ArrayList<>());
            }
            propColumnMap.get("createdBy").add("documents.createdBy");
        if (propColumnMap.get("sala") == null){
            propColumnMap.put("sala", new ArrayList<>());
            }
            propColumnMap.get("sala").add("documents.sala");
        if (propColumnMap.get("price_amout") == null){
            propColumnMap.put("price_amout", new ArrayList<>());
            }
            propColumnMap.get("price_amout").add("documents.price_amout");
        if (propColumnMap.get("suifri") == null){
            propColumnMap.put("suifri", new ArrayList<>());
            }
            propColumnMap.get("suifri").add("documents.suifri");
        if (propColumnMap.get("pay") == null){
            propColumnMap.put("pay", new ArrayList<>());
            }
            propColumnMap.get("pay").add("documents.pay");
        if (propColumnMap.get("createdTime") == null){
            propColumnMap.put("createdTime", new ArrayList<>());
            }
            propColumnMap.get("createdTime").add("documents.createdTime");
        if (propColumnMap.get("id") == null){
            propColumnMap.put("id", new ArrayList<>());
            }
            propColumnMap.get("id").add("documents.id");
        if (propColumnMap.get("tax_rate") == null){
            propColumnMap.put("tax_rate", new ArrayList<>());
            }
            propColumnMap.get("tax_rate").add("documents.tax_rate");
        if (propColumnMap.get("buyer") == null){
            propColumnMap.put("buyer", new ArrayList<>());
            }
            propColumnMap.get("buyer").add("documents.buyer");
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
