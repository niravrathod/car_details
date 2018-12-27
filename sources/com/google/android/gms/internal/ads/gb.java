package com.google.android.gms.internal.ads;

@zzaer
final class gb implements Runnable {
    /* renamed from: a */
    private zzaqr f8084a;
    /* renamed from: b */
    private boolean f8085b = false;

    gb(zzaqr zzaqr) {
        this.f8084a = zzaqr;
    }

    public final void run() {
        if (!this.f8085b) {
            this.f8084a.m21333o();
            m8936c();
        }
    }

    /* renamed from: a */
    public final void m8937a() {
        this.f8085b = true;
        this.f8084a.m21333o();
    }

    /* renamed from: b */
    public final void m8938b() {
        this.f8085b = false;
        m8936c();
    }

    /* renamed from: c */
    private final void m8936c() {
        zzalo.f8872a.removeCallbacks(this);
        zzalo.f8872a.postDelayed(this, 250);
    }
}
