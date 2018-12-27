package com.crashlytics.android.core;

import com.crashlytics.android.core.Report.Type;
import io.fabric.sdk.android.C2766c;
import io.fabric.sdk.android.C2774k;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class aj implements Report {
    /* renamed from: a */
    private final File f14687a;
    /* renamed from: b */
    private final File[] f14688b;
    /* renamed from: c */
    private final Map<String, String> f14689c;

    public aj(File file) {
        this(file, Collections.emptyMap());
    }

    public aj(File file, Map<String, String> map) {
        this.f14687a = file;
        this.f14688b = new File[]{file};
        this.f14689c = new HashMap(map);
        if (this.f14687a.length() == 0) {
            this.f14689c.putAll(ah.f4244a);
        }
    }

    /* renamed from: c */
    public File mo1131c() {
        return this.f14687a;
    }

    /* renamed from: d */
    public File[] mo1132d() {
        return this.f14688b;
    }

    /* renamed from: a */
    public String mo1129a() {
        return mo1131c().getName();
    }

    /* renamed from: b */
    public String mo1130b() {
        String a = mo1129a();
        return a.substring(0, a.lastIndexOf(46));
    }

    /* renamed from: e */
    public Map<String, String> mo1133e() {
        return Collections.unmodifiableMap(this.f14689c);
    }

    /* renamed from: f */
    public void mo1134f() {
        C2774k h = C2766c.m13524h();
        String str = CrashlyticsCore.TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Removing report at ");
        stringBuilder.append(this.f14687a.getPath());
        h.mo3554a(str, stringBuilder.toString());
        this.f14687a.delete();
    }

    /* renamed from: g */
    public Type mo1135g() {
        return Type.JAVA;
    }
}
