package com.bumptech.glide.p055g;

import android.text.TextUtils;
import java.util.Collection;

/* renamed from: com.bumptech.glide.g.i */
public final class C1178i {
    /* renamed from: a */
    public static void m4884a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: a */
    public static <T> T m4880a(T t) {
        return C1178i.m4881a((Object) t, "Argument must not be null");
    }

    /* renamed from: a */
    public static <T> T m4881a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    public static String m4882a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    /* renamed from: a */
    public static <T extends Collection<Y>, Y> T m4883a(T t) {
        if (!t.isEmpty()) {
            return t;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }
}
