package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;

/* renamed from: com.google.firebase.c */
public final class C2574c {
    /* renamed from: a */
    private final String f10943a;
    /* renamed from: b */
    private final String f10944b;
    /* renamed from: c */
    private final String f10945c;
    /* renamed from: d */
    private final String f10946d;
    /* renamed from: e */
    private final String f10947e;
    /* renamed from: f */
    private final String f10948f;
    /* renamed from: g */
    private final String f10949g;

    private C2574c(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Preconditions.checkState(Strings.isEmptyOrWhitespace(str) ^ 1, "ApplicationId must be set.");
        this.f10944b = str;
        this.f10943a = str2;
        this.f10945c = str3;
        this.f10946d = str4;
        this.f10947e = str5;
        this.f10948f = str6;
        this.f10949g = str7;
    }

    /* renamed from: a */
    public static C2574c m12614a(Context context) {
        StringResourceValueReader stringResourceValueReader = new StringResourceValueReader(context);
        Object string = stringResourceValueReader.getString("google_app_id");
        if (TextUtils.isEmpty(string) != null) {
            return null;
        }
        return new C2574c(string, stringResourceValueReader.getString("google_api_key"), stringResourceValueReader.getString("firebase_database_url"), stringResourceValueReader.getString("ga_trackingId"), stringResourceValueReader.getString("gcm_defaultSenderId"), stringResourceValueReader.getString("google_storage_bucket"), stringResourceValueReader.getString("project_id"));
    }

    /* renamed from: a */
    public final String m12615a() {
        return this.f10944b;
    }

    /* renamed from: b */
    public final String m12616b() {
        return this.f10947e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2574c)) {
            return false;
        }
        C2574c c2574c = (C2574c) obj;
        if (Objects.equal(this.f10944b, c2574c.f10944b) && Objects.equal(this.f10943a, c2574c.f10943a) && Objects.equal(this.f10945c, c2574c.f10945c) && Objects.equal(this.f10946d, c2574c.f10946d) && Objects.equal(this.f10947e, c2574c.f10947e) && Objects.equal(this.f10948f, c2574c.f10948f) && Objects.equal(this.f10949g, c2574c.f10949g) != null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f10944b, this.f10943a, this.f10945c, this.f10946d, this.f10947e, this.f10948f, this.f10949g);
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("applicationId", this.f10944b).add("apiKey", this.f10943a).add("databaseUrl", this.f10945c).add("gcmSenderId", this.f10947e).add("storageBucket", this.f10948f).add("projectId", this.f10949g).toString();
    }
}
