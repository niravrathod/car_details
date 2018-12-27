package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;

final class qe implements zzgf {
    /* renamed from: a */
    private final /* synthetic */ Activity f16614a;

    qe(pz pzVar, Activity activity) {
        this.f16614a = activity;
    }

    /* renamed from: a */
    public final void mo2164a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.f16614a);
    }
}
