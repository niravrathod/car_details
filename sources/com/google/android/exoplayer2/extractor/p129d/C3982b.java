package com.google.android.exoplayer2.extractor.p129d;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.C2260g;
import com.google.android.exoplayer2.extractor.C2266m;
import com.google.android.exoplayer2.extractor.p129d.C2233h.C2232a;
import com.google.android.exoplayer2.p126c.C2167e;
import com.google.android.exoplayer2.p126c.C2175k;
import com.google.android.exoplayer2.p126c.C2186s;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: com.google.android.exoplayer2.extractor.d.b */
final class C3982b extends C2233h {
    /* renamed from: a */
    private C2167e f15941a;
    /* renamed from: b */
    private C3981a f15942b;

    /* renamed from: com.google.android.exoplayer2.extractor.d.b$a */
    private class C3981a implements C2230f, C2266m {
        /* renamed from: a */
        final /* synthetic */ C3982b f15936a;
        /* renamed from: b */
        private long[] f15937b;
        /* renamed from: c */
        private long[] f15938c;
        /* renamed from: d */
        private long f15939d = -1;
        /* renamed from: e */
        private long f15940e = -1;

        /* renamed from: a */
        public boolean mo1578a() {
            return true;
        }

        /* renamed from: c */
        public C2266m mo1599c() {
            return this;
        }

        public C3981a(C3982b c3982b) {
            this.f15936a = c3982b;
        }

        /* renamed from: c */
        public void m19888c(long j) {
            this.f15939d = j;
        }

        /* renamed from: a */
        public void m19883a(C2175k c2175k) {
            c2175k.m7981d(1);
            int k = c2175k.m7990k() / 18;
            this.f15937b = new long[k];
            this.f15938c = new long[k];
            for (int i = 0; i < k; i++) {
                this.f15937b[i] = c2175k.m7995p();
                this.f15938c[i] = c2175k.m7995p();
                c2175k.m7981d(2);
            }
        }

        /* renamed from: a */
        public long mo1598a(C2260g c2260g) {
            if (this.f15940e < 0) {
                return -1;
            }
            long j = -(this.f15940e + 2);
            this.f15940e = -1;
            return j;
        }

        /* renamed from: a */
        public long mo1597a(long j) {
            j = this.f15936a.m8222b(j);
            this.f15940e = this.f15937b[C2186s.m8043a(this.f15937b, j, true, true)];
            return j;
        }

        /* renamed from: b */
        public long mo1580b(long j) {
            return this.f15939d + this.f15938c[C2186s.m8043a(this.f15937b, this.f15936a.m8222b(j), true, true)];
        }

        /* renamed from: b */
        public long mo1579b() {
            return this.f15936a.f15941a.m7934b();
        }
    }

    C3982b() {
    }

    /* renamed from: a */
    public static boolean m19890a(C2175k c2175k) {
        return (c2175k.m7976b() >= 5 && c2175k.m7986g() == 127 && c2175k.m7991l() == 1179402563) ? true : null;
    }

    /* renamed from: a */
    protected void mo1600a(boolean z) {
        super.mo1600a(z);
        if (z) {
            this.f15941a = null;
            this.f15942b = null;
        }
    }

    /* renamed from: a */
    private static boolean m19891a(byte[] bArr) {
        return bArr[0] == -1;
    }

    /* renamed from: b */
    protected long mo1602b(C2175k c2175k) {
        if (C3982b.m19891a(c2175k.f6735a)) {
            return (long) m19892c(c2175k);
        }
        return -1;
    }

    /* renamed from: a */
    protected boolean mo1601a(C2175k c2175k, long j, C2232a c2232a) {
        byte[] bArr = c2175k.f6735a;
        if (this.f15941a == null) {
            this.f15941a = new C2167e(bArr, 17);
            c2175k = Arrays.copyOfRange(bArr, 9, c2175k.m7978c());
            c2175k[4] = Byte.MIN_VALUE;
            c2232a.f7038a = Format.m7741a(null, "audio/x-flac", null, -1, this.f15941a.m7933a(), this.f15941a.f6709f, this.f15941a.f6708e, Collections.singletonList(c2175k), null, 0, null);
        } else if ((bArr[0] & 127) == 3) {
            this.f15942b = new C3981a(this);
            this.f15942b.m19883a(c2175k);
        } else if (C3982b.m19891a(bArr) != null) {
            if (this.f15942b != null) {
                this.f15942b.m19888c(j);
                c2232a.f7039b = this.f15942b;
            }
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private int m19892c(C2175k c2175k) {
        int i = (c2175k.f6735a[2] & 255) >> 4;
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
            case 7:
                c2175k.m7981d(4);
                c2175k.m8005z();
                i = i == 6 ? c2175k.m7986g() : c2175k.m7987h();
                c2175k.m7979c(0);
                return i + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }
}
