package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final /* synthetic */ class dn implements OnClickListener {
    /* renamed from: a */
    private final zzamj f8001a;
    /* renamed from: b */
    private final String f8002b;

    dn(zzamj zzamj, String str) {
        this.f8001a = zzamj;
        this.f8002b = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f8001a.m9889a(this.f8002b, dialogInterface, i);
    }
}
