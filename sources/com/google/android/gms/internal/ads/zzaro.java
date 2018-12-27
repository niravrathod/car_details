package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;

@zzaer
public final class zzaro extends zzalc {
    /* renamed from: a */
    final zzarg f19915a;
    /* renamed from: b */
    final zzarr f19916b;
    /* renamed from: c */
    private final String f19917c;

    zzaro(zzarg zzarg, zzarr zzarr, String str) {
        this.f19915a = zzarg;
        this.f19916b = zzarr;
        this.f19917c = str;
        zzbv.zzfh().m10086a(this);
    }

    /* renamed from: a */
    public final void mo4075a() {
        try {
            this.f19916b.mo4196a(this.f19917c);
        } finally {
            zzalo.f8872a.post(new gd(this));
        }
    }

    public final void m_() {
        this.f19916b.mo4195a();
    }
}
