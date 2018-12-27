package com.google.android.exoplayer2;

import com.google.android.exoplayer2.p125b.C2158g;
import com.google.android.exoplayer2.p126c.C2178n;
import com.google.android.exoplayer2.p126c.C2186s;
import com.google.android.exoplayer2.source.C2327i;
import com.google.android.exoplayer2.upstream.C2364b;
import com.google.android.exoplayer2.upstream.C4053f;

/* renamed from: com.google.android.exoplayer2.c */
public final class C3958c implements C2275j {
    /* renamed from: a */
    private final C4053f f15756a;
    /* renamed from: b */
    private final long f15757b;
    /* renamed from: c */
    private final long f15758c;
    /* renamed from: d */
    private final long f15759d;
    /* renamed from: e */
    private final long f15760e;
    /* renamed from: f */
    private final C2178n f15761f;
    /* renamed from: g */
    private int f15762g;
    /* renamed from: h */
    private boolean f15763h;

    public C3958c() {
        this(new C4053f(true, 65536));
    }

    public C3958c(C4053f c4053f) {
        this(c4053f, 15000, 30000, 2500, 5000);
    }

    public C3958c(C4053f c4053f, int i, int i2, long j, long j2) {
        this(c4053f, i, i2, j, j2, null);
    }

    public C3958c(C4053f c4053f, int i, int i2, long j, long j2, C2178n c2178n) {
        this.f15756a = c4053f;
        this.f15757b = ((long) i) * 1000;
        this.f15758c = ((long) i2) * 1000;
        this.f15759d = j * 1000;
        this.f15760e = j2 * 1000;
        this.f15761f = c2178n;
    }

    /* renamed from: a */
    public void mo1553a() {
        m19696a(false);
    }

    /* renamed from: a */
    public void mo1554a(C4023l[] c4023lArr, C2327i c2327i, C2158g c2158g) {
        c2327i = null;
        this.f15762g = 0;
        while (c2327i < c4023lArr.length) {
            if (c2158g.m7904a(c2327i) != null) {
                this.f15762g += C2186s.m8059c(c4023lArr[c2327i].mo4028a());
            }
            c2327i++;
        }
        this.f15756a.m20334a(this.f15762g);
    }

    /* renamed from: b */
    public void mo1557b() {
        m19696a(true);
    }

    /* renamed from: c */
    public void mo1558c() {
        m19696a(true);
    }

    /* renamed from: d */
    public C2364b mo1559d() {
        return this.f15756a;
    }

    /* renamed from: a */
    public boolean mo1556a(long j, boolean z) {
        long j2 = z ? this.f15760e : this.f15759d;
        if (j2 > 0) {
            if (j < j2) {
                return 0;
            }
        }
        return 1;
    }

    /* renamed from: a */
    public boolean mo1555a(long j) {
        j = m19697b(j);
        boolean z = true;
        Object obj = this.f15756a.m20340e() >= this.f15762g ? 1 : null;
        boolean z2 = this.f15763h;
        if (j != 2) {
            if (j != 1 || this.f15763h == null || obj != null) {
                z = false;
            }
        }
        this.f15763h = z;
        if (!(this.f15761f == null || this.f15763h == z2)) {
            if (this.f15763h != null) {
                this.f15761f.m8018a(0);
            } else {
                this.f15761f.m8019b(0);
            }
        }
        return this.f15763h;
    }

    /* renamed from: b */
    private int m19697b(long j) {
        if (j > this.f15758c) {
            return 0;
        }
        return j < this.f15757b ? 2 : 1;
    }

    /* renamed from: a */
    private void m19696a(boolean z) {
        this.f15762g = 0;
        if (this.f15761f != null && this.f15763h) {
            this.f15761f.m8019b(0);
        }
        this.f15763h = false;
        if (z) {
            this.f15756a.m20339d();
        }
    }
}
