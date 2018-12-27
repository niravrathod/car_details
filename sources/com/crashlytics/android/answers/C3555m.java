package com.crashlytics.android.answers;

import io.fabric.sdk.android.services.concurrency.p149a.C2819a;
import java.util.Random;

/* renamed from: com.crashlytics.android.answers.m */
class C3555m implements C2819a {
    /* renamed from: a */
    final C2819a f14650a;
    /* renamed from: b */
    final Random f14651b;
    /* renamed from: c */
    final double f14652c;

    public C3555m(C2819a c2819a, double d) {
        this(c2819a, d, new Random());
    }

    public C3555m(C2819a c2819a, double d, Random random) {
        if (d < 0.0d || d > 1.0d) {
            throw new IllegalArgumentException("jitterPercent must be between 0.0 and 1.0");
        } else if (c2819a == null) {
            throw new NullPointerException("backoff must not be null");
        } else if (random != null) {
            this.f14650a = c2819a;
            this.f14652c = d;
            this.f14651b = random;
        } else {
            throw new NullPointerException("random must not be null");
        }
    }

    /* renamed from: a */
    public long mo1111a(int i) {
        double a = m18041a();
        double a2 = (double) this.f14650a.mo1111a(i);
        Double.isNaN(a2);
        return (long) (a * a2);
    }

    /* renamed from: a */
    double m18041a() {
        double d = 1.0d - this.f14652c;
        return d + (((this.f14652c + 1.0d) - d) * this.f14651b.nextDouble());
    }
}
