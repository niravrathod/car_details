package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

@zzaer
public final class zzajj implements MediationRewardedVideoAdListener {
    /* renamed from: a */
    private final zzajg f16819a;

    public zzajj(zzajg zzajg) {
        this.f16819a = zzajg;
    }

    public final void onInitializationSucceeded(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzaok.m10001b("Adapter called onInitializationSucceeded.");
        try {
            this.f16819a.mo2296a(ObjectWrapper.m26019a((Object) mediationRewardedVideoAdAdapter));
        } catch (MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter2) {
            zzaok.m10006d("#007 Could not call remote method.", mediationRewardedVideoAdAdapter2);
        }
    }

    public final void onInitializationFailed(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter, int i) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzaok.m10001b("Adapter called onInitializationFailed.");
        try {
            this.f16819a.mo2297a(ObjectWrapper.m26019a((Object) mediationRewardedVideoAdAdapter), i);
        } catch (MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter2) {
            zzaok.m10006d("#007 Could not call remote method.", mediationRewardedVideoAdAdapter2);
        }
    }

    public final void onAdLoaded(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzaok.m10001b("Adapter called onAdLoaded.");
        try {
            this.f16819a.mo2299b(ObjectWrapper.m26019a((Object) mediationRewardedVideoAdAdapter));
        } catch (MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter2) {
            zzaok.m10006d("#007 Could not call remote method.", mediationRewardedVideoAdAdapter2);
        }
    }

    public final void onAdOpened(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzaok.m10001b("Adapter called onAdOpened.");
        try {
            this.f16819a.mo2301c(ObjectWrapper.m26019a((Object) mediationRewardedVideoAdAdapter));
        } catch (MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter2) {
            zzaok.m10006d("#007 Could not call remote method.", mediationRewardedVideoAdAdapter2);
        }
    }

    public final void onVideoStarted(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzaok.m10001b("Adapter called onVideoStarted.");
        try {
            this.f16819a.mo2302d(ObjectWrapper.m26019a((Object) mediationRewardedVideoAdAdapter));
        } catch (MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter2) {
            zzaok.m10006d("#007 Could not call remote method.", mediationRewardedVideoAdAdapter2);
        }
    }

    public final void onAdClosed(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzaok.m10001b("Adapter called onAdClosed.");
        try {
            this.f16819a.mo2303e(ObjectWrapper.m26019a((Object) mediationRewardedVideoAdAdapter));
        } catch (MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter2) {
            zzaok.m10006d("#007 Could not call remote method.", mediationRewardedVideoAdAdapter2);
        }
    }

    public final void onRewarded(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter, RewardItem rewardItem) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzaok.m10001b("Adapter called onRewarded.");
        if (rewardItem != null) {
            try {
                this.f16819a.mo2298a(ObjectWrapper.m26019a((Object) mediationRewardedVideoAdAdapter), new zzajk(rewardItem));
                return;
            } catch (MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter2) {
                zzaok.m10006d("#007 Could not call remote method.", mediationRewardedVideoAdAdapter2);
                return;
            }
        }
        this.f16819a.mo2298a(ObjectWrapper.m26019a((Object) mediationRewardedVideoAdAdapter2), new zzajk("", 1));
    }

    public final void onAdClicked(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzaok.m10001b("Adapter called onAdClicked.");
        try {
            this.f16819a.mo2304f(ObjectWrapper.m26019a((Object) mediationRewardedVideoAdAdapter));
        } catch (MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter2) {
            zzaok.m10006d("#007 Could not call remote method.", mediationRewardedVideoAdAdapter2);
        }
    }

    public final void onAdFailedToLoad(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter, int i) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzaok.m10001b("Adapter called onAdFailedToLoad.");
        try {
            this.f16819a.mo2300b(ObjectWrapper.m26019a((Object) mediationRewardedVideoAdAdapter), i);
        } catch (MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter2) {
            zzaok.m10006d("#007 Could not call remote method.", mediationRewardedVideoAdAdapter2);
        }
    }

    public final void onAdLeftApplication(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzaok.m10001b("Adapter called onAdLeftApplication.");
        try {
            this.f16819a.mo2305g(ObjectWrapper.m26019a((Object) mediationRewardedVideoAdAdapter));
        } catch (MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter2) {
            zzaok.m10006d("#007 Could not call remote method.", mediationRewardedVideoAdAdapter2);
        }
    }

    public final void onVideoCompleted(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzaok.m10001b("Adapter called onVideoCompleted.");
        try {
            this.f16819a.mo2306h(ObjectWrapper.m26019a((Object) mediationRewardedVideoAdAdapter));
        } catch (MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter2) {
            zzaok.m10006d("#007 Could not call remote method.", mediationRewardedVideoAdAdapter2);
        }
    }

    public final void zzc(Bundle bundle) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzaok.m10001b("Adapter called onAdMetadataChanged.");
        try {
            this.f16819a.mo2295a(bundle);
        } catch (Bundle bundle2) {
            zzaok.m10006d("#007 Could not call remote method.", bundle2);
        }
    }
}
