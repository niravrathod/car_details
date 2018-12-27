package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MuteThisAdReason;

@zzaer
public final class zzlx implements MuteThisAdReason {
    /* renamed from: a */
    private final String f17291a;
    /* renamed from: b */
    private zzlu f17292b;

    public zzlx(zzlu zzlu) {
        this.f17292b = zzlu;
        try {
            zzlu = zzlu.mo2550a();
        } catch (zzlu zzlu2) {
            zzaok.m10002b("", zzlu2);
            zzlu2 = null;
        }
        this.f17291a = zzlu2;
    }

    public final String getDescription() {
        return this.f17291a;
    }

    /* renamed from: a */
    public final zzlu m21765a() {
        return this.f17292b;
    }
}
