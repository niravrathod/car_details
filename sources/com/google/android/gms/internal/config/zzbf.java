package com.google.android.gms.internal.config;

import java.nio.charset.Charset;
import java.util.Arrays;

public final class zzbf {
    /* renamed from: a */
    protected static final Charset f9956a = Charset.forName("UTF-8");
    /* renamed from: b */
    public static final Object f9957b = new Object();
    /* renamed from: c */
    private static final Charset f9958c = Charset.forName("ISO-8859-1");

    /* renamed from: a */
    public static int m11408a(Object[] objArr) {
        int length = objArr == null ? 0 : objArr.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            Object obj = objArr[i2];
            if (obj != null) {
                i = (i * 31) + obj.hashCode();
            }
        }
        return i;
    }

    /* renamed from: a */
    public static int m11409a(byte[][] bArr) {
        int length = bArr == null ? 0 : bArr.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            byte[] bArr2 = bArr[i2];
            if (bArr2 != null) {
                i = (i * 31) + Arrays.hashCode(bArr2);
            }
        }
        return i;
    }

    /* renamed from: a */
    public static void m11410a(zzbb zzbb, zzbb zzbb2) {
        if (zzbb.f17402f != null) {
            zzbb2.f17402f = (zzbd) zzbb.f17402f.clone();
        }
    }

    /* renamed from: a */
    public static boolean m11411a(Object[] objArr, Object[] objArr2) {
        int length = objArr == null ? 0 : objArr.length;
        int length2 = objArr2 == null ? 0 : objArr2.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= length || objArr[i] != null) {
                while (i2 < length2 && objArr2[i2] == null) {
                    i2++;
                }
                Object obj = i >= length ? 1 : null;
                Object obj2 = i2 >= length2 ? 1 : null;
                if (obj != null && obj2 != null) {
                    return true;
                }
                if (obj != obj2 || !objArr[i].equals(objArr2[i2])) {
                    return false;
                }
                i++;
                i2++;
            } else {
                i++;
            }
        }
    }

    /* renamed from: a */
    public static boolean m11412a(byte[][] bArr, byte[][] bArr2) {
        int length = bArr == null ? 0 : bArr.length;
        int length2 = bArr2 == null ? 0 : bArr2.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= length || bArr[i] != null) {
                while (i2 < length2 && bArr2[i2] == null) {
                    i2++;
                }
                Object obj = i >= length ? 1 : null;
                Object obj2 = i2 >= length2 ? 1 : null;
                if (obj != null && obj2 != null) {
                    return true;
                }
                if (obj != obj2 || !Arrays.equals(bArr[i], bArr2[i2])) {
                    return false;
                }
                i++;
                i2++;
            } else {
                i++;
            }
        }
    }
}
