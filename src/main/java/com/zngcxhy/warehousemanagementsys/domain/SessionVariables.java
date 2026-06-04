package com.zngcxhy.warehousemanagementsys.domain;

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

/**
* auto generate SessionVariables structure
*
* @author sys
*/
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)
public class SessionVariables implements Serializable {
    @javax.validation.constraints.NotNull
    public com.zngcxhy.warehousemanagementsys.domain.http.HttpRequest<String> httpRequest = new com.zngcxhy.warehousemanagementsys.domain.http.HttpRequest <>();
    @javax.validation.constraints.NotNull
    public com.zngcxhy.warehousemanagementsys.domain.http.HttpResponse<String> httpResponse = new com.zngcxhy.warehousemanagementsys.domain.http.HttpResponse <>();
    @javax.validation.constraints.NotNull
    public com.netease.lowcode.auth.domain.LCAPUser currentUser= new com.netease.lowcode.auth.domain.LCAPUser();

}
