package com.google.android.gms.internal.ads;

import com.google.ads.AdRequest.ErrorCode;

/* renamed from: com.google.android.gms.internal.ads.a */
final class C2433a implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ ErrorCode f7894a;
    /* renamed from: b */
    private final /* synthetic */ zzzq f7895b;

    C2433a(zzzq zzzq, ErrorCode errorCode) {
        this.f7895b = zzzq;
        this.f7894a = errorCode;
    }

    public final void run() {
        try {
            this.f7895b.f17398a.mo2787a(zzaac.m9409a(this.f7894a));
        } catch (Throwable e) {
            zzaok.m10006d("#007 Could not call remote method.", e);
        }
    }
}
