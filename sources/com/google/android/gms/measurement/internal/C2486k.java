package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.k */
final class C2486k implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ String f10641a;
    /* renamed from: b */
    private final /* synthetic */ long f10642b;
    /* renamed from: c */
    private final /* synthetic */ zza f10643c;

    C2486k(zza zza, String str, long j) {
        this.f10643c = zza;
        this.f10641a = str;
        this.f10642b = j;
    }

    public final void run() {
        this.f10643c.m28471c(this.f10641a, this.f10642b);
    }
}
