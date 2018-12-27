package com.crashlytics.android.answers;

import android.content.Context;
import android.os.Looper;
import io.fabric.sdk.android.services.common.C4308q;
import io.fabric.sdk.android.services.p147b.C4733g;
import io.fabric.sdk.android.services.p148c.C2786a;

/* renamed from: com.crashlytics.android.answers.d */
class C1329d {
    /* renamed from: a */
    final Context f4184a;
    /* renamed from: b */
    final C2786a f4185b;

    public C1329d(Context context, C2786a c2786a) {
        this.f4184a = context;
        this.f4185b = c2786a;
    }

    /* renamed from: a */
    public C3557p m5376a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return new C3557p(this.f4184a, new C3563v(), new C4308q(), new C4733g(this.f4184a, this.f4185b.mo3575a(), "session_analytics.tap", "session_analytics_to_send"));
        }
        throw new IllegalStateException("AnswersFilesManagerProvider cannot be called on the main thread");
    }
}
