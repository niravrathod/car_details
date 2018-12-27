package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.zzasg;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.internal.gmsg.l */
final class C4072l implements zzu<zzasg> {
    C4072l() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzasg zzasg = (zzasg) obj;
        if (map.keySet().contains("start")) {
            zzasg.mo4782u().mo2401h();
        } else if (map.keySet().contains("stop")) {
            zzasg.mo4782u().mo2402i();
        } else {
            if (map.keySet().contains("cancel") != null) {
                zzasg.mo4782u().mo2403j();
            }
        }
    }
}
