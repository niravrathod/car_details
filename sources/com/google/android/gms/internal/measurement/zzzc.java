package com.google.android.gms.internal.measurement;

public final class zzzc implements Cloneable {
    /* renamed from: a */
    private static final dy f10356a = new dy();
    /* renamed from: b */
    private boolean f10357b;
    /* renamed from: c */
    private int[] f10358c;
    /* renamed from: d */
    private dy[] f10359d;
    /* renamed from: e */
    private int f10360e;

    zzzc() {
        this(10);
    }

    private zzzc(int i) {
        this.f10357b = false;
        i = m12182c(i);
        this.f10358c = new int[i];
        this.f10359d = new dy[i];
        this.f10360e = 0;
    }

    /* renamed from: a */
    final dy m12185a(int i) {
        i = m12183d(i);
        if (i >= 0) {
            if (this.f10359d[i] != f10356a) {
                return this.f10359d[i];
            }
        }
        return 0;
    }

    /* renamed from: a */
    final void m12186a(int i, dy dyVar) {
        int d = m12183d(i);
        if (d >= 0) {
            this.f10359d[d] = dyVar;
            return;
        }
        d ^= -1;
        if (d >= this.f10360e || this.f10359d[d] != f10356a) {
            if (this.f10360e >= this.f10358c.length) {
                int c = m12182c(this.f10360e + 1);
                Object obj = new int[c];
                Object obj2 = new dy[c];
                System.arraycopy(this.f10358c, 0, obj, 0, this.f10358c.length);
                System.arraycopy(this.f10359d, 0, obj2, 0, this.f10359d.length);
                this.f10358c = obj;
                this.f10359d = obj2;
            }
            if (this.f10360e - d != 0) {
                int i2 = d + 1;
                System.arraycopy(this.f10358c, d, this.f10358c, i2, this.f10360e - d);
                System.arraycopy(this.f10359d, d, this.f10359d, i2, this.f10360e - d);
            }
            this.f10358c[d] = i;
            this.f10359d[d] = dyVar;
            this.f10360e++;
            return;
        }
        this.f10358c[d] = i;
        this.f10359d[d] = dyVar;
    }

    /* renamed from: a */
    final int m12184a() {
        return this.f10360e;
    }

    /* renamed from: b */
    public final boolean m12188b() {
        return this.f10360e == 0;
    }

    /* renamed from: b */
    final dy m12187b(int i) {
        return this.f10359d[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzzc)) {
            return false;
        }
        zzzc zzzc = (zzzc) obj;
        if (this.f10360e != zzzc.f10360e) {
            return false;
        }
        Object obj2;
        int[] iArr = this.f10358c;
        int[] iArr2 = zzzc.f10358c;
        int i = this.f10360e;
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                obj2 = null;
                break;
            }
        }
        obj2 = 1;
        if (obj2 != null) {
            dy[] dyVarArr = this.f10359d;
            obj = zzzc.f10359d;
            int i3 = this.f10360e;
            for (i = 0; i < i3; i++) {
                if (!dyVarArr[i].equals(obj[i])) {
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
        for (int i2 = 0; i2 < this.f10360e; i2++) {
            i = (((i * 31) + this.f10358c[i2]) * 31) + this.f10359d[i2].hashCode();
        }
        return i;
    }

    /* renamed from: c */
    private static int m12182c(int i) {
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
    private final int m12183d(int i) {
        int i2 = this.f10360e - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int i5 = this.f10358c[i4];
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
        int i = this.f10360e;
        zzzc zzzc = new zzzc(i);
        int i2 = 0;
        System.arraycopy(this.f10358c, 0, zzzc.f10358c, 0, i);
        while (i2 < i) {
            if (this.f10359d[i2] != null) {
                zzzc.f10359d[i2] = (dy) this.f10359d[i2].clone();
            }
            i2++;
        }
        zzzc.f10360e = i;
        return zzzc;
    }
}
