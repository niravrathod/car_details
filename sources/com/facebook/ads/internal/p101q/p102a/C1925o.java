package com.facebook.ads.internal.p101q.p102a;

import java.util.Random;

/* renamed from: com.facebook.ads.internal.q.a.o */
public class C1925o {
    /* renamed from: a */
    private static String m7302a() {
        return C1927q.m7306a(Thread.currentThread().getStackTrace());
    }

    /* renamed from: a */
    public static String m7303a(int i) {
        return (i > 0 && new Random().nextFloat() < 1.0f / ((float) i)) ? C1925o.m7302a() : null;
    }
}
