package com.google.android.gms.internal.firebase_abt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase_abt.a */
final class C2464a implements Cloneable {
    /* renamed from: a */
    private zze<?, ?> f9989a;
    /* renamed from: b */
    private Object f9990b;
    /* renamed from: c */
    private List<C2465b> f9991c = new ArrayList();

    C2464a() {
    }

    /* renamed from: a */
    private final byte[] m11450a() {
        if (this.f9990b == null) {
            int i = 0;
            for (C2465b c2465b : this.f9991c) {
                i += (zzb.m11469b(c2465b.f9992a) + 0) + c2465b.f9993b.length;
            }
            byte[] bArr = new byte[i];
            zzb a = zzb.m11468a(bArr);
            if (this.f9990b == null) {
                for (C2465b c2465b2 : this.f9991c) {
                    a.m11471a(c2465b2.f9992a);
                    a.m11472b(c2465b2.f9993b);
                }
                return bArr;
            }
            throw new NoSuchMethodError();
        }
        throw new NoSuchMethodError();
    }

    /* renamed from: b */
    private final C2464a m11451b() {
        C2464a c2464a = new C2464a();
        try {
            c2464a.f9989a = this.f9989a;
            if (this.f9991c == null) {
                c2464a.f9991c = null;
            } else {
                c2464a.f9991c.addAll(this.f9991c);
            }
            if (this.f9990b != null) {
                Object obj;
                if (this.f9990b instanceof zzj) {
                    obj = (zzj) ((zzj) this.f9990b).clone();
                } else if (this.f9990b instanceof byte[]) {
                    obj = ((byte[]) this.f9990b).clone();
                } else {
                    int i = 0;
                    Object obj2;
                    if (this.f9990b instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) this.f9990b;
                        obj2 = new byte[bArr.length][];
                        c2464a.f9990b = obj2;
                        while (i < bArr.length) {
                            obj2[i] = (byte[]) bArr[i].clone();
                            i++;
                        }
                    } else if (this.f9990b instanceof boolean[]) {
                        obj = ((boolean[]) this.f9990b).clone();
                    } else if (this.f9990b instanceof int[]) {
                        obj = ((int[]) this.f9990b).clone();
                    } else if (this.f9990b instanceof long[]) {
                        obj = ((long[]) this.f9990b).clone();
                    } else if (this.f9990b instanceof float[]) {
                        obj = ((float[]) this.f9990b).clone();
                    } else if (this.f9990b instanceof double[]) {
                        obj = ((double[]) this.f9990b).clone();
                    } else if (this.f9990b instanceof zzj[]) {
                        zzj[] zzjArr = (zzj[]) this.f9990b;
                        obj2 = new zzj[zzjArr.length];
                        c2464a.f9990b = obj2;
                        while (i < zzjArr.length) {
                            obj2[i] = (zzj) zzjArr[i].clone();
                            i++;
                        }
                    }
                }
                c2464a.f9990b = obj;
            }
            return c2464a;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    final void m11452a(C2465b c2465b) {
        if (this.f9991c != null) {
            this.f9991c.add(c2465b);
        } else if (this.f9990b instanceof zzj) {
            byte[] bArr = c2465b.f9993b;
            zza a = zza.m11453a(bArr, 0, bArr.length);
            int e = a.m11466e();
            if (e == bArr.length - (e >= 0 ? zzb.m11469b(e) : 10)) {
                zzj a2 = ((zzj) this.f9990b).mo4338a(a);
                this.f9989a = this.f9989a;
                this.f9990b = a2;
                this.f9991c = null;
                return;
            }
            throw zzi.m11478a();
        } else if (this.f9990b instanceof zzj[]) {
            Collections.singletonList(c2465b);
            throw new NoSuchMethodError();
        } else {
            Collections.singletonList(c2465b);
            throw new NoSuchMethodError();
        }
    }

    public final /* synthetic */ Object clone() {
        return m11451b();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2464a)) {
            return false;
        }
        C2464a c2464a = (C2464a) obj;
        if (this.f9990b != null && c2464a.f9990b != null) {
            return this.f9989a != c2464a.f9989a ? false : !this.f9989a.f10006a.isArray() ? this.f9990b.equals(c2464a.f9990b) : this.f9990b instanceof byte[] ? Arrays.equals((byte[]) this.f9990b, (byte[]) c2464a.f9990b) : this.f9990b instanceof int[] ? Arrays.equals((int[]) this.f9990b, (int[]) c2464a.f9990b) : this.f9990b instanceof long[] ? Arrays.equals((long[]) this.f9990b, (long[]) c2464a.f9990b) : this.f9990b instanceof float[] ? Arrays.equals((float[]) this.f9990b, (float[]) c2464a.f9990b) : this.f9990b instanceof double[] ? Arrays.equals((double[]) this.f9990b, (double[]) c2464a.f9990b) : this.f9990b instanceof boolean[] ? Arrays.equals((boolean[]) this.f9990b, (boolean[]) c2464a.f9990b) : Arrays.deepEquals((Object[]) this.f9990b, (Object[]) c2464a.f9990b);
        } else {
            if (this.f9991c != null && c2464a.f9991c != null) {
                return this.f9991c.equals(c2464a.f9991c);
            }
            try {
                return Arrays.equals(m11450a(), c2464a.m11450a());
            } catch (Throwable e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(m11450a()) + 527;
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }
}
