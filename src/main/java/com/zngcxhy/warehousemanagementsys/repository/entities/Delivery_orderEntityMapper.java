package com.zngcxhy.warehousemanagementsys.repository.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;
import java.math.BigDecimal;
import com.zngcxhy.warehousemanagementsys.domain.entities.Delivery_orderEntity;
import com.zngcxhy.warehousemanagementsys.repository.ReferenceHandleMapper;
import com.zngcxhy.warehousemanagementsys.service.dto.filters.AbstractQueryFilter;
import org.apache.ibatis.annotations.Param;
/**
* auto generate Delivery_orderEntity Mapper
*
* @author sys
*/
public interface Delivery_orderEntityMapper extends ReferenceHandleMapper {

    int insert(Delivery_orderEntity bean);
    int batchInsert(List<Delivery_orderEntity> beans);
    List<Delivery_orderEntity> selectList(@Param("filter") AbstractQueryFilter filter);
    int count(@Param("filter") AbstractQueryFilter filter);

    int update(Delivery_orderEntity bean, List<String> updateFields);
    int batchUpdate(List<Delivery_orderEntity> beans, List<String> updateFields);
    int delete(Long id);
    int batchDelete(List<Long> ids);
    Delivery_orderEntity selectOne(Long id);

    int createOrUpdate(Delivery_orderEntity bean);
    int updateBy(Delivery_orderEntity bean, List<String> updateFields, AbstractQueryFilter filter);
    int deleteBy(@Param("filter") AbstractQueryFilter filter);

}