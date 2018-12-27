package com.cuvora.carinfo.models.cars;

import com.google.gson.p140a.C2621c;
import java.io.Serializable;
import java.util.List;

public class CarSpecifications implements Serializable {
    @C2621c(a = "items")
    private List<SpecificationItems> specificationItems;
    @C2621c(a = "name")
    private String specificationPropertyName;

    public List<SpecificationItems> getSpecificationItems() {
        return this.specificationItems;
    }

    public void setSpecificationItems(List<SpecificationItems> list) {
        this.specificationItems = list;
    }

    public String getSpecificationPropertyName() {
        return this.specificationPropertyName;
    }

    public void setSpecificationPropertyName(String str) {
        this.specificationPropertyName = str;
    }
}
