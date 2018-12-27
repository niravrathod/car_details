package com.google.android.gms.measurement.internal;

import android.content.Intent;

final /* synthetic */ class bw implements Runnable {
    /* renamed from: a */
    private final zzel f10544a;
    /* renamed from: b */
    private final int f10545b;
    /* renamed from: c */
    private final zzap f10546c;
    /* renamed from: d */
    private final Intent f10547d;

    bw(zzel zzel, int i, zzap zzap, Intent intent) {
        this.f10544a = zzel;
        this.f10545b = i;
        this.f10546c = zzap;
        this.f10547d = intent;
    }

    public final void run() {
        this.f10544a.m12381a(this.f10545b, this.f10546c, this.f10547d);
    }
}
