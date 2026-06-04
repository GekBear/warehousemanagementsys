package com.zngcxhy.warehousemanagementsys.domain.structure.extensions.qiweionlineconnector;

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
import com.zngcxhy.warehousemanagementsys.domain.entities.*;

/**
* auto generate External_attrStructure structure
*
* @author sys
*/
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)
public class External_attrStructure {
    public com.zngcxhy.warehousemanagementsys.domain.structure.extensions.qiweionlineconnector.Web2Structure web;
    public String name;
    public com.zngcxhy.warehousemanagementsys.domain.structure.extensions.qiweionlineconnector.Text3Structure text;
    public Long type;
    public com.zngcxhy.warehousemanagementsys.domain.structure.extensions.qiweionlineconnector.MiniprogramStructure miniprogram;

    public com.zngcxhy.warehousemanagementsys.domain.structure.extensions.qiweionlineconnector.Web2Structure getWeb() {
        return web;
    }

    public void setWeb(com.zngcxhy.warehousemanagementsys.domain.structure.extensions.qiweionlineconnector.Web2Structure web) {
        this.web = web;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public com.zngcxhy.warehousemanagementsys.domain.structure.extensions.qiweionlineconnector.Text3Structure getText() {
        return text;
    }

    public void setText(com.zngcxhy.warehousemanagementsys.domain.structure.extensions.qiweionlineconnector.Text3Structure text) {
        this.text = text;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public com.zngcxhy.warehousemanagementsys.domain.structure.extensions.qiweionlineconnector.MiniprogramStructure getMiniprogram() {
        return miniprogram;
    }

    public void setMiniprogram(com.zngcxhy.warehousemanagementsys.domain.structure.extensions.qiweionlineconnector.MiniprogramStructure miniprogram) {
        this.miniprogram = miniprogram;
    }

}
