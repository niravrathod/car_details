package com.crashlytics.android.answers;

import io.fabric.sdk.android.C2766c;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

class BackgroundManager {
    /* renamed from: a */
    final AtomicReference<ScheduledFuture<?>> f4139a = new AtomicReference();
    /* renamed from: b */
    boolean f4140b = true;
    /* renamed from: c */
    private final ScheduledExecutorService f4141c;
    /* renamed from: d */
    private final List<Listener> f4142d = new ArrayList();
    /* renamed from: e */
    private volatile boolean f4143e = true;

    /* renamed from: com.crashlytics.android.answers.BackgroundManager$1 */
    class C13171 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ BackgroundManager f4138a;

        C13171(BackgroundManager backgroundManager) {
            this.f4138a = backgroundManager;
        }

        public void run() {
            this.f4138a.f4139a.set(null);
            this.f4138a.m5352c();
        }
    }

    public interface Listener {
        void onBackground();
    }

    public BackgroundManager(ScheduledExecutorService scheduledExecutorService) {
        this.f4141c = scheduledExecutorService;
    }

    /* renamed from: a */
    public void m5355a(boolean z) {
        this.f4143e = z;
    }

    /* renamed from: c */
    private void m5352c() {
        for (Listener onBackground : this.f4142d) {
            onBackground.onBackground();
        }
    }

    /* renamed from: a */
    public void m5354a(Listener listener) {
        this.f4142d.add(listener);
    }

    /* renamed from: a */
    public void m5353a() {
        this.f4140b = false;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.f4139a.getAndSet(null);
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    /* renamed from: b */
    public void m5356b() {
        if (this.f4143e && !this.f4140b) {
            this.f4140b = true;
            try {
                this.f4139a.compareAndSet(null, this.f4141c.schedule(new C13171(this), 5000, TimeUnit.MILLISECONDS));
            } catch (Throwable e) {
                C2766c.m13524h().mo3555a(Answers.TAG, "Failed to schedule background detector", e);
            }
        }
    }
}
