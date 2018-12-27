package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final /* synthetic */ class dm implements OnClickListener {
    /* renamed from: a */
    private final zzamj f7997a;
    /* renamed from: b */
    private final int f7998b;
    /* renamed from: c */
    private final int f7999c;
    /* renamed from: d */
    private final int f8000d;

    dm(zzamj zzamj, int i, int i2, int i3) {
        this.f7997a = zzamj;
        this.f7998b = i;
        this.f7999c = i2;
        this.f8000d = i3;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f7997a.m9886a(this.f7998b, this.f7999c, this.f8000d, dialogInterface, i);
    }
}
