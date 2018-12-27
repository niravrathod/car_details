package com.facebook.ads.internal.view.component.p112a;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.adapters.p082a.C1727d;
import com.facebook.ads.internal.adapters.p082a.C1731h;

/* renamed from: com.facebook.ads.internal.view.component.a.e */
public class C3851e extends C2007b {
    /* renamed from: c */
    private static final int f15375c = Resources.getSystem().getDisplayMetrics().widthPixels;
    /* renamed from: d */
    private final C2012f f15376d;

    public C3851e(C2011d c2011d, boolean z, C1727d c1727d) {
        super(c2011d, c1727d, z);
        this.f15376d = new C2012f(c2011d.m7559a(), c2011d.m7562d());
        this.f15376d.m7571a(c2011d.m7566h(), c2011d.m7567i(), getTitleDescContainer(), z);
        LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        layoutParams.setMargins(a, a, a, a);
        getCtaButton().setLayoutParams(layoutParams);
        View frameLayout = new FrameLayout(c2011d.m7559a());
        LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(2, getCtaButton().getId());
        frameLayout.setLayoutParams(layoutParams2);
        layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 17;
        layoutParams2.setMargins(a, 0, a, 0);
        frameLayout.addView(this.f15376d, layoutParams2);
        addView(frameLayout);
        addView(getCtaButton());
    }

    /* renamed from: a */
    public void mo1435a(C1731h c1731h, String str, double d) {
        super.mo1435a(c1731h, str, d);
        if (d > 0.0d) {
            double d2 = (double) (f15375c - (a * 2));
            Double.isNaN(d2);
            this.f15376d.m7570a((int) (d2 / d));
        }
    }

    /* renamed from: a */
    public boolean mo1433a() {
        return false;
    }

    /* renamed from: c */
    protected boolean mo1434c() {
        return false;
    }

    /* renamed from: j */
    protected boolean mo1436j() {
        return false;
    }
}
