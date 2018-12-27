package com.cuvora.carinfo.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.C0392c;
import android.util.AttributeSet;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
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
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2885g;
import kotlin.text.C4886o;

public final class DLScrapeView extends WebView {
    /* renamed from: a */
    public static final C1640b f4950a = new C1640b();
    /* renamed from: b */
    private final String f4951b = C1541e.m5852a("js_remove_t_and_c");
    /* renamed from: c */
    private DlTemplateModel f4952c;
    /* renamed from: d */
    private boolean f4953d;
    /* renamed from: e */
    private boolean f4954e;
    /* renamed from: f */
    private String f4955f;
    /* renamed from: g */
    private String f4956g;
    /* renamed from: h */
    private String f4957h;
    /* renamed from: i */
    private String f4958i;
    /* renamed from: j */
    private String f4959j;
    /* renamed from: k */
    private String f4960k;
    /* renamed from: l */
    private String f4961l;
    /* renamed from: m */
    private final long f4962m;
    /* renamed from: n */
    private final long f4963n;
    /* renamed from: o */
    private C1639a f4964o;
    /* renamed from: p */
    private int f4965p;
    /* renamed from: q */
    private Runnable f4966q;
    /* renamed from: r */
    private Runnable f4967r;
    /* renamed from: s */
    private Runnable f4968s;
    /* renamed from: t */
    private final C3663b<LicenseDetailsModel> f4969t;

    /* renamed from: com.cuvora.carinfo.views.DLScrapeView$a */
    public interface C1639a {
        /* renamed from: a */
        void mo5031a(LicenseDetailsModel licenseDetailsModel);

        /* renamed from: a */
        void mo5032a(boolean z, ErrorResponse errorResponse);
    }

    /* renamed from: com.cuvora.carinfo.views.DLScrapeView$b */
    public static final class C1640b {
        private C1640b() {
        }
    }

    /* renamed from: com.cuvora.carinfo.views.DLScrapeView$c */
    public final class C1644c {
        /* renamed from: a */
        final /* synthetic */ DLScrapeView f4936a;
        /* renamed from: b */
        private int f4937b;
        /* renamed from: c */
        private Integer f4938c = C1541e.m5855b("maxPollingCount");

        /* renamed from: com.cuvora.carinfo.views.DLScrapeView$c$a */
        static final class C1641a implements Runnable {
            /* renamed from: a */
            final /* synthetic */ C1644c f4931a;
            /* renamed from: b */
            final /* synthetic */ Bundle f4932b;

            C1641a(C1644c c1644c, Bundle bundle) {
                this.f4931a = c1644c;
                this.f4932b = bundle;
            }

            public final void run() {
                Context context = this.f4931a.f4936a.getContext();
                if (context != null) {
                    ((FragmentActivity) context).m28708g().mo264a(1, this.f4932b, this.f4931a.f4936a.getDlLoader()).m1455m();
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
            }
        }

        /* renamed from: com.cuvora.carinfo.views.DLScrapeView$c$b */
        static final class C1642b implements Runnable {
            /* renamed from: a */
            final /* synthetic */ C1644c f4933a;
            /* renamed from: b */
            final /* synthetic */ Bundle f4934b;

            C1642b(C1644c c1644c, Bundle bundle) {
                this.f4933a = c1644c;
                this.f4934b = bundle;
            }

            public final void run() {
                Context context = this.f4933a.f4936a.getContext();
                if (context != null) {
                    ((FragmentActivity) context).m28708g().mo264a(1, this.f4934b, this.f4933a.f4936a.getDlLoader()).m1455m();
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
            }
        }

        /* renamed from: com.cuvora.carinfo.views.DLScrapeView$c$c */
        static final class C1643c implements Runnable {
            /* renamed from: a */
            final /* synthetic */ C1644c f4935a;

            C1643c(C1644c c1644c) {
                this.f4935a = c1644c;
            }

            public final void run() {
                this.f4935a.f4936a.getBackgroundPollRunnable$carInfo_release().run();
            }
        }

        public C1644c(DLScrapeView dLScrapeView) {
            this.f4936a = dLScrapeView;
        }

        @JavascriptInterface
        public final void showHTML(String str) {
            C2885g.m13910b(str, "html");
            this.f4936a.f4960k = str;
            Handler handler;
            Bundle bundle;
            if (C1562q.m5946a(str) && C4886o.m30234a((CharSequence) str, (CharSequence) this.f4936a.f4952c.getDlSearchSuccessParam(), false, 2, null)) {
                C1540d.m5819b("Dl Scraper", "Webview success");
                C1540d.m5819b("ScrapeApi", "init");
                this.f4937b = 0;
                handler = this.f4936a.getHandler();
                if (handler != null) {
                    handler.removeCallbacks(this.f4936a.f4967r);
                }
                handler = this.f4936a.getHandler();
                if (handler != null) {
                    handler.removeCallbacks(this.f4936a.getBackgroundPollRunnable$carInfo_release());
                }
                handler = this.f4936a.getHandler();
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
                bundle = new Bundle();
                bundle.putString("key_license_number", this.f4936a.f4956g);
                bundle.putString("key_body", str);
                bundle.putString("key_dob", this.f4936a.f4955f);
                str = this.f4936a.getHandler();
                if (str != null) {
                    str.post(new C1641a(this, bundle));
                }
            } else if (C1562q.m5946a(str) && C4886o.m30234a((CharSequence) str, (CharSequence) this.f4936a.f4952c.getDlNumberDoesNotExistIdentifier(), false, 2, null)) {
                C1540d.m5819b("Dl Scraper", "Webview Dl Not Found");
                C1540d.m5819b("ScrapeApi", "init");
                this.f4937b = 0;
                handler = this.f4936a.getHandler();
                if (handler != null) {
                    handler.removeCallbacks(this.f4936a.f4967r);
                }
                handler = this.f4936a.getHandler();
                if (handler != null) {
                    handler.removeCallbacks(this.f4936a.getBackgroundPollRunnable$carInfo_release());
                }
                handler = this.f4936a.getHandler();
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
                bundle = new Bundle();
                bundle.putString("key_license_number", this.f4936a.f4956g);
                bundle.putString("key_body", str);
                bundle.putString("key_dob", this.f4936a.f4955f);
                str = this.f4936a.getHandler();
                if (str != null) {
                    str.post(new C1642b(this, bundle));
                }
            } else {
                int i = this.f4937b;
                Object obj = this.f4938c;
                C2885g.m13907a(obj, "maxPollingCount");
                if (C2885g.m13903a(i, obj.intValue()) < null) {
                    this.f4937b += 1;
                    str = this.f4936a.getHandler();
                    if (str != null) {
                        str.postDelayed(new C1643c(this), this.f4936a.f4963n);
                    }
                } else {
                    C1540d.m5819b("Dl Scraper", "Webview Max Polling Reached");
                    str = this.f4936a.getHandler();
                    if (str != null) {
                        str.removeCallbacksAndMessages(null);
                    }
                    str = new ErrorResponse();
                    str.setCode(ErrorMode.BACKGROUND_WEBVIEW_MAX_POLLIN_REACHED.getValue());
                    str.setMessage(this.f4936a.getContext().getString(R.string.web_view_load_error));
                    C1639a callbacks = this.f4936a.getCallbacks();
                    if (callbacks != null) {
                        callbacks.mo5032a(true, str);
                    }
                    str = this.f4936a.getHandler();
                    if (str != null) {
                        str.removeCallbacks(this.f4936a.getBackgroundPollRunnable$carInfo_release());
                    }
                    this.f4937b = 0;
                }
            }
        }

        @JavascriptInterface
        public final void showHTMLPOLL(String str) {
            C2885g.m13910b(str, "html");
            this.f4936a.f4960k = str;
        }
    }

    /* renamed from: com.cuvora.carinfo.views.DLScrapeView$d */
    static final class C1646d<T> implements ValueCallback<String> {
        /* renamed from: a */
        final /* synthetic */ DLScrapeView f4940a;

        C1646d(DLScrapeView dLScrapeView) {
            this.f4940a = dLScrapeView;
        }

        public /* synthetic */ void onReceiveValue(Object obj) {
            m6249a((String) obj);
        }

        /* renamed from: a */
        public final void m6249a(String str) {
            this.f4940a.evaluateJavascript(this.f4940a.f4957h, new ValueCallback<String>() {
                public /* synthetic */ void onReceiveValue(Object obj) {
                    m6248a((String) obj);
                }

                /* renamed from: a */
                public final void m6248a(String str) {
                    this.f4940a.getHandler().postDelayed(this.f4940a.f4967r, 1000);
                }
            });
        }
    }

    /* renamed from: com.cuvora.carinfo.views.DLScrapeView$e */
    static final class C1647e implements Runnable {
        /* renamed from: a */
        final /* synthetic */ DLScrapeView f4941a;

        C1647e(DLScrapeView dLScrapeView) {
            this.f4941a = dLScrapeView;
        }

        public final void run() {
            this.f4941a.evaluateJavascript(this.f4941a.f4959j, null);
        }
    }

    /* renamed from: com.cuvora.carinfo.views.DLScrapeView$g */
    static final class C1650g<T> implements ValueCallback<String> {
        /* renamed from: a */
        final /* synthetic */ DLScrapeView f4944a;

        C1650g(DLScrapeView dLScrapeView) {
            this.f4944a = dLScrapeView;
        }

        public /* synthetic */ void onReceiveValue(Object obj) {
            m6252a((String) obj);
        }

        /* renamed from: a */
        public final void m6252a(String str) {
            this.f4944a.evaluateJavascript(this.f4944a.f4957h, new ValueCallback<String>() {
                public /* synthetic */ void onReceiveValue(Object obj) {
                    m6251a((String) obj);
                }

                /* renamed from: a */
                public final void m6251a(String str) {
                    this.f4944a.evaluateJavascript(this.f4944a.f4958i, new ValueCallback<String>() {
                        public /* synthetic */ void onReceiveValue(Object obj) {
                            m6250a((String) obj);
                        }

                        /* renamed from: a */
                        public final void m6250a(String str) {
                            this.f4944a.getBackgroundPollRunnable$carInfo_release().run();
                        }
                    });
                }
            });
        }
    }

    /* renamed from: com.cuvora.carinfo.views.DLScrapeView$h */
    static final class C1651h implements Runnable {
        /* renamed from: a */
        final /* synthetic */ DLScrapeView f4945a;

        C1651h(DLScrapeView dLScrapeView) {
            this.f4945a = dLScrapeView;
        }

        public final void run() {
            this.f4945a.m6262c();
        }
    }

    /* renamed from: com.cuvora.carinfo.views.DLScrapeView$i */
    static final class C1652i<T> implements ValueCallback<String> {
        /* renamed from: a */
        final /* synthetic */ DLScrapeView f4946a;

        C1652i(DLScrapeView dLScrapeView) {
            this.f4946a = dLScrapeView;
        }

        public /* synthetic */ void onReceiveValue(Object obj) {
            m6253a((String) obj);
        }

        /* renamed from: a */
        public final void m6253a(String str) {
            if (C1562q.m5946a(this.f4946a.f4960k) != null && C4886o.m30234a((CharSequence) this.f4946a.f4960k, (CharSequence) this.f4946a.f4952c.getDlSearchSuccessParam(), false, 2, null) != null) {
                return;
            }
            if (C1562q.m5946a(this.f4946a.f4960k) == null || C4886o.m30234a((CharSequence) this.f4946a.f4960k, (CharSequence) this.f4946a.f4952c.getDlNumberDoesNotExistIdentifier(), false, 2, null) == null) {
                str = this.f4946a.getHandler();
                if (str != null) {
                    str.postDelayed(this.f4946a.f4967r, this.f4946a.f4962m);
                }
            }
        }
    }

    /* renamed from: com.cuvora.carinfo.views.DLScrapeView$j */
    static final class C1653j implements Runnable {
        /* renamed from: a */
        final /* synthetic */ DLScrapeView f4947a;

        C1653j(DLScrapeView dLScrapeView) {
            this.f4947a = dLScrapeView;
        }

        public final void run() {
            this.f4947a.loadUrl(this.f4947a.getUrl());
        }
    }

    /* renamed from: com.cuvora.carinfo.views.DLScrapeView$k */
    public static final class C1654k extends WebViewClient {
        /* renamed from: a */
        final /* synthetic */ DLScrapeView f4948a;

        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return true;
        }

        C1654k(DLScrapeView dLScrapeView) {
            this.f4948a = dLScrapeView;
        }

        public void onPageFinished(WebView webView, String str) {
            C2885g.m13910b(webView, "view");
            C2885g.m13910b(str, ImagesContract.URL);
            super.onPageFinished(webView, str);
            webView = this.f4948a.getHandler();
            if (webView != null) {
                webView.removeCallbacks(this.f4948a.getRetryRunnable$carInfo_release());
            }
            this.f4948a.f4953d = true;
            if (this.f4948a.f4954e != null) {
                this.f4948a.f4954e = null;
                this.f4948a.m6268f();
            }
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            C2885g.m13910b(webView, "view");
            C2885g.m13910b(webResourceRequest, "request");
            C2885g.m13910b(webResourceError, "error");
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (this.f4948a.getRetryCount$carInfo_release() >= 5) {
                this.f4948a.setRetryCount$carInfo_release(0);
                webView = this.f4948a.getHandler();
                if (webView != null) {
                    webView.removeCallbacksAndMessages(null);
                }
                webView = new ErrorResponse();
                webView.setCode(ErrorMode.BACKGROUND_WEBVIEW_LOADING_ERROR.getValue());
                webView.setMessage(this.f4948a.getContext().getString(R.string.web_view_load_error));
                webResourceError = this.f4948a.getCallbacks();
                if (webResourceError != null) {
                    webResourceError.mo5032a(false, webView);
                }
            } else if (this.f4948a.f4953d != null) {
                this.f4948a.setRetryCount$carInfo_release(0);
                webView = this.f4948a.getHandler();
                if (webView != null) {
                    webView.removeCallbacks(this.f4948a.getRetryRunnable$carInfo_release());
                }
            } else {
                webView = this.f4948a;
                webView.setRetryCount$carInfo_release(webView.getRetryCount$carInfo_release() + 1);
                this.f4948a.getRetryRunnable$carInfo_release().run();
            }
        }
    }

    /* renamed from: com.cuvora.carinfo.views.DLScrapeView$l */
    public static final class C1655l extends WebViewClient {
        /* renamed from: a */
        final /* synthetic */ DLScrapeView f4949a;

        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return true;
        }

        C1655l(DLScrapeView dLScrapeView) {
            this.f4949a = dLScrapeView;
        }

        public void onPageFinished(WebView webView, String str) {
            C2885g.m13910b(webView, "view");
            C2885g.m13910b(str, ImagesContract.URL);
            super.onPageFinished(webView, str);
            this.f4949a.m6264d();
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            C2885g.m13910b(webView, "view");
            C2885g.m13910b(webResourceRequest, "request");
            C2885g.m13910b(webResourceError, "error");
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        }
    }

    /* renamed from: com.cuvora.carinfo.views.DLScrapeView$f */
    public static final class C4579f extends C3663b<LicenseDetailsModel> {
        /* renamed from: a */
        final /* synthetic */ DLScrapeView f18975a;

        C4579f(DLScrapeView dLScrapeView) {
            this.f18975a = dLScrapeView;
        }

        /* renamed from: a */
        public void mo3921a(ErrorResponse errorResponse) {
            C2885g.m13910b(errorResponse, "errorResponse");
            C1540d.m5819b("ScrapeApi", "failure");
            Handler handler = this.f18975a.getHandler();
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            C1639a callbacks = this.f18975a.getCallbacks();
            if (callbacks != null) {
                callbacks.mo5032a(false, errorResponse);
            }
        }

        /* renamed from: a */
        public void mo3920a() {
            C1540d.m5819b("ScrapeApi", "No Internet");
            Handler handler = this.f18975a.getHandler();
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            ErrorResponse errorResponse = new ErrorResponse();
            errorResponse.setCode(ErrorMode.NO_INTERNET.getValue());
            errorResponse.setMessage("No internet connection");
            C1639a callbacks = this.f18975a.getCallbacks();
            if (callbacks != null) {
                callbacks.mo5032a(false, errorResponse);
            }
        }

        /* renamed from: a */
        public void m25235a(LicenseDetailsModel licenseDetailsModel) {
            C2885g.m13910b(licenseDetailsModel, "t");
            C1540d.m5819b("ScrapeApi", "Success");
            Handler handler = this.f18975a.getHandler();
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            C1639a callbacks = this.f18975a.getCallbacks();
            if (callbacks != null) {
                callbacks.mo5031a(licenseDetailsModel);
            }
        }

        /* renamed from: a */
        public C0392c<ServerApiResponse<LicenseDetailsModel>> mo1158a(int i, Bundle bundle) {
            String string;
            String string2;
            Object context = this.f18975a.getContext();
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

    public DLScrapeView(Context context, AttributeSet attributeSet) {
        C2885g.m13910b(context, "context");
        super(context, attributeSet);
        Object f = C1570t.m6018f();
        C2885g.m13907a(f, "Utils.getDlTemplateModel()");
        this.f4952c = f;
        this.f4955f = "";
        this.f4956g = "";
        this.f4957h = "";
        this.f4958i = "";
        this.f4959j = "";
        this.f4960k = "";
        this.f4961l = "";
        this.f4962m = 200;
        this.f4963n = 500;
        m6270g();
        m6266e();
        loadUrl(this.f4952c.getUrl());
        this.f4966q = (Runnable) new C1653j(this);
        this.f4967r = (Runnable) new C1651h(this);
        this.f4968s = (Runnable) new C1647e(this);
        this.f4969t = (C3663b) new C4579f(this);
    }

    public final C1639a getCallbacks() {
        return this.f4964o;
    }

    public final void setCallbacks(C1639a c1639a) {
        this.f4964o = c1639a;
    }

    public final int getRetryCount$carInfo_release() {
        return this.f4965p;
    }

    public final void setRetryCount$carInfo_release(int i) {
        this.f4965p = i;
    }

    public final Runnable getRetryRunnable$carInfo_release() {
        return this.f4966q;
    }

    public final void setRetryRunnable$carInfo_release(Runnable runnable) {
        C2885g.m13910b(runnable, "<set-?>");
        this.f4966q = runnable;
    }

    public final Runnable getBackgroundPollRunnable$carInfo_release() {
        return this.f4968s;
    }

    public final void setBackgroundPollRunnable$carInfo_release(Runnable runnable) {
        C2885g.m13910b(runnable, "<set-?>");
        this.f4968s = runnable;
    }

    /* renamed from: c */
    private final void m6262c() {
        evaluateJavascript(this.f4959j, new C1652i(this));
    }

    /* renamed from: a */
    public final void m6282a() {
        m6270g();
        loadUrl(this.f4952c.getUrl());
        setWebViewClient(new C1655l(this));
        C1540d.m5819b("Dl Scraper", "Webview Open");
        this.f4960k = "";
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f4967r);
        }
        handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f4968s);
        }
    }

    /* renamed from: d */
    private final void m6264d() {
        evaluateJavascript(this.f4951b, new C1646d(this));
    }

    /* renamed from: e */
    private final void m6266e() {
        setWebViewClient(new C1654k(this));
    }

    /* renamed from: f */
    private final void m6268f() {
        evaluateJavascript(this.f4951b, new C1650g(this));
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    /* renamed from: g */
    private final void m6270g() {
        Object settings = getSettings();
        C2885g.m13907a(settings, "settings");
        settings.setJavaScriptEnabled(true);
        addJavascriptInterface(new C1644c(this), "HTML_OUT");
    }

    /* renamed from: a */
    public final void m6283a(String str, String str2) {
        C2885g.m13910b(str, "dlNumber");
        C2885g.m13910b(str2, "dob");
        C1540d.m5819b("Dl Scraper", "Webview init");
        m6260b(str);
        m6257a(str2);
        if (m6275j() != null && m6274i() != null) {
            m6271h();
            if (this.f4953d != null) {
                m6268f();
            } else {
                this.f4954e = true;
            }
        }
    }

    /* renamed from: h */
    private final void m6271h() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("javascript: (function(){document.getElementById('");
        stringBuilder.append(this.f4952c.getDlFieldIdentifier());
        stringBuilder.append("').value = '");
        stringBuilder.append(this.f4956g);
        stringBuilder.append("';");
        stringBuilder.append("document.getElementById('");
        stringBuilder.append(this.f4952c.getDlDobIdentifier());
        stringBuilder.append("').value = '");
        stringBuilder.append(this.f4955f);
        stringBuilder.append("';");
        stringBuilder.append("})()");
        this.f4957h = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append("javascript: $(\"button\").each(function(){  if($(this).text() && $(this).text().toLowerCase() == \"");
        stringBuilder.append(this.f4952c.getDlSubmitIdentifier());
        stringBuilder.append("\"){");
        stringBuilder.append("      $(this).click();");
        stringBuilder.append("  }");
        stringBuilder.append("});");
        this.f4958i = stringBuilder.toString();
        this.f4959j = "javascript:window.HTML_OUT.showHTML('<html>'+document.getElementsByTagName('html')[0].innerHTML+'</html>');";
        this.f4961l = "javascript:window.HTMLOUT.showHTMLPOLL('<html>'+document.getElementsByTagName('html')[0].innerHTML+'</html>');";
    }

    /* renamed from: i */
    private final boolean m6274i() {
        return ((CharSequence) this.f4955f).length() > 0;
    }

    /* renamed from: j */
    private final boolean m6275j() {
        return ((CharSequence) this.f4956g).length() > 0;
    }

    /* renamed from: a */
    private final void m6257a(String str) {
        this.f4955f = str;
    }

    /* renamed from: b */
    private final void m6260b(String str) {
        this.f4956g = str;
    }

    /* renamed from: b */
    public final void m6284b() {
        this.f4965p = 0;
        this.f4954e = false;
        this.f4953d = false;
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f4967r);
        }
        handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f4968s);
        }
        handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f4966q);
        }
        destroy();
    }

    public final C3663b<LicenseDetailsModel> getDlLoader() {
        return this.f4969t;
    }
}
