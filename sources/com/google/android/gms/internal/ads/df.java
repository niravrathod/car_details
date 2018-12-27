package com.google.android.gms.internal.ads;

import android.content.Context;

final class df implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Context f7991a;
    /* renamed from: b */
    private final /* synthetic */ zzalo f7992b;

    df(zzalo zzalo, Context context) {
        this.f7992b = zzalo;
        this.f7991a = context;
    }

    public final void run() {
        synchronized (this.f7992b.f8873b) {
            this.f7992b.f8875d = zzalo.m9815d(this.f7991a);
            this.f7992b.f8873b.notifyAll();
        }
    }
}
