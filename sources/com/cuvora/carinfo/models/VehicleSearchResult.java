package com.cuvora.carinfo.models;

import com.cuvora.carinfo.models.cars.CarVariantsData;
import com.j256.ormlite.field.DatabaseField;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class VehicleSearchResult implements Response, Serializable {
    private CarVariantsData carVariantsData;
    private boolean dbReferred;
    private boolean disableGarage;
    private String displayName;
    private boolean helpMe;
    private String imageUrl;
    @DatabaseField(columnName = "vehicle_info_json")
    private String jsonString;
    private boolean refreshAllowed;
    @DatabaseField(columnName = "search_date")
    private Date searchDate;
    private String shareText;
    private List<VehicleInfo> vehicleInfoList;
    @DatabaseField(columnName = "vehicle_num", id = true)
    private String vehicleNum;

    public String getVehicleNum() {
        return this.vehicleNum;
    }

    public void setVehicleNum(String str) {
        this.vehicleNum = str;
    }

    public List<VehicleInfo> getVehicleInfoList() {
        return this.vehicleInfoList;
    }

    public void setVehicleInfoList(List<VehicleInfo> list) {
        this.vehicleInfoList = list;
    }

    public String getJsonString() {
        return this.jsonString;
    }

    public void setJsonString(String str) {
        this.jsonString = str;
    }

    public Date getSearchDate() {
        return this.searchDate;
    }

    public void setSearchDate(Date date) {
        this.searchDate = date;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public void setImageUrl(String str) {
        this.imageUrl = str;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public void setDisplayName(String str) {
        this.displayName = str;
    }

    public boolean isDbReferred() {
        return this.dbReferred;
    }

    public void setDisableGarage(boolean z) {
        this.disableGarage = z;
    }

    public boolean isDisableGarage() {
        return this.disableGarage;
    }

    public void setDbReferred(boolean z) {
        this.dbReferred = z;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VehicleSearchResult)) {
            return false;
        }
        VehicleSearchResult vehicleSearchResult = (VehicleSearchResult) obj;
        if (vehicleSearchResult.vehicleNum == null) {
            return false;
        }
        return vehicleSearchResult.vehicleNum.equals(this.vehicleNum);
    }

    public int hashCode() {
        return this.vehicleNum.hashCode();
    }

    public boolean isRefreshAllowed() {
        return this.refreshAllowed;
    }

    public void setRefreshAllowed(boolean z) {
        this.refreshAllowed = z;
    }

    public String getShareText() {
        return this.shareText;
    }

    public void setShareText(String str) {
        this.shareText = str;
    }

    public CarVariantsData getCarVariantsData() {
        return this.carVariantsData;
    }

    public void setCarVariantsData(CarVariantsData carVariantsData) {
        this.carVariantsData = carVariantsData;
    }

    public boolean isHelpMe() {
        return this.helpMe;
    }

    public void setHelpMe(boolean z) {
        this.helpMe = z;
    }
}
