package com.cuvora.carinfo.models.homepage;

import java.io.Serializable;
import java.util.Map;
import java.util.Objects;

public class Deeplink implements Serializable {
    private Map<String, String> meta;
    private String url;

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public Map<String, String> getMeta() {
        return this.meta;
    }

    public void setMeta(Map<String, String> map) {
        this.meta = map;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Deeplink)) {
            return false;
        }
        Deeplink deeplink = (Deeplink) obj;
        if (!Objects.equals(this.url, deeplink.url) || Objects.equals(this.meta, deeplink.meta) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.url, this.meta});
    }
}
