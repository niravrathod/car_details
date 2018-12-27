package com.google.android.exoplayer2.extractor.p130e;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.C2147e;
import com.google.android.exoplayer2.extractor.C2261h;
import com.google.android.exoplayer2.extractor.C2267n;
import com.google.android.exoplayer2.extractor.p130e.C2255v.C2254d;
import com.google.android.exoplayer2.p126c.C2175k;

/* renamed from: com.google.android.exoplayer2.extractor.e.f */
public final class C3996f implements C2241h {
    /* renamed from: a */
    private final C2175k f16014a = new C2175k(new byte[15]);
    /* renamed from: b */
    private final String f16015b;
    /* renamed from: c */
    private String f16016c;
    /* renamed from: d */
    private C2267n f16017d;
    /* renamed from: e */
    private int f16018e;
    /* renamed from: f */
    private int f16019f;
    /* renamed from: g */
    private int f16020g;
    /* renamed from: h */
    private long f16021h;
    /* renamed from: i */
    private Format f16022i;
    /* renamed from: j */
    private int f16023j;
    /* renamed from: k */
    private long f16024k;

    /* renamed from: b */
    public void mo1612b() {
    }

    public C3996f(String str) {
        this.f16014a.f6735a[0] = Byte.MAX_VALUE;
        this.f16014a.f6735a[1] = (byte) -2;
        this.f16014a.f6735a[2] = Byte.MIN_VALUE;
        this.f16014a.f6735a[3] = (byte) 1;
        this.f16018e = 0;
        this.f16015b = str;
    }

    /* renamed from: a */
    public void mo1608a() {
        this.f16018e = 0;
        this.f16019f = 0;
        this.f16020g = 0;
    }

    /* renamed from: a */
    public void mo1611a(C2261h c2261h, C2254d c2254d) {
        c2254d.m8283a();
        this.f16016c = c2254d.m8285c();
        this.f16017d = c2261h.mo4053a(c2254d.m8284b(), 1);
    }

    /* renamed from: a */
    public void mo1609a(long j, boolean z) {
        this.f16024k = j;
    }

    /* renamed from: a */
    public void mo1610a(C2175k c2175k) {
        while (c2175k.m7976b() > 0) {
            switch (this.f16018e) {
                case 0:
                    if (!m19983b(c2175k)) {
                        break;
                    }
                    this.f16019f = 4;
                    this.f16018e = 1;
                    break;
                case 1:
                    if (!m19982a(c2175k, this.f16014a.f6735a, 15)) {
                        break;
                    }
                    m19984c();
                    this.f16014a.m7979c(0);
                    this.f16017d.mo1607a(this.f16014a, 15);
                    this.f16018e = 2;
                    break;
                case 2:
                    int min = Math.min(c2175k.m7976b(), this.f16023j - this.f16019f);
                    this.f16017d.mo1607a(c2175k, min);
                    this.f16019f += min;
                    if (this.f16019f != this.f16023j) {
                        break;
                    }
                    this.f16017d.mo1605a(this.f16024k, 1, this.f16023j, 0, null);
                    this.f16024k += this.f16021h;
                    this.f16018e = 0;
                    break;
                default:
                    break;
            }
        }
    }

    /* renamed from: a */
    private boolean m19982a(C2175k c2175k, byte[] bArr, int i) {
        int min = Math.min(c2175k.m7976b(), i - this.f16019f);
        c2175k.m7975a(bArr, this.f16019f, min);
        this.f16019f += min;
        return this.f16019f == i ? true : null;
    }

    /* renamed from: b */
    private boolean m19983b(C2175k c2175k) {
        while (c2175k.m7976b() > 0) {
            this.f16020g <<= 8;
            this.f16020g |= c2175k.m7986g();
            if (this.f16020g == 2147385345) {
                this.f16020g = 0;
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private void m19984c() {
        byte[] bArr = this.f16014a.f6735a;
        if (this.f16022i == null) {
            this.f16022i = C2147e.m7871a(bArr, this.f16016c, this.f16015b, null);
            this.f16017d.mo1606a(this.f16022i);
        }
        this.f16023j = C2147e.m7872b(bArr);
        this.f16021h = (long) ((int) ((((long) C2147e.m7870a(bArr)) * 1000000) / ((long) this.f16022i.f6502s)));
    }
}
