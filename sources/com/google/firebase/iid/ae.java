package com.google.firebase.iid;

import android.content.Intent;
import android.util.Log;

final /* synthetic */ class ae implements Runnable {
    /* renamed from: a */
    private final ad f10997a;
    /* renamed from: b */
    private final Intent f10998b;

    ae(ad adVar, Intent intent) {
        this.f10997a = adVar;
        this.f10998b = intent;
    }

    public final void run() {
        ad adVar = this.f10997a;
        String action = this.f10998b.getAction();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(action).length() + 61);
        stringBuilder.append("Service took too long to process intent: ");
        stringBuilder.append(action);
        stringBuilder.append(" App may get closed.");
        Log.w("EnhancedIntentService", stringBuilder.toString());
        adVar.m12694a();
    }
}
