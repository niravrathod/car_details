package com.google.android.gms.internal.ads;

import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@zzaer
@ParametersAreNonnullByDefault
public final class zzxd {
    /* renamed from: a */
    private final Object f9828a = new Object();
    @GuardedBy("mLock")
    /* renamed from: b */
    private zzxk f9829b;

    /* renamed from: a */
    public final zzxk m11178a(Context context, zzaop zzaop) {
        synchronized (this.f9828a) {
            if (this.f9829b == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                this.f9829b = new zzxk(context, zzaop, (String) zzkd.m10713e().m10897a(zznw.f9702a));
            }
            context = this.f9829b;
        }
        return context;
    }
}
