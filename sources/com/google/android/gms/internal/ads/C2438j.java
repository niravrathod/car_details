package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.zzbv;

/* renamed from: com.google.android.gms.internal.ads.j */
final class C2438j implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ AdOverlayInfoParcel f8181a;
    /* renamed from: b */
    private final /* synthetic */ zzabb f8182b;

    C2438j(zzabb zzabb, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f8182b = zzabb;
        this.f8181a = adOverlayInfoParcel;
    }

    public final void run() {
        zzbv.zzei();
        zzl.zza(this.f8182b.f19669a, this.f8181a, true);
    }
}
