package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;

final class ct extends zzalc {
    /* renamed from: a */
    private final /* synthetic */ zzakr f19630a;

    ct(zzakr zzakr) {
        this.f19630a = zzakr;
    }

    public final void m_() {
    }

    /* renamed from: a */
    public final void mo4075a() {
        zzny zzny = new zzny(this.f19630a.f8842f, this.f19630a.f8843g.f19893a);
        synchronized (this.f19630a.f8837a) {
            try {
                zzbv.zzet();
                zzob.m10915a(this.f19630a.f8844h, zzny);
            } catch (Throwable e) {
                zzaok.m10004c("Cannot config CSI reporter.", e);
            }
        }
    }
}
