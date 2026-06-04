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
* auto generate AnonymousStructure_549508BDC1898EC803BEBB94E48237F8 structure
*
* @author sys
*/
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_549508BDC1898EC803BEBB94E48237F8 {
    public AfterSalesRequestEntity afterSalesRequest;
    public PurchaseOrderEntity purchaseOrder;
    public LCAPUser lCAPUser;

    public AfterSalesRequestEntity getAfterSalesRequest() {
        return afterSalesRequest;
    }

    public void setAfterSalesRequest(AfterSalesRequestEntity afterSalesRequest) {
        this.afterSalesRequest = afterSalesRequest;
    }

    public PurchaseOrderEntity getPurchaseOrder() {
        return purchaseOrder;
    }

    public void setPurchaseOrder(PurchaseOrderEntity purchaseOrder) {
        this.purchaseOrder = purchaseOrder;
    }

    public LCAPUser getLCAPUser() {
        return lCAPUser;
    }

    public void setLCAPUser(LCAPUser lCAPUser) {
        this.lCAPUser = lCAPUser;
    }

}
