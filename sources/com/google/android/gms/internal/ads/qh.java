package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.zzbv;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;

@TargetApi(14)
final class qh implements ActivityLifecycleCallbacks {
    /* renamed from: a */
    private Activity f8336a;
    /* renamed from: b */
    private Context f8337b;
    /* renamed from: c */
    private final Object f8338c = new Object();
    /* renamed from: d */
    private boolean f8339d = true;
    /* renamed from: e */
    private boolean f8340e = false;
    @GuardedBy("mLock")
    /* renamed from: f */
    private final List<zzgm> f8341f = new ArrayList();
    @GuardedBy("mLock")
    /* renamed from: g */
    private final List<zzgz> f8342g = new ArrayList();
    /* renamed from: h */
    private Runnable f8343h;
    /* renamed from: i */
    private boolean f8344i = false;
    /* renamed from: j */
    private long f8345j;

    qh() {
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    /* renamed from: a */
    public final void m9364a(Application application, Context context) {
        if (!this.f8344i) {
            application.registerActivityLifecycleCallbacks(this);
            if (context instanceof Activity) {
                m9358a((Activity) context);
            }
            this.f8337b = application;
            this.f8345j = ((Long) zzkd.m10713e().m10897a(zznw.at)).longValue();
            this.f8344i = true;
        }
    }

    /* renamed from: a */
    public final void m9365a(zzgm zzgm) {
        synchronized (this.f8338c) {
            this.f8341f.add(zzgm);
        }
    }

    /* renamed from: a */
    public final Activity m9363a() {
        return this.f8336a;
    }

    /* renamed from: b */
    public final Context m9366b() {
        return this.f8337b;
    }

    public final void onActivityStarted(Activity activity) {
        m9358a(activity);
    }

    public final void onActivityResumed(Activity activity) {
        m9358a(activity);
        this.f8340e = false;
        int i = this.f8339d ^ 1;
        this.f8339d = true;
        if (this.f8343h != null) {
            zzalo.f8872a.removeCallbacks(this.f8343h);
        }
        synchronized (this.f8338c) {
            for (zzgz a : this.f8342g) {
                try {
                    a.m10655a(activity);
                } catch (Throwable e) {
                    zzbv.zzeo().m9714a(e, "AppActivityTracker.ActivityListener.onActivityResumed");
                    zzaok.m10002b("", e);
                }
            }
            if (i != 0) {
                for (zzgm a2 : this.f8341f) {
                    try {
                        a2.mo2165a(true);
                    } catch (Throwable e2) {
                        zzaok.m10002b("", e2);
                    }
                }
            } else {
                zzaok.m10001b("App is still foreground.");
            }
        }
    }

    public final void onActivityPaused(Activity activity) {
        m9358a(activity);
        synchronized (this.f8338c) {
            for (zzgz b : this.f8342g) {
                try {
                    b.m10656b(activity);
                } catch (Throwable e) {
                    zzbv.zzeo().m9714a(e, "AppActivityTracker.ActivityListener.onActivityPaused");
                    zzaok.m10002b("", e);
                }
            }
        }
        this.f8340e = true;
        if (this.f8343h != null) {
            zzalo.f8872a.removeCallbacks(this.f8343h);
        }
        activity = zzalo.f8872a;
        Runnable qiVar = new qi(this);
        this.f8343h = qiVar;
        activity.postDelayed(qiVar, this.f8345j);
    }

    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.f8338c) {
            if (this.f8336a == null) {
                return;
            }
            if (this.f8336a.equals(activity)) {
                this.f8336a = null;
            }
            Iterator it = this.f8342g.iterator();
            while (it.hasNext()) {
                try {
                    if (((zzgz) it.next()).m10657c(activity)) {
                        it.remove();
                    }
                } catch (Throwable e) {
                    zzbv.zzeo().m9714a(e, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                    zzaok.m10002b("", e);
                }
            }
        }
    }

    /* renamed from: a */
    private final void m9358a(Activity activity) {
        synchronized (this.f8338c) {
            if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                this.f8336a = activity;
            }
        }
    }
}
