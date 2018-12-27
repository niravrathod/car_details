package com.google.android.gms.ads.formats;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaok;
import com.google.android.gms.internal.ads.zzkd;
import com.google.android.gms.internal.ads.zzqo;

@Deprecated
public class NativeAdView extends FrameLayout {
    /* renamed from: a */
    private final FrameLayout f7630a;
    /* renamed from: b */
    private final zzqo f7631b = m8759a();

    public NativeAdView(Context context) {
        super(context);
        this.f7630a = m8758a(context);
    }

    public NativeAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7630a = m8758a(context);
    }

    public NativeAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7630a = m8758a(context);
    }

    @TargetApi(21)
    public NativeAdView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f7630a = m8758a(context);
    }

    public void setAdChoicesView(AdChoicesView adChoicesView) {
        m8761a(NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW, adChoicesView);
    }

    public AdChoicesView getAdChoicesView() {
        View a = m8760a(NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW);
        return a instanceof AdChoicesView ? (AdChoicesView) a : null;
    }

    /* renamed from: a */
    protected final void m8761a(String str, View view) {
        try {
            this.f7631b.mo2622a(str, ObjectWrapper.m26019a((Object) view));
        } catch (String str2) {
            zzaok.m10002b("Unable to call setAssetView on delegate", str2);
        }
    }

    /* renamed from: a */
    protected final View m8760a(String str) {
        try {
            IObjectWrapper a = this.f7631b.mo2618a(str);
            if (a != null) {
                return (View) ObjectWrapper.m26020a(a);
            }
        } catch (String str2) {
            zzaok.m10002b("Unable to call getAssetView on delegate", str2);
        }
        return null;
    }

    public void setNativeAd(NativeAd nativeAd) {
        try {
            this.f7631b.mo2620a((IObjectWrapper) nativeAd.mo4274a());
        } catch (NativeAd nativeAd2) {
            zzaok.m10002b("Unable to call setNativeAd on delegate", nativeAd2);
        }
    }

    public void destroy() {
        try {
            this.f7631b.mo2619a();
        } catch (Throwable e) {
            zzaok.m10002b("Unable to destroy native ad view", e);
        }
    }

    /* renamed from: a */
    private final FrameLayout m8758a(Context context) {
        View frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    /* renamed from: a */
    private final zzqo m8759a() {
        Preconditions.checkNotNull(this.f7630a, "createDelegate must be called after mOverlayFrame has been created");
        if (isInEditMode()) {
            return null;
        }
        return zzkd.m10710b().m10707a(this.f7630a.getContext(), (FrameLayout) this, this.f7630a);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.f7630a);
    }

    public void removeView(View view) {
        if (this.f7630a != view) {
            super.removeView(view);
        }
    }

    public void removeAllViews() {
        super.removeAllViews();
        super.addView(this.f7630a);
    }

    public void bringChildToFront(View view) {
        super.bringChildToFront(view);
        if (this.f7630a != view) {
            super.bringChildToFront(this.f7630a);
        }
    }

    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (this.f7631b != null) {
            try {
                this.f7631b.mo2621a(ObjectWrapper.m26019a((Object) view), i);
            } catch (View view2) {
                zzaok.m10002b("Unable to call onVisibilityChanged on delegate", view2);
            }
        }
    }
}
