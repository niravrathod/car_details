package com.google.android.gms.internal.ads;

import com.google.ads.AdRequest.ErrorCode;

final class wu implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ ErrorCode f8479a;
    /* renamed from: b */
    private final /* synthetic */ zzzq f8480b;

    wu(zzzq zzzq, ErrorCode errorCode) {
        this.f8480b = zzzq;
        this.f8479a = errorCode;
    }

    public final void run() {
        try {
            this.f8480b.f17398a.mo2787a(zzaac.m9409a(this.f8479a));
        } catch (Throwable e) {
            zzaok.m10006d("#007 Could not call remote method.", e);
        }
    }
}
