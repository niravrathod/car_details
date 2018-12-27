package okhttp3.internal.http2;

import java.io.ByteArrayOutputStream;
import okio.ByteString;
import okio.C4393d;

/* renamed from: okhttp3.internal.http2.i */
class C2963i {
    /* renamed from: a */
    private static final int[] f12527a = new int[]{8184, 8388568, 268435426, 268435427, 268435428, 268435429, 268435430, 268435431, 268435432, 16777194, 1073741820, 268435433, 268435434, 1073741821, 268435435, 268435436, 268435437, 268435438, 268435439, 268435440, 268435441, 268435442, 1073741822, 268435443, 268435444, 268435445, 268435446, 268435447, 268435448, 268435449, 268435450, 268435451, 20, 1016, 1017, 4090, 8185, 21, 248, 2042, 1018, 1019, 249, 2043, 250, 22, 23, 24, 0, 1, 2, 25, 26, 27, 28, 29, 30, 31, 92, 251, 32764, 32, 4091, 1020, 8186, 33, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 252, 115, 253, 8187, 524272, 8188, 16380, 34, 32765, 3, 35, 4, 36, 5, 37, 38, 39, 6, 116, 117, 40, 41, 42, 7, 43, 118, 44, 8, 9, 45, 119, 120, 121, 122, 123, 32766, 2044, 16381, 8189, 268435452, 1048550, 4194258, 1048551, 1048552, 4194259, 4194260, 4194261, 8388569, 4194262, 8388570, 8388571, 8388572, 8388573, 8388574, 16777195, 8388575, 16777196, 16777197, 4194263, 8388576, 16777198, 8388577, 8388578, 8388579, 8388580, 2097116, 4194264, 8388581, 4194265, 8388582, 8388583, 16777199, 4194266, 2097117, 1048553, 4194267, 4194268, 8388584, 8388585, 2097118, 8388586, 4194269, 4194270, 16777200, 2097119, 4194271, 8388587, 8388588, 2097120, 2097121, 4194272, 2097122, 8388589, 4194273, 8388590, 8388591, 1048554, 4194274, 4194275, 4194276, 8388592, 4194277, 4194278, 8388593, 67108832, 67108833, 1048555, 524273, 4194279, 8388594, 4194280, 33554412, 67108834, 67108835, 67108836, 134217694, 134217695, 67108837, 16777201, 33554413, 524274, 2097123, 67108838, 134217696, 134217697, 67108839, 134217698, 16777202, 2097124, 2097125, 67108840, 67108841, 268435453, 134217699, 134217700, 134217701, 1048556, 16777203, 1048557, 2097126, 4194281, 2097127, 2097128, 8388595, 4194282, 4194283, 33554414, 33554415, 16777204, 16777205, 67108842, 8388596, 67108843, 134217702, 67108844, 67108845, 134217703, 134217704, 134217705, 134217706, 134217707, 268435454, 134217708, 134217709, 134217710, 134217711, 134217712, 67108846};
    /* renamed from: b */
    private static final byte[] f12528b = new byte[]{(byte) 13, (byte) 23, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 24, (byte) 30, (byte) 28, (byte) 28, (byte) 30, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 30, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 6, (byte) 10, (byte) 10, (byte) 12, (byte) 13, (byte) 6, (byte) 8, (byte) 11, (byte) 10, (byte) 10, (byte) 8, (byte) 11, (byte) 8, (byte) 6, (byte) 6, (byte) 6, (byte) 5, (byte) 5, (byte) 5, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 7, (byte) 8, (byte) 15, (byte) 6, (byte) 12, (byte) 10, (byte) 13, (byte) 6, (byte) 7, (byte) 7, (byte) 7, (byte) 7, (byte) 7, (byte) 7, (byte) 7, (byte) 7, (byte) 7, (byte) 7, (byte) 7, (byte) 7, (byte) 7, (byte) 7, (byte) 7, (byte) 7, (byte) 7, (byte) 7, (byte) 7, (byte) 7, (byte) 7, (byte) 7, (byte) 8, (byte) 7, (byte) 8, (byte) 13, (byte) 19, (byte) 13, (byte) 14, (byte) 6, (byte) 15, (byte) 5, (byte) 6, (byte) 5, (byte) 6, (byte) 5, (byte) 6, (byte) 6, (byte) 6, (byte) 5, (byte) 7, (byte) 7, (byte) 6, (byte) 6, (byte) 6, (byte) 5, (byte) 6, (byte) 7, (byte) 6, (byte) 5, (byte) 5, (byte) 6, (byte) 7, (byte) 7, (byte) 7, (byte) 7, (byte) 7, (byte) 15, (byte) 11, (byte) 14, (byte) 13, (byte) 28, (byte) 20, (byte) 22, (byte) 20, (byte) 20, (byte) 22, (byte) 22, (byte) 22, (byte) 23, (byte) 22, (byte) 23, (byte) 23, (byte) 23, (byte) 23, (byte) 23, (byte) 24, (byte) 23, (byte) 24, (byte) 24, (byte) 22, (byte) 23, (byte) 24, (byte) 23, (byte) 23, (byte) 23, (byte) 23, (byte) 21, (byte) 22, (byte) 23, (byte) 22, (byte) 23, (byte) 23, (byte) 24, (byte) 22, (byte) 21, (byte) 20, (byte) 22, (byte) 22, (byte) 23, (byte) 23, (byte) 21, (byte) 23, (byte) 22, (byte) 22, (byte) 24, (byte) 21, (byte) 22, (byte) 23, (byte) 23, (byte) 21, (byte) 21, (byte) 22, (byte) 21, (byte) 23, (byte) 22, (byte) 23, (byte) 23, (byte) 20, (byte) 22, (byte) 22, (byte) 22, (byte) 23, (byte) 22, (byte) 22, (byte) 23, (byte) 26, (byte) 26, (byte) 20, (byte) 19, (byte) 22, (byte) 23, (byte) 22, (byte) 25, (byte) 26, (byte) 26, (byte) 26, (byte) 27, (byte) 27, (byte) 26, (byte) 24, (byte) 25, (byte) 19, (byte) 21, (byte) 26, (byte) 27, (byte) 27, (byte) 26, (byte) 27, (byte) 24, (byte) 21, (byte) 21, (byte) 26, (byte) 26, (byte) 28, (byte) 27, (byte) 27, (byte) 27, (byte) 20, (byte) 24, (byte) 20, (byte) 21, (byte) 22, (byte) 21, (byte) 21, (byte) 23, (byte) 22, (byte) 22, (byte) 25, (byte) 25, (byte) 24, (byte) 24, (byte) 26, (byte) 23, (byte) 26, (byte) 27, (byte) 26, (byte) 26, (byte) 27, (byte) 27, (byte) 27, (byte) 27, (byte) 27, (byte) 28, (byte) 27, (byte) 27, (byte) 27, (byte) 27, (byte) 27, (byte) 26};
    /* renamed from: c */
    private static final C2963i f12529c = new C2963i();
    /* renamed from: d */
    private final C2962a f12530d = new C2962a();

    /* renamed from: okhttp3.internal.http2.i$a */
    private static final class C2962a {
        /* renamed from: a */
        final C2962a[] f12524a;
        /* renamed from: b */
        final int f12525b;
        /* renamed from: c */
        final int f12526c;

        C2962a() {
            this.f12524a = new C2962a[256];
            this.f12525b = 0;
            this.f12526c = 0;
        }

        C2962a(int i, int i2) {
            this.f12524a = null;
            this.f12525b = i;
            i = i2 & 7;
            if (i == 0) {
                i = 8;
            }
            this.f12526c = i;
        }
    }

    /* renamed from: a */
    public static C2963i m14424a() {
        return f12529c;
    }

    private C2963i() {
        m14426b();
    }

    /* renamed from: a */
    void m14428a(ByteString byteString, C4393d c4393d) {
        long j = 0;
        int i = 0;
        for (int i2 = 0; i2 < byteString.m14660h(); i2++) {
            int a = byteString.m14646a(i2) & 255;
            int i3 = f12527a[a];
            byte b = f12528b[a];
            j = (j << b) | ((long) i3);
            i += b;
            while (i >= 8) {
                i -= 8;
                c4393d.mo4568k((int) (j >> i));
            }
        }
        if (i > 0) {
            c4393d.mo4568k((int) ((j << (8 - i)) | ((long) (255 >>> i))));
        }
    }

    /* renamed from: a */
    int m14427a(ByteString byteString) {
        long j = 0;
        for (int i = 0; i < byteString.m14660h(); i++) {
            j += (long) f12528b[byteString.m14646a(i) & 255];
        }
        return (int) ((j + 7) >> 3);
    }

    /* renamed from: a */
    byte[] m14429a(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C2962a c2962a = this.f12530d;
        int i = 0;
        int i2 = 0;
        for (byte b : bArr) {
            i = (i << 8) | (b & 255);
            i2 += 8;
            while (i2 >= 8) {
                c2962a = c2962a.f12524a[(i >>> (i2 - 8)) & 255];
                if (c2962a.f12524a == null) {
                    byteArrayOutputStream.write(c2962a.f12525b);
                    i2 -= c2962a.f12526c;
                    c2962a = this.f12530d;
                } else {
                    i2 -= 8;
                }
            }
        }
        while (i2 > 0) {
            bArr = c2962a.f12524a[(i << (8 - i2)) & 255];
            if (bArr.f12524a != null) {
                break;
            } else if (bArr.f12526c > i2) {
                break;
            } else {
                byteArrayOutputStream.write(bArr.f12525b);
                i2 -= bArr.f12526c;
                c2962a = this.f12530d;
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: b */
    private void m14426b() {
        for (int i = 0; i < f12528b.length; i++) {
            m14425a(i, f12527a[i], f12528b[i]);
        }
    }

    /* renamed from: a */
    private void m14425a(int i, int i2, byte b) {
        int i3;
        C2962a c2962a = new C2962a(i, b);
        i = this.f12530d;
        while (b > (byte) 8) {
            b = (byte) (b - 8);
            i3 = (i2 >>> b) & 255;
            if (i.f12524a != null) {
                if (i.f12524a[i3] == null) {
                    i.f12524a[i3] = new C2962a();
                }
                i = i.f12524a[i3];
            } else {
                throw new IllegalStateException("invalid dictionary: prefix not unique");
            }
        }
        i3 = 8 - b;
        i2 = (i2 << i3) & 255;
        b = (byte) 1 << i3;
        for (i3 = i2; i3 < i2 + b; i3++) {
            i.f12524a[i3] = c2962a;
        }
    }
}
