package com.google.android.gms.internal.firebase_abt;

public final class zzf implements Cloneable {
    /* renamed from: a */
    private static final C2464a f10007a = new C2464a();
    /* renamed from: b */
    private boolean f10008b;
    /* renamed from: c */
    private int[] f10009c;
    /* renamed from: d */
    private C2464a[] f10010d;
    /* renamed from: e */
    private int f10011e;

    zzf() {
        this(10);
    }

    private zzf(int i) {
        this.f10008b = false;
        i = m11473b(i);
        this.f10009c = new int[i];
        this.f10010d = new C2464a[i];
        this.f10011e = 0;
    }

    /* renamed from: b */
    private static int m11473b(int i) {
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

    /* renamed from: c */
    private final int m11474c(int i) {
        int i2 = this.f10011e - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int i5 = this.f10009c[i4];
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
    final C2464a m11475a(int i) {
        i = m11474c(i);
        if (i >= 0) {
            if (this.f10010d[i] != f10007a) {
                return this.f10010d[i];
            }
        }
        return null;
    }

    /* renamed from: a */
    final void m11476a(int i, C2464a c2464a) {
        int c = m11474c(i);
        if (c >= 0) {
            this.f10010d[c] = c2464a;
            return;
        }
        c ^= -1;
        if (c >= this.f10011e || this.f10010d[c] != f10007a) {
            if (this.f10011e >= this.f10009c.length) {
                int b = m11473b(this.f10011e + 1);
                Object obj = new int[b];
                Object obj2 = new C2464a[b];
                System.arraycopy(this.f10009c, 0, obj, 0, this.f10009c.length);
                System.arraycopy(this.f10010d, 0, obj2, 0, this.f10010d.length);
                this.f10009c = obj;
                this.f10010d = obj2;
            }
            if (this.f10011e - c != 0) {
                int i2 = c + 1;
                System.arraycopy(this.f10009c, c, this.f10009c, i2, this.f10011e - c);
                System.arraycopy(this.f10010d, c, this.f10010d, i2, this.f10011e - c);
            }
            this.f10009c[c] = i;
            this.f10010d[c] = c2464a;
            this.f10011e++;
            return;
        }
        this.f10009c[c] = i;
        this.f10010d[c] = c2464a;
    }

    public final /* synthetic */ Object clone() {
        int i = this.f10011e;
        zzf zzf = new zzf(i);
        int i2 = 0;
        System.arraycopy(this.f10009c, 0, zzf.f10009c, 0, i);
        while (i2 < i) {
            if (this.f10010d[i2] != null) {
                zzf.f10010d[i2] = (C2464a) this.f10010d[i2].clone();
            }
            i2++;
        }
        zzf.f10011e = i;
        return zzf;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzf)) {
            return false;
        }
        zzf zzf = (zzf) obj;
        if (this.f10011e != zzf.f10011e) {
            return false;
        }
        Object obj2;
        int[] iArr = this.f10009c;
        int[] iArr2 = zzf.f10009c;
        int i = this.f10011e;
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                obj2 = null;
                break;
            }
        }
        obj2 = 1;
        if (obj2 != null) {
            C2464a[] c2464aArr = this.f10010d;
            C2464a[] c2464aArr2 = zzf.f10010d;
            int i3 = this.f10011e;
            for (i = 0; i < i3; i++) {
                if (!c2464aArr[i].equals(c2464aArr2[i])) {
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
        for (int i2 = 0; i2 < this.f10011e; i2++) {
            i = (((i * 31) + this.f10009c[i2]) * 31) + this.f10010d[i2].hashCode();
        }
        return i;
    }
}
