package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.z */
final class C2452z implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ zzaps f8485a;
    /* renamed from: b */
    private final /* synthetic */ String f8486b;
    /* renamed from: c */
    private final /* synthetic */ zzadd f8487c;

    C2452z(zzadd zzadd, zzaps zzaps, String str) {
        this.f8487c = zzadd;
        this.f8485a = zzaps;
        this.f8486b = str;
    }

    public final void run() {
        this.f8485a.m21290b((zzrt) this.f8487c.f8510d.zzdw().get(this.f8486b));
    }
}
