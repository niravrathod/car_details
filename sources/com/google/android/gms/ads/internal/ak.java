package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzakm;
import com.google.android.gms.internal.ads.zzakn;

final class ak implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ zzakn f7650a;
    /* renamed from: b */
    private final /* synthetic */ zzh f7651b;

    ak(zzh zzh, zzakn zzakn) {
        this.f7651b = zzh;
        this.f7650a = zzakn;
    }

    public final void run() {
        this.f7651b.zzb(new zzakm(this.f7650a, null, null, null, null, null, null, null));
    }
}
