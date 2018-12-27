package com.cuvora.carinfo.views;

import android.content.Context;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.cuvora.carinfo.R;

public class CustomWebView extends LinearLayout {
    /* renamed from: a */
    private WebView f4928a;
    /* renamed from: b */
    private ProgressBar f4929b;
    /* renamed from: c */
    private boolean f4930c;

    /* renamed from: com.cuvora.carinfo.views.CustomWebView$1 */
    class C16371 extends WebViewClient {
        /* renamed from: a */
        final /* synthetic */ CustomWebView f4926a;

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return true;
        }

        C16371(CustomWebView customWebView) {
            this.f4926a = customWebView;
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        }
    }

    /* renamed from: com.cuvora.carinfo.views.CustomWebView$a */
    private class C1638a extends WebChromeClient {
        /* renamed from: a */
        final /* synthetic */ CustomWebView f4927a;

        private C1638a(CustomWebView customWebView) {
            this.f4927a = customWebView;
        }

        public void onProgressChanged(WebView webView, int i) {
            super.onProgressChanged(webView, i);
            this.f4927a.f4929b.setProgress(i);
            if (i == 100) {
                this.f4927a.f4929b.setVisibility(8);
                this.f4927a.f4930c = false;
            }
            if (i == 0) {
                this.f4927a.f4929b.setProgress(0);
                this.f4927a.f4930c = 1;
            }
        }
    }

    public CustomWebView(Context context) {
        super(context);
        m6243b();
    }

    /* renamed from: b */
    private void m6243b() {
        View inflate = inflate(getContext(), R.layout.layout_custom_web_view, this);
        this.f4928a = (WebView) inflate.findViewById(R.id.webview);
        this.f4929b = (ProgressBar) inflate.findViewById(R.id.progress_bar);
        this.f4928a.getSettings().setJavaScriptEnabled(true);
        this.f4928a.getSettings().setDomStorageEnabled(true);
        this.f4928a.setWebViewClient(new C16371(this));
        this.f4928a.setWebChromeClient(new C1638a());
    }

    public WebView getWebView() {
        return this.f4928a;
    }

    /* renamed from: a */
    public void m6244a(String str) {
        this.f4929b.setProgress(0);
        this.f4928a.loadUrl(str);
        this.f4930c = true;
    }

    /* renamed from: a */
    public boolean m6245a() {
        return this.f4930c;
    }
}
