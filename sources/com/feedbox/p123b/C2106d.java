package com.feedbox.p123b;

import kotlin.jvm.internal.C2885g;
import kotlin.jvm.p154a.C2877a;

/* renamed from: com.feedbox.b.d */
public class C2106d<T> {
    /* renamed from: a */
    private C2877a<? extends T> f6444a;
    /* renamed from: b */
    private volatile T f6445b;

    public C2106d(C2877a<? extends T> c2877a) {
        C2885g.m13910b(c2877a, "creator");
        this.f6444a = c2877a;
    }

    /* renamed from: a */
    public final T m7672a() {
        T t = this.f6445b;
        if (t != null) {
            return t;
        }
        synchronized (this) {
            t = this.f6445b;
            if (t == null) {
                C2877a c2877a = this.f6444a;
                if (c2877a == null) {
                    C2885g.m13906a();
                }
                t = c2877a.mo3923a();
                this.f6445b = t;
                this.f6444a = (C2877a) null;
            }
        }
        return t;
    }
}
