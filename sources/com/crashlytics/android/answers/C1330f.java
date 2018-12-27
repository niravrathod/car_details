package com.crashlytics.android.answers;

import android.annotation.SuppressLint;
import android.content.Context;
import io.fabric.sdk.android.services.p148c.C2787c;
import io.fabric.sdk.android.services.p148c.C4298d;

/* renamed from: com.crashlytics.android.answers.f */
class C1330f {
    /* renamed from: a */
    private final C2787c f4186a;

    /* renamed from: a */
    public static C1330f m5377a(Context context) {
        return new C1330f(new C4298d(context, "settings"));
    }

    C1330f(C2787c c2787c) {
        this.f4186a = c2787c;
    }

    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: a */
    public void m5378a() {
        this.f4186a.mo3577a(this.f4186a.mo3578b().putBoolean("analytics_launched", true));
    }

    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: b */
    public boolean m5379b() {
        return this.f4186a.mo3576a().getBoolean("analytics_launched", false);
    }
}
