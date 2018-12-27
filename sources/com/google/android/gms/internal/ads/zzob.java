package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import javax.annotation.ParametersAreNonnullByDefault;

@zzaer
@ParametersAreNonnullByDefault
public final class zzob {
    /* renamed from: a */
    public static void m10915a(zznz zznz, zzny zzny) {
        if (zzny.m10905b() == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        } else if (TextUtils.isEmpty(zzny.m10906c())) {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        } else {
            zznz.m10912a(zzny.m10905b(), zzny.m10906c(), zzny.m10904a(), zzny.m10907d());
        }
    }
}
