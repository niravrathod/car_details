package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;

final class rp extends rw<zzku> {
    /* renamed from: a */
    private final /* synthetic */ Context f16640a;
    /* renamed from: b */
    private final /* synthetic */ zzjo f16641b;
    /* renamed from: c */
    private final /* synthetic */ String f16642c;
    /* renamed from: d */
    private final /* synthetic */ zzyn f16643d;
    /* renamed from: e */
    private final /* synthetic */ zzjs f16644e;

    rp(zzjs zzjs, Context context, zzjo zzjo, String str, zzyn zzyn) {
        this.f16644e = zzjs;
        this.f16640a = context;
        this.f16641b = zzjo;
        this.f16642c = str;
        this.f16643d = zzyn;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo2166a() {
        zzjs.m10699b(this.f16640a, "interstitial");
        return new zzmu();
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo2168b() {
        return this.f16644e.f9568a.m21743a(this.f16640a, this.f16641b, this.f16642c, this.f16643d, 2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo2167a(zzlf zzlf) {
        return zzlf.createInterstitialAdManager(ObjectWrapper.m26019a(this.f16640a), this.f16641b, this.f16642c, this.f16643d, 13000000);
    }
}
