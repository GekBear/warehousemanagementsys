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
* auto generate AnonymousStructure_B202841ADEE061731D68863F55003B0E structure
*
* @author sys
*/
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_B202841ADEE061731D68863F55003B0E {
    public LCAPRolePerMapping lCAPRolePerMapping;
    public LCAPUserRoleMapping lCAPUserRoleMapping;
    public LCAPPerResMapping lCAPPerResMapping;
    public LCAPResource lCAPResource;

    public LCAPRolePerMapping getLCAPRolePerMapping() {
        return lCAPRolePerMapping;
    }

    public void setLCAPRolePerMapping(LCAPRolePerMapping lCAPRolePerMapping) {
        this.lCAPRolePerMapping = lCAPRolePerMapping;
    }

    public LCAPUserRoleMapping getLCAPUserRoleMapping() {
        return lCAPUserRoleMapping;
    }

    public void setLCAPUserRoleMapping(LCAPUserRoleMapping lCAPUserRoleMapping) {
        this.lCAPUserRoleMapping = lCAPUserRoleMapping;
    }

    public LCAPPerResMapping getLCAPPerResMapping() {
        return lCAPPerResMapping;
    }

    public void setLCAPPerResMapping(LCAPPerResMapping lCAPPerResMapping) {
        this.lCAPPerResMapping = lCAPPerResMapping;
    }

    public LCAPResource getLCAPResource() {
        return lCAPResource;
    }

    public void setLCAPResource(LCAPResource lCAPResource) {
        this.lCAPResource = lCAPResource;
    }

}
