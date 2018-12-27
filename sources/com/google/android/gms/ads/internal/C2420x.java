package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzakm;
import com.google.android.gms.internal.ads.zzaok;
import com.google.android.gms.internal.ads.zzpf;
import com.google.android.gms.internal.ads.zzrt;

/* renamed from: com.google.android.gms.ads.internal.x */
final class C2420x implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ String f7734a;
    /* renamed from: b */
    private final /* synthetic */ zzakm f7735b;
    /* renamed from: c */
    private final /* synthetic */ zzbb f7736c;

    C2420x(zzbb zzbb, String str, zzakm zzakm) {
        this.f7736c = zzbb;
        this.f7734a = str;
        this.f7735b = zzakm;
    }

    public final void run() {
        try {
            ((zzrt) this.f7736c.e.f7805n.get(this.f7734a)).mo2686a((zzpf) this.f7735b.f8762C);
        } catch (Throwable e) {
            zzaok.m10006d("#007 Could not call remote method.", e);
        }
    }
}
