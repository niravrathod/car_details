package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.UnifiedNativeAd.OnUnifiedNativeAdLoadedListener;

@zzaer
public final class zzsr extends zzsa {
    /* renamed from: a */
    private final OnUnifiedNativeAdLoadedListener f20385a;

    public zzsr(OnUnifiedNativeAdLoadedListener onUnifiedNativeAdLoadedListener) {
        this.f20385a = onUnifiedNativeAdLoadedListener;
    }

    /* renamed from: a */
    public final void mo2688a(zzsf zzsf) {
        this.f20385a.onUnifiedNativeAdLoaded(new zzsi(zzsf));
    }
}
