package com.google.android.exoplayer2.p126c;

import android.util.Log;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.c.i */
public final class C2173i {
    /* renamed from: a */
    public static final byte[] f6727a = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 1};
    /* renamed from: b */
    public static final float[] f6728b = new float[]{1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    /* renamed from: c */
    private static final Object f6729c = new Object();
    /* renamed from: d */
    private static int[] f6730d = new int[10];

    /* renamed from: com.google.android.exoplayer2.c.i$a */
    public static final class C2171a {
        /* renamed from: a */
        public final int f6714a;
        /* renamed from: b */
        public final int f6715b;
        /* renamed from: c */
        public final boolean f6716c;

        public C2171a(int i, int i2, boolean z) {
            this.f6714a = i;
            this.f6715b = i2;
            this.f6716c = z;
        }
    }

    /* renamed from: com.google.android.exoplayer2.c.i$b */
    public static final class C2172b {
        /* renamed from: a */
        public final int f6717a;
        /* renamed from: b */
        public final int f6718b;
        /* renamed from: c */
        public final int f6719c;
        /* renamed from: d */
        public final float f6720d;
        /* renamed from: e */
        public final boolean f6721e;
        /* renamed from: f */
        public final boolean f6722f;
        /* renamed from: g */
        public final int f6723g;
        /* renamed from: h */
        public final int f6724h;
        /* renamed from: i */
        public final int f6725i;
        /* renamed from: j */
        public final boolean f6726j;

        public C2172b(int i, int i2, int i3, float f, boolean z, boolean z2, int i4, int i5, int i6, boolean z3) {
            this.f6717a = i;
            this.f6718b = i2;
            this.f6719c = i3;
            this.f6720d = f;
            this.f6721e = z;
            this.f6722f = z2;
            this.f6723g = i4;
            this.f6724h = i5;
            this.f6725i = i6;
            this.f6726j = z3;
        }
    }

    /* renamed from: a */
    public static int m7947a(byte[] bArr, int i) {
        synchronized (f6729c) {
            int i2;
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                i3 = C2173i.m7957c(bArr, i3, i);
                if (i3 < i) {
                    if (f6730d.length <= i4) {
                        f6730d = Arrays.copyOf(f6730d, f6730d.length * 2);
                    }
                    i2 = i4 + 1;
                    f6730d[i4] = i3;
                    i3 += 3;
                    i4 = i2;
                }
            }
            i -= i4;
            int i5 = 0;
            i2 = 0;
            for (i3 = 0; i3 < i4; i3++) {
                int i6 = f6730d[i3] - i2;
                System.arraycopy(bArr, i2, bArr, i5, i6);
                i5 += i6;
                int i7 = i5 + 1;
                bArr[i5] = (byte) 0;
                i5 = i7 + 1;
                bArr[i7] = (byte) 0;
                i2 += i6 + 3;
            }
            System.arraycopy(bArr, i2, bArr, i5, i - i5);
        }
        return i;
    }

    /* renamed from: a */
    public static void m7951a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i + 1;
            if (i3 < position) {
                int i4 = byteBuffer.get(i) & 255;
                if (i2 == 3) {
                    if (i4 == 1 && (byteBuffer.get(i3) & 31) == 7) {
                        ByteBuffer duplicate = byteBuffer.duplicate();
                        duplicate.position(i - 3);
                        duplicate.limit(position);
                        byteBuffer.position(0);
                        byteBuffer.put(duplicate);
                        return;
                    }
                } else if (i4 == 0) {
                    i2++;
                }
                if (i4 != 0) {
                    i2 = 0;
                }
                i = i3;
            } else {
                byteBuffer.clear();
                return;
            }
        }
    }

    /* renamed from: a */
    public static boolean m7953a(String str, byte b) {
        if ("video/avc".equals(str) && (b & 31) == 6) {
            return true;
        }
        if ("video/hevc".equals(str) == null || ((b & 126) >> 1) != (byte) 39) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static int m7954b(byte[] bArr, int i) {
        return bArr[i + 3] & 31;
    }

    /* renamed from: c */
    public static int m7956c(byte[] bArr, int i) {
        return (bArr[i + 3] & 126) >> 1;
    }

    /* renamed from: a */
    public static C2172b m7949a(byte[] bArr, int i, int i2) {
        boolean z;
        int c;
        int c2;
        int i3;
        int c3;
        boolean a;
        long c4;
        int i4;
        boolean z2;
        int c5;
        boolean a2;
        int i5;
        int c6;
        int c7;
        int c8;
        int i6;
        int i7;
        float f;
        int c9;
        int c10;
        float f2;
        StringBuilder stringBuilder;
        C2176l c2176l = new C2176l(bArr, i, i2);
        c2176l.m8009a(8);
        int c11 = c2176l.m8015c(8);
        c2176l.m8009a(16);
        int c12 = c2176l.m8014c();
        int i8 = 1;
        if (!(c11 == 100 || c11 == 110 || c11 == 122 || c11 == 244 || c11 == 44 || c11 == 83 || c11 == 86 || c11 == 118 || c11 == 128)) {
            if (c11 != 138) {
                c11 = 1;
                z = false;
                c = c2176l.m8014c() + 4;
                c2 = c2176l.m8014c();
                if (c2 == 0) {
                    i3 = c12;
                    c3 = c2176l.m8014c() + 4;
                } else if (c2 != 1) {
                    a = c2176l.m8011a();
                    c2176l.m8016d();
                    c2176l.m8016d();
                    c4 = (long) c2176l.m8014c();
                    i3 = c12;
                    for (i4 = 0; ((long) i4) < c4; i4++) {
                        c2176l.m8014c();
                    }
                    z2 = a;
                    c3 = 0;
                    c2176l.m8014c();
                    c2176l.m8009a(1);
                    c5 = c2176l.m8014c() + 1;
                    c12 = c2176l.m8014c() + 1;
                    a2 = c2176l.m8011a();
                    i5 = (2 - a2) * c12;
                    if (!a2) {
                        c2176l.m8009a(1);
                    }
                    c2176l.m8009a(1);
                    c5 *= 16;
                    i5 *= 16;
                    if (c2176l.m8011a()) {
                        c12 = c2176l.m8014c();
                        c6 = c2176l.m8014c();
                        c7 = c2176l.m8014c();
                        c8 = c2176l.m8014c();
                        if (c11 != 0) {
                            i6 = 2 - a2;
                            i7 = 1;
                        } else {
                            i7 = c11 != 3 ? 1 : 2;
                            if (c11 == 1) {
                                i8 = 2;
                            }
                            i6 = (2 - a2) * i8;
                        }
                        c5 -= (c12 + c6) * i7;
                        i5 -= (c7 + c8) * i6;
                    }
                    i6 = c5;
                    i8 = i5;
                    f = 1.0f;
                    if (c2176l.m8011a() && c2176l.m8011a()) {
                        c9 = c2176l.m8015c(8);
                        if (c9 != 255) {
                            c9 = c2176l.m8015c(16);
                            c10 = c2176l.m8015c(16);
                            if (!(c9 == 0 || c10 == 0)) {
                                f = ((float) c9) / ((float) c10);
                            }
                            f2 = f;
                        } else if (c9 >= f6728b.length) {
                            f2 = f6728b[c9];
                        } else {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("Unexpected aspect_ratio_idc value: ");
                            stringBuilder.append(c9);
                            Log.w("NalUnitUtil", stringBuilder.toString());
                        }
                        return new C2172b(i3, i6, i8, f2, z, a2, c, c2, c3, z2);
                    }
                    f2 = 1.0f;
                    return new C2172b(i3, i6, i8, f2, z, a2, c, c2, c3, z2);
                } else {
                    i3 = c12;
                    c3 = 0;
                }
                z2 = false;
                c2176l.m8014c();
                c2176l.m8009a(1);
                c5 = c2176l.m8014c() + 1;
                c12 = c2176l.m8014c() + 1;
                a2 = c2176l.m8011a();
                i5 = (2 - a2) * c12;
                if (a2) {
                    c2176l.m8009a(1);
                }
                c2176l.m8009a(1);
                c5 *= 16;
                i5 *= 16;
                if (c2176l.m8011a()) {
                    c12 = c2176l.m8014c();
                    c6 = c2176l.m8014c();
                    c7 = c2176l.m8014c();
                    c8 = c2176l.m8014c();
                    if (c11 != 0) {
                        if (c11 != 3) {
                        }
                        if (c11 == 1) {
                            i8 = 2;
                        }
                        i6 = (2 - a2) * i8;
                    } else {
                        i6 = 2 - a2;
                        i7 = 1;
                    }
                    c5 -= (c12 + c6) * i7;
                    i5 -= (c7 + c8) * i6;
                }
                i6 = c5;
                i8 = i5;
                f = 1.0f;
                c9 = c2176l.m8015c(8);
                if (c9 != 255) {
                    c9 = c2176l.m8015c(16);
                    c10 = c2176l.m8015c(16);
                    f = ((float) c9) / ((float) c10);
                    f2 = f;
                } else if (c9 >= f6728b.length) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Unexpected aspect_ratio_idc value: ");
                    stringBuilder.append(c9);
                    Log.w("NalUnitUtil", stringBuilder.toString());
                    f2 = 1.0f;
                } else {
                    f2 = f6728b[c9];
                }
                return new C2172b(i3, i6, i8, f2, z, a2, c, c2, c3, z2);
            }
        }
        c11 = c2176l.m8014c();
        a = c11 == 3 ? c2176l.m8011a() : false;
        c2176l.m8014c();
        c2176l.m8014c();
        c2176l.m8009a(1);
        if (c2176l.m8011a()) {
            int i9 = c11 != 3 ? 8 : 12;
            i4 = 0;
            while (i4 < i9) {
                if (c2176l.m8011a()) {
                    C2173i.m7950a(c2176l, i4 < 6 ? 16 : 64);
                }
                i4++;
            }
        }
        z = a;
        c = c2176l.m8014c() + 4;
        c2 = c2176l.m8014c();
        if (c2 == 0) {
            i3 = c12;
            c3 = c2176l.m8014c() + 4;
        } else if (c2 != 1) {
            i3 = c12;
            c3 = 0;
        } else {
            a = c2176l.m8011a();
            c2176l.m8016d();
            c2176l.m8016d();
            c4 = (long) c2176l.m8014c();
            i3 = c12;
            for (i4 = 0; ((long) i4) < c4; i4++) {
                c2176l.m8014c();
            }
            z2 = a;
            c3 = 0;
            c2176l.m8014c();
            c2176l.m8009a(1);
            c5 = c2176l.m8014c() + 1;
            c12 = c2176l.m8014c() + 1;
            a2 = c2176l.m8011a();
            i5 = (2 - a2) * c12;
            if (a2) {
                c2176l.m8009a(1);
            }
            c2176l.m8009a(1);
            c5 *= 16;
            i5 *= 16;
            if (c2176l.m8011a()) {
                c12 = c2176l.m8014c();
                c6 = c2176l.m8014c();
                c7 = c2176l.m8014c();
                c8 = c2176l.m8014c();
                if (c11 != 0) {
                    i6 = 2 - a2;
                    i7 = 1;
                } else {
                    if (c11 != 3) {
                    }
                    if (c11 == 1) {
                        i8 = 2;
                    }
                    i6 = (2 - a2) * i8;
                }
                c5 -= (c12 + c6) * i7;
                i5 -= (c7 + c8) * i6;
            }
            i6 = c5;
            i8 = i5;
            f = 1.0f;
            c9 = c2176l.m8015c(8);
            if (c9 != 255) {
                c9 = c2176l.m8015c(16);
                c10 = c2176l.m8015c(16);
                f = ((float) c9) / ((float) c10);
                f2 = f;
            } else if (c9 >= f6728b.length) {
                f2 = f6728b[c9];
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Unexpected aspect_ratio_idc value: ");
                stringBuilder.append(c9);
                Log.w("NalUnitUtil", stringBuilder.toString());
                f2 = 1.0f;
            }
            return new C2172b(i3, i6, i8, f2, z, a2, c, c2, c3, z2);
        }
        z2 = false;
        c2176l.m8014c();
        c2176l.m8009a(1);
        c5 = c2176l.m8014c() + 1;
        c12 = c2176l.m8014c() + 1;
        a2 = c2176l.m8011a();
        i5 = (2 - a2) * c12;
        if (a2) {
            c2176l.m8009a(1);
        }
        c2176l.m8009a(1);
        c5 *= 16;
        i5 *= 16;
        if (c2176l.m8011a()) {
            c12 = c2176l.m8014c();
            c6 = c2176l.m8014c();
            c7 = c2176l.m8014c();
            c8 = c2176l.m8014c();
            if (c11 != 0) {
                if (c11 != 3) {
                }
                if (c11 == 1) {
                    i8 = 2;
                }
                i6 = (2 - a2) * i8;
            } else {
                i6 = 2 - a2;
                i7 = 1;
            }
            c5 -= (c12 + c6) * i7;
            i5 -= (c7 + c8) * i6;
        }
        i6 = c5;
        i8 = i5;
        f = 1.0f;
        c9 = c2176l.m8015c(8);
        if (c9 != 255) {
            c9 = c2176l.m8015c(16);
            c10 = c2176l.m8015c(16);
            f = ((float) c9) / ((float) c10);
            f2 = f;
        } else if (c9 >= f6728b.length) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected aspect_ratio_idc value: ");
            stringBuilder.append(c9);
            Log.w("NalUnitUtil", stringBuilder.toString());
            f2 = 1.0f;
        } else {
            f2 = f6728b[c9];
        }
        return new C2172b(i3, i6, i8, f2, z, a2, c, c2, c3, z2);
    }

    /* renamed from: b */
    public static C2171a m7955b(byte[] bArr, int i, int i2) {
        C2176l c2176l = new C2176l(bArr, i, i2);
        c2176l.m8009a(8);
        bArr = c2176l.m8014c();
        i = c2176l.m8014c();
        c2176l.m8009a(1);
        return new C2171a(bArr, i, c2176l.m8011a());
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public static int m7948a(byte[] r7, int r8, int r9, boolean[] r10) {
        /*
        r0 = r9 - r8;
        r1 = 0;
        r2 = 1;
        if (r0 < 0) goto L_0x0008;
    L_0x0006:
        r3 = 1;
        goto L_0x0009;
    L_0x0008:
        r3 = 0;
    L_0x0009:
        com.google.android.exoplayer2.p126c.C2163a.m7918b(r3);
        if (r0 != 0) goto L_0x000f;
    L_0x000e:
        return r9;
    L_0x000f:
        r3 = 2;
        if (r10 == 0) goto L_0x0040;
    L_0x0012:
        r4 = r10[r1];
        if (r4 == 0) goto L_0x001c;
    L_0x0016:
        com.google.android.exoplayer2.p126c.C2173i.m7952a(r10);
        r8 = r8 + -3;
        return r8;
    L_0x001c:
        if (r0 <= r2) goto L_0x002b;
    L_0x001e:
        r4 = r10[r2];
        if (r4 == 0) goto L_0x002b;
    L_0x0022:
        r4 = r7[r8];
        if (r4 != r2) goto L_0x002b;
    L_0x0026:
        com.google.android.exoplayer2.p126c.C2173i.m7952a(r10);
        r8 = r8 - r3;
        return r8;
    L_0x002b:
        if (r0 <= r3) goto L_0x0040;
    L_0x002d:
        r4 = r10[r3];
        if (r4 == 0) goto L_0x0040;
    L_0x0031:
        r4 = r7[r8];
        if (r4 != 0) goto L_0x0040;
    L_0x0035:
        r4 = r8 + 1;
        r4 = r7[r4];
        if (r4 != r2) goto L_0x0040;
    L_0x003b:
        com.google.android.exoplayer2.p126c.C2173i.m7952a(r10);
        r8 = r8 - r2;
        return r8;
    L_0x0040:
        r4 = r9 + -1;
        r8 = r8 + r3;
    L_0x0043:
        if (r8 >= r4) goto L_0x0067;
    L_0x0045:
        r5 = r7[r8];
        r5 = r5 & 254;
        if (r5 == 0) goto L_0x004c;
    L_0x004b:
        goto L_0x0064;
    L_0x004c:
        r5 = r8 + -2;
        r6 = r7[r5];
        if (r6 != 0) goto L_0x0062;
    L_0x0052:
        r6 = r8 + -1;
        r6 = r7[r6];
        if (r6 != 0) goto L_0x0062;
    L_0x0058:
        r6 = r7[r8];
        if (r6 != r2) goto L_0x0062;
    L_0x005c:
        if (r10 == 0) goto L_0x0061;
    L_0x005e:
        com.google.android.exoplayer2.p126c.C2173i.m7952a(r10);
    L_0x0061:
        return r5;
    L_0x0062:
        r8 = r8 + -2;
    L_0x0064:
        r8 = r8 + 3;
        goto L_0x0043;
    L_0x0067:
        if (r10 == 0) goto L_0x00bd;
    L_0x0069:
        if (r0 <= r3) goto L_0x007f;
    L_0x006b:
        r8 = r9 + -3;
        r8 = r7[r8];
        if (r8 != 0) goto L_0x007d;
    L_0x0071:
        r8 = r9 + -2;
        r8 = r7[r8];
        if (r8 != 0) goto L_0x007d;
    L_0x0077:
        r8 = r7[r4];
        if (r8 != r2) goto L_0x007d;
    L_0x007b:
        r8 = 1;
        goto L_0x0099;
    L_0x007d:
        r8 = 0;
        goto L_0x0099;
    L_0x007f:
        if (r0 != r3) goto L_0x0090;
    L_0x0081:
        r8 = r10[r3];
        if (r8 == 0) goto L_0x007d;
    L_0x0085:
        r8 = r9 + -2;
        r8 = r7[r8];
        if (r8 != 0) goto L_0x007d;
    L_0x008b:
        r8 = r7[r4];
        if (r8 != r2) goto L_0x007d;
    L_0x008f:
        goto L_0x007b;
    L_0x0090:
        r8 = r10[r2];
        if (r8 == 0) goto L_0x007d;
    L_0x0094:
        r8 = r7[r4];
        if (r8 != r2) goto L_0x007d;
    L_0x0098:
        goto L_0x007b;
    L_0x0099:
        r10[r1] = r8;
        if (r0 <= r2) goto L_0x00ab;
    L_0x009d:
        r8 = r9 + -2;
        r8 = r7[r8];
        if (r8 != 0) goto L_0x00a9;
    L_0x00a3:
        r8 = r7[r4];
        if (r8 != 0) goto L_0x00a9;
    L_0x00a7:
        r8 = 1;
        goto L_0x00b4;
    L_0x00a9:
        r8 = 0;
        goto L_0x00b4;
    L_0x00ab:
        r8 = r10[r3];
        if (r8 == 0) goto L_0x00a9;
    L_0x00af:
        r8 = r7[r4];
        if (r8 != 0) goto L_0x00a9;
    L_0x00b3:
        goto L_0x00a7;
    L_0x00b4:
        r10[r2] = r8;
        r7 = r7[r4];
        if (r7 != 0) goto L_0x00bb;
    L_0x00ba:
        r1 = 1;
    L_0x00bb:
        r10[r3] = r1;
    L_0x00bd:
        return r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.c.i.a(byte[], int, int, boolean[]):int");
    }

    /* renamed from: a */
    public static void m7952a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    /* renamed from: c */
    private static int m7957c(byte[] bArr, int i, int i2) {
        while (i < i2 - 2) {
            if (bArr[i] == (byte) 0 && bArr[i + 1] == (byte) 0 && bArr[i + 2] == (byte) 3) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: a */
    private static void m7950a(C2176l c2176l, int i) {
        int i2 = 8;
        int i3 = 8;
        for (int i4 = 0; i4 < i; i4++) {
            if (i2 != 0) {
                i2 = ((c2176l.m8016d() + i3) + 256) % 256;
            }
            if (i2 != 0) {
                i3 = i2;
            }
        }
    }
}
