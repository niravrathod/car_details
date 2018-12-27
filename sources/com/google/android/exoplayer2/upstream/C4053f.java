package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.p126c.C2163a;
import com.google.android.exoplayer2.p126c.C2186s;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.upstream.f */
public final class C4053f implements C2364b {
    /* renamed from: a */
    private final boolean f16302a;
    /* renamed from: b */
    private final int f16303b;
    /* renamed from: c */
    private final byte[] f16304c;
    /* renamed from: d */
    private final C2363a[] f16305d;
    /* renamed from: e */
    private int f16306e;
    /* renamed from: f */
    private int f16307f;
    /* renamed from: g */
    private int f16308g;
    /* renamed from: h */
    private C2363a[] f16309h;

    public C4053f(boolean z, int i) {
        this(z, i, 0);
    }

    public C4053f(boolean z, int i, int i2) {
        C2163a.m7916a(i > 0);
        C2163a.m7916a(i2 >= 0);
        this.f16302a = z;
        this.f16303b = i;
        this.f16308g = i2;
        this.f16309h = new C2363a[(i2 + 100)];
        if (i2 > 0) {
            this.f16304c = new byte[(i2 * i)];
            for (int i3 = 0; i3 < i2; i3++) {
                this.f16309h[i3] = new C2363a(this.f16304c, i3 * i);
            }
        } else {
            this.f16304c = false;
        }
        this.f16305d = new C2363a[1];
    }

    /* renamed from: d */
    public synchronized void m20339d() {
        if (this.f16302a) {
            m20334a(0);
        }
    }

    /* renamed from: a */
    public synchronized void m20334a(int i) {
        Object obj = i < this.f16306e ? 1 : null;
        this.f16306e = i;
        if (obj != null) {
            mo1692b();
        }
    }

    /* renamed from: a */
    public synchronized C2363a mo1689a() {
        C2363a c2363a;
        this.f16307f++;
        if (this.f16308g > 0) {
            C2363a[] c2363aArr = this.f16309h;
            int i = this.f16308g - 1;
            this.f16308g = i;
            c2363a = c2363aArr[i];
            this.f16309h[this.f16308g] = null;
        } else {
            c2363a = new C2363a(new byte[this.f16303b], 0);
        }
        return c2363a;
    }

    /* renamed from: a */
    public synchronized void mo1690a(C2363a c2363a) {
        this.f16305d[0] = c2363a;
        mo1691a(this.f16305d);
    }

    /* renamed from: a */
    public synchronized void mo1691a(C2363a[] c2363aArr) {
        if (this.f16308g + c2363aArr.length >= this.f16309h.length) {
            this.f16309h = (C2363a[]) Arrays.copyOf(this.f16309h, Math.max(this.f16309h.length * 2, this.f16308g + c2363aArr.length));
        }
        for (C2363a c2363a : c2363aArr) {
            boolean z;
            C2363a[] c2363aArr2;
            int i;
            if (c2363a.f7511a != this.f16304c) {
                if (c2363a.f7511a.length != this.f16303b) {
                    z = false;
                    C2163a.m7916a(z);
                    c2363aArr2 = this.f16309h;
                    i = this.f16308g;
                    this.f16308g = i + 1;
                    c2363aArr2[i] = c2363a;
                }
            }
            z = true;
            C2163a.m7916a(z);
            c2363aArr2 = this.f16309h;
            i = this.f16308g;
            this.f16308g = i + 1;
            c2363aArr2[i] = c2363a;
        }
        this.f16307f -= c2363aArr.length;
        notifyAll();
    }

    /* renamed from: b */
    public synchronized void mo1692b() {
        int i = 0;
        int max = Math.max(0, C2186s.m8040a(this.f16306e, this.f16303b) - this.f16307f);
        if (max < this.f16308g) {
            if (this.f16304c != null) {
                int i2 = this.f16308g - 1;
                while (i <= i2) {
                    C2363a c2363a = this.f16309h[i];
                    if (c2363a.f7511a == this.f16304c) {
                        i++;
                    } else {
                        C2363a c2363a2 = this.f16309h[i2];
                        if (c2363a2.f7511a != this.f16304c) {
                            i2--;
                        } else {
                            int i3 = i + 1;
                            this.f16309h[i] = c2363a2;
                            int i4 = i2 - 1;
                            this.f16309h[i2] = c2363a;
                            i2 = i4;
                            i = i3;
                        }
                    }
                }
                max = Math.max(max, i);
                if (max >= this.f16308g) {
                    return;
                }
            }
            Arrays.fill(this.f16309h, max, this.f16308g, null);
            this.f16308g = max;
        }
    }

    /* renamed from: e */
    public synchronized int m20340e() {
        return this.f16307f * this.f16303b;
    }

    /* renamed from: c */
    public int mo1693c() {
        return this.f16303b;
    }
}
