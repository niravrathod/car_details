package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;

final class dw implements zzaos<Throwable, T> {
    /* renamed from: a */
    private final /* synthetic */ zzanf f16458a;

    dw(zzamz zzamz, zzanf zzanf) {
        this.f16458a = zzanf;
    }

    /* renamed from: a */
    public final /* synthetic */ zzapi mo1714a(Object obj) {
        Throwable th = (Throwable) obj;
        zzaok.m10002b("Error occurred while dispatching http response in getter.", th);
        zzbv.zzeo().m9714a(th, "HttpGetter.deliverResponse.1");
        return zzaox.m10019a(this.f16458a.mo1933a());
    }
}
