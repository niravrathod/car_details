package com.crashlytics.android.answers;

import io.fabric.sdk.android.C2766c;
import io.fabric.sdk.android.C2771h;
import io.fabric.sdk.android.C2774k;
import io.fabric.sdk.android.services.common.C2789a;
import io.fabric.sdk.android.services.common.C2809p;
import io.fabric.sdk.android.services.network.C2834c;
import io.fabric.sdk.android.services.network.HttpMethod;
import io.fabric.sdk.android.services.network.HttpRequest;
import io.fabric.sdk.android.services.p147b.C2784f;
import java.io.File;
import java.util.List;

/* renamed from: com.crashlytics.android.answers.q */
class C3558q extends C2789a implements C2784f {
    /* renamed from: b */
    private final String f14656b;

    public C3558q(C2771h c2771h, String str, String str2, C2834c c2834c, String str3) {
        super(c2771h, str, str2, c2834c, HttpMethod.POST);
        this.f14656b = str3;
    }

    /* renamed from: a */
    public boolean mo1109a(List<File> list) {
        HttpRequest a = m13663b().m13797a("X-CRASHLYTICS-API-CLIENT-TYPE", "android").m13797a("X-CRASHLYTICS-API-CLIENT-VERSION", this.a.getVersion()).m13797a("X-CRASHLYTICS-API-KEY", this.f14656b);
        int i = 0;
        for (File file : list) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("session_analytics_file_");
            stringBuilder.append(i);
            a.m13800a(stringBuilder.toString(), file.getName(), "application/vnd.crashlytics.android.events", file);
            i++;
        }
        C2774k h = C2766c.m13524h();
        String str = Answers.TAG;
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Sending ");
        stringBuilder2.append(list.size());
        stringBuilder2.append(" analytics files to ");
        stringBuilder2.append(m13662a());
        h.mo3554a(str, stringBuilder2.toString());
        list = a.m13807b();
        C2774k h2 = C2766c.m13524h();
        String str2 = Answers.TAG;
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append("Response code for analytics file send is ");
        stringBuilder3.append(list);
        h2.mo3554a(str2, stringBuilder3.toString());
        if (C2809p.m13725a(list) == null) {
            return true;
        }
        return false;
    }
}
