package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty;

final class ax implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ ConditionalUserProperty f10471a;
    /* renamed from: b */
    private final /* synthetic */ zzcs f10472b;

    ax(zzcs zzcs, ConditionalUserProperty conditionalUserProperty) {
        this.f10472b = zzcs;
        this.f10471a = conditionalUserProperty;
    }

    public final void run() {
        this.f10472b.m29572e(this.f10471a);
    }
}
