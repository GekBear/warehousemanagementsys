package com.zngcxhy.warehousemanagementsys.domain.structure.anonymous;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.zngcxhy.warehousemanagementsys.annotation.Label;
import com.zngcxhy.warehousemanagementsys.domain.*;
import com.zngcxhy.warehousemanagementsys.domain.enumeration.*;
import com.zngcxhy.warehousemanagementsys.domain.structure.*;
import com.zngcxhy.warehousemanagementsys.domain.entities.*;
import com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.*;

/**
* auto generate AnonymousStructure_15236DED8CD807484AC741CD838A113B structure
*
* @author sys
*/
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_15236DED8CD807484AC741CD838A113B {
    public List<com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_B0D6BA4B2283DC4DA976DAF31C826073> list = new ArrayList <>();
    public Long total;

    public List<com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_B0D6BA4B2283DC4DA976DAF31C826073> getList() {
        return list;
    }

    public void setList(List<com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_B0D6BA4B2283DC4DA976DAF31C826073> list) {
        this.list = list;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

}
