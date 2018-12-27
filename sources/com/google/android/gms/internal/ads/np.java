package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

final class np implements Cloneable {
    /* renamed from: a */
    private zzbgu<?, ?> f8301a;
    /* renamed from: b */
    private Object f8302b;
    /* renamed from: c */
    private List<nq> f8303c = new ArrayList();

    np() {
    }

    /* renamed from: a */
    final void m9343a(nq nqVar) {
        if (this.f8303c != null) {
            this.f8303c.add(nqVar);
        } else if (this.f8302b instanceof zzbgz) {
            nqVar = nqVar.f8305b;
            zzbgq a = zzbgq.m10385a(nqVar, 0, nqVar.length);
            int g = a.m10404g();
            if (g == nqVar.length - zzbgr.m10408a(g)) {
                nqVar = ((zzbgz) this.f8302b).mo4209a(a);
                this.f8301a = this.f8301a;
                this.f8302b = nqVar;
                this.f8303c = null;
                return;
            }
            throw zzbgy.m10445a();
        } else if (this.f8302b instanceof zzbgz[]) {
            Collections.singletonList(nqVar);
            throw new NoSuchMethodError();
        } else {
            Collections.singletonList(nqVar);
            throw new NoSuchMethodError();
        }
    }

    /* renamed from: a */
    final int m9342a() {
        if (this.f8302b == null) {
            int i = 0;
            for (nq nqVar : this.f8303c) {
                i += (zzbgr.m10423d(nqVar.f8304a) + 0) + nqVar.f8305b.length;
            }
            return i;
        }
        throw new NoSuchMethodError();
    }

    /* renamed from: a */
    final void m9344a(zzbgr zzbgr) {
        if (this.f8302b == null) {
            for (nq nqVar : this.f8303c) {
                zzbgr.m10435c(nqVar.f8304a);
                zzbgr.m10437c(nqVar.f8305b);
            }
            return;
        }
        throw new NoSuchMethodError();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof np)) {
            return false;
        }
        np npVar = (np) obj;
        if (this.f8302b == null || npVar.f8302b == null) {
            if (this.f8303c != null && npVar.f8303c != null) {
                return this.f8303c.equals(npVar.f8303c);
            }
            try {
                return Arrays.equals(m9340b(), npVar.m9340b());
            } catch (Object obj2) {
                throw new IllegalStateException(obj2);
            }
        } else if (this.f8301a != npVar.f8301a) {
            return false;
        } else {
            if (!this.f8301a.f9251a.isArray()) {
                return this.f8302b.equals(npVar.f8302b);
            }
            if (this.f8302b instanceof byte[]) {
                return Arrays.equals((byte[]) this.f8302b, (byte[]) npVar.f8302b);
            }
            if (this.f8302b instanceof int[]) {
                return Arrays.equals((int[]) this.f8302b, (int[]) npVar.f8302b);
            }
            if (this.f8302b instanceof long[]) {
                return Arrays.equals((long[]) this.f8302b, (long[]) npVar.f8302b);
            }
            if (this.f8302b instanceof float[]) {
                return Arrays.equals((float[]) this.f8302b, (float[]) npVar.f8302b);
            }
            if (this.f8302b instanceof double[]) {
                return Arrays.equals((double[]) this.f8302b, (double[]) npVar.f8302b);
            }
            if (this.f8302b instanceof boolean[]) {
                return Arrays.equals((boolean[]) this.f8302b, (boolean[]) npVar.f8302b);
            }
            return Arrays.deepEquals((Object[]) this.f8302b, (Object[]) npVar.f8302b);
        }
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(m9340b()) + 527;
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: b */
    private final byte[] m9340b() {
        byte[] bArr = new byte[m9342a()];
        m9344a(zzbgr.m10412a(bArr));
        return bArr;
    }

    /* renamed from: c */
    private final np m9341c() {
        np npVar = new np();
        try {
            npVar.f8301a = this.f8301a;
            if (this.f8303c == null) {
                npVar.f8303c = null;
            } else {
                npVar.f8303c.addAll(this.f8303c);
            }
            if (this.f8302b != null) {
                if (this.f8302b instanceof zzbgz) {
                    npVar.f8302b = (zzbgz) ((zzbgz) this.f8302b).clone();
                } else if (this.f8302b instanceof byte[]) {
                    npVar.f8302b = ((byte[]) this.f8302b).clone();
                } else {
                    int i = 0;
                    Object obj;
                    if (this.f8302b instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) this.f8302b;
                        obj = new byte[bArr.length][];
                        npVar.f8302b = obj;
                        while (i < bArr.length) {
                            obj[i] = (byte[]) bArr[i].clone();
                            i++;
                        }
                    } else if (this.f8302b instanceof boolean[]) {
                        npVar.f8302b = ((boolean[]) this.f8302b).clone();
                    } else if (this.f8302b instanceof int[]) {
                        npVar.f8302b = ((int[]) this.f8302b).clone();
                    } else if (this.f8302b instanceof long[]) {
                        npVar.f8302b = ((long[]) this.f8302b).clone();
                    } else if (this.f8302b instanceof float[]) {
                        npVar.f8302b = ((float[]) this.f8302b).clone();
                    } else if (this.f8302b instanceof double[]) {
                        npVar.f8302b = ((double[]) this.f8302b).clone();
                    } else if (this.f8302b instanceof zzbgz[]) {
                        zzbgz[] zzbgzArr = (zzbgz[]) this.f8302b;
                        obj = new zzbgz[zzbgzArr.length];
                        npVar.f8302b = obj;
                        while (i < zzbgzArr.length) {
                            obj[i] = (zzbgz) zzbgzArr[i].clone();
                            i++;
                        }
                    }
                }
            }
            return npVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final /* synthetic */ Object clone() {
        return m9341c();
    }
}
