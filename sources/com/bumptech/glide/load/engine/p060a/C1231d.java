package com.bumptech.glide.load.engine.p060a;

import com.bumptech.glide.p055g.C1180j;
import java.util.Queue;

/* renamed from: com.bumptech.glide.load.engine.a.d */
abstract class C1231d<T extends C1237m> {
    /* renamed from: a */
    private final Queue<T> f3932a = C1180j.m4895a(20);

    /* renamed from: b */
    abstract T mo995b();

    C1231d() {
    }

    /* renamed from: c */
    T m5031c() {
        C1237m c1237m = (C1237m) this.f3932a.poll();
        return c1237m == null ? mo995b() : c1237m;
    }

    /* renamed from: a */
    public void m5029a(T t) {
        if (this.f3932a.size() < 20) {
            this.f3932a.offer(t);
        }
    }
}
