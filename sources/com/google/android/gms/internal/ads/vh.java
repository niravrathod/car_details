package com.google.android.gms.internal.ads;

final class vh implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ String f8445a;
    /* renamed from: b */
    private final /* synthetic */ zzvt f8446b;

    vh(zzvt zzvt, String str) {
        this.f8446b = zzvt;
        this.f8445a = str;
    }

    public final void run() {
        this.f8446b.f21369a.loadData(this.f8445a, "text/html", "UTF-8");
    }
}
