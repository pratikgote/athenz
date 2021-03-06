//
// This file generated by rdl 1.5.2. Do not modify!
//

package com.yahoo.athenz.zms;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.yahoo.rdl.*;

//
// RoleSystemMeta - Set of system metadata attributes that all roles may have
// and can be changed by system admins.
//
@JsonIgnoreProperties(ignoreUnknown = true)
public class RoleSystemMeta {
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Boolean auditEnabled;

    public RoleSystemMeta setAuditEnabled(Boolean auditEnabled) {
        this.auditEnabled = auditEnabled;
        return this;
    }
    public Boolean getAuditEnabled() {
        return auditEnabled;
    }

    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != RoleSystemMeta.class) {
                return false;
            }
            RoleSystemMeta a = (RoleSystemMeta) another;
            if (auditEnabled == null ? a.auditEnabled != null : !auditEnabled.equals(a.auditEnabled)) {
                return false;
            }
        }
        return true;
    }
}
