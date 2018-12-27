package com.cuvora.carinfo.models;

import java.io.Serializable;
import java.util.Map;

public class VehicleInfo implements Serializable {
    private Map<String, String> vehicleInfoMap;

    public Map<String, String> getVehicleInfoMap() {
        return this.vehicleInfoMap;
    }

    public void setVehicleInfoMap(Map<String, String> map) {
        this.vehicleInfoMap = map;
    }
}
