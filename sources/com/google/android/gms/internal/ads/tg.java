package com.google.android.gms.internal.ads;

final class tg implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ String f8389a;
    /* renamed from: b */
    private final /* synthetic */ long f8390b;
    /* renamed from: c */
    private final /* synthetic */ zzr f8391c;

    tg(zzr zzr, String str, long j) {
        this.f8391c = zzr;
        this.f8389a = str;
        this.f8390b = j;
    }

    public final void run() {
        this.f8391c.f9770a.m9507a(this.f8389a, this.f8390b);
        this.f8391c.f9770a.m9506a(this.f8391c.toString());
    }
}
