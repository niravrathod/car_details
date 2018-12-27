package com.google.android.gms.internal.ads;

final class br implements zzapx<zzwy> {
    /* renamed from: a */
    private final /* synthetic */ bq f16444a;

    br(bq bqVar) {
        this.f16444a = bqVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo1939a(Object obj) {
        try {
            ((zzwy) obj).mo4750b("AFMA_getAdapterLessMediationAd", this.f16444a.f7930a);
        } catch (Object obj2) {
            zzaok.m10002b("Error requesting an ad url", obj2);
            zzagk.f19831f.zzaw(this.f16444a.f7931b);
        }
    }
}
