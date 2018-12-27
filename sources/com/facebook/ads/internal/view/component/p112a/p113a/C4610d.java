package com.facebook.ads.internal.view.component.p112a.p113a;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.internal.adapters.p082a.C1727d;
import com.facebook.ads.internal.p101q.p102a.C1936w;
import com.facebook.ads.internal.view.component.p112a.C2011d;
import com.facebook.ads.internal.view.p110c.p111a.C3840a;

/* renamed from: com.facebook.ads.internal.view.component.a.a.d */
public class C4610d extends C3849b {
    /* renamed from: c */
    private static final int f19154c = ((int) (C1936w.f5934b * 20.0f));
    /* renamed from: d */
    private static final int f19155d = ((int) (C1936w.f5934b * 16.0f));

    C4610d(C2011d c2011d, C1727d c1727d, String str, C3840a c3840a) {
        super(c2011d, c1727d, false, str, c3840a);
    }

    /* renamed from: a */
    protected void mo3980a(Context context) {
        View titleDescContainer = getTitleDescContainer();
        titleDescContainer.setAlignment(3);
        titleDescContainer.setLayoutParams(new LayoutParams(-1, -2));
        titleDescContainer.setPadding(0, 0, 0, f19154c);
        getCtaButton().setLayoutParams(new LayoutParams(-1, -2));
        View linearLayout = new LinearLayout(context);
        C1936w.m7329a(linearLayout, new ColorDrawable(-1));
        ViewGroup.LayoutParams layoutParams = new LayoutParams(-1, -2);
        layoutParams.addRule(3, getMediaContainer().getId());
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(f19155d, f19155d, f19155d, f19155d);
        linearLayout.addView(titleDescContainer);
        linearLayout.addView(getCtaButton());
        addView(getMediaContainer());
        addView(linearLayout);
    }

    /* renamed from: i */
    protected boolean mo3982i() {
        return false;
    }
}
