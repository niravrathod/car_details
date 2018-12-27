package com.facebook.ads.internal.p101q.p102a;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.internal.q.a.x */
public abstract class C1937x<T> implements Runnable {
    /* renamed from: a */
    private final WeakReference<T> f5936a;

    public C1937x(T t) {
        this.f5936a = new WeakReference(t);
    }

    /* renamed from: a */
    public T m7333a() {
        return this.f5936a.get();
    }
}
