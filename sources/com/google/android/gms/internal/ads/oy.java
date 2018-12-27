package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

final class oy implements zzcx {
    /* renamed from: a */
    private final /* synthetic */ Activity f16592a;
    /* renamed from: b */
    private final /* synthetic */ Bundle f16593b;

    oy(os osVar, Activity activity, Bundle bundle) {
        this.f16592a = activity;
        this.f16593b = bundle;
    }

    /* renamed from: a */
    public final void mo2160a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f16592a, this.f16593b);
    }
}
