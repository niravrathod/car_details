package com.google.android.gms.ads.internal;

final /* synthetic */ class af implements Runnable {
    /* renamed from: a */
    private final zzbl f7646a;

    private af(zzbl zzbl) {
        this.f7646a = zzbl;
    }

    /* renamed from: a */
    static Runnable m8777a(zzbl zzbl) {
        return new af(zzbl);
    }

    public final void run() {
        this.f7646a.pause();
    }
}
