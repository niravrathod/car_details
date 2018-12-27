package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;

@zzaer
@TargetApi(14)
public final class zzaqz {
    /* renamed from: a */
    private final long f8973a = TimeUnit.MILLISECONDS.toNanos(((Long) zzkd.m10713e().m10897a(zznw.f9725w)).longValue());
    /* renamed from: b */
    private long f8974b;
    /* renamed from: c */
    private boolean f8975c = true;

    zzaqz() {
    }

    /* renamed from: a */
    public final void m10064a() {
        this.f8975c = true;
    }

    /* renamed from: a */
    public final void m10065a(SurfaceTexture surfaceTexture, zzaqo zzaqo) {
        if (zzaqo != null) {
            long timestamp = surfaceTexture.getTimestamp();
            if (this.f8975c != null || Math.abs(timestamp - this.f8974b) >= this.f8973a) {
                this.f8975c = null;
                this.f8974b = timestamp;
                zzalo.f8872a.post(new fx(this, zzaqo));
            }
        }
    }
}
