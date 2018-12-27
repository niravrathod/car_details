package android.support.v7.widget;

import android.content.Context;
import android.support.v4.view.C0560r;
import android.support.v7.p020a.C0637a.C0632f;
import android.support.v7.p020a.C0637a.C0636j;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

public class ButtonBarLayout extends LinearLayout {
    /* renamed from: a */
    private boolean f2396a;
    /* renamed from: b */
    private int f2397b = -1;
    /* renamed from: c */
    private int f2398c = 0;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context = context.obtainStyledAttributes(attributeSet, C0636j.ButtonBarLayout);
        this.f2396a = context.getBoolean(C0636j.ButtonBarLayout_allowStacking, true);
        context.recycle();
    }

    public void setAllowStacking(boolean z) {
        if (this.f2396a != z) {
            this.f2396a = z;
            if (!this.f2396a && getOrientation()) {
                setStacked(false);
            }
            requestLayout();
        }
    }

    protected void onMeasure(int i, int i2) {
        Object obj;
        int size = MeasureSpec.getSize(i);
        int i3 = 0;
        if (this.f2396a) {
            if (size > this.f2397b && m2889a()) {
                setStacked(false);
            }
            this.f2397b = size;
        }
        if (m2889a() || MeasureSpec.getMode(i) != 1073741824) {
            size = i;
            obj = null;
        } else {
            size = MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            obj = 1;
        }
        super.onMeasure(size, i2);
        if (this.f2396a && !m2889a()) {
            if (((getMeasuredWidthAndState() & -16777216) == 16777216 ? 1 : null) != null) {
                setStacked(true);
                obj = 1;
            }
        }
        if (obj != null) {
            super.onMeasure(i, i2);
        }
        i = m2888a(0);
        if (i >= 0) {
            i2 = getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) i2.getLayoutParams();
            int paddingTop = (((getPaddingTop() + i2.getMeasuredHeight()) + layoutParams.topMargin) + layoutParams.bottomMargin) + 0;
            if (m2889a() != 0) {
                i = m2888a(i + 1);
                if (i >= 0) {
                    paddingTop += getChildAt(i).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 1098907648));
                }
                i3 = paddingTop;
            } else {
                i3 = paddingTop + getPaddingBottom();
            }
        }
        if (C0560r.m2198j(this) != i3) {
            setMinimumHeight(i3);
        }
    }

    /* renamed from: a */
    private int m2888a(int i) {
        int childCount = getChildCount();
        while (i < childCount) {
            if (getChildAt(i).getVisibility() == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public int getMinimumHeight() {
        return Math.max(this.f2398c, super.getMinimumHeight());
    }

    private void setStacked(boolean z) {
        setOrientation(z);
        setGravity(z ? 5 : 80);
        View findViewById = findViewById(C0632f.spacer);
        if (findViewById != null) {
            findViewById.setVisibility(z ? true : true);
        }
        for (z = getChildCount() - 2; z < false; z--) {
            bringChildToFront(getChildAt(z));
        }
    }

    /* renamed from: a */
    private boolean m2889a() {
        return getOrientation() == 1;
    }
}
