package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.Arrays;

public final class zzze {
    /* renamed from: a */
    protected static final Charset f10361a = Charset.forName("UTF-8");
    /* renamed from: b */
    public static final Object f10362b = new Object();
    /* renamed from: c */
    private static final Charset f10363c = Charset.forName("ISO-8859-1");

    /* renamed from: a */
    public static boolean m12192a(long[] jArr, long[] jArr2) {
        if (jArr != null) {
            if (jArr.length != 0) {
                return Arrays.equals(jArr, jArr2);
            }
        }
        if (jArr2 != null) {
            if (jArr2.length != null) {
                return null;
            }
        }
        return 1;
    }

    /* renamed from: a */
    public static boolean m12193a(Object[] objArr, Object[] objArr2) {
        int i;
        int length = objArr == null ? 0 : objArr.length;
        if (objArr2 == null) {
            i = 0;
        } else {
            i = objArr2.length;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= length || objArr[i2] != null) {
                while (i3 < i && objArr2[i3] == null) {
                    i3++;
                }
                Object obj = i2 >= length ? 1 : null;
                Object obj2 = i3 >= i ? 1 : null;
                if (obj != null && obj2 != null) {
                    return true;
                }
                if (obj != obj2 || !objArr[i2].equals(objArr2[i3])) {
                    return false;
                }
                i2++;
                i3++;
            } else {
                i2++;
            }
        }
    }

    /* renamed from: a */
    public static int m12189a(long[] jArr) {
        if (jArr != null) {
            if (jArr.length != 0) {
                return Arrays.hashCode(jArr);
            }
        }
        return null;
    }

    /* renamed from: a */
    public static int m12190a(Object[] objArr) {
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
    public static void m12191a(zzza zzza, zzza zzza2) {
        if (zzza.f17553J != null) {
            zzza2.f17553J = (zzzc) zzza.f17553J.clone();
        }
    }
}
