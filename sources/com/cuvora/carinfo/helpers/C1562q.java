package com.cuvora.carinfo.helpers;

/* renamed from: com.cuvora.carinfo.helpers.q */
public class C1562q {
    /* renamed from: a */
    public static boolean m5946a(String str) {
        if (str != null) {
            if (str.trim().length() != null) {
                return true;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m5947b(String str) {
        return C1562q.m5946a(str) ^ 1;
    }
}
