package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;

final /* synthetic */ class bx implements Runnable {
    /* renamed from: a */
    private final zzel f10548a;
    /* renamed from: b */
    private final zzap f10549b;
    /* renamed from: c */
    private final JobParameters f10550c;

    bx(zzel zzel, zzap zzap, JobParameters jobParameters) {
        this.f10548a = zzel;
        this.f10549b = zzap;
        this.f10550c = jobParameters;
    }

    public final void run() {
        this.f10548a.m12382a(this.f10549b, this.f10550c);
    }
}
