package com.cuvora.carinfo.models.cars;

import java.io.Serializable;
import java.util.List;

public class CarOfaBrand implements Serializable {
    private List<CarsImage> images;
    private String makeName;
    private String modelId;
    private String modelName;
    private Price priceOverview;

    public String getMakeName() {
        return this.makeName;
    }

    public void setMakeName(String str) {
        this.makeName = str;
    }

    public String getModelName() {
        return this.modelName;
    }

    public void setModelName(String str) {
        this.modelName = str;
    }

    public Price getPriceOverview() {
        return this.priceOverview;
    }

    public void setPriceOverview(Price price) {
        this.priceOverview = price;
    }

    public String getModelId() {
        return this.modelId;
    }

    public void setModelId(String str) {
        this.modelId = str;
    }

    public void setImages(List<CarsImage> list) {
        this.images = list;
    }

    public List<CarsImage> getImages() {
        return this.images;
    }
}
