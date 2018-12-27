package com.google.android.gms.internal.config;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.config.a */
final class C2461a implements Cloneable {
    /* renamed from: a */
    private zzbc<?, ?> f9911a;
    /* renamed from: b */
    private Object f9912b;
    /* renamed from: c */
    private List<C2462b> f9913c = new ArrayList();

    C2461a() {
    }

    /* renamed from: b */
    private final byte[] m11329b() {
        byte[] bArr = new byte[m11331a()];
        m11333a(zzaz.m11380a(bArr));
        return bArr;
    }

    /* renamed from: c */
    private final C2461a m11330c() {
        C2461a c2461a = new C2461a();
        try {
            c2461a.f9911a = this.f9911a;
            if (this.f9913c == null) {
                c2461a.f9913c = null;
            } else {
                c2461a.f9913c.addAll(this.f9913c);
            }
            if (this.f9912b != null) {
                Object obj;
                if (this.f9912b instanceof zzbh) {
                    obj = (zzbh) ((zzbh) this.f9912b).clone();
                } else if (this.f9912b instanceof byte[]) {
                    obj = ((byte[]) this.f9912b).clone();
                } else {
                    int i = 0;
                    Object obj2;
                    if (this.f9912b instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) this.f9912b;
                        obj2 = new byte[bArr.length][];
                        c2461a.f9912b = obj2;
                        while (i < bArr.length) {
                            obj2[i] = (byte[]) bArr[i].clone();
                            i++;
                        }
                    } else if (this.f9912b instanceof boolean[]) {
                        obj = ((boolean[]) this.f9912b).clone();
                    } else if (this.f9912b instanceof int[]) {
                        obj = ((int[]) this.f9912b).clone();
                    } else if (this.f9912b instanceof long[]) {
                        obj = ((long[]) this.f9912b).clone();
                    } else if (this.f9912b instanceof float[]) {
                        obj = ((float[]) this.f9912b).clone();
                    } else if (this.f9912b instanceof double[]) {
                        obj = ((double[]) this.f9912b).clone();
                    } else if (this.f9912b instanceof zzbh[]) {
                        zzbh[] zzbhArr = (zzbh[]) this.f9912b;
                        obj2 = new zzbh[zzbhArr.length];
                        c2461a.f9912b = obj2;
                        while (i < zzbhArr.length) {
                            obj2[i] = (zzbh) zzbhArr[i].clone();
                            i++;
                        }
                    }
                }
                c2461a.f9912b = obj;
            }
            return c2461a;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    final int m11331a() {
        if (this.f9912b == null) {
            int i = 0;
            for (C2462b c2462b : this.f9913c) {
                i += (zzaz.m11388d(c2462b.f9914a) + 0) + c2462b.f9915b.length;
            }
            return i;
        }
        throw new NoSuchMethodError();
    }

    /* renamed from: a */
    final void m11332a(C2462b c2462b) {
        if (this.f9913c != null) {
            this.f9913c.add(c2462b);
        } else if (this.f9912b instanceof zzbh) {
            byte[] bArr = c2462b.f9915b;
            zzay a = zzay.m11363a(bArr, 0, bArr.length);
            int d = a.m11375d();
            if (d == bArr.length - zzaz.m11378a(d)) {
                zzbh a2 = ((zzbh) this.f9912b).mo4333a(a);
                this.f9911a = this.f9911a;
                this.f9912b = a2;
                this.f9913c = null;
                return;
            }
            throw zzbg.m11413a();
        } else if (this.f9912b instanceof zzbh[]) {
            Collections.singletonList(c2462b);
            throw new NoSuchMethodError();
        } else {
            Collections.singletonList(c2462b);
            throw new NoSuchMethodError();
        }
    }

    /* renamed from: a */
    final void m11333a(zzaz zzaz) {
        if (this.f9912b == null) {
            for (C2462b c2462b : this.f9913c) {
                zzaz.m11397c(c2462b.f9914a);
                zzaz.m11399c(c2462b.f9915b);
            }
            return;
        }
        throw new NoSuchMethodError();
    }

    public final /* synthetic */ Object clone() {
        return m11330c();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2461a)) {
            return false;
        }
        C2461a c2461a = (C2461a) obj;
        if (this.f9912b != null && c2461a.f9912b != null) {
            return this.f9911a != c2461a.f9911a ? false : !this.f9911a.f9950a.isArray() ? this.f9912b.equals(c2461a.f9912b) : this.f9912b instanceof byte[] ? Arrays.equals((byte[]) this.f9912b, (byte[]) c2461a.f9912b) : this.f9912b instanceof int[] ? Arrays.equals((int[]) this.f9912b, (int[]) c2461a.f9912b) : this.f9912b instanceof long[] ? Arrays.equals((long[]) this.f9912b, (long[]) c2461a.f9912b) : this.f9912b instanceof float[] ? Arrays.equals((float[]) this.f9912b, (float[]) c2461a.f9912b) : this.f9912b instanceof double[] ? Arrays.equals((double[]) this.f9912b, (double[]) c2461a.f9912b) : this.f9912b instanceof boolean[] ? Arrays.equals((boolean[]) this.f9912b, (boolean[]) c2461a.f9912b) : Arrays.deepEquals((Object[]) this.f9912b, (Object[]) c2461a.f9912b);
        } else {
            if (this.f9913c != null && c2461a.f9913c != null) {
                return this.f9913c.equals(c2461a.f9913c);
            }
            try {
                return Arrays.equals(m11329b(), c2461a.m11329b());
            } catch (Throwable e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(m11329b()) + 527;
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }
}
