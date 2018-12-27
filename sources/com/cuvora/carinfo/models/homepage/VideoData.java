package com.cuvora.carinfo.models.homepage;

import java.io.Serializable;
import java.util.Objects;

public class VideoData implements Serializable {
    private String description;
    private String heading;
    private String shareText;
    private String videoId;

    public String getVideoId() {
        return this.videoId;
    }

    public void setVideoId(String str) {
        this.videoId = str;
    }

    public String getHeading() {
        return this.heading;
    }

    public void setHeading(String str) {
        this.heading = str;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public String getShareText() {
        return this.shareText;
    }

    public void setShareText(String str) {
        this.shareText = str;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoData)) {
            return false;
        }
        VideoData videoData = (VideoData) obj;
        if (!Objects.equals(this.videoId, videoData.videoId) || !Objects.equals(this.heading, videoData.heading) || !Objects.equals(this.description, videoData.description) || Objects.equals(this.shareText, videoData.shareText) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.videoId, this.heading, this.description, this.shareText});
    }
}
