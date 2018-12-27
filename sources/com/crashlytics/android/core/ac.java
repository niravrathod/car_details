package com.crashlytics.android.core;

import com.crashlytics.android.core.Report.Type;
import io.fabric.sdk.android.C2766c;
import io.fabric.sdk.android.C2774k;
import java.io.File;
import java.util.Map;

class ac implements Report {
    /* renamed from: a */
    private final File f14682a;

    /* renamed from: a */
    public String mo1129a() {
        return null;
    }

    /* renamed from: c */
    public File mo1131c() {
        return null;
    }

    /* renamed from: e */
    public Map<String, String> mo1133e() {
        return null;
    }

    public ac(File file) {
        this.f14682a = file;
    }

    /* renamed from: f */
    public void mo1134f() {
        for (File file : mo1132d()) {
            C2774k h = C2766c.m13524h();
            String str = CrashlyticsCore.TAG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Removing native report file at ");
            stringBuilder.append(file.getPath());
            h.mo3554a(str, stringBuilder.toString());
            file.delete();
        }
        C2774k h2 = C2766c.m13524h();
        String str2 = CrashlyticsCore.TAG;
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Removing native report directory at ");
        stringBuilder2.append(this.f14682a);
        h2.mo3554a(str2, stringBuilder2.toString());
        this.f14682a.delete();
    }

    /* renamed from: b */
    public String mo1130b() {
        return this.f14682a.getName();
    }

    /* renamed from: d */
    public File[] mo1132d() {
        return this.f14682a.listFiles();
    }

    /* renamed from: g */
    public Type mo1135g() {
        return Type.NATIVE;
    }
}
