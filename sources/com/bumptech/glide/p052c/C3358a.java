package com.bumptech.glide.p052c;

import com.bumptech.glide.p055g.C1180j;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.bumptech.glide.c.a */
class C3358a implements C1136h {
    /* renamed from: a */
    private final Set<C1137i> f14233a = Collections.newSetFromMap(new WeakHashMap());
    /* renamed from: b */
    private boolean f14234b;
    /* renamed from: c */
    private boolean f14235c;

    C3358a() {
    }

    /* renamed from: a */
    public void mo942a(C1137i c1137i) {
        this.f14233a.add(c1137i);
        if (this.f14235c) {
            c1137i.mo948e();
        } else if (this.f14234b) {
            c1137i.mo946c();
        } else {
            c1137i.mo947d();
        }
    }

    /* renamed from: b */
    public void mo943b(C1137i c1137i) {
        this.f14233a.remove(c1137i);
    }

    /* renamed from: a */
    void m17254a() {
        this.f14234b = true;
        for (C1137i c : C1180j.m4894a(this.f14233a)) {
            c.mo946c();
        }
    }

    /* renamed from: b */
    void m17256b() {
        this.f14234b = false;
        for (C1137i d : C1180j.m4894a(this.f14233a)) {
            d.mo947d();
        }
    }

    /* renamed from: c */
    void m17258c() {
        this.f14235c = true;
        for (C1137i e : C1180j.m4894a(this.f14233a)) {
            e.mo948e();
        }
    }
}
