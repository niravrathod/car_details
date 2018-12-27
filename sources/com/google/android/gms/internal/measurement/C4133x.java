package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzem.C2472b;
import com.google.android.gms.internal.measurement.zzem.C2473c;
import com.google.android.gms.internal.measurement.zzem.C4708a;

/* renamed from: com.google.android.gms.internal.measurement.x */
final class C4133x extends C2472b {
    /* renamed from: c */
    private final /* synthetic */ Activity f17539c;
    /* renamed from: d */
    private final /* synthetic */ C4708a f17540d;
    /* renamed from: e */
    private final /* synthetic */ C2473c f17541e;

    C4133x(C2473c c2473c, Activity activity, C4708a c4708a) {
        this.f17541e = c2473c;
        this.f17539c = activity;
        this.f17540d = c4708a;
        super(c2473c.f10138a);
    }

    /* renamed from: b */
    final void mo2919b() {
        this.f17541e.f10138a.f10148j.mo3119a(ObjectWrapper.m26019a(this.f17539c), this.f17540d, this.b);
    }
}
