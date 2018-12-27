package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

@zzaer
@TargetApi(11)
public final class zzate extends zzatf {
    public zzate(zzasg zzasg, zzhv zzhv, boolean z) {
        super(zzasg, zzhv, z);
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return m26376a(webView, str, null);
    }
}
