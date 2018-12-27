package android.support.design.widget;

import android.content.Context;
import android.support.v7.p020a.C0637a.C0627a;

/* renamed from: android.support.design.widget.m */
class C0219m {
    /* renamed from: a */
    private static final int[] f835a = new int[]{C0627a.colorPrimary};

    /* renamed from: a */
    static void m807a(Context context) {
        context = context.obtainStyledAttributes(f835a);
        int hasValue = context.hasValue(0) ^ 1;
        context.recycle();
        if (hasValue != 0) {
            throw new IllegalArgumentException("You need to use a Theme.AppCompat theme (or descendant) with the design library.");
        }
    }
}
