package com.google.android.exoplayer2.p126c;

import android.os.SystemClock;
import com.google.android.exoplayer2.C2162b;
import com.google.android.exoplayer2.C2276k;

/* renamed from: com.google.android.exoplayer2.c.p */
public final class C3957p implements C2169g {
    /* renamed from: a */
    private boolean f15752a;
    /* renamed from: b */
    private long f15753b;
    /* renamed from: c */
    private long f15754c;
    /* renamed from: d */
    private C2276k f15755d = C2276k.f7224a;

    /* renamed from: a */
    public void m19690a() {
        if (!this.f15752a) {
            this.f15754c = SystemClock.elapsedRealtime();
            this.f15752a = true;
        }
    }

    /* renamed from: b */
    public void m19693b() {
        if (this.f15752a) {
            m19691a(mo1551w());
            this.f15752a = false;
        }
    }

    /* renamed from: a */
    public void m19691a(long j) {
        this.f15753b = j;
        if (this.f15752a != null) {
            this.f15754c = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: a */
    public void m19692a(C2169g c2169g) {
        m19691a(c2169g.mo1551w());
        this.f15755d = c2169g.mo1552x();
    }

    /* renamed from: w */
    public long mo1551w() {
        long j = this.f15753b;
        if (!this.f15752a) {
            return j;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f15754c;
        if (this.f15755d.f7225b == 1.0f) {
            return j + C2162b.m7912b(elapsedRealtime);
        }
        return j + this.f15755d.m8360a(elapsedRealtime);
    }

    /* renamed from: a */
    public C2276k mo1550a(C2276k c2276k) {
        if (this.f15752a) {
            m19691a(mo1551w());
        }
        this.f15755d = c2276k;
        return c2276k;
    }

    /* renamed from: x */
    public C2276k mo1552x() {
        return this.f15755d;
    }
}
