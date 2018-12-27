package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.webkit.JsResult;

final class gh implements OnCancelListener {
    /* renamed from: a */
    private final /* synthetic */ JsResult f8102a;

    gh(JsResult jsResult) {
        this.f8102a = jsResult;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f8102a.cancel();
    }
}
