package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;

final class rq extends rw<zzkp> {
    /* renamed from: a */
    private final /* synthetic */ Context f16645a;
    /* renamed from: b */
    private final /* synthetic */ String f16646b;
    /* renamed from: c */
    private final /* synthetic */ zzyn f16647c;
    /* renamed from: d */
    private final /* synthetic */ zzjs f16648d;

    rq(zzjs zzjs, Context context, String str, zzyn zzyn) {
        this.f16648d = zzjs;
        this.f16645a = context;
        this.f16646b = str;
        this.f16647c = zzyn;
    }

    /* renamed from: a */
    protected final /* synthetic */ Object mo2166a() {
        zzjs.m10699b(this.f16645a, "native_ad");
        return new zzmq();
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo2168b() {
        return this.f16648d.f9569b.m21742a(this.f16645a, this.f16646b, this.f16647c);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo2167a(zzlf zzlf) {
        return zzlf.createAdLoaderBuilder(ObjectWrapper.m26019a(this.f16645a), this.f16646b, this.f16647c, 13000000);
    }
}
