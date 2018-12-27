package com.google.android.gms.internal.ads;

import android.os.Bundle;

@zzaer
final class cr {
    /* renamed from: a */
    private long f7969a = -1;
    /* renamed from: b */
    private long f7970b = -1;
    /* renamed from: c */
    private final /* synthetic */ zzako f7971c;

    public cr(zzako zzako) {
        this.f7971c = zzako;
    }

    /* renamed from: a */
    public final long m8908a() {
        return this.f7970b;
    }

    /* renamed from: b */
    public final void m8909b() {
        this.f7970b = this.f7971c.f8816a.elapsedRealtime();
    }

    /* renamed from: c */
    public final void m8910c() {
        this.f7969a = this.f7971c.f8816a.elapsedRealtime();
    }

    /* renamed from: d */
    public final Bundle m8911d() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.f7969a);
        bundle.putLong("tclose", this.f7970b);
        return bundle;
    }
}
