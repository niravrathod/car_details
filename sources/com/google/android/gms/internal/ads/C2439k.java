package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.google.android.gms.ads.internal.zzbv;

/* renamed from: com.google.android.gms.internal.ads.k */
final class C2439k implements OnClickListener {
    /* renamed from: a */
    private final /* synthetic */ zzabe f8199a;

    C2439k(zzabe zzabe) {
        this.f8199a = zzabe;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Intent b = this.f8199a.m21064b();
        zzbv.zzek();
        zzalo.m9789a(this.f8199a.f16728b, b);
    }
}
