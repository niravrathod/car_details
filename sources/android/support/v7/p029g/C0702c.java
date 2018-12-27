package android.support.v7.p029g;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: android.support.v7.g.c */
public class C0702c {
    /* renamed from: a */
    private static final Comparator<C0701f> f2243a = new C06951();

    /* renamed from: android.support.v7.g.c$1 */
    static class C06951 implements Comparator<C0701f> {
        C06951() {
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return m2729a((C0701f) obj, (C0701f) obj2);
        }

        /* renamed from: a */
        public int m2729a(C0701f c0701f, C0701f c0701f2) {
            int i = c0701f.f2238a - c0701f2.f2238a;
            return i == 0 ? c0701f.f2239b - c0701f2.f2239b : i;
        }
    }

    /* renamed from: android.support.v7.g.c$a */
    public static abstract class C0696a {
        /* renamed from: a */
        public abstract int mo572a();

        /* renamed from: a */
        public abstract boolean mo573a(int i, int i2);

        /* renamed from: b */
        public abstract int mo574b();

        /* renamed from: b */
        public abstract boolean mo575b(int i, int i2);

        /* renamed from: c */
        public Object mo576c(int i, int i2) {
            return null;
        }
    }

    /* renamed from: android.support.v7.g.c$b */
    public static class C0697b {
        /* renamed from: a */
        private final List<C0701f> f2224a;
        /* renamed from: b */
        private final int[] f2225b;
        /* renamed from: c */
        private final int[] f2226c;
        /* renamed from: d */
        private final C0696a f2227d;
        /* renamed from: e */
        private final int f2228e;
        /* renamed from: f */
        private final int f2229f;
        /* renamed from: g */
        private final boolean f2230g;

        C0697b(C0696a c0696a, List<C0701f> list, int[] iArr, int[] iArr2, boolean z) {
            this.f2224a = list;
            this.f2225b = iArr;
            this.f2226c = iArr2;
            Arrays.fill(this.f2225b, 0);
            Arrays.fill(this.f2226c, 0);
            this.f2227d = c0696a;
            this.f2228e = c0696a.mo572a();
            this.f2229f = c0696a.mo574b();
            this.f2230g = z;
            m2736a();
            m2740b();
        }

        /* renamed from: a */
        private void m2736a() {
            C0701f c0701f = this.f2224a.isEmpty() ? null : (C0701f) this.f2224a.get(0);
            if (c0701f == null || c0701f.f2238a != 0 || c0701f.f2239b != 0) {
                c0701f = new C0701f();
                c0701f.f2238a = 0;
                c0701f.f2239b = 0;
                c0701f.f2241d = false;
                c0701f.f2240c = 0;
                c0701f.f2242e = false;
                this.f2224a.add(0, c0701f);
            }
        }

        /* renamed from: b */
        private void m2740b() {
            int i = this.f2228e;
            int i2 = this.f2229f;
            for (int size = this.f2224a.size() - 1; size >= 0; size--) {
                C0701f c0701f = (C0701f) this.f2224a.get(size);
                int i3 = c0701f.f2238a + c0701f.f2240c;
                int i4 = c0701f.f2239b + c0701f.f2240c;
                if (this.f2230g) {
                    while (i > i3) {
                        m2737a(i, i2, size);
                        i--;
                    }
                    while (i2 > i4) {
                        m2741b(i, i2, size);
                        i2--;
                    }
                }
                for (i = 0; i < c0701f.f2240c; i++) {
                    i2 = c0701f.f2238a + i;
                    i3 = c0701f.f2239b + i;
                    i4 = this.f2227d.mo575b(i2, i3) ? 1 : 2;
                    this.f2225b[i2] = (i3 << 5) | i4;
                    this.f2226c[i3] = (i2 << 5) | i4;
                }
                i = c0701f.f2238a;
                i2 = c0701f.f2239b;
            }
        }

        /* renamed from: a */
        private void m2737a(int i, int i2, int i3) {
            if (this.f2225b[i - 1] == 0) {
                m2739a(i, i2, i3, false);
            }
        }

        /* renamed from: b */
        private void m2741b(int i, int i2, int i3) {
            if (this.f2226c[i2 - 1] == 0) {
                m2739a(i, i2, i3, true);
            }
        }

        /* renamed from: a */
        private boolean m2739a(int i, int i2, int i3, boolean z) {
            int i4;
            int i5;
            if (z) {
                i2--;
                i4 = i;
                i5 = i2;
            } else {
                i4 = i - 1;
                i5 = i4;
            }
            while (i3 >= 0) {
                C0701f c0701f = (C0701f) this.f2224a.get(i3);
                int i6 = c0701f.f2238a + c0701f.f2240c;
                int i7 = c0701f.f2239b + c0701f.f2240c;
                int i8 = 4;
                if (z) {
                    for (i4--; i4 >= i6; i4--) {
                        if (this.f2227d.mo573a(i4, i5) != 0) {
                            if (this.f2227d.mo575b(i4, i5) != 0) {
                                i8 = 8;
                            }
                            this.f2226c[i5] = (i4 << 5) | 16;
                            this.f2225b[i4] = (i5 << 5) | i8;
                            return true;
                        }
                    }
                    continue;
                } else {
                    for (i2--; i2 >= i7; i2--) {
                        if (this.f2227d.mo573a(i5, i2)) {
                            if (this.f2227d.mo575b(i5, i2) != 0) {
                                i8 = 8;
                            }
                            i--;
                            this.f2225b[i] = (i2 << 5) | 16;
                            this.f2226c[i2] = (i << 5) | i8;
                            return true;
                        }
                    }
                    continue;
                }
                i4 = c0701f.f2238a;
                i2 = c0701f.f2239b;
                i3--;
            }
            return false;
        }

        /* renamed from: a */
        public void m2743a(C0703d c0703d) {
            if (c0703d instanceof C3215b) {
                c0703d = (C3215b) c0703d;
            } else {
                c0703d = new C3215b(c0703d);
            }
            ArrayList arrayList = new ArrayList();
            int i = this.f2228e;
            int i2 = this.f2229f;
            for (int size = this.f2224a.size() - 1; size >= 0; size--) {
                C0701f c0701f = (C0701f) this.f2224a.get(size);
                int i3 = c0701f.f2240c;
                int i4 = c0701f.f2238a + i3;
                int i5 = c0701f.f2239b + i3;
                if (i4 < i) {
                    m2742b(arrayList, c0703d, i4, i - i4, i4);
                }
                if (i5 < i2) {
                    m2738a(arrayList, c0703d, i4, i2 - i5, i5);
                }
                for (i3--; i3 >= 0; i3--) {
                    if ((this.f2225b[c0701f.f2238a + i3] & 31) == 2) {
                        c0703d.mo578a(c0701f.f2238a + i3, 1, this.f2227d.mo576c(c0701f.f2238a + i3, c0701f.f2239b + i3));
                    }
                }
                i = c0701f.f2238a;
                i2 = c0701f.f2239b;
            }
            c0703d.m16044a();
        }

        /* renamed from: a */
        private static C0699d m2735a(List<C0699d> list, int i, boolean z) {
            int size = list.size() - 1;
            while (size >= 0) {
                C0699d c0699d = (C0699d) list.get(size);
                if (c0699d.f2231a == i && c0699d.f2233c == z) {
                    list.remove(size);
                    while (size < list.size()) {
                        C0699d c0699d2 = (C0699d) list.get(size);
                        c0699d2.f2232b += z ? 1 : -1;
                        size++;
                    }
                    return c0699d;
                }
                size--;
            }
            return null;
        }

        /* renamed from: a */
        private void m2738a(List<C0699d> list, C0703d c0703d, int i, int i2, int i3) {
            if (this.f2230g) {
                for (i2--; i2 >= 0; i2--) {
                    int i4 = i3 + i2;
                    int i5 = this.f2226c[i4] & 31;
                    if (i5 == 0) {
                        c0703d.mo577a(i, 1);
                        for (C0699d c0699d : list) {
                            c0699d.f2232b++;
                        }
                    } else if (i5 == 4 || i5 == 8) {
                        int i6 = this.f2226c[i4] >> 5;
                        c0703d.mo580c(C0697b.m2735a((List) list, i6, true).f2232b, i);
                        if (i5 == 4) {
                            c0703d.mo578a(i, 1, this.f2227d.mo576c(i6, i4));
                        }
                    } else if (i5 == 16) {
                        list.add(new C0699d(i4, i, false));
                    } else {
                        c0703d = new StringBuilder();
                        c0703d.append("unknown flag for pos ");
                        c0703d.append(i4);
                        c0703d.append(" ");
                        c0703d.append(Long.toBinaryString((long) i5));
                        throw new IllegalStateException(c0703d.toString());
                    }
                }
                return;
            }
            c0703d.mo577a(i, i2);
        }

        /* renamed from: b */
        private void m2742b(List<C0699d> list, C0703d c0703d, int i, int i2, int i3) {
            if (this.f2230g) {
                for (i2--; i2 >= 0; i2--) {
                    int i4 = i3 + i2;
                    int i5 = this.f2225b[i4] & 31;
                    if (i5 == 0) {
                        c0703d.mo579b(i + i2, 1);
                        for (C0699d c0699d : list) {
                            c0699d.f2232b--;
                        }
                    } else if (i5 == 4 || i5 == 8) {
                        int i6 = this.f2225b[i4] >> 5;
                        C0699d a = C0697b.m2735a((List) list, i6, false);
                        c0703d.mo580c(i + i2, a.f2232b - 1);
                        if (i5 == 4) {
                            c0703d.mo578a(a.f2232b - 1, 1, this.f2227d.mo576c(i4, i6));
                        }
                    } else if (i5 == 16) {
                        list.add(new C0699d(i4, i + i2, true));
                    } else {
                        c0703d = new StringBuilder();
                        c0703d.append("unknown flag for pos ");
                        c0703d.append(i4);
                        c0703d.append(" ");
                        c0703d.append(Long.toBinaryString((long) i5));
                        throw new IllegalStateException(c0703d.toString());
                    }
                }
                return;
            }
            c0703d.mo579b(i, i2);
        }
    }

    /* renamed from: android.support.v7.g.c$c */
    public static abstract class C0698c<T> {
        /* renamed from: a */
        public abstract boolean mo1227a(T t, T t2);

        /* renamed from: b */
        public abstract boolean mo1228b(T t, T t2);

        /* renamed from: c */
        public Object m2746c(T t, T t2) {
            return null;
        }
    }

    /* renamed from: android.support.v7.g.c$d */
    private static class C0699d {
        /* renamed from: a */
        int f2231a;
        /* renamed from: b */
        int f2232b;
        /* renamed from: c */
        boolean f2233c;

        public C0699d(int i, int i2, boolean z) {
            this.f2231a = i;
            this.f2232b = i2;
            this.f2233c = z;
        }
    }

    /* renamed from: android.support.v7.g.c$e */
    static class C0700e {
        /* renamed from: a */
        int f2234a;
        /* renamed from: b */
        int f2235b;
        /* renamed from: c */
        int f2236c;
        /* renamed from: d */
        int f2237d;

        public C0700e(int i, int i2, int i3, int i4) {
            this.f2234a = i;
            this.f2235b = i2;
            this.f2236c = i3;
            this.f2237d = i4;
        }
    }

    /* renamed from: android.support.v7.g.c$f */
    static class C0701f {
        /* renamed from: a */
        int f2238a;
        /* renamed from: b */
        int f2239b;
        /* renamed from: c */
        int f2240c;
        /* renamed from: d */
        boolean f2241d;
        /* renamed from: e */
        boolean f2242e;

        C0701f() {
        }
    }

    /* renamed from: a */
    public static C0697b m2747a(C0696a c0696a) {
        return C0702c.m2748a(c0696a, true);
    }

    /* renamed from: a */
    public static C0697b m2748a(C0696a c0696a, boolean z) {
        int a = c0696a.mo572a();
        int b = c0696a.mo574b();
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        arrayList2.add(new C0700e(0, a, 0, b));
        a = Math.abs(a - b) + (a + b);
        b = a * 2;
        int[] iArr = new int[b];
        int[] iArr2 = new int[b];
        List arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            C0700e c0700e = (C0700e) arrayList2.remove(arrayList2.size() - 1);
            C0701f a2 = C0702c.m2749a(c0696a, c0700e.f2234a, c0700e.f2235b, c0700e.f2236c, c0700e.f2237d, iArr, iArr2, a);
            if (a2 != null) {
                if (a2.f2240c > 0) {
                    arrayList.add(a2);
                }
                a2.f2238a += c0700e.f2234a;
                a2.f2239b += c0700e.f2236c;
                C0700e c0700e2 = arrayList3.isEmpty() ? new C0700e() : (C0700e) arrayList3.remove(arrayList3.size() - 1);
                c0700e2.f2234a = c0700e.f2234a;
                c0700e2.f2236c = c0700e.f2236c;
                if (a2.f2242e) {
                    c0700e2.f2235b = a2.f2238a;
                    c0700e2.f2237d = a2.f2239b;
                } else if (a2.f2241d) {
                    c0700e2.f2235b = a2.f2238a - 1;
                    c0700e2.f2237d = a2.f2239b;
                } else {
                    c0700e2.f2235b = a2.f2238a;
                    c0700e2.f2237d = a2.f2239b - 1;
                }
                arrayList2.add(c0700e2);
                if (!a2.f2242e) {
                    c0700e.f2234a = a2.f2238a + a2.f2240c;
                    c0700e.f2236c = a2.f2239b + a2.f2240c;
                } else if (a2.f2241d) {
                    c0700e.f2234a = (a2.f2238a + a2.f2240c) + 1;
                    c0700e.f2236c = a2.f2239b + a2.f2240c;
                } else {
                    c0700e.f2234a = a2.f2238a + a2.f2240c;
                    c0700e.f2236c = (a2.f2239b + a2.f2240c) + 1;
                }
                arrayList2.add(c0700e);
            } else {
                arrayList3.add(c0700e);
            }
        }
        Collections.sort(arrayList, f2243a);
        return new C0697b(c0696a, arrayList, iArr, iArr2, z);
    }

    /* renamed from: a */
    private static C0701f m2749a(C0696a c0696a, int i, int i2, int i3, int i4, int[] iArr, int[] iArr2, int i5) {
        C0696a c0696a2 = c0696a;
        int[] iArr3 = iArr;
        int[] iArr4 = iArr2;
        int i6 = i2 - i;
        int i7 = i4 - i3;
        int i8 = 1;
        if (i6 >= 1) {
            if (i7 >= 1) {
                int i9 = i6 - i7;
                int i10 = ((i6 + i7) + 1) / 2;
                int i11 = (i5 - i10) - 1;
                int i12 = (i5 + i10) + 1;
                Arrays.fill(iArr3, i11, i12, 0);
                Arrays.fill(iArr4, i11 + i9, i12 + i9, i6);
                Object obj = i9 % 2 != 0 ? 1 : null;
                i12 = 0;
                while (i12 <= i10) {
                    boolean z;
                    int i13;
                    int i14;
                    int i15;
                    C0701f c0701f;
                    int i16 = -i12;
                    int i17 = i16;
                    while (i17 <= i12) {
                        if (i17 != i16) {
                            if (i17 != i12) {
                                int i18 = i5 + i17;
                                if (iArr3[i18 - 1] < iArr3[i18 + i8]) {
                                }
                            }
                            i8 = iArr3[(i5 + i17) - 1] + 1;
                            z = true;
                            i13 = i10;
                            i10 = i8 - i17;
                            while (i8 < i6 && i10 < i7) {
                                i14 = i6;
                                i15 = i7;
                                if (c0696a2.mo573a(i + i8, i3 + i10)) {
                                    break;
                                }
                                i8++;
                                i10++;
                                i6 = i14;
                                i7 = i15;
                            }
                            i14 = i6;
                            i15 = i7;
                            i6 = i5 + i17;
                            iArr3[i6] = i8;
                            if (obj != null || i17 < (i9 - i12) + 1 || i17 > (i9 + i12) - 1 || iArr3[i6] < iArr4[i6]) {
                                i17 += 2;
                                i10 = i13;
                                i6 = i14;
                                i7 = i15;
                                i8 = 1;
                            } else {
                                c0701f = new C0701f();
                                c0701f.f2238a = iArr4[i6];
                                c0701f.f2239b = c0701f.f2238a - i17;
                                c0701f.f2240c = iArr3[i6] - iArr4[i6];
                                c0701f.f2241d = z;
                                c0701f.f2242e = false;
                                return c0701f;
                            }
                        }
                        i8 = iArr3[(i5 + i17) + 1];
                        z = false;
                        i13 = i10;
                        i10 = i8 - i17;
                        while (i8 < i6) {
                            i14 = i6;
                            i15 = i7;
                            if (c0696a2.mo573a(i + i8, i3 + i10)) {
                                break;
                            }
                            i8++;
                            i10++;
                            i6 = i14;
                            i7 = i15;
                        }
                        i14 = i6;
                        i15 = i7;
                        i6 = i5 + i17;
                        iArr3[i6] = i8;
                        if (obj != null) {
                        }
                        i17 += 2;
                        i10 = i13;
                        i6 = i14;
                        i7 = i15;
                        i8 = 1;
                    }
                    i14 = i6;
                    i15 = i7;
                    i13 = i10;
                    for (i7 = i16; i7 <= i12; i7 += 2) {
                        int i19;
                        i8 = i7 + i9;
                        if (i8 != i12 + i9) {
                            if (i8 != i16 + i9) {
                                i10 = i5 + i8;
                                if (iArr4[i10 - 1] < iArr4[i10 + 1]) {
                                }
                            }
                            i10 = iArr4[(i5 + i8) + 1] - 1;
                            z = true;
                            i17 = i10 - i8;
                            while (i10 > 0 && i17 > 0 && c0696a2.mo573a((i + i10) - 1, (i3 + i17) - 1)) {
                                i10--;
                                i17--;
                            }
                            i19 = i5 + i8;
                            iArr4[i19] = i10;
                            if (obj == null || i8 < i16 || i8 > i12 || iArr3[i19] < iArr4[i19]) {
                            } else {
                                c0701f = new C0701f();
                                c0701f.f2238a = iArr4[i19];
                                c0701f.f2239b = c0701f.f2238a - i8;
                                c0701f.f2240c = iArr3[i19] - iArr4[i19];
                                c0701f.f2241d = z;
                                c0701f.f2242e = true;
                                return c0701f;
                            }
                        }
                        i10 = iArr4[(i5 + i8) - 1];
                        z = false;
                        i17 = i10 - i8;
                        while (i10 > 0) {
                            i10--;
                            i17--;
                        }
                        i19 = i5 + i8;
                        iArr4[i19] = i10;
                        if (obj == null) {
                        }
                    }
                    i12++;
                    i10 = i13;
                    i6 = i14;
                    i7 = i15;
                    i8 = 1;
                }
                throw new IllegalStateException("DiffUtil hit an unexpected case while trying to calculate the optimal path. Please make sure your data is not changing during the diff calculation.");
            }
        }
        return null;
    }
}
