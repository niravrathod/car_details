package com.cuvora.carinfo.models.cars;

import com.google.gson.p140a.C2621c;
import java.io.Serializable;
import java.util.ArrayList;

public class CarPropertiesData implements Serializable {
    @C2621c(a = "features")
    private ArrayList<CarFeatures> carFeatures;
    @C2621c(a = "overview")
    private ArrayList<CarOverview> carOverviews;
    @C2621c(a = "specs")
    private ArrayList<CarSpecifications> carSpecifications;
    private String makeName;

    public String getMakeName() {
        return this.makeName;
    }

    public void setMakeName(String str) {
        this.makeName = str;
    }

    public ArrayList<CarFeatures> getCarFeatures() {
        return this.carFeatures;
    }

    public void setCarFeatures(ArrayList<CarFeatures> arrayList) {
        this.carFeatures = arrayList;
    }

    public ArrayList<CarOverview> getCarOverviews() {
        return this.carOverviews;
    }

    public void setCarOverviews(ArrayList<CarOverview> arrayList) {
        this.carOverviews = arrayList;
    }

    public ArrayList<CarSpecifications> getCarSpecifications() {
        return this.carSpecifications;
    }

    public void setCarSpecifications(ArrayList<CarSpecifications> arrayList) {
        this.carSpecifications = arrayList;
    }
}
