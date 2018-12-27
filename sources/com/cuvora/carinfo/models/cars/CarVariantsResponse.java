package com.cuvora.carinfo.models.cars;

import com.cuvora.carinfo.models.Response;
import com.google.gson.p140a.C2621c;

public class CarVariantsResponse implements Response {
    @C2621c(a = "data")
    private CarVariantsData carVariantsData;

    public CarVariantsData getCarVariantsData() {
        return this.carVariantsData;
    }

    public void setCarVariantsData(CarVariantsData carVariantsData) {
        this.carVariantsData = carVariantsData;
    }
}
