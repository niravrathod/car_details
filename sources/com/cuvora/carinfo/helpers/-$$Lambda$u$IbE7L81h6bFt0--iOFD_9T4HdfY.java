package com.cuvora.carinfo.helpers;

import android.webkit.WebView;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$u$IbE7L81h6bFt0--iOFD_9T4HdfY implements Runnable {
    private final /* synthetic */ WebView f$0;

    public /* synthetic */ -$$Lambda$u$IbE7L81h6bFt0--iOFD_9T4HdfY(WebView webView) {
        this.f$0 = webView;
    }

    public final void run() {
        this.f$0.loadUrl("javascript:window.HTMLOUT.processHTML('<html>'+document.getElementsByTagName('html')[0].innerHTML+'</html>');");
    }
}
