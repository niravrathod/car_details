package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzaok;
import com.google.android.gms.internal.ads.zzoz;
import com.google.android.gms.internal.ads.zztk;

/* renamed from: com.google.android.gms.ads.internal.r */
final /* synthetic */ class C2414r implements Runnable {
    /* renamed from: a */
    private final zzbb f7717a;
    /* renamed from: b */
    private final zzoz f7718b;

    C2414r(zzbb zzbb, zzoz zzoz) {
        this.f7717a = zzbb;
        this.f7718b = zzoz;
    }

    public final void run() {
        zzbb zzbb = this.f7717a;
        zztk zztk = this.f7718b;
        try {
            if (zzbb.e.f7803l != null) {
                zzbb.e.f7803l.mo2747a(zztk);
            }
        } catch (Throwable e) {
            zzaok.m10006d("#007 Could not call remote method.", e);
        }
    }
}
