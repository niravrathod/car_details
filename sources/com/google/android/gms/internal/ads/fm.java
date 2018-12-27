package com.google.android.gms.internal.ads;

final class fm implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ String f8058a;
    /* renamed from: b */
    private final /* synthetic */ String f8059b;
    /* renamed from: c */
    private final /* synthetic */ zzaqe f8060c;

    fm(zzaqe zzaqe, String str, String str2) {
        this.f8060c = zzaqe;
        this.f8058a = str;
        this.f8059b = str2;
    }

    public final void run() {
        if (this.f8060c.f19914r != null) {
            this.f8060c.f19914r.mo2378a(this.f8058a, this.f8059b);
        }
    }
}
