package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.reward.RewardItem;

@zzaer
public final class zzail implements RewardItem {
    /* renamed from: a */
    private final zzahy f16808a;

    public zzail(zzahy zzahy) {
        this.f16808a = zzahy;
    }

    public final String getType() {
        if (this.f16808a == null) {
            return null;
        }
        try {
            return this.f16808a.mo2243a();
        } catch (Throwable e) {
            zzaok.m10004c("Could not forward getType to RewardItem", e);
            return null;
        }
    }

    public final int getAmount() {
        if (this.f16808a == null) {
            return 0;
        }
        try {
            return this.f16808a.mo2244b();
        } catch (Throwable e) {
            zzaok.m10004c("Could not forward getAmount to RewardItem", e);
            return 0;
        }
    }
}
