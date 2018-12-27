package com.facebook.ads.internal.p101q.p102a;

import android.text.TextUtils;

/* renamed from: com.facebook.ads.internal.q.a.b */
public class C1907b {
    /* renamed from: a */
    private static boolean f5841a = false;
    /* renamed from: b */
    private static boolean f5842b = false;

    /* renamed from: a */
    public static synchronized String m7251a(String str) {
        synchronized (C1907b.class) {
            if (C1907b.m7252a()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("fb.e2e.");
                stringBuilder.append(str);
                str = System.getProperty(stringBuilder.toString());
                return str;
            }
            return null;
        }
    }

    /* renamed from: a */
    public static synchronized boolean m7252a() {
        boolean z;
        synchronized (C1907b.class) {
            if (!f5842b) {
                f5841a = "true".equals(System.getProperty("fb.running_e2e"));
                f5842b = true;
            }
            z = f5841a;
        }
        return z;
    }

    /* renamed from: b */
    public static synchronized boolean m7253b(String str) {
        boolean isEmpty;
        synchronized (C1907b.class) {
            isEmpty = TextUtils.isEmpty(C1907b.m7251a(str)) ^ 1;
        }
        return isEmpty;
    }
}
