package com.bumptech.glide.p055g;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.os.SystemClock;

/* renamed from: com.bumptech.glide.g.e */
public final class C1174e {
    /* renamed from: a */
    private static final double f3826a;

    static {
        double d = 1.0d;
        if (VERSION.SDK_INT >= 17) {
            d = 1.0d / Math.pow(10.0d, 6.0d);
        }
        f3826a = d;
    }

    @TargetApi(17)
    /* renamed from: a */
    public static long m4866a() {
        if (VERSION.SDK_INT >= 17) {
            return SystemClock.elapsedRealtimeNanos();
        }
        return SystemClock.uptimeMillis();
    }

    /* renamed from: a */
    public static double m4865a(long j) {
        j = (double) (C1174e.m4866a() - j);
        double d = f3826a;
        Double.isNaN(j);
        return j * d;
    }
}
