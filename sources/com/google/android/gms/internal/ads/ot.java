package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

final class ot implements zzcx {
    /* renamed from: a */
    private final /* synthetic */ Activity f16586a;
    /* renamed from: b */
    private final /* synthetic */ Bundle f16587b;

    ot(os osVar, Activity activity, Bundle bundle) {
        this.f16586a = activity;
        this.f16587b = bundle;
    }

    /* renamed from: a */
    public final void mo2160a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f16586a, this.f16587b);
    }
}
