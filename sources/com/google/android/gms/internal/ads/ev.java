package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;

final /* synthetic */ class ev implements Runnable {
    /* renamed from: a */
    private final zzaps f8041a;
    /* renamed from: b */
    private final zzapi f8042b;

    ev(zzaps zzaps, zzapi zzapi) {
        this.f8041a = zzaps;
        this.f8042b = zzapi;
    }

    public final void run() {
        zzaps zzaps = this.f8041a;
        try {
            zzaps.m21290b(this.f8042b.get());
        } catch (ExecutionException e) {
            zzaps.m21289a(e.getCause());
        } catch (Throwable e2) {
            Thread.currentThread().interrupt();
            zzaps.m21289a(e2);
        } catch (Throwable e22) {
            zzaps.m21289a(e22);
        }
    }
}
