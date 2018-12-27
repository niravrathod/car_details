package com.google.android.gms.ads.internal;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.zzaok;
import com.google.android.gms.internal.ads.zzkd;
import com.google.android.gms.internal.ads.zznw;

final class aa extends WebViewClient {
    /* renamed from: a */
    private final /* synthetic */ zzbp f7638a;

    aa(zzbp zzbp) {
        this.f7638a = zzbp;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str.startsWith(this.f7638a.m25975b()) != null) {
            return false;
        }
        if (str.startsWith((String) zzkd.m10713e().m10897a(zznw.bM)) != null) {
            if (this.f7638a.f19593g != null) {
                try {
                    this.f7638a.f19593g.mo2463a(3);
                } catch (WebView webView2) {
                    zzaok.m10006d("#007 Could not call remote method.", webView2);
                }
            }
            this.f7638a.m25974a(0);
            return true;
        }
        if (str.startsWith((String) zzkd.m10713e().m10897a(zznw.bN)) != null) {
            if (this.f7638a.f19593g != null) {
                try {
                    this.f7638a.f19593g.mo2463a(0);
                } catch (WebView webView22) {
                    zzaok.m10006d("#007 Could not call remote method.", webView22);
                }
            }
            this.f7638a.m25974a(0);
            return true;
        }
        if (str.startsWith((String) zzkd.m10713e().m10897a(zznw.bO)) != null) {
            if (this.f7638a.f19593g != null) {
                try {
                    this.f7638a.f19593g.mo2465c();
                } catch (WebView webView222) {
                    zzaok.m10006d("#007 Could not call remote method.", webView222);
                }
            }
            this.f7638a.m25974a(this.f7638a.m25972a(str));
            return true;
        } else if (str.startsWith("gmsg://") != null) {
            return true;
        } else {
            if (this.f7638a.f19593g != null) {
                try {
                    this.f7638a.f19593g.mo2464b();
                } catch (WebView webView2222) {
                    zzaok.m10006d("#007 Could not call remote method.", webView2222);
                }
            }
            this.f7638a.m25968c((String) this.f7638a.m25965b(str));
            return true;
        }
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (this.f7638a.f19593g != null) {
            try {
                this.f7638a.f19593g.mo2463a(null);
            } catch (WebView webView2) {
                zzaok.m10006d("#007 Could not call remote method.", webView2);
            }
        }
    }
}
