package com.facebook.ads.internal.p101q.p102a;

import java.util.UUID;

/* renamed from: com.facebook.ads.internal.q.a.n */
public class C1924n {
    /* renamed from: a */
    private static final String f5900a = "n";
    /* renamed from: b */
    private static volatile boolean f5901b = false;
    /* renamed from: c */
    private static double f5902c;
    /* renamed from: d */
    private static String f5903d;

    /* renamed from: a */
    public static void m7299a() {
        if (!f5901b) {
            synchronized (f5900a) {
                if (!f5901b) {
                    f5901b = true;
                    double currentTimeMillis = (double) System.currentTimeMillis();
                    Double.isNaN(currentTimeMillis);
                    f5902c = currentTimeMillis / 1000.0d;
                    f5903d = UUID.randomUUID().toString();
                }
            }
        }
    }

    /* renamed from: b */
    public static double m7300b() {
        return f5902c;
    }

    /* renamed from: c */
    public static String m7301c() {
        return f5903d;
    }
}
