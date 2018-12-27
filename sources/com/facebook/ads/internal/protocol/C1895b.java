package com.facebook.ads.internal.protocol;

/* renamed from: com.facebook.ads.internal.protocol.b */
public class C1895b extends Exception {
    /* renamed from: a */
    private final AdErrorType f5793a;
    /* renamed from: b */
    private final String f5794b;

    public C1895b(AdErrorType adErrorType, String str) {
        this(adErrorType, str, null);
    }

    public C1895b(AdErrorType adErrorType, String str, Throwable th) {
        super(str, th);
        this.f5793a = adErrorType;
        this.f5794b = str;
    }

    /* renamed from: a */
    public AdErrorType m7232a() {
        return this.f5793a;
    }

    /* renamed from: b */
    public String m7233b() {
        return this.f5794b;
    }
}
