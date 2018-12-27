package com.google.android.gms.internal.ads;

final class nj {
    /* renamed from: d */
    private static boolean m9289d(byte b) {
        return b >= (byte) 0;
    }

    /* renamed from: e */
    private static boolean m9290e(byte b) {
        return b < (byte) -32;
    }

    /* renamed from: f */
    private static boolean m9291f(byte b) {
        return b < (byte) -16;
    }

    /* renamed from: g */
    private static boolean m9292g(byte b) {
        return b > (byte) -65;
    }

    /* renamed from: b */
    private static void m9286b(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    /* renamed from: b */
    private static void m9285b(byte b, byte b2, char[] cArr, int i) {
        if (b < (byte) -62 || m9292g(b2)) {
            throw zzbdl.m10348i();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    /* renamed from: b */
    private static void m9284b(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (m9292g(b2) || ((b == (byte) -32 && b2 < (byte) -96) || ((b == (byte) -19 && b2 >= (byte) -96) || m9292g(b3)))) {
            throw zzbdl.m10348i();
        }
        cArr[i] = (char) ((((b & 15) << 12) | ((b2 & 63) << 6)) | (b3 & 63));
    }

    /* renamed from: b */
    private static void m9283b(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (m9292g(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || m9292g(b3) || m9292g(b4)) {
            throw zzbdl.m10348i();
        }
        b = ((((b & 7) << 18) | ((b2 & 63) << 12)) | ((b3 & 63) << 6)) | (b4 & 63);
        cArr[i] = (char) ((b >>> 10) + (byte) -64);
        cArr[i + 1] = (char) ((b & 1023) + (byte) 0);
    }
}
