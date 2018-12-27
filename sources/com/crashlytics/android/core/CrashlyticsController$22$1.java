package com.crashlytics.android.core;

import android.os.Build.VERSION;
import com.crashlytics.android.core.j.AnonymousClass15;
import java.util.HashMap;

class CrashlyticsController$22$1 extends HashMap<String, Object> {
    final /* synthetic */ AnonymousClass15 this$1;

    CrashlyticsController$22$1(AnonymousClass15 anonymousClass15) {
        this.this$1 = anonymousClass15;
        put("version", VERSION.RELEASE);
        put("build_version", VERSION.CODENAME);
        put("is_rooted", Boolean.valueOf(this.this$1.f14710a));
    }
}
