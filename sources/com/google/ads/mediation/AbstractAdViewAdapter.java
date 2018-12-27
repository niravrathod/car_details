package com.google.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeAdView;
import com.google.android.gms.ads.formats.NativeAdViewHolder;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeAppInstallAd.OnAppInstallAdLoadedListener;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.NativeContentAd.OnContentAdLoadedListener;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomClickListener;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.formats.UnifiedNativeAd.OnUnifiedNativeAdLoadedListener;
import com.google.android.gms.ads.formats.UnifiedNativeAdView;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationAdapter.zza;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.mediation.zzb;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzaer;
import com.google.android.gms.internal.ads.zzaoa;
import com.google.android.gms.internal.ads.zzaok;
import com.google.android.gms.internal.ads.zzauy;
import com.google.android.gms.internal.ads.zzjc;
import com.google.android.gms.internal.ads.zzkd;
import com.google.android.gms.internal.ads.zzly;
import java.util.Date;
import java.util.Map;
import java.util.Set;

@zzaer
public abstract class AbstractAdViewAdapter implements MediationBannerAdapter, MediationNativeAdapter, OnImmersiveModeUpdatedListener, zzb, MediationRewardedVideoAdAdapter, zzauy {
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private AdView zzha;
    private InterstitialAd zzhb;
    private AdLoader zzhc;
    private Context zzhd;
    private InterstitialAd zzhe;
    private MediationRewardedVideoAdListener zzhf;
    @VisibleForTesting
    private final RewardedVideoAdListener zzhg = new C3938a(this);

    /* renamed from: com.google.ads.mediation.AbstractAdViewAdapter$c */
    static class C3934c extends UnifiedNativeAdMapper {
        /* renamed from: a */
        private final UnifiedNativeAd f15667a;

        public C3934c(UnifiedNativeAd unifiedNativeAd) {
            this.f15667a = unifiedNativeAd;
            setHeadline(unifiedNativeAd.getHeadline());
            setImages(unifiedNativeAd.getImages());
            setBody(unifiedNativeAd.getBody());
            setIcon(unifiedNativeAd.getIcon());
            setCallToAction(unifiedNativeAd.getCallToAction());
            setAdvertiser(unifiedNativeAd.getAdvertiser());
            setStarRating(unifiedNativeAd.getStarRating());
            setStore(unifiedNativeAd.getStore());
            setPrice(unifiedNativeAd.getPrice());
            zzm(unifiedNativeAd.zzbh());
            setOverrideImpressionRecording(true);
            setOverrideClickHandling(true);
            zza(unifiedNativeAd.getVideoController());
        }

        public final void trackViews(View view, Map<String, View> map, Map<String, View> map2) {
            if ((view instanceof UnifiedNativeAdView) != null) {
                ((UnifiedNativeAdView) view).setNativeAd(this.f15667a);
                return;
            }
            NativeAdViewHolder nativeAdViewHolder = (NativeAdViewHolder) NativeAdViewHolder.zzvx.get(view);
            if (nativeAdViewHolder != null) {
                nativeAdViewHolder.setNativeAd(this.f15667a);
            }
        }
    }

    @VisibleForTesting
    /* renamed from: com.google.ads.mediation.AbstractAdViewAdapter$d */
    static final class C3935d extends AdListener implements AppEventListener, zzjc {
        @VisibleForTesting
        /* renamed from: a */
        private final AbstractAdViewAdapter f15668a;
        @VisibleForTesting
        /* renamed from: b */
        private final MediationBannerListener f15669b;

        public C3935d(AbstractAdViewAdapter abstractAdViewAdapter, MediationBannerListener mediationBannerListener) {
            this.f15668a = abstractAdViewAdapter;
            this.f15669b = mediationBannerListener;
        }

        public final void onAdLoaded() {
            this.f15669b.onAdLoaded(this.f15668a);
        }

        public final void onAdFailedToLoad(int i) {
            this.f15669b.onAdFailedToLoad(this.f15668a, i);
        }

        public final void onAdOpened() {
            this.f15669b.onAdOpened(this.f15668a);
        }

        public final void onAdClosed() {
            this.f15669b.onAdClosed(this.f15668a);
        }

        public final void onAdLeftApplication() {
            this.f15669b.onAdLeftApplication(this.f15668a);
        }

        public final void onAdClicked() {
            this.f15669b.onAdClicked(this.f15668a);
        }

        public final void onAppEvent(String str, String str2) {
            this.f15669b.zza(this.f15668a, str, str2);
        }
    }

    @VisibleForTesting
    /* renamed from: com.google.ads.mediation.AbstractAdViewAdapter$e */
    static final class C3936e extends AdListener implements zzjc {
        @VisibleForTesting
        /* renamed from: a */
        private final AbstractAdViewAdapter f15670a;
        @VisibleForTesting
        /* renamed from: b */
        private final MediationInterstitialListener f15671b;

        public C3936e(AbstractAdViewAdapter abstractAdViewAdapter, MediationInterstitialListener mediationInterstitialListener) {
            this.f15670a = abstractAdViewAdapter;
            this.f15671b = mediationInterstitialListener;
        }

        public final void onAdLoaded() {
            this.f15671b.onAdLoaded(this.f15670a);
        }

        public final void onAdFailedToLoad(int i) {
            this.f15671b.onAdFailedToLoad(this.f15670a, i);
        }

        public final void onAdOpened() {
            this.f15671b.onAdOpened(this.f15670a);
        }

        public final void onAdClosed() {
            this.f15671b.onAdClosed(this.f15670a);
        }

        public final void onAdLeftApplication() {
            this.f15671b.onAdLeftApplication(this.f15670a);
        }

        public final void onAdClicked() {
            this.f15671b.onAdClicked(this.f15670a);
        }
    }

    @VisibleForTesting
    /* renamed from: com.google.ads.mediation.AbstractAdViewAdapter$f */
    static final class C3937f extends AdListener implements OnAppInstallAdLoadedListener, OnContentAdLoadedListener, OnCustomClickListener, OnCustomTemplateAdLoadedListener, OnUnifiedNativeAdLoadedListener {
        @VisibleForTesting
        /* renamed from: a */
        private final AbstractAdViewAdapter f15672a;
        @VisibleForTesting
        /* renamed from: b */
        private final MediationNativeListener f15673b;

        public C3937f(AbstractAdViewAdapter abstractAdViewAdapter, MediationNativeListener mediationNativeListener) {
            this.f15672a = abstractAdViewAdapter;
            this.f15673b = mediationNativeListener;
        }

        public final void onAdLoaded() {
        }

        public final void onAdFailedToLoad(int i) {
            this.f15673b.onAdFailedToLoad(this.f15672a, i);
        }

        public final void onAdOpened() {
            this.f15673b.onAdOpened(this.f15672a);
        }

        public final void onAdClosed() {
            this.f15673b.onAdClosed(this.f15672a);
        }

        public final void onAdLeftApplication() {
            this.f15673b.onAdLeftApplication(this.f15672a);
        }

        public final void onAdClicked() {
            this.f15673b.onAdClicked(this.f15672a);
        }

        public final void onAdImpression() {
            this.f15673b.onAdImpression(this.f15672a);
        }

        public final void onAppInstallAdLoaded(NativeAppInstallAd nativeAppInstallAd) {
            this.f15673b.onAdLoaded(this.f15672a, new C4675a(nativeAppInstallAd));
        }

        public final void onUnifiedNativeAdLoaded(UnifiedNativeAd unifiedNativeAd) {
            this.f15673b.onAdLoaded(this.f15672a, new C3934c(unifiedNativeAd));
        }

        public final void onContentAdLoaded(NativeContentAd nativeContentAd) {
            this.f15673b.onAdLoaded(this.f15672a, new C4676b(nativeContentAd));
        }

        public final void onCustomTemplateAdLoaded(NativeCustomTemplateAd nativeCustomTemplateAd) {
            this.f15673b.zza(this.f15672a, nativeCustomTemplateAd);
        }

        public final void onCustomClick(NativeCustomTemplateAd nativeCustomTemplateAd, String str) {
            this.f15673b.zza(this.f15672a, nativeCustomTemplateAd, str);
        }
    }

    /* renamed from: com.google.ads.mediation.AbstractAdViewAdapter$a */
    static class C4675a extends NativeAppInstallAdMapper {
        /* renamed from: a */
        private final NativeAppInstallAd f19307a;

        public C4675a(NativeAppInstallAd nativeAppInstallAd) {
            this.f19307a = nativeAppInstallAd;
            setHeadline(nativeAppInstallAd.getHeadline().toString());
            setImages(nativeAppInstallAd.getImages());
            setBody(nativeAppInstallAd.getBody().toString());
            setIcon(nativeAppInstallAd.getIcon());
            setCallToAction(nativeAppInstallAd.getCallToAction().toString());
            if (nativeAppInstallAd.getStarRating() != null) {
                setStarRating(nativeAppInstallAd.getStarRating().doubleValue());
            }
            if (nativeAppInstallAd.getStore() != null) {
                setStore(nativeAppInstallAd.getStore().toString());
            }
            if (nativeAppInstallAd.getPrice() != null) {
                setPrice(nativeAppInstallAd.getPrice().toString());
            }
            setOverrideImpressionRecording(true);
            setOverrideClickHandling(true);
            zza(nativeAppInstallAd.getVideoController());
        }

        public final void trackView(View view) {
            if (view instanceof NativeAdView) {
                ((NativeAdView) view).setNativeAd(this.f19307a);
            }
            NativeAdViewHolder nativeAdViewHolder = (NativeAdViewHolder) NativeAdViewHolder.zzvx.get(view);
            if (nativeAdViewHolder != null) {
                nativeAdViewHolder.setNativeAd(this.f19307a);
            }
        }
    }

    /* renamed from: com.google.ads.mediation.AbstractAdViewAdapter$b */
    static class C4676b extends NativeContentAdMapper {
        /* renamed from: a */
        private final NativeContentAd f19308a;

        public C4676b(NativeContentAd nativeContentAd) {
            this.f19308a = nativeContentAd;
            setHeadline(nativeContentAd.getHeadline().toString());
            setImages(nativeContentAd.getImages());
            setBody(nativeContentAd.getBody().toString());
            if (nativeContentAd.getLogo() != null) {
                setLogo(nativeContentAd.getLogo());
            }
            setCallToAction(nativeContentAd.getCallToAction().toString());
            setAdvertiser(nativeContentAd.getAdvertiser().toString());
            setOverrideImpressionRecording(true);
            setOverrideClickHandling(true);
            zza(nativeContentAd.getVideoController());
        }

        public final void trackView(View view) {
            if (view instanceof NativeAdView) {
                ((NativeAdView) view).setNativeAd(this.f19308a);
            }
            NativeAdViewHolder nativeAdViewHolder = (NativeAdViewHolder) NativeAdViewHolder.zzvx.get(view);
            if (nativeAdViewHolder != null) {
                nativeAdViewHolder.setNativeAd(this.f19308a);
            }
        }
    }

    protected abstract Bundle zza(Bundle bundle, Bundle bundle2);

    private final AdRequest zza(Context context, MediationAdRequest mediationAdRequest, Bundle bundle, Bundle bundle2) {
        Builder builder = new Builder();
        Date birthday = mediationAdRequest.getBirthday();
        if (birthday != null) {
            builder.setBirthday(birthday);
        }
        int gender = mediationAdRequest.getGender();
        if (gender != 0) {
            builder.setGender(gender);
        }
        Set<String> keywords = mediationAdRequest.getKeywords();
        if (keywords != null) {
            for (String addKeyword : keywords) {
                builder.addKeyword(addKeyword);
            }
        }
        Location location = mediationAdRequest.getLocation();
        if (location != null) {
            builder.setLocation(location);
        }
        if (mediationAdRequest.isTesting()) {
            zzkd.m10709a();
            builder.addTestDevice(zzaoa.m9954a(context));
        }
        if (mediationAdRequest.taggedForChildDirectedTreatment() != -1) {
            boolean z = true;
            if (mediationAdRequest.taggedForChildDirectedTreatment() != 1) {
                z = false;
            }
            builder.tagForChildDirectedTreatment(z);
        }
        builder.setIsDesignedForFamilies(mediationAdRequest.isDesignedForFamilies());
        builder.addNetworkExtrasBundle(AdMobAdapter.class, zza(bundle, bundle2));
        return builder.build();
    }

    public void onDestroy() {
        if (this.zzha != null) {
            this.zzha.destroy();
            this.zzha = null;
        }
        if (this.zzhb != null) {
            this.zzhb = null;
        }
        if (this.zzhc != null) {
            this.zzhc = null;
        }
        if (this.zzhe != null) {
            this.zzhe = null;
        }
    }

    public void onPause() {
        if (this.zzha != null) {
            this.zzha.pause();
        }
    }

    public void onResume() {
        if (this.zzha != null) {
            this.zzha.resume();
        }
    }

    public String getAdUnitId(Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    public void requestBannerAd(Context context, MediationBannerListener mediationBannerListener, Bundle bundle, AdSize adSize, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.zzha = new AdView(context);
        this.zzha.setAdSize(new AdSize(adSize.getWidth(), adSize.getHeight()));
        this.zzha.setAdUnitId(getAdUnitId(bundle));
        this.zzha.setAdListener(new C3935d(this, mediationBannerListener));
        this.zzha.loadAd(zza(context, mediationAdRequest, bundle2, bundle));
    }

    public View getBannerView() {
        return this.zzha;
    }

    public void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.zzhb = new InterstitialAd(context);
        this.zzhb.setAdUnitId(getAdUnitId(bundle));
        this.zzhb.setAdListener(new C3936e(this, mediationInterstitialListener));
        this.zzhb.loadAd(zza(context, mediationAdRequest, bundle2, bundle));
    }

    public void onImmersiveModeUpdated(boolean z) {
        if (this.zzhb != null) {
            this.zzhb.setImmersiveMode(z);
        }
        if (this.zzhe != null) {
            this.zzhe.setImmersiveMode(z);
        }
    }

    public zzly getVideoController() {
        if (this.zzha != null) {
            VideoController videoController = this.zzha.getVideoController();
            if (videoController != null) {
                return videoController.zzbb();
            }
        }
        return null;
    }

    public void showInterstitial() {
        this.zzhb.show();
    }

    public Bundle getInterstitialAdapterInfo() {
        return new zza().zzaq(1).zzxq();
    }

    public void requestNativeAd(Context context, MediationNativeListener mediationNativeListener, Bundle bundle, NativeMediationAdRequest nativeMediationAdRequest, Bundle bundle2) {
        OnCustomTemplateAdLoadedListener c3937f = new C3937f(this, mediationNativeListener);
        mediationNativeListener = new AdLoader.Builder(context, bundle.getString(AD_UNIT_ID_PARAMETER)).withAdListener(c3937f);
        NativeAdOptions nativeAdOptions = nativeMediationAdRequest.getNativeAdOptions();
        if (nativeAdOptions != null) {
            mediationNativeListener.withNativeAdOptions(nativeAdOptions);
        }
        if (nativeMediationAdRequest.isUnifiedNativeAdRequested()) {
            mediationNativeListener.forUnifiedNativeAd(c3937f);
        }
        if (nativeMediationAdRequest.isAppInstallAdRequested()) {
            mediationNativeListener.forAppInstallAd(c3937f);
        }
        if (nativeMediationAdRequest.isContentAdRequested()) {
            mediationNativeListener.forContentAd(c3937f);
        }
        if (nativeMediationAdRequest.zzok()) {
            for (String str : nativeMediationAdRequest.zzol().keySet()) {
                mediationNativeListener.forCustomTemplateAd(str, c3937f, ((Boolean) nativeMediationAdRequest.zzol().get(str)).booleanValue() ? c3937f : null);
            }
        }
        this.zzhc = mediationNativeListener.build();
        this.zzhc.loadAd(zza(context, nativeMediationAdRequest, bundle2, bundle));
    }

    public void initialize(Context context, MediationAdRequest mediationAdRequest, String str, MediationRewardedVideoAdListener mediationRewardedVideoAdListener, Bundle bundle, Bundle bundle2) {
        this.zzhd = context.getApplicationContext();
        this.zzhf = mediationRewardedVideoAdListener;
        this.zzhf.onInitializationSucceeded(this);
    }

    public void loadAd(MediationAdRequest mediationAdRequest, Bundle bundle, Bundle bundle2) {
        if (this.zzhd != null) {
            if (this.zzhf != null) {
                this.zzhe = new InterstitialAd(this.zzhd);
                this.zzhe.zza(true);
                this.zzhe.setAdUnitId(getAdUnitId(bundle));
                this.zzhe.setRewardedVideoAdListener(this.zzhg);
                this.zzhe.setAdMetadataListener(new C3939b(this));
                this.zzhe.loadAd(zza(this.zzhd, mediationAdRequest, bundle2, bundle));
                return;
            }
        }
        zzaok.m10003c("AdMobAdapter.loadAd called before initialize.");
    }

    public void showVideo() {
        this.zzhe.show();
    }

    public boolean isInitialized() {
        return this.zzhf != null;
    }
}
