package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzvm.zze;
import java.util.Arrays;

public final class zzyc {
    /* renamed from: a */
    private static final zzyc f10302a = new zzyc(0, new int[0], new Object[0], false);
    /* renamed from: b */
    private int f10303b;
    /* renamed from: c */
    private int[] f10304c;
    /* renamed from: d */
    private Object[] f10305d;
    /* renamed from: e */
    private int f10306e;
    /* renamed from: f */
    private boolean f10307f;

    /* renamed from: a */
    public static zzyc m12111a() {
        return f10302a;
    }

    /* renamed from: b */
    static zzyc m12114b() {
        return new zzyc();
    }

    /* renamed from: a */
    static zzyc m12112a(zzyc zzyc, zzyc zzyc2) {
        int i = zzyc.f10303b + zzyc2.f10303b;
        Object copyOf = Arrays.copyOf(zzyc.f10304c, i);
        System.arraycopy(zzyc2.f10304c, 0, copyOf, zzyc.f10303b, zzyc2.f10303b);
        Object copyOf2 = Arrays.copyOf(zzyc.f10305d, i);
        System.arraycopy(zzyc2.f10305d, 0, copyOf2, zzyc.f10303b, zzyc2.f10303b);
        return new zzyc(i, copyOf, copyOf2, true);
    }

    private zzyc() {
        this(0, new int[8], new Object[8], true);
    }

    private zzyc(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f10306e = -1;
        this.f10303b = i;
        this.f10304c = iArr;
        this.f10305d = objArr;
        this.f10307f = z;
    }

    /* renamed from: c */
    public final void m12119c() {
        this.f10307f = false;
    }

    /* renamed from: a */
    final void m12116a(dx dxVar) {
        int i;
        if (dxVar.mo2996a() == zze.f10277k) {
            for (i = this.f10303b - 1; i >= 0; i--) {
                dxVar.mo3004a(this.f10304c[i] >>> 3, this.f10305d[i]);
            }
            return;
        }
        for (i = 0; i < this.f10303b; i++) {
            dxVar.mo3004a(this.f10304c[i] >>> 3, this.f10305d[i]);
        }
    }

    /* renamed from: b */
    public final void m12118b(dx dxVar) {
        if (this.f10303b != 0) {
            int i;
            if (dxVar.mo2996a() == zze.f10276j) {
                for (i = 0; i < this.f10303b; i++) {
                    m12113a(this.f10304c[i], this.f10305d[i], dxVar);
                }
                return;
            }
            for (i = this.f10303b - 1; i >= 0; i--) {
                m12113a(this.f10304c[i], this.f10305d[i], dxVar);
            }
        }
    }

    /* renamed from: a */
    private static void m12113a(int i, Object obj, dx dxVar) {
        int i2 = i >>> 3;
        i &= 7;
        if (i != 5) {
            switch (i) {
                case 0:
                    dxVar.mo3001a(i2, ((Long) obj).longValue());
                    return;
                case 1:
                    dxVar.mo3022d(i2, ((Long) obj).longValue());
                    return;
                case 2:
                    dxVar.mo3003a(i2, (zzud) obj);
                    return;
                case 3:
                    if (dxVar.mo2996a() == zze.f10276j) {
                        dxVar.mo2997a(i2);
                        ((zzyc) obj).m12118b(dxVar);
                        dxVar.mo3011b(i2);
                        return;
                    }
                    dxVar.mo3011b(i2);
                    ((zzyc) obj).m12118b(dxVar);
                    dxVar.mo2997a(i2);
                    return;
                default:
                    throw new RuntimeException(zzvt.m12085e());
            }
        }
        dxVar.mo3021d(i2, ((Integer) obj).intValue());
    }

    /* renamed from: d */
    public final int m12120d() {
        int i = this.f10306e;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (i = 0; i < this.f10303b; i++) {
            i2 += zzut.m22566d(this.f10304c[i] >>> 3, (zzud) this.f10305d[i]);
        }
        this.f10306e = i2;
        return i2;
    }

    /* renamed from: e */
    public final int m12121e() {
        int i = this.f10306e;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (i = 0; i < this.f10303b; i++) {
            int i3 = this.f10304c[i];
            int i4 = i3 >>> 3;
            i3 &= 7;
            if (i3 != 5) {
                switch (i3) {
                    case 0:
                        i2 += zzut.m22570e(i4, ((Long) this.f10305d[i]).longValue());
                        break;
                    case 1:
                        i2 += zzut.m22578g(i4, ((Long) this.f10305d[i]).longValue());
                        break;
                    case 2:
                        i2 += zzut.m22560c(i4, (zzud) this.f10305d[i]);
                        break;
                    case 3:
                        i2 += (zzut.m22569e(i4) << 1) + ((zzyc) this.f10305d[i]).m12121e();
                        break;
                    default:
                        throw new IllegalStateException(zzvt.m12085e());
                }
            }
            i2 += zzut.m22585i(i4, ((Integer) this.f10305d[i]).intValue());
        }
        this.f10306e = i2;
        return i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzyc)) {
            return false;
        }
        zzyc zzyc = (zzyc) obj;
        if (this.f10303b == zzyc.f10303b) {
            Object obj2;
            int[] iArr = this.f10304c;
            int[] iArr2 = zzyc.f10304c;
            int i = this.f10303b;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] != iArr2[i2]) {
                    obj2 = null;
                    break;
                }
            }
            obj2 = 1;
            if (obj2 != null) {
                Object[] objArr = this.f10305d;
                obj = zzyc.f10305d;
                int i3 = this.f10303b;
                for (i = 0; i < i3; i++) {
                    if (!objArr[i].equals(obj[i])) {
                        obj = null;
                        break;
                    }
                }
                obj = true;
                if (obj != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.f10303b + 527) * 31;
        int[] iArr = this.f10304c;
        int i2 = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < this.f10303b; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        i = (i + i3) * 31;
        Object[] objArr = this.f10305d;
        for (int i5 = 0; i5 < this.f10303b; i5++) {
            i2 = (i2 * 31) + objArr[i5].hashCode();
        }
        return i + i2;
    }

    /* renamed from: a */
    final void m12117a(StringBuilder stringBuilder, int i) {
        for (int i2 = 0; i2 < this.f10303b; i2++) {
            cj.m11565a(stringBuilder, i, String.valueOf(this.f10304c[i2] >>> 3), this.f10305d[i2]);
        }
    }

    /* renamed from: a */
    final void m12115a(int i, Object obj) {
        if (this.f10307f) {
            if (this.f10303b == this.f10304c.length) {
                int i2 = this.f10303b + (this.f10303b < 4 ? 8 : this.f10303b >> 1);
                this.f10304c = Arrays.copyOf(this.f10304c, i2);
                this.f10305d = Arrays.copyOf(this.f10305d, i2);
            }
            this.f10304c[this.f10303b] = i;
            this.f10305d[this.f10303b] = obj;
            this.f10303b++;
            return;
        }
        throw new UnsupportedOperationException();
    }
}
