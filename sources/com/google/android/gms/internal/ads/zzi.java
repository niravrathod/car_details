package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

public final class zzi implements zzaa {
    /* renamed from: a */
    private final Executor f17248a;

    public zzi(Handler handler) {
        this.f17248a = new rl(this, handler);
    }

    /* renamed from: a */
    public final void mo2459a(zzr<?> zzr, zzx<?> zzx) {
        mo2460a(zzr, zzx, null);
    }

    /* renamed from: a */
    public final void mo2460a(zzr<?> zzr, zzx<?> zzx, Runnable runnable) {
        zzr.m11041l();
        zzr.m11030b("post-response");
        this.f17248a.execute(new rt(zzr, zzx, runnable));
    }

    /* renamed from: a */
    public final void mo2458a(zzr<?> zzr, zzae zzae) {
        zzr.m11030b("post-error");
        this.f17248a.execute(new rt(zzr, zzx.m11176a(zzae), null));
    }
}
