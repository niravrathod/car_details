package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsResult;

final class gj implements OnClickListener {
    /* renamed from: a */
    private final /* synthetic */ JsResult f8104a;

    gj(JsResult jsResult) {
        this.f8104a = jsResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f8104a.confirm();
    }
}
