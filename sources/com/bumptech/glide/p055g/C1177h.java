package com.bumptech.glide.p055g;

/* renamed from: com.bumptech.glide.g.h */
public class C1177h {
    /* renamed from: a */
    private Class<?> f3832a;
    /* renamed from: b */
    private Class<?> f3833b;
    /* renamed from: c */
    private Class<?> f3834c;

    public C1177h(Class<?> cls, Class<?> cls2) {
        m4878a(cls, cls2);
    }

    public C1177h(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        m4879a(cls, cls2, cls3);
    }

    /* renamed from: a */
    public void m4878a(Class<?> cls, Class<?> cls2) {
        m4879a(cls, cls2, null);
    }

    /* renamed from: a */
    public void m4879a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.f3832a = cls;
        this.f3833b = cls2;
        this.f3834c = cls3;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MultiClassKey{first=");
        stringBuilder.append(this.f3832a);
        stringBuilder.append(", second=");
        stringBuilder.append(this.f3833b);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                C1177h c1177h = (C1177h) obj;
                return this.f3832a.equals(c1177h.f3832a) && this.f3833b.equals(c1177h.f3833b) && C1180j.m4898a(this.f3834c, c1177h.f3834c) != null;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.f3832a.hashCode() * 31) + this.f3833b.hashCode()) * 31) + (this.f3834c != null ? this.f3834c.hashCode() : 0);
    }
}
