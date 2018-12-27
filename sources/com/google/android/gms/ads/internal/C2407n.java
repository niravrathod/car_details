package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzapn;

/* renamed from: com.google.android.gms.ads.internal.n */
final /* synthetic */ class C2407n implements Runnable {
    /* renamed from: a */
    private final zzay f7699a;
    /* renamed from: b */
    private final Runnable f7700b;

    C2407n(zzay zzay, Runnable runnable) {
        this.f7699a = zzay;
        this.f7700b = runnable;
    }

    public final void run() {
        zzapn.f8961a.execute(new C2412p(this.f7699a, this.f7700b));
    }
}
