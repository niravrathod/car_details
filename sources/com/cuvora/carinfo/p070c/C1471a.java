package com.cuvora.carinfo.p070c;

import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.C2885g;

/* renamed from: com.cuvora.carinfo.c.a */
public final class C1471a {
    /* renamed from: a */
    public static final <T extends View> void m5714a(ViewGroup viewGroup, View view, int i) {
        C2885g.m13910b(viewGroup, "$receiver");
        C2885g.m13910b(view, "view");
        viewGroup.removeView(viewGroup.findViewById(i));
        C1471a.m5716b(viewGroup, view, i);
    }

    /* renamed from: a */
    public static final <T extends View> void m5715a(ViewGroup viewGroup, View view, int i, int i2) {
        C2885g.m13910b(viewGroup, "$receiver");
        C2885g.m13910b(view, "view");
        viewGroup.removeView(viewGroup.findViewById(i));
        C1471a.m5717b(viewGroup, view, i, i2);
    }

    /* renamed from: b */
    public static final void m5716b(ViewGroup viewGroup, View view, int i) {
        C2885g.m13910b(viewGroup, "$receiver");
        C2885g.m13910b(view, "view");
        view.setId(i);
        viewGroup.addView(view);
    }

    /* renamed from: b */
    public static final void m5717b(ViewGroup viewGroup, View view, int i, int i2) {
        C2885g.m13910b(viewGroup, "$receiver");
        C2885g.m13910b(view, "view");
        view.setId(i);
        viewGroup.addView(view, i2);
    }
}
