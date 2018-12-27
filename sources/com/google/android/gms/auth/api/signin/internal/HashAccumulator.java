package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;

public class HashAccumulator {
    @VisibleForTesting
    /* renamed from: a */
    private static int f7869a = 31;
    /* renamed from: b */
    private int f7870b = 1;

    @KeepForSdk
    /* renamed from: a */
    public HashAccumulator m8829a(Object obj) {
        this.f7870b = (f7869a * this.f7870b) + (obj == null ? null : obj.hashCode());
        return this;
    }

    /* renamed from: a */
    public final HashAccumulator m8830a(boolean z) {
        this.f7870b = (f7869a * this.f7870b) + z;
        return this;
    }

    @KeepForSdk
    /* renamed from: a */
    public int m8828a() {
        return this.f7870b;
    }
}
