package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.v4.p009a.C0299a;
import android.util.TypedValue;

class at {
    /* renamed from: a */
    static final int[] f2831a = new int[]{-16842910};
    /* renamed from: b */
    static final int[] f2832b = new int[]{16842908};
    /* renamed from: c */
    static final int[] f2833c = new int[]{16843518};
    /* renamed from: d */
    static final int[] f2834d = new int[]{16842919};
    /* renamed from: e */
    static final int[] f2835e = new int[]{16842912};
    /* renamed from: f */
    static final int[] f2836f = new int[]{16842913};
    /* renamed from: g */
    static final int[] f2837g = new int[]{-16842919, -16842908};
    /* renamed from: h */
    static final int[] f2838h = new int[0];
    /* renamed from: i */
    private static final ThreadLocal<TypedValue> f2839i = new ThreadLocal();
    /* renamed from: j */
    private static final int[] f2840j = new int[1];

    /* renamed from: a */
    public static int m3531a(Context context, int i) {
        f2840j[0] = i;
        context = ay.m3542a(context, null, f2840j);
        try {
            i = context.m3550b(0, 0);
            return i;
        } finally {
            context.m3548a();
        }
    }

    /* renamed from: b */
    public static ColorStateList m3534b(Context context, int i) {
        f2840j[0] = i;
        context = ay.m3542a(context, null, f2840j);
        try {
            i = context.m3557e(0);
            return i;
        } finally {
            context.m3548a();
        }
    }

    /* renamed from: c */
    public static int m3535c(Context context, int i) {
        ColorStateList b = m3534b(context, i);
        if (b != null && b.isStateful()) {
            return b.getColorForState(f2831a, b.getDefaultColor());
        }
        TypedValue a = m3533a();
        context.getTheme().resolveAttribute(16842803, a, true);
        return m3532a(context, i, a.getFloat());
    }

    /* renamed from: a */
    private static TypedValue m3533a() {
        TypedValue typedValue = (TypedValue) f2839i.get();
        if (typedValue != null) {
            return typedValue;
        }
        typedValue = new TypedValue();
        f2839i.set(typedValue);
        return typedValue;
    }

    /* renamed from: a */
    static int m3532a(Context context, int i, float f) {
        context = m3531a(context, i);
        return C0299a.m1070b(context, Math.round(((float) Color.alpha(context)) * f));
    }
}
