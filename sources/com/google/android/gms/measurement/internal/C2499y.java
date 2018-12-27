package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.y */
final class C2499y implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ String f10676a;
    /* renamed from: b */
    private final /* synthetic */ long f10677b;
    /* renamed from: c */
    private final /* synthetic */ zza f10678c;

    C2499y(zza zza, String str, long j) {
        this.f10678c = zza;
        this.f10676a = str;
        this.f10677b = j;
    }

    public final void run() {
        this.f10678c.m28472d(this.f10676a, this.f10677b);
    }
}
