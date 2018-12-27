package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

@TargetApi(14)
final class bb implements ActivityLifecycleCallbacks {
    /* renamed from: a */
    private final /* synthetic */ zzcs f10487a;

    private bb(zzcs zzcs) {
        this.f10487a = zzcs;
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            this.f10487a.mo3172r().m28555x().m12354a("onActivityCreated");
            Intent intent = activity.getIntent();
            if (intent != null) {
                Uri data = intent.getData();
                if (data != null && data.isHierarchical()) {
                    if (bundle == null) {
                        Bundle a = this.f10487a.mo4398p().m28611a(data);
                        this.f10487a.mo4398p();
                        String str = zzfk.m28593a(intent) ? "gs" : "auto";
                        if (a != null) {
                            this.f10487a.m29583a(str, "_cmp", a);
                        }
                    }
                    Object queryParameter = data.getQueryParameter("referrer");
                    if (!TextUtils.isEmpty(queryParameter)) {
                        Object obj = (queryParameter.contains("gclid") && (queryParameter.contains("utm_campaign") || queryParameter.contains("utm_source") || queryParameter.contains("utm_medium") || queryParameter.contains("utm_term") || queryParameter.contains("utm_content"))) ? 1 : null;
                        if (obj == null) {
                            this.f10487a.mo3172r().m28554w().m12354a("Activity created with data 'referrer' param without gclid and at least one utm field");
                            return;
                        }
                        this.f10487a.mo3172r().m28554w().m12355a("Activity created with referrer", queryParameter);
                        if (!TextUtils.isEmpty(queryParameter)) {
                            this.f10487a.m29587a("auto", "_ldl", queryParameter, true);
                        }
                    } else {
                        return;
                    }
                }
            }
        } catch (Exception e) {
            this.f10487a.mo3172r().v_().m12355a("Throwable caught in onActivityCreated", e);
        }
        this.f10487a.mo4845i().m29627a(activity, bundle);
    }

    public final void onActivityDestroyed(Activity activity) {
        this.f10487a.mo4845i().m29634c(activity);
    }

    public final void onActivityPaused(Activity activity) {
        this.f10487a.mo4845i().m29631b(activity);
        activity = this.f10487a.mo4847k();
        activity.mo3171q().m28568a(new cc(activity, activity.mo3169m().elapsedRealtime()));
    }

    public final void onActivityResumed(Activity activity) {
        this.f10487a.mo4845i().m29626a(activity);
        activity = this.f10487a.mo4847k();
        activity.mo3171q().m28568a(new cb(activity, activity.mo3169m().elapsedRealtime()));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f10487a.mo4845i().m29632b(activity, bundle);
    }
}
