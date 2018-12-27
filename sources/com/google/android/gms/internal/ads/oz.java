package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;

final class oz implements zzcx {
    /* renamed from: a */
    private final /* synthetic */ Activity f16594a;

    oz(os osVar, Activity activity) {
        this.f16594a = activity;
    }

    /* renamed from: a */
    public final void mo2160a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.f16594a);
    }
}
