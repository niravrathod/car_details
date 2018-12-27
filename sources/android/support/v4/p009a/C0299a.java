package android.support.v4.p009a;

import android.graphics.Color;

/* renamed from: android.support.v4.a.a */
public final class C0299a {
    /* renamed from: a */
    private static final ThreadLocal<double[]> f1046a = new ThreadLocal();

    /* renamed from: a */
    public static int m1067a(int i, int i2) {
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int c = C0299a.m1071c(alpha2, alpha);
        return Color.argb(c, C0299a.m1069a(Color.red(i), alpha2, Color.red(i2), alpha, c), C0299a.m1069a(Color.green(i), alpha2, Color.green(i2), alpha, c), C0299a.m1069a(Color.blue(i), alpha2, Color.blue(i2), alpha, c));
    }

    /* renamed from: c */
    private static int m1071c(int i, int i2) {
        return 255 - (((255 - i2) * (255 - i)) / 255);
    }

    /* renamed from: a */
    private static int m1069a(int i, int i2, int i3, int i4, int i5) {
        return i5 == 0 ? 0 : (((i * 255) * i2) + ((i3 * i4) * (255 - i2))) / (i5 * 255);
    }

    /* renamed from: b */
    public static int m1070b(int i, int i2) {
        if (i2 >= 0 && i2 <= 255) {
            return (i & 16777215) | (i2 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }

    /* renamed from: a */
    public static int m1068a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((((float) Color.alpha(i)) * f2) + (((float) Color.alpha(i2)) * f)), (int) ((((float) Color.red(i)) * f2) + (((float) Color.red(i2)) * f)), (int) ((((float) Color.green(i)) * f2) + (((float) Color.green(i2)) * f)), (int) ((((float) Color.blue(i)) * f2) + (((float) Color.blue(i2)) * f)));
    }
}
