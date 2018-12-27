package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: com.google.android.gms.measurement.internal.r */
final class C2492r<V> extends FutureTask<V> implements Comparable<C2492r> {
    /* renamed from: a */
    final boolean f10657a;
    /* renamed from: b */
    private final long f10658b = zzbo.f21420j.getAndIncrement();
    /* renamed from: c */
    private final String f10659c;
    /* renamed from: d */
    private final /* synthetic */ zzbo f10660d;

    C2492r(zzbo zzbo, Callable<V> callable, boolean z, String str) {
        this.f10660d = zzbo;
        super(callable);
        Preconditions.checkNotNull(str);
        this.f10659c = str;
        this.f10657a = z;
        if (this.f10658b == Long.MAX_VALUE) {
            zzbo.mo3172r().v_().m12354a("Tasks index overflow");
        }
    }

    C2492r(zzbo zzbo, Runnable runnable, boolean z, String str) {
        this.f10660d = zzbo;
        super(runnable, false);
        Preconditions.checkNotNull(str);
        this.f10659c = str;
        this.f10657a = null;
        if (this.f10658b == Long.MAX_VALUE) {
            zzbo.mo3172r().v_().m12354a("Tasks index overflow");
        }
    }

    protected final void setException(Throwable th) {
        this.f10660d.mo3172r().v_().m12355a(this.f10659c, th);
        if (th instanceof zzbp) {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
        }
        super.setException(th);
    }

    public final /* synthetic */ int compareTo(Object obj) {
        C2492r c2492r = (C2492r) obj;
        if (this.f10657a != c2492r.f10657a) {
            return this.f10657a != null ? -1 : 1;
        } else {
            if (this.f10658b < c2492r.f10658b) {
                return -1;
            }
            if (this.f10658b > c2492r.f10658b) {
                return 1;
            }
            this.f10660d.mo3172r().m28538g().m12355a("Two tasks share the same index. index", Long.valueOf(this.f10658b));
            return null;
        }
    }
}
