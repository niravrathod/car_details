package com.google.firebase.iid;

import android.content.BroadcastReceiver.PendingResult;
import android.content.Intent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class ad {
    /* renamed from: a */
    final Intent f10993a;
    /* renamed from: b */
    private final PendingResult f10994b;
    /* renamed from: c */
    private boolean f10995c = false;
    /* renamed from: d */
    private final ScheduledFuture<?> f10996d;

    ad(Intent intent, PendingResult pendingResult, ScheduledExecutorService scheduledExecutorService) {
        this.f10993a = intent;
        this.f10994b = pendingResult;
        this.f10996d = scheduledExecutorService.schedule(new ae(this, intent), 9000, TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    final synchronized void m12694a() {
        if (!this.f10995c) {
            this.f10994b.finish();
            this.f10996d.cancel(false);
            this.f10995c = true;
        }
    }
}
