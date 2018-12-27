package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzl;

/* renamed from: com.google.android.gms.ads.internal.h */
final class C2406h implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ AdOverlayInfoParcel f7697a;
    /* renamed from: b */
    private final /* synthetic */ C4698g f7698b;

    C2406h(C4698g c4698g, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f7698b = c4698g;
        this.f7697a = adOverlayInfoParcel;
    }

    public final void run() {
        zzbv.zzei();
        zzl.zza(this.f7698b.f19500a.e.zzrx, this.f7697a, true);
    }
}
