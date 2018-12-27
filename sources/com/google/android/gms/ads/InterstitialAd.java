package com.google.android.gms.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.reward.AdMetadataListener;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzjc;
import com.google.android.gms.internal.ads.zzmk;

public final class InterstitialAd {
    /* renamed from: a */
    private final zzmk f7602a;

    public InterstitialAd(Context context) {
        this.f7602a = new zzmk(context);
        Preconditions.checkNotNull(context, "Context cannot be null");
    }

    public final AdListener getAdListener() {
        return this.f7602a.m10837a();
    }

    public final String getAdUnitId() {
        return this.f7602a.m10848b();
    }

    public final boolean isLoaded() {
        return this.f7602a.m10852e();
    }

    public final boolean isLoading() {
        return this.f7602a.m10853f();
    }

    public final void loadAd(AdRequest adRequest) {
        this.f7602a.m10845a(adRequest.zzay());
    }

    public final void setAdListener(AdListener adListener) {
        this.f7602a.m10838a(adListener);
        if (adListener == null || !(adListener instanceof zzjc)) {
            if (adListener == null) {
                this.f7602a.m10844a(null);
            }
            return;
        }
        this.f7602a.m10844a((zzjc) adListener);
    }

    public final void setAdUnitId(String str) {
        this.f7602a.m10846a(str);
    }

    public final String getMediationAdapterClassName() {
        return this.f7602a.m10855h();
    }

    public final void show() {
        this.f7602a.m10856i();
    }

    public final void setRewardedVideoAdListener(RewardedVideoAdListener rewardedVideoAdListener) {
        this.f7602a.m10843a(rewardedVideoAdListener);
    }

    public final void setAdMetadataListener(AdMetadataListener adMetadataListener) {
        this.f7602a.m10842a(adMetadataListener);
    }

    public final Bundle getAdMetadata() {
        return this.f7602a.m10854g();
    }

    public final void zza(boolean z) {
        this.f7602a.m10847a(true);
    }

    public final void setImmersiveMode(boolean z) {
        this.f7602a.m10849b(z);
    }
}
