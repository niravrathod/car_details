package com.facebook.ads.internal.view.component.p112a;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.adapters.p082a.C1727d;
import com.facebook.ads.internal.p101q.p102a.C1936w;

/* renamed from: com.facebook.ads.internal.view.component.a.a */
public class C3850a extends C2007b {
    public C3850a(C2011d c2011d, C1727d c1727d, boolean z) {
        super(c2011d, c1727d, true);
        View relativeLayout = new RelativeLayout(c2011d.m7559a());
        LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        Drawable gradientDrawable = new GradientDrawable(Orientation.BOTTOM_TOP, new int[]{-1778384896, 0});
        gradientDrawable.setCornerRadius(0.0f);
        gradientDrawable.setGradientType(0);
        C1936w.m7329a(relativeLayout, gradientDrawable);
        View linearLayout = new LinearLayout(c2011d.m7559a());
        linearLayout.setOrientation(z ^ 1);
        linearLayout.setGravity(80);
        C1936w.m7327a(linearLayout);
        LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(a, 0, a, c2011d.m7566h() == null ? a : a / 2);
        LayoutParams layoutParams3 = new LinearLayout.LayoutParams(z ? -2 : -1, -2);
        layoutParams3.setMargins(z ? a : 0, z ? 0 : a, 0, 0);
        LayoutParams layoutParams4 = new LinearLayout.LayoutParams(z ? 0 : -1, -2);
        layoutParams4.setMargins(0, 0, 0, 0);
        layoutParams4.weight = 1.0f;
        linearLayout.addView(getTitleDescContainer(), layoutParams4);
        linearLayout.addView(getCtaButton(), layoutParams3);
        relativeLayout.addView(linearLayout, layoutParams2);
        if (c2011d.m7566h() != null) {
            LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams5.setMargins(0, 0, 0, 0);
            layoutParams5.addRule(3, linearLayout.getId());
            relativeLayout.addView(c2011d.m7566h(), layoutParams5);
        }
        addView(c2011d.m7562d(), new RelativeLayout.LayoutParams(-1, -1));
        addView(relativeLayout, layoutParams);
        if (c2011d.m7567i() != null) {
            LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(b, b);
            layoutParams6.addRule(10);
            layoutParams6.addRule(11);
            layoutParams6.setMargins(a, a + c2011d.m7568j(), a, a);
            addView(c2011d.m7567i(), layoutParams6);
        }
    }

    /* renamed from: a */
    public boolean mo1433a() {
        return true;
    }
}
