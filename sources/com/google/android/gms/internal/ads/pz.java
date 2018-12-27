package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import java.lang.ref.WeakReference;

final class pz implements ActivityLifecycleCallbacks {
    /* renamed from: a */
    private final Application f8333a;
    /* renamed from: b */
    private final WeakReference<ActivityLifecycleCallbacks> f8334b;
    /* renamed from: c */
    private boolean f8335c = false;

    public pz(Application application, ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f8334b = new WeakReference(activityLifecycleCallbacks);
        this.f8333a = application;
    }

    /* renamed from: a */
    private final void m9356a(zzgf zzgf) {
        try {
            ActivityLifecycleCallbacks activityLifecycleCallbacks = (ActivityLifecycleCallbacks) this.f8334b.get();
            if (activityLifecycleCallbacks != null) {
                zzgf.mo2164a(activityLifecycleCallbacks);
                return;
            }
            if (this.f8335c == null) {
                this.f8333a.unregisterActivityLifecycleCallbacks(this);
                this.f8335c = true;
            }
        } catch (zzgf zzgf2) {
            zzaok.m10002b("Error while dispatching lifecycle callback.", zzgf2);
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m9356a(new qa(this, activity, bundle));
    }

    public final void onActivityStarted(Activity activity) {
        m9356a(new qb(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        m9356a(new qc(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        m9356a(new qd(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        m9356a(new qe(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m9356a(new qf(this, activity, bundle));
    }

    public final void onActivityDestroyed(Activity activity) {
        m9356a(new qg(this, activity));
    }
}
