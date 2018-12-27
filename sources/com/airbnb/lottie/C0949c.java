package com.airbnb.lottie;

import android.support.v4.os.C0509c;
import android.util.Log;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.airbnb.lottie.c */
public class C0949c {
    /* renamed from: a */
    public static boolean f3129a = false;
    /* renamed from: b */
    private static final Set<String> f3130b = new HashSet();
    /* renamed from: c */
    private static boolean f3131c = false;
    /* renamed from: d */
    private static String[] f3132d;
    /* renamed from: e */
    private static long[] f3133e;
    /* renamed from: f */
    private static int f3134f = 0;
    /* renamed from: g */
    private static int f3135g = 0;

    /* renamed from: a */
    public static void m4076a(String str) {
        if (f3129a) {
            Log.d("LOTTIE", str);
        }
    }

    /* renamed from: b */
    public static void m4077b(String str) {
        if (!f3130b.contains(str)) {
            Log.w("LOTTIE", str);
            f3130b.add(str);
        }
    }

    /* renamed from: c */
    public static void m4078c(String str) {
        if (!f3131c) {
            return;
        }
        if (f3134f == 20) {
            f3135g++;
            return;
        }
        f3132d[f3134f] = str;
        f3133e[f3134f] = System.nanoTime();
        C0509c.m1881a(str);
        f3134f++;
    }

    /* renamed from: d */
    public static float m4079d(String str) {
        if (f3135g > 0) {
            f3135g--;
            return 0.0f;
        } else if (!f3131c) {
            return 0.0f;
        } else {
            f3134f--;
            if (f3134f == -1) {
                throw new IllegalStateException("Can't end trace section. There are none.");
            } else if (str.equals(f3132d[f3134f])) {
                C0509c.m1880a();
                return ((float) (System.nanoTime() - f3133e[f3134f])) / 1000000.0f;
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unbalanced trace call ");
                stringBuilder.append(str);
                stringBuilder.append(". Expected ");
                stringBuilder.append(f3132d[f3134f]);
                stringBuilder.append(".");
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
    }
}
