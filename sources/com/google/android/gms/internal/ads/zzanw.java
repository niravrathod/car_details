package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;
import javax.annotation.concurrent.GuardedBy;

@zzaer
public final class zzanw {
    @GuardedBy("this")
    /* renamed from: a */
    private final BroadcastReceiver f8933a = new ef(this);
    @GuardedBy("this")
    /* renamed from: b */
    private final Map<BroadcastReceiver, IntentFilter> f8934b = new WeakHashMap();
    /* renamed from: c */
    private boolean f8935c = false;
    /* renamed from: d */
    private boolean f8936d;
    /* renamed from: e */
    private Context f8937e;

    /* renamed from: a */
    public final synchronized void m9939a(Context context) {
        if (!this.f8935c) {
            this.f8937e = context.getApplicationContext();
            if (this.f8937e == null) {
                this.f8937e = context;
            }
            zznw.m10901a(this.f8937e);
            this.f8936d = ((Boolean) zzkd.m10713e().m10897a(zznw.bC)).booleanValue();
            context = new IntentFilter();
            context.addAction("android.intent.action.SCREEN_ON");
            context.addAction("android.intent.action.SCREEN_OFF");
            context.addAction("android.intent.action.USER_PRESENT");
            this.f8937e.registerReceiver(this.f8933a, context);
            this.f8935c = true;
        }
    }

    /* renamed from: a */
    public final synchronized void m9941a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (this.f8936d) {
            this.f8934b.put(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter);
        }
    }

    /* renamed from: a */
    public final synchronized void m9940a(Context context, BroadcastReceiver broadcastReceiver) {
        if (this.f8936d) {
            this.f8934b.remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }

    /* renamed from: a */
    private final synchronized void m9937a(Context context, Intent intent) {
        for (Entry entry : this.f8934b.entrySet()) {
            if (((IntentFilter) entry.getValue()).hasAction(intent.getAction())) {
                ((BroadcastReceiver) entry.getKey()).onReceive(context, intent);
            }
        }
    }
}
