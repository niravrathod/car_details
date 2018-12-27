package com.cuvora.carinfo.models.homepage;

import com.cuvora.carinfo.models.LicenseDetailsModel;
import com.cuvora.carinfo.models.VehicleSearchResult;
import java.io.Serializable;
import java.util.Objects;

public class Action implements Serializable {
    private Deeplink deeplink;
    private InstantArticleData instantArticleData;
    private LicenseDetailsModel licenseDetailsModel;
    private String modelId;
    private ActionTypeEnum type;
    private VehicleSearchResult vehicleSearchResult;
    private VideoData videoData;

    public ActionTypeEnum getType() {
        return this.type;
    }

    public void setType(ActionTypeEnum actionTypeEnum) {
        this.type = actionTypeEnum;
    }

    public LicenseDetailsModel getLicenseDetailsModel() {
        return this.licenseDetailsModel;
    }

    public void setLicenseDetailsModel(LicenseDetailsModel licenseDetailsModel) {
        this.licenseDetailsModel = licenseDetailsModel;
    }

    public VehicleSearchResult getVehicleSearchResult() {
        return this.vehicleSearchResult;
    }

    public void setVehicleSearchResult(VehicleSearchResult vehicleSearchResult) {
        this.vehicleSearchResult = vehicleSearchResult;
    }

    public VideoData getVideoData() {
        return this.videoData;
    }

    public void setVideoData(VideoData videoData) {
        this.videoData = videoData;
    }

    public InstantArticleData getInstantArticleData() {
        return this.instantArticleData;
    }

    public void setInstantArticleData(InstantArticleData instantArticleData) {
        this.instantArticleData = instantArticleData;
    }

    public Deeplink getDeeplink() {
        return this.deeplink;
    }

    public void setDeeplink(Deeplink deeplink) {
        this.deeplink = deeplink;
    }

    public String getModelId() {
        return this.modelId;
    }

    public void setModelId(String str) {
        this.modelId = str;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Action)) {
            return false;
        }
        Action action = (Action) obj;
        if (!Objects.equals(this.vehicleSearchResult, action.vehicleSearchResult) || this.type != action.type || !Objects.equals(this.videoData, action.videoData) || !Objects.equals(this.instantArticleData, action.instantArticleData) || !Objects.equals(this.deeplink, action.deeplink) || Objects.equals(this.modelId, action.modelId) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.vehicleSearchResult, this.type, this.videoData, this.instantArticleData, this.deeplink, this.modelId});
    }
}
