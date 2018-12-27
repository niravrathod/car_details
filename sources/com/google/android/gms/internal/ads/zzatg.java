package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

@zzaer
@TargetApi(21)
public final class zzatg extends zzatf {
    public zzatg(zzasg zzasg, zzhv zzhv, boolean z) {
        super(zzasg, zzhv, z);
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest != null) {
            if (webResourceRequest.getUrl() != null) {
                return m26376a(webView, webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
            }
        }
        return null;
    }
}
