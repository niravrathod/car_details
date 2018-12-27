package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.HashMap;

final class ru extends rw<zzqt> {
    /* renamed from: a */
    private final /* synthetic */ View f16655a;
    /* renamed from: b */
    private final /* synthetic */ HashMap f16656b;
    /* renamed from: c */
    private final /* synthetic */ HashMap f16657c;
    /* renamed from: d */
    private final /* synthetic */ zzjs f16658d;

    ru(zzjs zzjs, View view, HashMap hashMap, HashMap hashMap2) {
        this.f16658d = zzjs;
        this.f16655a = view;
        this.f16656b = hashMap;
        this.f16657c = hashMap2;
    }

    /* renamed from: a */
    protected final /* synthetic */ Object mo2166a() {
        zzjs.m10699b(this.f16655a.getContext(), "native_ad_view_holder_delegate");
        return new zzmy();
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo2168b() {
        return this.f16658d.f9575h.m21960a(this.f16655a, this.f16656b, this.f16657c);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo2167a(zzlf zzlf) {
        return zzlf.createNativeAdViewHolderDelegate(ObjectWrapper.m26019a(this.f16655a), ObjectWrapper.m26019a(this.f16656b), ObjectWrapper.m26019a(this.f16657c));
    }
}
