package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.zzasg;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.internal.gmsg.k */
final class C4071k implements zzu<zzasg> {
    C4071k() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzasg zzasg = (zzasg) obj;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            zzasg.zzck();
            return;
        }
        if ("resume".equals(str) != null) {
            zzasg.zzcl();
        }
    }
}
