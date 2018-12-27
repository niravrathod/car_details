package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;

final class ow implements zzcx {
    /* renamed from: a */
    private final /* synthetic */ Activity f16590a;

    ow(os osVar, Activity activity) {
        this.f16590a = activity;
    }

    /* renamed from: a */
    public final void mo2160a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.f16590a);
    }
}
