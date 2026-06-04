package com.zngcxhy.warehousemanagementsys.repository.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;
import java.math.BigDecimal;
import com.zngcxhy.warehousemanagementsys.domain.entities.DocumentsEntity;
import com.zngcxhy.warehousemanagementsys.repository.ReferenceHandleMapper;
import com.zngcxhy.warehousemanagementsys.service.dto.filters.AbstractQueryFilter;
import org.apache.ibatis.annotations.Param;
/**
* auto generate DocumentsEntity Mapper
*
* @author sys
*/
public interface DocumentsEntityMapper extends ReferenceHandleMapper {

    int insert(DocumentsEntity bean);
    int batchInsert(List<DocumentsEntity> beans);
    List<DocumentsEntity> selectList(@Param("filter") AbstractQueryFilter filter);
    int count(@Param("filter") AbstractQueryFilter filter);

    int update(DocumentsEntity bean, List<String> updateFields);
    int batchUpdate(List<DocumentsEntity> beans, List<String> updateFields);
    int delete(Long id);
    int batchDelete(List<Long> ids);
    DocumentsEntity selectOne(Long id);

    int createOrUpdate(DocumentsEntity bean);
    int updateBy(DocumentsEntity bean, List<String> updateFields, AbstractQueryFilter filter);
    int deleteBy(@Param("filter") AbstractQueryFilter filter);

}