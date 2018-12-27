package com.bumptech.glide.p052c;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.util.Log;
import com.bumptech.glide.p052c.C3360c.C1133a;
import com.bumptech.glide.p055g.C1178i;

/* renamed from: com.bumptech.glide.c.e */
final class C4503e implements C3360c {
    /* renamed from: a */
    final C1133a f18815a;
    /* renamed from: b */
    boolean f18816b;
    /* renamed from: c */
    private final Context f18817c;
    /* renamed from: d */
    private boolean f18818d;
    /* renamed from: e */
    private final BroadcastReceiver f18819e = new C11351(this);

    /* renamed from: com.bumptech.glide.c.e$1 */
    class C11351 extends BroadcastReceiver {
        /* renamed from: a */
        final /* synthetic */ C4503e f3718a;

        C11351(C4503e c4503e) {
            this.f3718a = c4503e;
        }

        public void onReceive(Context context, Intent intent) {
            intent = this.f3718a.f18816b;
            this.f3718a.f18816b = this.f3718a.m24909a(context);
            if (intent != this.f3718a.f18816b) {
                if (Log.isLoggable("ConnectivityMonitor", 3) != null) {
                    intent = new StringBuilder();
                    intent.append("connectivity changed, isConnected: ");
                    intent.append(this.f3718a.f18816b);
                    Log.d("ConnectivityMonitor", intent.toString());
                }
                this.f3718a.f18815a.mo953a(this.f3718a.f18816b);
            }
        }
    }

    /* renamed from: e */
    public void mo948e() {
    }

    C4503e(Context context, C1133a c1133a) {
        this.f18817c = context.getApplicationContext();
        this.f18815a = c1133a;
    }

    /* renamed from: a */
    private void m24907a() {
        if (!this.f18818d) {
            this.f18816b = m24909a(this.f18817c);
            try {
                this.f18817c.registerReceiver(this.f18819e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.f18818d = true;
            } catch (Throwable e) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register", e);
                }
            }
        }
    }

    /* renamed from: b */
    private void m24908b() {
        if (this.f18818d) {
            this.f18817c.unregisterReceiver(this.f18819e);
            this.f18818d = false;
        }
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: a */
    boolean m24909a(Context context) {
        boolean z = true;
        try {
            context = ((ConnectivityManager) C1178i.m4880a((ConnectivityManager) context.getSystemService("connectivity"))).getActiveNetworkInfo();
            if (context == null || context.isConnected() == null) {
                z = false;
            }
            return z;
        } catch (Context context2) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", context2);
            }
            return true;
        }
    }

    /* renamed from: c */
    public void mo946c() {
        m24907a();
    }

    /* renamed from: d */
    public void mo947d() {
        m24908b();
    }
}
