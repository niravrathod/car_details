package com.google.android.gms.ads.internal.gmsg;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.internal.ads.zzaer;
import java.util.Map;

@zzaer
public final class zzaa implements zzu<Object> {
    /* renamed from: a */
    private final Context f16342a;

    public zzaa(Context context) {
        this.f16342a = context;
    }

    public final void zza(Object obj, Map<String, String> map) {
        if (zzbv.zzfj().m9668a(this.f16342a) != null) {
            zzbv.zzfj().m9666a(this.f16342a, (String) map.get("eventName"), (String) map.get("eventId"));
        }
    }
}
