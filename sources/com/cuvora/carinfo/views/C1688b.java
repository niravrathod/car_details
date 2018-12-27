package com.cuvora.carinfo.views;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.cuvora.carinfo.R;
import com.cuvora.carinfo.helpers.C1533a;
import com.cuvora.carinfo.helpers.C1570t;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.formats.UnifiedNativeAdView;

/* renamed from: com.cuvora.carinfo.views.b */
public class C1688b {

    /* renamed from: com.cuvora.carinfo.views.b$a */
    public interface C1687a {
        /* renamed from: a */
        void mo1270a();

        /* renamed from: b */
        void mo1271b();
    }

    /* renamed from: a */
    public static View m6367a(Activity activity, AdView adView, String str, View view, View view2, UnifiedNativeAdView unifiedNativeAdView) {
        View inflate = LayoutInflater.from(activity).inflate(R.layout.view_smartad_on_card, null, false);
        final LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.ll_smart_ad);
        final AdView adView2 = adView;
        final Activity activity2 = activity;
        final String str2 = str;
        final View view3 = view;
        final View view4 = view2;
        final UnifiedNativeAdView unifiedNativeAdView2 = unifiedNativeAdView;
        C1688b.m6370a(adView, activity, new C1687a() {
            /* renamed from: a */
            public void mo1270a() {
                linearLayout.removeAllViews();
                linearLayout.addView(adView2);
            }

            /* renamed from: b */
            public void mo1271b() {
                linearLayout.removeAllViews();
                linearLayout.addView(C1688b.m6372b(activity2, str2, view3, view4, unifiedNativeAdView2));
            }
        });
        return inflate;
    }

    /* renamed from: b */
    public static View m6371b(Activity activity, AdView adView, String str, View view, View view2, UnifiedNativeAdView unifiedNativeAdView) {
        View inflate = LayoutInflater.from(activity).inflate(R.layout.view_smart_ad, null, false);
        final LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.ll_smart_ad);
        final AdView adView2 = adView;
        final Activity activity2 = activity;
        final String str2 = str;
        final View view3 = view;
        final View view4 = view2;
        final UnifiedNativeAdView unifiedNativeAdView2 = unifiedNativeAdView;
        C1688b.m6370a(adView, activity, new C1687a() {
            /* renamed from: a */
            public void mo1270a() {
                linearLayout.removeAllViews();
                linearLayout.addView(adView2);
            }

            /* renamed from: b */
            public void mo1271b() {
                linearLayout.removeAllViews();
                linearLayout.addView(C1688b.m6372b(activity2, str2, view3, view4, unifiedNativeAdView2));
            }
        });
        return inflate;
    }

    /* renamed from: a */
    public static AdView m6369a(Activity activity, String str) {
        AdView adView = new AdView(activity);
        adView.setAdSize(AdSize.MEDIUM_RECTANGLE);
        adView.setAdUnitId(str);
        return adView;
    }

    /* renamed from: b */
    private static View m6372b(Activity activity, String str, View view, View view2, UnifiedNativeAdView unifiedNativeAdView) {
        C1533a.m5783a(activity, view2, unifiedNativeAdView, str, view);
        return view2;
    }

    /* renamed from: a */
    public static void m6370a(AdView adView, Context context, final C1687a c1687a) {
        if (C1570t.m6023h(context) != null && adView != null) {
            context = new Builder().build();
            adView.setAdListener(new AdListener() {
                public void onAdFailedToLoad(int i) {
                    super.onAdFailedToLoad(i);
                    c1687a.mo1271b();
                }

                public void onAdLoaded() {
                    super.onAdLoaded();
                    c1687a.mo1270a();
                }
            });
            adView.loadAd(context);
        }
    }
}
