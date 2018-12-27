package com.google.android.gms.internal.ads;

import android.os.IInterface;
import com.google.android.gms.dynamic.IObjectWrapper;

public interface zzlf extends IInterface {
    zzkp createAdLoaderBuilder(IObjectWrapper iObjectWrapper, String str, zzyn zzyn, int i);

    zzabw createAdOverlay(IObjectWrapper iObjectWrapper);

    zzku createBannerAdManager(IObjectWrapper iObjectWrapper, zzjo zzjo, String str, zzyn zzyn, int i);

    zzacg createInAppPurchaseManager(IObjectWrapper iObjectWrapper);

    zzku createInterstitialAdManager(IObjectWrapper iObjectWrapper, zzjo zzjo, String str, zzyn zzyn, int i);

    zzqo createNativeAdViewDelegate(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2);

    zzqt createNativeAdViewHolderDelegate(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3);

    zzaid createRewardedVideoAd(IObjectWrapper iObjectWrapper, zzyn zzyn, int i);

    zzaid createRewardedVideoAdSku(IObjectWrapper iObjectWrapper, int i);

    zzku createSearchAdManager(IObjectWrapper iObjectWrapper, zzjo zzjo, String str, int i);

    zzll getMobileAdsSettingsManager(IObjectWrapper iObjectWrapper);

    zzll getMobileAdsSettingsManagerWithClientJarVersion(IObjectWrapper iObjectWrapper, int i);
}
