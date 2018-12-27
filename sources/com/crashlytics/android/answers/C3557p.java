package com.crashlytics.android.answers;

import android.content.Context;
import io.fabric.sdk.android.services.common.C2799j;
import io.fabric.sdk.android.services.p147b.C2780b;
import io.fabric.sdk.android.services.p147b.C2781c;
import io.fabric.sdk.android.services.settings.C2839b;
import java.util.UUID;

/* renamed from: com.crashlytics.android.answers.p */
class C3557p extends C2780b<SessionEvent> {
    /* renamed from: g */
    private C2839b f14655g;

    C3557p(Context context, C3563v c3563v, C2799j c2799j, C2781c c2781c) {
        super(context, c3563v, c2799j, c2781c, 100);
    }

    /* renamed from: a */
    protected String mo1112a() {
        UUID randomUUID = UUID.randomUUID();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("sa");
        stringBuilder.append("_");
        stringBuilder.append(randomUUID.toString());
        stringBuilder.append("_");
        stringBuilder.append(this.c.mo3580a());
        stringBuilder.append(".tap");
        return stringBuilder.toString();
    }

    /* renamed from: b */
    protected int mo1113b() {
        return this.f14655g == null ? super.mo1113b() : this.f14655g.f11997e;
    }

    /* renamed from: c */
    protected int mo1114c() {
        return this.f14655g == null ? super.mo1114c() : this.f14655g.f11995c;
    }

    /* renamed from: a */
    void m18045a(C2839b c2839b) {
        this.f14655g = c2839b;
    }
}
