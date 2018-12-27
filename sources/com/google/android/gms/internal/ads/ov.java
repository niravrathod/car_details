package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;

final class ov implements zzcx {
    /* renamed from: a */
    private final /* synthetic */ Activity f16589a;

    ov(os osVar, Activity activity) {
        this.f16589a = activity;
    }

    /* renamed from: a */
    public final void mo2160a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.f16589a);
    }
}
