package com.zngcxhy.warehousemanagementsys.repository.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;
import java.math.BigDecimal;
import com.zngcxhy.warehousemanagementsys.domain.entities.AfterSalesRequestEntity;
import com.zngcxhy.warehousemanagementsys.repository.ReferenceHandleMapper;
import com.zngcxhy.warehousemanagementsys.service.dto.filters.AbstractQueryFilter;
import org.apache.ibatis.annotations.Param;
/**
* auto generate AfterSalesRequestEntity Mapper
*
* @author sys
*/
public interface AfterSalesRequestEntityMapper extends ReferenceHandleMapper {

    int insert(AfterSalesRequestEntity bean);
    int batchInsert(List<AfterSalesRequestEntity> beans);
    List<AfterSalesRequestEntity> selectList(@Param("filter") AbstractQueryFilter filter);
    int count(@Param("filter") AbstractQueryFilter filter);

    int update(AfterSalesRequestEntity bean, List<String> updateFields);
    int batchUpdate(List<AfterSalesRequestEntity> beans, List<String> updateFields);
    int delete(Long id);
    int batchDelete(List<Long> ids);
    AfterSalesRequestEntity selectOne(Long id);

    int createOrUpdate(AfterSalesRequestEntity bean);
    int updateBy(AfterSalesRequestEntity bean, List<String> updateFields, AbstractQueryFilter filter);
    int deleteBy(@Param("filter") AbstractQueryFilter filter);

}