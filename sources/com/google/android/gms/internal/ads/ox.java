package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;

final class ox implements zzcx {
    /* renamed from: a */
    private final /* synthetic */ Activity f16591a;

    ox(os osVar, Activity activity) {
        this.f16591a = activity;
    }

    /* renamed from: a */
    public final void mo2160a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.f16591a);
    }
}
