package com.crashlytics.android.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.crashlytics.android.core.s */
class C1396s {
    /* renamed from: a */
    private static final IntentFilter f4361a = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    /* renamed from: b */
    private static final IntentFilter f4362b = new IntentFilter("android.intent.action.ACTION_POWER_CONNECTED");
    /* renamed from: c */
    private static final IntentFilter f4363c = new IntentFilter("android.intent.action.ACTION_POWER_DISCONNECTED");
    /* renamed from: d */
    private final AtomicBoolean f4364d = new AtomicBoolean(false);
    /* renamed from: e */
    private final Context f4365e;
    /* renamed from: f */
    private final BroadcastReceiver f4366f = new C13952(this);
    /* renamed from: g */
    private final BroadcastReceiver f4367g = new C13941(this);
    /* renamed from: h */
    private boolean f4368h;

    /* renamed from: com.crashlytics.android.core.s$1 */
    class C13941 extends BroadcastReceiver {
        /* renamed from: a */
        final /* synthetic */ C1396s f4359a;

        C13941(C1396s c1396s) {
            this.f4359a = c1396s;
        }

        public void onReceive(Context context, Intent intent) {
            this.f4359a.f4368h = true;
        }
    }

    /* renamed from: com.crashlytics.android.core.s$2 */
    class C13952 extends BroadcastReceiver {
        /* renamed from: a */
        final /* synthetic */ C1396s f4360a;

        C13952(C1396s c1396s) {
            this.f4360a = c1396s;
        }

        public void onReceive(Context context, Intent intent) {
            this.f4360a.f4368h = null;
        }
    }

    public C1396s(Context context) {
        this.f4365e = context;
    }

    /* renamed from: a */
    public void m5668a() {
        boolean z = true;
        if (!this.f4364d.getAndSet(true)) {
            Intent registerReceiver = this.f4365e.registerReceiver(null, f4361a);
            int i = -1;
            if (registerReceiver != null) {
                i = registerReceiver.getIntExtra("status", -1);
            }
            if (i != 2) {
                if (i != 5) {
                    z = false;
                }
            }
            this.f4368h = z;
            this.f4365e.registerReceiver(this.f4367g, f4362b);
            this.f4365e.registerReceiver(this.f4366f, f4363c);
        }
    }

    /* renamed from: b */
    public boolean m5669b() {
        return this.f4368h;
    }

    /* renamed from: c */
    public void m5670c() {
        if (this.f4364d.getAndSet(false)) {
            this.f4365e.unregisterReceiver(this.f4367g);
            this.f4365e.unregisterReceiver(this.f4366f);
        }
    }
}
