package com.google.android.gms.internal.ads;

import android.app.Activity;
import com.google.android.gms.dynamic.ObjectWrapper;

final class rn extends rw<zzabw> {
    /* renamed from: a */
    private final /* synthetic */ Activity f16634a;
    /* renamed from: b */
    private final /* synthetic */ zzjs f16635b;

    rn(zzjs zzjs, Activity activity) {
        this.f16635b = zzjs;
        this.f16634a = activity;
    }

    /* renamed from: a */
    protected final /* synthetic */ Object mo2166a() {
        zzjs.m10699b(this.f16634a, "ad_overlay");
        return null;
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo2168b() {
        return this.f16635b.f9574g.m21075a(this.f16634a);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo2167a(zzlf zzlf) {
        return zzlf.createAdOverlay(ObjectWrapper.m26019a(this.f16634a));
    }
}
