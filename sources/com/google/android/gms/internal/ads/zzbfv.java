package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdd.zze;
import java.util.Arrays;

public final class zzbfv {
    /* renamed from: a */
    private static final zzbfv f9201a = new zzbfv(0, new int[0], new Object[0], false);
    /* renamed from: b */
    private int f9202b;
    /* renamed from: c */
    private int[] f9203c;
    /* renamed from: d */
    private Object[] f9204d;
    /* renamed from: e */
    private int f9205e;
    /* renamed from: f */
    private boolean f9206f;

    /* renamed from: a */
    public static zzbfv m10372a() {
        return f9201a;
    }

    /* renamed from: b */
    static zzbfv m10375b() {
        return new zzbfv();
    }

    /* renamed from: a */
    static zzbfv m10373a(zzbfv zzbfv, zzbfv zzbfv2) {
        int i = zzbfv.f9202b + zzbfv2.f9202b;
        Object copyOf = Arrays.copyOf(zzbfv.f9203c, i);
        System.arraycopy(zzbfv2.f9203c, 0, copyOf, zzbfv.f9202b, zzbfv2.f9202b);
        Object copyOf2 = Arrays.copyOf(zzbfv.f9204d, i);
        System.arraycopy(zzbfv2.f9204d, 0, copyOf2, zzbfv.f9202b, zzbfv2.f9202b);
        return new zzbfv(i, copyOf, copyOf2, true);
    }

    private zzbfv() {
        this(0, new int[8], new Object[8], true);
    }

    private zzbfv(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f9205e = -1;
        this.f9202b = i;
        this.f9203c = iArr;
        this.f9204d = objArr;
        this.f9206f = z;
    }

    /* renamed from: c */
    public final void m10380c() {
        this.f9206f = false;
    }

    /* renamed from: a */
    final void m10377a(no noVar) {
        int i;
        if (noVar.mo2042a() == zze.f9176k) {
            for (i = this.f9202b - 1; i >= 0; i--) {
                noVar.mo2050a(this.f9203c[i] >>> 3, this.f9204d[i]);
            }
            return;
        }
        for (i = 0; i < this.f9202b; i++) {
            noVar.mo2050a(this.f9203c[i] >>> 3, this.f9204d[i]);
        }
    }

    /* renamed from: b */
    public final void m10379b(no noVar) {
        if (this.f9202b != 0) {
            int i;
            if (noVar.mo2042a() == zze.f9175j) {
                for (i = 0; i < this.f9202b; i++) {
                    m10374a(this.f9203c[i], this.f9204d[i], noVar);
                }
                return;
            }
            for (i = this.f9202b - 1; i >= 0; i--) {
                m10374a(this.f9203c[i], this.f9204d[i], noVar);
            }
        }
    }

    /* renamed from: a */
    private static void m10374a(int i, Object obj, no noVar) {
        int i2 = i >>> 3;
        i &= 7;
        if (i != 5) {
            switch (i) {
                case 0:
                    noVar.mo2047a(i2, ((Long) obj).longValue());
                    return;
                case 1:
                    noVar.mo2068d(i2, ((Long) obj).longValue());
                    return;
                case 2:
                    noVar.mo2049a(i2, (zzbbu) obj);
                    return;
                case 3:
                    if (noVar.mo2042a() == zze.f9175j) {
                        noVar.mo2043a(i2);
                        ((zzbfv) obj).m10379b(noVar);
                        noVar.mo2057b(i2);
                        return;
                    }
                    noVar.mo2057b(i2);
                    ((zzbfv) obj).m10379b(noVar);
                    noVar.mo2043a(i2);
                    return;
                default:
                    throw new RuntimeException(zzbdl.m10345f());
            }
        }
        noVar.mo2067d(i2, ((Integer) obj).intValue());
    }

    /* renamed from: d */
    public final int m10381d() {
        int i = this.f9205e;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (i = 0; i < this.f9202b; i++) {
            i2 += zzbck.m21533d(this.f9203c[i] >>> 3, (zzbbu) this.f9204d[i]);
        }
        this.f9205e = i2;
        return i2;
    }

    /* renamed from: e */
    public final int m10382e() {
        int i = this.f9205e;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (i = 0; i < this.f9202b; i++) {
            int i3 = this.f9203c[i];
            int i4 = i3 >>> 3;
            i3 &= 7;
            if (i3 != 5) {
                switch (i3) {
                    case 0:
                        i2 += zzbck.m21538e(i4, ((Long) this.f9204d[i]).longValue());
                        break;
                    case 1:
                        i2 += zzbck.m21546g(i4, ((Long) this.f9204d[i]).longValue());
                        break;
                    case 2:
                        i2 += zzbck.m21528c(i4, (zzbbu) this.f9204d[i]);
                        break;
                    case 3:
                        i2 += (zzbck.m21537e(i4) << 1) + ((zzbfv) this.f9204d[i]).m10382e();
                        break;
                    default:
                        throw new IllegalStateException(zzbdl.m10345f());
                }
            }
            i2 += zzbck.m21553i(i4, ((Integer) this.f9204d[i]).intValue());
        }
        this.f9205e = i2;
        return i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzbfv)) {
            return false;
        }
        zzbfv zzbfv = (zzbfv) obj;
        if (this.f9202b == zzbfv.f9202b) {
            Object obj2;
            int[] iArr = this.f9203c;
            int[] iArr2 = zzbfv.f9203c;
            int i = this.f9202b;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] != iArr2[i2]) {
                    obj2 = null;
                    break;
                }
            }
            obj2 = 1;
            if (obj2 != null) {
                Object[] objArr = this.f9204d;
                obj = zzbfv.f9204d;
                int i3 = this.f9202b;
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
        int i = (this.f9202b + 527) * 31;
        int[] iArr = this.f9203c;
        int i2 = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < this.f9202b; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        i = (i + i3) * 31;
        Object[] objArr = this.f9204d;
        for (int i5 = 0; i5 < this.f9202b; i5++) {
            i2 = (i2 * 31) + objArr[i5].hashCode();
        }
        return i + i2;
    }

    /* renamed from: a */
    final void m10378a(StringBuilder stringBuilder, int i) {
        for (int i2 = 0; i2 < this.f9202b; i2++) {
            lz.m9043a(stringBuilder, i, String.valueOf(this.f9203c[i2] >>> 3), this.f9204d[i2]);
        }
    }

    /* renamed from: a */
    final void m10376a(int i, Object obj) {
        if (this.f9206f) {
            if (this.f9202b == this.f9203c.length) {
                int i2 = this.f9202b + (this.f9202b < 4 ? 8 : this.f9202b >> 1);
                this.f9203c = Arrays.copyOf(this.f9203c, i2);
                this.f9204d = Arrays.copyOf(this.f9204d, i2);
            }
            this.f9203c[this.f9202b] = i;
            this.f9204d[this.f9202b] = obj;
            this.f9202b++;
            return;
        }
        throw new UnsupportedOperationException();
    }
}
