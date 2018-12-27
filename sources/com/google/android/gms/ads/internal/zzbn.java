package com.google.android.gms.ads.internal;

import android.os.Handler;

public final class zzbn {
    /* renamed from: a */
    private final Handler f7751a;

    public zzbn(Handler handler) {
        this.f7751a = handler;
    }

    public final void removeCallbacks(Runnable runnable) {
        this.f7751a.removeCallbacks(runnable);
    }

    public final boolean postDelayed(Runnable runnable, long j) {
        return this.f7751a.postDelayed(runnable, j);
    }
}
