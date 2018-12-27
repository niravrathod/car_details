package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzas;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.android.gms.internal.ads.v */
final class C2450v implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ CountDownLatch f8435a;
    /* renamed from: b */
    private final /* synthetic */ zzacy f8436b;

    C2450v(zzacy zzacy, CountDownLatch countDownLatch) {
        this.f8436b = zzacy;
        this.f8435a = countDownLatch;
    }

    public final void run() {
        synchronized (this.f8436b.d) {
            this.f8436b.f21359m = zzas.zza(this.f8436b.f21358l, this.f8436b.f21353g, this.f8435a);
        }
    }
}
