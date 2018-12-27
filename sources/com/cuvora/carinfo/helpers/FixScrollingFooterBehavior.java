package com.cuvora.carinfo.helpers;

import android.content.Context;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.AppBarLayout.ScrollingViewBehavior;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;

public class FixScrollingFooterBehavior extends ScrollingViewBehavior {
    /* renamed from: c */
    private AppBarLayout f21548c;

    /* renamed from: a */
    public boolean mo4588a(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        return true;
    }

    public FixScrollingFooterBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: b */
    public boolean mo125b(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (this.f21548c == null) {
            this.f21548c = (AppBarLayout) view2;
        }
        coordinatorLayout = super.mo125b(coordinatorLayout, view, view2);
        view2 = m28833a(this.f21548c);
        Object obj = view2 != view.getPaddingBottom() ? 1 : null;
        if (obj != null) {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view2);
            view.requestLayout();
        }
        if (obj == null && coordinatorLayout == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private int m28833a(AppBarLayout appBarLayout) {
        return appBarLayout.getTotalScrollRange() + appBarLayout.getTop();
    }
}
