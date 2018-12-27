package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdd.zze;

final class mj implements lx {
    /* renamed from: a */
    private final zzbel f16564a;
    /* renamed from: b */
    private final String f16565b;
    /* renamed from: c */
    private final Object[] f16566c;
    /* renamed from: d */
    private final int f16567d;

    mj(zzbel zzbel, String str, Object[] objArr) {
        this.f16564a = zzbel;
        this.f16565b = str;
        this.f16566c = objArr;
        zzbel = str.charAt(null);
        if (zzbel < 55296) {
            this.f16567d = zzbel;
            return;
        }
        zzbel &= 8191;
        int i = 13;
        int i2 = 1;
        while (true) {
            int i3 = i2 + 1;
            char charAt = str.charAt(i2);
            if (charAt >= '?') {
                zzbel |= (charAt & 8191) << i;
                i += 13;
                i2 = i3;
            } else {
                this.f16567d = zzbel | (charAt << i);
                return;
            }
        }
    }

    /* renamed from: d */
    final String m20832d() {
        return this.f16565b;
    }

    /* renamed from: e */
    final Object[] m20833e() {
        return this.f16566c;
    }

    /* renamed from: c */
    public final zzbel mo2121c() {
        return this.f16564a;
    }

    /* renamed from: a */
    public final int mo2119a() {
        return (this.f16567d & 1) == 1 ? zze.f9173h : zze.f9174i;
    }

    /* renamed from: b */
    public final boolean mo2120b() {
        return (this.f16567d & 2) == 2;
    }
}
