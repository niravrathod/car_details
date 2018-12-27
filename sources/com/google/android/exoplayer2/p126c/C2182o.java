package com.google.android.exoplayer2.p126c;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: com.google.android.exoplayer2.c.o */
public class C2182o {
    /* renamed from: a */
    private static final Comparator<C2181a> f6748a = new C21791();
    /* renamed from: b */
    private static final Comparator<C2181a> f6749b = new C21802();
    /* renamed from: c */
    private final int f6750c;
    /* renamed from: d */
    private final ArrayList<C2181a> f6751d = new ArrayList();
    /* renamed from: e */
    private final C2181a[] f6752e = new C2181a[5];
    /* renamed from: f */
    private int f6753f = -1;
    /* renamed from: g */
    private int f6754g;
    /* renamed from: h */
    private int f6755h;
    /* renamed from: i */
    private int f6756i;

    /* renamed from: com.google.android.exoplayer2.c.o$1 */
    static class C21791 implements Comparator<C2181a> {
        C21791() {
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return m8020a((C2181a) obj, (C2181a) obj2);
        }

        /* renamed from: a */
        public int m8020a(C2181a c2181a, C2181a c2181a2) {
            return c2181a.f6745a - c2181a2.f6745a;
        }
    }

    /* renamed from: com.google.android.exoplayer2.c.o$2 */
    static class C21802 implements Comparator<C2181a> {
        C21802() {
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return m8021a((C2181a) obj, (C2181a) obj2);
        }

        /* renamed from: a */
        public int m8021a(C2181a c2181a, C2181a c2181a2) {
            if (c2181a.f6747c < c2181a2.f6747c) {
                return -1;
            }
            return c2181a2.f6747c < c2181a.f6747c ? 1 : null;
        }
    }

    /* renamed from: com.google.android.exoplayer2.c.o$a */
    private static class C2181a {
        /* renamed from: a */
        public int f6745a;
        /* renamed from: b */
        public int f6746b;
        /* renamed from: c */
        public float f6747c;

        private C2181a() {
        }
    }

    public C2182o(int i) {
        this.f6750c = i;
    }

    /* renamed from: a */
    public void m8025a(int i, float f) {
        int i2;
        C2181a c2181a;
        m8022a();
        if (this.f6756i > 0) {
            C2181a[] c2181aArr = this.f6752e;
            i2 = this.f6756i - 1;
            this.f6756i = i2;
            c2181a = c2181aArr[i2];
        } else {
            c2181a = new C2181a();
        }
        i2 = this.f6754g;
        this.f6754g = i2 + 1;
        c2181a.f6745a = i2;
        c2181a.f6746b = i;
        c2181a.f6747c = f;
        this.f6751d.add(c2181a);
        this.f6755h += i;
        while (this.f6755h > this.f6750c) {
            i = this.f6755h - this.f6750c;
            C2181a c2181a2 = (C2181a) this.f6751d.get(0);
            if (c2181a2.f6746b <= i) {
                this.f6755h -= c2181a2.f6746b;
                this.f6751d.remove(0);
                if (this.f6756i < 5) {
                    i = this.f6752e;
                    int i3 = this.f6756i;
                    this.f6756i = i3 + 1;
                    i[i3] = c2181a2;
                }
            } else {
                c2181a2.f6746b -= i;
                this.f6755h -= i;
            }
        }
    }

    /* renamed from: a */
    public float m8024a(float f) {
        m8023b();
        f *= (float) this.f6755h;
        int i = 0;
        for (int i2 = 0; i2 < this.f6751d.size(); i2++) {
            C2181a c2181a = (C2181a) this.f6751d.get(i2);
            i += c2181a.f6746b;
            if (((float) i) >= f) {
                return c2181a.f6747c;
            }
        }
        return this.f6751d.isEmpty() != null ? Float.NaN : ((C2181a) this.f6751d.get(this.f6751d.size() - 1)).f6747c;
    }

    /* renamed from: a */
    private void m8022a() {
        if (this.f6753f != 1) {
            Collections.sort(this.f6751d, f6748a);
            this.f6753f = 1;
        }
    }

    /* renamed from: b */
    private void m8023b() {
        if (this.f6753f != 0) {
            Collections.sort(this.f6751d, f6749b);
            this.f6753f = 0;
        }
    }
}
