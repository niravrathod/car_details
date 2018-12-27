package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.t */
final class C2448t implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ zzakm f8385a;
    /* renamed from: b */
    private final /* synthetic */ zzaco f8386b;

    C2448t(zzaco zzaco, zzakm zzakm) {
        this.f8386b = zzaco;
        this.f8385a = zzakm;
    }

    public final void run() {
        synchronized (this.f8386b.f19674c) {
            zzaco zzaco = this.f8386b;
            zzaco.f19672a.zzb(this.f8385a);
        }
    }
}
