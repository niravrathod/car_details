package com.cuvora.carinfo.models.cars;

import java.io.Serializable;

public class CarsImage implements Serializable {
    private String hostUrl;
    private String imagePathLarge;
    private String imagePathThumbnail;

    public String getHostUrl() {
        return this.hostUrl;
    }

    public void setHostUrl(String str) {
        this.hostUrl = str;
    }

    public String getImagePathThumbnail() {
        return this.imagePathThumbnail;
    }

    public void setImagePathThumbnail(String str) {
        this.imagePathThumbnail = str;
    }

    public String getImagePathLarge() {
        return this.imagePathLarge;
    }

    public void setImagePathLarge(String str) {
        this.imagePathLarge = str;
    }

    public String getSanitizedCarThumnailImage() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getHostUrl());
        stringBuilder.append("/");
        stringBuilder.append(getImagePathThumbnail().replace(" ", "%20"));
        return stringBuilder.toString();
    }

    public String getSanitizedCarLargeImage() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getHostUrl());
        stringBuilder.append("/");
        stringBuilder.append(getImagePathLarge().replace(" ", "%20"));
        return stringBuilder.toString();
    }
}
