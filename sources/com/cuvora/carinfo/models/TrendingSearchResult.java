package com.cuvora.carinfo.models;

import com.j256.ormlite.field.DatabaseField;
import java.util.ArrayList;
import java.util.List;

public class TrendingSearchResult implements Response {
    @DatabaseField(columnName = "last_updated_time")
    private long epoch;
    private List<VehicleSearchResult> vehicleSearchResultList = new ArrayList();

    public long getEpoch() {
        return this.epoch;
    }

    public void setEpoch(long j) {
        this.epoch = j;
    }

    public List<VehicleSearchResult> getVehicleSearchResultList() {
        return this.vehicleSearchResultList;
    }

    public void setVehicleSearchResultList(List<VehicleSearchResult> list) {
        this.vehicleSearchResultList = list;
    }
}
