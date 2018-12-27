package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsPromptResult;
import android.widget.EditText;

final class gm implements OnClickListener {
    /* renamed from: a */
    private final /* synthetic */ JsPromptResult f8107a;
    /* renamed from: b */
    private final /* synthetic */ EditText f8108b;

    gm(JsPromptResult jsPromptResult, EditText editText) {
        this.f8107a = jsPromptResult;
        this.f8108b = editText;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f8107a.confirm(this.f8108b.getText().toString());
    }
}
