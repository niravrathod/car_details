package com.google.android.youtube.player.internal;

import android.text.TextUtils;

/* renamed from: com.google.android.youtube.player.internal.c */
public final class C2534c {
    /* renamed from: a */
    public static <T> T m12477a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException("null reference");
    }

    /* renamed from: a */
    public static <T> T m12478a(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: a */
    public static String m12479a(String str, Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    /* renamed from: a */
    public static void m12480a(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }
}
