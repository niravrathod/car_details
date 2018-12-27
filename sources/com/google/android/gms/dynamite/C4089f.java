package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule.VersionPolicy;
import com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.zza;
import com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.zzb;

/* renamed from: com.google.android.gms.dynamite.f */
final class C4089f implements VersionPolicy {
    C4089f() {
    }

    /* renamed from: a */
    public final zzb mo1924a(Context context, String str, zza zza) {
        zzb zzb = new zzb();
        zzb.f7876a = zza.mo1922a(context, str);
        zzb.f7877b = zza.mo1923a(context, str, true);
        if (zzb.f7876a == null && zzb.f7877b == null) {
            zzb.f7878c = null;
        } else if (zzb.f7877b >= zzb.f7876a) {
            zzb.f7878c = 1;
        } else {
            zzb.f7878c = -1;
        }
        return zzb;
    }
}
