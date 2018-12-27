package com.google.android.gms.internal.ads;

public final class zzhb {
    /* renamed from: a */
    final long f9519a;
    /* renamed from: b */
    final String f9520b;
    /* renamed from: c */
    final int f9521c;

    zzhb(long j, String str, int i) {
        this.f9519a = j;
        this.f9520b = str;
        this.f9521c = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof zzhb) {
                zzhb zzhb = (zzhb) obj;
                if (zzhb.f9519a == this.f9519a && zzhb.f9521c == this.f9521c) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.f9519a;
    }
}
