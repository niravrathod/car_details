package com.cuvora.carinfo.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.C0363u.C0362a;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.C0392c;
import android.util.AttributeSet;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.cuvora.carinfo.helpers.C1540d;
import com.cuvora.carinfo.helpers.C1541e;
import com.cuvora.carinfo.helpers.C1562q;
import com.cuvora.carinfo.helpers.C1570t;
import com.cuvora.carinfo.helpers.C3688b;
import com.cuvora.carinfo.loaders.C4572p;
import com.cuvora.carinfo.models.ErrorResponse;
import com.cuvora.carinfo.models.MaydayAndResponse;
import com.cuvora.carinfo.models.VehicleSearchResult;
import com.cuvora.carinfo.modes.ScrapeMode;

public class ScrapeView extends WebView {
    /* renamed from: A */
    private C0362a f5021A;
    /* renamed from: a */
    Runnable f5022a;
    /* renamed from: b */
    Runnable f5023b;
    /* renamed from: c */
    int f5024c;
    /* renamed from: d */
    Runnable f5025d;
    /* renamed from: e */
    private String f5026e;
    /* renamed from: f */
    private String f5027f;
    /* renamed from: g */
    private String f5028g;
    /* renamed from: h */
    private String f5029h;
    /* renamed from: i */
    private String f5030i;
    /* renamed from: j */
    private String f5031j;
    /* renamed from: k */
    private String f5032k;
    /* renamed from: l */
    private boolean f5033l;
    /* renamed from: m */
    private boolean f5034m;
    /* renamed from: n */
    private String f5035n;
    /* renamed from: o */
    private String f5036o;
    /* renamed from: p */
    private String f5037p;
    /* renamed from: q */
    private String f5038q;
    /* renamed from: r */
    private Handler f5039r;
    /* renamed from: s */
    private String f5040s;
    /* renamed from: t */
    private String f5041t;
    /* renamed from: u */
    private C1679a f5042u;
    /* renamed from: v */
    private String f5043v;
    /* renamed from: w */
    private String f5044w;
    /* renamed from: x */
    private String f5045x;
    /* renamed from: y */
    private long f5046y;
    /* renamed from: z */
    private long f5047z;

    /* renamed from: com.cuvora.carinfo.views.ScrapeView$1 */
    class C16691 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ ScrapeView f5000a;

        C16691(ScrapeView scrapeView) {
            this.f5000a = scrapeView;
        }

        public void run() {
            this.f5000a.m6341d();
        }
    }

    /* renamed from: com.cuvora.carinfo.views.ScrapeView$2 */
    class C16712 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ ScrapeView f5002a;

        /* renamed from: com.cuvora.carinfo.views.ScrapeView$2$1 */
        class C16701 implements ValueCallback<String> {
            /* renamed from: a */
            final /* synthetic */ C16712 f5001a;

            /* renamed from: a */
            public void m6318a(String str) {
            }

            C16701(C16712 c16712) {
                this.f5001a = c16712;
            }

            public /* synthetic */ void onReceiveValue(Object obj) {
                m6318a((String) obj);
            }
        }

        C16712(ScrapeView scrapeView) {
            this.f5002a = scrapeView;
        }

        public void run() {
            this.f5002a.evaluateJavascript(this.f5002a.f5037p, new C16701(this));
        }
    }

    /* renamed from: com.cuvora.carinfo.views.ScrapeView$3 */
    class C16723 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ ScrapeView f5003a;

        C16723(ScrapeView scrapeView) {
            this.f5003a = scrapeView;
        }

        public void run() {
            this.f5003a.loadUrl(this.f5003a.f5026e);
        }
    }

    /* renamed from: com.cuvora.carinfo.views.ScrapeView$4 */
    class C16744 implements ValueCallback<String> {
        /* renamed from: a */
        final /* synthetic */ ScrapeView f5006a;

        C16744(ScrapeView scrapeView) {
            this.f5006a = scrapeView;
        }

        public /* synthetic */ void onReceiveValue(Object obj) {
            m6319a((String) obj);
        }

        /* renamed from: a */
        public void m6319a(String str) {
            if (C1562q.m5946a(this.f5006a.f5045x) == null || this.f5006a.f5045x.contains(this.f5006a.f5029h) == null) {
                this.f5006a.f5039r.postDelayed(this.f5006a.f5022a, this.f5006a.f5046y);
                return;
            }
            str = new Bundle();
            str.putString("KEY_VEHICLE_NUM", this.f5006a.f5044w);
            str.putString("KEY_HTML_RESULT", this.f5006a.f5045x);
            this.f5006a.f5039r.post(new Runnable(this) {
                /* renamed from: b */
                final /* synthetic */ C16744 f5005b;

                public void run() {
                    ((FragmentActivity) this.f5005b.f5006a.getContext()).m28708g().mo264a(1, str, this.f5005b.f5006a.f5021A).m1455m();
                }
            });
            this.f5006a.f5039r.removeCallbacks(this.f5006a.f5022a);
        }
    }

    /* renamed from: com.cuvora.carinfo.views.ScrapeView$5 */
    class C16775 implements ValueCallback<String> {
        /* renamed from: a */
        final /* synthetic */ ScrapeView f5009a;

        /* renamed from: com.cuvora.carinfo.views.ScrapeView$5$1 */
        class C16761 implements ValueCallback<String> {
            /* renamed from: a */
            final /* synthetic */ C16775 f5008a;

            /* renamed from: com.cuvora.carinfo.views.ScrapeView$5$1$1 */
            class C16751 implements ValueCallback<String> {
                /* renamed from: a */
                final /* synthetic */ C16761 f5007a;

                C16751(C16761 c16761) {
                    this.f5007a = c16761;
                }

                public /* synthetic */ void onReceiveValue(Object obj) {
                    m6320a((String) obj);
                }

                /* renamed from: a */
                public void m6320a(String str) {
                    this.f5007a.f5008a.f5009a.f5023b.run();
                }
            }

            C16761(C16775 c16775) {
                this.f5008a = c16775;
            }

            public /* synthetic */ void onReceiveValue(Object obj) {
                m6321a((String) obj);
            }

            /* renamed from: a */
            public void m6321a(String str) {
                this.f5008a.f5009a.evaluateJavascript(this.f5008a.f5009a.f5036o, new C16751(this));
            }
        }

        C16775(ScrapeView scrapeView) {
            this.f5009a = scrapeView;
        }

        public /* synthetic */ void onReceiveValue(Object obj) {
            m6322a((String) obj);
        }

        /* renamed from: a */
        public void m6322a(String str) {
            this.f5009a.evaluateJavascript(this.f5009a.f5035n, new C16761(this));
        }
    }

    /* renamed from: com.cuvora.carinfo.views.ScrapeView$6 */
    class C16786 extends WebViewClient {
        /* renamed from: a */
        final /* synthetic */ ScrapeView f5010a;

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return true;
        }

        C16786(ScrapeView scrapeView) {
            this.f5010a = scrapeView;
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            this.f5010a.f5039r.removeCallbacks(this.f5010a.f5025d);
            this.f5010a.f5033l = true;
            if (this.f5010a.f5034m != null) {
                this.f5010a.f5034m = null;
                this.f5010a.m6347g();
            }
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (this.f5010a.f5024c >= 5) {
                this.f5010a.f5024c = 0;
                if (this.f5010a.f5042u != null) {
                    this.f5010a.f5042u.mo1182h();
                }
            } else if (this.f5010a.f5033l != null) {
                this.f5010a.f5024c = 0;
                this.f5010a.f5039r.removeCallbacks(this.f5010a.f5025d);
            } else {
                webView = this.f5010a;
                webView.f5024c++;
                this.f5010a.f5025d.run();
            }
        }
    }

    /* renamed from: com.cuvora.carinfo.views.ScrapeView$a */
    public interface C1679a {
        /* renamed from: a */
        void mo1173a();

        /* renamed from: a */
        void mo1174a(ErrorResponse errorResponse);

        /* renamed from: a */
        void mo1175a(VehicleSearchResult vehicleSearchResult);

        /* renamed from: b */
        void mo1176b();

        /* renamed from: c */
        void mo1177c();

        /* renamed from: d */
        void mo1178d();

        /* renamed from: e */
        void mo1179e();

        /* renamed from: f */
        void mo1180f();

        /* renamed from: g */
        void mo1181g();

        /* renamed from: h */
        void mo1182h();
    }

    /* renamed from: com.cuvora.carinfo.views.ScrapeView$b */
    class C1684b {
        /* renamed from: a */
        int f5018a = null;
        /* renamed from: b */
        int f5019b = C1541e.m5855b("maxPollingCount").intValue();
        /* renamed from: c */
        final /* synthetic */ ScrapeView f5020c;

        /* renamed from: com.cuvora.carinfo.views.ScrapeView$b$4 */
        class C16834 implements Runnable {
            /* renamed from: a */
            final /* synthetic */ C1684b f5017a;

            C16834(C1684b c1684b) {
                this.f5017a = c1684b;
            }

            public void run() {
                this.f5017a.f5020c.f5023b.run();
            }
        }

        C1684b(ScrapeView scrapeView) {
            this.f5020c = scrapeView;
        }

        @JavascriptInterface
        public void showHTML(String str) {
            final Bundle bundle;
            if (C1562q.m5946a(str) && str.contains(this.f5020c.f5029h)) {
                this.f5018a = 0;
                bundle = new Bundle();
                bundle.putString("KEY_VEHICLE_NUM", this.f5020c.f5044w);
                bundle.putString("KEY_HTML_RESULT", str);
                this.f5020c.f5039r.post(new Runnable(this) {
                    /* renamed from: b */
                    final /* synthetic */ C1684b f5012b;

                    public void run() {
                        ((FragmentActivity) this.f5012b.f5020c.getContext()).m28708g().mo264a(1, bundle, this.f5012b.f5020c.f5021A).m1455m();
                    }
                });
            } else if (C1562q.m5946a(str) && str.contains(this.f5020c.f5031j)) {
                if (this.f5020c.f5042u != null) {
                    this.f5020c.f5042u.mo1181g();
                }
                this.f5018a = 0;
                bundle = new Bundle();
                bundle.putString("KEY_VEHICLE_NUM", this.f5020c.f5044w);
                bundle.putString("KEY_HTML_RESULT", str);
                this.f5020c.f5039r.post(new Runnable(this) {
                    /* renamed from: b */
                    final /* synthetic */ C1684b f5014b;

                    public void run() {
                        ((FragmentActivity) this.f5014b.f5020c.getContext()).m28708g().mo264a(1, bundle, this.f5014b.f5020c.f5021A).m1455m();
                    }
                });
            } else if (C1562q.m5946a(str) && str.contains(this.f5020c.f5030i)) {
                if (this.f5020c.f5042u != null) {
                    this.f5020c.f5042u.mo1177c();
                }
                this.f5018a = 0;
                bundle = new Bundle();
                bundle.putString("KEY_VEHICLE_NUM", this.f5020c.f5044w);
                bundle.putString("KEY_HTML_RESULT", str);
                this.f5020c.f5039r.post(new Runnable(this) {
                    /* renamed from: b */
                    final /* synthetic */ C1684b f5016b;

                    public void run() {
                        ((FragmentActivity) this.f5016b.f5020c.getContext()).m28708g().mo264a(1, bundle, this.f5016b.f5020c.f5021A).m1455m();
                    }
                });
            } else {
                if (this.f5018a < this.f5019b) {
                    this.f5018a++;
                    this.f5020c.f5039r.postDelayed(new C16834(this), this.f5020c.f5047z);
                } else {
                    if (this.f5020c.f5042u != null) {
                        this.f5020c.f5042u.mo1180f();
                    }
                    this.f5018a = 0;
                }
            }
        }

        @JavascriptInterface
        public void showHTMLPOLL(String str) {
            this.f5020c.f5045x = str;
        }
    }

    /* renamed from: com.cuvora.carinfo.views.ScrapeView$7 */
    class C37407 implements C0362a<MaydayAndResponse> {
        /* renamed from: a */
        final /* synthetic */ ScrapeView f15011a;

        /* renamed from: a */
        public void mo1159a(C0392c c0392c) {
        }

        C37407(ScrapeView scrapeView) {
            this.f15011a = scrapeView;
        }

        /* renamed from: a */
        public C0392c<MaydayAndResponse> mo1158a(int i, Bundle bundle) {
            if (this.f15011a.f5042u != 0) {
                this.f15011a.f5042u.mo1178d();
            }
            return new C4572p(this.f15011a.getContext(), bundle.getString("KEY_VEHICLE_NUM"), bundle.getString("KEY_HTML_RESULT"), ScrapeMode.WEBVIEW.m6088a());
        }

        /* renamed from: a */
        public void m18655a(C0392c c0392c, MaydayAndResponse maydayAndResponse) {
            if (this.f15011a.getContext() != null) {
                if (((FragmentActivity) this.f15011a.getContext()).isFinishing() == null) {
                    if (this.f15011a.f5042u != null) {
                        this.f15011a.f5042u.mo1179e();
                    }
                    if (maydayAndResponse == null || maydayAndResponse.getResponse() == null || (maydayAndResponse.getResponse() instanceof ErrorResponse) == null) {
                        VehicleSearchResult vehicleSearchResult = null;
                        if (maydayAndResponse != null) {
                            maydayAndResponse = maydayAndResponse.getResponse();
                            if (maydayAndResponse instanceof VehicleSearchResult) {
                                vehicleSearchResult = (VehicleSearchResult) maydayAndResponse;
                            }
                        }
                        if (vehicleSearchResult != null) {
                            C3688b.m18507a(this.f15011a.getContext()).m18509a(vehicleSearchResult);
                            C1540d.m5815b();
                            C1540d.m5822c(vehicleSearchResult.getVehicleNum());
                            C1570t.m5980a(this.f15011a.getContext(), C1570t.m5973a());
                            C1570t.m6021g(this.f15011a.getContext());
                            C1540d.m5843o();
                            if (this.f15011a.f5042u != null) {
                                this.f15011a.f5042u.mo1175a(vehicleSearchResult);
                            }
                        } else if (this.f15011a.f5042u != null) {
                            this.f15011a.f5042u.mo1176b();
                        }
                        return;
                    }
                    if (this.f15011a.f5042u != null) {
                        this.f15011a.f5042u.mo1174a((ErrorResponse) maydayAndResponse.getResponse());
                    }
                }
            }
        }
    }

    public void onPause() {
    }

    public void setListener(C1679a c1679a) {
        this.f5042u = c1679a;
    }

    public ScrapeView(Context context) {
        this(context, null);
    }

    public ScrapeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrapeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5039r = new Handler();
        this.f5046y = 100;
        this.f5047z = 500;
        this.f5022a = new C16691(this);
        this.f5023b = new C16712(this);
        this.f5024c = null;
        this.f5025d = new C16723(this);
        this.f5021A = new C37407(this);
        m6362b();
    }

    /* renamed from: a */
    public void m6360a() {
        this.f5045x = "";
        this.f5039r.postDelayed(this.f5022a, this.f5046y);
    }

    /* renamed from: d */
    private void m6341d() {
        evaluateJavascript(this.f5038q, new C16744(this));
    }

    /* renamed from: b */
    public void m6362b() {
        this.f5024c = 0;
        this.f5026e = C1541e.m5852a("webview_url");
        this.f5027f = C1541e.m5852a("webview_reg_num_field_1_id");
        this.f5028g = C1541e.m5852a("webview_reg_num_field_2_id");
        this.f5029h = C1541e.m5852a("webViewSuccessResponseCheckParam");
        this.f5030i = C1541e.m5852a("webview_incorrect_reg_num_msg");
        this.f5031j = C1541e.m5852a("webviewMultipleRecordsError");
        this.f5032k = C1541e.m5852a("js_remove_t_and_c");
        this.f5043v = C1541e.m5852a("webViewSearchButton").toLowerCase();
        m6349h();
    }

    /* renamed from: a */
    public void m6361a(String str) {
        m6337b(str);
        if (m6345f()) {
            this.f5044w = str;
            m6343e();
        }
        if (this.f5033l != null) {
            m6347g();
        } else {
            this.f5034m = true;
        }
    }

    /* renamed from: e */
    private void m6343e() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("javascript: (function(){document.getElementById('");
        stringBuilder.append(this.f5027f);
        stringBuilder.append("').value = '");
        stringBuilder.append(this.f5040s);
        stringBuilder.append("';document.getElementById('");
        stringBuilder.append(this.f5028g);
        stringBuilder.append("').value = '");
        stringBuilder.append(this.f5041t);
        stringBuilder.append("';})()");
        this.f5035n = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append("javascript: $(\"button\").each(function(){  if($(this).text() && $(this).text().toLowerCase() == \"");
        stringBuilder.append(this.f5043v);
        stringBuilder.append("\"){      $(this).click();  }});");
        this.f5036o = stringBuilder.toString();
        this.f5037p = "javascript:window.HTMLOUT.showHTML('<html>'+document.getElementsByTagName('html')[0].innerHTML+'</html>');";
        this.f5038q = "javascript:window.HTMLOUT.showHTMLPOLL('<html>'+document.getElementsByTagName('html')[0].innerHTML+'</html>');";
    }

    /* renamed from: f */
    private boolean m6345f() {
        if (!C1562q.m5947b(this.f5040s)) {
            if (!C1562q.m5947b(this.f5041t)) {
                return true;
            }
        }
        if (this.f5042u != null) {
            this.f5042u.mo1173a();
        }
        return false;
    }

    /* renamed from: g */
    private void m6347g() {
        evaluateJavascript(this.f5032k, new C16775(this));
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    /* renamed from: h */
    private void m6349h() {
        getSettings().setJavaScriptEnabled(true);
        addJavascriptInterface(new C1684b(this), "HTMLOUT");
        loadUrl(this.f5026e);
        setWebViewClient(new C16786(this));
    }

    /* renamed from: b */
    private void m6337b(java.lang.String r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r2 = this;
        r0 = com.cuvora.carinfo.helpers.C1562q.m5946a(r3);
        if (r0 == 0) goto L_0x0021;
    L_0x0006:
        r0 = "\\d*$";	 Catch:{ Exception -> 0x001c }
        r0 = r3.split(r0);	 Catch:{ Exception -> 0x001c }
        r1 = 0;	 Catch:{ Exception -> 0x001c }
        r0 = r0[r1];	 Catch:{ Exception -> 0x001c }
        r2.f5040s = r0;	 Catch:{ Exception -> 0x001c }
        r0 = r2.f5040s;	 Catch:{ Exception -> 0x001c }
        r1 = "";	 Catch:{ Exception -> 0x001c }
        r0 = r3.replace(r0, r1);	 Catch:{ Exception -> 0x001c }
        r2.f5041t = r0;	 Catch:{ Exception -> 0x001c }
        goto L_0x0021;
    L_0x001c:
        r2.f5040s = r3;
        r3 = 0;
        r2.f5041t = r3;
    L_0x0021:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cuvora.carinfo.views.ScrapeView.b(java.lang.String):void");
    }

    /* renamed from: c */
    public void m6363c() {
        this.f5024c = 0;
        this.f5034m = false;
        this.f5033l = false;
        this.f5039r.removeCallbacks(this.f5022a);
        this.f5039r.removeCallbacks(this.f5023b);
        this.f5039r.removeCallbacks(this.f5025d);
        destroy();
    }
}
