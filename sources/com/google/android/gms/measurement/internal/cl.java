package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

final class cl implements Callable<String> {
    /* renamed from: a */
    private final /* synthetic */ zzh f10567a;
    /* renamed from: b */
    private final /* synthetic */ zzfa f10568b;

    cl(zzfa zzfa, zzh zzh) {
        this.f10568b = zzfa;
        this.f10567a = zzh;
    }

    public final /* synthetic */ Object call() {
        cp a;
        if (this.f10568b.m22794b().m27358j(this.f10567a.f20689a)) {
            a = this.f10568b.m22773e(this.f10567a);
        } else {
            a = this.f10568b.m22802d().m29425b(this.f10567a.f20689a);
        }
        if (a != null) {
            return a.m12258c();
        }
        this.f10568b.mo3172r().m28540i().m12354a("App info was null when attempting to get app instance id");
        return null;
    }
}
