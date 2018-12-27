package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;
import javax.annotation.concurrent.GuardedBy;

@zzaer
public final class zzanp {
    /* renamed from: a */
    private long f8927a;
    @GuardedBy("mLock")
    /* renamed from: b */
    private long f8928b = Long.MIN_VALUE;
    /* renamed from: c */
    private Object f8929c = new Object();

    public zzanp(long j) {
        this.f8927a = j;
    }

    /* renamed from: a */
    public final boolean m9930a() {
        synchronized (this.f8929c) {
            long elapsedRealtime = zzbv.zzer().elapsedRealtime();
            if (this.f8928b + this.f8927a > elapsedRealtime) {
                return false;
            }
            this.f8928b = elapsedRealtime;
            return true;
        }
    }
}
