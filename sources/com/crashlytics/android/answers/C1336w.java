package com.crashlytics.android.answers;

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.crashlytics.android.answers.w */
class C1336w {
    /* renamed from: a */
    private final Context f4203a;
    /* renamed from: b */
    private final IdManager f4204b;
    /* renamed from: c */
    private final String f4205c;
    /* renamed from: d */
    private final String f4206d;

    public C1336w(Context context, IdManager idManager, String str, String str2) {
        this.f4203a = context;
        this.f4204b = idManager;
        this.f4205c = str;
        this.f4206d = str2;
    }

    /* renamed from: a */
    public C1335u m5386a() {
        Map h = this.f4204b.m13655h();
        return new C1335u(this.f4204b.m13650c(), UUID.randomUUID().toString(), this.f4204b.m13649b(), this.f4204b.m13657j(), (String) h.get(DeviceIdentifierType.FONT_TOKEN), CommonUtils.m13637m(this.f4203a), this.f4204b.m13651d(), this.f4204b.m13654g(), this.f4205c, this.f4206d);
    }
}
