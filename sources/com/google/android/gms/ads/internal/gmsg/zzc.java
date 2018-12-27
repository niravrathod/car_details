package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.zzaer;
import com.google.android.gms.internal.ads.zzaok;
import java.util.Map;

@zzaer
public final class zzc implements zzu<Object> {
    /* renamed from: a */
    private final zzd f16352a;

    public zzc(zzd zzd) {
        this.f16352a = zzd;
    }

    public final void zza(Object obj, Map<String, String> map) {
        String str = (String) map.get("name");
        if (str == null) {
            zzaok.m10007e("App event with no name parameter.");
        } else {
            this.f16352a.onAppEvent(str, (String) map.get("info"));
        }
    }
}
