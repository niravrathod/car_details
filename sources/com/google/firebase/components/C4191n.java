package com.google.firebase.components;

import com.google.firebase.p138c.C2573a;

/* renamed from: com.google.firebase.components.n */
final class C4191n<T> implements C2573a<T> {
    /* renamed from: a */
    private static final Object f17713a = new Object();
    /* renamed from: b */
    private volatile Object f17714b = f17713a;
    /* renamed from: c */
    private volatile C2573a<T> f17715c;

    C4191n(C2579c<T> c2579c, C2578b c2578b) {
        this.f17715c = C4192o.m23042a(c2579c, c2578b);
    }

    /* renamed from: a */
    public final T mo3316a() {
        T t = this.f17714b;
        if (t == f17713a) {
            synchronized (this) {
                t = this.f17714b;
                if (t == f17713a) {
                    t = this.f17715c.mo3316a();
                    this.f17714b = t;
                    this.f17715c = null;
                }
            }
        }
        return t;
    }
}
