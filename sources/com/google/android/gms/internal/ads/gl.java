package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsPromptResult;

final class gl implements OnClickListener {
    /* renamed from: a */
    private final /* synthetic */ JsPromptResult f8106a;

    gl(JsPromptResult jsPromptResult) {
        this.f8106a = jsPromptResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f8106a.cancel();
    }
}
