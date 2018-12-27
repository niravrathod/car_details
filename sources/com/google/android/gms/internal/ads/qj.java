package com.google.android.gms.internal.ads;

import android.view.View;

final class qj implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ View f8347a;
    /* renamed from: b */
    private final /* synthetic */ zzgn f8348b;

    qj(zzgn zzgn, View view) {
        this.f8348b = zzgn;
        this.f8347a = view;
    }

    public final void run() {
        this.f8348b.m10639a(this.f8347a);
    }
}
