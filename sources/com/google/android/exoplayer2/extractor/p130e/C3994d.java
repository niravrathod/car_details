package com.google.android.exoplayer2.extractor.p130e;

import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.C2261h;
import com.google.android.exoplayer2.extractor.C2267n;
import com.google.android.exoplayer2.extractor.C4012e;
import com.google.android.exoplayer2.extractor.p130e.C2255v.C2254d;
import com.google.android.exoplayer2.p126c.C2164b;
import com.google.android.exoplayer2.p126c.C2174j;
import com.google.android.exoplayer2.p126c.C2175k;
import com.google.android.gms.ads.AdRequest;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: com.google.android.exoplayer2.extractor.e.d */
public final class C3994d implements C2241h {
    /* renamed from: a */
    private static final byte[] f15994a = new byte[]{(byte) 73, (byte) 68, (byte) 51};
    /* renamed from: b */
    private final boolean f15995b;
    /* renamed from: c */
    private final C2174j f15996c;
    /* renamed from: d */
    private final C2175k f15997d;
    /* renamed from: e */
    private final String f15998e;
    /* renamed from: f */
    private String f15999f;
    /* renamed from: g */
    private C2267n f16000g;
    /* renamed from: h */
    private C2267n f16001h;
    /* renamed from: i */
    private int f16002i;
    /* renamed from: j */
    private int f16003j;
    /* renamed from: k */
    private int f16004k;
    /* renamed from: l */
    private boolean f16005l;
    /* renamed from: m */
    private boolean f16006m;
    /* renamed from: n */
    private long f16007n;
    /* renamed from: o */
    private int f16008o;
    /* renamed from: p */
    private long f16009p;
    /* renamed from: q */
    private C2267n f16010q;
    /* renamed from: r */
    private long f16011r;

    /* renamed from: b */
    public void mo1612b() {
    }

    public C3994d(boolean z) {
        this(z, null);
    }

    public C3994d(boolean z, String str) {
        this.f15996c = new C2174j(new byte[7]);
        this.f15997d = new C2175k(Arrays.copyOf(f15994a, 10));
        m19967c();
        this.f15995b = z;
        this.f15998e = str;
    }

    /* renamed from: a */
    public void mo1608a() {
        m19967c();
    }

    /* renamed from: a */
    public void mo1611a(C2261h c2261h, C2254d c2254d) {
        c2254d.m8283a();
        this.f15999f = c2254d.m8285c();
        this.f16000g = c2261h.mo4053a(c2254d.m8284b(), 1);
        if (this.f15995b) {
            c2254d.m8283a();
            this.f16001h = c2261h.mo4053a(c2254d.m8284b(), 4);
            this.f16001h.mo1606a(Format.m7745a(c2254d.m8285c(), "application/id3", null, -1, null));
            return;
        }
        this.f16001h = new C4012e();
    }

    /* renamed from: a */
    public void mo1609a(long j, boolean z) {
        this.f16009p = j;
    }

    /* renamed from: a */
    public void mo1610a(C2175k c2175k) {
        while (c2175k.m7976b() > 0) {
            switch (this.f16002i) {
                case 0:
                    m19966b(c2175k);
                    break;
                case 1:
                    if (!m19965a(c2175k, this.f15997d.f6735a, 10)) {
                        break;
                    }
                    m19971f();
                    break;
                case 2:
                    if (!m19965a(c2175k, this.f15996c.f6731a, this.f16005l ? 7 : 5)) {
                        break;
                    }
                    m19972g();
                    break;
                case 3:
                    m19968c(c2175k);
                    break;
                default:
                    break;
            }
        }
    }

    /* renamed from: a */
    private boolean m19965a(C2175k c2175k, byte[] bArr, int i) {
        int min = Math.min(c2175k.m7976b(), i - this.f16003j);
        c2175k.m7975a(bArr, this.f16003j, min);
        this.f16003j += min;
        return this.f16003j == i ? true : null;
    }

    /* renamed from: c */
    private void m19967c() {
        this.f16002i = 0;
        this.f16003j = 0;
        this.f16004k = 256;
    }

    /* renamed from: d */
    private void m19969d() {
        this.f16002i = 1;
        this.f16003j = f15994a.length;
        this.f16008o = 0;
        this.f15997d.m7979c(0);
    }

    /* renamed from: a */
    private void m19964a(C2267n c2267n, long j, int i, int i2) {
        this.f16002i = 3;
        this.f16003j = i;
        this.f16010q = c2267n;
        this.f16011r = j;
        this.f16008o = i2;
    }

    /* renamed from: e */
    private void m19970e() {
        this.f16002i = 2;
        this.f16003j = 0;
    }

    /* renamed from: b */
    private void m19966b(C2175k c2175k) {
        byte[] bArr = c2175k.f6735a;
        int d = c2175k.m7980d();
        int c = c2175k.m7978c();
        while (d < c) {
            int i = d + 1;
            d = bArr[d] & 255;
            if (this.f16004k != AdRequest.MAX_CONTENT_URL_LENGTH || d < 240 || d == 255) {
                d |= this.f16004k;
                if (d == 329) {
                    this.f16004k = 768;
                } else if (d == 511) {
                    this.f16004k = AdRequest.MAX_CONTENT_URL_LENGTH;
                } else if (d == 836) {
                    this.f16004k = 1024;
                } else if (d == 1075) {
                    m19969d();
                    c2175k.m7979c(i);
                    return;
                } else if (this.f16004k != 256) {
                    this.f16004k = 256;
                    i--;
                }
                d = i;
            } else {
                boolean z = true;
                if ((d & 1) != 0) {
                    z = false;
                }
                this.f16005l = z;
                m19970e();
                c2175k.m7979c(i);
                return;
            }
        }
        c2175k.m7979c(d);
    }

    /* renamed from: f */
    private void m19971f() {
        this.f16001h.mo1607a(this.f15997d, 10);
        this.f15997d.m7979c(6);
        m19964a(this.f16001h, 0, 10, this.f15997d.m7998s() + 10);
    }

    /* renamed from: g */
    private void m19972g() {
        int c;
        this.f15996c.m7960a(0);
        if (this.f16006m) {
            r6.f15996c.m7964b(10);
        } else {
            c = r6.f15996c.m7966c(2) + 1;
            if (c != 2) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Detected audio object type: ");
                stringBuilder.append(c);
                stringBuilder.append(", but assuming AAC LC.");
                Log.w("AdtsReader", stringBuilder.toString());
                c = 2;
            }
            int c2 = r6.f15996c.m7966c(4);
            r6.f15996c.m7964b(1);
            byte[] a = C2164b.m7922a(c, c2, r6.f15996c.m7966c(3));
            Pair a2 = C2164b.m7921a(a);
            Format a3 = Format.m7741a(r6.f15999f, "audio/mp4a-latm", null, -1, -1, ((Integer) a2.second).intValue(), ((Integer) a2.first).intValue(), Collections.singletonList(a), null, 0, r6.f15998e);
            r6.f16007n = 1024000000 / ((long) a3.f6502s);
            r6.f16000g.mo1606a(a3);
            r6.f16006m = true;
        }
        r6.f15996c.m7964b(4);
        c = (r6.f15996c.m7966c(13) - 2) - 5;
        if (r6.f16005l) {
            c -= 2;
        }
        m19964a(r6.f16000g, r6.f16007n, 0, c);
    }

    /* renamed from: c */
    private void m19968c(C2175k c2175k) {
        int min = Math.min(c2175k.m7976b(), this.f16008o - this.f16003j);
        this.f16010q.mo1607a(c2175k, min);
        this.f16003j += min;
        if (this.f16003j == this.f16008o) {
            this.f16010q.mo1605a(this.f16009p, 1, this.f16008o, 0, null);
            this.f16009p += this.f16011r;
            m19967c();
        }
    }
}
