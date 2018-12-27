package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;

final class qc implements zzgf {
    /* renamed from: a */
    private final /* synthetic */ Activity f16612a;

    qc(pz pzVar, Activity activity) {
        this.f16612a = activity;
    }

    /* renamed from: a */
    public final void mo2164a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.f16612a);
    }
}
