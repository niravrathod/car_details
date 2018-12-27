package com.facebook.ads.internal.view.component.p112a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.internal.p101q.p102a.C1936w;
import com.facebook.ads.internal.view.component.C2018f;
import com.facebook.ads.internal.view.component.C2020h;

/* renamed from: com.facebook.ads.internal.view.component.a.f */
final class C2012f extends RelativeLayout {
    /* renamed from: a */
    private final View f6214a;
    /* renamed from: b */
    private final C2018f f6215b;

    public C2012f(Context context, View view) {
        super(context);
        this.f6214a = view;
        this.f6215b = new C2018f(context);
        C1936w.m7327a(this.f6215b);
    }

    /* renamed from: a */
    public void m7570a(int i) {
        this.f6214a.setLayoutParams(new LayoutParams(-1, i));
    }

    /* renamed from: a */
    public void m7571a(View view, View view2, C2020h c2020h, boolean z) {
        ViewGroup.LayoutParams layoutParams;
        this.f6215b.addView(this.f6214a, new LayoutParams(-1, -2));
        if (view2 != null) {
            layoutParams = new LayoutParams(C2007b.f6186b, C2007b.f6186b);
            layoutParams.addRule(6, this.f6214a.getId());
            layoutParams.addRule(7, this.f6214a.getId());
            layoutParams.setMargins(C2007b.f6185a, C2007b.f6185a, C2007b.f6185a, C2007b.f6185a);
            this.f6215b.addView(view2, layoutParams);
        }
        view2 = new LinearLayout(getContext());
        view2.setOrientation(1);
        layoutParams = new LayoutParams(-1, -2);
        layoutParams.addRule(8, this.f6214a.getId());
        if (c2020h != null) {
            ViewGroup.LayoutParams layoutParams2;
            if (z) {
                layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                c2020h.setAlignment(3);
                layoutParams2.setMargins(C2007b.f6185a / 2, C2007b.f6185a / 2, C2007b.f6185a / 2, C2007b.f6185a / 2);
                view2.addView(c2020h, layoutParams2);
                Drawable gradientDrawable = new GradientDrawable(Orientation.BOTTOM_TOP, new int[]{-1778384896, 0});
                gradientDrawable.setCornerRadius(0.0f);
                gradientDrawable.setGradientType(0);
                C1936w.m7329a(view2, gradientDrawable);
            } else {
                layoutParams2 = new LayoutParams(-1, -2);
                layoutParams2.addRule(3, this.f6215b.getId());
                layoutParams2.setMargins(0, C2007b.f6185a, 0, 0);
                c2020h.setAlignment(17);
                addView(c2020h, layoutParams2);
            }
        }
        if (view != null) {
            view2.addView(view, new LayoutParams(-1, -2));
        }
        this.f6215b.addView(view2, layoutParams);
        addView(this.f6215b, new LayoutParams(-1, -2));
    }
}
