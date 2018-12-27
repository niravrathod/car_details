package com.google.android.gms.internal.measurement;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

final class dy implements Cloneable {
    /* renamed from: a */
    private zzzb<?, ?> f10127a;
    /* renamed from: b */
    private Object f10128b;
    /* renamed from: c */
    private List<dz> f10129c = new ArrayList();

    dy() {
    }

    /* renamed from: a */
    final void m11864a(dz dzVar) {
        if (this.f10129c != null) {
            this.f10129c.add(dzVar);
            return;
        }
        if (this.f10128b instanceof zzzg) {
            dzVar = dzVar.f10131b;
            zzyx a = zzyx.m12125a(dzVar, 0, dzVar.length);
            int d = a.m12140d();
            if (d == dzVar.length - zzyy.m12148a(d)) {
                dzVar = ((zzzg) this.f10128b).mo4347a(a);
            } else {
                throw zzzf.m12194a();
            }
        } else if (this.f10128b instanceof zzzg[]) {
            zzzg[] zzzgArr = (zzzg[]) this.f10127a.m12180a(Collections.singletonList(dzVar));
            zzzg[] zzzgArr2 = (zzzg[]) this.f10128b;
            zzzg[] zzzgArr3 = (zzzg[]) Arrays.copyOf(zzzgArr2, zzzgArr2.length + zzzgArr.length);
            System.arraycopy(zzzgArr, 0, zzzgArr3, zzzgArr2.length, zzzgArr.length);
            dzVar = zzzgArr3;
        } else {
            dzVar = this.f10127a.m12180a(Collections.singletonList(dzVar));
        }
        this.f10127a = this.f10127a;
        this.f10128b = dzVar;
        this.f10129c = null;
    }

    /* renamed from: a */
    final int m11863a() {
        int i = 0;
        int i2;
        if (this.f10128b != null) {
            zzzb zzzb = this.f10127a;
            Object obj = this.f10128b;
            if (!zzzb.f10354c) {
                return zzzb.m12179a(obj);
            }
            int length = Array.getLength(obj);
            i2 = 0;
            while (i < length) {
                if (Array.get(obj, i) != null) {
                    i2 += zzzb.m12179a(Array.get(obj, i));
                }
                i++;
            }
            return i2;
        }
        i2 = 0;
        for (dz dzVar : this.f10129c) {
            i2 += (zzyy.m12162d(dzVar.f10130a) + 0) + dzVar.f10131b.length;
        }
        return i2;
    }

    /* renamed from: a */
    final void m11865a(zzyy zzyy) {
        if (this.f10128b != null) {
            zzzb zzzb = this.f10127a;
            Object obj = this.f10128b;
            if (zzzb.f10354c) {
                int length = Array.getLength(obj);
                for (int i = 0; i < length; i++) {
                    Object obj2 = Array.get(obj, i);
                    if (obj2 != null) {
                        zzzb.m12181a(obj2, zzyy);
                    }
                }
                return;
            }
            zzzb.m12181a(obj, zzyy);
            return;
        }
        for (dz dzVar : this.f10129c) {
            zzyy.m12176c(dzVar.f10130a);
            zzyy.m12175b(dzVar.f10131b);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dy)) {
            return false;
        }
        dy dyVar = (dy) obj;
        if (this.f10128b == null || dyVar.f10128b == null) {
            if (this.f10129c != null && dyVar.f10129c != null) {
                return this.f10129c.equals(dyVar.f10129c);
            }
            try {
                return Arrays.equals(m11861b(), dyVar.m11861b());
            } catch (Object obj2) {
                throw new IllegalStateException(obj2);
            }
        } else if (this.f10127a != dyVar.f10127a) {
            return false;
        } else {
            if (!this.f10127a.f10352a.isArray()) {
                return this.f10128b.equals(dyVar.f10128b);
            }
            if (this.f10128b instanceof byte[]) {
                return Arrays.equals((byte[]) this.f10128b, (byte[]) dyVar.f10128b);
            }
            if (this.f10128b instanceof int[]) {
                return Arrays.equals((int[]) this.f10128b, (int[]) dyVar.f10128b);
            }
            if (this.f10128b instanceof long[]) {
                return Arrays.equals((long[]) this.f10128b, (long[]) dyVar.f10128b);
            }
            if (this.f10128b instanceof float[]) {
                return Arrays.equals((float[]) this.f10128b, (float[]) dyVar.f10128b);
            }
            if (this.f10128b instanceof double[]) {
                return Arrays.equals((double[]) this.f10128b, (double[]) dyVar.f10128b);
            }
            if (this.f10128b instanceof boolean[]) {
                return Arrays.equals((boolean[]) this.f10128b, (boolean[]) dyVar.f10128b);
            }
            return Arrays.deepEquals((Object[]) this.f10128b, (Object[]) dyVar.f10128b);
        }
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(m11861b()) + 527;
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: b */
    private final byte[] m11861b() {
        byte[] bArr = new byte[m11863a()];
        m11865a(zzyy.m12152a(bArr));
        return bArr;
    }

    /* renamed from: c */
    private final dy m11862c() {
        dy dyVar = new dy();
        try {
            dyVar.f10127a = this.f10127a;
            if (this.f10129c == null) {
                dyVar.f10129c = null;
            } else {
                dyVar.f10129c.addAll(this.f10129c);
            }
            if (this.f10128b != null) {
                if (this.f10128b instanceof zzzg) {
                    dyVar.f10128b = (zzzg) ((zzzg) this.f10128b).clone();
                } else if (this.f10128b instanceof byte[]) {
                    dyVar.f10128b = ((byte[]) this.f10128b).clone();
                } else {
                    int i = 0;
                    Object obj;
                    if (this.f10128b instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) this.f10128b;
                        obj = new byte[bArr.length][];
                        dyVar.f10128b = obj;
                        while (i < bArr.length) {
                            obj[i] = (byte[]) bArr[i].clone();
                            i++;
                        }
                    } else if (this.f10128b instanceof boolean[]) {
                        dyVar.f10128b = ((boolean[]) this.f10128b).clone();
                    } else if (this.f10128b instanceof int[]) {
                        dyVar.f10128b = ((int[]) this.f10128b).clone();
                    } else if (this.f10128b instanceof long[]) {
                        dyVar.f10128b = ((long[]) this.f10128b).clone();
                    } else if (this.f10128b instanceof float[]) {
                        dyVar.f10128b = ((float[]) this.f10128b).clone();
                    } else if (this.f10128b instanceof double[]) {
                        dyVar.f10128b = ((double[]) this.f10128b).clone();
                    } else if (this.f10128b instanceof zzzg[]) {
                        zzzg[] zzzgArr = (zzzg[]) this.f10128b;
                        obj = new zzzg[zzzgArr.length];
                        dyVar.f10128b = obj;
                        while (i < zzzgArr.length) {
                            obj[i] = (zzzg) zzzgArr[i].clone();
                            i++;
                        }
                    }
                }
            }
            return dyVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final /* synthetic */ Object clone() {
        return m11862c();
    }
}
