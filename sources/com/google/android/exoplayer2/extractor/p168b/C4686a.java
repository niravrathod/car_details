package com.google.android.exoplayer2.extractor.p168b;

import com.google.android.exoplayer2.extractor.p168b.C3968b.C3967a;
import com.google.android.exoplayer2.p126c.C2186s;

/* renamed from: com.google.android.exoplayer2.extractor.b.a */
final class C4686a implements C3967a {
    /* renamed from: a */
    private final long f19343a;
    /* renamed from: b */
    private final int f19344b;
    /* renamed from: c */
    private final long f19345c;

    public C4686a(long j, int i, long j2) {
        this.f19343a = j;
        this.f19344b = i;
        if (j2 == -1) {
            j = -9223372036854775807L;
        } else {
            j = mo4047a(j2);
        }
        this.f19345c = j;
    }

    /* renamed from: a */
    public boolean mo1578a() {
        return this.f19345c != -9223372036854775807L;
    }

    /* renamed from: b */
    public long mo1580b(long j) {
        if (this.f19345c == -9223372036854775807L) {
            return 0;
        }
        return this.f19343a + ((C2186s.m8044a(j, 0, this.f19345c) * ((long) this.f19344b)) / 8000000);
    }

    /* renamed from: a */
    public long mo4047a(long j) {
        return ((Math.max(0, j - this.f19343a) * 1000000) * 8) / ((long) this.f19344b);
    }

    /* renamed from: b */
    public long mo1579b() {
        return this.f19345c;
    }
}
