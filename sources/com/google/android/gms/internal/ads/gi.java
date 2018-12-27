package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsResult;

final class gi implements OnClickListener {
    /* renamed from: a */
    private final /* synthetic */ JsResult f8103a;

    gi(JsResult jsResult) {
        this.f8103a = jsResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f8103a.cancel();
    }
}
