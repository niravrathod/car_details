package com.google.android.exoplayer2.p125b;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.p126c.C2163a;
import com.google.android.exoplayer2.source.C2326h;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: com.google.android.exoplayer2.b.b */
public abstract class C3955b implements C2157f {
    /* renamed from: a */
    protected final C2326h f15742a;
    /* renamed from: b */
    protected final int f15743b;
    /* renamed from: c */
    protected final int[] f15744c;
    /* renamed from: d */
    private final Format[] f15745d;
    /* renamed from: e */
    private final long[] f15746e;
    /* renamed from: f */
    private int f15747f;

    /* renamed from: com.google.android.exoplayer2.b.b$a */
    private static final class C2151a implements Comparator<Format> {
        private C2151a() {
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return m7897a((Format) obj, (Format) obj2);
        }

        /* renamed from: a */
        public int m7897a(Format format, Format format2) {
            return format2.f6485b - format.f6485b;
        }
    }

    public C3955b(C2326h c2326h, int... iArr) {
        C2163a.m7918b(iArr.length > 0);
        this.f15742a = (C2326h) C2163a.m7914a((Object) c2326h);
        this.f15743b = iArr.length;
        this.f15745d = new Format[this.f15743b];
        for (int i = 0; i < iArr.length; i++) {
            this.f15745d[i] = c2326h.m8489a(iArr[i]);
        }
        Arrays.sort(this.f15745d, new C2151a());
        this.f15744c = new int[this.f15743b];
        for (int i2 = 0; i2 < this.f15743b; i2++) {
            this.f15744c[i2] = c2326h.m8488a(this.f15745d[i2]);
        }
        this.f15746e = new long[this.f15743b];
    }

    /* renamed from: a */
    public final C2326h mo1545a() {
        return this.f15742a;
    }

    /* renamed from: b */
    public final int mo1546b() {
        return this.f15744c.length;
    }

    /* renamed from: a */
    public final Format mo1544a(int i) {
        return this.f15745d[i];
    }

    /* renamed from: b */
    public final int mo1547b(int i) {
        return this.f15744c[i];
    }

    /* renamed from: a */
    protected final boolean m19678a(int i, long j) {
        return this.f15746e[i] > j;
    }

    public int hashCode() {
        if (this.f15747f == 0) {
            this.f15747f = (System.identityHashCode(this.f15742a) * 31) + Arrays.hashCode(this.f15744c);
        }
        return this.f15747f;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                C3955b c3955b = (C3955b) obj;
                if (this.f15742a != c3955b.f15742a || Arrays.equals(this.f15744c, c3955b.f15744c) == null) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }
}
