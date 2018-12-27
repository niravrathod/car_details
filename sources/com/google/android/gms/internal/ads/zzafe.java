package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;

@zzaer
@VisibleForTesting
final class zzafe extends Exception {
    private final int mErrorCode;

    public zzafe(String str, int i) {
        super(str);
        this.mErrorCode = i;
    }

    /* renamed from: a */
    public final int m9513a() {
        return this.mErrorCode;
    }
}
