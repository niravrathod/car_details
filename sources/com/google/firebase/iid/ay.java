package com.google.firebase.iid;

import android.util.Base64;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.util.VisibleForTesting;
import java.security.KeyPair;

final class ay {
    /* renamed from: a */
    private final KeyPair f11019a;
    /* renamed from: b */
    private final long f11020b;

    @VisibleForTesting
    ay(KeyPair keyPair, long j) {
        this.f11019a = keyPair;
        this.f11020b = j;
    }

    /* renamed from: a */
    final KeyPair m12727a() {
        return this.f11019a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ay)) {
            return false;
        }
        ay ayVar = (ay) obj;
        if (this.f11020b == ayVar.f11020b && this.f11019a.getPublic().equals(ayVar.f11019a.getPublic()) && this.f11019a.getPrivate().equals(ayVar.f11019a.getPrivate()) != null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f11019a.getPublic(), this.f11019a.getPrivate(), Long.valueOf(this.f11020b));
    }

    /* renamed from: b */
    private final String m12723b() {
        return Base64.encodeToString(this.f11019a.getPublic().getEncoded(), 11);
    }

    /* renamed from: c */
    private final String m12726c() {
        return Base64.encodeToString(this.f11019a.getPrivate().getEncoded(), 11);
    }
}
