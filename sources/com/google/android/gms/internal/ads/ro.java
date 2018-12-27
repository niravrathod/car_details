package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;

final class ro extends rw<zzku> {
    /* renamed from: a */
    private final /* synthetic */ Context f16636a;
    /* renamed from: b */
    private final /* synthetic */ zzjo f16637b;
    /* renamed from: c */
    private final /* synthetic */ String f16638c;
    /* renamed from: d */
    private final /* synthetic */ zzjs f16639d;

    ro(zzjs zzjs, Context context, zzjo zzjo, String str) {
        this.f16639d = zzjs;
        this.f16636a = context;
        this.f16637b = zzjo;
        this.f16638c = str;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo2166a() {
        zzjs.m10699b(this.f16636a, "search");
        return new zzmu();
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo2168b() {
        return this.f16639d.f9568a.m21743a(this.f16636a, this.f16637b, this.f16638c, null, 3);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo2167a(zzlf zzlf) {
        return zzlf.createSearchAdManager(ObjectWrapper.m26019a(this.f16636a), this.f16637b, this.f16638c, 13000000);
    }
}
