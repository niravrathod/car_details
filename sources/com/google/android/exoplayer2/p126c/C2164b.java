package com.google.android.exoplayer2.p126c;

import android.util.Pair;

/* renamed from: com.google.android.exoplayer2.c.b */
public final class C2164b {
    /* renamed from: a */
    private static final byte[] f6696a = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 1};
    /* renamed from: b */
    private static final int[] f6697b = new int[]{96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    /* renamed from: c */
    private static final int[] f6698c = new int[]{0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: a */
    public static Pair<Integer, Integer> m7921a(byte[] bArr) {
        C2174j c2174j = new C2174j(bArr);
        bArr = C2164b.m7920a(c2174j);
        int b = C2164b.m7924b(c2174j);
        int c = c2174j.m7966c(4);
        if (bArr == 5 || bArr == 29) {
            b = C2164b.m7924b(c2174j);
            if (C2164b.m7920a(c2174j) == 22) {
                c = c2174j.m7966c(4);
            }
        }
        bArr = f6698c[c];
        C2163a.m7916a(bArr != -1);
        return Pair.create(Integer.valueOf(b), Integer.valueOf(bArr));
    }

    /* renamed from: a */
    public static byte[] m7922a(int i, int i2, int i3) {
        return new byte[]{(byte) (((i << 3) & 248) | ((i2 >> 1) & 7)), (byte) (((i2 << 7) & 128) | ((i3 << 3) & 120))};
    }

    /* renamed from: a */
    public static byte[] m7923a(byte[] bArr, int i, int i2) {
        Object obj = new byte[(f6696a.length + i2)];
        System.arraycopy(f6696a, 0, obj, 0, f6696a.length);
        System.arraycopy(bArr, i, obj, f6696a.length, i2);
        return obj;
    }

    /* renamed from: a */
    private static int m7920a(C2174j c2174j) {
        int c = c2174j.m7966c(5);
        return c == 31 ? c2174j.m7966c(6) + 32 : c;
    }

    /* renamed from: b */
    private static int m7924b(C2174j c2174j) {
        int c = c2174j.m7966c(4);
        if (c == 15) {
            return c2174j.m7966c(24);
        }
        C2163a.m7916a(c < 13 ? true : null);
        return f6697b[c];
    }
}
