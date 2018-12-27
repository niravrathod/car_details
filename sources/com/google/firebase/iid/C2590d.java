package com.google.firebase.iid;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.firebase.iid.d */
public final class C2590d {
    @GuardedBy("MessengerIpcClient.class")
    /* renamed from: a */
    private static C2590d f11021a;
    /* renamed from: b */
    private final Context f11022b;
    /* renamed from: c */
    private final ScheduledExecutorService f11023c;
    @GuardedBy("this")
    /* renamed from: d */
    private C2592f f11024d = new C2592f();
    @GuardedBy("this")
    /* renamed from: e */
    private int f11025e = 1;

    /* renamed from: a */
    public static synchronized C2590d m12738a(Context context) {
        synchronized (C2590d.class) {
            if (f11021a == null) {
                f11021a = new C2590d(context, Executors.newSingleThreadScheduledExecutor(new NamedThreadFactory("MessengerIpcClient")));
            }
            context = f11021a;
        }
        return context;
    }

    private C2590d(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f11023c = scheduledExecutorService;
        this.f11022b = context.getApplicationContext();
    }

    /* renamed from: a */
    public final Task<Void> m12740a(int i, Bundle bundle) {
        return m12737a(new C4196l(m12735a(), 2, bundle));
    }

    /* renamed from: b */
    public final Task<Bundle> m12741b(int i, Bundle bundle) {
        return m12737a(new C4197n(m12735a(), 1, bundle));
    }

    /* renamed from: a */
    private final synchronized <T> Task<T> m12737a(C2598m<T> c2598m) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(c2598m);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 9);
            stringBuilder.append("Queueing ");
            stringBuilder.append(valueOf);
            Log.d("MessengerIpcClient", stringBuilder.toString());
        }
        if (!this.f11024d.m12747a((C2598m) c2598m)) {
            this.f11024d = new C2592f();
            this.f11024d.m12747a((C2598m) c2598m);
        }
        return c2598m.f11040b.m12417a();
    }

    /* renamed from: a */
    private final synchronized int m12735a() {
        int i;
        i = this.f11025e;
        this.f11025e = i + 1;
        return i;
    }
}
