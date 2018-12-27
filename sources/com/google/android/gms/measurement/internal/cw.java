package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdx;

abstract class cw {
    /* renamed from: b */
    private static volatile Handler f10606b;
    /* renamed from: a */
    private final ap f10607a;
    /* renamed from: c */
    private final Runnable f10608c;
    /* renamed from: d */
    private volatile long f10609d;

    cw(ap apVar) {
        Preconditions.checkNotNull(apVar);
        this.f10607a = apVar;
        this.f10608c = new cx(this, apVar);
    }

    /* renamed from: a */
    public abstract void mo3174a();

    /* renamed from: a */
    public final void m12308a(long j) {
        m12310c();
        if (j >= 0) {
            this.f10609d = this.f10607a.mo3169m().currentTimeMillis();
            if (!m12306d().postDelayed(this.f10608c, j)) {
                this.f10607a.mo3172r().v_().m12355a("Failed to schedule delayed post. time", Long.valueOf(j));
            }
        }
    }

    /* renamed from: b */
    public final boolean m12309b() {
        return this.f10609d != 0;
    }

    /* renamed from: c */
    final void m12310c() {
        this.f10609d = 0;
        m12306d().removeCallbacks(this.f10608c);
    }

    /* renamed from: d */
    private final Handler m12306d() {
        if (f10606b != null) {
            return f10606b;
        }
        Handler handler;
        synchronized (cw.class) {
            if (f10606b == null) {
                f10606b = new zzdx(this.f10607a.mo3170n().getMainLooper());
            }
            handler = f10606b;
        }
        return handler;
    }
}
