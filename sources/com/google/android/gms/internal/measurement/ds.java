package com.google.android.gms.internal.measurement;

final class ds {
    /* renamed from: d */
    private static boolean m11810d(byte b) {
        return b >= (byte) 0;
    }

    /* renamed from: e */
    private static boolean m11811e(byte b) {
        return b < (byte) -32;
    }

    /* renamed from: f */
    private static boolean m11812f(byte b) {
        return b < (byte) -16;
    }

    /* renamed from: g */
    private static boolean m11813g(byte b) {
        return b > (byte) -65;
    }

    /* renamed from: b */
    private static void m11807b(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    /* renamed from: b */
    private static void m11806b(byte b, byte b2, char[] cArr, int i) {
        if (b < (byte) -62 || m11813g(b2)) {
            throw zzvt.m12088h();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    /* renamed from: b */
    private static void m11805b(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (m11813g(b2) || ((b == (byte) -32 && b2 < (byte) -96) || ((b == (byte) -19 && b2 >= (byte) -96) || m11813g(b3)))) {
            throw zzvt.m12088h();
        }
        cArr[i] = (char) ((((b & 15) << 12) | ((b2 & 63) << 6)) | (b3 & 63));
    }

    /* renamed from: b */
    private static void m11804b(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (m11813g(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || m11813g(b3) || m11813g(b4)) {
            throw zzvt.m12088h();
        }
        b = ((((b & 7) << 18) | ((b2 & 63) << 12)) | ((b3 & 63) << 6)) | (b4 & 63);
        cArr[i] = (char) ((b >>> 10) + (byte) -64);
        cArr[i + 1] = (char) ((b & 1023) + (byte) 0);
    }
}
