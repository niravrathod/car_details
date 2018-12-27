package com.cuvora.carinfo.models.cars;

import java.io.Serializable;

public class MileageData implements Serializable {
    private String average;
    private String displacement;
    private String fuelType;
    private String fuelUnit;
    private String transmission;

    public String getDisplacement() {
        return this.displacement;
    }

    public void setDisplacement(String str) {
        this.displacement = str;
    }

    public String getFuelUnit() {
        return this.fuelUnit;
    }

    public void setFuelUnit(String str) {
        this.fuelUnit = str;
    }

    public String getTransmission() {
        return this.transmission;
    }

    public void setTransmission(String str) {
        this.transmission = str;
    }

    public String getAverage() {
        return this.average;
    }

    public void setAverage(String str) {
        this.average = str;
    }

    public String getFuelType() {
        return this.fuelType;
    }

    public void setFuelType(String str) {
        this.fuelType = str;
    }
}
