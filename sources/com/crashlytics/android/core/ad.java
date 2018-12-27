package com.crashlytics.android.core;

import android.annotation.SuppressLint;
import io.fabric.sdk.android.services.p148c.C2787c;
import io.fabric.sdk.android.services.p148c.C4298d;

@SuppressLint({"CommitPrefEdits"})
class ad {
    /* renamed from: a */
    private final C2787c f4237a;
    /* renamed from: b */
    private final CrashlyticsCore f4238b;

    /* renamed from: a */
    public static ad m5469a(C2787c c2787c, CrashlyticsCore crashlyticsCore) {
        return new ad(c2787c, crashlyticsCore);
    }

    public ad(C2787c c2787c, CrashlyticsCore crashlyticsCore) {
        this.f4237a = c2787c;
        this.f4238b = crashlyticsCore;
    }

    /* renamed from: a */
    void m5470a(boolean z) {
        this.f4237a.mo3577a(this.f4237a.mo3578b().putBoolean("always_send_reports_opt_in", z));
    }

    /* renamed from: a */
    boolean m5471a() {
        if (!this.f4237a.mo3576a().contains("preferences_migration_complete")) {
            C2787c c4298d = new C4298d(this.f4238b);
            Object obj = (this.f4237a.mo3576a().contains("always_send_reports_opt_in") || !c4298d.mo3576a().contains("always_send_reports_opt_in")) ? null : 1;
            if (obj != null) {
                this.f4237a.mo3577a(this.f4237a.mo3578b().putBoolean("always_send_reports_opt_in", c4298d.mo3576a().getBoolean("always_send_reports_opt_in", false)));
            }
            this.f4237a.mo3577a(this.f4237a.mo3578b().putBoolean("preferences_migration_complete", true));
        }
        return this.f4237a.mo3576a().getBoolean("always_send_reports_opt_in", false);
    }
}
