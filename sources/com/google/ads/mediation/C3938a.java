package com.google.ads.mediation;

import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;

/* renamed from: com.google.ads.mediation.a */
final class C3938a implements RewardedVideoAdListener {
    /* renamed from: a */
    private final /* synthetic */ AbstractAdViewAdapter f15674a;

    C3938a(AbstractAdViewAdapter abstractAdViewAdapter) {
        this.f15674a = abstractAdViewAdapter;
    }

    public final void onRewardedVideoAdLoaded() {
        this.f15674a.zzhf.onAdLoaded(this.f15674a);
    }

    public final void onRewardedVideoAdOpened() {
        this.f15674a.zzhf.onAdOpened(this.f15674a);
    }

    public final void onRewardedVideoStarted() {
        this.f15674a.zzhf.onVideoStarted(this.f15674a);
    }

    public final void onRewardedVideoAdClosed() {
        this.f15674a.zzhf.onAdClosed(this.f15674a);
        this.f15674a.zzhe = null;
    }

    public final void onRewarded(RewardItem rewardItem) {
        this.f15674a.zzhf.onRewarded(this.f15674a, rewardItem);
    }

    public final void onRewardedVideoAdLeftApplication() {
        this.f15674a.zzhf.onAdLeftApplication(this.f15674a);
    }

    public final void onRewardedVideoAdFailedToLoad(int i) {
        this.f15674a.zzhf.onAdFailedToLoad(this.f15674a, i);
    }

    public final void onRewardedVideoCompleted() {
        this.f15674a.zzhf.onVideoCompleted(this.f15674a);
    }
}
