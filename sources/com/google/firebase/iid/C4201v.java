package com.google.firebase.iid;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.firebase_messaging.zza;

/* renamed from: com.google.firebase.iid.v */
final class C4201v extends zza {
    /* renamed from: a */
    private final /* synthetic */ C2602u f17747a;

    C4201v(C2602u c2602u, Looper looper) {
        this.f17747a = c2602u;
        super(looper);
    }

    public final void handleMessage(Message message) {
        this.f17747a.m12767a(message);
    }
}
