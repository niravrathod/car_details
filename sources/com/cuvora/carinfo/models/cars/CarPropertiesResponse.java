package com.cuvora.carinfo.models.cars;

import com.cuvora.carinfo.models.Response;
import com.google.gson.p140a.C2621c;

public class CarPropertiesResponse implements Response {
    @C2621c(a = "data")
    private CarPropertiesData carPropertiesData;

    public CarPropertiesData getCarPropertiesData() {
        return this.carPropertiesData;
    }

    public void setCarPropertiesData(CarPropertiesData carPropertiesData) {
        this.carPropertiesData = carPropertiesData;
    }
}
