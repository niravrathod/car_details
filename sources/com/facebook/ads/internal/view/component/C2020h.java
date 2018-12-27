package com.facebook.ads.internal.view.component;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.facebook.ads.internal.adapters.p082a.C1727d;
import com.facebook.ads.internal.p101q.p102a.C1936w;

/* renamed from: com.facebook.ads.internal.view.component.h */
public class C2020h extends LinearLayout {
    /* renamed from: a */
    private static final float f6245a = Resources.getSystem().getDisplayMetrics().density;
    /* renamed from: b */
    private static final int f6246b = ((int) (f6245a * 6.0f));
    /* renamed from: c */
    private static final int f6247c = ((int) (f6245a * 8.0f));
    /* renamed from: d */
    private final TextView f6248d;
    /* renamed from: e */
    private final TextView f6249e;

    public C2020h(Context context, C1727d c1727d, boolean z, boolean z2, boolean z3) {
        super(context);
        setOrientation(1);
        this.f6248d = new TextView(context);
        C1936w.m7330a(this.f6248d, true, z2 ? 18 : 22);
        this.f6248d.setTextColor(c1727d.m6526c(z));
        this.f6248d.setEllipsize(TruncateAt.END);
        this.f6248d.setLineSpacing((float) f6246b, 1.0f);
        this.f6249e = new TextView(context);
        C1936w.m7330a(this.f6249e, false, z2 ? 14 : 16);
        this.f6249e.setTextColor(c1727d.m6525b(z));
        this.f6249e.setEllipsize(TruncateAt.END);
        this.f6249e.setLineSpacing((float) f6246b, 1.0f);
        addView(this.f6248d, new LayoutParams(-1, -2));
        ViewGroup.LayoutParams layoutParams = new LayoutParams(-1, -2);
        layoutParams.setMargins(0, z3 ? f6247c / 2 : f6247c, 0, 0);
        addView(this.f6249e, layoutParams);
    }

    /* renamed from: a */
    public void m7580a(String str, String str2, boolean z, boolean z2) {
        CharSequence charSequence;
        CharSequence charSequence2;
        TextView textView;
        int isEmpty = TextUtils.isEmpty(str) ^ 1;
        int isEmpty2 = TextUtils.isEmpty(str2) ^ 1;
        TextView textView2 = this.f6248d;
        if (isEmpty == 0) {
            charSequence = str2;
        }
        textView2.setText(charSequence);
        TextView textView3 = this.f6249e;
        if (isEmpty == 0) {
            charSequence2 = "";
        }
        textView3.setText(charSequence2);
        int i = 3;
        if (isEmpty != 0) {
            if (isEmpty2 != 0) {
                this.f6248d.setMaxLines(z ? 1 : 2);
                textView = this.f6249e;
                if (z) {
                    i = 1;
                } else {
                    if (z2) {
                    }
                    i = 2;
                }
                textView.setMaxLines(i);
            }
        }
        textView = this.f6248d;
        if (!z) {
            if (z2) {
                i = 4;
            }
            textView.setMaxLines(i);
        }
        i = 2;
        textView.setMaxLines(i);
    }

    public void setAlignment(int i) {
        this.f6248d.setGravity(i);
        this.f6249e.setGravity(i);
    }
}
