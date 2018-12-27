package com.crashlytics.android.core;

import io.fabric.sdk.android.C2766c;
import io.fabric.sdk.android.C2774k;
import io.fabric.sdk.android.services.p148c.C2786a;
import java.io.File;

/* renamed from: com.crashlytics.android.core.k */
class C1387k {
    /* renamed from: a */
    private final String f4349a;
    /* renamed from: b */
    private final C2786a f4350b;

    public C1387k(String str, C2786a c2786a) {
        this.f4349a = str;
        this.f4350b = c2786a;
    }

    /* renamed from: a */
    public boolean m5660a() {
        try {
            return m5659d().createNewFile();
        } catch (Throwable e) {
            C2774k h = C2766c.m13524h();
            String str = CrashlyticsCore.TAG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error creating marker: ");
            stringBuilder.append(this.f4349a);
            h.mo3562e(str, stringBuilder.toString(), e);
            return false;
        }
    }

    /* renamed from: b */
    public boolean m5661b() {
        return m5659d().exists();
    }

    /* renamed from: c */
    public boolean m5662c() {
        return m5659d().delete();
    }

    /* renamed from: d */
    private File m5659d() {
        return new File(this.f4350b.mo3575a(), this.f4349a);
    }
}
