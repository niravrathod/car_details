package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.webkit.JsPromptResult;

final class gk implements OnCancelListener {
    /* renamed from: a */
    private final /* synthetic */ JsPromptResult f8105a;

    gk(JsPromptResult jsPromptResult) {
        this.f8105a = jsPromptResult;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f8105a.cancel();
    }
}
