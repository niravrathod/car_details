package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.zzaer;
import com.google.android.gms.internal.ads.zzalc;
import com.google.android.gms.internal.ads.zzalo;

@zzaer
/* renamed from: com.google.android.gms.ads.internal.g */
final class C4698g extends zzalc {
    /* renamed from: a */
    final /* synthetic */ zzal f19500a;
    /* renamed from: b */
    private final int f19501b;

    public C4698g(zzal zzal, int i) {
        this.f19500a = zzal;
        this.f19501b = i;
    }

    public final void m_() {
    }

    /* renamed from: a */
    public final void mo4075a() {
        boolean z = this.f19500a.e.f7817z;
        zzbv.zzek();
        zzaq zzaq = new zzaq(z, zzalo.m9828o(this.f19500a.e.zzrx), this.f19500a.f21683m, this.f19500a.f21684n, this.f19500a.e.f7817z ? this.f19501b : -1, this.f19500a.f21685o, this.f19500a.e.zzadl.f8771L, this.f19500a.e.zzadl.f8774O);
        int requestedOrientation = this.f19500a.e.zzadl.f8781b.getRequestedOrientation();
        if (requestedOrientation == -1) {
            requestedOrientation = this.f19500a.e.zzadl.f8787h;
        }
        zzalo.f8872a.post(new C2406h(this, new AdOverlayInfoParcel(this.f19500a, this.f19500a, this.f19500a, this.f19500a.e.zzadl.f8781b, requestedOrientation, this.f19500a.e.zzadg, this.f19500a.e.zzadl.f8760A, zzaq)));
    }
}
