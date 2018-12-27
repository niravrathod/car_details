package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.p126c.C2174j;
import com.google.android.exoplayer2.p126c.C2175k;
import com.google.android.gms.ads.AdRequest;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.exoplayer2.audio.a */
public final class C2137a {
    /* renamed from: a */
    private static final int[] f6605a = new int[]{1, 2, 3, 6};
    /* renamed from: b */
    private static final int[] f6606b = new int[]{48000, 44100, 32000};
    /* renamed from: c */
    private static final int[] f6607c = new int[]{24000, 22050, 16000};
    /* renamed from: d */
    private static final int[] f6608d = new int[]{2, 1, 2, 3, 3, 4, 4, 5};
    /* renamed from: e */
    private static final int[] f6609e = new int[]{32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, AdRequest.MAX_CONTENT_URL_LENGTH, 576, 640};
    /* renamed from: f */
    private static final int[] f6610f = new int[]{69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: com.google.android.exoplayer2.audio.a$a */
    public static final class C2136a {
        /* renamed from: a */
        public final String f6600a;
        /* renamed from: b */
        public final int f6601b;
        /* renamed from: c */
        public final int f6602c;
        /* renamed from: d */
        public final int f6603d;
        /* renamed from: e */
        public final int f6604e;

        private C2136a(String str, int i, int i2, int i3, int i4) {
            this.f6600a = str;
            this.f6602c = i;
            this.f6601b = i2;
            this.f6603d = i3;
            this.f6604e = i4;
        }
    }

    /* renamed from: a */
    public static int m7846a() {
        return 1536;
    }

    /* renamed from: a */
    public static Format m7850a(C2175k c2175k, String str, String str2, DrmInitData drmInitData) {
        int i = f6606b[(c2175k.m7986g() & 192) >> 6];
        int g = c2175k.m7986g();
        int i2 = f6608d[(g & 56) >> 3];
        if ((g & 4) != 0) {
            i2++;
        }
        return Format.m7741a(str, "audio/ac3", null, -1, -1, i2, i, null, drmInitData, 0, str2);
    }

    /* renamed from: b */
    public static Format m7852b(C2175k c2175k, String str, String str2, DrmInitData drmInitData) {
        C2175k c2175k2 = c2175k;
        c2175k.m7981d(2);
        int i = f6606b[(c2175k.m7986g() & 192) >> 6];
        int g = c2175k.m7986g();
        int i2 = f6608d[(g & 14) >> 1];
        if ((g & 1) != 0) {
            i2++;
        }
        return Format.m7741a(str, "audio/eac3", null, -1, -1, i2, i, null, drmInitData, 0, str2);
    }

    /* renamed from: a */
    public static C2136a m7851a(C2174j c2174j) {
        int c;
        int i;
        int i2;
        int i3;
        String str;
        int b = c2174j.m7963b();
        c2174j.m7964b(40);
        Object obj = c2174j.m7966c(5) == 16 ? 1 : null;
        c2174j.m7960a(b);
        b = 6;
        String str2;
        int c2;
        int c3;
        if (obj != null) {
            str2 = "audio/eac3";
            c2174j.m7964b(21);
            c2 = (c2174j.m7966c(11) + 1) * 2;
            c3 = c2174j.m7966c(2);
            if (c3 == 3) {
                c3 = f6607c[c2174j.m7966c(2)];
            } else {
                b = f6605a[c2174j.m7966c(2)];
                c3 = f6606b[c3];
            }
            b *= 256;
            c = c2174j.m7966c(3);
            i = b;
            i2 = c3;
            i3 = c2;
            str = str2;
        } else {
            str2 = "audio/ac3";
            c2174j.m7964b(32);
            c2 = c2174j.m7966c(2);
            b = C2137a.m7847a(c2, c2174j.m7966c(6));
            c2174j.m7964b(8);
            c = c2174j.m7966c(3);
            if (!((c & 1) == 0 || c == 1)) {
                c2174j.m7964b(2);
            }
            if ((c & 4) != 0) {
                c2174j.m7964b(2);
            }
            if (c == 2) {
                c2174j.m7964b(2);
            }
            c3 = f6606b[c2];
            i3 = b;
            str = str2;
            i2 = c3;
            i = 1536;
        }
        return new C2136a(str, f6608d[c] + c2174j.m7968d(), i2, i3, i);
    }

    /* renamed from: a */
    public static int m7849a(byte[] bArr) {
        if (bArr.length < 5) {
            return -1;
        }
        return C2137a.m7847a((bArr[4] & 192) >> 6, bArr[4] & 63);
    }

    /* renamed from: a */
    public static int m7848a(ByteBuffer byteBuffer) {
        int i = 6;
        if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
            i = f6605a[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4];
        }
        return i * 256;
    }

    /* renamed from: a */
    private static int m7847a(int i, int i2) {
        int i3 = i2 / 2;
        if (i >= 0 && i < f6606b.length && i2 >= 0) {
            if (i3 < f6610f.length) {
                i = f6606b[i];
                if (i == 44100) {
                    return (f6610f[i3] + (i2 % 2)) * 2;
                }
                i2 = f6609e[i3];
                return i == 32000 ? i2 * 6 : i2 * 4;
            }
        }
        return -1;
    }
}
