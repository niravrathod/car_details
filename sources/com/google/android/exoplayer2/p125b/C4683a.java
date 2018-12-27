package com.google.android.exoplayer2.p125b;

import com.google.android.exoplayer2.p125b.C2157f.C2156a;
import com.google.android.exoplayer2.source.C2326h;
import com.google.android.exoplayer2.upstream.C2366c;

/* renamed from: com.google.android.exoplayer2.b.a */
public class C4683a extends C3955b {
    /* renamed from: d */
    private final C2366c f19330d;
    /* renamed from: e */
    private final int f19331e;
    /* renamed from: f */
    private final long f19332f;
    /* renamed from: g */
    private final long f19333g;
    /* renamed from: h */
    private final long f19334h;
    /* renamed from: i */
    private final float f19335i;
    /* renamed from: j */
    private int f19336j = m25747a(0);
    /* renamed from: k */
    private int f19337k = 1;

    /* renamed from: com.google.android.exoplayer2.b.a$a */
    public static final class C3954a implements C2156a {
        /* renamed from: a */
        private final C2366c f15736a;
        /* renamed from: b */
        private final int f15737b;
        /* renamed from: c */
        private final int f15738c;
        /* renamed from: d */
        private final int f15739d;
        /* renamed from: e */
        private final int f15740e;
        /* renamed from: f */
        private final float f15741f;

        /* renamed from: b */
        public /* synthetic */ C2157f mo1543b(C2326h c2326h, int[] iArr) {
            return m19674a(c2326h, iArr);
        }

        public C3954a(C2366c c2366c) {
            this(c2366c, 800000, 10000, 25000, 25000, 0.75f);
        }

        public C3954a(C2366c c2366c, int i, int i2, int i3, int i4, float f) {
            this.f15736a = c2366c;
            this.f15737b = i;
            this.f15738c = i2;
            this.f15739d = i3;
            this.f15740e = i4;
            this.f15741f = f;
        }

        /* renamed from: a */
        public C4683a m19674a(C2326h c2326h, int... iArr) {
            return new C4683a(c2326h, iArr, this.f15736a, this.f15737b, (long) this.f15738c, (long) this.f15739d, (long) this.f15740e, this.f15741f);
        }
    }

    public C4683a(C2326h c2326h, int[] iArr, C2366c c2366c, int i, long j, long j2, long j3, float f) {
        super(c2326h, iArr);
        this.f19330d = c2366c;
        this.f19331e = i;
        this.f19332f = j * 1000;
        this.f19333g = j2 * 1000;
        this.f19334h = j3 * 1000;
        this.f19335i = f;
    }

    /* renamed from: a */
    private int m25747a(long j) {
        long a = this.f19330d.mo1694a();
        a = a == -1 ? (long) this.f19331e : (long) (((float) a) * this.f19335i);
        int i = 0;
        int i2 = 0;
        while (i < this.b) {
            if (j == Long.MIN_VALUE || !m19678a(i, j)) {
                if (((long) mo1544a(i).f6485b) <= a) {
                    return i;
                }
                i2 = i;
            }
            i++;
        }
        return i2;
    }
}
