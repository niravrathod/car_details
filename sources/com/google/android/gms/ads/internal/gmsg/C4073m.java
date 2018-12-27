package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.zzasg;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.internal.gmsg.m */
final class C4073m implements zzu<zzasg> {
    C4073m() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzasg zzasg = (zzasg) obj;
        if (map.keySet().contains("start")) {
            zzasg.mo4756e(true);
        }
        if (map.keySet().contains("stop") != null) {
            zzasg.mo4756e(null);
        }
    }
}
