package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: com.google.android.gms.internal.ads.l */
final class C2440l implements OnClickListener {
    /* renamed from: a */
    private final /* synthetic */ zzabe f8213a;

    C2440l(zzabe zzabe) {
        this.f8213a = zzabe;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f8213a.m9445a("Operation denied by user.");
    }
}
