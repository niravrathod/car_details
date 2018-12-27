package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class zzbdf {
    /* renamed from: a */
    static final Charset f9180a = Charset.forName("UTF-8");
    /* renamed from: b */
    public static final byte[] f9181b;
    /* renamed from: c */
    private static final Charset f9182c = Charset.forName("ISO-8859-1");
    /* renamed from: d */
    private static final ByteBuffer f9183d;
    /* renamed from: e */
    private static final zzbcf f9184e;

    /* renamed from: a */
    public static int m10326a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: a */
    public static int m10327a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: a */
    static boolean m10331a(zzbel zzbel) {
        return false;
    }

    /* renamed from: a */
    static <T> T m10328a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    static <T> T m10330a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    public static boolean m10332a(byte[] bArr) {
        return ni.m9270a(bArr);
    }

    /* renamed from: b */
    public static String m10333b(byte[] bArr) {
        return new String(bArr, f9180a);
    }

    /* renamed from: c */
    public static int m10334c(byte[] bArr) {
        int length = bArr.length;
        bArr = m10325a(length, bArr, 0, length);
        return bArr == null ? 1 : bArr;
    }

    /* renamed from: a */
    static int m10325a(int i, byte[] bArr, int i2, int i3) {
        int i4 = i;
        for (i = i2; i < i2 + i3; i++) {
            i4 = (i4 * 31) + bArr[i];
        }
        return i4;
    }

    /* renamed from: a */
    static Object m10329a(Object obj, Object obj2) {
        return ((zzbel) obj).mo4811o().mo4213a((zzbel) obj2).mo4803e();
    }

    static {
        byte[] bArr = new byte[0];
        f9181b = bArr;
        f9183d = ByteBuffer.wrap(bArr);
        bArr = f9181b;
        f9184e = zzbcf.m10281a(bArr, 0, bArr.length, false);
    }
}
