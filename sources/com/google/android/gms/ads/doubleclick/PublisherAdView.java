package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.Correlator;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzaok;
import com.google.android.gms.internal.ads.zzku;
import com.google.android.gms.internal.ads.zzmi;

public final class PublisherAdView extends ViewGroup {
    /* renamed from: a */
    private final zzmi f7616a;

    public PublisherAdView(Context context) {
        super(context);
        this.f7616a = new zzmi(this);
    }

    public PublisherAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7616a = new zzmi(this, attributeSet, true);
        Preconditions.checkNotNull(context, "Context cannot be null");
    }

    public PublisherAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7616a = new zzmi(this, attributeSet, 1);
    }

    public final VideoController getVideoController() {
        return this.f7616a.m10833m();
    }

    public final void setVideoOptions(VideoOptions videoOptions) {
        this.f7616a.m10812a(videoOptions);
    }

    public final VideoOptions getVideoOptions() {
        return this.f7616a.m10835o();
    }

    public final void destroy() {
        this.f7616a.m10809a();
    }

    public final AdListener getAdListener() {
        return this.f7616a.m10821b();
    }

    public final AdSize getAdSize() {
        return this.f7616a.m10823c();
    }

    public final AdSize[] getAdSizes() {
        return this.f7616a.m10824d();
    }

    public final String getAdUnitId() {
        return this.f7616a.m10825e();
    }

    public final AppEventListener getAppEventListener() {
        return this.f7616a.m10826f();
    }

    public final OnCustomRenderedAdLoadedListener getOnCustomRenderedAdLoadedListener() {
        return this.f7616a.m10827g();
    }

    public final void loadAd(PublisherAdRequest publisherAdRequest) {
        this.f7616a.m10816a(publisherAdRequest.zzay());
    }

    public final void pause() {
        this.f7616a.m10828h();
    }

    public final void setManualImpressionsEnabled(boolean z) {
        this.f7616a.m10818a(z);
    }

    public final void recordManualImpression() {
        this.f7616a.m10829i();
    }

    public final void resume() {
        this.f7616a.m10830j();
    }

    public final void setAdListener(AdListener adListener) {
        this.f7616a.m10810a(adListener);
    }

    public final void setAdSizes(AdSize... adSizeArr) {
        if (adSizeArr == null || adSizeArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.f7616a.m10822b(adSizeArr);
    }

    public final void setAdUnitId(String str) {
        this.f7616a.m10817a(str);
    }

    public final void setAppEventListener(AppEventListener appEventListener) {
        this.f7616a.m10813a(appEventListener);
    }

    public final void setCorrelator(Correlator correlator) {
        this.f7616a.m10811a(correlator);
    }

    public final void setOnCustomRenderedAdLoadedListener(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        this.f7616a.m10814a(onCustomRenderedAdLoadedListener);
    }

    public final String getMediationAdapterClassName() {
        return this.f7616a.m10831k();
    }

    public final boolean isLoading() {
        return this.f7616a.m10832l();
    }

    public final boolean zza(zzku zzku) {
        return this.f7616a.m10820a(zzku);
    }

    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        z = getChildAt(false);
        if (z && z.getVisibility() != 8) {
            int measuredWidth = z.getMeasuredWidth();
            int measuredHeight = z.getMeasuredHeight();
            i3 = ((i3 - i) - measuredWidth) / 2;
            i4 = ((i4 - i2) - measuredHeight) / 2;
            z.layout(i3, i4, measuredWidth + i3, measuredHeight + i4);
        }
    }

    protected final void onMeasure(int i, int i2) {
        int heightInPixels;
        int i3 = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            AdSize adSize = null;
            try {
                adSize = getAdSize();
            } catch (Throwable e) {
                zzaok.m10002b("Unable to retrieve ad size.", e);
            }
            if (adSize != null) {
                Context context = getContext();
                int widthInPixels = adSize.getWidthInPixels(context);
                heightInPixels = adSize.getHeightInPixels(context);
                i3 = widthInPixels;
            } else {
                heightInPixels = 0;
            }
        } else {
            measureChild(childAt, i, i2);
            i3 = childAt.getMeasuredWidth();
            heightInPixels = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(i3, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(heightInPixels, getSuggestedMinimumHeight()), i2));
    }
}
