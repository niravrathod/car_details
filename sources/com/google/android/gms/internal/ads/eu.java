package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

final /* synthetic */ class eu implements Runnable {
    /* renamed from: a */
    private final zzaps f8036a;
    /* renamed from: b */
    private final zzapi f8037b;
    /* renamed from: c */
    private final Class f8038c;
    /* renamed from: d */
    private final zzaos f8039d;
    /* renamed from: e */
    private final Executor f8040e;

    eu(zzaps zzaps, zzapi zzapi, Class cls, zzaos zzaos, Executor executor) {
        this.f8036a = zzaps;
        this.f8037b = zzapi;
        this.f8038c = cls;
        this.f8039d = zzaos;
        this.f8040e = executor;
    }

    public final void run() {
        zzaox.m10030a(this.f8036a, this.f8037b, this.f8038c, this.f8039d, this.f8040e);
    }
}
