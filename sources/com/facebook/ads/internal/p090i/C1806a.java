package com.facebook.ads.internal.p090i;

import android.content.Context;
import android.util.Log;
import com.facebook.ads.internal.p087f.C1793c;
import com.facebook.ads.internal.p093l.C1820a;

/* renamed from: com.facebook.ads.internal.i.a */
public class C1806a {
    /* renamed from: a */
    private static final String f5468a = "com.facebook.ads.internal.i.a";
    /* renamed from: b */
    private static C1806a f5469b = null;
    /* renamed from: c */
    private static boolean f5470c = false;
    /* renamed from: d */
    private Context f5471d;

    private C1806a(Context context) {
        this.f5471d = context;
    }

    /* renamed from: a */
    public static C1806a m6805a(Context context) {
        if (f5469b == null) {
            context = context.getApplicationContext();
            synchronized (context) {
                if (f5469b == null) {
                    f5469b = new C1806a(context);
                }
            }
        }
        return f5469b;
    }

    /* renamed from: a */
    public synchronized void m6806a() {
        if (!f5470c) {
            if (C1820a.m6853h(this.f5471d)) {
                try {
                    Thread.setDefaultUncaughtExceptionHandler(new C1793c(Thread.getDefaultUncaughtExceptionHandler(), this.f5471d, new C1809c(this.f5471d, false).m6817a()));
                } catch (Throwable e) {
                    Log.e(f5468a, "No permissions to set the default uncaught exception handler", e);
                }
            }
            f5470c = true;
        }
    }
}
