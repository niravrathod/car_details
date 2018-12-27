package com.google.android.gms.internal.config;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class zzao {
    /* renamed from: a */
    private Map<String, Map<String, byte[]>> f9927a;
    /* renamed from: b */
    private long f9928b;
    /* renamed from: c */
    private List<byte[]> f9929c;

    public zzao(Map<String, Map<String, byte[]>> map, long j, List<byte[]> list) {
        this.f9927a = map;
        this.f9928b = j;
        this.f9929c = list;
    }

    /* renamed from: a */
    public final Map<String, Map<String, byte[]>> m11344a() {
        return this.f9927a;
    }

    /* renamed from: a */
    public final void m11345a(long j) {
        this.f9928b = j;
    }

    /* renamed from: a */
    public final void m11346a(Map<String, byte[]> map, String str) {
        if (this.f9927a == null) {
            this.f9927a = new HashMap();
        }
        this.f9927a.put(str, map);
    }

    /* renamed from: a */
    public final boolean m11347a(String str) {
        return (str == null || !m11351c() || this.f9927a.get(str) == null || ((Map) this.f9927a.get(str)).isEmpty()) ? false : true;
    }

    /* renamed from: a */
    public final boolean m11348a(String str, String str2) {
        return m11351c() && m11347a(str2) && m11350b(str, str2) != null;
    }

    /* renamed from: b */
    public final List<byte[]> m11349b() {
        return this.f9929c;
    }

    /* renamed from: b */
    public final byte[] m11350b(String str, String str2) {
        if (str != null) {
            if (m11347a(str2)) {
                return (byte[]) ((Map) this.f9927a.get(str2)).get(str);
            }
        }
        return null;
    }

    /* renamed from: c */
    public final boolean m11351c() {
        return (this.f9927a == null || this.f9927a.isEmpty()) ? false : true;
    }

    /* renamed from: d */
    public final long m11352d() {
        return this.f9928b;
    }
}
