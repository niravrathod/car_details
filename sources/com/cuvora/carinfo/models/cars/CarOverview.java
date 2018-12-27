package com.cuvora.carinfo.models.cars;

import java.io.Serializable;
import java.util.List;

public class CarOverview implements Serializable {
    private String name;
    private String unitType;
    private List<String> values;

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public List<String> getValues() {
        return this.values;
    }

    public void setValues(List<String> list) {
        this.values = list;
    }

    public String getUnitType() {
        return this.unitType;
    }

    public void setUnitType(String str) {
        this.unitType = str;
    }
}
