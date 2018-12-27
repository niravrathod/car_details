package com.cuvora.carinfo.models.homepage;

import java.io.Serializable;

public class City implements Serializable {
    private String id;
    private String name;
    private String stateName;

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String str) {
        this.id = str;
    }

    public String getStateName() {
        return this.stateName;
    }

    public void setStateName(String str) {
        this.stateName = str;
    }
}
