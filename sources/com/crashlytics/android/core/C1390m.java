package com.crashlytics.android.core;

import io.fabric.sdk.android.C2766c;
import io.fabric.sdk.android.services.settings.C2853s;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.crashlytics.android.core.m */
class C1390m implements UncaughtExceptionHandler {
    /* renamed from: a */
    private final C1388a f4351a;
    /* renamed from: b */
    private final C1389b f4352b;
    /* renamed from: c */
    private final boolean f4353c;
    /* renamed from: d */
    private final UncaughtExceptionHandler f4354d;
    /* renamed from: e */
    private final AtomicBoolean f4355e = new AtomicBoolean(null);

    /* renamed from: com.crashlytics.android.core.m$a */
    interface C1388a {
        /* renamed from: a */
        void mo1143a(C1389b c1389b, Thread thread, Throwable th, boolean z);
    }

    /* renamed from: com.crashlytics.android.core.m$b */
    interface C1389b {
        /* renamed from: a */
        C2853s mo1144a();
    }

    public C1390m(C1388a c1388a, C1389b c1389b, boolean z, UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f4351a = c1388a;
        this.f4352b = c1389b;
        this.f4353c = z;
        this.f4354d = uncaughtExceptionHandler;
    }

    public void uncaughtException(Thread thread, Throwable th) {
        this.f4355e.set(true);
        try {
            this.f4351a.mo1143a(this.f4352b, thread, th, this.f4353c);
        } catch (Throwable e) {
            C2766c.m13524h().mo3562e(CrashlyticsCore.TAG, "An error occurred in the uncaught exception handler", e);
        } catch (Throwable th2) {
            C2766c.m13524h().mo3554a(CrashlyticsCore.TAG, "Crashlytics completed exception processing. Invoking default exception handler.");
            this.f4354d.uncaughtException(thread, th);
            this.f4355e.set(false);
        }
        C2766c.m13524h().mo3554a(CrashlyticsCore.TAG, "Crashlytics completed exception processing. Invoking default exception handler.");
        this.f4354d.uncaughtException(thread, th);
        this.f4355e.set(false);
    }

    /* renamed from: a */
    boolean m5665a() {
        return this.f4355e.get();
    }
}
