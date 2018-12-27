package com.facebook.ads.internal.adapters.p082a;

import java.io.Serializable;

/* renamed from: com.facebook.ads.internal.adapters.a.e */
public class C1728e implements Serializable {
    private static final long serialVersionUID = -4041915335826065133L;
    /* renamed from: a */
    private final String f5212a;
    /* renamed from: b */
    private final String f5213b;

    C1728e(String str, String str2) {
        this.f5212a = C1728e.m6531a(str);
        this.f5213b = C1728e.m6531a(str2);
    }

    /* renamed from: a */
    private static String m6531a(String str) {
        return "null".equalsIgnoreCase(str) ? "" : str;
    }

    /* renamed from: a */
    public String m6532a() {
        return this.f5212a;
    }

    /* renamed from: b */
    public String m6533b() {
        return this.f5213b;
    }
}
