package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;

final class rr extends rw<zzll> {
    /* renamed from: a */
    private final /* synthetic */ Context f16649a;
    /* renamed from: b */
    private final /* synthetic */ zzjs f16650b;

    rr(zzjs zzjs, Context context) {
        this.f16650b = zzjs;
        this.f16649a = context;
    }

    /* renamed from: a */
    protected final /* synthetic */ Object mo2166a() {
        zzjs.m10699b(this.f16649a, "mobile_ads_settings");
        return new zzmw();
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo2168b() {
        return this.f16650b.f9570c.m21784a(this.f16649a);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo2167a(zzlf zzlf) {
        return zzlf.getMobileAdsSettingsManagerWithClientJarVersion(ObjectWrapper.m26019a(this.f16649a), 13000000);
    }
}
