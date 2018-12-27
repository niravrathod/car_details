package com.facebook.ads.internal.view.component.p112a.p113a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.adapters.p082a.C1727d;
import com.facebook.ads.internal.p101q.p102a.C1936w;
import com.facebook.ads.internal.view.component.p112a.C2011d;
import com.facebook.ads.internal.view.p110c.p111a.C3840a;

/* renamed from: com.facebook.ads.internal.view.component.a.a.a */
public class C4604a extends C3849b {
    /* renamed from: c */
    private static final int f19148c = ((int) (C1936w.f5934b * 12.0f));

    C4604a(C2011d c2011d, C1727d c1727d, String str, C3840a c3840a) {
        super(c2011d, c1727d, true, str, c3840a);
    }

    /* renamed from: a */
    protected void mo3980a(Context context) {
        View titleDescContainer = getTitleDescContainer();
        titleDescContainer.setAlignment(3);
        LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(8, getMediaContainer().getId());
        titleDescContainer.setLayoutParams(layoutParams);
        titleDescContainer.setPadding(f19148c, f19148c, f19148c, f19148c);
        Drawable gradientDrawable = new GradientDrawable(Orientation.TOP_BOTTOM, new int[]{0, -15658735});
        gradientDrawable.setCornerRadius(0.0f);
        C1936w.m7329a(titleDescContainer, gradientDrawable);
        layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(3, getMediaContainer().getId());
        getCtaButton().setLayoutParams(layoutParams);
        addView(getMediaContainer());
        addView(titleDescContainer);
        addView(getCtaButton());
    }

    /* renamed from: b */
    protected boolean mo3981b() {
        return false;
    }

    /* renamed from: c */
    protected boolean mo1434c() {
        return false;
    }
}
