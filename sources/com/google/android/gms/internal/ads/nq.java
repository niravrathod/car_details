package com.google.android.gms.internal.ads;

import java.util.Arrays;

final class nq {
    /* renamed from: a */
    final int f8304a;
    /* renamed from: b */
    final byte[] f8305b;

    nq(int i, byte[] bArr) {
        this.f8304a = i;
        this.f8305b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nq)) {
            return false;
        }
        nq nqVar = (nq) obj;
        return this.f8304a == nqVar.f8304a && Arrays.equals(this.f8305b, nqVar.f8305b) != null;
    }

    public final int hashCode() {
        return ((this.f8304a + 527) * 31) + Arrays.hashCode(this.f8305b);
    }
}
