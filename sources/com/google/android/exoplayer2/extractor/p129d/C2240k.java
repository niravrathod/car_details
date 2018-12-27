package com.google.android.exoplayer2.extractor.p129d;

import android.util.Log;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.p126c.C2175k;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.extractor.d.k */
final class C2240k {

    /* renamed from: com.google.android.exoplayer2.extractor.d.k$a */
    public static final class C2236a {
        /* renamed from: a */
        public final int f7062a;
        /* renamed from: b */
        public final int f7063b;
        /* renamed from: c */
        public final long[] f7064c;
        /* renamed from: d */
        public final int f7065d;
        /* renamed from: e */
        public final boolean f7066e;

        public C2236a(int i, int i2, long[] jArr, int i3, boolean z) {
            this.f7062a = i;
            this.f7063b = i2;
            this.f7064c = jArr;
            this.f7065d = i3;
            this.f7066e = z;
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.d.k$b */
    public static final class C2237b {
        /* renamed from: a */
        public final String f7067a;
        /* renamed from: b */
        public final String[] f7068b;
        /* renamed from: c */
        public final int f7069c;

        public C2237b(String str, String[] strArr, int i) {
            this.f7067a = str;
            this.f7068b = strArr;
            this.f7069c = i;
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.d.k$c */
    public static final class C2238c {
        /* renamed from: a */
        public final boolean f7070a;
        /* renamed from: b */
        public final int f7071b;
        /* renamed from: c */
        public final int f7072c;
        /* renamed from: d */
        public final int f7073d;

        public C2238c(boolean z, int i, int i2, int i3) {
            this.f7070a = z;
            this.f7071b = i;
            this.f7072c = i2;
            this.f7073d = i3;
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.d.k$d */
    public static final class C2239d {
        /* renamed from: a */
        public final long f7074a;
        /* renamed from: b */
        public final int f7075b;
        /* renamed from: c */
        public final long f7076c;
        /* renamed from: d */
        public final int f7077d;
        /* renamed from: e */
        public final int f7078e;
        /* renamed from: f */
        public final int f7079f;
        /* renamed from: g */
        public final int f7080g;
        /* renamed from: h */
        public final int f7081h;
        /* renamed from: i */
        public final boolean f7082i;
        /* renamed from: j */
        public final byte[] f7083j;

        public C2239d(long j, int i, long j2, int i2, int i3, int i4, int i5, int i6, boolean z, byte[] bArr) {
            this.f7074a = j;
            this.f7075b = i;
            this.f7076c = j2;
            this.f7077d = i2;
            this.f7078e = i3;
            this.f7079f = i4;
            this.f7080g = i5;
            this.f7081h = i6;
            this.f7082i = z;
            this.f7083j = bArr;
        }
    }

    /* renamed from: a */
    public static int m8229a(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    /* renamed from: a */
    public static C2239d m8231a(C2175k c2175k) {
        C2175k c2175k2 = c2175k;
        C2240k.m8233a(1, c2175k2, false);
        long m = c2175k.m7992m();
        int g = c2175k.m7986g();
        long m2 = c2175k.m7992m();
        int o = c2175k.m7994o();
        int o2 = c2175k.m7994o();
        int o3 = c2175k.m7994o();
        int g2 = c2175k.m7986g();
        return new C2239d(m, g, m2, o, o2, o3, (int) Math.pow(2.0d, (double) (g2 & 15)), (int) Math.pow(2.0d, (double) ((g2 & 240) >> 4)), (c2175k.m7986g() & 1) > 0, Arrays.copyOf(c2175k2.f6735a, c2175k.m7978c()));
    }

    /* renamed from: b */
    public static C2237b m8236b(C2175k c2175k) {
        int i = 0;
        C2240k.m8233a(3, c2175k, false);
        String e = c2175k.m7983e((int) c2175k.m7992m());
        int length = 11 + e.length();
        long m = c2175k.m7992m();
        String[] strArr = new String[((int) m)];
        length += 4;
        while (((long) i) < m) {
            length += 4;
            strArr[i] = c2175k.m7983e((int) c2175k.m7992m());
            length += strArr[i].length();
            i++;
        }
        if ((c2175k.m7986g() & 1) != null) {
            return new C2237b(e, strArr, length + 1);
        }
        throw new ParserException("framing bit expected to be set");
    }

    /* renamed from: a */
    public static boolean m8233a(int i, C2175k c2175k, boolean z) {
        if (c2175k.m7976b() < 7) {
            if (z) {
                return false;
            }
            z = new StringBuilder();
            z.append("too short header: ");
            z.append(c2175k.m7976b());
            throw new ParserException(z.toString());
        } else if (c2175k.m7986g() == i) {
            if (c2175k.m7986g() == 118 && c2175k.m7986g() == 111 && c2175k.m7986g() == 114 && c2175k.m7986g() == 98 && c2175k.m7986g() == 105) {
                if (c2175k.m7986g() == 115) {
                    return true;
                }
            }
            if (z) {
                return false;
            }
            throw new ParserException("expected characters 'vorbis'");
        } else if (z) {
            return false;
        } else {
            z = new StringBuilder();
            z.append("expected header type ");
            z.append(Integer.toHexString(i));
            throw new ParserException(z.toString());
        }
    }

    /* renamed from: a */
    public static C2238c[] m8234a(C2175k c2175k, int i) {
        int i2 = 0;
        C2240k.m8233a(5, c2175k, false);
        int g = c2175k.m7986g() + 1;
        C2234i c2234i = new C2234i(c2175k.f6735a);
        c2234i.m8228b(c2175k.m7980d() * 8);
        for (c2175k = null; c2175k < g; c2175k++) {
            C2240k.m8239d(c2234i);
        }
        c2175k = c2234i.m8225a(6) + 1;
        while (i2 < c2175k) {
            if (c2234i.m8225a(16) == 0) {
                i2++;
            } else {
                throw new ParserException("placeholder of time domain transforms not zeroed out");
            }
        }
        C2240k.m8238c(c2234i);
        C2240k.m8237b(c2234i);
        C2240k.m8232a(i, c2234i);
        c2175k = C2240k.m8235a(c2234i);
        if (c2234i.m8226a() != 0) {
            return c2175k;
        }
        throw new ParserException("framing bit after modes not set as expected");
    }

    /* renamed from: a */
    private static C2238c[] m8235a(C2234i c2234i) {
        int a = c2234i.m8225a(6) + 1;
        C2238c[] c2238cArr = new C2238c[a];
        for (int i = 0; i < a; i++) {
            c2238cArr[i] = new C2238c(c2234i.m8226a(), c2234i.m8225a(16), c2234i.m8225a(16), c2234i.m8225a(8));
        }
        return c2238cArr;
    }

    /* renamed from: a */
    private static void m8232a(int i, C2234i c2234i) {
        int a = c2234i.m8225a(6) + 1;
        for (int i2 = 0; i2 < a; i2++) {
            int a2 = c2234i.m8225a(16);
            if (a2 != 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("mapping type other than 0 not supported: ");
                stringBuilder.append(a2);
                Log.e("VorbisUtil", stringBuilder.toString());
            } else {
                int a3;
                a2 = c2234i.m8226a() ? c2234i.m8225a(4) + 1 : 1;
                if (c2234i.m8226a()) {
                    a3 = c2234i.m8225a(8) + 1;
                    for (int i3 = 0; i3 < a3; i3++) {
                        int i4 = i - 1;
                        c2234i.m8228b(C2240k.m8229a(i4));
                        c2234i.m8228b(C2240k.m8229a(i4));
                    }
                }
                if (c2234i.m8225a(2) == 0) {
                    if (a2 > 1) {
                        for (a3 = 0; a3 < i; a3++) {
                            c2234i.m8228b(4);
                        }
                    }
                    for (int i5 = 0; i5 < a2; i5++) {
                        c2234i.m8228b(8);
                        c2234i.m8228b(8);
                        c2234i.m8228b(8);
                    }
                } else {
                    throw new ParserException("to reserved bits must be zero after mapping coupling steps");
                }
            }
        }
    }

    /* renamed from: b */
    private static void m8237b(C2234i c2234i) {
        int a = c2234i.m8225a(6) + 1;
        int i = 0;
        while (i < a) {
            if (c2234i.m8225a(16) <= 2) {
                int i2;
                c2234i.m8228b(24);
                c2234i.m8228b(24);
                c2234i.m8228b(24);
                int a2 = c2234i.m8225a(6) + 1;
                c2234i.m8228b(8);
                int[] iArr = new int[a2];
                for (i2 = 0; i2 < a2; i2++) {
                    iArr[i2] = ((c2234i.m8226a() ? c2234i.m8225a(5) : 0) * 8) + c2234i.m8225a(3);
                }
                for (i2 = 0; i2 < a2; i2++) {
                    for (int i3 = 0; i3 < 8; i3++) {
                        if ((iArr[i2] & (1 << i3)) != 0) {
                            c2234i.m8228b(8);
                        }
                    }
                }
                i++;
            } else {
                throw new ParserException("residueType greater than 2 is not decodable");
            }
        }
    }

    /* renamed from: c */
    private static void m8238c(C2234i c2234i) {
        int a = c2234i.m8225a(6) + 1;
        for (int i = 0; i < a; i++) {
            int a2 = c2234i.m8225a(16);
            int a3;
            switch (a2) {
                case 0:
                    c2234i.m8228b(8);
                    c2234i.m8228b(16);
                    c2234i.m8228b(16);
                    c2234i.m8228b(6);
                    c2234i.m8228b(8);
                    a3 = c2234i.m8225a(4) + 1;
                    for (a2 = 0; a2 < a3; a2++) {
                        c2234i.m8228b(8);
                    }
                    break;
                case 1:
                    int a4;
                    a3 = c2234i.m8225a(5);
                    int[] iArr = new int[a3];
                    int i2 = -1;
                    for (a2 = 0; a2 < a3; a2++) {
                        iArr[a2] = c2234i.m8225a(4);
                        if (iArr[a2] > i2) {
                            i2 = iArr[a2];
                        }
                    }
                    int[] iArr2 = new int[(i2 + 1)];
                    for (i2 = 0; i2 < iArr2.length; i2++) {
                        iArr2[i2] = c2234i.m8225a(3) + 1;
                        a4 = c2234i.m8225a(2);
                        if (a4 > 0) {
                            c2234i.m8228b(8);
                        }
                        for (int i3 = 0; i3 < (1 << a4); i3++) {
                            c2234i.m8228b(8);
                        }
                    }
                    c2234i.m8228b(2);
                    int a5 = c2234i.m8225a(4);
                    i2 = 0;
                    a4 = 0;
                    for (int i4 = 0; i4 < a3; i4++) {
                        i2 += iArr2[iArr[i4]];
                        while (a4 < i2) {
                            c2234i.m8228b(a5);
                            a4++;
                        }
                    }
                    break;
                default:
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("floor type greater than 1 not decodable: ");
                    stringBuilder.append(a2);
                    throw new ParserException(stringBuilder.toString());
            }
        }
    }

    /* renamed from: d */
    private static C2236a m8239d(C2234i c2234i) {
        if (c2234i.m8225a(24) == 5653314) {
            int i;
            int i2;
            int a = c2234i.m8225a(16);
            int a2 = c2234i.m8225a(24);
            long[] jArr = new long[a2];
            boolean a3 = c2234i.m8226a();
            long j = 0;
            if (a3) {
                int a4 = c2234i.m8225a(5) + 1;
                i = 0;
                while (i < jArr.length) {
                    int a5 = c2234i.m8225a(C2240k.m8229a(a2 - i));
                    int i3 = i;
                    for (i = 0; i < a5 && i3 < jArr.length; i++) {
                        jArr[i3] = (long) a4;
                        i3++;
                    }
                    a4++;
                    i = i3;
                }
            } else {
                boolean a6 = c2234i.m8226a();
                for (i2 = 0; i2 < jArr.length; i2++) {
                    if (!a6) {
                        jArr[i2] = (long) (c2234i.m8225a(5) + 1);
                    } else if (c2234i.m8226a()) {
                        jArr[i2] = (long) (c2234i.m8225a(5) + 1);
                    } else {
                        jArr[i2] = 0;
                    }
                }
            }
            i2 = c2234i.m8225a(4);
            if (i2 <= 2) {
                if (i2 == 1 || i2 == 2) {
                    c2234i.m8228b(32);
                    c2234i.m8228b(32);
                    i = c2234i.m8225a(4) + 1;
                    c2234i.m8228b(1);
                    if (i2 != 1) {
                        j = (long) (a2 * a);
                    } else if (a != 0) {
                        j = C2240k.m8230a((long) a2, (long) a);
                    }
                    c2234i.m8228b((int) (j * ((long) i)));
                }
                return new C2236a(a, a2, jArr, i2, a3);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lookup type greater than 2 not decodable: ");
            stringBuilder.append(i2);
            throw new ParserException(stringBuilder.toString());
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("expected code book to start with [0x56, 0x43, 0x42] at ");
        stringBuilder2.append(c2234i.m8227b());
        throw new ParserException(stringBuilder2.toString());
    }

    /* renamed from: a */
    private static long m8230a(long j, long j2) {
        j = (double) j;
        j2 = (double) j2;
        Double.isNaN(j2);
        return (long) Math.floor(Math.pow(j, 1.0d / j2));
    }
}
