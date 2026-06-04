package com.zngcxhy.warehousemanagementsys.repository.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;
import java.math.BigDecimal;
import com.zngcxhy.warehousemanagementsys.domain.entities.PurchaseContractEntity;
import com.zngcxhy.warehousemanagementsys.repository.ReferenceHandleMapper;
import com.zngcxhy.warehousemanagementsys.service.dto.filters.AbstractQueryFilter;
import org.apache.ibatis.annotations.Param;
/**
* auto generate PurchaseContractEntity Mapper
*
* @author sys
*/
public interface PurchaseContractEntityMapper extends ReferenceHandleMapper {

    int insert(PurchaseContractEntity bean);
    int batchInsert(List<PurchaseContractEntity> beans);
    List<PurchaseContractEntity> selectList(@Param("filter") AbstractQueryFilter filter);
    int count(@Param("filter") AbstractQueryFilter filter);

    int update(PurchaseContractEntity bean, List<String> updateFields);
    int batchUpdate(List<PurchaseContractEntity> beans, List<String> updateFields);
    int delete(Long id);
    int batchDelete(List<Long> ids);
    PurchaseContractEntity selectOne(Long id);

    int createOrUpdate(PurchaseContractEntity bean);
    int updateBy(PurchaseContractEntity bean, List<String> updateFields, AbstractQueryFilter filter);
    int deleteBy(@Param("filter") AbstractQueryFilter filter);

}