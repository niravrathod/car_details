package com.google.android.gms.internal.ads;

final class vi implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ String f8447a;
    /* renamed from: b */
    private final /* synthetic */ zzvt f8448b;

    vi(zzvt zzvt, String str) {
        this.f8448b = zzvt;
        this.f8447a = str;
    }

    public final void run() {
        this.f8448b.f21369a.loadUrl(this.f8447a);
    }
}
