package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.zzaok;
import com.google.android.gms.internal.ads.zzasg;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.internal.gmsg.f */
final class C4066f implements zzu<zzasg> {
    C4066f() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzasg zzasg = (zzasg) obj;
        map = zzasg.mo4775q();
        if (map != null) {
            map.close();
            return;
        }
        obj = zzasg.mo4776r();
        if (obj != null) {
            obj.close();
        } else {
            zzaok.m10007e("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
