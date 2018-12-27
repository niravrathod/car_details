package com.cuvora.carinfo.videomodule.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import com.cuvora.carinfo.videomodule.utils.C1618a;
import com.feedbox.C2109c;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import kotlin.C2864b;
import kotlin.jvm.internal.C2885g;
import kotlin.jvm.p154a.C2877a;

public final class BannerAdView extends LifecycleAwareView {
    /* renamed from: a */
    private C1609a f18963a;
    /* renamed from: b */
    private AdView f18964b;

    /* renamed from: com.cuvora.carinfo.videomodule.ui.view.BannerAdView$a */
    public interface C1609a {
        /* renamed from: d */
        String mo4646d();
    }

    /* renamed from: com.cuvora.carinfo.videomodule.ui.view.BannerAdView$b */
    public static final class C3731b extends AdListener {
        /* renamed from: a */
        final /* synthetic */ BannerAdView f14970a;

        C3731b(BannerAdView bannerAdView) {
            this.f14970a = bannerAdView;
        }

        public void onAdLoaded() {
            BannerAdView.m25219a(this.f14970a).setVisibility(0);
        }
    }

    public BannerAdView(Context context, AttributeSet attributeSet) {
        C2885g.m13910b(context, "context");
        super(context, attributeSet);
    }

    /* renamed from: a */
    public static final /* synthetic */ AdView m25219a(BannerAdView bannerAdView) {
        bannerAdView = bannerAdView.f18964b;
        if (bannerAdView == null) {
            C2885g.m13911b("adView");
        }
        return bannerAdView;
    }

    /* renamed from: a */
    public final void m25222a(C1609a c1609a) {
        C2885g.m13910b(c1609a, "callbacks");
        this.f18963a = c1609a;
        if (C2109c.f6446a.m7674a().m7656c()) {
            this.f18964b = new AdView(getContext());
            LayoutParams layoutParams = new LayoutParams(-2, -2);
            AdView adView = this.f18964b;
            if (adView == null) {
                C2885g.m13911b("adView");
            }
            adView.setLayoutParams(layoutParams);
            AdView adView2 = this.f18964b;
            if (adView2 == null) {
                C2885g.m13911b("adView");
            }
            adView2.setAdSize(AdSize.SMART_BANNER);
            adView2 = this.f18964b;
            if (adView2 == null) {
                C2885g.m13911b("adView");
            }
            adView2.setAdUnitId(c1609a.mo4646d());
            c1609a = this.f18964b;
            if (c1609a == null) {
                C2885g.m13911b("adView");
            }
            addView((View) c1609a);
            c1609a = this.f18964b;
            if (c1609a == null) {
                C2885g.m13911b("adView");
            }
            c1609a.setVisibility(8);
            c1609a = C1618a.f4866a;
            adView2 = this.f18964b;
            if (adView2 == null) {
                C2885g.m13911b("adView");
            }
            c1609a.m6192a(adView2);
            c1609a = this.f18964b;
            if (c1609a == null) {
                C2885g.m13911b("adView");
            }
            c1609a.setAdListener(new C3731b(this));
        }
    }

    /* renamed from: a */
    public void mo3932a() {
        m25220a((C2877a) new BannerAdView$onPause$1(this));
        super.mo3932a();
    }

    /* renamed from: b */
    public void mo3933b() {
        super.mo3933b();
        m25220a((C2877a) new BannerAdView$onResume$1(this));
    }

    /* renamed from: c */
    public void mo3934c() {
        m25220a((C2877a) new BannerAdView$onDestroy$1(this));
        super.mo3934c();
    }

    /* renamed from: a */
    private final void m25220a(C2877a<C2864b> c2877a) {
        if (this.f18964b != null) {
            c2877a.mo3923a();
        }
    }
}
