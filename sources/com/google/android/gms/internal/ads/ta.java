package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.zzu;
import java.util.Map;

final class ta implements zzu<Object> {
    /* renamed from: a */
    private final /* synthetic */ zzadw f16669a;
    /* renamed from: b */
    private final /* synthetic */ sx f16670b;

    ta(sx sxVar, zzadw zzadw) {
        this.f16670b = sxVar;
        this.f16669a = zzadw;
    }

    public final void zza(Object obj, Map<String, String> map) {
        zzasg zzasg = (zzasg) this.f16670b.f8383a.get();
        if (zzasg == null) {
            this.f16669a.mo2226b("/showOverlay", this);
        } else {
            zzasg.getView().setVisibility(null);
        }
    }
}
