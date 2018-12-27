package com.google.android.gms.internal.config;

public final class zzbd implements Cloneable {
    /* renamed from: a */
    private static final C2461a f9951a = new C2461a();
    /* renamed from: b */
    private boolean f9952b;
    /* renamed from: c */
    private int[] f9953c;
    /* renamed from: d */
    private C2461a[] f9954d;
    /* renamed from: e */
    private int f9955e;

    zzbd() {
        this(10);
    }

    private zzbd(int i) {
        this.f9952b = false;
        i = m11401c(i);
        this.f9953c = new int[i];
        this.f9954d = new C2461a[i];
        this.f9955e = 0;
    }

    /* renamed from: c */
    private static int m11401c(int i) {
        i <<= 2;
        for (int i2 = 4; i2 < 32; i2++) {
            int i3 = (1 << i2) - 12;
            if (i <= i3) {
                i = i3;
                break;
            }
        }
        return i / 4;
    }

    /* renamed from: d */
    private final int m11402d(int i) {
        int i2 = this.f9955e - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int i5 = this.f9953c[i4];
            if (i5 < i) {
                i3 = i4 + 1;
            } else if (i5 <= i) {
                return i4;
            } else {
                i2 = i4 - 1;
            }
        }
        return i3 ^ -1;
    }

    /* renamed from: a */
    final int m11403a() {
        return this.f9955e;
    }

    /* renamed from: a */
    final C2461a m11404a(int i) {
        i = m11402d(i);
        if (i >= 0) {
            if (this.f9954d[i] != f9951a) {
                return this.f9954d[i];
            }
        }
        return null;
    }

    /* renamed from: a */
    final void m11405a(int i, C2461a c2461a) {
        int d = m11402d(i);
        if (d >= 0) {
            this.f9954d[d] = c2461a;
            return;
        }
        d ^= -1;
        if (d >= this.f9955e || this.f9954d[d] != f9951a) {
            if (this.f9955e >= this.f9953c.length) {
                int c = m11401c(this.f9955e + 1);
                Object obj = new int[c];
                Object obj2 = new C2461a[c];
                System.arraycopy(this.f9953c, 0, obj, 0, this.f9953c.length);
                System.arraycopy(this.f9954d, 0, obj2, 0, this.f9954d.length);
                this.f9953c = obj;
                this.f9954d = obj2;
            }
            if (this.f9955e - d != 0) {
                int i2 = d + 1;
                System.arraycopy(this.f9953c, d, this.f9953c, i2, this.f9955e - d);
                System.arraycopy(this.f9954d, d, this.f9954d, i2, this.f9955e - d);
            }
            this.f9953c[d] = i;
            this.f9954d[d] = c2461a;
            this.f9955e++;
            return;
        }
        this.f9953c[d] = i;
        this.f9954d[d] = c2461a;
    }

    /* renamed from: b */
    final C2461a m11406b(int i) {
        return this.f9954d[i];
    }

    /* renamed from: b */
    public final boolean m11407b() {
        return this.f9955e == 0;
    }

    public final /* synthetic */ Object clone() {
        int i = this.f9955e;
        zzbd zzbd = new zzbd(i);
        int i2 = 0;
        System.arraycopy(this.f9953c, 0, zzbd.f9953c, 0, i);
        while (i2 < i) {
            if (this.f9954d[i2] != null) {
                zzbd.f9954d[i2] = (C2461a) this.f9954d[i2].clone();
            }
            i2++;
        }
        zzbd.f9955e = i;
        return zzbd;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzbd)) {
            return false;
        }
        zzbd zzbd = (zzbd) obj;
        if (this.f9955e != zzbd.f9955e) {
            return false;
        }
        Object obj2;
        int[] iArr = this.f9953c;
        int[] iArr2 = zzbd.f9953c;
        int i = this.f9955e;
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                obj2 = null;
                break;
            }
        }
        obj2 = 1;
        if (obj2 != null) {
            C2461a[] c2461aArr = this.f9954d;
            C2461a[] c2461aArr2 = zzbd.f9954d;
            int i3 = this.f9955e;
            for (i = 0; i < i3; i++) {
                if (!c2461aArr[i].equals(c2461aArr2[i])) {
                    obj = null;
                    break;
                }
            }
            obj = 1;
            if (obj != null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 17;
        for (int i2 = 0; i2 < this.f9955e; i2++) {
            i = (((i * 31) + this.f9953c[i2]) * 31) + this.f9954d[i2].hashCode();
        }
        return i;
    }
}
