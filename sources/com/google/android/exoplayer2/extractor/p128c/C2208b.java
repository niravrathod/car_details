package com.google.android.exoplayer2.extractor.p128c;

import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.C2137a;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.C2263j;
import com.google.android.exoplayer2.extractor.p128c.C2203a.C3970a;
import com.google.android.exoplayer2.extractor.p128c.C2203a.C3971b;
import com.google.android.exoplayer2.extractor.p128c.C2212d.C2211a;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.Metadata.Entry;
import com.google.android.exoplayer2.p126c.C2163a;
import com.google.android.exoplayer2.p126c.C2164b;
import com.google.android.exoplayer2.p126c.C2175k;
import com.google.android.exoplayer2.p126c.C2186s;
import com.google.android.exoplayer2.video.C2375a;
import com.google.android.exoplayer2.video.C2376b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.extractor.c.b */
final class C2208b {
    /* renamed from: a */
    private static final int f6899a = C2186s.m8062e("vide");
    /* renamed from: b */
    private static final int f6900b = C2186s.m8062e("soun");
    /* renamed from: c */
    private static final int f6901c = C2186s.m8062e("text");
    /* renamed from: d */
    private static final int f6902d = C2186s.m8062e("sbtl");
    /* renamed from: e */
    private static final int f6903e = C2186s.m8062e("subt");
    /* renamed from: f */
    private static final int f6904f = C2186s.m8062e("clcp");
    /* renamed from: g */
    private static final int f6905g = C2186s.m8062e("cenc");
    /* renamed from: h */
    private static final int f6906h = C2186s.m8062e("meta");

    /* renamed from: com.google.android.exoplayer2.extractor.c.b$a */
    private static final class C2204a {
        /* renamed from: a */
        public final int f6883a;
        /* renamed from: b */
        public int f6884b;
        /* renamed from: c */
        public int f6885c;
        /* renamed from: d */
        public long f6886d;
        /* renamed from: e */
        private final boolean f6887e;
        /* renamed from: f */
        private final C2175k f6888f;
        /* renamed from: g */
        private final C2175k f6889g;
        /* renamed from: h */
        private int f6890h;
        /* renamed from: i */
        private int f6891i;

        public C2204a(C2175k c2175k, C2175k c2175k2, boolean z) {
            this.f6889g = c2175k;
            this.f6888f = c2175k2;
            this.f6887e = z;
            c2175k2.m7979c(12);
            this.f6883a = c2175k2.m7999t();
            c2175k.m7979c(12);
            this.f6891i = c2175k.m7999t();
            c2175k2 = true;
            if (c2175k.m7993n() != 1) {
                c2175k2 = null;
            }
            C2163a.m7919b(c2175k2, "first_chunk must be 1");
            this.f6884b = -1;
        }

        /* renamed from: a */
        public boolean m8132a() {
            int i = this.f6884b + 1;
            this.f6884b = i;
            if (i == this.f6883a) {
                return false;
            }
            long v;
            if (this.f6887e) {
                v = this.f6888f.m8001v();
            } else {
                v = this.f6888f.m7991l();
            }
            this.f6886d = v;
            if (this.f6884b == this.f6890h) {
                this.f6885c = this.f6889g.m7999t();
                this.f6889g.m7981d(4);
                i = this.f6891i - 1;
                this.f6891i = i;
                this.f6890h = i > 0 ? this.f6889g.m7999t() - 1 : -1;
            }
            return true;
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.c.b$b */
    private interface C2205b {
        /* renamed from: a */
        int mo1594a();

        /* renamed from: b */
        int mo1595b();

        /* renamed from: c */
        boolean mo1596c();
    }

    /* renamed from: com.google.android.exoplayer2.extractor.c.b$c */
    private static final class C2206c {
        /* renamed from: a */
        public final C2220k[] f6892a;
        /* renamed from: b */
        public Format f6893b;
        /* renamed from: c */
        public int f6894c;
        /* renamed from: d */
        public int f6895d = 0;

        public C2206c(int i) {
            this.f6892a = new C2220k[i];
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.c.b$f */
    private static final class C2207f {
        /* renamed from: a */
        private final int f6896a;
        /* renamed from: b */
        private final long f6897b;
        /* renamed from: c */
        private final int f6898c;

        public C2207f(int i, long j, int i2) {
            this.f6896a = i;
            this.f6897b = j;
            this.f6898c = i2;
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.c.b$d */
    static final class C3972d implements C2205b {
        /* renamed from: a */
        private final int f15859a = this.f15861c.m7999t();
        /* renamed from: b */
        private final int f15860b = this.f15861c.m7999t();
        /* renamed from: c */
        private final C2175k f15861c;

        public C3972d(C3971b c3971b) {
            this.f15861c = c3971b.aQ;
            this.f15861c.m7979c(12);
        }

        /* renamed from: a */
        public int mo1594a() {
            return this.f15860b;
        }

        /* renamed from: b */
        public int mo1595b() {
            return this.f15859a == 0 ? this.f15861c.m7999t() : this.f15859a;
        }

        /* renamed from: c */
        public boolean mo1596c() {
            return this.f15859a != 0;
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.c.b$e */
    static final class C3973e implements C2205b {
        /* renamed from: a */
        private final C2175k f15862a;
        /* renamed from: b */
        private final int f15863b = this.f15862a.m7999t();
        /* renamed from: c */
        private final int f15864c = (this.f15862a.m7999t() & 255);
        /* renamed from: d */
        private int f15865d;
        /* renamed from: e */
        private int f15866e;

        /* renamed from: c */
        public boolean mo1596c() {
            return false;
        }

        public C3973e(C3971b c3971b) {
            this.f15862a = c3971b.aQ;
            this.f15862a.m7979c(12);
        }

        /* renamed from: a */
        public int mo1594a() {
            return this.f15863b;
        }

        /* renamed from: b */
        public int mo1595b() {
            if (this.f15864c == 8) {
                return this.f15862a.m7986g();
            }
            if (this.f15864c == 16) {
                return this.f15862a.m7987h();
            }
            int i = this.f15865d;
            this.f15865d = i + 1;
            if (i % 2 != 0) {
                return this.f15866e & 15;
            }
            this.f15866e = this.f15862a.m7986g();
            return (this.f15866e & 240) >> 4;
        }
    }

    /* renamed from: a */
    public static C2219j m8144a(C3970a c3970a, C3971b c3971b, long j, DrmInitData drmInitData, boolean z) {
        C3970a c3970a2 = c3970a;
        C3970a e = c3970a2.m19797e(C2203a.f6835E);
        int c = C2208b.m8155c(e.m19796d(C2203a.f6849S).aQ);
        C2219j c2219j = null;
        if (c == -1) {
            return null;
        }
        long a;
        C3971b c3971b2;
        C2207f b = C2208b.m8152b(c3970a2.m19796d(C2203a.f6845O).aQ);
        long j2 = -9223372036854775807L;
        if (j == -9223372036854775807L) {
            a = b.f6897b;
            c3971b2 = c3971b;
        } else {
            c3971b2 = c3971b;
            a = j;
        }
        long a2 = C2208b.m8141a(c3971b2.aQ);
        if (a != -9223372036854775807L) {
            j2 = C2186s.m8057b(a, 1000000, a2);
        }
        long j3 = j2;
        C3970a e2 = e.m19797e(C2203a.f6836F).m19797e(C2203a.f6837G);
        Pair d = C2208b.m8157d(e.m19796d(C2203a.f6848R).aQ);
        C2206c a3 = C2208b.m8143a(e2.m19796d(C2203a.f6850T).aQ, b.f6896a, b.f6898c, (String) d.second, drmInitData, z);
        Pair a4 = C2208b.m8142a(c3970a2.m19797e(C2203a.f6846P));
        if (a3.f6893b != null) {
            int b2 = b.f6896a;
            long longValue = ((Long) d.first).longValue();
            Format format = a3.f6893b;
            int i = a3.f6895d;
            C2220k[] c2220kArr = a3.f6892a;
            int i2 = a3.f6894c;
            C2219j c2219j2 = new C2219j(b2, c, longValue, a2, j3, format, i, c2220kArr, i2, (long[]) a4.first, (long[]) a4.second);
        }
        return c2219j;
    }

    /* renamed from: a */
    public static C2222m m8145a(C2219j c2219j, C3970a c3970a, C2263j c2263j) {
        C2205b c3972d;
        C2219j c2219j2 = c2219j;
        C3970a c3970a2 = c3970a;
        C2263j c2263j2 = c2263j;
        C3971b d = c3970a2.m19796d(C2203a.aq);
        if (d != null) {
            c3972d = new C3972d(d);
        } else {
            d = c3970a2.m19796d(C2203a.ar);
            if (d != null) {
                c3972d = new C3973e(d);
            } else {
                throw new ParserException("Track has no sample table size information");
            }
        }
        int a = c3972d.mo1594a();
        if (a == 0) {
            return new C2222m(new long[0], new int[0], 0, new long[0], new int[0]);
        }
        boolean z;
        int t;
        int t2;
        Object obj;
        long[] jArr;
        Object obj2;
        int i;
        int i2;
        int i3;
        int i4;
        long j;
        int i5;
        Object obj3;
        Object obj4;
        Object obj5;
        C3971b d2 = c3970a2.m19796d(C2203a.as);
        if (d2 == null) {
            d2 = c3970a2.m19796d(C2203a.at);
            z = true;
        } else {
            z = false;
        }
        C2175k c2175k = d2.aQ;
        C2175k c2175k2 = c3970a2.m19796d(C2203a.ap).aQ;
        C2175k c2175k3 = c3970a2.m19796d(C2203a.am).aQ;
        C3971b d3 = c3970a2.m19796d(C2203a.an);
        C2175k c2175k4 = d3 != null ? d3.aQ : null;
        C3971b d4 = c3970a2.m19796d(C2203a.ao);
        C2175k c2175k5 = d4 != null ? d4.aQ : null;
        C2204a c2204a = new C2204a(c2175k2, c2175k, z);
        c2175k3.m7979c(12);
        int t3 = c2175k3.m7999t() - 1;
        int t4 = c2175k3.m7999t();
        int t5 = c2175k3.m7999t();
        if (c2175k5 != null) {
            c2175k5.m7979c(12);
            t = c2175k5.m7999t();
        } else {
            t = 0;
        }
        int i6 = -1;
        if (c2175k4 != null) {
            c2175k4.m7979c(12);
            t2 = c2175k4.m7999t();
            if (t2 > 0) {
                i6 = c2175k4.m7999t() - 1;
            } else {
                c2175k4 = null;
            }
        } else {
            t2 = 0;
        }
        Object obj6 = (c3972d.mo1596c() && "audio/raw".equals(c2219j2.f6965f.f6489f) && t3 == 0 && t == 0 && t2 == 0) ? 1 : null;
        long j2 = 0;
        C2205b c2205b;
        if (obj6 == null) {
            int i7;
            obj6 = new long[a];
            obj = new int[a];
            jArr = new long[a];
            int i8 = t2;
            obj2 = new int[a];
            C2175k c2175k6 = c2175k3;
            i = i6;
            long j3 = 0;
            long j4 = j3;
            i2 = i8;
            i6 = 0;
            int i9 = 0;
            int i10 = 0;
            i3 = t3;
            i8 = t;
            t3 = 0;
            t = 0;
            int i11 = t5;
            t5 = t4;
            t4 = i11;
            while (t3 < a) {
                int i12;
                while (i9 == 0) {
                    C2163a.m7918b(c2204a.m8132a());
                    i12 = t4;
                    i7 = i3;
                    long j5 = c2204a.f6886d;
                    i9 = c2204a.f6885c;
                    t4 = i12;
                    i3 = i7;
                    j3 = j5;
                }
                i12 = t4;
                i7 = i3;
                if (c2175k5 != null) {
                    while (i10 == 0 && i8 > 0) {
                        i10 = c2175k5.m7999t();
                        i6 = c2175k5.m7993n();
                        i8--;
                    }
                    i10--;
                }
                t4 = i6;
                obj6[t3] = j3;
                obj[t3] = c3972d.mo1595b();
                if (obj[t3] > t) {
                    i4 = a;
                    c2205b = c3972d;
                    t = obj[t3];
                } else {
                    i4 = a;
                    c2205b = c3972d;
                }
                jArr[t3] = j4 + ((long) t4);
                obj2[t3] = c2175k4 == null ? 1 : 0;
                if (t3 == i) {
                    obj2[t3] = 1;
                    i2--;
                    if (i2 > 0) {
                        i = c2175k4.m7999t() - 1;
                    }
                }
                int i13 = i2;
                int i14 = i;
                i2 = i12;
                j4 += (long) i2;
                t5--;
                if (t5 != 0 || i7 <= 0) {
                    i3 = i7;
                } else {
                    i3 = i7 - 1;
                    t5 = c2175k6.m7999t();
                    i2 = c2175k6.m7999t();
                }
                j3 += (long) obj[t3];
                i9--;
                t3++;
                i6 = t4;
                c3972d = c2205b;
                a = i4;
                i = i14;
                t4 = i2;
                i2 = i13;
            }
            i4 = a;
            i7 = i3;
            C2163a.m7916a(i10 == 0);
            while (i8 > 0) {
                C2163a.m7916a(c2175k5.m7999t() == 0);
                c2175k5.m7993n();
                i8--;
            }
            if (i2 == 0 && t5 == 0 && i9 == 0) {
                if (i7 == 0) {
                    c2219j2 = c2219j;
                    j = j4;
                    i5 = t;
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Inconsistent stbl box for track ");
            a = i2;
            c2219j2 = c2219j;
            stringBuilder.append(c2219j2.f6960a);
            stringBuilder.append(": remainingSynchronizationSamples ");
            stringBuilder.append(a);
            stringBuilder.append(", remainingSamplesAtTimestampDelta ");
            stringBuilder.append(t5);
            stringBuilder.append(", remainingSamplesInChunk ");
            stringBuilder.append(i9);
            stringBuilder.append(", remainingTimestampDeltaChanges ");
            stringBuilder.append(i7);
            Log.w("AtomParsers", stringBuilder.toString());
            j = j4;
            i5 = t;
        } else {
            i4 = a;
            c2205b = c3972d;
            long[] jArr2 = new long[c2204a.f6883a];
            int[] iArr = new int[c2204a.f6883a];
            while (c2204a.m8132a()) {
                jArr2[c2204a.f6884b] = c2204a.f6886d;
                iArr[c2204a.f6884b] = c2204a.f6885c;
            }
            C2211a a2 = C2212d.m8161a(c2205b.mo1595b(), jArr2, iArr, (long) t5);
            obj6 = a2.f6911a;
            obj = a2.f6912b;
            i = a2.f6913c;
            jArr = a2.f6914d;
            obj2 = a2.f6915e;
            i5 = i;
            j = 0;
        }
        if (c2219j2.f6968i != null) {
            if (!c2263j.m8327a()) {
                long j6;
                long b;
                Object obj7;
                long[] jArr3;
                Object obj8;
                Object obj9;
                if (c2219j2.f6968i.length == 1 && c2219j2.f6961b == 1 && jArr.length >= 2) {
                    j6 = c2219j2.f6969j[0];
                    long b2 = C2186s.m8057b(c2219j2.f6968i[0], c2219j2.f6962c, c2219j2.f6963d) + j6;
                    if (jArr[0] <= j6 && j6 < jArr[1] && jArr[jArr.length - 1] < b2 && b2 <= j) {
                        long j7 = j - b2;
                        j = C2186s.m8057b(j6 - jArr[0], (long) c2219j2.f6965f.f6502s, c2219j2.f6962c);
                        b = C2186s.m8057b(j7, (long) c2219j2.f6965f.f6502s, c2219j2.f6962c);
                        if (!(j == 0 && b == 0) && j <= 2147483647L && b <= 2147483647L) {
                            c2263j2 = c2263j;
                            c2263j2.f7175b = (int) j;
                            c2263j2.f7176c = (int) b;
                            C2186s.m8049a(jArr, 1000000, c2219j2.f6962c);
                            return new C2222m(obj6, obj, i5, jArr, obj2);
                        }
                    }
                }
                if (c2219j2.f6968i.length == 1) {
                    int i15 = 0;
                    if (c2219j2.f6968i[0] == 0) {
                        int i16 = 0;
                        while (i16 < jArr.length) {
                            jArr[i16] = C2186s.m8057b(jArr[i16] - c2219j2.f6969j[i15], 1000000, c2219j2.f6962c);
                            i16++;
                            i15 = 0;
                        }
                        return new C2222m(obj6, obj, i5, jArr, obj2);
                    }
                }
                boolean z2 = c2219j2.f6961b == 1;
                i = 0;
                a = 0;
                int i17 = 0;
                t3 = 0;
                while (i < c2219j2.f6968i.length) {
                    long j8 = c2219j2.f6969j[i];
                    if (j8 != -1) {
                        obj7 = obj;
                        long b3 = C2186s.m8057b(c2219j2.f6968i[i], c2219j2.f6962c, c2219j2.f6963d);
                        int b4 = C2186s.m8056b(jArr, j8, true, true);
                        i3 = C2186s.m8056b(jArr, j8 + b3, z2, false);
                        i17 += i3 - b4;
                        a |= t3 != b4 ? 1 : 0;
                        t3 = i3;
                    } else {
                        obj7 = obj;
                    }
                    i++;
                    obj = obj7;
                }
                obj7 = obj;
                i = (i17 != i4 ? 1 : 0) | a;
                Object obj10 = i != 0 ? new long[i17] : obj6;
                obj = i != 0 ? new int[i17] : obj7;
                if (i != 0) {
                    i5 = 0;
                }
                obj3 = i != 0 ? new int[i17] : obj2;
                long[] jArr4 = new long[i17];
                int i18 = i5;
                t4 = 0;
                int i19 = 0;
                while (t4 < c2219j2.f6968i.length) {
                    int i20;
                    boolean z3;
                    j6 = c2219j2.f6969j[t4];
                    long j9 = c2219j2.f6968i[t4];
                    if (j6 != -1) {
                        Object obj11 = obj3;
                        i20 = t4;
                        Object obj12 = obj10;
                        jArr3 = jArr4;
                        b = C2186s.m8057b(j9, c2219j2.f6962c, c2219j2.f6963d) + j6;
                        t4 = C2186s.m8056b(jArr, j6, true, true);
                        a = C2186s.m8056b(jArr, b, z2, false);
                        if (i != 0) {
                            i17 = a - t4;
                            obj8 = obj12;
                            System.arraycopy(obj6, t4, obj8, i19, i17);
                            obj3 = obj7;
                            System.arraycopy(obj3, t4, obj, i19, i17);
                            z3 = z2;
                            obj9 = obj11;
                            System.arraycopy(obj2, t4, obj9, i19, i17);
                        } else {
                            z3 = z2;
                            obj3 = obj7;
                            obj9 = obj11;
                            obj8 = obj12;
                        }
                        i17 = i18;
                        while (t4 < a) {
                            obj4 = obj6;
                            obj5 = obj2;
                            long j10 = j6;
                            jArr3[i19] = C2186s.m8057b(j2, 1000000, c2219j2.f6963d) + C2186s.m8057b(jArr[t4] - j6, 1000000, c2219j2.f6962c);
                            if (i != 0 && obj[i19] > i17) {
                                i17 = obj3[t4];
                            }
                            i19++;
                            t4++;
                            obj6 = obj4;
                            obj2 = obj5;
                            j6 = j10;
                        }
                        obj4 = obj6;
                        obj5 = obj2;
                        i18 = i17;
                    } else {
                        z3 = z2;
                        obj8 = obj10;
                        jArr3 = jArr4;
                        obj4 = obj6;
                        obj5 = obj2;
                        obj9 = obj3;
                        i20 = t4;
                        obj3 = obj7;
                    }
                    j2 += j9;
                    t4 = i20 + 1;
                    obj7 = obj3;
                    obj10 = obj8;
                    j6 = -1;
                    jArr4 = jArr3;
                    obj6 = obj4;
                    obj2 = obj5;
                    obj3 = obj9;
                    z2 = z3;
                }
                obj8 = obj10;
                jArr3 = jArr4;
                obj9 = obj3;
                i = 0;
                for (i2 = 0; i2 < obj9.length && i == 0; i2++) {
                    i |= (obj9[i2] & 1) != 0 ? 1 : 0;
                }
                if (i != 0) {
                    return new C2222m(obj8, obj, i18, jArr3, obj9);
                }
                throw new ParserException("The edited sample sequence does not contain a sync sample.");
            }
        }
        obj4 = obj6;
        obj5 = obj2;
        obj3 = obj;
        C2186s.m8049a(jArr, 1000000, c2219j2.f6962c);
        return new C2222m(obj4, obj3, i5, jArr, obj5);
    }

    /* renamed from: a */
    public static Metadata m8147a(C3971b c3971b, boolean z) {
        if (z) {
            return null;
        }
        C2175k c2175k = c3971b.aQ;
        c2175k.m7979c(8);
        while (c2175k.m7976b() >= 8) {
            int d = c2175k.m7980d();
            int n = c2175k.m7993n();
            if (c2175k.m7993n() == C2203a.aB) {
                c2175k.m7979c(d);
                return C2208b.m8146a(c2175k, d + n);
            }
            c2175k.m7981d(n - 8);
        }
        return null;
    }

    /* renamed from: a */
    private static Metadata m8146a(C2175k c2175k, int i) {
        c2175k.m7981d(12);
        while (c2175k.m7980d() < i) {
            int d = c2175k.m7980d();
            int n = c2175k.m7993n();
            if (c2175k.m7993n() == C2203a.aC) {
                c2175k.m7979c(d);
                return C2208b.m8153b(c2175k, d + n);
            }
            c2175k.m7981d(n - 8);
        }
        return null;
    }

    /* renamed from: b */
    private static Metadata m8153b(C2175k c2175k, int i) {
        c2175k.m7981d(8);
        List arrayList = new ArrayList();
        while (c2175k.m7980d() < i) {
            Entry a = C2215f.m8165a(c2175k);
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList.isEmpty() != null ? null : new Metadata(arrayList);
    }

    /* renamed from: a */
    private static long m8141a(C2175k c2175k) {
        int i = 8;
        c2175k.m7979c(8);
        if (C2203a.m8129a(c2175k.m7993n()) != 0) {
            i = 16;
        }
        c2175k.m7981d(i);
        return c2175k.m7991l();
    }

    /* renamed from: b */
    private static C2207f m8152b(C2175k c2175k) {
        Object obj;
        int i = 8;
        c2175k.m7979c(8);
        int a = C2203a.m8129a(c2175k.m7993n());
        c2175k.m7981d(a == 0 ? 8 : 16);
        int n = c2175k.m7993n();
        c2175k.m7981d(4);
        int d = c2175k.m7980d();
        if (a == 0) {
            i = 4;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (c2175k.f6735a[d + i3] != (byte) -1) {
                obj = null;
                break;
            }
        }
        obj = 1;
        long j = -9223372036854775807L;
        if (obj != null) {
            c2175k.m7981d(i);
        } else {
            long l = a == 0 ? c2175k.m7991l() : c2175k.m8001v();
            if (l != 0) {
                j = l;
            }
        }
        c2175k.m7981d(16);
        i = c2175k.m7993n();
        a = c2175k.m7993n();
        c2175k.m7981d(4);
        int n2 = c2175k.m7993n();
        c2175k = c2175k.m7993n();
        if (i == 0 && a == 65536 && n2 == -65536 && c2175k == null) {
            i2 = 90;
        } else if (i == 0 && a == -65536 && n2 == 65536 && c2175k == null) {
            i2 = 270;
        } else if (i == -65536 && a == 0 && n2 == 0 && c2175k == -65536) {
            i2 = 180;
        }
        return new C2207f(n, j, i2);
    }

    /* renamed from: c */
    private static int m8155c(C2175k c2175k) {
        c2175k.m7979c(16);
        c2175k = c2175k.m7993n();
        if (c2175k == f6900b) {
            return 1;
        }
        if (c2175k == f6899a) {
            return 2;
        }
        if (!(c2175k == f6901c || c2175k == f6902d || c2175k == f6903e)) {
            if (c2175k != f6904f) {
                return c2175k == f6906h ? 4 : -1;
            }
        }
        return 3;
    }

    /* renamed from: d */
    private static Pair<Long, String> m8157d(C2175k c2175k) {
        int i = 8;
        c2175k.m7979c(8);
        int a = C2203a.m8129a(c2175k.m7993n());
        c2175k.m7981d(a == 0 ? 8 : 16);
        long l = c2175k.m7991l();
        if (a == 0) {
            i = 4;
        }
        c2175k.m7981d(i);
        c2175k = c2175k.m7987h();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append((char) (((c2175k >> 10) & 31) + 96));
        stringBuilder.append((char) (((c2175k >> 5) & 31) + 96));
        stringBuilder.append((char) ((c2175k & 31) + 96));
        return Pair.create(Long.valueOf(l), stringBuilder.toString());
    }

    /* renamed from: a */
    private static C2206c m8143a(C2175k c2175k, int i, int i2, String str, DrmInitData drmInitData, boolean z) {
        C2175k c2175k2 = c2175k;
        c2175k2.m7979c(12);
        int n = c2175k.m7993n();
        C2206c c2206c = new C2206c(n);
        for (int i3 = 0; i3 < n; i3++) {
            int d = c2175k.m7980d();
            int n2 = c2175k.m7993n();
            C2163a.m7917a(n2 > 0, "childAtomSize should be positive");
            int n3 = c2175k.m7993n();
            if (!(n3 == C2203a.f6858b || n3 == C2203a.f6859c || n3 == C2203a.f6856Z || n3 == C2203a.al || n3 == C2203a.f6860d || n3 == C2203a.f6861e || n3 == C2203a.f6862f || n3 == C2203a.aK)) {
                if (n3 != C2203a.aL) {
                    DrmInitData drmInitData2;
                    if (!(n3 == C2203a.f6865i || n3 == C2203a.aa || n3 == C2203a.f6870n || n3 == C2203a.f6872p || n3 == C2203a.f6874r || n3 == C2203a.f6877u || n3 == C2203a.f6875s || n3 == C2203a.f6876t || n3 == C2203a.ay || n3 == C2203a.az || n3 == C2203a.f6868l || n3 == C2203a.f6869m || n3 == C2203a.f6866j)) {
                        if (n3 != C2203a.aO) {
                            if (!(n3 == C2203a.aj || n3 == C2203a.au || n3 == C2203a.av || n3 == C2203a.aw)) {
                                if (n3 != C2203a.ax) {
                                    if (n3 == C2203a.aN) {
                                        c2206c.f6893b = Format.m7745a(Integer.toString(i), "application/x-camera-motion", null, -1, drmInitData);
                                    } else {
                                        drmInitData2 = drmInitData;
                                    }
                                    c2175k2.m7979c(d + n2);
                                }
                            }
                            drmInitData2 = drmInitData;
                            C2208b.m8149a(c2175k, n3, d, n2, i, str, drmInitData, c2206c);
                            c2175k2.m7979c(d + n2);
                        }
                    }
                    drmInitData2 = drmInitData;
                    C2208b.m8150a(c2175k, n3, d, n2, i, str, z, drmInitData, c2206c, i3);
                    c2175k2.m7979c(d + n2);
                }
            }
            C2208b.m8148a(c2175k, n3, d, n2, i, i2, drmInitData, c2206c, i3);
            c2175k2.m7979c(d + n2);
        }
        return c2206c;
    }

    /* renamed from: a */
    private static void m8149a(C2175k c2175k, int i, int i2, int i3, int i4, String str, DrmInitData drmInitData, C2206c c2206c) {
        String str2;
        String str3;
        C2175k c2175k2 = c2175k;
        int i5 = i;
        C2206c c2206c2 = c2206c;
        c2175k2.m7979c((i2 + 8) + 8);
        List list = null;
        long j = Long.MAX_VALUE;
        if (i5 == C2203a.aj) {
            str2 = "application/ttml+xml";
        } else if (i5 == C2203a.au) {
            int i6 = (i3 - 8) - 8;
            Object obj = new byte[i6];
            c2175k2.m7975a(obj, 0, i6);
            list = Collections.singletonList(obj);
            str3 = "application/x-quicktime-tx3g";
            c2206c2.f6893b = Format.m7743a(Integer.toString(i4), str3, null, -1, 0, str, -1, drmInitData, j, list);
        } else if (i5 == C2203a.av) {
            str2 = "application/x-mp4-vtt";
        } else if (i5 == C2203a.aw) {
            str2 = "application/ttml+xml";
            j = 0;
        } else if (i5 == C2203a.ax) {
            str2 = "application/x-mp4-cea-608";
            c2206c2.f6895d = 1;
        } else {
            throw new IllegalStateException();
        }
        str3 = str2;
        c2206c2.f6893b = Format.m7743a(Integer.toString(i4), str3, null, -1, 0, str, -1, drmInitData, j, list);
    }

    /* renamed from: a */
    private static void m8148a(C2175k c2175k, int i, int i2, int i3, int i4, int i5, DrmInitData drmInitData, C2206c c2206c, int i6) {
        int a;
        C2175k c2175k2 = c2175k;
        int i7 = i2;
        int i8 = i3;
        C2206c c2206c2 = c2206c;
        c2175k2.m7979c((i7 + 8) + 8);
        c2175k2.m7981d(16);
        int h = c2175k.m7987h();
        int h2 = c2175k.m7987h();
        c2175k2.m7981d(50);
        int d = c2175k.m7980d();
        int i9 = i;
        if (i9 == C2203a.f6856Z) {
            a = C2208b.m8140a(c2175k2, i7, i8, c2206c2, i6);
            c2175k2.m7979c(d);
        } else {
            a = i9;
        }
        String str = null;
        List list = str;
        byte[] bArr = list;
        Object obj = null;
        float f = 1.0f;
        int i10 = -1;
        while (d - i7 < i8) {
            c2175k2.m7979c(d);
            int d2 = c2175k.m7980d();
            int n = c2175k.m7993n();
            if (n != 0 || c2175k.m7980d() - i7 != i8) {
                C2163a.m7917a(n > 0, "childAtomSize should be positive");
                int n2 = c2175k.m7993n();
                if (n2 == C2203a.f6838H) {
                    C2163a.m7918b(str == null);
                    str = "video/avc";
                    c2175k2.m7979c(d2 + 8);
                    C2375a a2 = C2375a.m8712a(c2175k);
                    list = a2.f7539a;
                    c2206c2.f6894c = a2.f7540b;
                    if (obj == null) {
                        f = a2.f7543e;
                    }
                } else if (n2 == C2203a.f6839I) {
                    C2163a.m7918b(str == null);
                    str = "video/hevc";
                    c2175k2.m7979c(d2 + 8);
                    C2376b a3 = C2376b.m8714a(c2175k);
                    list = a3.f7544a;
                    c2206c2.f6894c = a3.f7545b;
                } else if (n2 == C2203a.aM) {
                    C2163a.m7918b(str == null);
                    str = a == C2203a.aK ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                } else if (n2 == C2203a.f6863g) {
                    C2163a.m7918b(str == null);
                    str = "video/3gpp";
                } else if (n2 == C2203a.f6840J) {
                    C2163a.m7918b(str == null);
                    Pair d3 = C2208b.m8158d(c2175k2, d2);
                    str = (String) d3.first;
                    list = Collections.singletonList(d3.second);
                } else if (n2 == C2203a.ai) {
                    f = C2208b.m8154c(c2175k2, d2);
                    obj = 1;
                } else if (n2 == C2203a.aI) {
                    bArr = C2208b.m8159d(c2175k2, d2, n);
                } else if (n2 == C2203a.aH) {
                    n2 = c2175k.m7986g();
                    c2175k2.m7981d(3);
                    if (n2 == 0) {
                        switch (c2175k.m7986g()) {
                            case 0:
                                i10 = 0;
                                break;
                            case 1:
                                i10 = 1;
                                break;
                            case 2:
                                i10 = 2;
                                break;
                            case 3:
                                i10 = 3;
                                break;
                            default:
                                break;
                        }
                    }
                }
                d += n;
                i7 = i2;
            } else if (str == null) {
                c2206c2.f6893b = Format.m7738a(Integer.toString(i4), str, null, -1, -1, h, h2, -1.0f, list, i5, f, bArr, i10, null, drmInitData);
            }
        }
        if (str == null) {
            c2206c2.f6893b = Format.m7738a(Integer.toString(i4), str, null, -1, -1, h, h2, -1.0f, list, i5, f, bArr, i10, null, drmInitData);
        }
    }

    /* renamed from: a */
    private static Pair<long[], long[]> m8142a(C3970a c3970a) {
        if (c3970a != null) {
            c3970a = c3970a.m19796d(C2203a.f6847Q);
            if (c3970a != null) {
                c3970a = c3970a.aQ;
                c3970a.m7979c(8);
                int a = C2203a.m8129a(c3970a.m7993n());
                int t = c3970a.m7999t();
                Object obj = new long[t];
                Object obj2 = new long[t];
                int i = 0;
                while (i < t) {
                    obj[i] = a == 1 ? c3970a.m8001v() : c3970a.m7991l();
                    obj2[i] = a == 1 ? c3970a.m7995p() : (long) c3970a.m7993n();
                    if (c3970a.m7989j() == (short) 1) {
                        c3970a.m7981d(2);
                        i++;
                    } else {
                        throw new IllegalArgumentException("Unsupported media rate.");
                    }
                }
                return Pair.create(obj, obj2);
            }
        }
        return Pair.create(null, null);
    }

    /* renamed from: c */
    private static float m8154c(C2175k c2175k, int i) {
        c2175k.m7979c(i + 8);
        return ((float) c2175k.m7999t()) / ((float) c2175k.m7999t());
    }

    /* renamed from: a */
    private static void m8150a(C2175k c2175k, int i, int i2, int i3, int i4, String str, boolean z, DrmInitData drmInitData, C2206c c2206c, int i5) {
        int h;
        int round;
        int i6;
        int i7;
        int a;
        String str2;
        int i8;
        int i9;
        String str3;
        int i10;
        Object obj;
        int i11;
        String str4;
        int i12;
        C2206c c2206c2;
        Pair d;
        String str5;
        List list;
        C2175k c2175k2 = c2175k;
        int i13 = i2;
        int i14 = i3;
        String str6 = str;
        DrmInitData drmInitData2 = drmInitData;
        C2206c c2206c3 = c2206c;
        c2175k2.m7979c((i13 + 8) + 8);
        if (z) {
            h = c2175k.m7987h();
            c2175k2.m7981d(6);
        } else {
            c2175k2.m7981d(8);
            h = 0;
        }
        if (h != 0) {
            if (h != 1) {
                if (h == 2) {
                    c2175k2.m7981d(16);
                    round = (int) Math.round(c2175k.m8002w());
                    h = c2175k.m7999t();
                    c2175k2.m7981d(20);
                    i6 = h;
                    h = c2175k.m7980d();
                    i7 = i;
                    if (i7 == C2203a.aa) {
                        a = C2208b.m8140a(c2175k2, i13, i14, c2206c3, i5);
                        c2175k2.m7979c(h);
                        i7 = a;
                    }
                    if (i7 == C2203a.f6870n) {
                        str2 = "audio/ac3";
                    } else if (i7 == C2203a.f6872p) {
                        str2 = "audio/eac3";
                    } else if (i7 != C2203a.f6874r) {
                        str2 = "audio/vnd.dts";
                    } else {
                        if (i7 != C2203a.f6875s) {
                            if (i7 == C2203a.f6876t) {
                                if (i7 == C2203a.f6877u) {
                                    str2 = "audio/vnd.dts.hd;profile=lbr";
                                } else if (i7 == C2203a.ay) {
                                    str2 = "audio/3gpp";
                                } else if (i7 != C2203a.az) {
                                    str2 = "audio/amr-wb";
                                } else {
                                    if (i7 != C2203a.f6868l) {
                                        if (i7 == C2203a.f6869m) {
                                            str2 = i7 != C2203a.f6866j ? "audio/mpeg" : i7 != C2203a.aO ? "audio/alac" : null;
                                        }
                                    }
                                    str2 = "audio/raw";
                                }
                            }
                        }
                        str2 = "audio/vnd.dts.hd";
                    }
                    i8 = round;
                    i9 = h;
                    str3 = str2;
                    i10 = i6;
                    obj = null;
                    while (i9 - i13 < i14) {
                        c2175k2.m7979c(i9);
                        i6 = c2175k.m7993n();
                        C2163a.m7917a(i6 <= 0, "childAtomSize should be positive");
                        round = c2175k.m7993n();
                        if (round != C2203a.f6840J) {
                            if (z || round != C2203a.f6867k) {
                                if (round == C2203a.f6871o) {
                                    c2175k2.m7979c(i9 + 8);
                                    c2206c3.f6893b = C2137a.m7850a(c2175k2, Integer.toString(i4), str6, drmInitData2);
                                } else if (round != C2203a.f6873q) {
                                    c2175k2.m7979c(i9 + 8);
                                    c2206c3.f6893b = C2137a.m7852b(c2175k2, Integer.toString(i4), str6, drmInitData2);
                                } else {
                                    if (round != C2203a.f6878v) {
                                        i11 = i6;
                                        str4 = str3;
                                        i12 = i9;
                                        c2206c2 = c2206c3;
                                        c2206c2.f6893b = Format.m7741a(Integer.toString(i4), str3, null, -1, -1, i10, i8, null, drmInitData, 0, str);
                                    } else {
                                        i11 = i6;
                                        str4 = str3;
                                        i12 = i9;
                                        c2206c2 = c2206c3;
                                        if (round == C2203a.aO) {
                                            a = i11;
                                            Object obj2 = new byte[a];
                                            i6 = i12;
                                            c2175k2.m7979c(i6);
                                            c2175k2.m7975a(obj2, 0, a);
                                            obj = obj2;
                                            i9 = i6 + a;
                                            drmInitData2 = drmInitData;
                                            c2206c3 = c2206c2;
                                            str3 = str4;
                                            i14 = i3;
                                        }
                                    }
                                    a = i11;
                                    i6 = i12;
                                    i9 = i6 + a;
                                    drmInitData2 = drmInitData;
                                    c2206c3 = c2206c2;
                                    str3 = str4;
                                    i14 = i3;
                                }
                                a = i6;
                                str4 = str3;
                                i6 = i9;
                                c2206c2 = c2206c3;
                                i9 = i6 + a;
                                drmInitData2 = drmInitData;
                                c2206c3 = c2206c2;
                                str3 = str4;
                                i14 = i3;
                            }
                        }
                        a = i6;
                        str4 = str3;
                        i6 = i9;
                        c2206c2 = c2206c3;
                        if (round != C2203a.f6840J) {
                            i9 = i6;
                        } else {
                            i9 = C2208b.m8139a(c2175k2, i6, a);
                        }
                        if (i9 == -1) {
                            d = C2208b.m8158d(c2175k2, i9);
                            str5 = (String) d.first;
                            obj = (byte[]) d.second;
                            if ("audio/mp4a-latm".equals(str5)) {
                                d = C2164b.m7921a((byte[]) obj);
                                i8 = ((Integer) d.first).intValue();
                                i10 = ((Integer) d.second).intValue();
                            }
                        } else {
                            str5 = str4;
                        }
                        str4 = str5;
                        i9 = i6 + a;
                        drmInitData2 = drmInitData;
                        c2206c3 = c2206c2;
                        str3 = str4;
                        i14 = i3;
                    }
                    str4 = str3;
                    c2206c2 = c2206c3;
                    if (c2206c2.f6893b == null) {
                        str2 = str4;
                        if (str2 != null) {
                            i7 = "audio/raw".equals(str2) ? 2 : -1;
                            String num = Integer.toString(i4);
                            if (obj != null) {
                                list = null;
                            } else {
                                list = Collections.singletonList(obj);
                            }
                            c2206c2.f6893b = Format.m7740a(num, str2, null, -1, -1, i10, i8, i7, list, drmInitData, 0, str);
                        }
                    }
                }
                return;
            }
        }
        i6 = c2175k.m7987h();
        c2175k2.m7981d(6);
        round = c2175k.m7997r();
        if (h == 1) {
            c2175k2.m7981d(16);
        }
        h = c2175k.m7980d();
        i7 = i;
        if (i7 == C2203a.aa) {
            a = C2208b.m8140a(c2175k2, i13, i14, c2206c3, i5);
            c2175k2.m7979c(h);
            i7 = a;
        }
        if (i7 == C2203a.f6870n) {
            str2 = "audio/ac3";
        } else if (i7 == C2203a.f6872p) {
            str2 = "audio/eac3";
        } else if (i7 != C2203a.f6874r) {
            if (i7 != C2203a.f6875s) {
                if (i7 == C2203a.f6876t) {
                    if (i7 == C2203a.f6877u) {
                        str2 = "audio/vnd.dts.hd;profile=lbr";
                    } else if (i7 == C2203a.ay) {
                        str2 = "audio/3gpp";
                    } else if (i7 != C2203a.az) {
                        if (i7 != C2203a.f6868l) {
                            if (i7 == C2203a.f6869m) {
                                if (i7 != C2203a.f6866j) {
                                    if (i7 != C2203a.aO) {
                                    }
                                }
                            }
                        }
                        str2 = "audio/raw";
                    } else {
                        str2 = "audio/amr-wb";
                    }
                }
            }
            str2 = "audio/vnd.dts.hd";
        } else {
            str2 = "audio/vnd.dts";
        }
        i8 = round;
        i9 = h;
        str3 = str2;
        i10 = i6;
        obj = null;
        while (i9 - i13 < i14) {
            c2175k2.m7979c(i9);
            i6 = c2175k.m7993n();
            if (i6 <= 0) {
            }
            C2163a.m7917a(i6 <= 0, "childAtomSize should be positive");
            round = c2175k.m7993n();
            if (round != C2203a.f6840J) {
                if (z) {
                }
                if (round == C2203a.f6871o) {
                    c2175k2.m7979c(i9 + 8);
                    c2206c3.f6893b = C2137a.m7850a(c2175k2, Integer.toString(i4), str6, drmInitData2);
                } else if (round != C2203a.f6873q) {
                    if (round != C2203a.f6878v) {
                        i11 = i6;
                        str4 = str3;
                        i12 = i9;
                        c2206c2 = c2206c3;
                        if (round == C2203a.aO) {
                            a = i11;
                            Object obj22 = new byte[a];
                            i6 = i12;
                            c2175k2.m7979c(i6);
                            c2175k2.m7975a(obj22, 0, a);
                            obj = obj22;
                            i9 = i6 + a;
                            drmInitData2 = drmInitData;
                            c2206c3 = c2206c2;
                            str3 = str4;
                            i14 = i3;
                        }
                    } else {
                        i11 = i6;
                        str4 = str3;
                        i12 = i9;
                        c2206c2 = c2206c3;
                        c2206c2.f6893b = Format.m7741a(Integer.toString(i4), str3, null, -1, -1, i10, i8, null, drmInitData, 0, str);
                    }
                    a = i11;
                    i6 = i12;
                    i9 = i6 + a;
                    drmInitData2 = drmInitData;
                    c2206c3 = c2206c2;
                    str3 = str4;
                    i14 = i3;
                } else {
                    c2175k2.m7979c(i9 + 8);
                    c2206c3.f6893b = C2137a.m7852b(c2175k2, Integer.toString(i4), str6, drmInitData2);
                }
                a = i6;
                str4 = str3;
                i6 = i9;
                c2206c2 = c2206c3;
                i9 = i6 + a;
                drmInitData2 = drmInitData;
                c2206c3 = c2206c2;
                str3 = str4;
                i14 = i3;
            }
            a = i6;
            str4 = str3;
            i6 = i9;
            c2206c2 = c2206c3;
            if (round != C2203a.f6840J) {
                i9 = C2208b.m8139a(c2175k2, i6, a);
            } else {
                i9 = i6;
            }
            if (i9 == -1) {
                str5 = str4;
            } else {
                d = C2208b.m8158d(c2175k2, i9);
                str5 = (String) d.first;
                obj = (byte[]) d.second;
                if ("audio/mp4a-latm".equals(str5)) {
                    d = C2164b.m7921a((byte[]) obj);
                    i8 = ((Integer) d.first).intValue();
                    i10 = ((Integer) d.second).intValue();
                }
            }
            str4 = str5;
            i9 = i6 + a;
            drmInitData2 = drmInitData;
            c2206c3 = c2206c2;
            str3 = str4;
            i14 = i3;
        }
        str4 = str3;
        c2206c2 = c2206c3;
        if (c2206c2.f6893b == null) {
            str2 = str4;
            if (str2 != null) {
                if ("audio/raw".equals(str2)) {
                }
                String num2 = Integer.toString(i4);
                if (obj != null) {
                    list = Collections.singletonList(obj);
                } else {
                    list = null;
                }
                c2206c2.f6893b = Format.m7740a(num2, str2, null, -1, -1, i10, i8, i7, list, drmInitData, 0, str);
            }
        }
    }

    /* renamed from: a */
    private static int m8139a(C2175k c2175k, int i, int i2) {
        int d = c2175k.m7980d();
        while (d - i < i2) {
            c2175k.m7979c(d);
            int n = c2175k.m7993n();
            C2163a.m7917a(n > 0, "childAtomSize should be positive");
            if (c2175k.m7993n() == C2203a.f6840J) {
                return d;
            }
            d += n;
        }
        return -1;
    }

    /* renamed from: d */
    private static Pair<String, byte[]> m8158d(C2175k c2175k, int i) {
        c2175k.m7979c((i + 8) + 4);
        c2175k.m7981d(1);
        C2208b.m8160e(c2175k);
        c2175k.m7981d(2);
        int g = c2175k.m7986g();
        if ((g & 128) != 0) {
            c2175k.m7981d(2);
        }
        if ((g & 64) != 0) {
            c2175k.m7981d(c2175k.m7987h());
        }
        if ((g & 32) != 0) {
            c2175k.m7981d(2);
        }
        c2175k.m7981d(1);
        C2208b.m8160e(c2175k);
        Object obj = null;
        switch (c2175k.m7986g()) {
            case 32:
                obj = "video/mp4v-es";
                break;
            case 33:
                obj = "video/avc";
                break;
            case 35:
                obj = "video/hevc";
                break;
            case 64:
            case 102:
            case 103:
            case 104:
                obj = "audio/mp4a-latm";
                break;
            case 107:
                return Pair.create("audio/mpeg", null);
            case 165:
                obj = "audio/ac3";
                break;
            case 166:
                obj = "audio/eac3";
                break;
            case 169:
            case 172:
                return Pair.create("audio/vnd.dts", null);
            case 170:
            case 171:
                return Pair.create("audio/vnd.dts.hd", null);
            default:
                break;
        }
        c2175k.m7981d(12);
        c2175k.m7981d(1);
        i = C2208b.m8160e(c2175k);
        Object obj2 = new byte[i];
        c2175k.m7975a(obj2, 0, i);
        return Pair.create(obj, obj2);
    }

    /* renamed from: a */
    private static int m8140a(C2175k c2175k, int i, int i2, C2206c c2206c, int i3) {
        int d = c2175k.m7980d();
        while (true) {
            boolean z = false;
            if (d - i >= i2) {
                return 0;
            }
            c2175k.m7979c(d);
            int n = c2175k.m7993n();
            if (n > 0) {
                z = true;
            }
            C2163a.m7917a(z, "childAtomSize should be positive");
            if (c2175k.m7993n() == C2203a.f6852V) {
                Pair b = C2208b.m8151b(c2175k, d, n);
                if (b != null) {
                    c2206c.f6892a[i3] = (C2220k) b.second;
                    return ((Integer) b.first).intValue();
                }
            }
            d += n;
        }
    }

    /* renamed from: b */
    private static Pair<Integer, C2220k> m8151b(C2175k c2175k, int i, int i2) {
        int i3 = i + 8;
        boolean z = false;
        Object obj = null;
        Object obj2 = obj;
        Object obj3 = null;
        while (true) {
            Object obj4 = 1;
            if (i3 - i >= i2) {
                break;
            }
            c2175k.m7979c(i3);
            int n = c2175k.m7993n();
            int n2 = c2175k.m7993n();
            if (n2 == C2203a.ab) {
                obj = Integer.valueOf(c2175k.m7993n());
            } else if (n2 == C2203a.f6853W) {
                c2175k.m7981d(4);
                if (c2175k.m7993n() != f6905g) {
                    obj4 = null;
                }
                obj3 = obj4;
            } else if (n2 == C2203a.f6854X) {
                obj2 = C2208b.m8156c(c2175k, i3, n);
            }
            i3 += n;
        }
        if (obj3 == null) {
            return null;
        }
        C2163a.m7917a(obj != null ? true : null, "frma atom is mandatory");
        if (obj2 != null) {
            z = true;
        }
        C2163a.m7917a(z, "schi->tenc atom is mandatory");
        return Pair.create(obj, obj2);
    }

    /* renamed from: c */
    private static C2220k m8156c(C2175k c2175k, int i, int i2) {
        int i3 = i + 8;
        while (i3 - i < i2) {
            c2175k.m7979c(i3);
            int n = c2175k.m7993n();
            if (c2175k.m7993n() == C2203a.f6855Y) {
                c2175k.m7981d(6);
                boolean z = true;
                if (c2175k.m7986g() != 1) {
                    z = false;
                }
                i = c2175k.m7986g();
                byte[] bArr = new byte[16];
                c2175k.m7975a(bArr, 0, bArr.length);
                return new C2220k(z, i, bArr);
            }
            i3 += n;
        }
        return null;
    }

    /* renamed from: d */
    private static byte[] m8159d(C2175k c2175k, int i, int i2) {
        int i3 = i + 8;
        while (i3 - i < i2) {
            c2175k.m7979c(i3);
            int n = c2175k.m7993n();
            if (c2175k.m7993n() == C2203a.aJ) {
                return Arrays.copyOfRange(c2175k.f6735a, i3, n + i3);
            }
            i3 += n;
        }
        return null;
    }

    /* renamed from: e */
    private static int m8160e(C2175k c2175k) {
        int g = c2175k.m7986g();
        int i = g & 127;
        while ((g & 128) == 128) {
            g = c2175k.m7986g();
            i = (i << 7) | (g & 127);
        }
        return i;
    }
}
