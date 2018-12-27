package com.google.firebase.iid;

import android.os.Binder;
import android.os.Process;
import android.util.Log;

public final class af extends Binder {
    /* renamed from: a */
    private final zzb f10999a;

    af(zzb zzb) {
        this.f10999a = zzb;
    }

    /* renamed from: a */
    public final void m12696a(ad adVar) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "service received new intent via bind strategy");
            }
            if (this.f10999a.mo3330c(adVar.f10993a)) {
                adVar.m12694a();
                return;
            }
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "intent being queued for bg execution");
            }
            this.f10999a.f11076a.execute(new ag(this, adVar));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
