package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.customtabs.C0123c;
import android.support.customtabs.C0123c.C0122a;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.common.util.PlatformVersion;

@zzaer
public final class zzabb implements MediationInterstitialAdapter {
    /* renamed from: a */
    private Activity f19669a;
    /* renamed from: b */
    private MediationInterstitialListener f19670b;
    /* renamed from: c */
    private Uri f19671c;

    public final void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.f19670b = mediationInterstitialListener;
        if (this.f19670b == null) {
            zzaok.m10007e("Listener not set for mediation. Returning.");
        } else if ((context instanceof Activity) == null) {
            zzaok.m10007e("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.f19670b.onAdFailedToLoad(this, 0);
        } else {
            mediationInterstitialListener = (PlatformVersion.isAtLeastIceCreamSandwichMR1() == null || zzot.m21793a(context) == null) ? null : true;
            if (mediationInterstitialListener == null) {
                zzaok.m10007e("Default browser does not support custom tabs. Bailing out.");
                this.f19670b.onAdFailedToLoad(this, 0);
                return;
            }
            mediationInterstitialListener = bundle.getString("tab_url");
            if (TextUtils.isEmpty(mediationInterstitialListener) != null) {
                zzaok.m10007e("The tab_url retrieved from mediation metadata is empty. Bailing out.");
                this.f19670b.onAdFailedToLoad(this, 0);
                return;
            }
            this.f19669a = (Activity) context;
            this.f19671c = Uri.parse(mediationInterstitialListener);
            this.f19670b.onAdLoaded(this);
        }
    }

    public final void showInterstitial() {
        C0123c b = new C0122a().m457b();
        b.f527a.setData(this.f19671c);
        zzalo.f8872a.post(new C2438j(this, new AdOverlayInfoParcel(new zzc(b.f527a), null, new C4095i(this), null, new zzaop(0, 0, false))));
        zzbv.zzeo().m9720e();
    }

    public final void onDestroy() {
        zzaok.m10001b("Destroying AdMobCustomTabsAdapter adapter.");
    }

    public final void onPause() {
        zzaok.m10001b("Pausing AdMobCustomTabsAdapter adapter.");
    }

    public final void onResume() {
        zzaok.m10001b("Resuming AdMobCustomTabsAdapter adapter.");
    }
}
