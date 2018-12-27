package com.cuvora.carinfo.helpers;

import android.app.Activity;
import android.content.Context;
import android.preference.PreferenceManager;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatTextView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.cuvora.carinfo.R;
import com.cuvora.carinfo.p071d.C1473c;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.formats.UnifiedNativeAd.OnUnifiedNativeAdLoadedListener;
import com.google.android.gms.ads.formats.UnifiedNativeAdView;
import org.json.JSONObject;

/* renamed from: com.cuvora.carinfo.helpers.a */
public class C1533a {
    /* renamed from: a */
    public static void m5787a(final AdView adView, Context context) {
        if (C1570t.m6023h(context) != null && adView != null) {
            context = new Builder().build();
            adView.setAdListener(new AdListener() {
                public void onAdFailedToLoad(int i) {
                    super.onAdFailedToLoad(i);
                    adView.setVisibility(8);
                }

                public void onAdLoaded() {
                    super.onAdLoaded();
                    adView.setVisibility(0);
                }
            });
            adView.loadAd(context);
        }
    }

    /* renamed from: a */
    public static void m5788a(AdView adView, Context context, final AdListener adListener) {
        if (C1570t.m6023h(context) != null && adView != null) {
            context = new Builder().build();
            adView.setAdListener(new AdListener() {
                public void onAdFailedToLoad(int i) {
                    super.onAdFailedToLoad(i);
                    adListener.onAdFailedToLoad(i);
                }

                public void onAdLoaded() {
                    super.onAdLoaded();
                    adListener.onAdLoaded();
                }
            });
            adView.loadAd(context);
        }
    }

    /* renamed from: b */
    public static void m5793b(final AdView adView, Context context, final AdListener adListener) {
        if (C1570t.m6023h(context) == null || adView == null) {
            adListener.onAdFailedToLoad(null);
            return;
        }
        context = new Builder().build();
        adView.setAdListener(new AdListener() {
            public void onAdFailedToLoad(int i) {
                super.onAdFailedToLoad(i);
                adView.setVisibility(8);
                adListener.onAdFailedToLoad(i);
            }

            public void onAdLoaded() {
                super.onAdLoaded();
                adView.setVisibility(0);
                adListener.onAdLoaded();
            }

            public void onAdClicked() {
                super.onAdClicked();
                adListener.onAdClicked();
            }

            public void onAdClosed() {
                super.onAdClosed();
                adListener.onAdClosed();
            }

            public void onAdImpression() {
                super.onAdImpression();
                adListener.onAdImpression();
            }

            public void onAdLeftApplication() {
                super.onAdLeftApplication();
                adListener.onAdLeftApplication();
            }

            public void onAdOpened() {
                super.onAdOpened();
                adListener.onAdOpened();
            }
        });
        adView.loadAd(context);
    }

    /* renamed from: a */
    public static InterstitialAd m5782a(Context context) {
        final InterstitialAd interstitialAd = new InterstitialAd(context);
        interstitialAd.setAdUnitId(context.getString(R.string.home_screen_interstial_ad_unit_id));
        C1533a.m5789a(interstitialAd);
        interstitialAd.setAdListener(new AdListener() {
            public void onAdClosed() {
                C1533a.m5789a(interstitialAd);
            }
        });
        return interstitialAd;
    }

    /* renamed from: b */
    public static InterstitialAd m5791b(Context context) {
        InterstitialAd interstitialAd = new InterstitialAd(context);
        interstitialAd.setAdUnitId(context.getString(R.string.exit_screen_interstitial_ad_unit_id));
        C1533a.m5789a(interstitialAd);
        return interstitialAd;
    }

    /* renamed from: c */
    public static boolean m5795c(Context context) {
        return (!C1541e.m5856c("showExitAd") || C1570t.m6023h(context) == null) ? null : true;
    }

    /* renamed from: a */
    public static void m5786a(Context context, InterstitialAd interstitialAd, final C1473c<Boolean> c1473c) {
        if (c1473c != null) {
            if (C1533a.m5795c(context) == null) {
                c1473c.mo1162a(Boolean.valueOf(false));
            } else if (interstitialAd == null || interstitialAd.isLoaded() == null) {
                c1473c.mo1162a(Boolean.valueOf(false));
            } else {
                interstitialAd.show();
                interstitialAd.setAdListener(new AdListener() {
                    public void onAdClosed() {
                        c1473c.mo1162a(Boolean.valueOf(true));
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public static void m5789a(InterstitialAd interstitialAd) {
        interstitialAd.loadAd(new Builder().build());
    }

    /* renamed from: a */
    public static void m5790a(InterstitialAd interstitialAd, Context context) {
        JSONObject d = C1541e.m5857d("interstitialSettings");
        try {
            if (C1570t.m6023h(context) && d.getBoolean("activated") && C1533a.m5796d(context) >= d.getInt("minimumActionCount") && interstitialAd != null && interstitialAd.isLoaded()) {
                C1533a.m5785a(context, 0);
                interstitialAd.show();
            }
        } catch (InterstitialAd interstitialAd2) {
            interstitialAd2.printStackTrace();
        }
    }

    /* renamed from: b */
    public static void m5794b(InterstitialAd interstitialAd, Context context) {
        JSONObject d = C1541e.m5857d("interstitialSettings");
        try {
            if (C1570t.m6023h(context) && d.getBoolean("activated") && interstitialAd != null && interstitialAd.isLoaded()) {
                C1533a.m5785a(context, 0);
                interstitialAd.show();
            }
        } catch (InterstitialAd interstitialAd2) {
            interstitialAd2.printStackTrace();
        }
    }

    /* renamed from: d */
    public static int m5796d(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt("KEY_INTERSTITIAL_ACTION_COUNT", 0);
    }

    /* renamed from: a */
    public static void m5785a(Context context, int i) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putInt("KEY_INTERSTITIAL_ACTION_COUNT", i).apply();
    }

    /* renamed from: a */
    public static void m5783a(final Activity activity, final View view, final UnifiedNativeAdView unifiedNativeAdView, String str, final View view2) {
        if (C1570t.m6023h(activity) && view != null && unifiedNativeAdView != null) {
            new AdLoader.Builder((Context) activity, str).forUnifiedNativeAd(new OnUnifiedNativeAdLoadedListener() {
                public void onUnifiedNativeAdLoaded(UnifiedNativeAd unifiedNativeAd) {
                    if (!activity.isFinishing()) {
                        if (C1570t.m6000b()) {
                            view2.setVisibility(0);
                        }
                        C1540d.m5849u();
                        C1533a.m5792b(activity, unifiedNativeAd, view, unifiedNativeAdView);
                    }
                }
            }).withAdListener(new AdListener() {
                public void onAdFailedToLoad(int i) {
                }

                public void onAdClicked() {
                    super.onAdClicked();
                }

                public void onAdOpened() {
                    super.onAdOpened();
                    view2.setVisibility(8);
                    C1540d.m5848t();
                }
            }).withNativeAdOptions(new NativeAdOptions.Builder().build()).build().loadAd(new Builder().build());
        }
    }

    /* renamed from: b */
    private static void m5792b(Activity activity, UnifiedNativeAd unifiedNativeAd, View view, UnifiedNativeAdView unifiedNativeAdView) {
        if (view != null && unifiedNativeAdView != null && unifiedNativeAd != null) {
            view.setVisibility(0);
            AppCompatTextView appCompatTextView = (AppCompatTextView) unifiedNativeAdView.findViewById(R.id.tv_headline);
            if (unifiedNativeAd.getHeadline() != null) {
                appCompatTextView.setText(unifiedNativeAd.getHeadline());
                unifiedNativeAdView.setHeadlineView(appCompatTextView);
            }
            if (!(unifiedNativeAd.getIcon() == null || unifiedNativeAd.getIcon().getUri() == null)) {
                AppCompatImageView appCompatImageView = (AppCompatImageView) unifiedNativeAdView.findViewById(R.id.iv_app_icon);
                appCompatImageView.setImageDrawable(unifiedNativeAd.getIcon().getDrawable());
                unifiedNativeAdView.setIconView(appCompatImageView);
            }
            if (unifiedNativeAd.getBody() != null) {
                appCompatTextView = (AppCompatTextView) unifiedNativeAdView.findViewById(R.id.tv_body);
                appCompatTextView.setText(unifiedNativeAd.getBody());
                unifiedNativeAdView.setBodyView(appCompatTextView);
            }
            MediaView mediaView = (MediaView) unifiedNativeAdView.findViewById(R.id.media_view);
            LayoutParams layoutParams = mediaView.getLayoutParams();
            layoutParams.height = (int) (((float) C1570t.m5992b(activity)) / 1.72f);
            mediaView.setLayoutParams(layoutParams);
            unifiedNativeAdView.setMediaView(mediaView);
            if (unifiedNativeAd.getCallToAction() != null) {
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) unifiedNativeAdView.findViewById(R.id.tv_cta);
                appCompatTextView2.setText(unifiedNativeAd.getCallToAction());
                unifiedNativeAdView.setCallToActionView(appCompatTextView2);
            }
            unifiedNativeAdView.setNativeAd(unifiedNativeAd);
        }
    }

    /* renamed from: e */
    public static View m5797e(Context context) {
        return LayoutInflater.from(context).inflate(R.layout.view_native_ad_container, null);
    }
}
