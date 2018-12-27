package com.google.ads.mediation.customevent;

import android.app.Activity;
import android.view.View;
import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.AdSize;
import com.google.ads.mediation.MediationAdRequest;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationBannerListener;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.customevent.CustomEventExtras;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzaok;

@KeepName
public final class CustomEventAdapter implements MediationBannerAdapter<CustomEventExtras, CustomEventServerParameters>, MediationInterstitialAdapter<CustomEventExtras, CustomEventServerParameters> {
    /* renamed from: a */
    private View f19314a;
    @VisibleForTesting
    /* renamed from: b */
    private CustomEventBanner f19315b;
    @VisibleForTesting
    /* renamed from: c */
    private CustomEventInterstitial f19316c;

    @VisibleForTesting
    /* renamed from: com.google.ads.mediation.customevent.CustomEventAdapter$a */
    static final class C4677a implements CustomEventBannerListener {
        /* renamed from: a */
        private final CustomEventAdapter f19309a;
        /* renamed from: b */
        private final MediationBannerListener f19310b;

        public C4677a(CustomEventAdapter customEventAdapter, MediationBannerListener mediationBannerListener) {
            this.f19309a = customEventAdapter;
            this.f19310b = mediationBannerListener;
        }

        public final void onReceivedAd(View view) {
            zzaok.m10001b("Custom event adapter called onReceivedAd.");
            this.f19309a.m25701a(view);
            this.f19310b.onReceivedAd(this.f19309a);
        }

        public final void onFailedToReceiveAd() {
            zzaok.m10001b("Custom event adapter called onFailedToReceiveAd.");
            this.f19310b.onFailedToReceiveAd(this.f19309a, ErrorCode.NO_FILL);
        }

        public final void onClick() {
            zzaok.m10001b("Custom event adapter called onFailedToReceiveAd.");
            this.f19310b.onClick(this.f19309a);
        }

        public final void onPresentScreen() {
            zzaok.m10001b("Custom event adapter called onFailedToReceiveAd.");
            this.f19310b.onPresentScreen(this.f19309a);
        }

        public final void onDismissScreen() {
            zzaok.m10001b("Custom event adapter called onFailedToReceiveAd.");
            this.f19310b.onDismissScreen(this.f19309a);
        }

        public final void onLeaveApplication() {
            zzaok.m10001b("Custom event adapter called onFailedToReceiveAd.");
            this.f19310b.onLeaveApplication(this.f19309a);
        }
    }

    @VisibleForTesting
    /* renamed from: com.google.ads.mediation.customevent.CustomEventAdapter$b */
    class C4678b implements CustomEventInterstitialListener {
        /* renamed from: a */
        private final CustomEventAdapter f19311a;
        /* renamed from: b */
        private final MediationInterstitialListener f19312b;
        /* renamed from: c */
        private final /* synthetic */ CustomEventAdapter f19313c;

        public C4678b(CustomEventAdapter customEventAdapter, CustomEventAdapter customEventAdapter2, MediationInterstitialListener mediationInterstitialListener) {
            this.f19313c = customEventAdapter;
            this.f19311a = customEventAdapter2;
            this.f19312b = mediationInterstitialListener;
        }

        public final void onReceivedAd() {
            zzaok.m10001b("Custom event adapter called onReceivedAd.");
            this.f19312b.onReceivedAd(this.f19313c);
        }

        public final void onFailedToReceiveAd() {
            zzaok.m10001b("Custom event adapter called onFailedToReceiveAd.");
            this.f19312b.onFailedToReceiveAd(this.f19311a, ErrorCode.NO_FILL);
        }

        public final void onPresentScreen() {
            zzaok.m10001b("Custom event adapter called onPresentScreen.");
            this.f19312b.onPresentScreen(this.f19311a);
        }

        public final void onDismissScreen() {
            zzaok.m10001b("Custom event adapter called onDismissScreen.");
            this.f19312b.onDismissScreen(this.f19311a);
        }

        public final void onLeaveApplication() {
            zzaok.m10001b("Custom event adapter called onLeaveApplication.");
            this.f19312b.onLeaveApplication(this.f19311a);
        }
    }

    /* renamed from: a */
    private static <T> T m25700a(String str) {
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

    public final void destroy() {
        if (this.f19315b != null) {
            this.f19315b.destroy();
        }
        if (this.f19316c != null) {
            this.f19316c.destroy();
        }
    }

    public final Class<CustomEventExtras> getAdditionalParametersType() {
        return CustomEventExtras.class;
    }

    public final View getBannerView() {
        return this.f19314a;
    }

    public final Class<CustomEventServerParameters> getServerParametersType() {
        return CustomEventServerParameters.class;
    }

    public final void requestBannerAd(MediationBannerListener mediationBannerListener, Activity activity, CustomEventServerParameters customEventServerParameters, AdSize adSize, MediationAdRequest mediationAdRequest, CustomEventExtras customEventExtras) {
        this.f19315b = (CustomEventBanner) m25700a(customEventServerParameters.className);
        if (this.f19315b == null) {
            mediationBannerListener.onFailedToReceiveAd(this, ErrorCode.INTERNAL_ERROR);
            return;
        }
        if (customEventExtras == null) {
            customEventExtras = null;
        } else {
            customEventExtras = customEventExtras.getExtra(customEventServerParameters.label);
        }
        this.f19315b.requestBannerAd(new C4677a(this, mediationBannerListener), activity, customEventServerParameters.label, customEventServerParameters.parameter, adSize, mediationAdRequest, customEventExtras);
    }

    public final void requestInterstitialAd(MediationInterstitialListener mediationInterstitialListener, Activity activity, CustomEventServerParameters customEventServerParameters, MediationAdRequest mediationAdRequest, CustomEventExtras customEventExtras) {
        this.f19316c = (CustomEventInterstitial) m25700a(customEventServerParameters.className);
        if (this.f19316c == null) {
            mediationInterstitialListener.onFailedToReceiveAd(this, ErrorCode.INTERNAL_ERROR);
            return;
        }
        if (customEventExtras == null) {
            customEventExtras = null;
        } else {
            customEventExtras = customEventExtras.getExtra(customEventServerParameters.label);
        }
        this.f19316c.requestInterstitialAd(new C4678b(this, this, mediationInterstitialListener), activity, customEventServerParameters.label, customEventServerParameters.parameter, mediationAdRequest, customEventExtras);
    }

    public final void showInterstitial() {
        this.f19316c.showInterstitial();
    }

    /* renamed from: a */
    private final void m25701a(View view) {
        this.f19314a = view;
    }
}
