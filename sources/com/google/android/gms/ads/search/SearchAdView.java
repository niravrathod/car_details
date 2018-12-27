package com.google.android.gms.ads.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.internal.ads.zzaer;
import com.google.android.gms.internal.ads.zzaok;
import com.google.android.gms.internal.ads.zzmi;

@zzaer
public final class SearchAdView extends ViewGroup {
    /* renamed from: a */
    private final zzmi f7859a;

    public SearchAdView(Context context) {
        super(context);
        this.f7859a = new zzmi(this);
    }

    public SearchAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7859a = new zzmi(this, attributeSet, false);
    }

    public SearchAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7859a = new zzmi(this, attributeSet, 0);
    }

    public final void destroy() {
        this.f7859a.m10809a();
    }

    public final AdListener getAdListener() {
        return this.f7859a.m10821b();
    }

    public final AdSize getAdSize() {
        return this.f7859a.m10823c();
    }

    public final String getAdUnitId() {
        return this.f7859a.m10825e();
    }

    public final void loadAd(SearchAdRequest searchAdRequest) {
        this.f7859a.m10816a(searchAdRequest.m8823a());
    }

    public final void loadAd(DynamicHeightSearchAdRequest dynamicHeightSearchAdRequest) {
        if (AdSize.SEARCH.equals(getAdSize())) {
            this.f7859a.m10816a(dynamicHeightSearchAdRequest.m8820a());
            return;
        }
        throw new IllegalStateException("You must use AdSize.SEARCH for a DynamicHeightSearchAdRequest");
    }

    public final void pause() {
        this.f7859a.m10828h();
    }

    public final void resume() {
        this.f7859a.m10830j();
    }

    public final void setAdListener(AdListener adListener) {
        this.f7859a.m10810a(adListener);
    }

    public final void setAdSize(AdSize adSize) {
        this.f7859a.m10819a(adSize);
    }

    public final void setAdUnitId(String str) {
        this.f7859a.m10817a(str);
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
