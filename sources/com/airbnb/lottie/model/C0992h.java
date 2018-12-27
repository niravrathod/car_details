package com.airbnb.lottie.model;

import android.support.v4.p017f.C0429j;

/* renamed from: com.airbnb.lottie.model.h */
public class C0992h<T> {
    /* renamed from: a */
    T f3320a;
    /* renamed from: b */
    T f3321b;

    /* renamed from: a */
    public void m4281a(T t, T t2) {
        this.f3320a = t;
        this.f3321b = t2;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof C0429j)) {
            return false;
        }
        C0429j c0429j = (C0429j) obj;
        if (C0992h.m4280b(c0429j.f1442a, this.f3320a) && C0992h.m4280b(c0429j.f1443b, this.f3321b) != null) {
            z = true;
        }
        return z;
    }

    /* renamed from: b */
    private static boolean m4280b(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || obj.equals(obj2) == null) {
                return null;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = this.f3320a == null ? 0 : this.f3320a.hashCode();
        if (this.f3321b != null) {
            i = this.f3321b.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Pair{");
        stringBuilder.append(String.valueOf(this.f3320a));
        stringBuilder.append(" ");
        stringBuilder.append(String.valueOf(this.f3321b));
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
