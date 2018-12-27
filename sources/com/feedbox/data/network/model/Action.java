package com.feedbox.data.network.model;

import com.google.gson.p140a.C2619a;
import com.google.gson.p140a.C2621c;
import java.io.Serializable;
import kotlin.jvm.internal.C2885g;

public final class Action implements Serializable {
    @C2621c(a = "actionType")
    @C2619a
    private final String actionType;
    @C2621c(a = "phone")
    @C2619a
    private final String callNumber;
    @C2621c(a = "lat")
    @C2619a
    private final String latitude;
    @C2621c(a = "lon")
    @C2619a
    private final String longitude;
    @C2621c(a = "packageId")
    @C2619a
    private final String packageId;
    @C2621c(a = "packageName")
    @C2619a
    private final String packageName;
    @C2621c(a = "url")
    @C2619a
    private final String url;
    @C2621c(a = "videoId")
    @C2619a
    private final String videoId;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Action) {
                Action action = (Action) obj;
                if (C2885g.m13909a(this.actionType, action.actionType) && C2885g.m13909a(this.url, action.url) && C2885g.m13909a(this.videoId, action.videoId) && C2885g.m13909a(this.packageId, action.packageId) && C2885g.m13909a(this.callNumber, action.callNumber) && C2885g.m13909a(this.latitude, action.latitude) && C2885g.m13909a(this.longitude, action.longitude) && C2885g.m13909a(this.packageName, action.packageName)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.actionType;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.url;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.videoId;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.packageId;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.callNumber;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.latitude;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.longitude;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.packageName;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Action(actionType=");
        stringBuilder.append(this.actionType);
        stringBuilder.append(", url=");
        stringBuilder.append(this.url);
        stringBuilder.append(", videoId=");
        stringBuilder.append(this.videoId);
        stringBuilder.append(", packageId=");
        stringBuilder.append(this.packageId);
        stringBuilder.append(", callNumber=");
        stringBuilder.append(this.callNumber);
        stringBuilder.append(", latitude=");
        stringBuilder.append(this.latitude);
        stringBuilder.append(", longitude=");
        stringBuilder.append(this.longitude);
        stringBuilder.append(", packageName=");
        stringBuilder.append(this.packageName);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public final String m7681a() {
        return this.actionType;
    }

    /* renamed from: b */
    public final String m7682b() {
        return this.url;
    }

    /* renamed from: c */
    public final String m7683c() {
        return this.videoId;
    }

    /* renamed from: d */
    public final String m7684d() {
        return this.packageId;
    }

    /* renamed from: e */
    public final String m7685e() {
        return this.callNumber;
    }

    /* renamed from: f */
    public final String m7686f() {
        return this.latitude;
    }

    /* renamed from: g */
    public final String m7687g() {
        return this.longitude;
    }

    /* renamed from: h */
    public final String m7688h() {
        return this.packageName;
    }
}
