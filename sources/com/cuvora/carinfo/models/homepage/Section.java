package com.cuvora.carinfo.models.homepage;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Section implements Serializable {
    private Double aspectRatio;
    private List<Element> elements;
    private boolean header;
    private String headerIconUrl;
    private String title;
    private SectionTypeEnum type;
    private boolean viewAllEnabled;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public boolean isViewAllEnabled() {
        return this.viewAllEnabled;
    }

    public void setViewAllEnabled(boolean z) {
        this.viewAllEnabled = z;
    }

    public boolean isHeader() {
        return this.header;
    }

    public void setHeader(boolean z) {
        this.header = z;
    }

    public SectionTypeEnum getType() {
        return this.type;
    }

    public void setType(SectionTypeEnum sectionTypeEnum) {
        this.type = sectionTypeEnum;
    }

    public List<Element> getElements() {
        return this.elements;
    }

    public void setElements(List<Element> list) {
        this.elements = list;
    }

    public Double getAspectRatio() {
        return this.aspectRatio;
    }

    public void setAspectRatio(Double d) {
        this.aspectRatio = d;
    }

    public String getHeaderIconUrl() {
        return this.headerIconUrl;
    }

    public void setHeaderIconUrl(String str) {
        this.headerIconUrl = str;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Section)) {
            return false;
        }
        Section section = (Section) obj;
        if (this.viewAllEnabled != section.viewAllEnabled || this.header != section.header || !Objects.equals(this.title, section.title) || this.type != section.type || !Objects.equals(this.elements, section.elements) || !Objects.equals(this.aspectRatio, section.aspectRatio) || Objects.equals(this.headerIconUrl, section.headerIconUrl) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.title, Boolean.valueOf(this.viewAllEnabled), Boolean.valueOf(this.header), this.type, this.elements, this.aspectRatio, this.headerIconUrl});
    }
}
