package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzvm.zze;

final class cs implements ch {
    /* renamed from: a */
    private final zzwt f17473a;
    /* renamed from: b */
    private final String f17474b;
    /* renamed from: c */
    private final Object[] f17475c;
    /* renamed from: d */
    private final int f17476d;

    cs(zzwt zzwt, String str, Object[] objArr) {
        this.f17473a = zzwt;
        this.f17474b = str;
        this.f17475c = objArr;
        zzwt = str.charAt(null);
        if (zzwt < 55296) {
            this.f17476d = zzwt;
            return;
        }
        zzwt &= 8191;
        int i = 13;
        int i2 = 1;
        while (true) {
            int i3 = i2 + 1;
            char charAt = str.charAt(i2);
            if (charAt >= '?') {
                zzwt |= (charAt & 8191) << i;
                i += 13;
                i2 = i3;
            } else {
                this.f17476d = zzwt | (charAt << i);
                return;
            }
        }
    }

    /* renamed from: d */
    final String m22399d() {
        return this.f17474b;
    }

    /* renamed from: e */
    final Object[] m22400e() {
        return this.f17475c;
    }

    /* renamed from: c */
    public final zzwt mo3075c() {
        return this.f17473a;
    }

    /* renamed from: a */
    public final int mo3073a() {
        return (this.f17476d & 1) == 1 ? zze.f10274h : zze.f10275i;
    }

    /* renamed from: b */
    public final boolean mo3074b() {
        return (this.f17476d & 2) == 2;
    }
}
