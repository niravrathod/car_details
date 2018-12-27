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

public final class UnifiedNativeAdView extends FrameLayout {
    /* renamed from: a */
    private final FrameLayout f7636a;
    /* renamed from: b */
    private final zzqo f7637b = m8769a();

    public UnifiedNativeAdView(Context context) {
        super(context);
        this.f7636a = m8768a(context);
    }

    public UnifiedNativeAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7636a = m8768a(context);
    }

    public UnifiedNativeAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7636a = m8768a(context);
    }

    @TargetApi(21)
    public UnifiedNativeAdView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f7636a = m8768a(context);
    }

    /* renamed from: a */
    private final void m8770a(String str, View view) {
        try {
            this.f7637b.mo2622a(str, ObjectWrapper.m26019a((Object) view));
        } catch (String str2) {
            zzaok.m10002b("Unable to call setAssetView on delegate", str2);
        }
    }

    public final void setHeadlineView(View view) {
        m8770a(UnifiedNativeAdAssetNames.ASSET_HEADLINE, view);
    }

    public final void setCallToActionView(View view) {
        m8770a(UnifiedNativeAdAssetNames.ASSET_CALL_TO_ACTION, view);
    }

    public final void setIconView(View view) {
        m8770a(UnifiedNativeAdAssetNames.ASSET_ICON, view);
    }

    public final void setBodyView(View view) {
        m8770a(UnifiedNativeAdAssetNames.ASSET_BODY, view);
    }

    public final void setAdvertiserView(View view) {
        m8770a(UnifiedNativeAdAssetNames.ASSET_ADVERTISER, view);
    }

    public final void setStoreView(View view) {
        m8770a(UnifiedNativeAdAssetNames.ASSET_STORE, view);
    }

    public final void setClickConfirmingView(View view) {
        try {
            this.f7637b.mo2623b(ObjectWrapper.m26019a((Object) view));
        } catch (View view2) {
            zzaok.m10002b("Unable to call setClickConfirmingView on delegate", view2);
        }
    }

    public final void setPriceView(View view) {
        m8770a(UnifiedNativeAdAssetNames.ASSET_PRICE, view);
    }

    public final void setImageView(View view) {
        m8770a(UnifiedNativeAdAssetNames.ASSET_IMAGE, view);
    }

    public final void setStarRatingView(View view) {
        m8770a(UnifiedNativeAdAssetNames.ASSET_STAR_RATING, view);
    }

    public final void setMediaView(MediaView mediaView) {
        m8770a(UnifiedNativeAdAssetNames.ASSET_MEDIA_VIDEO, mediaView);
    }

    public final void setAdChoicesView(AdChoicesView adChoicesView) {
        m8770a(UnifiedNativeAdAssetNames.ASSET_ADCHOICES_CONTAINER_VIEW, adChoicesView);
    }

    public final void setNativeAd(UnifiedNativeAd unifiedNativeAd) {
        try {
            this.f7637b.mo2620a((IObjectWrapper) unifiedNativeAd.mo2718a());
        } catch (UnifiedNativeAd unifiedNativeAd2) {
            zzaok.m10002b("Unable to call setNativeAd on delegate", unifiedNativeAd2);
        }
    }

    /* renamed from: a */
    private final View m8767a(String str) {
        try {
            IObjectWrapper a = this.f7637b.mo2618a(str);
            if (a != null) {
                return (View) ObjectWrapper.m26020a(a);
            }
        } catch (String str2) {
            zzaok.m10002b("Unable to call getAssetView on delegate", str2);
        }
        return null;
    }

    public final View getHeadlineView() {
        return m8767a(UnifiedNativeAdAssetNames.ASSET_HEADLINE);
    }

    public final View getCallToActionView() {
        return m8767a(UnifiedNativeAdAssetNames.ASSET_CALL_TO_ACTION);
    }

    public final View getIconView() {
        return m8767a(UnifiedNativeAdAssetNames.ASSET_ICON);
    }

    public final View getBodyView() {
        return m8767a(UnifiedNativeAdAssetNames.ASSET_BODY);
    }

    public final View getStoreView() {
        return m8767a(UnifiedNativeAdAssetNames.ASSET_STORE);
    }

    public final View getPriceView() {
        return m8767a(UnifiedNativeAdAssetNames.ASSET_PRICE);
    }

    public final View getAdvertiserView() {
        return m8767a(UnifiedNativeAdAssetNames.ASSET_ADVERTISER);
    }

    public final View getImageView() {
        return m8767a(UnifiedNativeAdAssetNames.ASSET_IMAGE);
    }

    public final View getStarRatingView() {
        return m8767a(UnifiedNativeAdAssetNames.ASSET_STAR_RATING);
    }

    public final MediaView getMediaView() {
        View a = m8767a(UnifiedNativeAdAssetNames.ASSET_MEDIA_VIDEO);
        if (a instanceof MediaView) {
            return (MediaView) a;
        }
        if (a != null) {
            zzaok.m10001b("View is not an instance of MediaView");
        }
        return null;
    }

    public final AdChoicesView getAdChoicesView() {
        View a = m8767a(UnifiedNativeAdAssetNames.ASSET_ADCHOICES_CONTAINER_VIEW);
        return a instanceof AdChoicesView ? (AdChoicesView) a : null;
    }

    public final void destroy() {
        try {
            this.f7637b.mo2619a();
        } catch (Throwable e) {
            zzaok.m10002b("Unable to destroy native ad view", e);
        }
    }

    /* renamed from: a */
    private final FrameLayout m8768a(Context context) {
        View frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    /* renamed from: a */
    private final zzqo m8769a() {
        Preconditions.checkNotNull(this.f7636a, "createDelegate must be called after overlayFrame has been created");
        if (isInEditMode()) {
            return null;
        }
        return zzkd.m10710b().m10707a(this.f7636a.getContext(), (FrameLayout) this, this.f7636a);
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.f7636a);
    }

    public final void removeView(View view) {
        if (this.f7636a != view) {
            super.removeView(view);
        }
    }

    public final void removeAllViews() {
        super.removeAllViews();
        super.addView(this.f7636a);
    }

    public final void bringChildToFront(View view) {
        super.bringChildToFront(view);
        if (this.f7636a != view) {
            super.bringChildToFront(this.f7636a);
        }
    }

    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (this.f7637b != null) {
            try {
                this.f7637b.mo2621a(ObjectWrapper.m26019a((Object) view), i);
            } catch (View view2) {
                zzaok.m10002b("Unable to call onVisibilityChanged on delegate", view2);
            }
        }
    }
}
