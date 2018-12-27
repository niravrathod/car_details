package com.google.android.gms.ads.internal;

final /* synthetic */ class ag implements Runnable {
    /* renamed from: a */
    private final zzbl f7647a;

    private ag(zzbl zzbl) {
        this.f7647a = zzbl;
    }

    /* renamed from: a */
    static Runnable m8778a(zzbl zzbl) {
        return new ag(zzbl);
    }

    public final void run() {
        this.f7647a.resume();
    }
}
