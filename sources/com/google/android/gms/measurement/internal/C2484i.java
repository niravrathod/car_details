package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

/* renamed from: com.google.android.gms.measurement.internal.i */
class C2484i extends BroadcastReceiver {
    @VisibleForTesting
    /* renamed from: a */
    private static final String f10635a = "com.google.android.gms.measurement.internal.i";
    /* renamed from: b */
    private final zzfa f10636b;
    /* renamed from: c */
    private boolean f10637c;
    /* renamed from: d */
    private boolean f10638d;

    C2484i(zzfa zzfa) {
        Preconditions.checkNotNull(zzfa);
        this.f10636b = zzfa;
    }

    public void onReceive(Context context, Intent intent) {
        this.f10636b.m22808i();
        context = intent.getAction();
        this.f10636b.mo3172r().m28555x().m12355a("NetworkBroadcastReceiver received action", context);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(context) != null) {
            Intent f = this.f10636b.m22800c().m29511f();
            if (this.f10638d != f) {
                this.f10638d = f;
                this.f10636b.mo3171q().m28568a(new C2485j(this, f));
            }
            return;
        }
        this.f10636b.mo3172r().m28540i().m12355a("NetworkBroadcastReceiver received unknown action", context);
    }

    /* renamed from: a */
    public final void m12318a() {
        this.f10636b.m22808i();
        this.f10636b.mo3171q().mo4395d();
        if (!this.f10637c) {
            this.f10636b.mo3170n().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f10638d = this.f10636b.m22800c().m29511f();
            this.f10636b.mo3172r().m28555x().m12355a("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f10638d));
            this.f10637c = true;
        }
    }

    /* renamed from: b */
    public final void m12319b() {
        this.f10636b.m22808i();
        this.f10636b.mo3171q().mo4395d();
        this.f10636b.mo3171q().mo4395d();
        if (this.f10637c) {
            this.f10636b.mo3172r().m28555x().m12354a("Unregistering connectivity change receiver");
            this.f10637c = false;
            this.f10638d = false;
            try {
                this.f10636b.mo3170n().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.f10636b.mo3172r().v_().m12355a("Failed to unregister the network broadcast receiver", e);
            }
        }
    }
}
