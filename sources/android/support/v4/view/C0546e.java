package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.ViewGroup.MarginLayoutParams;

/* renamed from: android.support.v4.view.e */
public final class C0546e {
    /* renamed from: a */
    public static int m2042a(MarginLayoutParams marginLayoutParams) {
        if (VERSION.SDK_INT >= 17) {
            return marginLayoutParams.getMarginStart();
        }
        return marginLayoutParams.leftMargin;
    }

    /* renamed from: b */
    public static int m2044b(MarginLayoutParams marginLayoutParams) {
        if (VERSION.SDK_INT >= 17) {
            return marginLayoutParams.getMarginEnd();
        }
        return marginLayoutParams.rightMargin;
    }

    /* renamed from: a */
    public static void m2043a(MarginLayoutParams marginLayoutParams, int i) {
        if (VERSION.SDK_INT >= 17) {
            marginLayoutParams.setMarginStart(i);
        } else {
            marginLayoutParams.leftMargin = i;
        }
    }

    /* renamed from: b */
    public static void m2045b(MarginLayoutParams marginLayoutParams, int i) {
        if (VERSION.SDK_INT >= 17) {
            marginLayoutParams.setMarginEnd(i);
        } else {
            marginLayoutParams.rightMargin = i;
        }
    }

    /* renamed from: c */
    public static void m2046c(MarginLayoutParams marginLayoutParams, int i) {
        if (VERSION.SDK_INT >= 17) {
            marginLayoutParams.resolveLayoutDirection(i);
        }
    }
}
