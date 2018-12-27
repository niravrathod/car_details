package com.cuvora.carinfo.models.cars;

import java.io.Serializable;

public class Variants implements Serializable {
    private String features;
    private String fuelType;
    private String name;
    private PriceOverview priceOverview;
    private String transmissionType;
    private String versionId;

    public String getTransmissionType() {
        return this.transmissionType;
    }

    public void setTransmissionType(String str) {
        this.transmissionType = str;
    }

    public String getFuelType() {
        return this.fuelType;
    }

    public void setFuelType(String str) {
        this.fuelType = str;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public PriceOverview getPriceOverview() {
        return this.priceOverview;
    }

    public void setPriceOverview(PriceOverview priceOverview) {
        this.priceOverview = priceOverview;
    }

    public String getFeatures() {
        return this.features;
    }

    public void setFeatures(String str) {
        this.features = str;
    }

    public String getVersionId() {
        return this.versionId;
    }

    public void setVersionId(String str) {
        this.versionId = str;
    }
}
