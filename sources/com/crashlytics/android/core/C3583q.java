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
import java.util.Map.Entry;

/* renamed from: com.crashlytics.android.core.q */
class C3583q extends C2789a implements C1392o {
    public C3583q(C2771h c2771h, String str, String str2, C2834c c2834c) {
        super(c2771h, str, str2, c2834c, HttpMethod.POST);
    }

    /* renamed from: a */
    public boolean mo1128a(C1391n c1391n) {
        c1391n = m18154a(m18155a(m13663b(), c1391n), c1391n.f4357b);
        C2774k h = C2766c.m13524h();
        String str = CrashlyticsCore.TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Sending report to: ");
        stringBuilder.append(m13662a());
        h.mo3554a(str, stringBuilder.toString());
        int b = c1391n.m13807b();
        C2774k h2 = C2766c.m13524h();
        String str2 = CrashlyticsCore.TAG;
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Create report request ID: ");
        stringBuilder2.append(c1391n.m13809b("X-REQUEST-ID"));
        h2.mo3554a(str2, stringBuilder2.toString());
        c1391n = C2766c.m13524h();
        str = CrashlyticsCore.TAG;
        stringBuilder = new StringBuilder();
        stringBuilder.append("Result was: ");
        stringBuilder.append(b);
        c1391n.mo3554a(str, stringBuilder.toString());
        return C2809p.m13725a(b) == null ? true : null;
    }

    /* renamed from: a */
    private HttpRequest m18155a(HttpRequest httpRequest, C1391n c1391n) {
        httpRequest = httpRequest.m13797a("X-CRASHLYTICS-API-KEY", c1391n.f4356a).m13797a("X-CRASHLYTICS-API-CLIENT-TYPE", "android").m13797a("X-CRASHLYTICS-API-CLIENT-VERSION", this.a.getVersion());
        for (Entry a : c1391n.f4357b.mo1133e().entrySet()) {
            httpRequest = httpRequest.m13803a(a);
        }
        return httpRequest;
    }

    /* renamed from: a */
    private HttpRequest m18154a(HttpRequest httpRequest, Report report) {
        httpRequest.m13817e("report[identifier]", report.mo1130b());
        if (report.mo1132d().length == 1) {
            C2774k h = C2766c.m13524h();
            String str = CrashlyticsCore.TAG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Adding single file ");
            stringBuilder.append(report.mo1129a());
            stringBuilder.append(" to report ");
            stringBuilder.append(report.mo1130b());
            h.mo3554a(str, stringBuilder.toString());
            return httpRequest.m13800a("report[file]", report.mo1129a(), "application/octet-stream", report.mo1131c());
        }
        int i = 0;
        for (File file : report.mo1132d()) {
            C2774k h2 = C2766c.m13524h();
            String str2 = CrashlyticsCore.TAG;
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Adding file ");
            stringBuilder2.append(file.getName());
            stringBuilder2.append(" to report ");
            stringBuilder2.append(report.mo1130b());
            h2.mo3554a(str2, stringBuilder2.toString());
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("report[file");
            stringBuilder3.append(i);
            stringBuilder3.append("]");
            httpRequest.m13800a(stringBuilder3.toString(), file.getName(), "application/octet-stream", file);
            i++;
        }
        return httpRequest;
    }
}
