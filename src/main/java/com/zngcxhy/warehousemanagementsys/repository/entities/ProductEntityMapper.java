package com.zngcxhy.warehousemanagementsys.repository.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;
import java.math.BigDecimal;
import com.zngcxhy.warehousemanagementsys.domain.entities.ProductEntity;
import com.zngcxhy.warehousemanagementsys.repository.ReferenceHandleMapper;
import com.zngcxhy.warehousemanagementsys.service.dto.filters.AbstractQueryFilter;
import org.apache.ibatis.annotations.Param;
/**
* auto generate ProductEntity Mapper
*
* @author sys
*/
public interface ProductEntityMapper extends ReferenceHandleMapper {

    int insert(ProductEntity bean);
    int batchInsert(List<ProductEntity> beans);
    List<ProductEntity> selectList(@Param("filter") AbstractQueryFilter filter);
    int count(@Param("filter") AbstractQueryFilter filter);

    int update(ProductEntity bean, List<String> updateFields);
    int batchUpdate(List<ProductEntity> beans, List<String> updateFields);
    int delete(Long id);
    int batchDelete(List<Long> ids);
    ProductEntity selectOne(Long id);

    int createOrUpdate(ProductEntity bean);
    int updateBy(ProductEntity bean, List<String> updateFields, AbstractQueryFilter filter);
    int deleteBy(@Param("filter") AbstractQueryFilter filter);

}