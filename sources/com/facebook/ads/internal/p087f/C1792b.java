package com.facebook.ads.internal.p087f;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.f.b */
public class C1792b {
    /* renamed from: a */
    private final String f5410a;
    /* renamed from: b */
    private final Map<String, String> f5411b;
    /* renamed from: c */
    private final String f5412c;

    public C1792b(String str, Map<String, String> map) {
        this(str, map, false);
    }

    public C1792b(String str, Map<String, String> map, boolean z) {
        this.f5410a = str;
        this.f5411b = map;
        this.f5412c = z ? "1" : "0";
    }

    /* renamed from: a */
    public Map<String, String> m6741a() {
        Map<String, String> hashMap = new HashMap();
        hashMap.put("stacktrace", this.f5410a);
        hashMap.put("caught_exception", this.f5412c);
        hashMap.putAll(this.f5411b);
        return hashMap;
    }
}
