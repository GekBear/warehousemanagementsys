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
* auto generate AnonymousStructure_CFB8CE5FC8814213A70B859C53A46F48 structure
*
* @author sys
*/
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_CFB8CE5FC8814213A70B859C53A46F48 {
    public InventoryEntity inventory;
    public ShelfEntity shelf;
    public WarehouseEntity warehouse;
    public ProductEntity product;
    public LCAPUser lCAPUser;

    public InventoryEntity getInventory() {
        return inventory;
    }

    public void setInventory(InventoryEntity inventory) {
        this.inventory = inventory;
    }

    public ShelfEntity getShelf() {
        return shelf;
    }

    public void setShelf(ShelfEntity shelf) {
        this.shelf = shelf;
    }

    public WarehouseEntity getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(WarehouseEntity warehouse) {
        this.warehouse = warehouse;
    }

    public ProductEntity getProduct() {
        return product;
    }

    public void setProduct(ProductEntity product) {
        this.product = product;
    }

    public LCAPUser getLCAPUser() {
        return lCAPUser;
    }

    public void setLCAPUser(LCAPUser lCAPUser) {
        this.lCAPUser = lCAPUser;
    }

}
