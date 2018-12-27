package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;

final class qg implements zzgf {
    /* renamed from: a */
    private final /* synthetic */ Activity f16617a;

    qg(pz pzVar, Activity activity) {
        this.f16617a = activity;
    }

    /* renamed from: a */
    public final void mo2164a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.f16617a);
    }
}
