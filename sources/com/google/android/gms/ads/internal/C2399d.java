package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzjk;

/* renamed from: com.google.android.gms.ads.internal.d */
final class C2399d implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ zzjk f7673a;
    /* renamed from: b */
    private final /* synthetic */ int f7674b;
    /* renamed from: c */
    private final /* synthetic */ zzah f7675c;

    C2399d(zzah zzah, zzjk zzjk, int i) {
        this.f7675c = zzah;
        this.f7673a = zzjk;
        this.f7674b = i;
    }

    public final void run() {
        synchronized (this.f7675c.f19561t) {
            this.f7675c.m25954a(this.f7673a, this.f7674b);
        }
    }
}
