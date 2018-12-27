package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;

final class qb implements zzgf {
    /* renamed from: a */
    private final /* synthetic */ Activity f16611a;

    qb(pz pzVar, Activity activity) {
        this.f16611a = activity;
    }

    /* renamed from: a */
    public final void mo2164a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.f16611a);
    }
}
