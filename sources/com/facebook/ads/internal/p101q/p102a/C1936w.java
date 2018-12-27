package com.facebook.ads.internal.p101q.p102a;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.ads.internal.q.a.w */
public class C1936w {
    /* renamed from: a */
    public static final DisplayMetrics f5933a = Resources.getSystem().getDisplayMetrics();
    /* renamed from: b */
    public static final float f5934b = f5933a.density;
    /* renamed from: c */
    private static final AtomicInteger f5935c = new AtomicInteger(1);

    /* renamed from: a */
    public static int m7325a() {
        int i;
        int i2;
        do {
            i = f5935c.get();
            i2 = i + 1;
            if (i2 > 16777215) {
                i2 = 1;
            }
        } while (!f5935c.compareAndSet(i, i2));
        return i;
    }

    /* renamed from: a */
    public static int m7326a(int i) {
        return (int) TypedValue.applyDimension(2, (float) i, f5933a);
    }

    /* renamed from: a */
    public static void m7327a(View view) {
        view.setId(VERSION.SDK_INT >= 17 ? View.generateViewId() : C1936w.m7325a());
    }

    /* renamed from: a */
    public static void m7328a(View view, int i) {
        if (VERSION.SDK_INT >= 16) {
            view.setBackground(new ColorDrawable(i));
        } else {
            view.setBackgroundDrawable(new ColorDrawable(i));
        }
    }

    /* renamed from: a */
    public static void m7329a(View view, Drawable drawable) {
        if (VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    /* renamed from: a */
    public static void m7330a(TextView textView, boolean z, int i) {
        Typeface typeface;
        int i2 = 0;
        if (!z) {
            typeface = Typeface.SANS_SERIF;
        } else if (VERSION.SDK_INT >= 21) {
            typeface = Typeface.create("sans-serif-medium", 0);
            textView.setTypeface(typeface);
            textView.setTextSize(2, (float) i);
        } else {
            typeface = Typeface.SANS_SERIF;
            i2 = 1;
        }
        typeface = Typeface.create(typeface, i2);
        textView.setTypeface(typeface);
        textView.setTextSize(2, (float) i);
    }

    /* renamed from: a */
    public static void m7331a(View... viewArr) {
        for (View b : viewArr) {
            C1936w.m7332b(b);
        }
    }

    /* renamed from: b */
    public static void m7332b(View view) {
        if (view != null) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
        }
    }
}
