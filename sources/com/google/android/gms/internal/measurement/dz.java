package com.google.android.gms.internal.measurement;

import java.util.Arrays;

final class dz {
    /* renamed from: a */
    final int f10130a;
    /* renamed from: b */
    final byte[] f10131b;

    dz(int i, byte[] bArr) {
        this.f10130a = i;
        this.f10131b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dz)) {
            return false;
        }
        dz dzVar = (dz) obj;
        return this.f10130a == dzVar.f10130a && Arrays.equals(this.f10131b, dzVar.f10131b) != null;
    }

    public final int hashCode() {
        return ((this.f10130a + 527) * 31) + Arrays.hashCode(this.f10131b);
    }
}
