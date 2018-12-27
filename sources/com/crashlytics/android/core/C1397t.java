package com.crashlytics.android.core;

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.settings.C2847o;

/* renamed from: com.crashlytics.android.core.t */
class C1397t {
    /* renamed from: a */
    private final Context f4369a;
    /* renamed from: b */
    private final C2847o f4370b;

    public C1397t(Context context, C2847o c2847o) {
        this.f4369a = context;
        this.f4370b = c2847o;
    }

    /* renamed from: a */
    public String m5674a() {
        return m5671a("com.crashlytics.CrashSubmissionPromptTitle", this.f4370b.f12036a);
    }

    /* renamed from: b */
    public String m5675b() {
        return m5671a("com.crashlytics.CrashSubmissionPromptMessage", this.f4370b.f12037b);
    }

    /* renamed from: c */
    public String m5676c() {
        return m5671a("com.crashlytics.CrashSubmissionSendTitle", this.f4370b.f12038c);
    }

    /* renamed from: d */
    public String m5677d() {
        return m5671a("com.crashlytics.CrashSubmissionAlwaysSendTitle", this.f4370b.f12042g);
    }

    /* renamed from: e */
    public String m5678e() {
        return m5671a("com.crashlytics.CrashSubmissionCancelTitle", this.f4370b.f12040e);
    }

    /* renamed from: a */
    private String m5671a(String str, String str2) {
        return m5673b(CommonUtils.m13620b(this.f4369a, str), str2);
    }

    /* renamed from: b */
    private String m5673b(String str, String str2) {
        return m5672a(str) ? str2 : str;
    }

    /* renamed from: a */
    private boolean m5672a(String str) {
        if (str != null) {
            if (str.length() != null) {
                return null;
            }
        }
        return true;
    }
}
