package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.net.http.SslError;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import javax.annotation.ParametersAreNonnullByDefault;

@zzaer
@ParametersAreNonnullByDefault
public class zzaue extends WebViewClient {
    /* renamed from: a */
    private static final String[] f9021a = new String[]{"UNKNOWN", "HOST_LOOKUP", "UNSUPPORTED_AUTH_SCHEME", "AUTHENTICATION", "PROXY_AUTHENTICATION", "CONNECT", "IO", "TIMEOUT", "REDIRECT_LOOP", "UNSUPPORTED_SCHEME", "FAILED_SSL_HANDSHAKE", "BAD_URL", "FILE", "FILE_NOT_FOUND", "TOO_MANY_REQUESTS"};
    /* renamed from: b */
    private static final String[] f9022b = new String[]{"NOT_YET_VALID", "EXPIRED", "ID_MISMATCH", "UNTRUSTED", "DATE_INVALID", "INVALID"};
    /* renamed from: c */
    private zzauj f9023c;

    /* renamed from: a */
    public void mo2176a(zzauf zzauf) {
    }

    /* renamed from: b */
    public void mo2177b(zzauf zzauf) {
    }

    /* renamed from: c */
    public boolean mo2178c(zzauf zzauf) {
        return false;
    }

    /* renamed from: d */
    public WebResourceResponse mo2406d(zzauf zzauf) {
        return null;
    }

    /* renamed from: a */
    final void m10141a(zzauj zzauj) {
        this.f9023c = zzauj;
    }

    public final void onPageFinished(WebView webView, String str) {
        if (str != null) {
            zzauf zzauf = new zzauf(str);
            if (this.f9023c != null) {
                this.f9023c.mo2407a(zzauf);
            } else {
                mo2176a(zzauf);
            }
        }
    }

    public final void onLoadResource(WebView webView, String str) {
        if (str != null) {
            webView = "Loading resource: ";
            String valueOf = String.valueOf(str);
            zzalg.m21225a(valueOf.length() != 0 ? webView.concat(valueOf) : new String(webView));
            mo2177b(new zzauf(str));
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return str == null ? null : mo2178c(new zzauf(str));
    }

    @TargetApi(24)
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest != null) {
            if (webResourceRequest.getUrl() != null) {
                return mo2178c(new zzauf(webResourceRequest));
            }
        }
        return null;
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return str == null ? null : mo2406d(new zzauf(str));
    }

    @TargetApi(24)
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest != null) {
            if (webResourceRequest.getUrl() != null) {
                return mo2406d(new zzauf(webResourceRequest));
            }
        }
        return null;
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        if (i >= 0 || (-i) - 1 >= f9021a.length) {
            String.valueOf(i);
        }
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (sslError != null) {
            webView = sslError.getPrimaryError();
            if (webView < null || webView >= f9022b.length) {
                String.valueOf(webView);
            }
            sslError.getUrl();
        }
    }

    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        webView = keyEvent.getKeyCode();
        if (!(webView == 79 || webView == 222)) {
            switch (webView) {
                case 85:
                case 86:
                case 87:
                case 88:
                case 89:
                case 90:
                case 91:
                    break;
                default:
                    switch (webView) {
                        case 126:
                        case 127:
                        case 128:
                        case 129:
                        case 130:
                            break;
                        default:
                            return null;
                    }
            }
        }
        return true;
    }

    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if ((webView.getParent() instanceof ViewGroup) != null) {
            ((ViewGroup) webView.getParent()).removeView(webView);
        }
        webView.destroy();
        return true;
    }
}
