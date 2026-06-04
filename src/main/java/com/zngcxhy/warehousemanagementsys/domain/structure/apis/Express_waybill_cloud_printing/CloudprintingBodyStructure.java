package com.zngcxhy.warehousemanagementsys.domain.structure.apis.Express_waybill_cloud_printing;

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
* auto generate CloudprintingBodyStructure structure
*
* @author sys
*/
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)
public class CloudprintingBodyStructure {
    public com.zngcxhy.warehousemanagementsys.domain.structure.apis.Express_waybill_cloud_printing.RootStructure root = new com.zngcxhy.warehousemanagementsys.domain.structure.apis.Express_waybill_cloud_printing.RootStructure();

    public com.zngcxhy.warehousemanagementsys.domain.structure.apis.Express_waybill_cloud_printing.RootStructure getRoot() {
        return root;
    }

    public void setRoot(com.zngcxhy.warehousemanagementsys.domain.structure.apis.Express_waybill_cloud_printing.RootStructure root) {
        this.root = root;
    }

}
