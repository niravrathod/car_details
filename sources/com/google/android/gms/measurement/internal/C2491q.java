package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: com.google.android.gms.measurement.internal.q */
final class C2491q implements UncaughtExceptionHandler {
    /* renamed from: a */
    private final String f10655a;
    /* renamed from: b */
    private final /* synthetic */ zzbo f10656b;

    public C2491q(zzbo zzbo, String str) {
        this.f10656b = zzbo;
        Preconditions.checkNotNull(str);
        this.f10655a = str;
    }

    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f10656b.mo3172r().v_().m12355a(this.f10655a, th);
    }
}
