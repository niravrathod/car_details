package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.ads.internal.zzbv;

@zzaer
public final class zzalh extends Handler {
    public zzalh(Looper looper) {
        super(looper);
    }

    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Throwable e) {
            zzbv.zzeo().m9714a(e, "AdMobHandler.handleMessage");
        }
    }

    public final void dispatchMessage(Message message) {
        try {
            super.dispatchMessage(message);
        } catch (Throwable th) {
            zzbv.zzek();
            zzalo.m9793a(zzbv.zzeo().m9727l(), th);
        }
    }
}
