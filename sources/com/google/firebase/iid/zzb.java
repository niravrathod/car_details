package com.google.firebase.iid;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.v4.content.WakefulBroadcastReceiver;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public abstract class zzb extends Service {
    /* renamed from: a */
    final ExecutorService f11076a;
    /* renamed from: b */
    private Binder f11077b;
    /* renamed from: c */
    private final Object f11078c;
    /* renamed from: d */
    private int f11079d;
    /* renamed from: e */
    private int f11080e;

    public zzb() {
        String str = "Firebase-";
        String valueOf = String.valueOf(getClass().getSimpleName());
        this.f11076a = Executors.newSingleThreadExecutor(new NamedThreadFactory(valueOf.length() != 0 ? str.concat(valueOf) : new String(str)));
        this.f11078c = new Object();
        this.f11080e = 0;
    }

    /* renamed from: a */
    protected Intent mo3317a(Intent intent) {
        return intent;
    }

    /* renamed from: b */
    public abstract void mo3318b(Intent intent);

    /* renamed from: c */
    public boolean mo3330c(Intent intent) {
        return false;
    }

    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3) != null) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.f11077b == null) {
            this.f11077b = new af(this);
        }
        return this.f11077b;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.f11078c) {
            this.f11079d = i2;
            this.f11080e++;
        }
        i = mo3317a(intent);
        if (i == 0) {
            m12801d(intent);
            return 2;
        } else if (mo3330c(i)) {
            m12801d(intent);
            return 2;
        } else {
            this.f11076a.execute(new ac(this, i, intent));
            return 3;
        }
    }

    /* renamed from: d */
    private final void m12801d(Intent intent) {
        if (intent != null) {
            WakefulBroadcastReceiver.m1400a(intent);
        }
        synchronized (this.f11078c) {
            this.f11080e--;
            if (this.f11080e == 0) {
                stopSelfResult(this.f11079d);
            }
        }
    }
}
