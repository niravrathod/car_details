package com.google.android.gms.internal.firebase_abt;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase_abt.b */
final class C2465b {
    /* renamed from: a */
    final int f9992a;
    /* renamed from: b */
    final byte[] f9993b;

    C2465b(int i, byte[] bArr) {
        this.f9992a = i;
        this.f9993b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2465b)) {
            return false;
        }
        C2465b c2465b = (C2465b) obj;
        return this.f9992a == c2465b.f9992a && Arrays.equals(this.f9993b, c2465b.f9993b);
    }

    public final int hashCode() {
        return ((this.f9992a + 527) * 31) + Arrays.hashCode(this.f9993b);
    }
}
