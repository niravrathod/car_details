package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.VisibleForTesting;

@zzaer
public abstract class zzafj implements zzafh, zzami<Void> {
    /* renamed from: a */
    private final zzapu<zzafp> f16799a;
    /* renamed from: b */
    private final zzafh f16800b;
    /* renamed from: c */
    private final Object f16801c = new Object();

    public zzafj(zzapu<zzafp> zzapu, zzafh zzafh) {
        this.f16799a = zzapu;
        this.f16800b = zzafh;
    }

    /* renamed from: a */
    public abstract void mo4169a();

    /* renamed from: d */
    public abstract zzafx mo4170d();

    /* renamed from: a */
    public final void mo2231a(zzaft zzaft) {
        synchronized (this.f16801c) {
            this.f16800b.mo2231a(zzaft);
            mo4169a();
        }
    }

    /* renamed from: b */
    public final void mo2218b() {
        mo4169a();
    }

    @VisibleForTesting
    /* renamed from: a */
    final boolean m21115a(zzafx zzafx, zzafp zzafp) {
        try {
            zzafx.mo2233a(zzafp, new zzafs(this));
            return true;
        } catch (Throwable th) {
            zzaok.m10004c("Could not fetch ad response from ad request service due to an Exception.", th);
            zzbv.zzeo().m9714a(th, "AdRequestClientTask.getAdResponseFromService");
            this.f16800b.mo2231a(new zzaft(0));
            return false;
        }
    }

    /* renamed from: c */
    public final /* synthetic */ Object mo2219c() {
        zzafx d = mo4170d();
        if (d == null) {
            this.f16800b.mo2231a(new zzaft(0));
            mo4169a();
            return null;
        }
        this.f16799a.mo2373a(new bl(this, d), new bm(this));
        return null;
    }
}
