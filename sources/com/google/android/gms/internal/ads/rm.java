package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;

final class rm extends rw<zzku> {
    /* renamed from: a */
    private final /* synthetic */ Context f16629a;
    /* renamed from: b */
    private final /* synthetic */ zzjo f16630b;
    /* renamed from: c */
    private final /* synthetic */ String f16631c;
    /* renamed from: d */
    private final /* synthetic */ zzyn f16632d;
    /* renamed from: e */
    private final /* synthetic */ zzjs f16633e;

    rm(zzjs zzjs, Context context, zzjo zzjo, String str, zzyn zzyn) {
        this.f16633e = zzjs;
        this.f16629a = context;
        this.f16630b = zzjo;
        this.f16631c = str;
        this.f16632d = zzyn;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo2166a() {
        zzjs.m10699b(this.f16629a, "banner");
        return new zzmu();
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo2168b() {
        return this.f16633e.f9568a.m21743a(this.f16629a, this.f16630b, this.f16631c, this.f16632d, 1);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo2167a(zzlf zzlf) {
        return zzlf.createBannerAdManager(ObjectWrapper.m26019a(this.f16629a), this.f16630b, this.f16631c, this.f16632d, 13000000);
    }
}
