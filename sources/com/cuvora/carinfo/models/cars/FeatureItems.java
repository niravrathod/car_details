package com.cuvora.carinfo.models.cars;

import java.io.Serializable;
import java.util.ArrayList;

public class FeatureItems implements Serializable {
    private String name;
    private String unitType;
    private ArrayList<String> values;

    public ArrayList<String> getValues() {
        return this.values;
    }

    public void setValues(ArrayList<String> arrayList) {
        this.values = arrayList;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getUnitType() {
        return this.unitType;
    }

    public void setUnitType(String str) {
        this.unitType = str;
    }
}
