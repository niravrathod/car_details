package com.google.firebase.iid;

import android.content.Intent;

final class ac implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Intent f10990a;
    /* renamed from: b */
    private final /* synthetic */ Intent f10991b;
    /* renamed from: c */
    private final /* synthetic */ zzb f10992c;

    ac(zzb zzb, Intent intent, Intent intent2) {
        this.f10992c = zzb;
        this.f10990a = intent;
        this.f10991b = intent2;
    }

    public final void run() {
        this.f10992c.mo3318b(this.f10990a);
        this.f10992c.m12801d(this.f10991b);
    }
}
