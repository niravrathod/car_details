package com.feedbox.data.network.model;

import com.google.gson.p140a.C2619a;
import com.google.gson.p140a.C2621c;
import java.io.Serializable;
import kotlin.jvm.internal.C2885g;

public final class Images implements Serializable {
    @C2621c(a = "LANDSCAPE")
    @C2619a
    private final String typeLandscape;
    @C2621c(a = "THUMBNAIL")
    @C2619a
    private final String typeThumbnail;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Images) {
                Images images = (Images) obj;
                if (C2885g.m13909a(this.typeLandscape, images.typeLandscape) && C2885g.m13909a(this.typeThumbnail, images.typeThumbnail)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.typeLandscape;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.typeThumbnail;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Images(typeLandscape=");
        stringBuilder.append(this.typeLandscape);
        stringBuilder.append(", typeThumbnail=");
        stringBuilder.append(this.typeThumbnail);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public final String m7703a() {
        return this.typeLandscape;
    }
}
