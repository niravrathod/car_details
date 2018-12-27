package com.google.android.gms.internal.ads;

final class sa extends zzkn {
    /* renamed from: a */
    final /* synthetic */ zzmq f19655a;

    private sa(zzmq zzmq) {
        this.f19655a = zzmq;
    }

    public final String getMediationAdapterClassName() {
        return null;
    }

    public final boolean isLoading() {
        return false;
    }

    public final String zzcj() {
        return null;
    }

    public final void zzd(zzjk zzjk) {
        zza(zzjk, 1);
    }

    public final void zza(zzjk zzjk, int i) {
        zzaok.m10003c("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzaoa.f8948a.post(new sb(this));
    }
}
