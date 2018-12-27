package com.bumptech.glide.p052c;

import com.bumptech.glide.p055g.C1180j;
import com.bumptech.glide.request.p067a.C3545h;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.bumptech.glide.c.p */
public final class C3366p implements C1137i {
    /* renamed from: a */
    private final Set<C3545h<?>> f14238a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: a */
    public void m17264a(C3545h<?> c3545h) {
        this.f14238a.add(c3545h);
    }

    /* renamed from: b */
    public void m17266b(C3545h<?> c3545h) {
        this.f14238a.remove(c3545h);
    }

    /* renamed from: c */
    public void mo946c() {
        for (C3545h c : C1180j.m4894a(this.f14238a)) {
            c.mo946c();
        }
    }

    /* renamed from: d */
    public void mo947d() {
        for (C3545h d : C1180j.m4894a(this.f14238a)) {
            d.mo947d();
        }
    }

    /* renamed from: e */
    public void mo948e() {
        for (C3545h e : C1180j.m4894a(this.f14238a)) {
            e.mo948e();
        }
    }

    /* renamed from: a */
    public List<C3545h<?>> m17263a() {
        return C1180j.m4894a(this.f14238a);
    }

    /* renamed from: b */
    public void m17265b() {
        this.f14238a.clear();
    }
}
