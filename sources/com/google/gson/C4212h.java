package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.gson.h */
public final class C4212h extends C2657k implements Iterable<C2657k> {
    /* renamed from: a */
    private final List<C2657k> f17765a = new ArrayList();

    /* renamed from: a */
    public void m23115a(C2657k c2657k) {
        if (c2657k == null) {
            c2657k = C4256l.f17892a;
        }
        this.f17765a.add(c2657k);
    }

    public Iterator<C2657k> iterator() {
        return this.f17765a.iterator();
    }

    /* renamed from: a */
    public Number mo3333a() {
        if (this.f17765a.size() == 1) {
            return ((C2657k) this.f17765a.get(0)).mo3333a();
        }
        throw new IllegalStateException();
    }

    /* renamed from: b */
    public String mo3334b() {
        if (this.f17765a.size() == 1) {
            return ((C2657k) this.f17765a.get(0)).mo3334b();
        }
        throw new IllegalStateException();
    }

    /* renamed from: c */
    public double mo3335c() {
        if (this.f17765a.size() == 1) {
            return ((C2657k) this.f17765a.get(0)).mo3335c();
        }
        throw new IllegalStateException();
    }

    /* renamed from: d */
    public long mo3336d() {
        if (this.f17765a.size() == 1) {
            return ((C2657k) this.f17765a.get(0)).mo3336d();
        }
        throw new IllegalStateException();
    }

    /* renamed from: e */
    public int mo3337e() {
        if (this.f17765a.size() == 1) {
            return ((C2657k) this.f17765a.get(0)).mo3337e();
        }
        throw new IllegalStateException();
    }

    /* renamed from: f */
    public boolean mo3338f() {
        if (this.f17765a.size() == 1) {
            return ((C2657k) this.f17765a.get(0)).mo3338f();
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof C4212h) || ((C4212h) obj).f17765a.equals(this.f17765a) == null) {
                return null;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.f17765a.hashCode();
    }
}
