package com.google.android.gms.internal.ads;

final class vg implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ String f8443a;
    /* renamed from: b */
    private final /* synthetic */ zzvt f8444b;

    vg(zzvt zzvt, String str) {
        this.f8444b = zzvt;
        this.f8443a = str;
    }

    public final void run() {
        this.f8444b.f21369a.loadData(this.f8443a, "text/html", "UTF-8");
    }
}
