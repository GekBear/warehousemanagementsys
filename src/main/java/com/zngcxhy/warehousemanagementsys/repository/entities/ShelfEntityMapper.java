package com.zngcxhy.warehousemanagementsys.repository.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;
import java.math.BigDecimal;
import com.zngcxhy.warehousemanagementsys.domain.entities.ShelfEntity;
import com.zngcxhy.warehousemanagementsys.repository.ReferenceHandleMapper;
import com.zngcxhy.warehousemanagementsys.service.dto.filters.AbstractQueryFilter;
import org.apache.ibatis.annotations.Param;
/**
* auto generate ShelfEntity Mapper
*
* @author sys
*/
public interface ShelfEntityMapper extends ReferenceHandleMapper {

    int insert(ShelfEntity bean);
    int batchInsert(List<ShelfEntity> beans);
    List<ShelfEntity> selectList(@Param("filter") AbstractQueryFilter filter);
    int count(@Param("filter") AbstractQueryFilter filter);

    int update(ShelfEntity bean, List<String> updateFields);
    int batchUpdate(List<ShelfEntity> beans, List<String> updateFields);
    int delete(Long id);
    int batchDelete(List<Long> ids);
    ShelfEntity selectOne(Long id);

    int createOrUpdate(ShelfEntity bean);
    int updateBy(ShelfEntity bean, List<String> updateFields, AbstractQueryFilter filter);
    int deleteBy(@Param("filter") AbstractQueryFilter filter);

}