package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.C2313q;
import com.google.android.exoplayer2.C2313q.C2311a;
import com.google.android.exoplayer2.C2313q.C2312b;
import com.google.android.exoplayer2.p126c.C2163a;

/* renamed from: com.google.android.exoplayer2.source.g */
public final class C4039g extends C2313q {
    /* renamed from: b */
    private static final Object f16258b = new Object();
    /* renamed from: c */
    private final long f16259c;
    /* renamed from: d */
    private final long f16260d;
    /* renamed from: e */
    private final long f16261e;
    /* renamed from: f */
    private final long f16262f;
    /* renamed from: g */
    private final boolean f16263g;
    /* renamed from: h */
    private final boolean f16264h;

    /* renamed from: b */
    public int mo1663b() {
        return 1;
    }

    /* renamed from: c */
    public int mo1664c() {
        return 1;
    }

    public C4039g(long j, boolean z) {
        this(j, j, 0, 0, z, false);
    }

    public C4039g(long j, long j2, long j3, long j4, boolean z, boolean z2) {
        this.f16259c = j;
        this.f16260d = j2;
        this.f16261e = j3;
        this.f16262f = j4;
        this.f16263g = z;
        this.f16264h = z2;
    }

    /* renamed from: a */
    public C2312b mo1662a(int i, C2312b c2312b, boolean z, long j) {
        C4039g c4039g = this;
        C2163a.m7913a(i, 0, 1);
        Object obj = z ? f16258b : null;
        long j2 = c4039g.f16262f;
        if (c4039g.f16264h) {
            j2 += j;
            if (j2 > c4039g.f16260d) {
                j2 = -9223372036854775807L;
            }
        }
        return c2312b.m8459a(obj, -9223372036854775807L, -9223372036854775807L, c4039g.f16263g, c4039g.f16264h, j2, c4039g.f16260d, 0, 0, c4039g.f16261e);
    }

    /* renamed from: a */
    public C2311a mo1661a(int i, C2311a c2311a, boolean z) {
        C2163a.m7913a(i, 0, 1);
        Object obj = z ? f16258b : 0;
        return c2311a.m8456a(obj, obj, 0, this.f16259c, -this.f16261e, false);
    }

    /* renamed from: a */
    public int mo1660a(Object obj) {
        return f16258b.equals(obj) != null ? null : -1;
    }
}
