package com.zngcxhy.warehousemanagementsys.service.dto.filters.atomic;

import com.zngcxhy.warehousemanagementsys.service.dto.filters.AbstractQueryFilter;


/**
 * @Author: sys
 */
public class NullLiteralQueryFilter extends AbstractQueryFilter {

    public NullLiteralQueryFilter() {
        this.concept = "NullLiteral";
    }

    @Override
    public String sql(String dbType) {
        return NULL_STRING;
    }
}
