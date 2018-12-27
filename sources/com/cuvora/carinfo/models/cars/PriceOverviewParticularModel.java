package com.cuvora.carinfo.models.cars;

import java.io.Serializable;

public class PriceOverviewParticularModel implements Serializable {
    private String price;
    private String priceSuffix;

    public String getPriceSuffix() {
        return this.priceSuffix;
    }

    public void setPriceSuffix(String str) {
        this.priceSuffix = str;
    }

    public String getPrice() {
        return this.price;
    }

    public void setPrice(String str) {
        this.price = str;
    }
}
