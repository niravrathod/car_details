package com.crashlytics.android.core;

import android.text.TextUtils;
import com.crashlytics.android.core.j.AnonymousClass13;
import java.util.HashMap;

class CrashlyticsController$20$1 extends HashMap<String, Object> {
    final /* synthetic */ AnonymousClass13 this$1;

    CrashlyticsController$20$1(AnonymousClass13 anonymousClass13) {
        this.this$1 = anonymousClass13;
        put("app_identifier", this.this$1.f14702a);
        put("api_key", this.this$1.f14707f.f4338p.f4231a);
        put("version_code", this.this$1.f14703b);
        put("version_name", this.this$1.f14704c);
        put("install_uuid", this.this$1.f14705d);
        put("delivery_mechanism", Integer.valueOf(this.this$1.f14706e));
        put("unity_version", TextUtils.isEmpty(this.this$1.f14707f.f4345w) ? "" : this.this$1.f14707f.f4345w);
    }
}
