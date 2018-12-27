package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class zzavu {
    /* renamed from: a */
    private zzaze f9038a;

    private zzavu(zzaze zzaze) {
        this.f9038a = zzaze;
    }

    /* renamed from: a */
    static final zzavu m10193a(zzaze zzaze) {
        if (zzaze != null && zzaze.m29208c() > 0) {
            return new zzavu(zzaze);
        }
        throw new GeneralSecurityException("empty keyset");
    }

    /* renamed from: a */
    final zzaze m10194a() {
        return this.f9038a;
    }

    public final String toString() {
        return hp.m8943a(this.f9038a).toString();
    }
}
