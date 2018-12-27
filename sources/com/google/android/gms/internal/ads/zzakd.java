package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.concurrent.GuardedBy;

@zzaer
public final class zzakd {
    /* renamed from: a */
    private final AtomicReference<ThreadPoolExecutor> f8749a = new AtomicReference(null);
    /* renamed from: b */
    private final Object f8750b = new Object();
    @GuardedBy("mGmpAppIdLock")
    /* renamed from: c */
    private String f8751c = null;
    @GuardedBy("mGmpAppIdLock")
    /* renamed from: d */
    private String f8752d = null;
    @VisibleForTesting
    /* renamed from: e */
    private final AtomicBoolean f8753e = new AtomicBoolean(false);
    @VisibleForTesting
    /* renamed from: f */
    private final AtomicInteger f8754f = new AtomicInteger(-1);
    /* renamed from: g */
    private final AtomicReference<Object> f8755g = new AtomicReference(null);
    /* renamed from: h */
    private final AtomicReference<Object> f8756h = new AtomicReference(null);
    /* renamed from: i */
    private ConcurrentMap<String, Method> f8757i = new ConcurrentHashMap(9);
    /* renamed from: j */
    private final AtomicReference<zzauk> f8758j = new AtomicReference(null);
    @GuardedBy("proxyReference")
    /* renamed from: k */
    private final List<FutureTask> f8759k = new ArrayList();

    /* renamed from: a */
    public final boolean m9668a(Context context) {
        if (((Boolean) zzkd.m10713e().m10897a(zznw.ab)).booleanValue()) {
            if (!this.f8753e.get()) {
                if (((Boolean) zzkd.m10713e().m10897a(zznw.ai)).booleanValue()) {
                    return true;
                }
                if (this.f8754f.get() == -1) {
                    zzkd.m10709a();
                    if (!zzaoa.m9969c(context, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE)) {
                        zzkd.m10709a();
                        if (zzaoa.m9968c(context) != null) {
                            zzaok.m10007e("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                            this.f8754f.set(0);
                        }
                    }
                    this.f8754f.set(1);
                }
                if (this.f8754f.get() == 1) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void m9665a(Context context, String str) {
        if (m9668a(context)) {
            m9660b(context, str, "beginAdUnitExposure");
        }
    }

    /* renamed from: b */
    public final void m9670b(Context context, String str) {
        if (m9668a(context)) {
            m9660b(context, str, "endAdUnitExposure");
        }
    }

    /* renamed from: b */
    public final String m9669b(Context context) {
        if (!m9668a(context)) {
            return "";
        }
        if (!m9659a(context, "com.google.android.gms.measurement.AppMeasurement", this.f8755g, true)) {
            return "";
        }
        try {
            String str = (String) m9663h(context, "getCurrentScreenName").invoke(this.f8755g.get(), new Object[0]);
            if (str == null) {
                str = (String) m9663h(context, "getCurrentScreenClass").invoke(this.f8755g.get(), new Object[0]);
            }
            return str != null ? str : "";
        } catch (Exception e) {
            m9658a(e, "getCurrentScreenName", false);
            return "";
        }
    }

    /* renamed from: c */
    public final void m9672c(Context context, String str) {
        if (m9668a(context) && (context instanceof Activity) && m9659a(context, "com.google.firebase.analytics.FirebaseAnalytics", this.f8756h, false)) {
            Method i = m9664i(context, "setCurrentScreen");
            try {
                Activity activity = (Activity) context;
                i.invoke(this.f8756h.get(), new Object[]{activity, str, context.getPackageName()});
            } catch (Exception e) {
                m9658a(e, "setCurrentScreen", false);
            }
        }
    }

    /* renamed from: c */
    public final String m9671c(Context context) {
        if (!m9668a(context)) {
            return null;
        }
        synchronized (this.f8750b) {
            if (this.f8751c != null) {
                context = this.f8751c;
                return context;
            }
            this.f8751c = (String) m9656a("getGmpAppId", context);
            context = this.f8751c;
            return context;
        }
    }

    /* renamed from: d */
    public final String m9673d(Context context) {
        if (!m9668a(context)) {
            return null;
        }
        long longValue = ((Long) zzkd.m10713e().m10897a(zznw.ag)).longValue();
        if (longValue < 0) {
            return (String) m9656a("getAppInstanceId", context);
        }
        if (this.f8749a.get() == null) {
            this.f8749a.compareAndSet(null, new ThreadPoolExecutor(((Integer) zzkd.m10713e().m10897a(zznw.ah)).intValue(), ((Integer) zzkd.m10713e().m10897a(zznw.ah)).intValue(), 1, TimeUnit.MINUTES, new LinkedBlockingQueue(), new cp(this)));
        }
        context = ((ThreadPoolExecutor) this.f8749a.get()).submit(new co(this, context));
        try {
            return (String) context.get(longValue, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            context.cancel(true);
            if ((e instanceof TimeoutException) != null) {
                return "TIME_OUT";
            }
            return null;
        }
    }

    /* renamed from: e */
    public final String m9675e(Context context) {
        if (!m9668a(context)) {
            return null;
        }
        context = m9656a("generateEventId", context);
        if (context != null) {
            return context.toString();
        }
        return null;
    }

    /* renamed from: f */
    public final String m9677f(Context context) {
        if (m9668a(context) == null) {
            return null;
        }
        synchronized (this.f8750b) {
            if (this.f8752d != null) {
                String str = this.f8752d;
                return str;
            }
            this.f8752d = "fa";
            str = this.f8752d;
            return str;
        }
    }

    /* renamed from: d */
    public final void m9674d(Context context, String str) {
        m9666a(context, "_ac", str);
    }

    /* renamed from: e */
    public final void m9676e(Context context, String str) {
        m9666a(context, "_ai", str);
    }

    /* renamed from: f */
    public final void m9678f(Context context, String str) {
        m9666a(context, "_aq", str);
    }

    /* renamed from: a */
    public final void m9667a(Context context, String str, String str2, String str3, int i) {
        if (m9668a(context)) {
            Bundle a = m9655a(str, false);
            a.putString("_ai", str2);
            a.putString("type", str3);
            a.putInt("value", i);
            m9657a(context, "_ar", a);
            str = new StringBuilder(String.valueOf(str3).length() + 75);
            str.append("Log a Firebase reward video event, reward type: ");
            str.append(str3);
            str.append(", reward value: ");
            str.append(i);
            zzalg.m21225a(str.toString());
        }
    }

    /* renamed from: a */
    public final void m9666a(Context context, String str, String str2) {
        if (m9668a(context)) {
            m9657a(context, str, m9655a(str2, "_ac".equals(str)));
        }
    }

    /* renamed from: a */
    private final void m9657a(Context context, String str, Bundle bundle) {
        if (m9668a(context) && m9659a(context, "com.google.android.gms.measurement.AppMeasurement", this.f8755g, true)) {
            context = m9662h(context);
            try {
                context.invoke(this.f8755g.get(), new Object[]{"am", str, bundle});
            } catch (Exception e) {
                m9658a(e, "logEventInternal", true);
            }
        }
    }

    /* renamed from: a */
    private static Bundle m9655a(String str, boolean z) {
        Bundle bundle = new Bundle();
        try {
            bundle.putLong("_aeid", Long.parseLong(str));
        } catch (Throwable e) {
            String str2 = "Invalid event ID: ";
            str = String.valueOf(str);
            zzaok.m10002b(str.length() == 0 ? new String(str2) : str2.concat(str), e);
        }
        if (z) {
            bundle.putInt("_r", true);
        }
        return bundle;
    }

    /* renamed from: h */
    private final Method m9662h(Context context) {
        Method method = (Method) this.f8757i.get("logEventInternal");
        if (method != null) {
            return method;
        }
        try {
            context = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", new Class[]{String.class, String.class, Bundle.class});
            this.f8757i.put("logEventInternal", context);
            return context;
        } catch (Exception e) {
            m9658a(e, "logEventInternal", true);
            return null;
        }
    }

    /* renamed from: g */
    private final Method m9661g(Context context, String str) {
        Method method = (Method) this.f8757i.get(str);
        if (method != null) {
            return method;
        }
        try {
            context = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[]{String.class});
            this.f8757i.put(str, context);
            return context;
        } catch (Exception e) {
            m9658a(e, str, false);
            return null;
        }
    }

    /* renamed from: h */
    private final Method m9663h(Context context, String str) {
        Method method = (Method) this.f8757i.get(str);
        if (method != null) {
            return method;
        }
        try {
            context = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[0]);
            this.f8757i.put(str, context);
            return context;
        } catch (Exception e) {
            m9658a(e, str, false);
            return null;
        }
    }

    /* renamed from: i */
    private final Method m9664i(Context context, String str) {
        Method method = (Method) this.f8757i.get(str);
        if (method != null) {
            return method;
        }
        try {
            context = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod(str, new Class[]{Activity.class, String.class, String.class});
            this.f8757i.put(str, context);
            return context;
        } catch (Exception e) {
            m9658a(e, str, false);
            return null;
        }
    }

    /* renamed from: b */
    private final void m9660b(Context context, String str, String str2) {
        if (m9659a(context, "com.google.android.gms.measurement.AppMeasurement", this.f8755g, true)) {
            context = m9661g(context, str2);
            try {
                context.invoke(this.f8755g.get(), new Object[]{str});
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(str2).length() + 37) + String.valueOf(str).length());
                stringBuilder.append("Invoke Firebase method ");
                stringBuilder.append(str2);
                stringBuilder.append(", Ad Unit Id: ");
                stringBuilder.append(str);
                zzalg.m21225a(stringBuilder.toString());
            } catch (Exception e) {
                m9658a(e, str2, false);
            }
        }
    }

    /* renamed from: a */
    private final Object m9656a(String str, Context context) {
        if (!m9659a(context, "com.google.android.gms.measurement.AppMeasurement", this.f8755g, true)) {
            return null;
        }
        try {
            context = m9663h(context, str).invoke(this.f8755g.get(), new Object[0]);
        } catch (Exception e) {
            m9658a(e, str, true);
            context = null;
        }
        return context;
    }

    /* renamed from: a */
    private final void m9658a(Exception exception, String str, boolean z) {
        if (this.f8753e.get() == null) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 30);
            stringBuilder.append("Invoke Firebase method ");
            stringBuilder.append(str);
            stringBuilder.append(" error.");
            zzaok.m10007e(stringBuilder.toString());
            if (z) {
                zzaok.m10007e("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
                this.f8753e.set(true);
            }
        }
    }

    /* renamed from: a */
    private final boolean m9659a(Context context, String str, AtomicReference<Object> atomicReference, boolean z) {
        if (atomicReference.get() == null) {
            try {
                atomicReference.compareAndSet(null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke(null, new Object[]{context}));
            } catch (Exception e) {
                m9658a(e, "getInstance", z);
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    final /* synthetic */ String m9679g(Context context) {
        return (String) m9656a("getAppInstanceId", context);
    }
}
