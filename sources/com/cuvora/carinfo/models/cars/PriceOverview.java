package com.cuvora.carinfo.models.cars;

import java.io.Serializable;

public class PriceOverview implements Serializable {
    private String price;
    private String priceLabel;

    public String getPrice() {
        return this.price;
    }

    public void setPrice(String str) {
        this.price = str;
    }

    public String getPriceLabel() {
        return this.priceLabel;
    }

    public void setPriceLabel(String str) {
        this.priceLabel = str;
    }
}
