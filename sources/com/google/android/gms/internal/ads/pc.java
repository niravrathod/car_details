package com.google.android.gms.internal.ads;

final class pc implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ int f8319a;
    /* renamed from: b */
    private final /* synthetic */ boolean f8320b;
    /* renamed from: c */
    private final /* synthetic */ zzdb f8321c;

    pc(zzdb zzdb, int i, boolean z) {
        this.f8321c = zzdb;
        this.f8319a = i;
        this.f8320b = z;
    }

    public final void run() {
        zzbb b = this.f8321c.m10508b(this.f8319a, this.f8320b);
        this.f8321c.f9367k = b;
        if (zzdb.m10500b(this.f8319a, b)) {
            this.f8321c.m10506a(this.f8319a + 1, this.f8320b);
        }
    }
}
