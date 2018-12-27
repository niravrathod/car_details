package com.facebook.ads.internal.protocol;

import android.text.TextUtils;

/* renamed from: com.facebook.ads.internal.protocol.a */
public class C1894a {
    /* renamed from: a */
    private final AdErrorType f5791a;
    /* renamed from: b */
    private final String f5792b;

    public C1894a(int i, String str) {
        this(AdErrorType.m7222a(i), str);
    }

    public C1894a(AdErrorType adErrorType, String str) {
        if (TextUtils.isEmpty(str)) {
            str = adErrorType.m7225b();
        }
        this.f5791a = adErrorType;
        this.f5792b = str;
    }

    /* renamed from: a */
    public static C1894a m7228a(AdErrorType adErrorType, String str) {
        return new C1894a(adErrorType, str);
    }

    /* renamed from: a */
    public static C1894a m7229a(C1895b c1895b) {
        return new C1894a(c1895b.m7232a(), c1895b.m7233b());
    }

    /* renamed from: a */
    public AdErrorType m7230a() {
        return this.f5791a;
    }

    /* renamed from: b */
    public String m7231b() {
        return this.f5792b;
    }
}
