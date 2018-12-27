package com.cuvora.carinfo.models.cars;

import com.google.gson.p140a.C2621c;
import java.io.Serializable;
import java.util.List;

public class CarFeatures implements Serializable {
    @C2621c(a = "items")
    private List<FeatureItems> featureItems;
    @C2621c(a = "name")
    private String featurePropertyName;

    public List<FeatureItems> getFeatureItems() {
        return this.featureItems;
    }

    public void setFeatureItems(List<FeatureItems> list) {
        this.featureItems = list;
    }

    public String getFeaturePropertyName() {
        return this.featurePropertyName;
    }

    public void setFeaturePropertyName(String str) {
        this.featurePropertyName = str;
    }
}
