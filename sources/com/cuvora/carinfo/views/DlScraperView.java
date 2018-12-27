package com.cuvora.carinfo.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.C0392c;
import android.util.AttributeSet;
import android.util.Log;
import android.webkit.ValueCallback;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.cuvora.carinfo.C3663b;
import com.cuvora.carinfo.R;
import com.cuvora.carinfo.helpers.C1540d;
import com.cuvora.carinfo.helpers.C1541e;
import com.cuvora.carinfo.helpers.C1562q;
import com.cuvora.carinfo.helpers.C1570t;
import com.cuvora.carinfo.loaders.C4808g;
import com.cuvora.carinfo.models.DlTemplateModel;
import com.cuvora.carinfo.models.ErrorMode;
import com.cuvora.carinfo.models.ErrorResponse;
import com.cuvora.carinfo.models.LicenseDetailsModel;
import com.cuvora.carinfo.models.ServerApiResponse;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2885g;
import kotlin.text.C4886o;

public final class DlScraperView extends FrameLayout {
    /* renamed from: a */
    public static final C1657b f4978a = new C1657b();
    /* renamed from: b */
    private C1656a f4979b;
    /* renamed from: c */
    private String f4980c;
    /* renamed from: d */
    private int f4981d = 3;
    /* renamed from: e */
    private final String f4982e = C1541e.m5852a("js_remove_t_and_c");
    /* renamed from: f */
    private DlTemplateModel f4983f;
    /* renamed from: g */
    private String f4984g;
    /* renamed from: h */
    private String f4985h;
    /* renamed from: i */
    private String f4986i;
    /* renamed from: j */
    private String f4987j;
    /* renamed from: k */
    private String f4988k;
    /* renamed from: l */
    private WebView f4989l;
    /* renamed from: m */
    private int f4990m;
    /* renamed from: n */
    private final Runnable f4991n;
    /* renamed from: o */
    private final C4580c f4992o;
    /* renamed from: p */
    private final AttributeSet f4993p;

    /* renamed from: com.cuvora.carinfo.views.DlScraperView$a */
    public interface C1656a {
        /* renamed from: a */
        void mo5026a(LicenseDetailsModel licenseDetailsModel);

        /* renamed from: b */
        void mo5028b(ErrorResponse errorResponse);

        /* renamed from: o */
        void mo5030o();
    }

    /* renamed from: com.cuvora.carinfo.views.DlScraperView$b */
    public static final class C1657b {
        private C1657b() {
        }
    }

    /* renamed from: com.cuvora.carinfo.views.DlScraperView$d */
    static final class C1660d<T> implements ValueCallback<String> {
        /* renamed from: a */
        final /* synthetic */ DlScraperView f4972a;

        C1660d(DlScraperView dlScraperView) {
            this.f4972a = dlScraperView;
        }

        public /* synthetic */ void onReceiveValue(Object obj) {
            m6290a((String) obj);
        }

        /* renamed from: a */
        public final void m6290a(String str) {
            str = this.f4972a.getWebview();
            if (str != null) {
                str.evaluateJavascript(this.f4972a.f4984g, new ValueCallback<String>() {
                    public /* synthetic */ void onReceiveValue(Object obj) {
                        m6289a((String) obj);
                    }

                    /* renamed from: a */
                    public final void m6289a(String str) {
                        str = this.f4972a.getWebview();
                        if (str != null) {
                            str.evaluateJavascript(this.f4972a.f4985h, new ValueCallback<String>() {
                                public /* synthetic */ void onReceiveValue(Object obj) {
                                    m6288a((String) obj);
                                }

                                /* renamed from: a */
                                public final void m6288a(String str) {
                                    this.f4972a.postDelayed(this.f4972a.f4991n, 1000);
                                }
                            });
                        }
                    }
                });
            }
        }
    }

    /* renamed from: com.cuvora.carinfo.views.DlScraperView$e */
    static final class C1661e implements Runnable {
        /* renamed from: a */
        final /* synthetic */ DlScraperView f4973a;
        /* renamed from: b */
        final /* synthetic */ Bundle f4974b;

        C1661e(DlScraperView dlScraperView, Bundle bundle) {
            this.f4973a = dlScraperView;
            this.f4974b = bundle;
        }

        public final void run() {
            Context context = this.f4973a.getContext();
            if (context != null) {
                ((FragmentActivity) context).m28708g().mo264a(1, this.f4974b, this.f4973a.f4992o).m1455m();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    /* renamed from: com.cuvora.carinfo.views.DlScraperView$f */
    static final class C1663f implements Runnable {
        /* renamed from: a */
        final /* synthetic */ DlScraperView f4976a;

        C1663f(DlScraperView dlScraperView) {
            this.f4976a = dlScraperView;
        }

        public final void run() {
            WebView webview = this.f4976a.getWebview();
            if (webview != null) {
                webview.evaluateJavascript(this.f4976a.f4986i, new ValueCallback<String>() {
                    public /* synthetic */ void onReceiveValue(Object obj) {
                        m6291a((String) obj);
                    }

                    /* renamed from: a */
                    public final void m6291a(String str) {
                        DlScraperView dlScraperView = this.f4976a;
                        C2885g.m13907a((Object) str, "it");
                        Object stringBuffer = dlScraperView.m6295b(str).toString();
                        Log.e("Tag", "tag ");
                        dlScraperView = this.f4976a;
                        C2885g.m13907a(stringBuffer, "result");
                        dlScraperView.m6294a((String) stringBuffer);
                    }
                });
            }
        }
    }

    /* renamed from: com.cuvora.carinfo.views.DlScraperView$g */
    public static final class C1664g extends WebViewClient {
        /* renamed from: a */
        final /* synthetic */ DlScraperView f4977a;

        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return true;
        }

        C1664g(DlScraperView dlScraperView) {
            this.f4977a = dlScraperView;
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            C1540d.m5819b("Webview", "Loaded");
            this.f4977a.m6307g();
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            C2885g.m13910b(webView, "view");
            C2885g.m13910b(webResourceRequest, "request");
            C2885g.m13910b(webResourceError, "error");
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (this.f4977a.getWebViewLoadMaxCount() == null) {
                this.f4977a.m6305f();
                webView = this.f4977a.getCallbacks();
                if (webView != null) {
                    webView.mo5028b(new ErrorResponse(ErrorMode.BACKGROUND_WEBVIEW_LOADING_ERROR.getValue(), "Something went wrong!!"));
                    return;
                }
                return;
            }
            webView = this.f4977a;
            webView.setWebViewLoadMaxCount(webView.getWebViewLoadMaxCount() - 1);
            this.f4977a.m6298c();
        }
    }

    /* renamed from: com.cuvora.carinfo.views.DlScraperView$c */
    public static final class C4580c extends C3663b<LicenseDetailsModel> {
        /* renamed from: a */
        final /* synthetic */ DlScraperView f18976a;
        /* renamed from: b */
        final /* synthetic */ Context f18977b;

        C4580c(DlScraperView dlScraperView, Context context) {
            this.f18976a = dlScraperView;
            this.f18977b = context;
        }

        /* renamed from: a */
        public void mo3921a(ErrorResponse errorResponse) {
            C2885g.m13910b(errorResponse, "errorResponse");
            C1540d.m5819b("ScrapeApi", "failure");
            this.f18976a.m6305f();
            C1656a callbacks = this.f18976a.getCallbacks();
            if (callbacks != null) {
                callbacks.mo5028b(errorResponse);
            }
        }

        /* renamed from: a */
        public void mo3920a() {
            C1540d.m5819b("ScrapeApi", "No Internet");
            ErrorResponse errorResponse = new ErrorResponse();
            errorResponse.setCode(ErrorMode.NO_INTERNET.getValue());
            errorResponse.setMessage("No internet connection");
            this.f18976a.m6305f();
            C1656a callbacks = this.f18976a.getCallbacks();
            if (callbacks != null) {
                callbacks.mo5028b(errorResponse);
            }
            m18447a(this.f18977b);
        }

        /* renamed from: a */
        public void m25240a(LicenseDetailsModel licenseDetailsModel) {
            C2885g.m13910b(licenseDetailsModel, "t");
            C1540d.m5819b("ScrapeApi", "Success");
            this.f18976a.m6305f();
            C1656a callbacks = this.f18976a.getCallbacks();
            if (callbacks != null) {
                callbacks.mo5026a(licenseDetailsModel);
            }
        }

        /* renamed from: a */
        public C0392c<ServerApiResponse<LicenseDetailsModel>> mo1158a(int i, Bundle bundle) {
            String string;
            String string2;
            Object context = this.f18976a.getContext();
            C2885g.m13907a(context, "getContext()");
            if (bundle != null) {
                string = bundle.getString("key_license_number");
                if (string != null) {
                    if (bundle != null) {
                        string2 = bundle.getString("key_dob");
                        if (string2 != null) {
                            if (bundle != null) {
                                bundle = bundle.getString("key_body");
                                if (bundle != null) {
                                    return (C0392c) new C4808g(context, string, string2, bundle);
                                }
                            }
                            bundle = "";
                            return (C0392c) new C4808g(context, string, string2, bundle);
                        }
                    }
                    string2 = "";
                    if (bundle != null) {
                        bundle = bundle.getString("key_body");
                        if (bundle != null) {
                            return (C0392c) new C4808g(context, string, string2, bundle);
                        }
                    }
                    bundle = "";
                    return (C0392c) new C4808g(context, string, string2, bundle);
                }
            }
            string = "";
            if (bundle != null) {
                string2 = bundle.getString("key_dob");
                if (string2 != null) {
                    if (bundle != null) {
                        bundle = bundle.getString("key_body");
                        if (bundle != null) {
                            return (C0392c) new C4808g(context, string, string2, bundle);
                        }
                    }
                    bundle = "";
                    return (C0392c) new C4808g(context, string, string2, bundle);
                }
            }
            string2 = "";
            if (bundle != null) {
                bundle = bundle.getString("key_body");
                if (bundle != null) {
                    return (C0392c) new C4808g(context, string, string2, bundle);
                }
            }
            bundle = "";
            return (C0392c) new C4808g(context, string, string2, bundle);
        }
    }

    public DlScraperView(Context context, AttributeSet attributeSet) {
        C2885g.m13910b(context, "context");
        super(context, attributeSet);
        this.f4993p = attributeSet;
        Object f = C1570t.m6018f();
        C2885g.m13907a(f, "Utils.getDlTemplateModel()");
        this.f4983f = f;
        this.f4984g = "";
        this.f4985h = "";
        this.f4986i = "";
        this.f4987j = "";
        this.f4988k = "";
        this.f4990m = 3;
        this.f4981d = this.f4983f.getHtmlPollCount();
        this.f4990m = this.f4983f.getWebviewLoadCount();
        this.f4979b = (C1656a) context;
        m6298c();
        this.f4991n = (Runnable) new C1663f(this);
        this.f4992o = new C4580c(this, context);
    }

    public final C1656a getCallbacks() {
        return this.f4979b;
    }

    public final void setCallbacks(C1656a c1656a) {
        this.f4979b = c1656a;
    }

    public final String getMHtml() {
        return this.f4980c;
    }

    public final void setMHtml(String str) {
        this.f4980c = str;
    }

    public final WebView getWebview() {
        return this.f4989l;
    }

    public final void setWebview(WebView webView) {
        this.f4989l = webView;
    }

    public final int getWebViewLoadMaxCount() {
        return this.f4990m;
    }

    public final void setWebViewLoadMaxCount(int i) {
        this.f4990m = i;
    }

    /* renamed from: c */
    private final void m6298c() {
        WebView webView = this.f4989l;
        if (webView != null) {
            webView.destroy();
        }
        removeAllViews();
        this.f4989l = new WebView(getContext(), this.f4993p);
        addView(this.f4989l);
        m6301d();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    /* renamed from: d */
    private final void m6301d() {
        WebView webView = this.f4989l;
        if (webView != null) {
            WebSettings settings = webView.getSettings();
            if (settings != null) {
                settings.setJavaScriptEnabled(true);
            }
        }
        webView = this.f4989l;
        if (webView != null) {
            webView.setWebViewClient(new C1664g(this));
        }
        webView = this.f4989l;
        if (webView != null) {
            webView.loadUrl(this.f4983f.getUrl());
        }
    }

    /* renamed from: e */
    private final void m6303e() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f4991n);
        }
        WebView webView = this.f4989l;
        if (webView != null) {
            webView.destroy();
        }
        removeAllViews();
        m6298c();
        m6312a(this.f4987j, this.f4988k);
    }

    /* renamed from: f */
    private final void m6305f() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f4991n);
        }
        this.f4981d = this.f4983f.getHtmlPollCount();
        this.f4990m = this.f4983f.getWebviewLoadCount();
        WebView webView = this.f4989l;
        if (webView != null) {
            webView.destroy();
        }
        removeAllViews();
    }

    /* renamed from: a */
    public final void m6312a(String str, String str2) {
        C2885g.m13910b(str, "dlNumber");
        C2885g.m13910b(str2, "dob");
        if (getChildCount() == 0) {
            m6298c();
        }
        setDlNumber(str);
        setDob(str2);
        m6310i();
        m6307g();
    }

    /* renamed from: g */
    private final void m6307g() {
        WebView webView = this.f4989l;
        Object tag = webView != null ? webView.getTag() : null;
        if (!(tag instanceof Boolean)) {
            tag = null;
        }
        if (C2885g.m13909a((Boolean) tag, Boolean.valueOf(true))) {
            m6309h();
            return;
        }
        webView = this.f4989l;
        if (webView != null) {
            webView.setTag(Boolean.valueOf(true));
        }
    }

    private final void setDlNumber(String str) {
        this.f4987j = str;
    }

    private final void setDob(String str) {
        this.f4988k = str;
    }

    /* renamed from: h */
    private final void m6309h() {
        WebView webView = this.f4989l;
        if (webView != null) {
            webView.evaluateJavascript(this.f4982e, new C1660d(this));
        }
    }

    /* renamed from: i */
    private final void m6310i() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("javascript: (function(){document.getElementById('");
        stringBuilder.append(this.f4983f.getDlFieldIdentifier());
        stringBuilder.append("').value = '");
        stringBuilder.append(this.f4987j);
        stringBuilder.append("';");
        stringBuilder.append("document.getElementById('");
        stringBuilder.append(this.f4983f.getDlDobIdentifier());
        stringBuilder.append("').value = '");
        stringBuilder.append(this.f4988k);
        stringBuilder.append("';");
        stringBuilder.append("})()");
        this.f4984g = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append("javascript: $(\"button\").each(function(){  if($(this).text() && $(this).text().toLowerCase() == \"");
        stringBuilder.append(this.f4983f.getDlSubmitIdentifier());
        stringBuilder.append("\"){");
        stringBuilder.append("      $(this).click();");
        stringBuilder.append("  }");
        stringBuilder.append("});");
        this.f4985h = stringBuilder.toString();
        this.f4986i = "(function() { return ('<html>'+document.getElementsByTagName('html')[0].innerHTML+'</html>'); })();";
    }

    public final void getData() {
        Bundle bundle = new Bundle();
        bundle.putString("key_license_number", this.f4987j);
        bundle.putString("key_body", this.f4980c);
        bundle.putString("key_dob", this.f4988k);
        Handler handler = getHandler();
        if (handler != null) {
            handler.post(new C1661e(this, bundle));
        }
    }

    /* renamed from: a */
    private final void m6294a(String str) {
        this.f4980c = str;
        if (C1562q.m5946a(str) && C4886o.m30234a((CharSequence) str, (CharSequence) this.f4983f.getDlSearchSuccessParam(), false, 2, null)) {
            C1540d.m5819b("Dl Scraper", "Webview success");
            C1540d.m5819b("ScrapeApi", "init");
            str = this.f4979b;
            if (str != null) {
                str.mo5030o();
            }
        } else if (C1562q.m5946a(str) && C4886o.m30234a((CharSequence) str, (CharSequence) this.f4983f.getDlNumberDoesNotExistIdentifier(), false, 2, null)) {
            C1540d.m5819b("Dl Scraper", "Webview Dl Not Found");
            str = this.f4979b;
            if (str != null) {
                str.mo5030o();
            }
        } else if (!C1562q.m5946a(str) || C4886o.m30234a((CharSequence) str, (CharSequence) this.f4983f.getUiErrorMessage(), false, 2, null) == null) {
            if (this.f4981d == null) {
                C1540d.m5819b("Dl Scraper", "Webview Max Polling Reached");
                str = new ErrorResponse();
                str.setCode(ErrorMode.BACKGROUND_WEBVIEW_MAX_POLLIN_REACHED.getValue());
                str.setMessage(getContext().getString(R.string.web_view_load_error));
                C1540d.m5819b("Webview", "Html Max Polling Reached");
                if (this.f4990m == 0) {
                    m6305f();
                    C1656a c1656a = this.f4979b;
                    if (c1656a != null) {
                        c1656a.mo5028b(str);
                    }
                } else {
                    m6303e();
                }
            } else {
                this.f4981d--;
                postDelayed(this.f4991n, 500);
            }
        } else {
            C1540d.m5819b("Dl Scraper", "Some ui error occured");
            str = this.f4979b;
            if (str != null) {
                str.mo5030o();
            }
        }
    }

    /* renamed from: b */
    private final StringBuffer m6295b(String str) {
        Matcher matcher = Pattern.compile("\\\\u(\\p{XDigit}{4})").matcher(str);
        StringBuffer stringBuffer = new StringBuffer(str.length());
        while (matcher.find() != null) {
            matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(String.valueOf((char) Integer.parseInt(matcher.group(1), 16))));
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer;
    }

    /* renamed from: a */
    public final void m6311a() {
        removeCallbacks(this.f4991n);
        WebView webView = this.f4989l;
        if (webView != null) {
            webView.destroy();
        }
        removeAllViews();
    }

    /* renamed from: b */
    public final void m6313b() {
        m6303e();
    }
}
