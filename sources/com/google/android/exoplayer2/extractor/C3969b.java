package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.p126c.C2186s;
import com.google.android.exoplayer2.upstream.C2368d;
import java.io.EOFException;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.extractor.b */
public final class C3969b implements C2260g {
    /* renamed from: a */
    private static final byte[] f15852a = new byte[4096];
    /* renamed from: b */
    private final C2368d f15853b;
    /* renamed from: c */
    private final long f15854c;
    /* renamed from: d */
    private long f15855d;
    /* renamed from: e */
    private byte[] f15856e = new byte[65536];
    /* renamed from: f */
    private int f15857f;
    /* renamed from: g */
    private int f15858g;

    public C3969b(C2368d c2368d, long j, long j2) {
        this.f15853b = c2368d;
        this.f15855d = j;
        this.f15854c = j2;
    }

    /* renamed from: a */
    public int mo1582a(byte[] bArr, int i, int i2) {
        int d = m19775d(bArr, i, i2);
        if (d == 0) {
            d = m19774a(bArr, i, i2, 0, true);
        }
        m19779g(d);
        return d;
    }

    /* renamed from: a */
    public boolean mo1584a(byte[] bArr, int i, int i2, boolean z) {
        int d = m19775d(bArr, i, i2);
        while (d < i2 && d != -1) {
            d = m19774a(bArr, i, i2, d, z);
        }
        m19779g(d);
        return d != -1 ? 1 : null;
    }

    /* renamed from: b */
    public void mo1587b(byte[] bArr, int i, int i2) {
        mo1584a(bArr, i, i2, false);
    }

    /* renamed from: a */
    public int mo1581a(int i) {
        int e = m19777e(i);
        if (e == 0) {
            e = m19774a(f15852a, 0, Math.min(i, f15852a.length), 0, true);
        }
        m19779g(e);
        return e;
    }

    /* renamed from: a */
    public boolean m19783a(int i, boolean z) {
        int e = m19777e(i);
        while (e < i && e != -1) {
            e = m19774a(f15852a, -e, Math.min(i, f15852a.length + e), e, z);
        }
        m19779g(e);
        return e != -1;
    }

    /* renamed from: b */
    public void mo1586b(int i) {
        m19783a(i, false);
    }

    /* renamed from: b */
    public boolean mo1588b(byte[] bArr, int i, int i2, boolean z) {
        if (!m19788b(i2, z)) {
            return null;
        }
        System.arraycopy(this.f15856e, this.f15857f - i2, bArr, i, i2);
        return 1;
    }

    /* renamed from: c */
    public void mo1591c(byte[] bArr, int i, int i2) {
        mo1588b(bArr, i, i2, false);
    }

    /* renamed from: b */
    public boolean m19788b(int i, boolean z) {
        m19776d(i);
        int min = Math.min(this.f15858g - this.f15857f, i);
        while (min < i) {
            min = m19774a(this.f15856e, this.f15857f, i, min, z);
            if (min == -1) {
                return false;
            }
        }
        this.f15857f += i;
        this.f15858g = Math.max(this.f15858g, this.f15857f);
        return true;
    }

    /* renamed from: c */
    public void mo1590c(int i) {
        m19788b(i, false);
    }

    /* renamed from: a */
    public void mo1583a() {
        this.f15857f = 0;
    }

    /* renamed from: b */
    public long mo1585b() {
        return this.f15855d + ((long) this.f15857f);
    }

    /* renamed from: c */
    public long mo1589c() {
        return this.f15855d;
    }

    /* renamed from: d */
    public long mo1592d() {
        return this.f15854c;
    }

    /* renamed from: d */
    private void m19776d(int i) {
        int i2 = this.f15857f + i;
        if (i2 > this.f15856e.length) {
            this.f15856e = Arrays.copyOf(this.f15856e, C2186s.m8041a(this.f15856e.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    /* renamed from: e */
    private int m19777e(int i) {
        i = Math.min(this.f15858g, i);
        m19778f(i);
        return i;
    }

    /* renamed from: d */
    private int m19775d(byte[] bArr, int i, int i2) {
        if (this.f15858g == 0) {
            return 0;
        }
        i2 = Math.min(this.f15858g, i2);
        System.arraycopy(this.f15856e, 0, bArr, i, i2);
        m19778f(i2);
        return i2;
    }

    /* renamed from: f */
    private void m19778f(int i) {
        this.f15858g -= i;
        this.f15857f = 0;
        Object obj = this.f15856e;
        if (this.f15858g < this.f15856e.length - 524288) {
            obj = new byte[(this.f15858g + 65536)];
        }
        System.arraycopy(this.f15856e, i, obj, 0, this.f15858g);
        this.f15856e = obj;
    }

    /* renamed from: a */
    private int m19774a(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        bArr = this.f15853b.mo1684a(bArr, i + i3, i2 - i3);
        if (bArr != -1) {
            return i3 + bArr;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    /* renamed from: g */
    private void m19779g(int i) {
        if (i != -1) {
            this.f15855d += (long) i;
        }
    }
}
