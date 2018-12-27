package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
public final class zzff {
    /* renamed from: a */
    final Context f10784a;

    @VisibleForTesting
    public zzff(Context context) {
        Preconditions.checkNotNull(context);
        context = context.getApplicationContext();
        Preconditions.checkNotNull(context);
        this.f10784a = context;
    }
}
