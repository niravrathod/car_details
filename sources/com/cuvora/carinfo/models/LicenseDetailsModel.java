package com.cuvora.carinfo.models;

import com.google.gson.p140a.C2619a;
import com.google.gson.p140a.C2621c;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.C2884f;
import kotlin.jvm.internal.C2885g;

public final class LicenseDetailsModel implements Serializable {
    @C2621c(a = "keys")
    @C2619a
    private final List<KeyValueModel> keys;
    @C2621c(a = "shareText")
    @C2619a
    private final String shareText;

    public static /* synthetic */ LicenseDetailsModel copy$default(LicenseDetailsModel licenseDetailsModel, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = licenseDetailsModel.keys;
        }
        if ((i & 2) != 0) {
            str = licenseDetailsModel.shareText;
        }
        return licenseDetailsModel.copy(list, str);
    }

    public final List<KeyValueModel> component1() {
        return this.keys;
    }

    public final String component2() {
        return this.shareText;
    }

    public final LicenseDetailsModel copy(List<KeyValueModel> list, String str) {
        C2885g.m13910b(str, "shareText");
        return new LicenseDetailsModel(list, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LicenseDetailsModel) {
                LicenseDetailsModel licenseDetailsModel = (LicenseDetailsModel) obj;
                if (C2885g.m13909a(this.keys, licenseDetailsModel.keys) && C2885g.m13909a(this.shareText, licenseDetailsModel.shareText)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        List list = this.keys;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.shareText;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LicenseDetailsModel(keys=");
        stringBuilder.append(this.keys);
        stringBuilder.append(", shareText=");
        stringBuilder.append(this.shareText);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public LicenseDetailsModel(List<KeyValueModel> list, String str) {
        C2885g.m13910b(str, "shareText");
        this.keys = list;
        this.shareText = str;
    }

    public final List<KeyValueModel> getKeys() {
        return this.keys;
    }

    public /* synthetic */ LicenseDetailsModel(List list, String str, int i, C2884f c2884f) {
        if ((i & 2) != 0) {
            str = "";
        }
        this(list, str);
    }

    public final String getShareText() {
        return this.shareText;
    }
}
