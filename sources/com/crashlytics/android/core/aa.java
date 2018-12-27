package com.crashlytics.android.core;

import io.fabric.sdk.android.C2766c;
import io.fabric.sdk.android.C2771h;
import io.fabric.sdk.android.C2774k;
import io.fabric.sdk.android.services.common.C2789a;
import io.fabric.sdk.android.services.common.C2809p;
import io.fabric.sdk.android.services.network.C2834c;
import io.fabric.sdk.android.services.network.HttpMethod;
import io.fabric.sdk.android.services.network.HttpRequest;
import java.io.File;

class aa extends C2789a implements C1392o {
    public aa(C2771h c2771h, String str, String str2, C2834c c2834c) {
        super(c2771h, str, str2, c2834c, HttpMethod.POST);
    }

    /* renamed from: a */
    public boolean mo1128a(C1391n c1391n) {
        c1391n = m18096a(m18097a(m13663b(), c1391n.f4356a), c1391n.f4357b);
        C2774k h = C2766c.m13524h();
        String str = CrashlyticsCore.TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Sending report to: ");
        stringBuilder.append(m13662a());
        h.mo3554a(str, stringBuilder.toString());
        c1391n = c1391n.m13807b();
        h = C2766c.m13524h();
        str = CrashlyticsCore.TAG;
        stringBuilder = new StringBuilder();
        stringBuilder.append("Result was: ");
        stringBuilder.append(c1391n);
        h.mo3554a(str, stringBuilder.toString());
        return C2809p.m13725a(c1391n) == null ? true : null;
    }

    /* renamed from: a */
    private HttpRequest m18097a(HttpRequest httpRequest, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Crashlytics Android SDK/");
        stringBuilder.append(this.a.getVersion());
        httpRequest.m13797a("User-Agent", stringBuilder.toString()).m13797a("X-CRASHLYTICS-API-CLIENT-TYPE", "android").m13797a("X-CRASHLYTICS-API-CLIENT-VERSION", this.a.getVersion()).m13797a("X-CRASHLYTICS-API-KEY", str);
        return httpRequest;
    }

    /* renamed from: a */
    private HttpRequest m18096a(HttpRequest httpRequest, Report report) {
        httpRequest.m13817e("report_id", report.mo1130b());
        for (File file : report.mo1132d()) {
            if (file.getName().equals("minidump")) {
                httpRequest.m13800a("minidump_file", file.getName(), "application/octet-stream", file);
            } else if (file.getName().equals("metadata")) {
                httpRequest.m13800a("crash_meta_file", file.getName(), "application/octet-stream", file);
            } else if (file.getName().equals("binaryImages")) {
                httpRequest.m13800a("binary_images_file", file.getName(), "application/octet-stream", file);
            } else if (file.getName().equals("session")) {
                httpRequest.m13800a("session_meta_file", file.getName(), "application/octet-stream", file);
            } else if (file.getName().equals("app")) {
                httpRequest.m13800a("app_meta_file", file.getName(), "application/octet-stream", file);
            } else if (file.getName().equals("device")) {
                httpRequest.m13800a("device_meta_file", file.getName(), "application/octet-stream", file);
            } else if (file.getName().equals("os")) {
                httpRequest.m13800a("os_meta_file", file.getName(), "application/octet-stream", file);
            } else if (file.getName().equals("user")) {
                httpRequest.m13800a("user_meta_file", file.getName(), "application/octet-stream", file);
            } else if (file.getName().equals("logs")) {
                httpRequest.m13800a("logs_file", file.getName(), "application/octet-stream", file);
            } else if (file.getName().equals("keys")) {
                httpRequest.m13800a("keys_file", file.getName(), "application/octet-stream", file);
            }
        }
        return httpRequest;
    }
}
