package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;

final class qd implements zzgf {
    /* renamed from: a */
    private final /* synthetic */ Activity f16613a;

    qd(pz pzVar, Activity activity) {
        this.f16613a = activity;
    }

    /* renamed from: a */
    public final void mo2164a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.f16613a);
    }
}
