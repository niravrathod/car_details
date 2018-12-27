package com.google.android.gms.internal.ads;

import android.content.Context;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.ObjectWrapper;

final class rs extends rw<zzqo> {
    /* renamed from: a */
    private final /* synthetic */ FrameLayout f16651a;
    /* renamed from: b */
    private final /* synthetic */ FrameLayout f16652b;
    /* renamed from: c */
    private final /* synthetic */ Context f16653c;
    /* renamed from: d */
    private final /* synthetic */ zzjs f16654d;

    rs(zzjs zzjs, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.f16654d = zzjs;
        this.f16651a = frameLayout;
        this.f16652b = frameLayout2;
        this.f16653c = context;
    }

    /* renamed from: a */
    protected final /* synthetic */ Object mo2166a() {
        zzjs.m10699b(this.f16653c, "native_ad_view_delegate");
        return new zzmx();
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo2168b() {
        return this.f16654d.f9571d.m21959a(this.f16653c, this.f16651a, this.f16652b);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo2167a(zzlf zzlf) {
        return zzlf.createNativeAdViewDelegate(ObjectWrapper.m26019a(this.f16651a), ObjectWrapper.m26019a(this.f16652b));
    }
}
