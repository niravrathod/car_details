package com.facebook.ads.internal.p107r;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.r.b */
public class C1959b {
    /* renamed from: a */
    private C1960c f6025a;
    /* renamed from: b */
    private float f6026b;
    /* renamed from: c */
    private Map<String, String> f6027c;

    public C1959b(C1960c c1960c) {
        this(c1960c, 0.0f);
    }

    public C1959b(C1960c c1960c, float f) {
        this(c1960c, f, null);
    }

    public C1959b(C1960c c1960c, float f, Map<String, String> map) {
        this.f6025a = c1960c;
        this.f6026b = f;
        if (map != null) {
            this.f6027c = map;
        } else {
            this.f6027c = new HashMap();
        }
    }

    /* renamed from: a */
    public boolean m7424a() {
        return this.f6025a == C1960c.IS_VIEWABLE;
    }

    /* renamed from: b */
    public int m7425b() {
        return this.f6025a.m7428a();
    }

    /* renamed from: c */
    public float m7426c() {
        return this.f6026b;
    }

    /* renamed from: d */
    public Map<String, String> m7427d() {
        return this.f6027c;
    }
}
