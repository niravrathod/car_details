package com.google.android.gms.internal.ads;

public final class zzbgv implements Cloneable {
    /* renamed from: a */
    private static final np f9252a = new np();
    /* renamed from: b */
    private boolean f9253b;
    /* renamed from: c */
    private int[] f9254c;
    /* renamed from: d */
    private np[] f9255d;
    /* renamed from: e */
    private int f9256e;

    zzbgv() {
        this(10);
    }

    private zzbgv(int i) {
        this.f9253b = false;
        i = m10438c(i);
        this.f9254c = new int[i];
        this.f9255d = new np[i];
        this.f9256e = 0;
    }

    /* renamed from: a */
    final np m10441a(int i) {
        i = m10439d(i);
        if (i >= 0) {
            if (this.f9255d[i] != f9252a) {
                return this.f9255d[i];
            }
        }
        return 0;
    }

    /* renamed from: a */
    final void m10442a(int i, np npVar) {
        int d = m10439d(i);
        if (d >= 0) {
            this.f9255d[d] = npVar;
            return;
        }
        d ^= -1;
        if (d >= this.f9256e || this.f9255d[d] != f9252a) {
            if (this.f9256e >= this.f9254c.length) {
                int c = m10438c(this.f9256e + 1);
                Object obj = new int[c];
                Object obj2 = new np[c];
                System.arraycopy(this.f9254c, 0, obj, 0, this.f9254c.length);
                System.arraycopy(this.f9255d, 0, obj2, 0, this.f9255d.length);
                this.f9254c = obj;
                this.f9255d = obj2;
            }
            if (this.f9256e - d != 0) {
                int i2 = d + 1;
                System.arraycopy(this.f9254c, d, this.f9254c, i2, this.f9256e - d);
                System.arraycopy(this.f9255d, d, this.f9255d, i2, this.f9256e - d);
            }
            this.f9254c[d] = i;
            this.f9255d[d] = npVar;
            this.f9256e++;
            return;
        }
        this.f9254c[d] = i;
        this.f9255d[d] = npVar;
    }

    /* renamed from: a */
    final int m10440a() {
        return this.f9256e;
    }

    /* renamed from: b */
    final np m10443b(int i) {
        return this.f9255d[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzbgv)) {
            return false;
        }
        zzbgv zzbgv = (zzbgv) obj;
        if (this.f9256e != zzbgv.f9256e) {
            return false;
        }
        Object obj2;
        int[] iArr = this.f9254c;
        int[] iArr2 = zzbgv.f9254c;
        int i = this.f9256e;
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                obj2 = null;
                break;
            }
        }
        obj2 = 1;
        if (obj2 != null) {
            np[] npVarArr = this.f9255d;
            obj = zzbgv.f9255d;
            int i3 = this.f9256e;
            for (i = 0; i < i3; i++) {
                if (!npVarArr[i].equals(obj[i])) {
                    obj = null;
                    break;
                }
            }
            obj = true;
            if (obj != null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 17;
        for (int i2 = 0; i2 < this.f9256e; i2++) {
            i = (((i * 31) + this.f9254c[i2]) * 31) + this.f9255d[i2].hashCode();
        }
        return i;
    }

    /* renamed from: c */
    private static int m10438c(int i) {
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
    private final int m10439d(int i) {
        int i2 = this.f9256e - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int i5 = this.f9254c[i4];
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

    public final /* synthetic */ Object clone() {
        int i = this.f9256e;
        zzbgv zzbgv = new zzbgv(i);
        int i2 = 0;
        System.arraycopy(this.f9254c, 0, zzbgv.f9254c, 0, i);
        while (i2 < i) {
            if (this.f9255d[i2] != null) {
                zzbgv.f9255d[i2] = (np) this.f9255d[i2].clone();
            }
            i2++;
        }
        zzbgv.f9256e = i;
        return zzbgv;
    }
}
