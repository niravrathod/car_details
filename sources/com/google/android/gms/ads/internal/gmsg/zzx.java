package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.zzaer;
import com.google.android.gms.internal.ads.zzaok;
import java.util.Map;

@zzaer
public final class zzx implements zzu<Object> {
    /* renamed from: a */
    private final zzy f16353a;

    public zzx(zzy zzy) {
        this.f16353a = zzy;
    }

    public final void zza(Object obj, Map<String, String> map) {
        obj = "1".equals(map.get("transparentBackground"));
        boolean equals = "1".equals(map.get("blur"));
        float f = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (Map<String, String> map2) {
            zzaok.m10002b("Fail to parse float", map2);
        }
        this.f16353a.zzd(obj);
        this.f16353a.zza(equals, f);
    }
}
