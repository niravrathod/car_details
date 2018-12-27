package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;

final class bu implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ zzef f10542a;

    bu(zzef zzef) {
        this.f10542a = zzef;
    }

    public final void run() {
        zzdr zzdr = this.f10542a.f17600a;
        Context n = this.f10542a.f17600a.mo3170n();
        this.f10542a.f17600a.mo3173u();
        zzdr.m29663a(new ComponentName(n, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
