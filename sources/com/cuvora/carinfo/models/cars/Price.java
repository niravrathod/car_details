package com.cuvora.carinfo.models.cars;

import java.io.Serializable;

public class Price implements Serializable {
    private String price;
    private String pricePrefix;
    private String priceSuffix;

    public String getPrice() {
        return this.price;
    }

    public void setPrice(String str) {
        this.price = str;
    }

    public String getPriceSuffix() {
        return this.priceSuffix;
    }

    public void setPriceSuffix(String str) {
        this.priceSuffix = str;
    }

    public String getPricePrefix() {
        return this.pricePrefix;
    }

    public void setPricePrefix(String str) {
        this.pricePrefix = str;
    }
}
