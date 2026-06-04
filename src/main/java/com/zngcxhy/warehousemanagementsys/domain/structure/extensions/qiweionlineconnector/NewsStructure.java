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
* auto generate NewsStructure structure
*
* @author sys
*/
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)
public class NewsStructure {
    public List<com.zngcxhy.warehousemanagementsys.domain.structure.extensions.qiweionlineconnector.ArticlesStructure> articles = new ArrayList <>();

    public List<com.zngcxhy.warehousemanagementsys.domain.structure.extensions.qiweionlineconnector.ArticlesStructure> getArticles() {
        return articles;
    }

    public void setArticles(List<com.zngcxhy.warehousemanagementsys.domain.structure.extensions.qiweionlineconnector.ArticlesStructure> articles) {
        this.articles = articles;
    }

}
