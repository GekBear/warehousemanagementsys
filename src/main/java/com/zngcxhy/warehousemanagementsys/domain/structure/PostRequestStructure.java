package com.zngcxhy.warehousemanagementsys.domain.structure;

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
* auto generate PostRequestStructure structure
*
* @author sys
*/
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)
public class PostRequestStructure {
    public com.zngcxhy.warehousemanagementsys.domain.http.HttpResponse<String> response = new com.zngcxhy.warehousemanagementsys.domain.http.HttpResponse <>();
    public String status;
    public Map<String,String> requestInfo = new HashMap <>();

    public com.zngcxhy.warehousemanagementsys.domain.http.HttpResponse<String> getResponse() {
        return response;
    }

    public void setResponse(com.zngcxhy.warehousemanagementsys.domain.http.HttpResponse<String> response) {
        this.response = response;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Map<String,String> getRequestInfo() {
        return requestInfo;
    }

    public void setRequestInfo(Map<String,String> requestInfo) {
        this.requestInfo = requestInfo;
    }

}
