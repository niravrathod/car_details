package com.facebook.ads.internal.view.p110c;

import android.content.Context;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.internal.adapters.p082a.C1734i;
import com.facebook.ads.internal.p101q.p102a.C1936w;
import com.facebook.ads.internal.view.component.C2017e;
import com.facebook.ads.internal.view.p109b.C1991d;

/* renamed from: com.facebook.ads.internal.view.c.c */
public class C2000c extends LinearLayout {
    /* renamed from: a */
    private C2017e f6173a;
    /* renamed from: b */
    private TextView f6174b;
    /* renamed from: c */
    private TextView f6175c;

    public C2000c(Context context) {
        super(context);
        m7521a(context);
    }

    /* renamed from: a */
    public void m7520a(int i, int i2) {
        this.f6174b.setTextColor(i);
        this.f6175c.setTextColor(i2);
    }

    /* renamed from: a */
    public void m7521a(Context context) {
        int i = (int) (C1936w.f5934b * 32.0f);
        setGravity(16);
        this.f6173a = new C2017e(context);
        this.f6173a.setFullCircleCorners(true);
        LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        layoutParams.setMargins(0, 0, (int) (C1936w.f5934b * 8.0f), 0);
        addView(this.f6173a, layoutParams);
        View linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        this.f6174b = new TextView(context);
        layoutParams = new LinearLayout.LayoutParams(-1, -2);
        C1936w.m7330a(this.f6174b, true, 16);
        this.f6174b.setEllipsize(TruncateAt.END);
        this.f6174b.setSingleLine(true);
        this.f6175c = new TextView(context);
        C1936w.m7330a(this.f6175c, false, 14);
        linearLayout.addView(this.f6174b);
        linearLayout.addView(this.f6175c);
        addView(linearLayout, layoutParams);
    }

    public void setPageDetails(C1734i c1734i) {
        C1991d c1991d = new C1991d(this.f6173a);
        c1991d.m7500a((int) (C1936w.f5934b * 32.0f), (int) (C1936w.f5934b * 32.0f));
        c1991d.m7503a(c1734i.m6564b());
        this.f6174b.setText(c1734i.m6563a());
        this.f6175c.setText(c1734i.m6566d());
    }
}
