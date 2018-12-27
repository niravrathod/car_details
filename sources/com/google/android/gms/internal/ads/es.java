package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeoutException;

final /* synthetic */ class es implements Runnable {
    /* renamed from: a */
    private final zzaps f8034a;

    es(zzaps zzaps) {
        this.f8034a = zzaps;
    }

    public final void run() {
        this.f8034a.m21289a(new TimeoutException());
    }
}
