package com.facebook.ads.internal.p101q.p102a;

import java.util.Locale;

/* renamed from: com.facebook.ads.internal.q.a.s */
public class C1932s {
    /* renamed from: a */
    public static String m7313a(double d) {
        return String.format(Locale.US, "%.3f", new Object[]{Double.valueOf(d)});
    }

    /* renamed from: a */
    public static String m7314a(long j) {
        double d = (double) j;
        Double.isNaN(d);
        return C1932s.m7313a(d / 1000.0d);
    }
}
