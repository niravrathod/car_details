package com.facebook.ads.internal.p085d;

import android.content.Context;
import android.util.Log;
import com.facebook.ads.internal.p097p.p099b.C1884f;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: com.facebook.ads.internal.d.d */
public class C1782d {
    /* renamed from: a */
    private static final String f5374a = "d";
    /* renamed from: b */
    private static C1782d f5375b;
    /* renamed from: c */
    private final Future<C1884f> f5376c;

    private C1782d(final Context context) {
        this.f5376c = Executors.newSingleThreadExecutor().submit(new Callable<C1884f>(this) {
            /* renamed from: b */
            final /* synthetic */ C1782d f5373b;

            /* renamed from: a */
            public C1884f m6700a() {
                return new C1884f(context);
            }

            public /* synthetic */ Object call() {
                return m6700a();
            }
        });
    }

    /* renamed from: a */
    public static C1782d m6701a(Context context) {
        if (f5375b == null) {
            context = context.getApplicationContext();
            synchronized (C1782d.class) {
                if (f5375b == null) {
                    f5375b = new C1782d(context);
                }
            }
        }
        return f5375b;
    }

    /* renamed from: a */
    private C1884f m6702a() {
        try {
            return (C1884f) this.f5376c.get(500, TimeUnit.MILLISECONDS);
        } catch (Throwable e) {
            Log.e(f5374a, "Timed out waiting for cache server.", e);
            return null;
        }
    }

    /* renamed from: a */
    public boolean m6703a(String str) {
        C1884f a = m6702a();
        return a != null && a.m7183a(str);
    }

    /* renamed from: b */
    public String m6704b(String str) {
        C1884f a = m6702a();
        return a == null ? null : a.m7184b(str);
    }
}
