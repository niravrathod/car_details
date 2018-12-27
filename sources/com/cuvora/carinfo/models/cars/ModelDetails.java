package com.cuvora.carinfo.models.cars;

import java.io.Serializable;
import java.util.ArrayList;

public class ModelDetails implements Serializable {
    private ArrayList<CarsImage> images;
    private String makeName;
    private String modelName;
    private PriceOverviewParticularModel priceOverview;
    private String shareUrl;

    public PriceOverviewParticularModel getPriceOverview() {
        return this.priceOverview;
    }

    public void setPriceOverview(PriceOverviewParticularModel priceOverviewParticularModel) {
        this.priceOverview = priceOverviewParticularModel;
    }

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

    public ArrayList<CarsImage> getImages() {
        return this.images;
    }

    public void setImages(ArrayList<CarsImage> arrayList) {
        this.images = arrayList;
    }

    public String getShareUrl() {
        return this.shareUrl;
    }

    public void setShareUrl(String str) {
        this.shareUrl = str;
    }
}
