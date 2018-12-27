package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzaok;

@KeepName
@KeepForSdkWithMembers
public final class CustomEventAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {
    /* renamed from: a */
    private View f19604a;
    @VisibleForTesting
    /* renamed from: b */
    private CustomEventBanner f19605b;
    @VisibleForTesting
    /* renamed from: c */
    private CustomEventInterstitial f19606c;
    @VisibleForTesting
    /* renamed from: d */
    private CustomEventNative f19607d;

    @VisibleForTesting
    /* renamed from: com.google.android.gms.ads.mediation.customevent.CustomEventAdapter$a */
    static final class C4700a implements CustomEventBannerListener {
        /* renamed from: a */
        private final CustomEventAdapter f19597a;
        /* renamed from: b */
        private final MediationBannerListener f19598b;

        public C4700a(CustomEventAdapter customEventAdapter, MediationBannerListener mediationBannerListener) {
            this.f19597a = customEventAdapter;
            this.f19598b = mediationBannerListener;
        }

        public final void onAdLoaded(View view) {
            zzaok.m10001b("Custom event adapter called onAdLoaded.");
            this.f19597a.m25977a(view);
            this.f19598b.onAdLoaded(this.f19597a);
        }

        public final void onAdFailedToLoad(int i) {
            zzaok.m10001b("Custom event adapter called onAdFailedToLoad.");
            this.f19598b.onAdFailedToLoad(this.f19597a, i);
        }

        public final void onAdClicked() {
            zzaok.m10001b("Custom event adapter called onAdClicked.");
            this.f19598b.onAdClicked(this.f19597a);
        }

        public final void onAdOpened() {
            zzaok.m10001b("Custom event adapter called onAdOpened.");
            this.f19598b.onAdOpened(this.f19597a);
        }

        public final void onAdClosed() {
            zzaok.m10001b("Custom event adapter called onAdClosed.");
            this.f19598b.onAdClosed(this.f19597a);
        }

        public final void onAdLeftApplication() {
            zzaok.m10001b("Custom event adapter called onAdLeftApplication.");
            this.f19598b.onAdLeftApplication(this.f19597a);
        }
    }

    @VisibleForTesting
    /* renamed from: com.google.android.gms.ads.mediation.customevent.CustomEventAdapter$b */
    class C4701b implements CustomEventInterstitialListener {
        /* renamed from: a */
        private final CustomEventAdapter f19599a;
        /* renamed from: b */
        private final MediationInterstitialListener f19600b;
        /* renamed from: c */
        private final /* synthetic */ CustomEventAdapter f19601c;

        public C4701b(CustomEventAdapter customEventAdapter, CustomEventAdapter customEventAdapter2, MediationInterstitialListener mediationInterstitialListener) {
            this.f19601c = customEventAdapter;
            this.f19599a = customEventAdapter2;
            this.f19600b = mediationInterstitialListener;
        }

        public final void onAdLoaded() {
            zzaok.m10001b("Custom event adapter called onReceivedAd.");
            this.f19600b.onAdLoaded(this.f19601c);
        }

        public final void onAdFailedToLoad(int i) {
            zzaok.m10001b("Custom event adapter called onFailedToReceiveAd.");
            this.f19600b.onAdFailedToLoad(this.f19599a, i);
        }

        public final void onAdClicked() {
            zzaok.m10001b("Custom event adapter called onAdClicked.");
            this.f19600b.onAdClicked(this.f19599a);
        }

        public final void onAdOpened() {
            zzaok.m10001b("Custom event adapter called onAdOpened.");
            this.f19600b.onAdOpened(this.f19599a);
        }

        public final void onAdClosed() {
            zzaok.m10001b("Custom event adapter called onAdClosed.");
            this.f19600b.onAdClosed(this.f19599a);
        }

        public final void onAdLeftApplication() {
            zzaok.m10001b("Custom event adapter called onAdLeftApplication.");
            this.f19600b.onAdLeftApplication(this.f19599a);
        }
    }

    @VisibleForTesting
    /* renamed from: com.google.android.gms.ads.mediation.customevent.CustomEventAdapter$c */
    static class C4702c implements CustomEventNativeListener {
        /* renamed from: a */
        private final CustomEventAdapter f19602a;
        /* renamed from: b */
        private final MediationNativeListener f19603b;

        public C4702c(CustomEventAdapter customEventAdapter, MediationNativeListener mediationNativeListener) {
            this.f19602a = customEventAdapter;
            this.f19603b = mediationNativeListener;
        }

        public final void onAdLoaded(NativeAdMapper nativeAdMapper) {
            zzaok.m10001b("Custom event adapter called onAdLoaded.");
            this.f19603b.onAdLoaded(this.f19602a, nativeAdMapper);
        }

        public final void onAdLoaded(UnifiedNativeAdMapper unifiedNativeAdMapper) {
            zzaok.m10001b("Custom event adapter called onAdLoaded.");
            this.f19603b.onAdLoaded(this.f19602a, unifiedNativeAdMapper);
        }

        public final void onAdFailedToLoad(int i) {
            zzaok.m10001b("Custom event adapter called onAdFailedToLoad.");
            this.f19603b.onAdFailedToLoad(this.f19602a, i);
        }

        public final void onAdOpened() {
            zzaok.m10001b("Custom event adapter called onAdOpened.");
            this.f19603b.onAdOpened(this.f19602a);
        }

        public final void onAdClicked() {
            zzaok.m10001b("Custom event adapter called onAdClicked.");
            this.f19603b.onAdClicked(this.f19602a);
        }

        public final void onAdClosed() {
            zzaok.m10001b("Custom event adapter called onAdClosed.");
            this.f19603b.onAdClosed(this.f19602a);
        }

        public final void onAdLeftApplication() {
            zzaok.m10001b("Custom event adapter called onAdLeftApplication.");
            this.f19603b.onAdLeftApplication(this.f19602a);
        }

        public final void onAdImpression() {
            zzaok.m10001b("Custom event adapter called onAdImpression.");
            this.f19603b.onAdImpression(this.f19602a);
        }
    }

    /* renamed from: a */
    private static <T> T m25976a(String str) {
        try {
            return Class.forName(str).newInstance();
        } catch (Throwable th) {
            String message = th.getMessage();
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 46) + String.valueOf(message).length());
            stringBuilder.append("Could not instantiate custom event adapter: ");
            stringBuilder.append(str);
            stringBuilder.append(". ");
            stringBuilder.append(message);
            zzaok.m10007e(stringBuilder.toString());
            return null;
        }
    }

    public final void onDestroy() {
        if (this.f19605b != null) {
            this.f19605b.onDestroy();
        }
        if (this.f19606c != null) {
            this.f19606c.onDestroy();
        }
        if (this.f19607d != null) {
            this.f19607d.onDestroy();
        }
    }

    public final void onPause() {
        if (this.f19605b != null) {
            this.f19605b.onPause();
        }
        if (this.f19606c != null) {
            this.f19606c.onPause();
        }
        if (this.f19607d != null) {
            this.f19607d.onPause();
        }
    }

    public final void onResume() {
        if (this.f19605b != null) {
            this.f19605b.onResume();
        }
        if (this.f19606c != null) {
            this.f19606c.onResume();
        }
        if (this.f19607d != null) {
            this.f19607d.onResume();
        }
    }

    public final View getBannerView() {
        return this.f19604a;
    }

    public final void requestBannerAd(Context context, MediationBannerListener mediationBannerListener, Bundle bundle, AdSize adSize, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.f19605b = (CustomEventBanner) m25976a(bundle.getString("class_name"));
        if (this.f19605b == null) {
            mediationBannerListener.onAdFailedToLoad(this, null);
            return;
        }
        if (bundle2 == null) {
            bundle2 = null;
        } else {
            bundle2 = bundle2.getBundle(bundle.getString("class_name"));
        }
        this.f19605b.requestBannerAd(context, new C4700a(this, mediationBannerListener), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), adSize, mediationAdRequest, bundle2);
    }

    public final void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.f19606c = (CustomEventInterstitial) m25976a(bundle.getString("class_name"));
        if (this.f19606c == null) {
            mediationInterstitialListener.onAdFailedToLoad(this, null);
            return;
        }
        if (bundle2 == null) {
            bundle2 = null;
        } else {
            bundle2 = bundle2.getBundle(bundle.getString("class_name"));
        }
        this.f19606c.requestInterstitialAd(context, new C4701b(this, this, mediationInterstitialListener), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), mediationAdRequest, bundle2);
    }

    public final void requestNativeAd(Context context, MediationNativeListener mediationNativeListener, Bundle bundle, NativeMediationAdRequest nativeMediationAdRequest, Bundle bundle2) {
        this.f19607d = (CustomEventNative) m25976a(bundle.getString("class_name"));
        if (this.f19607d == null) {
            mediationNativeListener.onAdFailedToLoad(this, null);
            return;
        }
        if (bundle2 == null) {
            bundle2 = null;
        } else {
            bundle2 = bundle2.getBundle(bundle.getString("class_name"));
        }
        this.f19607d.requestNativeAd(context, new C4702c(this, mediationNativeListener), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), nativeMediationAdRequest, bundle2);
    }

    public final void showInterstitial() {
        this.f19606c.showInterstitial();
    }

    /* renamed from: a */
    private final void m25977a(View view) {
        this.f19604a = view;
    }
}
