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
* auto generate AnonymousStructure_0A8196CA87209D0F0E1829C6F6519FAA structure
*
* @author sys
*/
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_0A8196CA87209D0F0E1829C6F6519FAA {
    public List<com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_ACE5D3C60D3F4FB0F05E11B3A341B39D> list = new ArrayList <>();
    public Long total;

    public List<com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_ACE5D3C60D3F4FB0F05E11B3A341B39D> getList() {
        return list;
    }

    public void setList(List<com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_ACE5D3C60D3F4FB0F05E11B3A341B39D> list) {
        this.list = list;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

}
