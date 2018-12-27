package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.internal.ads.zzaok;
import com.google.android.gms.internal.ads.zzjc;
import com.google.android.gms.internal.ads.zzmi;

class BaseAdView extends ViewGroup {
    /* renamed from: a */
    protected final zzmi f7600a;

    public BaseAdView(Context context, int i) {
        super(context);
        this.f7600a = new zzmi(this, i);
    }

    public BaseAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.f7600a = new zzmi(this, attributeSet, false, i);
    }

    public BaseAdView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.f7600a = new zzmi(this, attributeSet, 0, i2);
    }

    public void destroy() {
        this.f7600a.m10809a();
    }

    public AdListener getAdListener() {
        return this.f7600a.m10821b();
    }

    public AdSize getAdSize() {
        return this.f7600a.m10823c();
    }

    public String getAdUnitId() {
        return this.f7600a.m10825e();
    }

    public void loadAd(AdRequest adRequest) {
        this.f7600a.m10816a(adRequest.zzay());
    }

    public void pause() {
        this.f7600a.m10828h();
    }

    public void resume() {
        this.f7600a.m10830j();
    }

    public boolean isLoading() {
        return this.f7600a.m10832l();
    }

    public void setAdListener(AdListener adListener) {
        this.f7600a.m10810a(adListener);
        if (adListener == null) {
            this.f7600a.m10815a(null);
            this.f7600a.m10813a(null);
            return;
        }
        if (adListener instanceof zzjc) {
            this.f7600a.m10815a((zzjc) adListener);
        }
        if (adListener instanceof AppEventListener) {
            this.f7600a.m10813a((AppEventListener) adListener);
        }
    }

    public void setAdSize(AdSize adSize) {
        this.f7600a.m10819a(adSize);
    }

    public void setAdUnitId(String str) {
        this.f7600a.m10817a(str);
    }

    public String getMediationAdapterClassName() {
        return this.f7600a.m10831k();
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        z = getChildAt(false);
        if (z && z.getVisibility() != 8) {
            int measuredWidth = z.getMeasuredWidth();
            int measuredHeight = z.getMeasuredHeight();
            i3 = ((i3 - i) - measuredWidth) / 2;
            i4 = ((i4 - i2) - measuredHeight) / 2;
            z.layout(i3, i4, measuredWidth + i3, measuredHeight + i4);
        }
    }

    protected void onMeasure(int i, int i2) {
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
