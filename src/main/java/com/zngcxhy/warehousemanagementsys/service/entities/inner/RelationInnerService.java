package com.zngcxhy.warehousemanagementsys.service.entities.inner;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.time.LocalDateTime;
import javax.annotation.Resource;
import java.beans.PropertyDescriptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;
import org.springframework.beans.BeanUtils;
import org.springframework.transaction.annotation.Transactional;

import com.zngcxhy.warehousemanagementsys.datasource.dynamic.DataSource;
import com.zngcxhy.warehousemanagementsys.exception.HttpCodeException;
import com.zngcxhy.warehousemanagementsys.domain.*;
import com.zngcxhy.warehousemanagementsys.domain.enumeration.*;
import com.zngcxhy.warehousemanagementsys.repository.*;
import com.zngcxhy.warehousemanagementsys.util.SpringUtils;
import com.zngcxhy.warehousemanagementsys.exception.HttpCodeException;

/**
* auto generate RelationInnerService
*
* @author sys
*/
@Service
public class RelationInnerService {
    private Map<String, List<Object[]>> relationMap = new HashMap<>();
    private static Logger LOGGER = LoggerFactory.getLogger(RelationInnerService.class);
    private static final int INDEX_BEREF_PROPERTY = 0;
    private static final int INDEX_REF_ENTITY_MAPPER_CLASS = 1;
    private static final int INDEX_REF_PROPERTY = 2;
    private static final int INDEX_DEL_RULE = 3;

    public RelationInnerService() {
        relationMap.put("WarehouseEntity", new ArrayList<>());
        relationMap.get("WarehouseEntity").add(new Object[]{
            "id",
            com.zngcxhy.warehousemanagementsys.repository.entities.ShelfEntityMapper.class,
            "wareId",
            "cascade"
            });
        relationMap.put("LCAPResource", new ArrayList<>());
        relationMap.get("LCAPResource").add(new Object[]{
            "id",
            com.zngcxhy.warehousemanagementsys.repository.entities.LCAPPerResMappingMapper.class,
            "resourceId",
            "cascade"
            });
        relationMap.put("LCAPUser", new ArrayList<>());
        relationMap.get("LCAPUser").add(new Object[]{
            "userId",
            com.zngcxhy.warehousemanagementsys.repository.entities.LCAPUserRoleMappingMapper.class,
            "userId",
            "cascade"
            });
        relationMap.put("LCAPRole", new ArrayList<>());
        relationMap.get("LCAPRole").add(new Object[]{
            "id",
            com.zngcxhy.warehousemanagementsys.repository.entities.LCAPRolePerMappingMapper.class,
            "roleId",
            "cascade"
            });
        relationMap.get("LCAPRole").add(new Object[]{
            "id",
            com.zngcxhy.warehousemanagementsys.repository.entities.LCAPUserRoleMappingMapper.class,
            "roleId",
            "cascade"
            });
        relationMap.put("LCAPPermission", new ArrayList<>());
        relationMap.get("LCAPPermission").add(new Object[]{
            "id",
            com.zngcxhy.warehousemanagementsys.repository.entities.LCAPRolePerMappingMapper.class,
            "permissionId",
            "cascade"
            });
        relationMap.get("LCAPPermission").add(new Object[]{
            "id",
            com.zngcxhy.warehousemanagementsys.repository.entities.LCAPPerResMappingMapper.class,
            "permissionId",
            "cascade"
            });
        relationMap.put("PurchaseOrderEntity", new ArrayList<>());
        relationMap.get("PurchaseOrderEntity").add(new Object[]{
            "id",
            com.zngcxhy.warehousemanagementsys.repository.entities.AfterSalesRequestEntityMapper.class,
            "orderID",
            "protect"
            });
        relationMap.get("PurchaseOrderEntity").add(new Object[]{
            "supplierID",
            com.zngcxhy.warehousemanagementsys.repository.entities.AfterSalesRequestEntityMapper.class,
            "supplierID",
            "protect"
            });
        relationMap.get("PurchaseOrderEntity").add(new Object[]{
            "id",
            com.zngcxhy.warehousemanagementsys.repository.entities.PurchaseContractEntityMapper.class,
            "orderID",
            "cascade"
            });
        relationMap.get("PurchaseOrderEntity").add(new Object[]{
            "id",
            com.zngcxhy.warehousemanagementsys.repository.entities.PurchaseOrderDetaiEntityMapper.class,
            "orderID",
            "cascade"
            });
        relationMap.put("PurchaseOrderDetaiEntity", new ArrayList<>());
        relationMap.get("PurchaseOrderDetaiEntity").add(new Object[]{
            "id",
            com.zngcxhy.warehousemanagementsys.repository.entities.InventoryEntityMapper.class,
            "inwarehouseId",
            "cascade"
            });
    }

    @Transactional(rollbackFor = Exception.class)
    public void onDelete(Object entity) {
        try {
            if (relationMap.containsKey(entity.getClass().getSimpleName())) {
                for (Object[] relationPayload : relationMap.get(entity.getClass().getSimpleName())) {
                    String beRefProperty = (String)relationPayload[INDEX_BEREF_PROPERTY];
                    PropertyDescriptor propertyDescriptor = BeanUtils.getPropertyDescriptor(entity.getClass(), beRefProperty);
                    Object propertyVal = propertyDescriptor.getReadMethod().invoke(entity);

                    Class<ReferenceHandleMapper> refEntityMapperClass = (Class<ReferenceHandleMapper>) relationPayload[INDEX_REF_ENTITY_MAPPER_CLASS];
                    String refProperty = (String)relationPayload[INDEX_REF_PROPERTY];
                    ReferenceHandleMapper refEntityMapper = SpringUtils.getBean(refEntityMapperClass);

                    String delRule = (String) relationPayload[INDEX_DEL_RULE];
                    if ("cascade".equals(delRule)) {
                        LOGGER.info("cascade delete entity: {}, property {} = {}",
                            entity.getClass().getSimpleName(), refProperty, propertyVal);
                        refEntityMapper.deleteReference(refProperty, propertyVal);
                    } else if ("protect".equals(delRule)) {
                        Long affect = refEntityMapper.existReference(refProperty, propertyVal);
                        if (affect != null && affect > 0) {
                            throw new HttpCodeException(400, ErrorCodeEnum.RELATION_PROTECT.code);
                        }
                    }
                }
            }
        } catch (HttpCodeException ex) {
            throw ex;
        } catch(Exception e) {
            throw new HttpCodeException(400, "error: " + e.getMessage());
        }
    }
}