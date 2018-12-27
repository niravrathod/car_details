package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;

final class cy extends zzalc {
    /* renamed from: a */
    private Context f19631a;

    cy(Context context) {
        this.f19631a = context;
    }

    public final void m_() {
    }

    /* renamed from: a */
    public final void mo4075a() {
        boolean isAdIdFakeForDebugLogging;
        try {
            isAdIdFakeForDebugLogging = AdvertisingIdClient.getIsAdIdFakeForDebugLogging(this.f19631a);
        } catch (Throwable e) {
            zzaok.m10002b("Fail to get isAdIdFakeForDebugLogging", e);
            isAdIdFakeForDebugLogging = false;
        }
        zzaoe.m9983a(isAdIdFakeForDebugLogging);
        StringBuilder stringBuilder = new StringBuilder(43);
        stringBuilder.append("Update ad debug logging enablement as ");
        stringBuilder.append(isAdIdFakeForDebugLogging);
        zzaok.m10007e(stringBuilder.toString());
    }
}
