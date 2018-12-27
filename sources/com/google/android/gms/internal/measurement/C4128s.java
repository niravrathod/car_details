package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzem.C2472b;
import com.google.android.gms.internal.measurement.zzem.C2473c;

/* renamed from: com.google.android.gms.internal.measurement.s */
final class C4128s extends C2472b {
    /* renamed from: c */
    private final /* synthetic */ Activity f17528c;
    /* renamed from: d */
    private final /* synthetic */ Bundle f17529d;
    /* renamed from: e */
    private final /* synthetic */ C2473c f17530e;

    C4128s(C2473c c2473c, Activity activity, Bundle bundle) {
        this.f17530e = c2473c;
        this.f17528c = activity;
        this.f17529d = bundle;
        super(c2473c.f10138a);
    }

    /* renamed from: b */
    final void mo2919b() {
        this.f17530e.f10138a.f10148j.mo3118a(ObjectWrapper.m26019a(this.f17528c), this.f17529d, this.b);
    }
}
