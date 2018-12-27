package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;

final class rv extends rw<zzaid> {
    /* renamed from: a */
    private final /* synthetic */ Context f16659a;
    /* renamed from: b */
    private final /* synthetic */ zzyn f16660b;
    /* renamed from: c */
    private final /* synthetic */ zzjs f16661c;

    rv(zzjs zzjs, Context context, zzyn zzyn) {
        this.f16661c = zzjs;
        this.f16659a = context;
        this.f16660b = zzyn;
    }

    /* renamed from: a */
    protected final /* synthetic */ Object mo2166a() {
        zzjs.m10699b(this.f16659a, "rewarded_video");
        return new zzmz();
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo2168b() {
        return this.f16661c.f9572e.m21167a(this.f16659a, this.f16660b);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo2167a(zzlf zzlf) {
        return zzlf.createRewardedVideoAd(ObjectWrapper.m26019a(this.f16659a), this.f16660b, 13000000);
    }
}
