package io.fabric.sdk.android.services.common;

/* renamed from: io.fabric.sdk.android.services.common.b */
class C2790b {
    /* renamed from: a */
    public final String f11888a;
    /* renamed from: b */
    public final boolean f11889b;

    C2790b(String str, boolean z) {
        this.f11888a = str;
        this.f11889b = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                C2790b c2790b = (C2790b) obj;
                if (this.f11889b != c2790b.f11889b) {
                    return false;
                }
                if (this.f11888a == null) {
                    return c2790b.f11888a == null;
                } else {
                    if (this.f11888a.equals(c2790b.f11888a) == null) {
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f11888a != null ? this.f11888a.hashCode() : 0) * 31) + this.f11889b;
    }
}
