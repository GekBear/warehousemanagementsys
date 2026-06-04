package com.zngcxhy.warehousemanagementsys.repository.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;
import java.math.BigDecimal;
import com.zngcxhy.warehousemanagementsys.domain.entities.PurchaseOrderDetaiEntity;
import com.zngcxhy.warehousemanagementsys.repository.ReferenceHandleMapper;
import com.zngcxhy.warehousemanagementsys.service.dto.filters.AbstractQueryFilter;
import org.apache.ibatis.annotations.Param;
/**
* auto generate PurchaseOrderDetaiEntity Mapper
*
* @author sys
*/
public interface PurchaseOrderDetaiEntityMapper extends ReferenceHandleMapper {

    int insert(PurchaseOrderDetaiEntity bean);
    int batchInsert(List<PurchaseOrderDetaiEntity> beans);
    List<PurchaseOrderDetaiEntity> selectList(@Param("filter") AbstractQueryFilter filter);
    int count(@Param("filter") AbstractQueryFilter filter);

    int update(PurchaseOrderDetaiEntity bean, List<String> updateFields);
    int batchUpdate(List<PurchaseOrderDetaiEntity> beans, List<String> updateFields);
    int delete(Long id);
    int batchDelete(List<Long> ids);
    PurchaseOrderDetaiEntity selectOne(Long id);

    int createOrUpdate(PurchaseOrderDetaiEntity bean);
    int updateBy(PurchaseOrderDetaiEntity bean, List<String> updateFields, AbstractQueryFilter filter);
    int deleteBy(@Param("filter") AbstractQueryFilter filter);

}