package com.google.android.exoplayer2.extractor;

/* renamed from: com.google.android.exoplayer2.extractor.k */
public final class C2264k {
    /* renamed from: h */
    private static final String[] f7177h = new String[]{"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    /* renamed from: i */
    private static final int[] f7178i = new int[]{44100, 48000, 32000};
    /* renamed from: j */
    private static final int[] f7179j = new int[]{32, 64, 96, 128, 160, 192, 224, 256, 288, 320, 352, 384, 416, 448};
    /* renamed from: k */
    private static final int[] f7180k = new int[]{32, 48, 56, 64, 80, 96, 112, 128, 144, 160, 176, 192, 224, 256};
    /* renamed from: l */
    private static final int[] f7181l = new int[]{32, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384};
    /* renamed from: m */
    private static final int[] f7182m = new int[]{32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320};
    /* renamed from: n */
    private static final int[] f7183n = new int[]{8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, 144, 160};
    /* renamed from: a */
    public int f7184a;
    /* renamed from: b */
    public String f7185b;
    /* renamed from: c */
    public int f7186c;
    /* renamed from: d */
    public int f7187d;
    /* renamed from: e */
    public int f7188e;
    /* renamed from: f */
    public int f7189f;
    /* renamed from: g */
    public int f7190g;

    /* renamed from: a */
    public static int m8330a(int i) {
        if ((i & -2097152) != -2097152) {
            return -1;
        }
        int i2 = (i >>> 19) & 3;
        if (i2 == 1) {
            return -1;
        }
        int i3 = (i >>> 17) & 3;
        if (i3 == 0) {
            return -1;
        }
        int i4 = (i >>> 12) & 15;
        if (i4 != 0) {
            if (i4 != 15) {
                int i5 = (i >>> 10) & 3;
                if (i5 == 3) {
                    return -1;
                }
                int i6 = f7178i[i5];
                if (i2 == 2) {
                    i6 /= 2;
                } else if (i2 == 0) {
                    i6 /= 4;
                }
                i = (i >>> 9) & 1;
                if (i3 == 3) {
                    return ((((i2 == 3 ? f7179j[i4 - 1] : f7180k[i4 - 1]) * 12000) / i6) + i) * 4;
                }
                i4 = i2 == 3 ? i3 == 2 ? f7181l[i4 - 1] : f7182m[i4 - 1] : f7183n[i4 - 1];
                i5 = 144000;
                if (i2 == 3) {
                    return ((i4 * 144000) / i6) + i;
                }
                if (i3 == 1) {
                    i5 = 72000;
                }
                return ((i5 * i4) / i6) + i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static boolean m8332a(int i, C2264k c2264k) {
        if ((i & -2097152) != -2097152) {
            return false;
        }
        int i2 = (i >>> 19) & 3;
        if (i2 == 1) {
            return false;
        }
        int i3 = (i >>> 17) & 3;
        if (i3 == 0) {
            return false;
        }
        int i4 = (i >>> 12) & 15;
        if (i4 != 0) {
            if (i4 != 15) {
                int i5 = (i >>> 10) & 3;
                if (i5 == 3) {
                    return false;
                }
                int i6;
                int i7;
                int i8 = f7178i[i5];
                if (i2 == 2) {
                    i8 /= 2;
                } else if (i2 == 0) {
                    i8 /= 4;
                }
                int i9 = i8;
                i8 = (i >>> 9) & 1;
                int i10 = 1152;
                if (i3 == 3) {
                    i4 = i2 == 3 ? f7179j[i4 - 1] : f7180k[i4 - 1];
                    i6 = (((i4 * 12000) / i9) + i8) * 4;
                    i7 = 384;
                } else {
                    i6 = 144000;
                    if (i2 == 3) {
                        i4 = i3 == 2 ? f7181l[i4 - 1] : f7182m[i4 - 1];
                        i6 = ((144000 * i4) / i9) + i8;
                        i7 = 1152;
                    } else {
                        i4 = f7183n[i4 - 1];
                        if (i3 == 1) {
                            i10 = 576;
                        }
                        if (i3 == 1) {
                            i6 = 72000;
                        }
                        i6 = ((i6 * i4) / i9) + i8;
                        i7 = i10;
                    }
                }
                c2264k.m8331a(i2, f7177h[3 - i3], i6, i9, ((i >> 6) & 3) == 3 ? 1 : 2, i4 * 1000, i7);
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private void m8331a(int i, String str, int i2, int i3, int i4, int i5, int i6) {
        this.f7184a = i;
        this.f7185b = str;
        this.f7186c = i2;
        this.f7187d = i3;
        this.f7188e = i4;
        this.f7189f = i5;
        this.f7190g = i6;
    }
}
