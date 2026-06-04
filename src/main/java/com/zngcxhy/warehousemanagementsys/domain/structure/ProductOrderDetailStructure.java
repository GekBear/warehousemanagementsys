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
* auto generate ProductOrderDetailStructure structure
*
* @author sys
*/
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)
public class ProductOrderDetailStructure {
    public ProductEntity product;
    public PurchaseOrderDetaiEntity productOrderDetai;

    public ProductEntity getProduct() {
        return product;
    }

    public void setProduct(ProductEntity product) {
        this.product = product;
    }

    public PurchaseOrderDetaiEntity getProductOrderDetai() {
        return productOrderDetai;
    }

    public void setProductOrderDetai(PurchaseOrderDetaiEntity productOrderDetai) {
        this.productOrderDetai = productOrderDetai;
    }

}
