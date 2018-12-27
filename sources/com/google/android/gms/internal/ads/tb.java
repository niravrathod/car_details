package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.zzu;
import java.util.Map;

final class tb implements zzu<Object> {
    /* renamed from: a */
    private final /* synthetic */ zzadw f16671a;
    /* renamed from: b */
    private final /* synthetic */ sx f16672b;

    tb(sx sxVar, zzadw zzadw) {
        this.f16672b = sxVar;
        this.f16671a = zzadw;
    }

    public final void zza(Object obj, Map<String, String> map) {
        zzasg zzasg = (zzasg) this.f16672b.f8383a.get();
        if (zzasg == null) {
            this.f16671a.mo2226b("/hideOverlay", this);
        } else {
            zzasg.getView().setVisibility(8);
        }
    }
}
