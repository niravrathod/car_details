package com.google.android.gms.internal.ads;

final class rt implements Runnable {
    /* renamed from: a */
    private final zzr f8364a;
    /* renamed from: b */
    private final zzx f8365b;
    /* renamed from: c */
    private final Runnable f8366c;

    public rt(zzr zzr, zzx zzx, Runnable runnable) {
        this.f8364a = zzr;
        this.f8365b = zzx;
        this.f8366c = runnable;
    }

    public final void run() {
        this.f8364a.m11037h();
        if ((this.f8365b.f9826c == null ? 1 : null) != null) {
            this.f8364a.mo2370a(this.f8365b.f9824a);
        } else {
            this.f8364a.m11025a(this.f8365b.f9826c);
        }
        if (this.f8365b.f9827d) {
            this.f8364a.m11030b("intermediate-response");
        } else {
            this.f8364a.m11032c("done");
        }
        if (this.f8366c != null) {
            this.f8366c.run();
        }
    }
}
