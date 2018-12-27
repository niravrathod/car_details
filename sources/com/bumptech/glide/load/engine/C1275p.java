package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.C1216c;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.engine.p */
final class C1275p {
    /* renamed from: a */
    private final Map<C1216c, C3491j<?>> f4024a = new HashMap();
    /* renamed from: b */
    private final Map<C1216c, C3491j<?>> f4025b = new HashMap();

    C1275p() {
    }

    /* renamed from: a */
    C3491j<?> m5146a(C1216c c1216c, boolean z) {
        return (C3491j) m5145a(z).get(c1216c);
    }

    /* renamed from: a */
    void m5147a(C1216c c1216c, C3491j<?> c3491j) {
        m5145a(c3491j.m17715a()).put(c1216c, c3491j);
    }

    /* renamed from: b */
    void m5148b(C1216c c1216c, C3491j<?> c3491j) {
        Map a = m5145a(c3491j.m17715a());
        if (c3491j.equals(a.get(c1216c)) != null) {
            a.remove(c1216c);
        }
    }

    /* renamed from: a */
    private Map<C1216c, C3491j<?>> m5145a(boolean z) {
        return z ? this.f4025b : this.f4024a;
    }
}
