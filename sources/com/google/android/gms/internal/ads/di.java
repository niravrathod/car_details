package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class di extends BroadcastReceiver {
    /* renamed from: a */
    private final /* synthetic */ zzalo f7993a;

    private di(zzalo zzalo) {
        this.f7993a = zzalo;
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction()) != null) {
            this.f7993a.f8874c = true;
            return;
        }
        if ("android.intent.action.SCREEN_OFF".equals(intent.getAction()) != null) {
            this.f7993a.f8874c = null;
        }
    }
}
