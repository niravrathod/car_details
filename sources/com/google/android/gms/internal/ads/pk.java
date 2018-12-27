package com.google.android.gms.internal.ads;

import android.database.ContentObserver;
import android.os.Handler;

final class pk extends ContentObserver {
    /* renamed from: a */
    private final /* synthetic */ zzew f8330a;

    public pk(zzew zzew, Handler handler) {
        this.f8330a = zzew;
        super(handler);
    }

    public final void onChange(boolean z) {
        super.onChange(z);
        this.f8330a.m10577a();
    }
}
