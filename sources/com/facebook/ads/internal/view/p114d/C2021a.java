package com.facebook.ads.internal.view.p114d;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.facebook.ads.internal.adapters.p082a.C1736k;
import com.facebook.ads.internal.p101q.p102a.C1936w;
import com.facebook.ads.internal.view.component.C2017e;
import com.facebook.ads.internal.view.component.C2020h;
import com.facebook.ads.internal.view.p109b.C1991d;

/* renamed from: com.facebook.ads.internal.view.d.a */
public class C2021a extends RelativeLayout {
    /* renamed from: a */
    private static final int f6250a = ((int) (C1936w.f5934b * 72.0f));
    /* renamed from: b */
    private static final int f6251b = ((int) (C1936w.f5934b * 16.0f));
    /* renamed from: c */
    private static final LayoutParams f6252c = new LayoutParams(-1, -1);
    /* renamed from: d */
    private final C1736k f6253d;

    public C2021a(Context context, C1736k c1736k) {
        super(context);
        this.f6253d = c1736k;
        m7581a();
    }

    /* renamed from: a */
    private void m7581a() {
        View linearLayout = new LinearLayout(getContext());
        linearLayout.setGravity(17);
        linearLayout.setOrientation(1);
        ImageView c2017e = new C2017e(getContext());
        C1936w.m7328a((View) c2017e, 0);
        c2017e.setRadius(50);
        new C1991d(c2017e).m7499a().m7503a(this.f6253d.m6574a().m6564b());
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(f6250a, f6250a);
        View c2020h = new C2020h(getContext(), this.f6253d.m6580d().m6481a(), true, false, true);
        c2020h.m7580a(this.f6253d.m6577b().m6520a(), this.f6253d.m6577b().m6521b(), false, true);
        c2020h.setAlignment(17);
        ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(0, f6251b, 0, f6251b);
        View textView = new TextView(getContext());
        textView.setTextColor(-1);
        C1936w.m7330a(textView, false, 16);
        textView.setText(this.f6253d.m6581e().m6512j().m6569c());
        textView.setPadding(f6251b, f6251b / 2, f6251b, f6251b / 2);
        ViewGroup.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.setMargins(0, f6251b / 2, 0, 0);
        Drawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(100.0f);
        gradientDrawable.setColor(469762047);
        C1936w.m7329a(textView, gradientDrawable);
        linearLayout.addView(c2017e, layoutParams);
        linearLayout.addView(c2020h, layoutParams2);
        linearLayout.addView(textView, layoutParams3);
        C1936w.m7328a((View) this, -14473425);
        addView(linearLayout, f6252c);
    }
}
