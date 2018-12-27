package com.google.android.exoplayer2.p125b;

import android.graphics.Point;
import android.text.TextUtils;
import com.google.android.exoplayer2.C2277m;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.p125b.C2157f.C2156a;
import com.google.android.exoplayer2.p126c.C2186s;
import com.google.android.exoplayer2.source.C2326h;
import com.google.android.exoplayer2.source.C2327i;
import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.exoplayer2.b.c */
public class C4684c extends C3956e {
    /* renamed from: a */
    private static final int[] f19338a = new int[0];
    /* renamed from: b */
    private final C2156a f19339b;
    /* renamed from: c */
    private final AtomicReference<C2153b> f19340c;

    /* renamed from: com.google.android.exoplayer2.b.c$a */
    private static final class C2152a {
        /* renamed from: a */
        public final int f6659a;
        /* renamed from: b */
        public final int f6660b;
        /* renamed from: c */
        public final String f6661c;

        public C2152a(int i, int i2, String str) {
            this.f6659a = i;
            this.f6660b = i2;
            this.f6661c = str;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    C2152a c2152a = (C2152a) obj;
                    if (this.f6659a != c2152a.f6659a || this.f6660b != c2152a.f6660b || TextUtils.equals(this.f6661c, c2152a.f6661c) == null) {
                        z = false;
                    }
                    return z;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((this.f6659a * 31) + this.f6660b) * 31) + (this.f6661c != null ? this.f6661c.hashCode() : 0);
        }
    }

    /* renamed from: com.google.android.exoplayer2.b.c$b */
    public static final class C2153b {
        /* renamed from: a */
        public final String f6662a;
        /* renamed from: b */
        public final String f6663b;
        /* renamed from: c */
        public final boolean f6664c;
        /* renamed from: d */
        public final boolean f6665d;
        /* renamed from: e */
        public final int f6666e;
        /* renamed from: f */
        public final int f6667f;
        /* renamed from: g */
        public final int f6668g;
        /* renamed from: h */
        public final boolean f6669h;
        /* renamed from: i */
        public final boolean f6670i;
        /* renamed from: j */
        public final int f6671j;
        /* renamed from: k */
        public final int f6672k;
        /* renamed from: l */
        public final boolean f6673l;

        public C2153b() {
            this(null, null, false, true, BaseClientBuilder.API_PRIORITY_OTHER, BaseClientBuilder.API_PRIORITY_OTHER, BaseClientBuilder.API_PRIORITY_OTHER, true, true, BaseClientBuilder.API_PRIORITY_OTHER, BaseClientBuilder.API_PRIORITY_OTHER, true);
        }

        public C2153b(String str, String str2, boolean z, boolean z2, int i, int i2, int i3, boolean z3, boolean z4, int i4, int i5, boolean z5) {
            this.f6662a = str;
            this.f6663b = str2;
            this.f6664c = z;
            this.f6665d = z2;
            this.f6666e = i;
            this.f6667f = i2;
            this.f6668g = i3;
            this.f6669h = z3;
            this.f6670i = z4;
            this.f6671j = i4;
            this.f6672k = i5;
            this.f6673l = z5;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    C2153b c2153b = (C2153b) obj;
                    if (this.f6664c != c2153b.f6664c || this.f6665d != c2153b.f6665d || this.f6666e != c2153b.f6666e || this.f6667f != c2153b.f6667f || this.f6669h != c2153b.f6669h || this.f6670i != c2153b.f6670i || this.f6673l != c2153b.f6673l || this.f6671j != c2153b.f6671j || this.f6672k != c2153b.f6672k || this.f6668g != c2153b.f6668g || !TextUtils.equals(this.f6662a, c2153b.f6662a) || TextUtils.equals(this.f6663b, c2153b.f6663b) == null) {
                        z = false;
                    }
                    return z;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((((((((((((((((((((this.f6662a.hashCode() * 31) + this.f6663b.hashCode()) * 31) + this.f6664c) * 31) + this.f6665d) * 31) + this.f6666e) * 31) + this.f6667f) * 31) + this.f6668g) * 31) + this.f6669h) * 31) + this.f6670i) * 31) + this.f6673l) * 31) + this.f6671j) * 31) + this.f6672k;
        }
    }

    /* renamed from: a */
    private static int m25748a(int i, int i2) {
        return i == -1 ? i2 == -1 ? 0 : -1 : i2 == -1 ? 1 : i - i2;
    }

    /* renamed from: a */
    protected static boolean m25756a(int i, boolean z) {
        i &= 3;
        if (i != 3) {
            if (!z || i != 2) {
                return false;
            }
        }
        return true;
    }

    public C4684c() {
        this((C2156a) null);
    }

    public C4684c(C2156a c2156a) {
        this.f19339b = c2156a;
        this.f19340c = new AtomicReference(new C2153b());
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    protected com.google.android.exoplayer2.p125b.C2157f[] mo4046a(com.google.android.exoplayer2.C2277m[] r26, com.google.android.exoplayer2.source.C2327i[] r27, int[][][] r28) {
        /*
        r25 = this;
        r15 = r25;
        r14 = r26;
        r13 = r14.length;
        r12 = new com.google.android.exoplayer2.p125b.C2157f[r13];
        r0 = r15.f19340c;
        r0 = r0.get();
        r11 = r0;
        r11 = (com.google.android.exoplayer2.p125b.C4684c.C2153b) r11;
        r16 = 0;
        r0 = 0;
        r10 = 0;
        r17 = 0;
    L_0x0016:
        r18 = 1;
        if (r10 >= r13) goto L_0x0094;
    L_0x001a:
        r1 = 2;
        r2 = r14[r10];
        r2 = r2.mo4028a();
        if (r1 != r2) goto L_0x007d;
    L_0x0023:
        if (r0 != 0) goto L_0x0065;
    L_0x0025:
        r1 = r14[r10];
        r2 = r27[r10];
        r3 = r28[r10];
        r4 = r11.f6666e;
        r5 = r11.f6667f;
        r6 = r11.f6668g;
        r7 = r11.f6665d;
        r8 = r11.f6664c;
        r9 = r11.f6671j;
        r0 = r11.f6672k;
        r19 = r12;
        r12 = r11.f6673l;
        r20 = r13;
        r13 = r15.f19339b;
        r14 = r11.f6669h;
        r15 = r11.f6670i;
        r21 = r0;
        r0 = r25;
        r22 = r10;
        r10 = r21;
        r23 = r11;
        r11 = r12;
        r12 = r13;
        r24 = r20;
        r13 = r14;
        r20 = r26;
        r14 = r15;
        r0 = r0.m25764a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14);
        r19[r22] = r0;
        r0 = r19[r22];
        if (r0 == 0) goto L_0x0063;
    L_0x0061:
        r0 = 1;
        goto L_0x006f;
    L_0x0063:
        r0 = 0;
        goto L_0x006f;
    L_0x0065:
        r22 = r10;
        r23 = r11;
        r19 = r12;
        r24 = r13;
        r20 = r14;
    L_0x006f:
        r1 = r27[r22];
        r1 = r1.f7299b;
        if (r1 <= 0) goto L_0x0076;
    L_0x0075:
        goto L_0x0078;
    L_0x0076:
        r18 = 0;
    L_0x0078:
        r1 = r17 | r18;
        r17 = r1;
        goto L_0x0087;
    L_0x007d:
        r22 = r10;
        r23 = r11;
        r19 = r12;
        r24 = r13;
        r20 = r14;
    L_0x0087:
        r10 = r22 + 1;
        r12 = r19;
        r14 = r20;
        r11 = r23;
        r13 = r24;
        r15 = r25;
        goto L_0x0016;
    L_0x0094:
        r23 = r11;
        r19 = r12;
        r20 = r14;
        r7 = r13;
        r6 = 0;
        r8 = 0;
        r9 = 0;
    L_0x009e:
        if (r8 >= r7) goto L_0x0113;
    L_0x00a0:
        r0 = r20[r8];
        r0 = r0.mo4028a();
        switch(r0) {
            case 1: goto L_0x00e4;
            case 2: goto L_0x00e1;
            case 3: goto L_0x00c0;
            default: goto L_0x00a9;
        };
    L_0x00a9:
        r10 = r23;
        r11 = r25;
        r0 = r20[r8];
        r0 = r0.mo4028a();
        r1 = r27[r8];
        r2 = r28[r8];
        r3 = r10.f6670i;
        r0 = r11.m25763a(r0, r1, r2, r3);
        r19[r8] = r0;
        goto L_0x010e;
    L_0x00c0:
        if (r9 != 0) goto L_0x00e1;
    L_0x00c2:
        r1 = r27[r8];
        r2 = r28[r8];
        r10 = r23;
        r3 = r10.f6663b;
        r4 = r10.f6662a;
        r5 = r10.f6670i;
        r0 = r25;
        r0 = r0.m25765a(r1, r2, r3, r4, r5);
        r19[r8] = r0;
        r0 = r19[r8];
        if (r0 == 0) goto L_0x00dc;
    L_0x00da:
        r0 = 1;
        goto L_0x00dd;
    L_0x00dc:
        r0 = 0;
    L_0x00dd:
        r9 = r0;
    L_0x00de:
        r11 = r25;
        goto L_0x010e;
    L_0x00e1:
        r10 = r23;
        goto L_0x00de;
    L_0x00e4:
        r10 = r23;
        if (r6 != 0) goto L_0x00de;
    L_0x00e8:
        r1 = r27[r8];
        r2 = r28[r8];
        r3 = r10.f6662a;
        r4 = r10.f6670i;
        r5 = r10.f6664c;
        if (r17 == 0) goto L_0x00f9;
    L_0x00f4:
        r0 = 0;
        r6 = r0;
        r11 = r25;
        goto L_0x00fe;
    L_0x00f9:
        r11 = r25;
        r0 = r11.f19339b;
        r6 = r0;
    L_0x00fe:
        r0 = r25;
        r0 = r0.m25766a(r1, r2, r3, r4, r5, r6);
        r19[r8] = r0;
        r0 = r19[r8];
        if (r0 == 0) goto L_0x010c;
    L_0x010a:
        r0 = 1;
        goto L_0x010d;
    L_0x010c:
        r0 = 0;
    L_0x010d:
        r6 = r0;
    L_0x010e:
        r8 = r8 + 1;
        r23 = r10;
        goto L_0x009e;
    L_0x0113:
        r11 = r25;
        return r19;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.b.c.a(com.google.android.exoplayer2.m[], com.google.android.exoplayer2.source.i[], int[][][]):com.google.android.exoplayer2.b.f[]");
    }

    /* renamed from: a */
    protected C2157f m25764a(C2277m c2277m, C2327i c2327i, int[][] iArr, int i, int i2, int i3, boolean z, boolean z2, int i4, int i5, boolean z3, C2156a c2156a, boolean z4, boolean z5) {
        C2157f a = c2156a != null ? C4684c.m25753a(c2277m, c2327i, iArr, i, i2, i3, z, z2, i4, i5, z3, c2156a) : null;
        return a == null ? C4684c.m25754a(c2327i, iArr, i, i2, i3, i4, i5, z3, z4, z5) : a;
    }

    /* renamed from: a */
    private static C2157f m25753a(C2277m c2277m, C2327i c2327i, int[][] iArr, int i, int i2, int i3, boolean z, boolean z2, int i4, int i5, boolean z3, C2156a c2156a) {
        C2327i c2327i2 = c2327i;
        int i6 = z ? 12 : 8;
        boolean z4 = z2 && (c2277m.mo4045m() & i6) != 0;
        for (int i7 = 0; i7 < c2327i2.f7299b; i7++) {
            C2326h a = c2327i2.m8491a(i7);
            int[] a2 = C4684c.m25761a(a, iArr[i7], z4, i6, i, i2, i3, i4, i5, z3);
            if (a2.length > 0) {
                return c2156a.mo1543b(a, a2);
            }
            C2156a c2156a2 = c2156a;
        }
        return null;
    }

    /* renamed from: a */
    private static int[] m25761a(C2326h c2326h, int[] iArr, boolean z, int i, int i2, int i3, int i4, int i5, int i6, boolean z2) {
        C2326h c2326h2 = c2326h;
        if (c2326h2.f7295a < 2) {
            return f19338a;
        }
        List a = C4684c.m25755a(c2326h2, i5, i6, z2);
        if (a.size() < 2) {
            return f19338a;
        }
        String str;
        if (z) {
            str = null;
        } else {
            HashSet hashSet = new HashSet();
            String str2 = null;
            int i7 = 0;
            for (int i8 = 0; i8 < a.size(); i8++) {
                String str3 = c2326h2.m8489a(((Integer) a.get(i8)).intValue()).f6489f;
                if (hashSet.add(str3)) {
                    int a2 = C4684c.m25750a(c2326h, iArr, i, str3, i2, i3, i4, a);
                    if (a2 > i7) {
                        i7 = a2;
                        str2 = str3;
                    }
                }
            }
            str = str2;
        }
        C4684c.m25762b(c2326h, iArr, i, str, i2, i3, i4, a);
        return a.size() < 2 ? f19338a : C2186s.m8053a(a);
    }

    /* renamed from: a */
    private static int m25750a(C2326h c2326h, int[] iArr, int i, String str, int i2, int i3, int i4, List<Integer> list) {
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            int intValue = ((Integer) list.get(i6)).intValue();
            C2326h c2326h2 = c2326h;
            if (C4684c.m25759a(c2326h.m8489a(intValue), str, iArr[intValue], i, i2, i3, i4)) {
                i5++;
            }
        }
        return i5;
    }

    /* renamed from: b */
    private static void m25762b(C2326h c2326h, int[] iArr, int i, String str, int i2, int i3, int i4, List<Integer> list) {
        List<Integer> list2 = list;
        for (int size = list.size() - 1; size >= 0; size--) {
            int intValue = ((Integer) list2.get(size)).intValue();
            C2326h c2326h2 = c2326h;
            if (!C4684c.m25759a(c2326h.m8489a(intValue), str, iArr[intValue], i, i2, i3, i4)) {
                list2.remove(size);
            }
        }
    }

    /* renamed from: a */
    private static boolean m25759a(Format format, String str, int i, int i2, int i3, int i4, int i5) {
        if (!C4684c.m25756a(i, false) || (i & i2) == 0) {
            return false;
        }
        if (str != null && C2186s.m8052a(format.f6489f, (Object) str) == null) {
            return false;
        }
        if (format.f6493j != -1 && format.f6493j > i3) {
            return false;
        }
        if (format.f6494k != -1 && format.f6494k > i4) {
            return false;
        }
        if (format.f6485b == -1 || format.f6485b <= i5) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private static com.google.android.exoplayer2.p125b.C2157f m25754a(com.google.android.exoplayer2.source.C2327i r22, int[][] r23, int r24, int r25, int r26, int r27, int r28, boolean r29, boolean r30, boolean r31) {
        /*
        r0 = r22;
        r4 = 0;
        r5 = 0;
        r6 = 0;
        r7 = 0;
        r8 = -1;
        r9 = -1;
    L_0x0008:
        r10 = r0.f7299b;
        if (r4 >= r10) goto L_0x00e0;
    L_0x000c:
        r10 = r0.m8491a(r4);
        r11 = r27;
        r12 = r28;
        r13 = r29;
        r14 = com.google.android.exoplayer2.p125b.C4684c.m25755a(r10, r11, r12, r13);
        r15 = r23[r4];
        r1 = r9;
        r9 = r8;
        r8 = r7;
        r7 = r5;
        r5 = 0;
    L_0x0021:
        r3 = r10.f7295a;
        if (r5 >= r3) goto L_0x00d1;
    L_0x0025:
        r3 = r15[r5];
        r2 = r31;
        r3 = com.google.android.exoplayer2.p125b.C4684c.m25756a(r3, r2);
        if (r3 == 0) goto L_0x00c3;
    L_0x002f:
        r3 = r10.m8489a(r5);
        r0 = java.lang.Integer.valueOf(r5);
        r0 = r14.contains(r0);
        r18 = 1;
        if (r0 == 0) goto L_0x006b;
    L_0x003f:
        r0 = r3.f6493j;
        r2 = -1;
        if (r0 == r2) goto L_0x004b;
    L_0x0044:
        r0 = r3.f6493j;
        r2 = r24;
        if (r0 > r2) goto L_0x006b;
    L_0x004a:
        goto L_0x004d;
    L_0x004b:
        r2 = r24;
    L_0x004d:
        r0 = r3.f6494k;
        r2 = -1;
        if (r0 == r2) goto L_0x0059;
    L_0x0052:
        r0 = r3.f6494k;
        r2 = r25;
        if (r0 > r2) goto L_0x006b;
    L_0x0058:
        goto L_0x005b;
    L_0x0059:
        r2 = r25;
    L_0x005b:
        r0 = r3.f6485b;
        r2 = -1;
        if (r0 == r2) goto L_0x0067;
    L_0x0060:
        r0 = r3.f6485b;
        r2 = r26;
        if (r0 > r2) goto L_0x006d;
    L_0x0066:
        goto L_0x0069;
    L_0x0067:
        r2 = r26;
    L_0x0069:
        r0 = 1;
        goto L_0x006e;
    L_0x006b:
        r2 = r26;
    L_0x006d:
        r0 = 0;
    L_0x006e:
        if (r0 != 0) goto L_0x0073;
    L_0x0070:
        if (r30 != 0) goto L_0x0073;
    L_0x0072:
        goto L_0x00c3;
    L_0x0073:
        if (r0 == 0) goto L_0x007b;
    L_0x0075:
        r19 = 2;
        r20 = r6;
        r2 = 2;
        goto L_0x007e;
    L_0x007b:
        r20 = r6;
        r2 = 1;
    L_0x007e:
        r6 = r15[r5];
        r21 = r7;
        r7 = 0;
        r6 = com.google.android.exoplayer2.p125b.C4684c.m25756a(r6, r7);
        if (r6 == 0) goto L_0x008b;
    L_0x0089:
        r2 = r2 + 1000;
    L_0x008b:
        if (r2 <= r8) goto L_0x0090;
    L_0x008d:
        r17 = 1;
        goto L_0x0092;
    L_0x0090:
        r17 = 0;
    L_0x0092:
        if (r2 != r8) goto L_0x00b7;
    L_0x0094:
        r7 = r3.m7752a();
        if (r7 == r9) goto L_0x00a3;
    L_0x009a:
        r7 = r3.m7752a();
        r7 = com.google.android.exoplayer2.p125b.C4684c.m25748a(r7, r9);
        goto L_0x00a9;
    L_0x00a3:
        r7 = r3.f6485b;
        r7 = com.google.android.exoplayer2.p125b.C4684c.m25748a(r7, r1);
    L_0x00a9:
        if (r6 == 0) goto L_0x00b0;
    L_0x00ab:
        if (r0 == 0) goto L_0x00b0;
    L_0x00ad:
        if (r7 <= 0) goto L_0x00b5;
    L_0x00af:
        goto L_0x00b2;
    L_0x00b0:
        if (r7 >= 0) goto L_0x00b5;
    L_0x00b2:
        r17 = 1;
        goto L_0x00b7;
    L_0x00b5:
        r17 = 0;
    L_0x00b7:
        if (r17 == 0) goto L_0x00c7;
    L_0x00b9:
        r1 = r3.f6485b;
        r9 = r3.m7752a();
        r8 = r2;
        r6 = r5;
        r7 = r10;
        goto L_0x00cb;
    L_0x00c3:
        r20 = r6;
        r21 = r7;
    L_0x00c7:
        r6 = r20;
        r7 = r21;
    L_0x00cb:
        r5 = r5 + 1;
        r0 = r22;
        goto L_0x0021;
    L_0x00d1:
        r20 = r6;
        r21 = r7;
        r4 = r4 + 1;
        r7 = r8;
        r8 = r9;
        r5 = r21;
        r0 = r22;
        r9 = r1;
        goto L_0x0008;
    L_0x00e0:
        if (r5 != 0) goto L_0x00e5;
    L_0x00e2:
        r16 = 0;
        goto L_0x00ec;
    L_0x00e5:
        r1 = new com.google.android.exoplayer2.b.d;
        r1.<init>(r5, r6);
        r16 = r1;
    L_0x00ec:
        return r16;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.b.c.a(com.google.android.exoplayer2.source.i, int[][], int, int, int, int, int, boolean, boolean, boolean):com.google.android.exoplayer2.b.f");
    }

    /* renamed from: a */
    protected C2157f m25766a(C2327i c2327i, int[][] iArr, String str, boolean z, boolean z2, C2156a c2156a) {
        C2327i c2327i2 = c2327i;
        C2156a c2156a2 = c2156a;
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        int i4 = 0;
        while (i < c2327i2.f7299b) {
            String str2;
            C2326h a = c2327i2.m8491a(i);
            int[] iArr2 = iArr[i];
            int i5 = i4;
            i4 = i3;
            i3 = i2;
            for (i2 = 0; i2 < a.f7295a; i2++) {
                if (C4684c.m25756a(iArr2[i2], z)) {
                    int a2 = C4684c.m25749a(iArr2[i2], str, a.m8489a(i2));
                    if (a2 > i5) {
                        i3 = i;
                        i4 = i2;
                        i5 = a2;
                    }
                } else {
                    str2 = str;
                }
            }
            str2 = str;
            boolean z3 = z;
            i++;
            i2 = i3;
            i3 = i4;
            i4 = i5;
        }
        if (i2 == -1) {
            return null;
        }
        C2326h a3 = c2327i2.m8491a(i2);
        if (c2156a2 != null) {
            int[] a4 = C4684c.m25760a(a3, iArr[i2], z2);
            if (a4.length > 0) {
                return c2156a2.mo1543b(a3, a4);
            }
        }
        return new C4685d(a3, i3);
    }

    /* renamed from: a */
    private static int m25749a(int i, String str, Format format) {
        int i2 = 1;
        Object obj = (format.f6507x & 1) != 0 ? 1 : null;
        if (C4684c.m25758a(format, str) != null) {
            i2 = obj != null ? 4 : 3;
        } else if (obj != null) {
            i2 = 2;
        }
        return C4684c.m25756a(i, false) != 0 ? i2 + 1000 : i2;
    }

    /* renamed from: a */
    private static int[] m25760a(C2326h c2326h, int[] iArr, boolean z) {
        HashSet hashSet = new HashSet();
        C2152a c2152a = null;
        boolean z2 = false;
        for (int i = 0; i < c2326h.f7295a; i++) {
            Format a = c2326h.m8489a(i);
            C2152a c2152a2 = new C2152a(a.f6501r, a.f6502s, z ? null : a.f6489f);
            if (hashSet.add(c2152a2)) {
                boolean a2 = C4684c.m25751a(c2326h, iArr, c2152a2);
                if (a2 > z2) {
                    z2 = a2;
                    c2152a = c2152a2;
                }
            }
        }
        if (z2 <= true) {
            return f19338a;
        }
        z = new int[z2];
        int i2 = 0;
        for (int i3 = 0; i3 < c2326h.f7295a; i3++) {
            if (C4684c.m25757a(c2326h.m8489a(i3), iArr[i3], c2152a)) {
                int i4 = i2 + 1;
                z[i2] = i3;
                i2 = i4;
            }
        }
        return z;
    }

    /* renamed from: a */
    private static int m25751a(C2326h c2326h, int[] iArr, C2152a c2152a) {
        int i = 0;
        for (int i2 = 0; i2 < c2326h.f7295a; i2++) {
            if (C4684c.m25757a(c2326h.m8489a(i2), iArr[i2], c2152a)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: a */
    private static boolean m25757a(Format format, int i, C2152a c2152a) {
        if (C4684c.m25756a(i, false) == 0 || format.f6501r != c2152a.f6659a || format.f6502s != c2152a.f6660b) {
            return false;
        }
        if (c2152a.f6661c == 0 || TextUtils.equals(c2152a.f6661c, format.f6489f) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    protected C2157f m25765a(C2327i c2327i, int[][] iArr, String str, String str2, boolean z) {
        C2327i c2327i2 = c2327i;
        C2326h c2326h = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < c2327i2.f7299b) {
            String str3;
            String str4;
            C2326h a = c2327i2.m8491a(i);
            int[] iArr2 = iArr[i];
            int i4 = i3;
            i3 = i2;
            C2326h c2326h2 = c2326h;
            for (int i5 = 0; i5 < a.f7295a; i5++) {
                if (C4684c.m25756a(iArr2[i5], z)) {
                    Object obj;
                    Format a2 = a.m8489a(i5);
                    int i6 = 1;
                    Object obj2 = (a2.f6507x & 1) != 0 ? 1 : null;
                    if ((a2.f6507x & 2) != 0) {
                        str3 = str;
                        obj = 1;
                    } else {
                        str3 = str;
                        obj = null;
                    }
                    if (C4684c.m25758a(a2, str3)) {
                        i6 = obj2 != null ? 6 : obj == null ? 5 : 4;
                    } else if (obj2 != null) {
                        i6 = 3;
                    } else if (obj != null) {
                        if (C4684c.m25758a(a2, str2)) {
                            i6 = 2;
                        }
                        if (C4684c.m25756a(iArr2[i5], false)) {
                            i6 += 1000;
                        }
                        if (i6 > i4) {
                            i3 = i5;
                            c2326h2 = a;
                            i4 = i6;
                        }
                    }
                    str4 = str2;
                    if (C4684c.m25756a(iArr2[i5], false)) {
                        i6 += 1000;
                    }
                    if (i6 > i4) {
                        i3 = i5;
                        c2326h2 = a;
                        i4 = i6;
                    }
                } else {
                    str3 = str;
                }
                str4 = str2;
            }
            str3 = str;
            str4 = str2;
            boolean z2 = z;
            i++;
            c2326h = c2326h2;
            i2 = i3;
            i3 = i4;
        }
        if (c2326h == null) {
            return null;
        }
        return new C4685d(c2326h, i2);
    }

    /* renamed from: a */
    protected C2157f m25763a(int i, C2327i c2327i, int[][] iArr, boolean z) {
        C2326h c2326h = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < c2327i.f7299b) {
            C2326h a = c2327i.m8491a(i2);
            int[] iArr2 = iArr[i2];
            int i5 = i4;
            i4 = i3;
            C2326h c2326h2 = c2326h;
            for (int i6 = 0; i6 < a.f7295a; i6++) {
                if (C4684c.m25756a(iArr2[i6], z)) {
                    int i7 = 1;
                    if (((a.m8489a(i6).f6507x & 1) != 0 ? 1 : null) != null) {
                        i7 = 2;
                    }
                    if (C4684c.m25756a(iArr2[i6], false)) {
                        i7 += 1000;
                    }
                    if (i7 > i5) {
                        i4 = i6;
                        c2326h2 = a;
                        i5 = i7;
                    }
                }
            }
            i2++;
            c2326h = c2326h2;
            i3 = i4;
            i4 = i5;
        }
        if (c2326h == null) {
            return null;
        }
        return new C4685d(c2326h, i3);
    }

    /* renamed from: a */
    protected static boolean m25758a(Format format, String str) {
        return (str == null || TextUtils.equals(str, C2186s.m8058b(format.f6508y)) == null) ? null : true;
    }

    /* renamed from: a */
    private static List<Integer> m25755a(C2326h c2326h, int i, int i2, boolean z) {
        List<Integer> arrayList = new ArrayList(c2326h.f7295a);
        for (int i3 = 0; i3 < c2326h.f7295a; i3++) {
            arrayList.add(Integer.valueOf(i3));
        }
        if (i != BaseClientBuilder.API_PRIORITY_OTHER) {
            if (i2 != BaseClientBuilder.API_PRIORITY_OTHER) {
                boolean z2 = true;
                for (int i4 = 0; i4 < c2326h.f7295a; i4++) {
                    Format a = c2326h.m8489a(i4);
                    if (a.f6493j > 0 && a.f6494k > 0) {
                        Point a2 = C4684c.m25752a(z, i, i2, a.f6493j, a.f6494k);
                        boolean z3 = a.f6493j * a.f6494k;
                        if (a.f6493j >= ((int) (((float) a2.x) * 0.98f)) && a.f6494k >= ((int) (((float) a2.y) * 0.98f)) && z3 < z2) {
                            z2 = z3;
                        }
                    }
                }
                if (!z2) {
                    for (i = arrayList.size() - 1; i >= 0; i--) {
                        boolean a3 = c2326h.m8489a(((Integer) arrayList.get(i)).intValue()).m7752a();
                        if (a3 || a3 > z2) {
                            arrayList.remove(i);
                        }
                    }
                }
                return arrayList;
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static Point m25752a(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (z) {
            z = false;
            boolean z2 = i3 > i4;
            if (i > i2) {
                z = true;
            }
            if (z2 != z) {
                i5 = i3 * i;
                i6 = i4 * i2;
                if (i5 < i6) {
                    return new Point(i2, C2186s.m8040a(i6, i3));
                }
                return new Point(C2186s.m8040a(i5, i4), i);
            }
        }
        int i7 = i2;
        i2 = i;
        i = i7;
        i5 = i3 * i;
        i6 = i4 * i2;
        if (i5 < i6) {
            return new Point(C2186s.m8040a(i5, i4), i);
        }
        return new Point(i2, C2186s.m8040a(i6, i3));
    }
}
