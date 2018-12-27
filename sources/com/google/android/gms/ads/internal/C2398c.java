package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzjk;

/* renamed from: com.google.android.gms.ads.internal.c */
final class C2398c implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ zzjk f7671a;
    /* renamed from: b */
    private final /* synthetic */ zzah f7672b;

    C2398c(zzah zzah, zzjk zzjk) {
        this.f7672b = zzah;
        this.f7671a = zzjk;
    }

    public final void run() {
        synchronized (this.f7672b.f19561t) {
            if (this.f7672b.m25956a()) {
                this.f7672b.m25953a(this.f7671a);
            } else {
                this.f7672b.m25954a(this.f7671a, 1);
            }
        }
    }
}
