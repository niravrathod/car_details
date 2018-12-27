package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

final class bs implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ ComponentName f10538a;
    /* renamed from: b */
    private final /* synthetic */ zzef f10539b;

    bs(zzef zzef, ComponentName componentName) {
        this.f10539b = zzef;
        this.f10538a = componentName;
    }

    public final void run() {
        this.f10539b.f17600a.m29663a(this.f10538a);
    }
}
