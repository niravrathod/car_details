package com.google.android.gms.internal.ads;

final class fo implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ int f8062a;
    /* renamed from: b */
    private final /* synthetic */ int f8063b;
    /* renamed from: c */
    private final /* synthetic */ zzaqe f8064c;

    fo(zzaqe zzaqe, int i, int i2) {
        this.f8064c = zzaqe;
        this.f8062a = i;
        this.f8063b = i2;
    }

    public final void run() {
        if (this.f8064c.f19914r != null) {
            this.f8064c.f19914r.mo2377a(this.f8062a, this.f8063b);
        }
    }
}
