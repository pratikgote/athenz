//
// This file generated by rdl 1.5.2. Do not modify!
//

package com.yahoo.athenz.zms;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import com.yahoo.rdl.*;

//
// AssertionConditions - The representation of list of assertion conditions
//
@JsonIgnoreProperties(ignoreUnknown = true)
public class AssertionConditions {
    public List<AssertionCondition> conditionsList;

    public AssertionConditions setConditionsList(List<AssertionCondition> conditionsList) {
        this.conditionsList = conditionsList;
        return this;
    }
    public List<AssertionCondition> getConditionsList() {
        return conditionsList;
    }

    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != AssertionConditions.class) {
                return false;
            }
            AssertionConditions a = (AssertionConditions) another;
            if (conditionsList == null ? a.conditionsList != null : !conditionsList.equals(a.conditionsList)) {
                return false;
            }
        }
        return true;
    }
}
