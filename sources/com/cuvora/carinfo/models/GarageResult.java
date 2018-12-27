package com.cuvora.carinfo.models;

import com.crashlytics.android.Crashlytics;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GarageResult implements Response, Serializable {
    private String email;
    private long lastModifiedTime;
    private List<LicenseDetailsModel> licenceDetails;
    private List<String> licenceSearches;
    private String mobileNumber;
    private List<String> myGarageVehicles = new ArrayList();
    private String name;
    private Map<String, Object> properties;
    private String userId;
    private List<String> vehicleNumbers = new ArrayList();
    private List<VehicleSearchResult> vehicleSearchResultList = new ArrayList();

    public List<String> getVehicleNumbers() {
        return this.vehicleNumbers;
    }

    public void setProperties(Map<String, Object> map) {
        this.properties = map;
    }

    public Map<String, Object> getProperties() {
        return this.properties;
    }

    public void setVehicleNumbers(List<String> list) {
        this.vehicleNumbers = list;
    }

    public List<VehicleSearchResult> getVehicleSearchResultList() {
        return this.vehicleSearchResultList;
    }

    public void setVehicleSearchResultList(List<VehicleSearchResult> list) {
        this.vehicleSearchResultList = list;
    }

    public long getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public void setLastModifiedTime(long j) {
        this.lastModifiedTime = j;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getMobileNumber() {
        return this.mobileNumber;
    }

    public void setMobileNumber(String str) {
        this.mobileNumber = str;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String str) {
        this.email = str;
    }

    public boolean containsRewardedVideoExpiryTimeField() {
        return this.properties != null && this.properties.containsKey("rewarded_video_expiry_time");
    }

    public List<String> getMyGarageVehicles() {
        return this.myGarageVehicles;
    }

    public void setMyGarageVehicles(List<String> list) {
        this.myGarageVehicles = list;
    }

    public long getRewardedVideoExpiryTime() {
        if (this.properties == null || !this.properties.containsKey("rewarded_video_expiry_time")) {
            return 0;
        }
        try {
            return Long.parseLong(String.valueOf(this.properties.get("rewarded_video_expiry_time")));
        } catch (Exception e) {
            e.printStackTrace();
            Crashlytics.log(e.getMessage());
            return 0;
        }
    }

    public boolean vehicleInGarage(String str) {
        return this.myGarageVehicles.contains(str);
    }

    public boolean vehicleInRecentSearches(String str) {
        return this.vehicleNumbers.contains(str);
    }

    public List<LicenseDetailsModel> getLicenceDetails() {
        return this.licenceDetails;
    }

    public void setLicenceDetails(List<LicenseDetailsModel> list) {
        this.licenceDetails = list;
    }

    public List<String> getLicenceSearches() {
        return this.licenceSearches;
    }

    public void setLicenceSearches(List<String> list) {
        this.licenceSearches = list;
    }
}
