package com.cuvora.carinfo.models.homepage;

import com.google.gson.p140a.C2621c;
import java.io.Serializable;
import java.util.Objects;

public class InstantArticleData implements Serializable {
    private String content;
    private String date;
    private String imageUrl;
    private String shareText;
    private String subTitle;
    private String title;
    @C2621c(a = "header_title")
    private String toolbarTitle;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String getSubTitle() {
        return this.subTitle;
    }

    public void setSubTitle(String str) {
        this.subTitle = str;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String str) {
        this.date = str;
    }

    public String getShareText() {
        return this.shareText;
    }

    public void setShareText(String str) {
        this.shareText = str;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public void setImageUrl(String str) {
        this.imageUrl = str;
    }

    public String getToolbarTitle() {
        return this.toolbarTitle;
    }

    public void setToolbarTitle(String str) {
        this.toolbarTitle = str;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstantArticleData)) {
            return false;
        }
        InstantArticleData instantArticleData = (InstantArticleData) obj;
        if (!Objects.equals(this.title, instantArticleData.title) || !Objects.equals(this.toolbarTitle, instantArticleData.toolbarTitle) || !Objects.equals(this.subTitle, instantArticleData.subTitle) || !Objects.equals(this.content, instantArticleData.content) || !Objects.equals(this.imageUrl, instantArticleData.imageUrl) || !Objects.equals(this.date, instantArticleData.date) || Objects.equals(this.shareText, instantArticleData.shareText) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.title, this.toolbarTitle, this.subTitle, this.content, this.imageUrl, this.date, this.shareText});
    }
}
