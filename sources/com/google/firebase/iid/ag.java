package com.google.firebase.iid;

import android.util.Log;

final class ag implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ ad f11000a;
    /* renamed from: b */
    private final /* synthetic */ af f11001b;

    ag(af afVar, ad adVar) {
        this.f11001b = afVar;
        this.f11000a = adVar;
    }

    public final void run() {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "bg processing of the intent starting now");
        }
        this.f11001b.f10999a.mo3318b(this.f11000a.f10993a);
        this.f11000a.m12694a();
    }
}
