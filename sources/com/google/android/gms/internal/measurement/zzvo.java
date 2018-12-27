package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class zzvo {
    /* renamed from: a */
    static final Charset f10281a = Charset.forName("UTF-8");
    /* renamed from: b */
    public static final byte[] f10282b;
    /* renamed from: c */
    private static final Charset f10283c = Charset.forName("ISO-8859-1");
    /* renamed from: d */
    private static final ByteBuffer f10284d;
    /* renamed from: e */
    private static final zzuo f10285e;

    /* renamed from: a */
    public static int m12067a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: a */
    public static int m12068a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: a */
    static boolean m12072a(zzwt zzwt) {
        return false;
    }

    /* renamed from: a */
    static <T> T m12069a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    static <T> T m12071a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    public static boolean m12073a(byte[] bArr) {
        return dr.m11791a(bArr);
    }

    /* renamed from: b */
    public static String m12074b(byte[] bArr) {
        return new String(bArr, f10281a);
    }

    /* renamed from: c */
    public static int m12075c(byte[] bArr) {
        int length = bArr.length;
        bArr = m12066a(length, bArr, 0, length);
        return bArr == null ? 1 : bArr;
    }

    /* renamed from: a */
    static int m12066a(int i, byte[] bArr, int i2, int i3) {
        int i4 = i;
        for (i = i2; i < i2 + i3; i++) {
            i4 = (i4 * 31) + bArr[i];
        }
        return i4;
    }

    /* renamed from: a */
    static Object m12070a(Object obj, Object obj2) {
        return ((zzwt) obj).mo4837h().mo4349a((zzwt) obj2).mo4829d();
    }

    static {
        byte[] bArr = new byte[0];
        f10282b = bArr;
        f10284d = ByteBuffer.wrap(bArr);
        bArr = f10282b;
        f10285e = zzuo.m12023a(bArr, 0, bArr.length, false);
    }
}
