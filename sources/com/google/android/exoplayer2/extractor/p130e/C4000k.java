package com.google.android.exoplayer2.extractor.p130e;

import android.util.Log;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.C2261h;
import com.google.android.exoplayer2.extractor.C2267n;
import com.google.android.exoplayer2.extractor.p130e.C2255v.C2254d;
import com.google.android.exoplayer2.p126c.C2173i;
import com.google.android.exoplayer2.p126c.C2175k;
import com.google.android.exoplayer2.p126c.C2176l;
import java.util.Collections;

/* renamed from: com.google.android.exoplayer2.extractor.e.k */
public final class C4000k implements C2241h {
    /* renamed from: a */
    private final C2250s f16059a;
    /* renamed from: b */
    private String f16060b;
    /* renamed from: c */
    private C2267n f16061c;
    /* renamed from: d */
    private C2246a f16062d;
    /* renamed from: e */
    private boolean f16063e;
    /* renamed from: f */
    private final boolean[] f16064f = new boolean[3];
    /* renamed from: g */
    private final C2247n f16065g = new C2247n(32, 128);
    /* renamed from: h */
    private final C2247n f16066h = new C2247n(33, 128);
    /* renamed from: i */
    private final C2247n f16067i = new C2247n(34, 128);
    /* renamed from: j */
    private final C2247n f16068j = new C2247n(39, 128);
    /* renamed from: k */
    private final C2247n f16069k = new C2247n(40, 128);
    /* renamed from: l */
    private long f16070l;
    /* renamed from: m */
    private long f16071m;
    /* renamed from: n */
    private final C2175k f16072n = new C2175k();

    /* renamed from: com.google.android.exoplayer2.extractor.e.k$a */
    private static final class C2246a {
        /* renamed from: a */
        private final C2267n f7122a;
        /* renamed from: b */
        private long f7123b;
        /* renamed from: c */
        private boolean f7124c;
        /* renamed from: d */
        private int f7125d;
        /* renamed from: e */
        private long f7126e;
        /* renamed from: f */
        private boolean f7127f;
        /* renamed from: g */
        private boolean f7128g;
        /* renamed from: h */
        private boolean f7129h;
        /* renamed from: i */
        private boolean f7130i;
        /* renamed from: j */
        private boolean f7131j;
        /* renamed from: k */
        private long f7132k;
        /* renamed from: l */
        private long f7133l;
        /* renamed from: m */
        private boolean f7134m;

        public C2246a(C2267n c2267n) {
            this.f7122a = c2267n;
        }

        /* renamed from: a */
        public void m8263a() {
            this.f7127f = false;
            this.f7128g = false;
            this.f7129h = false;
            this.f7130i = false;
            this.f7131j = false;
        }

        /* renamed from: a */
        public void m8265a(long j, int i, int i2, long j2) {
            this.f7128g = false;
            this.f7129h = false;
            this.f7126e = j2;
            this.f7125d = 0;
            this.f7123b = j;
            j = 1;
            if (i2 >= 32) {
                if (!this.f7131j && this.f7130i) {
                    m8262a(i);
                    this.f7130i = false;
                }
                if (i2 <= 34) {
                    this.f7129h = this.f7131j ^ true;
                    this.f7131j = true;
                }
            }
            boolean z = i2 >= 16 && i2 <= 21;
            this.f7124c = z;
            if (!this.f7124c) {
                if (i2 > 9) {
                    j = null;
                }
            }
            this.f7127f = j;
        }

        /* renamed from: a */
        public void m8266a(byte[] bArr, int i, int i2) {
            if (this.f7127f) {
                int i3 = (i + 2) - this.f7125d;
                if (i3 < i2) {
                    this.f7128g = (bArr[i3] & 128) != null ? 1 : null;
                    this.f7127f = false;
                    return;
                }
                this.f7125d += i2 - i;
            }
        }

        /* renamed from: a */
        public void m8264a(long j, int i) {
            if (this.f7131j && this.f7128g) {
                this.f7134m = this.f7124c;
                this.f7131j = 0;
            } else if (this.f7129h || this.f7128g) {
                if (this.f7130i) {
                    m8262a(i + ((int) (j - this.f7123b)));
                }
                this.f7132k = this.f7123b;
                this.f7133l = this.f7126e;
                this.f7130i = 1;
                this.f7134m = this.f7124c;
            }
        }

        /* renamed from: a */
        private void m8262a(int i) {
            this.f7122a.mo1605a(this.f7133l, this.f7134m, (int) (this.f7123b - this.f7132k), i, null);
        }
    }

    /* renamed from: b */
    public void mo1612b() {
    }

    public C4000k(C2250s c2250s) {
        this.f16059a = c2250s;
    }

    /* renamed from: a */
    public void mo1608a() {
        C2173i.m7952a(this.f16064f);
        this.f16065g.m8267a();
        this.f16066h.m8267a();
        this.f16067i.m8267a();
        this.f16068j.m8267a();
        this.f16069k.m8267a();
        this.f16062d.m8263a();
        this.f16070l = 0;
    }

    /* renamed from: a */
    public void mo1611a(C2261h c2261h, C2254d c2254d) {
        c2254d.m8283a();
        this.f16060b = c2254d.m8285c();
        this.f16061c = c2261h.mo4053a(c2254d.m8284b(), 2);
        this.f16062d = new C2246a(this.f16061c);
        this.f16059a.m8279a(c2261h, c2254d);
    }

    /* renamed from: a */
    public void mo1609a(long j, boolean z) {
        this.f16071m = j;
    }

    /* renamed from: a */
    public void mo1610a(C2175k c2175k) {
        C4000k c4000k = this;
        C2175k c2175k2 = c2175k;
        while (c2175k.m7976b() > 0) {
            int d = c2175k.m7980d();
            int c = c2175k.m7978c();
            byte[] bArr = c2175k2.f6735a;
            c4000k.f16070l += (long) c2175k.m7976b();
            c4000k.f16061c.mo1607a(c2175k2, c2175k.m7976b());
            while (d < c) {
                int a = C2173i.m7948a(bArr, d, c, c4000k.f16064f);
                if (a == c) {
                    m20013a(bArr, d, c);
                    return;
                }
                int c2 = C2173i.m7956c(bArr, a);
                int i = a - d;
                if (i > 0) {
                    m20013a(bArr, d, a);
                }
                int i2 = c - a;
                long j = c4000k.f16070l - ((long) i2);
                int i3 = i < 0 ? -i : 0;
                long j2 = j;
                int i4 = i2;
                m20014b(j2, i4, i3, c4000k.f16071m);
                m20011a(j2, i4, c2, c4000k.f16071m);
                d = a + 3;
            }
        }
    }

    /* renamed from: a */
    private void m20011a(long j, int i, int i2, long j2) {
        if (this.f16063e) {
            this.f16062d.m8265a(j, i, i2, j2);
        } else {
            this.f16065g.m8268a(i2);
            this.f16066h.m8268a(i2);
            this.f16067i.m8268a(i2);
        }
        this.f16068j.m8268a(i2);
        this.f16069k.m8268a(i2);
    }

    /* renamed from: a */
    private void m20013a(byte[] bArr, int i, int i2) {
        if (this.f16063e) {
            this.f16062d.m8266a(bArr, i, i2);
        } else {
            this.f16065g.m8269a(bArr, i, i2);
            this.f16066h.m8269a(bArr, i, i2);
            this.f16067i.m8269a(bArr, i, i2);
        }
        this.f16068j.m8269a(bArr, i, i2);
        this.f16069k.m8269a(bArr, i, i2);
    }

    /* renamed from: b */
    private void m20014b(long j, int i, int i2, long j2) {
        if (this.f16063e) {
            this.f16062d.m8264a(j, i);
        } else {
            this.f16065g.m8271b(i2);
            this.f16066h.m8271b(i2);
            this.f16067i.m8271b(i2);
            if (!(this.f16065g.m8270b() == null || this.f16066h.m8270b() == null || this.f16067i.m8270b() == null)) {
                this.f16061c.mo1606a(C4000k.m20010a(this.f16060b, this.f16065g, this.f16066h, this.f16067i));
                this.f16063e = 1;
            }
        }
        if (this.f16068j.m8271b(i2) != null) {
            this.f16072n.m7974a(this.f16068j.f7135a, C2173i.m7947a(this.f16068j.f7135a, this.f16068j.f7136b));
            this.f16072n.m7981d(5);
            this.f16059a.m8278a(j2, this.f16072n);
        }
        if (this.f16069k.m8271b(i2) != null) {
            this.f16072n.m7974a(this.f16069k.f7135a, C2173i.m7947a(this.f16069k.f7135a, this.f16069k.f7136b));
            this.f16072n.m7981d(5);
            this.f16059a.m8278a(j2, this.f16072n);
        }
    }

    /* renamed from: a */
    private static Format m20010a(String str, C2247n c2247n, C2247n c2247n2, C2247n c2247n3) {
        float f;
        C2247n c2247n4 = c2247n;
        C2247n c2247n5 = c2247n2;
        C2247n c2247n6 = c2247n3;
        Object obj = new byte[((c2247n4.f7136b + c2247n5.f7136b) + c2247n6.f7136b)];
        int i = 0;
        System.arraycopy(c2247n4.f7135a, 0, obj, 0, c2247n4.f7136b);
        System.arraycopy(c2247n5.f7135a, 0, obj, c2247n4.f7136b, c2247n5.f7136b);
        System.arraycopy(c2247n6.f7135a, 0, obj, c2247n4.f7136b + c2247n5.f7136b, c2247n6.f7136b);
        C2176l c2176l = new C2176l(c2247n5.f7135a, 0, c2247n5.f7136b);
        c2176l.m8009a(44);
        int c = c2176l.m8015c(3);
        c2176l.m8009a(1);
        c2176l.m8009a(88);
        c2176l.m8009a(8);
        int i2 = 0;
        for (int i3 = 0; i3 < c; i3++) {
            if (c2176l.m8011a()) {
                i2 += 89;
            }
            if (c2176l.m8011a()) {
                i2 += 8;
            }
        }
        c2176l.m8009a(i2);
        if (c > 0) {
            c2176l.m8009a((8 - c) * 2);
        }
        c2176l.m8014c();
        i2 = c2176l.m8014c();
        if (i2 == 3) {
            c2176l.m8009a(1);
        }
        int c2 = c2176l.m8014c();
        int c3 = c2176l.m8014c();
        if (c2176l.m8011a()) {
            int i4;
            int c4 = c2176l.m8014c();
            int c5 = c2176l.m8014c();
            int c6 = c2176l.m8014c();
            int c7 = c2176l.m8014c();
            if (i2 != 1) {
                if (i2 != 2) {
                    i4 = 1;
                    c2 -= i4 * (c4 + c5);
                    c3 -= (i2 != 1 ? 2 : 1) * (c6 + c7);
                }
            }
            i4 = 2;
            if (i2 != 1) {
            }
            c2 -= i4 * (c4 + c5);
            c3 -= (i2 != 1 ? 2 : 1) * (c6 + c7);
        }
        int i5 = c2;
        int i6 = c3;
        c2176l.m8014c();
        c2176l.m8014c();
        c2 = c2176l.m8014c();
        i2 = c2176l.m8011a() ? 0 : c;
        while (i2 <= c) {
            c2176l.m8014c();
            c2176l.m8014c();
            c2176l.m8014c();
            i2++;
        }
        c2176l.m8014c();
        c2176l.m8014c();
        c2176l.m8014c();
        c2176l.m8014c();
        c2176l.m8014c();
        c2176l.m8014c();
        if (c2176l.m8011a() && c2176l.m8011a()) {
            C4000k.m20012a(c2176l);
        }
        c2176l.m8009a(2);
        if (c2176l.m8011a()) {
            c2176l.m8009a(8);
            c2176l.m8014c();
            c2176l.m8014c();
            c2176l.m8009a(1);
        }
        C4000k.m20015b(c2176l);
        if (c2176l.m8011a()) {
            while (i < c2176l.m8014c()) {
                c2176l.m8009a((c2 + 4) + 1);
                i++;
            }
        }
        c2176l.m8009a(2);
        float f2 = 1.0f;
        if (c2176l.m8011a() && c2176l.m8011a()) {
            c = c2176l.m8015c(8);
            if (c == 255) {
                int c8 = c2176l.m8015c(16);
                int c9 = c2176l.m8015c(16);
                if (!(c8 == 0 || c9 == 0)) {
                    f2 = ((float) c8) / ((float) c9);
                }
                f = f2;
            } else if (c < C2173i.f6728b.length) {
                f = C2173i.f6728b[c];
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unexpected aspect_ratio_idc value: ");
                stringBuilder.append(c);
                Log.w("H265Reader", stringBuilder.toString());
            }
            return Format.m7737a(str, "video/hevc", null, -1, -1, i5, i6, -1.0f, Collections.singletonList(obj), -1, f, null);
        }
        f = 1.0f;
        return Format.m7737a(str, "video/hevc", null, -1, -1, i5, i6, -1.0f, Collections.singletonList(obj), -1, f, null);
    }

    /* renamed from: a */
    private static void m20012a(C2176l c2176l) {
        for (int i = 0; i < 4; i++) {
            int i2 = 0;
            while (i2 < 6) {
                int min;
                if (c2176l.m8011a()) {
                    min = Math.min(64, 1 << ((i << 1) + 4));
                    if (i > 1) {
                        c2176l.m8016d();
                    }
                    for (int i3 = 0; i3 < min; i3++) {
                        c2176l.m8016d();
                    }
                } else {
                    c2176l.m8014c();
                }
                min = 3;
                if (i != 3) {
                    min = 1;
                }
                i2 += min;
            }
        }
    }

    /* renamed from: b */
    private static void m20015b(C2176l c2176l) {
        int c = c2176l.m8014c();
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < c; i2++) {
            if (i2 != 0) {
                z = c2176l.m8011a();
            }
            int i3;
            if (z) {
                c2176l.m8009a(1);
                c2176l.m8014c();
                for (i3 = 0; i3 <= i; i3++) {
                    if (c2176l.m8011a()) {
                        c2176l.m8009a(1);
                    }
                }
            } else {
                i = c2176l.m8014c();
                i3 = c2176l.m8014c();
                int i4 = i + i3;
                for (int i5 = 0; i5 < i; i5++) {
                    c2176l.m8014c();
                    c2176l.m8009a(1);
                }
                for (i = 0; i < i3; i++) {
                    c2176l.m8014c();
                    c2176l.m8009a(1);
                }
                i = i4;
            }
        }
    }
}
