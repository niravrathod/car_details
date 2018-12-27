package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzem.C2472b;

/* renamed from: com.google.android.gms.internal.measurement.d */
final class C4110d extends C2472b {
    /* renamed from: c */
    private final /* synthetic */ Activity f17477c;
    /* renamed from: d */
    private final /* synthetic */ String f17478d;
    /* renamed from: e */
    private final /* synthetic */ String f17479e;
    /* renamed from: f */
    private final /* synthetic */ zzem f17480f;

    C4110d(zzem zzem, Activity activity, String str, String str2) {
        this.f17480f = zzem;
        this.f17477c = activity;
        this.f17478d = str;
        this.f17479e = str2;
        super(zzem);
    }

    /* renamed from: b */
    final void mo2919b() {
        this.f17480f.f10148j.mo3121a(ObjectWrapper.m26019a(this.f17477c), this.f17478d, this.f17479e, this.a);
    }
}
