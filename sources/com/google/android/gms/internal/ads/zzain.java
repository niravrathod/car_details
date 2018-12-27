package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.reward.RewardedVideoAdListener;

@zzaer
public final class zzain extends zzaij {
    /* renamed from: a */
    private RewardedVideoAdListener f19851a;

    public zzain(RewardedVideoAdListener rewardedVideoAdListener) {
        this.f19851a = rewardedVideoAdListener;
    }

    /* renamed from: a */
    public final void mo2266a() {
        if (this.f19851a != null) {
            this.f19851a.onRewardedVideoAdLoaded();
        }
    }

    /* renamed from: b */
    public final void mo2269b() {
        if (this.f19851a != null) {
            this.f19851a.onRewardedVideoAdOpened();
        }
    }

    /* renamed from: c */
    public final void mo2270c() {
        if (this.f19851a != null) {
            this.f19851a.onRewardedVideoStarted();
        }
    }

    /* renamed from: d */
    public final void mo2271d() {
        if (this.f19851a != null) {
            this.f19851a.onRewardedVideoAdClosed();
        }
    }

    /* renamed from: a */
    public final void mo2268a(zzahy zzahy) {
        if (this.f19851a != null) {
            this.f19851a.onRewarded(new zzail(zzahy));
        }
    }

    /* renamed from: e */
    public final void mo2272e() {
        if (this.f19851a != null) {
            this.f19851a.onRewardedVideoAdLeftApplication();
        }
    }

    /* renamed from: a */
    public final void mo2267a(int i) {
        if (this.f19851a != null) {
            this.f19851a.onRewardedVideoAdFailedToLoad(i);
        }
    }

    /* renamed from: f */
    public final void mo2273f() {
        if (this.f19851a != null) {
            this.f19851a.onRewardedVideoCompleted();
        }
    }

    /* renamed from: g */
    public final RewardedVideoAdListener m26230g() {
        return this.f19851a;
    }

    /* renamed from: a */
    public final void m26223a(RewardedVideoAdListener rewardedVideoAdListener) {
        this.f19851a = rewardedVideoAdListener;
    }
}
