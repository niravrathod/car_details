package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.GooglePlayServicesUtilLight;

final class bj implements bk {
    /* renamed from: a */
    private final /* synthetic */ Context f16440a;

    bj(Context context) {
        this.f16440a = context;
    }

    /* renamed from: a */
    public final boolean mo1938a(zzaop zzaop) {
        zzkd.m10709a();
        boolean c = zzaoa.m9969c(this.f16440a, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        Object obj = (((Boolean) zzkd.m10713e().m10897a(zznw.cs)).booleanValue() && zzaop.f19896d) ? 1 : null;
        zzbv.zzek();
        boolean f = zzalo.m9821f(this.f16440a.getPackageName());
        if (zzaff.m9515b(this.f16440a, zzaop.f19896d) != null && c && obj == null) {
            if (!f) {
                return false;
            }
        }
        return true;
    }
}
