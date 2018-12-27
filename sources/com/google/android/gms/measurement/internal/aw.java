package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty;

final class aw implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ ConditionalUserProperty f10469a;
    /* renamed from: b */
    private final /* synthetic */ zzcs f10470b;

    aw(zzcs zzcs, ConditionalUserProperty conditionalUserProperty) {
        this.f10470b = zzcs;
        this.f10469a = conditionalUserProperty;
    }

    public final void run() {
        this.f10470b.m29571d(this.f10469a);
    }
}
