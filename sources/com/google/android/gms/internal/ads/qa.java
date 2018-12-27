package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

final class qa implements zzgf {
    /* renamed from: a */
    private final /* synthetic */ Activity f16609a;
    /* renamed from: b */
    private final /* synthetic */ Bundle f16610b;

    qa(pz pzVar, Activity activity, Bundle bundle) {
        this.f16609a = activity;
        this.f16610b = bundle;
    }

    /* renamed from: a */
    public final void mo2164a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f16609a, this.f16610b);
    }
}
