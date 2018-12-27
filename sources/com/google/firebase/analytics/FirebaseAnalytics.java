package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Keep;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzbt;
import com.google.android.gms.measurement.internal.zzk;
import com.google.firebase.iid.FirebaseInstanceId;

public final class FirebaseAnalytics {
    /* renamed from: a */
    private static volatile FirebaseAnalytics f10907a;
    /* renamed from: b */
    private final zzbt f10908b;
    /* renamed from: c */
    private final Object f10909c = new Object();

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f10907a == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f10907a == null) {
                    f10907a = new FirebaseAnalytics(zzbt.m22702a(context, null));
                }
            }
        }
        return f10907a;
    }

    /* renamed from: a */
    public final void m12578a(String str, Bundle bundle) {
        this.f10908b.m22728i().m12213a(str, bundle);
    }

    /* renamed from: a */
    public final void m12579a(String str, String str2) {
        this.f10908b.m22728i().m12214a(str, str2);
    }

    @Keep
    public final void setCurrentScreen(Activity activity, String str, String str2) {
        if (zzk.m12390a()) {
            this.f10908b.m22742w().m29628a(activity, str, str2);
        } else {
            this.f10908b.mo3172r().m28540i().m12354a("setCurrentScreen must be called from the main thread");
        }
    }

    private FirebaseAnalytics(zzbt zzbt) {
        Preconditions.checkNotNull(zzbt);
        this.f10908b = zzbt;
    }

    @Keep
    public final String getFirebaseInstanceId() {
        return FirebaseInstanceId.m12658a().m12678c();
    }
}
