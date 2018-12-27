package com.facebook.ads.internal.view.p110c.p111a;

import com.facebook.ads.internal.adapters.p082a.C1731h;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.view.c.a.b */
public class C1994b {
    /* renamed from: a */
    private final int f6156a;
    /* renamed from: b */
    private final int f6157b;
    /* renamed from: c */
    private final C1731h f6158c;

    C1994b(int i, int i2, C1731h c1731h) {
        this.f6156a = i;
        this.f6157b = i2;
        this.f6158c = c1731h;
    }

    /* renamed from: a */
    public Map<String, String> m7507a() {
        Map<String, String> hashMap = new HashMap();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f6156a);
        stringBuilder.append("");
        hashMap.put("cardind", stringBuilder.toString());
        stringBuilder = new StringBuilder();
        stringBuilder.append(this.f6157b);
        stringBuilder.append("");
        hashMap.put("cardcnt", stringBuilder.toString());
        return hashMap;
    }

    /* renamed from: b */
    public int m7508b() {
        return this.f6156a;
    }

    /* renamed from: c */
    public C1731h m7509c() {
        return this.f6158c;
    }
}
