package com.facebook.ads.internal.p096o;

import com.facebook.ads.internal.p089h.C1803c;

/* renamed from: com.facebook.ads.internal.o.f */
class C1855f {
    /* renamed from: a */
    private final C1854a f5676a;
    /* renamed from: b */
    private final C1803c f5677b;
    /* renamed from: c */
    private final String f5678c;
    /* renamed from: d */
    private final String f5679d;
    /* renamed from: e */
    private final String f5680e;

    /* renamed from: com.facebook.ads.internal.o.f$a */
    enum C1854a {
        UNKNOWN,
        ERROR,
        ADS
    }

    C1855f(C1854a c1854a) {
        this(c1854a, null, null, null, null);
    }

    C1855f(C1854a c1854a, C1803c c1803c, String str, String str2, String str3) {
        this.f5676a = c1854a;
        this.f5677b = c1803c;
        this.f5678c = str;
        this.f5679d = str2;
        this.f5680e = str3;
    }

    /* renamed from: a */
    public C1803c mo1378a() {
        return this.f5677b;
    }

    /* renamed from: b */
    C1854a m7075b() {
        return this.f5676a;
    }

    /* renamed from: c */
    String m7076c() {
        return this.f5678c;
    }

    /* renamed from: d */
    String m7077d() {
        return this.f5679d;
    }

    /* renamed from: e */
    String m7078e() {
        return this.f5680e;
    }
}
