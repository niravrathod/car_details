package com.cuvora.carinfo.models.homepage;

import java.io.Serializable;
import java.util.Objects;

public class Content implements Serializable {
    private String imageUrl;
    private String subTitle;
    private String title;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public void setImageUrl(String str) {
        this.imageUrl = str;
    }

    public String getSubTitle() {
        return this.subTitle;
    }

    public void setSubTitle(String str) {
        this.subTitle = str;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Content)) {
            return false;
        }
        Content content = (Content) obj;
        if (!Objects.equals(this.title, content.title) || !Objects.equals(this.imageUrl, content.imageUrl) || Objects.equals(this.subTitle, content.subTitle) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.title, this.imageUrl, this.subTitle});
    }
}
