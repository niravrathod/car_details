package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.net.Uri;
import com.google.android.gms.ads.internal.zzbv;

final class ds implements OnClickListener {
    /* renamed from: a */
    private final /* synthetic */ dr f8010a;

    ds(dr drVar) {
        this.f8010a = drVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        zzbv.zzek();
        zzalo.m9790a(this.f8010a.f8006a, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}
