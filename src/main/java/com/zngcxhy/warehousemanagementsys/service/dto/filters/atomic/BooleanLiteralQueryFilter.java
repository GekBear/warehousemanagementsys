package com.zngcxhy.warehousemanagementsys.service.dto.filters.atomic;

import com.zngcxhy.warehousemanagementsys.config.Constants;
import com.zngcxhy.warehousemanagementsys.domain.enumeration.ErrorCodeEnum;
import com.zngcxhy.warehousemanagementsys.exception.HttpCodeException;
import com.zngcxhy.warehousemanagementsys.service.dto.filters.AbstractQueryFilter;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpStatus;

/**
 * @Author: sys
 */
public class BooleanLiteralQueryFilter extends AbstractQueryFilter {

    private Boolean value;

    public BooleanLiteralQueryFilter() {
        this.concept = "BooleanLiteral";
    }

    public BooleanLiteralQueryFilter(Boolean value) {
        this();
        this.value = value;
    }

    public Boolean getValue() {
        return value;
    }

    public void setValue(Boolean value) {
        this.value = value;
    }

    @Override
    public String sql(String dbType) {
        return QUESTION_MARK;
    }
}
