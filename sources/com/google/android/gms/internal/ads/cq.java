package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;

final class cq implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Context f7967a;
    /* renamed from: b */
    private final /* synthetic */ zzaps f7968b;

    cq(zzakj zzakj, Context context, zzaps zzaps) {
        this.f7967a = context;
        this.f7968b = zzaps;
    }

    public final void run() {
        try {
            this.f7968b.m21290b(AdvertisingIdClient.getAdvertisingIdInfo(this.f7967a));
        } catch (Throwable e) {
            this.f7968b.m21289a(e);
            zzaok.m10002b("Exception while getting advertising Id info", e);
        }
    }
}
