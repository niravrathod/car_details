package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

final class ad extends ContentObserver {
    /* renamed from: a */
    private final /* synthetic */ zzsi f10035a;

    ad(zzsi zzsi, Handler handler) {
        this.f10035a = zzsi;
        super(null);
    }

    public final void onChange(boolean z) {
        this.f10035a.m11970b();
        this.f10035a.m11968d();
    }
}
