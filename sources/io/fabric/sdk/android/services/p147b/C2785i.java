package io.fabric.sdk.android.services.p147b;

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;

/* renamed from: io.fabric.sdk.android.services.b.i */
public class C2785i implements Runnable {
    /* renamed from: a */
    private final Context f11837a;
    /* renamed from: b */
    private final C2783e f11838b;

    public C2785i(Context context, C2783e c2783e) {
        this.f11837a = context;
        this.f11838b = c2783e;
    }

    public void run() {
        try {
            CommonUtils.m13610a(this.f11837a, "Performing time based file roll over.");
            if (!this.f11838b.mo3915c()) {
                this.f11838b.mo3916d();
            }
        } catch (Throwable e) {
            CommonUtils.m13611a(this.f11837a, "Failed to roll over file", e);
        }
    }
}
