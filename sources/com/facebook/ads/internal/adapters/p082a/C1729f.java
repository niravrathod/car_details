package com.facebook.ads.internal.adapters.p082a;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.internal.adapters.a.f */
public class C1729f implements Serializable {
    private static final long serialVersionUID = -2102939945352398575L;
    /* renamed from: a */
    private final byte[] f5214a;
    /* renamed from: b */
    private final String f5215b;
    /* renamed from: c */
    private final List<String> f5216c;
    /* renamed from: d */
    private String f5217d;

    C1729f(byte[] bArr, String str, List<String> list) {
        this.f5214a = bArr;
        this.f5215b = str;
        this.f5216c = list;
    }

    /* renamed from: a */
    public String m6534a() {
        return this.f5217d;
    }

    /* renamed from: a */
    void m6535a(String str) {
        this.f5217d = str;
    }

    /* renamed from: b */
    public byte[] m6536b() {
        return this.f5214a;
    }

    /* renamed from: c */
    public String m6537c() {
        return this.f5215b;
    }

    /* renamed from: d */
    public List<String> m6538d() {
        return Collections.unmodifiableList(this.f5216c);
    }
}
