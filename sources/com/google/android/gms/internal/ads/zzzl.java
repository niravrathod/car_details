package com.google.android.gms.internal.ads;

import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.common.internal.Preconditions;

@zzaer
public final class zzzl implements MediationBannerListener, MediationInterstitialListener, MediationNativeListener {
    /* renamed from: a */
    private final zzyt f17394a;
    /* renamed from: b */
    private NativeAdMapper f17395b;
    /* renamed from: c */
    private UnifiedNativeAdMapper f17396c;
    /* renamed from: d */
    private NativeCustomTemplateAd f17397d;

    public zzzl(zzyt zzyt) {
        this.f17394a = zzyt;
    }

    public final void zza(MediationBannerAdapter mediationBannerAdapter, String str, String str2) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzaok.m10001b("Adapter called onAppEvent.");
        try {
            this.f17394a.mo2792a(str, str2);
        } catch (MediationBannerAdapter mediationBannerAdapter2) {
            zzaok.m10006d("#007 Could not call remote method.", mediationBannerAdapter2);
        }
    }

    public final void onAdClicked(MediationBannerAdapter mediationBannerAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzaok.m10001b("Adapter called onAdClicked.");
        try {
            this.f17394a.mo2786a();
        } catch (MediationBannerAdapter mediationBannerAdapter2) {
            zzaok.m10006d("#007 Could not call remote method.", mediationBannerAdapter2);
        }
    }

    public final void onAdClosed(MediationBannerAdapter mediationBannerAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzaok.m10001b("Adapter called onAdClosed.");
        try {
            this.f17394a.mo2793b();
        } catch (MediationBannerAdapter mediationBannerAdapter2) {
            zzaok.m10006d("#007 Could not call remote method.", mediationBannerAdapter2);
        }
    }

    public final void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter, int i) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        mediationBannerAdapter = new StringBuilder(55);
        mediationBannerAdapter.append("Adapter called onAdFailedToLoad with error. ");
        mediationBannerAdapter.append(i);
        zzaok.m10001b(mediationBannerAdapter.toString());
        try {
            this.f17394a.mo2787a(i);
        } catch (MediationBannerAdapter mediationBannerAdapter2) {
            zzaok.m10006d("#007 Could not call remote method.", mediationBannerAdapter2);
        }
    }

    public final void onAdLeftApplication(MediationBannerAdapter mediationBannerAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzaok.m10001b("Adapter called onAdLeftApplication.");
        try {
            this.f17394a.mo2794c();
        } catch (MediationBannerAdapter mediationBannerAdapter2) {
            zzaok.m10006d("#007 Could not call remote method.", mediationBannerAdapter2);
        }
    }

    public final void onAdOpened(MediationBannerAdapter mediationBannerAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzaok.m10001b("Adapter called onAdOpened.");
        try {
            this.f17394a.mo2795d();
        } catch (MediationBannerAdapter mediationBannerAdapter2) {
            zzaok.m10006d("#007 Could not call remote method.", mediationBannerAdapter2);
        }
    }

    public final void onAdLoaded(MediationBannerAdapter mediationBannerAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzaok.m10001b("Adapter called onAdLoaded.");
        try {
            this.f17394a.mo2796e();
        } catch (MediationBannerAdapter mediationBannerAdapter2) {
            zzaok.m10006d("#007 Could not call remote method.", mediationBannerAdapter2);
        }
    }

    public final void onAdClicked(MediationInterstitialAdapter mediationInterstitialAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzaok.m10001b("Adapter called onAdClicked.");
        try {
            this.f17394a.mo2786a();
        } catch (MediationInterstitialAdapter mediationInterstitialAdapter2) {
            zzaok.m10006d("#007 Could not call remote method.", mediationInterstitialAdapter2);
        }
    }

    public final void onAdClosed(MediationInterstitialAdapter mediationInterstitialAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzaok.m10001b("Adapter called onAdClosed.");
        try {
            this.f17394a.mo2793b();
        } catch (MediationInterstitialAdapter mediationInterstitialAdapter2) {
            zzaok.m10006d("#007 Could not call remote method.", mediationInterstitialAdapter2);
        }
    }

    public final void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, int i) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        mediationInterstitialAdapter = new StringBuilder(55);
        mediationInterstitialAdapter.append("Adapter called onAdFailedToLoad with error ");
        mediationInterstitialAdapter.append(i);
        mediationInterstitialAdapter.append(".");
        zzaok.m10001b(mediationInterstitialAdapter.toString());
        try {
            this.f17394a.mo2787a(i);
        } catch (MediationInterstitialAdapter mediationInterstitialAdapter2) {
            zzaok.m10006d("#007 Could not call remote method.", mediationInterstitialAdapter2);
        }
    }

    public final void onAdLeftApplication(MediationInterstitialAdapter mediationInterstitialAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzaok.m10001b("Adapter called onAdLeftApplication.");
        try {
            this.f17394a.mo2794c();
        } catch (MediationInterstitialAdapter mediationInterstitialAdapter2) {
            zzaok.m10006d("#007 Could not call remote method.", mediationInterstitialAdapter2);
        }
    }

    public final void onAdOpened(MediationInterstitialAdapter mediationInterstitialAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzaok.m10001b("Adapter called onAdOpened.");
        try {
            this.f17394a.mo2795d();
        } catch (MediationInterstitialAdapter mediationInterstitialAdapter2) {
            zzaok.m10006d("#007 Could not call remote method.", mediationInterstitialAdapter2);
        }
    }

    public final void onAdLoaded(MediationInterstitialAdapter mediationInterstitialAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzaok.m10001b("Adapter called onAdLoaded.");
        try {
            this.f17394a.mo2796e();
        } catch (MediationInterstitialAdapter mediationInterstitialAdapter2) {
            zzaok.m10006d("#007 Could not call remote method.", mediationInterstitialAdapter2);
        }
    }

    public final void onAdLoaded(MediationNativeAdapter mediationNativeAdapter, NativeAdMapper nativeAdMapper) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzaok.m10001b("Adapter called onAdLoaded.");
        this.f17395b = nativeAdMapper;
        this.f17396c = null;
        m22125a(mediationNativeAdapter, this.f17396c, this.f17395b);
        try {
            this.f17394a.mo2796e();
        } catch (MediationNativeAdapter mediationNativeAdapter2) {
            zzaok.m10006d("#007 Could not call remote method.", mediationNativeAdapter2);
        }
    }

    public final void onAdLoaded(MediationNativeAdapter mediationNativeAdapter, UnifiedNativeAdMapper unifiedNativeAdMapper) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzaok.m10001b("Adapter called onAdLoaded.");
        this.f17396c = unifiedNativeAdMapper;
        this.f17395b = null;
        m22125a(mediationNativeAdapter, this.f17396c, this.f17395b);
        try {
            this.f17394a.mo2796e();
        } catch (MediationNativeAdapter mediationNativeAdapter2) {
            zzaok.m10006d("#007 Could not call remote method.", mediationNativeAdapter2);
        }
    }

    /* renamed from: a */
    private static void m22125a(MediationNativeAdapter mediationNativeAdapter, UnifiedNativeAdMapper unifiedNativeAdMapper, NativeAdMapper nativeAdMapper) {
        if ((mediationNativeAdapter instanceof AdMobAdapter) == null) {
            mediationNativeAdapter = new VideoController();
            mediationNativeAdapter.zza(new zzzi());
            if (unifiedNativeAdMapper != null && unifiedNativeAdMapper.hasVideoContent()) {
                unifiedNativeAdMapper.zza(mediationNativeAdapter);
            }
            if (!(nativeAdMapper == null || nativeAdMapper.hasVideoContent() == null)) {
                nativeAdMapper.zza(mediationNativeAdapter);
            }
        }
    }

    public final void zza(MediationNativeAdapter mediationNativeAdapter, NativeCustomTemplateAd nativeCustomTemplateAd) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        mediationNativeAdapter = "Adapter called onAdLoaded with template id ";
        String valueOf = String.valueOf(nativeCustomTemplateAd.getCustomTemplateId());
        zzaok.m10001b(valueOf.length() != 0 ? mediationNativeAdapter.concat(valueOf) : new String(mediationNativeAdapter));
        this.f17397d = nativeCustomTemplateAd;
        try {
            this.f17394a.mo2796e();
        } catch (MediationNativeAdapter mediationNativeAdapter2) {
            zzaok.m10006d("#007 Could not call remote method.", mediationNativeAdapter2);
        }
    }

    public final void zza(MediationNativeAdapter mediationNativeAdapter, NativeCustomTemplateAd nativeCustomTemplateAd, String str) {
        if ((nativeCustomTemplateAd instanceof zzrj) != null) {
            try {
                this.f17394a.mo2789a(((zzrj) nativeCustomTemplateAd).m21915a(), str);
                return;
            } catch (MediationNativeAdapter mediationNativeAdapter2) {
                zzaok.m10006d("#007 Could not call remote method.", mediationNativeAdapter2);
                return;
            }
        }
        zzaok.m10007e("Unexpected native custom template ad type.");
    }

    public final void onAdFailedToLoad(MediationNativeAdapter mediationNativeAdapter, int i) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        mediationNativeAdapter = new StringBuilder(55);
        mediationNativeAdapter.append("Adapter called onAdFailedToLoad with error ");
        mediationNativeAdapter.append(i);
        mediationNativeAdapter.append(".");
        zzaok.m10001b(mediationNativeAdapter.toString());
        try {
            this.f17394a.mo2787a(i);
        } catch (MediationNativeAdapter mediationNativeAdapter2) {
            zzaok.m10006d("#007 Could not call remote method.", mediationNativeAdapter2);
        }
    }

    public final void onAdOpened(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzaok.m10001b("Adapter called onAdOpened.");
        try {
            this.f17394a.mo2795d();
        } catch (MediationNativeAdapter mediationNativeAdapter2) {
            zzaok.m10006d("#007 Could not call remote method.", mediationNativeAdapter2);
        }
    }

    public final void onAdClosed(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzaok.m10001b("Adapter called onAdClosed.");
        try {
            this.f17394a.mo2793b();
        } catch (MediationNativeAdapter mediationNativeAdapter2) {
            zzaok.m10006d("#007 Could not call remote method.", mediationNativeAdapter2);
        }
    }

    public final void onAdLeftApplication(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzaok.m10001b("Adapter called onAdLeftApplication.");
        try {
            this.f17394a.mo2794c();
        } catch (MediationNativeAdapter mediationNativeAdapter2) {
            zzaok.m10006d("#007 Could not call remote method.", mediationNativeAdapter2);
        }
    }

    public final void onAdClicked(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        mediationNativeAdapter = this.f17395b;
        UnifiedNativeAdMapper unifiedNativeAdMapper = this.f17396c;
        if (this.f17397d == null) {
            if (mediationNativeAdapter == null && unifiedNativeAdMapper == null) {
                zzaok.m10006d("#007 Could not call remote method.", null);
                return;
            } else if (unifiedNativeAdMapper != null && !unifiedNativeAdMapper.getOverrideClickHandling()) {
                zzaok.m10001b("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            } else if (mediationNativeAdapter != null && mediationNativeAdapter.getOverrideClickHandling() == null) {
                zzaok.m10001b("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        zzaok.m10001b("Adapter called onAdClicked.");
        try {
            this.f17394a.mo2786a();
        } catch (MediationNativeAdapter mediationNativeAdapter2) {
            zzaok.m10006d("#007 Could not call remote method.", mediationNativeAdapter2);
        }
    }

    public final void onAdImpression(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        mediationNativeAdapter = this.f17395b;
        UnifiedNativeAdMapper unifiedNativeAdMapper = this.f17396c;
        if (this.f17397d == null) {
            if (mediationNativeAdapter == null && unifiedNativeAdMapper == null) {
                zzaok.m10006d("#007 Could not call remote method.", null);
                return;
            } else if (unifiedNativeAdMapper != null && !unifiedNativeAdMapper.getOverrideImpressionRecording()) {
                zzaok.m10001b("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            } else if (mediationNativeAdapter != null && mediationNativeAdapter.getOverrideImpressionRecording() == null) {
                zzaok.m10001b("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        zzaok.m10001b("Adapter called onAdImpression.");
        try {
            this.f17394a.mo2797f();
        } catch (MediationNativeAdapter mediationNativeAdapter2) {
            zzaok.m10006d("#007 Could not call remote method.", mediationNativeAdapter2);
        }
    }

    public final void onVideoEnd(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzaok.m10001b("Adapter called onVideoEnd.");
        try {
            this.f17394a.mo2798g();
        } catch (MediationNativeAdapter mediationNativeAdapter2) {
            zzaok.m10006d("#007 Could not call remote method.", mediationNativeAdapter2);
        }
    }

    /* renamed from: a */
    public final NativeAdMapper m22126a() {
        return this.f17395b;
    }

    /* renamed from: b */
    public final UnifiedNativeAdMapper m22127b() {
        return this.f17396c;
    }

    /* renamed from: c */
    public final NativeCustomTemplateAd m22128c() {
        return this.f17397d;
    }
}
