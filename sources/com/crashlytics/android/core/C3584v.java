package com.crashlytics.android.core;

import com.crashlytics.android.core.Report.Type;
import io.fabric.sdk.android.C2766c;
import io.fabric.sdk.android.C2774k;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.crashlytics.android.core.v */
class C3584v implements Report {
    /* renamed from: a */
    private final File[] f14744a;
    /* renamed from: b */
    private final Map<String, String> f14745b = new HashMap(ah.f4244a);
    /* renamed from: c */
    private final String f14746c;

    public C3584v(String str, File[] fileArr) {
        this.f14744a = fileArr;
        this.f14746c = str;
    }

    /* renamed from: a */
    public String mo1129a() {
        return this.f14744a[0].getName();
    }

    /* renamed from: b */
    public String mo1130b() {
        return this.f14746c;
    }

    /* renamed from: c */
    public File mo1131c() {
        return this.f14744a[0];
    }

    /* renamed from: d */
    public File[] mo1132d() {
        return this.f14744a;
    }

    /* renamed from: e */
    public Map<String, String> mo1133e() {
        return Collections.unmodifiableMap(this.f14745b);
    }

    /* renamed from: f */
    public void mo1134f() {
        for (File file : this.f14744a) {
            C2774k h = C2766c.m13524h();
            String str = CrashlyticsCore.TAG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Removing invalid report file at ");
            stringBuilder.append(file.getPath());
            h.mo3554a(str, stringBuilder.toString());
            file.delete();
        }
    }

    /* renamed from: g */
    public Type mo1135g() {
        return Type.JAVA;
    }
}
