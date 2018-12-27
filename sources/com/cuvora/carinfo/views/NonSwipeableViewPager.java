package com.cuvora.carinfo.views;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class NonSwipeableViewPager extends ViewPager {
    /* renamed from: d */
    private boolean f15010d = true;

    public NonSwipeableViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f15010d ? super.onTouchEvent(motionEvent) : null;
    }

    public void setCurrentItem(int i, boolean z) {
        super.setCurrentItem(i, false);
    }

    public void setCurrentItem(int i) {
        super.setCurrentItem(i, false);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f15010d ? super.onInterceptTouchEvent(motionEvent) : null;
    }
}
