package com.google.android.exoplayer2.p125b;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.android.exoplayer2.C2277m;
import com.google.android.exoplayer2.C2307n;
import com.google.android.exoplayer2.p125b.C2157f.C2156a;
import com.google.android.exoplayer2.source.C2326h;
import com.google.android.exoplayer2.source.C2327i;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.google.android.exoplayer2.b.e */
public abstract class C3956e extends C2160h {
    /* renamed from: a */
    private final SparseArray<Map<C2327i, C2155b>> f15748a = new SparseArray();
    /* renamed from: b */
    private final SparseBooleanArray f15749b = new SparseBooleanArray();
    /* renamed from: c */
    private int f15750c = 0;
    /* renamed from: d */
    private C2154a f15751d;

    /* renamed from: com.google.android.exoplayer2.b.e$a */
    public static final class C2154a {
        /* renamed from: a */
        public final int f6674a;
        /* renamed from: b */
        private final int[] f6675b;
        /* renamed from: c */
        private final C2327i[] f6676c;
        /* renamed from: d */
        private final int[] f6677d;
        /* renamed from: e */
        private final int[][][] f6678e;
        /* renamed from: f */
        private final C2327i f6679f;

        C2154a(int[] iArr, C2327i[] c2327iArr, int[] iArr2, int[][][] iArr3, C2327i c2327i) {
            this.f6675b = iArr;
            this.f6676c = c2327iArr;
            this.f6678e = iArr3;
            this.f6677d = iArr2;
            this.f6679f = c2327i;
            this.f6674a = c2327iArr.length;
        }
    }

    /* renamed from: com.google.android.exoplayer2.b.e$b */
    public static final class C2155b {
        /* renamed from: a */
        public final C2156a f6680a;
        /* renamed from: b */
        public final int f6681b;
        /* renamed from: c */
        public final int[] f6682c;

        /* renamed from: a */
        public C2157f m7898a(C2327i c2327i) {
            return this.f6680a.mo1543b(c2327i.m8491a(this.f6681b), this.f6682c);
        }
    }

    /* renamed from: a */
    protected abstract C2157f[] mo4046a(C2277m[] c2277mArr, C2327i[] c2327iArr, int[][][] iArr);

    /* renamed from: a */
    public final C2161i mo1548a(C2277m[] c2277mArr, C2327i c2327i) {
        int i;
        int[] iArr = new int[(c2277mArr.length + 1)];
        C2326h[][] c2326hArr = new C2326h[(c2277mArr.length + 1)][];
        int[][][] iArr2 = new int[(c2277mArr.length + 1)][][];
        for (i = 0; i < c2326hArr.length; i++) {
            c2326hArr[i] = new C2326h[c2327i.f7299b];
            iArr2[i] = new int[c2327i.f7299b][];
        }
        int[] a = C3956e.m19685a(c2277mArr);
        for (i = 0; i < c2327i.f7299b; i++) {
            int[] iArr3;
            C2326h a2 = c2327i.m8491a(i);
            int a3 = C3956e.m19681a(c2277mArr, a2);
            if (a3 == c2277mArr.length) {
                iArr3 = new int[a2.f7295a];
            } else {
                iArr3 = C3956e.m19684a(c2277mArr[a3], a2);
            }
            int i2 = iArr[a3];
            c2326hArr[a3][i2] = a2;
            iArr2[a3][i2] = iArr3;
            iArr[a3] = iArr[a3] + 1;
        }
        C2327i[] c2327iArr = new C2327i[c2277mArr.length];
        int[] iArr4 = new int[c2277mArr.length];
        for (i = 0; i < c2277mArr.length; i++) {
            a3 = iArr[i];
            c2327iArr[i] = new C2327i((C2326h[]) Arrays.copyOf(c2326hArr[i], a3));
            iArr2[i] = (int[][]) Arrays.copyOf(iArr2[i], a3);
            iArr4[i] = c2277mArr[i].mo4028a();
        }
        C2327i c2327i2 = new C2327i((C2326h[]) Arrays.copyOf(c2326hArr[c2277mArr.length], iArr[c2277mArr.length]));
        C2157f[] a4 = mo4046a(c2277mArr, c2327iArr, iArr2);
        int i3 = 0;
        while (true) {
            C2155b c2155b = null;
            if (i3 >= c2277mArr.length) {
                break;
            }
            if (this.f15749b.get(i3)) {
                a4[i3] = null;
            } else {
                C2327i c2327i3 = c2327iArr[i3];
                Map map = (Map) this.f15748a.get(i3);
                if (map != null) {
                    c2155b = (C2155b) map.get(c2327i3);
                }
                if (c2155b != null) {
                    a4[i3] = c2155b.m7898a(c2327i3);
                }
            }
            i3++;
        }
        C2154a c2154a = new C2154a(iArr4, c2327iArr, a, iArr2, c2327i2);
        C2307n[] c2307nArr = new C2307n[c2277mArr.length];
        for (int i4 = 0; i4 < c2277mArr.length; i4++) {
            c2307nArr[i4] = a4[i4] != null ? C2307n.f7264a : null;
        }
        C3956e.m19682a(c2277mArr, c2327iArr, iArr2, c2307nArr, a4, this.f15750c);
        return new C2161i(c2327i, new C2158g(a4), c2154a, c2307nArr);
    }

    /* renamed from: a */
    public final void mo1549a(Object obj) {
        this.f15751d = (C2154a) obj;
    }

    /* renamed from: a */
    private static int m19681a(C2277m[] c2277mArr, C2326h c2326h) {
        int length = c2277mArr.length;
        int i = 0;
        int i2 = 0;
        while (i < c2277mArr.length) {
            C2277m c2277m = c2277mArr[i];
            int i3 = length;
            for (length = 0; length < c2326h.f7295a; length++) {
                int a = c2277m.mo4672a(c2326h.m8489a(length)) & 3;
                if (a > i2) {
                    if (a == 3) {
                        return i;
                    }
                    i3 = i;
                    i2 = a;
                }
            }
            i++;
            length = i3;
        }
        return length;
    }

    /* renamed from: a */
    private static int[] m19684a(C2277m c2277m, C2326h c2326h) {
        int[] iArr = new int[c2326h.f7295a];
        for (int i = 0; i < c2326h.f7295a; i++) {
            iArr[i] = c2277m.mo4672a(c2326h.m8489a(i));
        }
        return iArr;
    }

    /* renamed from: a */
    private static int[] m19685a(C2277m[] c2277mArr) {
        int[] iArr = new int[c2277mArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = c2277mArr[i].mo4045m();
        }
        return iArr;
    }

    /* renamed from: a */
    private static void m19682a(C2277m[] c2277mArr, C2327i[] c2327iArr, int[][][] iArr, C2307n[] c2307nArr, C2157f[] c2157fArr, int i) {
        if (i != 0) {
            int i2 = 0;
            int i3 = 0;
            int i4 = -1;
            int i5 = -1;
            while (i3 < c2277mArr.length) {
                int a = c2277mArr[i3].mo4028a();
                C2157f c2157f = c2157fArr[i3];
                if ((a == 1 || a == 2) && c2157f != null && C3956e.m19683a(iArr[i3], c2327iArr[i3], c2157f)) {
                    if (a == 1) {
                        if (i4 == -1) {
                            i4 = i3;
                        }
                    } else if (i5 == -1) {
                        i5 = i3;
                    }
                    c2277mArr = null;
                    break;
                }
                i3++;
            }
            c2277mArr = 1;
            if (!(i4 == -1 || i5 == -1)) {
                i2 = 1;
            }
            if ((c2277mArr & i2) != null) {
                c2277mArr = new C2307n(i);
                c2307nArr[i4] = c2277mArr;
                c2307nArr[i5] = c2277mArr;
            }
        }
    }

    /* renamed from: a */
    private static boolean m19683a(int[][] iArr, C2327i c2327i, C2157f c2157f) {
        if (c2157f == null) {
            return false;
        }
        c2327i = c2327i.m8490a(c2157f.mo1545a());
        for (int i = 0; i < c2157f.mo1546b(); i++) {
            if ((iArr[c2327i][c2157f.mo1547b(i)] & 16) != 16) {
                return false;
            }
        }
        return 1;
    }
}
