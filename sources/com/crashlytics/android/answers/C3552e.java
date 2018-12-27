package com.crashlytics.android.answers;

import android.app.Activity;
import android.os.Bundle;
import io.fabric.sdk.android.C2764a.C2763b;

/* renamed from: com.crashlytics.android.answers.e */
class C3552e extends C2763b {
    /* renamed from: a */
    private final C3559s f14646a;
    /* renamed from: b */
    private final BackgroundManager f14647b;

    /* renamed from: a */
    public void mo1103a(Activity activity, Bundle bundle) {
    }

    /* renamed from: b */
    public void mo1105b(Activity activity, Bundle bundle) {
    }

    /* renamed from: e */
    public void mo1108e(Activity activity) {
    }

    public C3552e(C3559s c3559s, BackgroundManager backgroundManager) {
        this.f14646a = c3559s;
        this.f14647b = backgroundManager;
    }

    /* renamed from: a */
    public void mo1102a(Activity activity) {
        this.f14646a.m18052a(activity, Type.START);
    }

    /* renamed from: b */
    public void mo1104b(Activity activity) {
        this.f14646a.m18052a(activity, Type.RESUME);
        this.f14647b.m5353a();
    }

    /* renamed from: c */
    public void mo1106c(Activity activity) {
        this.f14646a.m18052a(activity, Type.PAUSE);
        this.f14647b.m5356b();
    }

    /* renamed from: d */
    public void mo1107d(Activity activity) {
        this.f14646a.m18052a(activity, Type.STOP);
    }
}
