package com.cuvora.carinfo.models.homepage;

import java.io.Serializable;

public class FuelPrice implements Serializable {
    private String diesel;
    private String petrol;

    public String getDiesel() {
        return this.diesel;
    }

    public void setDiesel(String str) {
        this.diesel = str;
    }

    public String getPetrol() {
        return this.petrol;
    }

    public void setPetrol(String str) {
        this.petrol = str;
    }
}
