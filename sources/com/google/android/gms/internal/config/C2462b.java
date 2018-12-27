package com.google.android.gms.internal.config;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.config.b */
final class C2462b {
    /* renamed from: a */
    final int f9914a;
    /* renamed from: b */
    final byte[] f9915b;

    C2462b(int i, byte[] bArr) {
        this.f9914a = i;
        this.f9915b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2462b)) {
            return false;
        }
        C2462b c2462b = (C2462b) obj;
        return this.f9914a == c2462b.f9914a && Arrays.equals(this.f9915b, c2462b.f9915b);
    }

    public final int hashCode() {
        return ((this.f9914a + 527) * 31) + Arrays.hashCode(this.f9915b);
    }
}
