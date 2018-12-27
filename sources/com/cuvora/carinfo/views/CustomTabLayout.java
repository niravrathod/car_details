package com.cuvora.carinfo.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.support.design.widget.TabLayout;
import android.support.design.widget.TabLayout.C0181e;
import android.util.AttributeSet;
import com.cuvora.carinfo.R;

public class CustomTabLayout extends TabLayout {
    public CustomTabLayout(Context context) {
        super(context);
    }

    public CustomTabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CustomTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: b */
    public C0181e mo1263b() {
        C0181e b = super.mo1263b();
        b.m611a((int) R.layout.custom_tab);
        return b;
    }

    public ColorStateList getTabTextColors() {
        return getResources().getColorStateList(R.color.tab_color_state);
    }
}
