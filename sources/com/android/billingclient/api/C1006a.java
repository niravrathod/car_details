package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.android.billingclient.p041a.C1003a;

/* renamed from: com.android.billingclient.api.a */
class C1006a {
    /* renamed from: a */
    private final Context f3376a;
    /* renamed from: b */
    private final C1005a f3377b;

    /* renamed from: com.android.billingclient.api.a$a */
    private class C1005a extends BroadcastReceiver {
        /* renamed from: a */
        final /* synthetic */ C1006a f3373a;
        /* renamed from: b */
        private final C1027i f3374b;
        /* renamed from: c */
        private boolean f3375c;

        private C1005a(C1006a c1006a, C1027i c1027i) {
            this.f3373a = c1006a;
            this.f3374b = c1027i;
        }

        /* renamed from: a */
        public void m4338a(Context context, IntentFilter intentFilter) {
            if (!this.f3375c) {
                context.registerReceiver(this.f3373a.f3377b, intentFilter);
                this.f3375c = true;
            }
        }

        /* renamed from: a */
        public void m4337a(Context context) {
            if (this.f3375c) {
                context.unregisterReceiver(this.f3373a.f3377b);
                this.f3375c = null;
                return;
            }
            C1003a.m4333b("BillingBroadcastManager", "Receiver is not registered.");
        }

        public void onReceive(Context context, Intent intent) {
            this.f3374b.mo925a(C1003a.m4329a(intent, "BillingBroadcastManager"), C1003a.m4331a(intent.getExtras()));
        }
    }

    C1006a(Context context, C1027i c1027i) {
        this.f3376a = context;
        this.f3377b = new C1005a(c1027i);
    }

    /* renamed from: a */
    void m4340a() {
        this.f3377b.m4338a(this.f3376a, new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED"));
    }

    /* renamed from: b */
    C1027i m4341b() {
        return this.f3377b.f3374b;
    }

    /* renamed from: c */
    void m4342c() {
        this.f3377b.m4337a(this.f3376a);
    }
}
