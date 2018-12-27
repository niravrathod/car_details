package com.cuvora.carinfo.videomodule.utils;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: com.cuvora.carinfo.videomodule.utils.d */
public class C1624d extends ClickableSpan {
    /* renamed from: a */
    private boolean f4884a = true;
    /* renamed from: b */
    private int f4885b;

    public void onClick(View view) {
    }

    public C1624d(boolean z, int i) {
        this.f4884a = z;
        this.f4885b = i;
    }

    public void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.f4884a);
        textPaint.setColor(this.f4885b);
    }
}
