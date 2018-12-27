package com.cuvora.carinfo.models.cars;

import com.cuvora.carinfo.models.Response;
import java.io.Serializable;
import java.util.List;

public class CarListParticularBrandResponse implements Response, Serializable {
    private List<CarOfaBrand> data;
    private Price priceOverview;

    public List<CarOfaBrand> getData() {
        return this.data;
    }

    public void setData(List<CarOfaBrand> list) {
        this.data = list;
    }
}
