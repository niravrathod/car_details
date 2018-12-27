package com.google.firebase.components;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;

@KeepForSdk
/* renamed from: com.google.firebase.components.e */
public final class C2581e {
    /* renamed from: a */
    private final Class<?> f10962a;
    /* renamed from: b */
    private final int f10963b;
    /* renamed from: c */
    private final int f10964c;

    private C2581e(Class<?> cls, int i, int i2) {
        this.f10962a = (Class) Preconditions.checkNotNull(cls, "Null dependency anInterface.");
        this.f10963b = i;
        this.f10964c = i2;
    }

    @KeepForSdk
    /* renamed from: a */
    public static C2581e m12641a(Class<?> cls) {
        return new C2581e(cls, 1, 0);
    }

    /* renamed from: a */
    public final Class<?> m12642a() {
        return this.f10962a;
    }

    /* renamed from: b */
    public final boolean m12643b() {
        return this.f10963b == 1;
    }

    /* renamed from: c */
    public final boolean m12644c() {
        return this.f10964c == 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2581e)) {
            return false;
        }
        C2581e c2581e = (C2581e) obj;
        if (this.f10962a == c2581e.f10962a && this.f10963b == c2581e.f10963b && this.f10964c == c2581e.f10964c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f10962a.hashCode() ^ 1000003) * 1000003) ^ this.f10963b) * 1000003) ^ this.f10964c;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Dependency{anInterface=");
        stringBuilder.append(this.f10962a);
        stringBuilder.append(", required=");
        boolean z = false;
        stringBuilder.append(this.f10963b == 1);
        stringBuilder.append(", direct=");
        if (this.f10964c == 0) {
            z = true;
        }
        stringBuilder.append(z);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
