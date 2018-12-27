package com.google.android.exoplayer2.p126c;

import android.text.TextUtils;

/* renamed from: com.google.android.exoplayer2.c.a */
public final class C2163a {
    /* renamed from: a */
    public static void m7916a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public static void m7917a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: a */
    public static int m7913a(int i, int i2, int i3) {
        if (i >= i2 && i < i3) {
            return i;
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: b */
    public static void m7918b(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: b */
    public static void m7919b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: a */
    public static <T> T m7914a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static String m7915a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException();
    }
}
