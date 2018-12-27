package com.google.android.exoplayer2.extractor.p130e;

import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.C2261h;
import com.google.android.exoplayer2.extractor.C2267n;
import com.google.android.exoplayer2.extractor.p130e.C2255v.C2254d;
import com.google.android.exoplayer2.p126c.C2173i;
import com.google.android.exoplayer2.p126c.C2175k;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: com.google.android.exoplayer2.extractor.e.i */
public final class C3998i implements C2241h {
    /* renamed from: c */
    private static final double[] f16031c = new double[]{23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    /* renamed from: a */
    private String f16032a;
    /* renamed from: b */
    private C2267n f16033b;
    /* renamed from: d */
    private boolean f16034d;
    /* renamed from: e */
    private long f16035e;
    /* renamed from: f */
    private final boolean[] f16036f = new boolean[4];
    /* renamed from: g */
    private final C2242a f16037g = new C2242a(128);
    /* renamed from: h */
    private boolean f16038h;
    /* renamed from: i */
    private long f16039i;
    /* renamed from: j */
    private long f16040j;
    /* renamed from: k */
    private boolean f16041k;
    /* renamed from: l */
    private boolean f16042l;
    /* renamed from: m */
    private long f16043m;
    /* renamed from: n */
    private long f16044n;

    /* renamed from: com.google.android.exoplayer2.extractor.e.i$a */
    private static final class C2242a {
        /* renamed from: a */
        public int f7084a;
        /* renamed from: b */
        public int f7085b;
        /* renamed from: c */
        public byte[] f7086c;
        /* renamed from: d */
        private boolean f7087d;

        public C2242a(int i) {
            this.f7086c = new byte[i];
        }

        /* renamed from: a */
        public void m8245a() {
            this.f7087d = false;
            this.f7084a = 0;
            this.f7085b = 0;
        }

        /* renamed from: a */
        public boolean m8247a(int i, int i2) {
            if (this.f7087d) {
                if (this.f7085b == 0 && i == 181) {
                    this.f7085b = this.f7084a;
                } else {
                    this.f7084a -= i2;
                    this.f7087d = false;
                    return true;
                }
            } else if (i == 179) {
                this.f7087d = true;
            }
            return false;
        }

        /* renamed from: a */
        public void m8246a(byte[] bArr, int i, int i2) {
            if (this.f7087d) {
                i2 -= i;
                if (this.f7086c.length < this.f7084a + i2) {
                    this.f7086c = Arrays.copyOf(this.f7086c, (this.f7084a + i2) * 2);
                }
                System.arraycopy(bArr, i, this.f7086c, this.f7084a, i2);
                this.f7084a += i2;
            }
        }
    }

    /* renamed from: b */
    public void mo1612b() {
    }

    /* renamed from: a */
    public void mo1608a() {
        C2173i.m7952a(this.f16036f);
        this.f16037g.m8245a();
        this.f16041k = false;
        this.f16038h = false;
        this.f16039i = 0;
    }

    /* renamed from: a */
    public void mo1611a(C2261h c2261h, C2254d c2254d) {
        c2254d.m8283a();
        this.f16032a = c2254d.m8285c();
        this.f16033b = c2261h.mo4053a(c2254d.m8284b(), 2);
    }

    /* renamed from: a */
    public void mo1609a(long j, boolean z) {
        this.f16041k = j != -9223372036854775807L;
        if (this.f16041k) {
            this.f16040j = j;
        }
    }

    /* renamed from: a */
    public void mo1610a(C2175k c2175k) {
        C2175k c2175k2 = c2175k;
        int d = c2175k.m7980d();
        int c = c2175k.m7978c();
        byte[] bArr = c2175k2.f6735a;
        this.f16039i += (long) c2175k.m7976b();
        this.f16033b.mo1607a(c2175k2, c2175k.m7976b());
        int i = d;
        while (true) {
            d = C2173i.m7948a(bArr, d, c, r0.f16036f);
            if (d == c) {
                break;
            }
            int i2;
            int i3 = d + 3;
            int i4 = c2175k2.f6735a[i3] & 255;
            if (!r0.f16034d) {
                i2 = d - i;
                if (i2 > 0) {
                    r0.f16037g.m8246a(bArr, i, d);
                }
                if (r0.f16037g.m8247a(i4, i2 < 0 ? -i2 : 0)) {
                    Pair a = C3998i.m19996a(r0.f16037g, r0.f16032a);
                    r0.f16033b.mo1606a((Format) a.first);
                    r0.f16035e = ((Long) a.second).longValue();
                    r0.f16034d = true;
                }
            }
            if (r0.f16034d && (i4 == 184 || i4 == 0)) {
                i2 = c - d;
                if (r0.f16038h) {
                    int i5 = i4;
                    r0.f16033b.mo1605a(r0.f16044n, r0.f16042l, ((int) (r0.f16039i - r0.f16043m)) - i2, i2, null);
                    r0.f16042l = false;
                    i = i5;
                } else {
                    i = i4;
                }
                if (i == 184) {
                    r0.f16038h = false;
                    r0.f16042l = true;
                } else {
                    r0.f16044n = r0.f16041k ? r0.f16040j : r0.f16044n + r0.f16035e;
                    r0.f16043m = r0.f16039i - ((long) i2);
                    r0.f16041k = false;
                    r0.f16038h = true;
                }
            }
            i = d;
            d = i3;
        }
        if (!r0.f16034d) {
            r0.f16037g.m8246a(bArr, i, c);
        }
    }

    /* renamed from: a */
    private static Pair<Format, Long> m19996a(C2242a c2242a, String str) {
        float f;
        float f2;
        C2242a c2242a2 = c2242a;
        Object copyOf = Arrays.copyOf(c2242a2.f7086c, c2242a2.f7084a);
        int i = copyOf[5] & 255;
        int i2 = ((copyOf[4] & 255) << 4) | (i >> 4);
        int i3 = ((i & 15) << 8) | (copyOf[6] & 255);
        switch ((copyOf[7] & 240) >> 4) {
            case 2:
                f = ((float) (i3 * 4)) / ((float) (i2 * 3));
                break;
            case 3:
                f = ((float) (i3 * 16)) / ((float) (i2 * 9));
                break;
            case 4:
                f = ((float) (i3 * 121)) / ((float) (i2 * 100));
                break;
            default:
                f2 = 1.0f;
                break;
        }
        f2 = f;
        Format a = Format.m7737a(str, "video/mpeg2", null, -1, -1, i2, i3, -1.0f, Collections.singletonList(copyOf), -1, f2, null);
        long j = 0;
        int i4 = (copyOf[7] & 15) - 1;
        if (i4 >= 0 && i4 < f16031c.length) {
            double d = f16031c[i4];
            int i5 = c2242a2.f7085b + 9;
            i4 = (copyOf[i5] & 96) >> 5;
            i5 = copyOf[i5] & 31;
            if (i4 != i5) {
                double d2 = (double) i4;
                Double.isNaN(d2);
                d2 += 1.0d;
                double d3 = (double) (i5 + 1);
                Double.isNaN(d3);
                d *= d2 / d3;
            }
            j = (long) (1000000.0d / d);
        }
        return Pair.create(a, Long.valueOf(j));
    }
}
