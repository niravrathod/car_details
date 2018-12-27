package com.google.android.exoplayer2.p126c;

/* renamed from: com.google.android.exoplayer2.c.q */
public final class C2183q {
    /* renamed from: a */
    private long f6757a;
    /* renamed from: b */
    private long f6758b;
    /* renamed from: c */
    private volatile long f6759c = -9223372036854775807L;

    public C2183q(long j) {
        m8029a(j);
    }

    /* renamed from: a */
    public synchronized void m8029a(long j) {
        C2163a.m7918b(this.f6759c == -9223372036854775807L);
        this.f6757a = j;
    }

    /* renamed from: a */
    public long m8028a() {
        return this.f6757a;
    }

    /* renamed from: b */
    public long m8030b() {
        if (this.f6759c != -9223372036854775807L) {
            return this.f6759c;
        }
        return this.f6757a != Long.MAX_VALUE ? this.f6757a : -9223372036854775807L;
    }

    /* renamed from: c */
    public long m8032c() {
        if (this.f6757a == Long.MAX_VALUE) {
            return 0;
        }
        return this.f6759c == -9223372036854775807L ? -9223372036854775807L : this.f6758b;
    }

    /* renamed from: d */
    public void m8034d() {
        this.f6759c = -9223372036854775807L;
    }

    /* renamed from: b */
    public long m8031b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f6759c != -9223372036854775807L) {
            long e = C2183q.m8027e(this.f6759c);
            long j2 = (4294967296L + e) / 8589934592L;
            long j3 = ((j2 - 1) * 8589934592L) + j;
            j += j2 * 8589934592L;
            if (Math.abs(j3 - e) < Math.abs(j - e)) {
                j = j3;
            }
        }
        return m8033c(C2183q.m8026d(j));
    }

    /* renamed from: c */
    public long m8033c(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f6759c != -9223372036854775807L) {
            this.f6759c = j;
        } else {
            if (this.f6757a != Long.MAX_VALUE) {
                this.f6758b = this.f6757a - j;
            }
            synchronized (this) {
                this.f6759c = j;
                notifyAll();
            }
        }
        return j + this.f6758b;
    }

    /* renamed from: d */
    public static long m8026d(long j) {
        return (j * 1000000) / 90000;
    }

    /* renamed from: e */
    public static long m8027e(long j) {
        return (j * 90000) / 1000000;
    }
}
