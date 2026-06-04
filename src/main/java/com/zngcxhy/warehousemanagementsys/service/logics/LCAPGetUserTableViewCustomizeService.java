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
* auto generate LCAPGetUserTableViewCustomizeService logic
*
* @author sys
*/
@Service
public class LCAPGetUserTableViewCustomizeService {
    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
	@Autowired private LCAPGetUserTableViewCustomizeServiceMapper lCAPGetUserTableViewCustomizeServiceMapper;

	public com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_90BB04F104917B26166C550B4A1B0632  lCAPGetUserTableView(Long page,Long size,String sort,String order,LCAPUser filter) {
		com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_90BB04F104917B26166C550B4A1B0632 result = new com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_90BB04F104917B26166C550B4A1B0632();
		result=CommonFunctionUtil.createListPage(lCAPGetUserTableViewCustomizeServiceMapper.getAnonymousStructure_90BB04F104917B26166C550B4A1B0632(filter,size,getTableField("AnonymousStructure_47C167E7217746A55100F50A57F637C0",sort),page,order), lCAPGetUserTableViewCustomizeServiceMapper.countAnonymousStructure_90BB04F104917B26166C550B4A1B0632(filter,size,getTableField("AnonymousStructure_47C167E7217746A55100F50A57F637C0",sort),page,order).intValue(), com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_90BB04F104917B26166C550B4A1B0632.class);
		return result;
	}

    private static Map<String, Map<String, String>> structureTableColumnMap = new HashMap<>();
    private static Map<String, Map<String, List<String>>> structurePropFieldMap = new HashMap<>();
    static {
        Map<String, List<String>> propColumnMap = null;
        Map<String,String> tableColumnMap = null;
        if (structureTableColumnMap.get("AnonymousStructure_47C167E7217746A55100F50A57F637C0") == null) {
        structureTableColumnMap.put("AnonymousStructure_47C167E7217746A55100F50A57F637C0",new HashMap<String, String>());
        }
        tableColumnMap = structureTableColumnMap.get("AnonymousStructure_47C167E7217746A55100F50A57F637C0");
            tableColumnMap.put("lCAPUser.userId","`lcap_user_6568a7`.`user_id`");
            tableColumnMap.put("lCAPUser.email","`lcap_user_6568a7`.`email`");
            tableColumnMap.put("lCAPUser.roleId","`lcap_user_6568a7`.`role_id`");
            tableColumnMap.put("lCAPUser.createdTime","`lcap_user_6568a7`.`created_time`");
            tableColumnMap.put("lCAPUser.password","`lcap_user_6568a7`.`password`");
            tableColumnMap.put("lCAPUser.updatedTime","`lcap_user_6568a7`.`updated_time`");
            tableColumnMap.put("lCAPUser.phone","`lcap_user_6568a7`.`phone`");
            tableColumnMap.put("lCAPUser.status","`lcap_user_6568a7`.`status`");
            tableColumnMap.put("lCAPUser.userName","`lcap_user_6568a7`.`user_name`");
            tableColumnMap.put("lCAPUser.id","`lcap_user_6568a7`.`id`");
            tableColumnMap.put("lCAPUser.displayName","`lcap_user_6568a7`.`display_name`");
            tableColumnMap.put("lCAPUser.source","`lcap_user_6568a7`.`source`");
        if (structurePropFieldMap.get("AnonymousStructure_47C167E7217746A55100F50A57F637C0") == null) {
            structurePropFieldMap.put("AnonymousStructure_47C167E7217746A55100F50A57F637C0",new HashMap<String, List<String>>());
        }
         propColumnMap = structurePropFieldMap.get("AnonymousStructure_47C167E7217746A55100F50A57F637C0");
        if (propColumnMap.get("updatedTime") == null){
            propColumnMap.put("updatedTime", new ArrayList<>());
            }
            propColumnMap.get("updatedTime").add("lCAPUser.updatedTime");
        if (propColumnMap.get("password") == null){
            propColumnMap.put("password", new ArrayList<>());
            }
            propColumnMap.get("password").add("lCAPUser.password");
        if (propColumnMap.get("phone") == null){
            propColumnMap.put("phone", new ArrayList<>());
            }
            propColumnMap.get("phone").add("lCAPUser.phone");
        if (propColumnMap.get("roleId") == null){
            propColumnMap.put("roleId", new ArrayList<>());
            }
            propColumnMap.get("roleId").add("lCAPUser.roleId");
        if (propColumnMap.get("displayName") == null){
            propColumnMap.put("displayName", new ArrayList<>());
            }
            propColumnMap.get("displayName").add("lCAPUser.displayName");
        if (propColumnMap.get("createdTime") == null){
            propColumnMap.put("createdTime", new ArrayList<>());
            }
            propColumnMap.get("createdTime").add("lCAPUser.createdTime");
        if (propColumnMap.get("source") == null){
            propColumnMap.put("source", new ArrayList<>());
            }
            propColumnMap.get("source").add("lCAPUser.source");
        if (propColumnMap.get("id") == null){
            propColumnMap.put("id", new ArrayList<>());
            }
            propColumnMap.get("id").add("lCAPUser.id");
        if (propColumnMap.get("userName") == null){
            propColumnMap.put("userName", new ArrayList<>());
            }
            propColumnMap.get("userName").add("lCAPUser.userName");
        if (propColumnMap.get("userId") == null){
            propColumnMap.put("userId", new ArrayList<>());
            }
            propColumnMap.get("userId").add("lCAPUser.userId");
        if (propColumnMap.get("email") == null){
            propColumnMap.put("email", new ArrayList<>());
            }
            propColumnMap.get("email").add("lCAPUser.email");
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
