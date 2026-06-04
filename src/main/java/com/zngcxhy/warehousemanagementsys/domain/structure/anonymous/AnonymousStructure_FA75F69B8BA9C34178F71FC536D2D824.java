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
* auto generate AnonymousStructure_FA75F69B8BA9C34178F71FC536D2D824 structure
*
* @author sys
*/
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_FA75F69B8BA9C34178F71FC536D2D824 {
    public List<com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_B202841ADEE061731D68863F55003B0E> list = new ArrayList <>();
    public Long total;

    public List<com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_B202841ADEE061731D68863F55003B0E> getList() {
        return list;
    }

    public void setList(List<com.zngcxhy.warehousemanagementsys.domain.structure.anonymous.AnonymousStructure_B202841ADEE061731D68863F55003B0E> list) {
        this.list = list;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

}
