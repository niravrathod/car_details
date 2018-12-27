package com.cuvora.carinfo.models.homepage;

import com.cuvora.carinfo.models.Response;
import java.io.Serializable;

public class CityFuelPrice implements Response, Serializable {
    public static final String DELHI_CITY_ID = "1297";
    private FuelPrice fuelPrice;
    private City homeCity;

    public City getHomeCity() {
        return this.homeCity;
    }

    public void setHomeCity(City city) {
        this.homeCity = city;
    }

    public FuelPrice getFuelPrice() {
        return this.fuelPrice;
    }

    public void setFuelPrice(FuelPrice fuelPrice) {
        this.fuelPrice = fuelPrice;
    }
}
