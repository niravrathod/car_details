package com.facebook.ads;

import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;
import com.facebook.ads.internal.p101q.p102a.C1936w;

public class NativeAdScrollView extends LinearLayout {
    /* renamed from: a */
    private final C3753a f5113a;

    /* renamed from: com.facebook.ads.NativeAdScrollView$a */
    private class C3753a extends ViewPager {
        protected void onMeasure(int i, int i2) {
            int i3 = 0;
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                childAt.measure(i, MeasureSpec.makeMeasureSpec(0, 0));
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredHeight > i3) {
                    i3 = measuredHeight;
                }
            }
            super.onMeasure(i, MeasureSpec.makeMeasureSpec(i3, 1073741824));
        }
    }

    public void setInset(int i) {
        if (i > 0) {
            float f = C1936w.f5934b;
            int round = Math.round(((float) i) * f);
            this.f5113a.setPadding(round, 0, round, 0);
            this.f5113a.setPageMargin(Math.round(((float) (i / 2)) * f));
            this.f5113a.setClipToPadding(false);
        }
    }
}
