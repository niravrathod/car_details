package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

final class qf implements zzgf {
    /* renamed from: a */
    private final /* synthetic */ Activity f16615a;
    /* renamed from: b */
    private final /* synthetic */ Bundle f16616b;

    qf(pz pzVar, Activity activity, Bundle bundle) {
        this.f16615a = activity;
        this.f16616b = bundle;
    }

    /* renamed from: a */
    public final void mo2164a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f16615a, this.f16616b);
    }
}
