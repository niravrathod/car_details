package com.airbnb.lottie;

import java.util.Arrays;

/* renamed from: com.airbnb.lottie.j */
public final class C0970j<V> {
    /* renamed from: a */
    private final V f3235a;
    /* renamed from: b */
    private final Throwable f3236b;

    public C0970j(V v) {
        this.f3235a = v;
        this.f3236b = null;
    }

    public C0970j(Throwable th) {
        this.f3236b = th;
        this.f3235a = null;
    }

    /* renamed from: a */
    public V m4210a() {
        return this.f3235a;
    }

    /* renamed from: b */
    public Throwable m4211b() {
        return this.f3236b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0970j)) {
            return false;
        }
        C0970j c0970j = (C0970j) obj;
        if (m4210a() != null && m4210a().equals(c0970j.m4210a())) {
            return true;
        }
        if (m4211b() == null || c0970j.m4211b() == null) {
            return false;
        }
        return m4211b().toString().equals(m4211b().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{m4210a(), m4211b()});
    }
}
