package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.webkit.WebSettings;

@TargetApi(16)
public class zzame extends zzamb {
    /* renamed from: a */
    public final void mo4957a(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    /* renamed from: a */
    public final void mo4958a(ViewTreeObserver viewTreeObserver, OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    /* renamed from: a */
    public boolean mo4178a(Context context, WebSettings webSettings) {
        super.mo4178a(context, webSettings);
        webSettings.setAllowFileAccessFromFileURLs(false);
        webSettings.setAllowUniversalAccessFromFileURLs(false);
        return true;
    }
}
