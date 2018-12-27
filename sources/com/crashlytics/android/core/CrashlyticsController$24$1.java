package com.crashlytics.android.core;

import android.os.Build;
import com.crashlytics.android.core.j.AnonymousClass17;
import java.util.HashMap;

class CrashlyticsController$24$1 extends HashMap<String, Object> {
    final /* synthetic */ AnonymousClass17 this$1;

    CrashlyticsController$24$1(AnonymousClass17 anonymousClass17) {
        this.this$1 = anonymousClass17;
        put("arch", Integer.valueOf(this.this$1.f14720a));
        put("build_model", Build.MODEL);
        put("available_processors", Integer.valueOf(this.this$1.f14721b));
        put("total_ram", Long.valueOf(this.this$1.f14722c));
        put("disk_space", Long.valueOf(this.this$1.f14723d));
        put("is_emulator", Boolean.valueOf(this.this$1.f14724e));
        put("ids", this.this$1.f14725f);
        put("state", Integer.valueOf(this.this$1.f14726g));
        put("build_manufacturer", Build.MANUFACTURER);
        put("build_product", Build.PRODUCT);
    }
}
