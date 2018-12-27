package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.Correlator;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzmk;

public final class PublisherInterstitialAd {
    /* renamed from: a */
    private final zzmk f7617a;

    public PublisherInterstitialAd(Context context) {
        this.f7617a = new zzmk(context, this);
        Preconditions.checkNotNull(context, "Context cannot be null");
    }

    public final AdListener getAdListener() {
        return this.f7617a.m10837a();
    }

    public final String getAdUnitId() {
        return this.f7617a.m10848b();
    }

    public final AppEventListener getAppEventListener() {
        return this.f7617a.m10850c();
    }

    public final OnCustomRenderedAdLoadedListener getOnCustomRenderedAdLoadedListener() {
        return this.f7617a.m10851d();
    }

    public final boolean isLoaded() {
        return this.f7617a.m10852e();
    }

    public final boolean isLoading() {
        return this.f7617a.m10853f();
    }

    public final void loadAd(PublisherAdRequest publisherAdRequest) {
        this.f7617a.m10845a(publisherAdRequest.zzay());
    }

    public final void setAdListener(AdListener adListener) {
        this.f7617a.m10838a(adListener);
    }

    public final void setAdUnitId(String str) {
        this.f7617a.m10846a(str);
    }

    public final void setAppEventListener(AppEventListener appEventListener) {
        this.f7617a.m10840a(appEventListener);
    }

    public final void setOnCustomRenderedAdLoadedListener(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        this.f7617a.m10841a(onCustomRenderedAdLoadedListener);
    }

    public final void setCorrelator(Correlator correlator) {
        this.f7617a.m10839a(correlator);
    }

    public final String getMediationAdapterClassName() {
        return this.f7617a.m10855h();
    }

    public final void show() {
        this.f7617a.m10856i();
    }

    public final void setImmersiveMode(boolean z) {
        this.f7617a.m10849b(z);
    }
}
