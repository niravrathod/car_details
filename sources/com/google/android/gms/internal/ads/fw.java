package com.google.android.gms.internal.ads;

final class fw implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ boolean f8073a;
    /* renamed from: b */
    private final /* synthetic */ zzaqr f8074b;

    fw(zzaqr zzaqr, boolean z) {
        this.f8074b = zzaqr;
        this.f8073a = z;
    }

    public final void run() {
        this.f8074b.m21308a("windowVisibilityChanged", "isVisible", String.valueOf(this.f8073a));
    }
}
