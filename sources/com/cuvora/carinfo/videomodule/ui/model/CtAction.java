package com.cuvora.carinfo.videomodule.ui.model;

import java.io.Serializable;
import kotlin.jvm.internal.C2884f;
import kotlin.jvm.internal.C2885g;

public final class CtAction implements Serializable {
    private final CtActionType actionType;
    private final String callNumber;
    private final Float latitude;
    private final Float longitude;
    private final String packageId;
    private final String packageName;
    private final String url;
    private final String videoId;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CtAction) {
                CtAction ctAction = (CtAction) obj;
                if (C2885g.m13909a(this.actionType, ctAction.actionType) && C2885g.m13909a(this.url, ctAction.url) && C2885g.m13909a(this.packageId, ctAction.packageId) && C2885g.m13909a(this.videoId, ctAction.videoId) && C2885g.m13909a(this.callNumber, ctAction.callNumber) && C2885g.m13909a(this.packageName, ctAction.packageName) && C2885g.m13909a(this.latitude, ctAction.latitude) && C2885g.m13909a(this.longitude, ctAction.longitude)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        CtActionType ctActionType = this.actionType;
        int i = 0;
        int hashCode = (ctActionType != null ? ctActionType.hashCode() : 0) * 31;
        String str = this.url;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.packageId;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.videoId;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.callNumber;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.packageName;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Float f = this.latitude;
        hashCode = (hashCode + (f != null ? f.hashCode() : 0)) * 31;
        f = this.longitude;
        if (f != null) {
            i = f.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CtAction(actionType=");
        stringBuilder.append(this.actionType);
        stringBuilder.append(", url=");
        stringBuilder.append(this.url);
        stringBuilder.append(", packageId=");
        stringBuilder.append(this.packageId);
        stringBuilder.append(", videoId=");
        stringBuilder.append(this.videoId);
        stringBuilder.append(", callNumber=");
        stringBuilder.append(this.callNumber);
        stringBuilder.append(", packageName=");
        stringBuilder.append(this.packageName);
        stringBuilder.append(", latitude=");
        stringBuilder.append(this.latitude);
        stringBuilder.append(", longitude=");
        stringBuilder.append(this.longitude);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public CtAction(CtActionType ctActionType, String str, String str2, String str3, String str4, String str5, Float f, Float f2) {
        this.actionType = ctActionType;
        this.url = str;
        this.packageId = str2;
        this.videoId = str3;
        this.callNumber = str4;
        this.packageName = str5;
        this.latitude = f;
        this.longitude = f2;
    }

    /* renamed from: a */
    public final CtActionType m6133a() {
        return this.actionType;
    }

    /* renamed from: b */
    public final String m6134b() {
        return this.url;
    }

    /* renamed from: c */
    public final String m6135c() {
        return this.packageId;
    }

    public /* synthetic */ CtAction(CtActionType ctActionType, String str, String str2, String str3, String str4, String str5, Float f, Float f2, int i, C2884f c2884f) {
        int i2 = i;
        this(ctActionType, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? (String) null : str4, (i2 & 32) != 0 ? (String) null : str5, (i2 & 64) != 0 ? (Float) null : f, (i2 & 128) != 0 ? (Float) null : f2);
    }

    /* renamed from: d */
    public final String m6136d() {
        return this.callNumber;
    }

    /* renamed from: e */
    public final String m6137e() {
        return this.packageName;
    }

    /* renamed from: f */
    public final Float m6138f() {
        return this.latitude;
    }

    /* renamed from: g */
    public final Float m6139g() {
        return this.longitude;
    }
}
