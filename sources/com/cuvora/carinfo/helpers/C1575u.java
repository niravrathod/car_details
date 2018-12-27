package com.cuvora.carinfo.helpers;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.C0363u.C0362a;
import android.support.v4.content.C0392c;
import android.support.v7.app.AppCompatActivity;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.cuvora.carinfo.loaders.C4572p;
import com.cuvora.carinfo.models.MaydayAndResponse;
import com.cuvora.carinfo.models.VehicleSearchResult;
import com.cuvora.carinfo.modes.ScrapeMode;
import com.cuvora.carinfo.views.CustomWebView;
import java.util.regex.Pattern;

/* renamed from: com.cuvora.carinfo.helpers.u */
public class C1575u {
    /* renamed from: d */
    private static C1575u f4725d;
    /* renamed from: A */
    private Handler f4726A = new C15711(this);
    /* renamed from: B */
    private C0362a f4727B = new C37072(this);
    /* renamed from: a */
    private Context f4728a;
    /* renamed from: b */
    private CustomWebView f4729b;
    /* renamed from: c */
    private WebView f4730c;
    /* renamed from: e */
    private long f4731e = 0;
    /* renamed from: f */
    private boolean f4732f;
    /* renamed from: g */
    private String f4733g;
    /* renamed from: h */
    private String f4734h;
    /* renamed from: i */
    private String f4735i;
    /* renamed from: j */
    private String f4736j;
    /* renamed from: k */
    private String f4737k;
    /* renamed from: l */
    private String f4738l;
    /* renamed from: m */
    private String f4739m;
    /* renamed from: n */
    private String f4740n;
    /* renamed from: o */
    private String f4741o;
    /* renamed from: p */
    private int f4742p;
    /* renamed from: q */
    private int f4743q;
    /* renamed from: r */
    private String f4744r;
    /* renamed from: s */
    private String f4745s;
    /* renamed from: t */
    private AppCompatActivity f4746t;
    /* renamed from: u */
    private C1572a f4747u;
    /* renamed from: v */
    private boolean f4748v;
    /* renamed from: w */
    private Handler f4749w;
    /* renamed from: x */
    private String f4750x;
    /* renamed from: y */
    private boolean f4751y;
    /* renamed from: z */
    private boolean f4752z;

    /* renamed from: com.cuvora.carinfo.helpers.u$1 */
    class C15711 extends Handler {
        /* renamed from: a */
        final /* synthetic */ C1575u f4722a;

        C15711(C1575u c1575u) {
            this.f4722a = c1575u;
        }

        public void handleMessage(Message message) {
            if (message.what == 100) {
                this.f4722a.m6067g();
            }
        }
    }

    /* renamed from: com.cuvora.carinfo.helpers.u$a */
    public interface C1572a {
        /* renamed from: a */
        void mo1167a();

        /* renamed from: a */
        void mo1168a(VehicleSearchResult vehicleSearchResult);

        /* renamed from: b */
        void mo1169b();

        /* renamed from: c */
        void mo1170c();

        /* renamed from: d */
        void mo1171d();

        /* renamed from: e */
        void mo1172e();
    }

    /* renamed from: com.cuvora.carinfo.helpers.u$b */
    private class C1573b {
        /* renamed from: a */
        final /* synthetic */ C1575u f4723a;

        public C1573b(C1575u c1575u) {
            this.f4723a = c1575u;
        }

        @JavascriptInterface
        public void processHTML(String str) {
            if (!(this.f4723a.f4752z || this.f4723a.f4746t == null)) {
                if (!this.f4723a.f4746t.isFinishing()) {
                    if (C1562q.m5946a(str) && str.contains(this.f4723a.f4750x)) {
                        this.f4723a.f4748v = true;
                        this.f4723a.f4749w = null;
                        if (this.f4723a.f4747u != null) {
                            this.f4723a.f4747u.mo1172e();
                        }
                        if (this.f4723a.f4751y != null) {
                            this.f4723a.m6081d();
                        }
                    } else if (C1562q.m5946a(str) && C1562q.m5946a(this.f4723a.f4737k) && str.contains(this.f4723a.f4744r)) {
                        this.f4723a.f4748v = true;
                        this.f4723a.f4749w = null;
                        Bundle bundle = new Bundle();
                        bundle.putString("KEY_VEHICLE_NUM", this.f4723a.f4737k);
                        bundle.putString("KEY_HTML_RESULT", str);
                        str = this.f4723a.m6055b(str);
                        if (C1570t.m6001b(str)) {
                            C1570t.m6015e(this.f4723a.f4728a, str);
                        }
                        this.f4723a.f4746t.m28708g().mo264a(1, bundle, this.f4723a.f4727B).m1455m();
                    } else {
                        this.f4723a.m6056b(this.f4723a.f4729b.getWebView());
                    }
                }
            }
        }
    }

    /* renamed from: com.cuvora.carinfo.helpers.u$c */
    private class C1574c extends WebViewClient {
        /* renamed from: a */
        final /* synthetic */ C1575u f4724a;

        private C1574c(C1575u c1575u) {
            this.f4724a = c1575u;
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            this.f4724a.m6063e();
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            this.f4724a.m6063e();
            if (this.f4724a.f4732f != null) {
                this.f4724a.f4732f = false;
                this.f4724a.m6076a(webView);
                return;
            }
            this.f4724a.m6056b(webView);
        }
    }

    /* renamed from: com.cuvora.carinfo.helpers.u$2 */
    class C37072 implements C0362a<MaydayAndResponse> {
        /* renamed from: a */
        final /* synthetic */ C1575u f14935a;

        /* renamed from: a */
        public void mo1159a(C0392c c0392c) {
        }

        C37072(C1575u c1575u) {
            this.f14935a = c1575u;
        }

        /* renamed from: a */
        public C0392c<MaydayAndResponse> mo1158a(int i, Bundle bundle) {
            if (this.f14935a.f4747u != 0) {
                this.f14935a.f4747u.mo1170c();
            }
            return new C4572p(this.f14935a.f4746t, bundle.getString("KEY_VEHICLE_NUM"), bundle.getString("KEY_HTML_RESULT"), ScrapeMode.WEBVIEW.m6088a());
        }

        /* renamed from: a */
        public void m18541a(C0392c c0392c, MaydayAndResponse maydayAndResponse) {
            if (this.f14935a.f4746t != null) {
                if (this.f14935a.f4746t.isFinishing() == null) {
                    if (this.f14935a.f4747u != null) {
                        this.f14935a.f4747u.mo1171d();
                    }
                    VehicleSearchResult vehicleSearchResult = null;
                    if (maydayAndResponse != null) {
                        maydayAndResponse = maydayAndResponse.getResponse();
                        if (maydayAndResponse instanceof VehicleSearchResult) {
                            vehicleSearchResult = (VehicleSearchResult) maydayAndResponse;
                        }
                    }
                    if (vehicleSearchResult != null) {
                        C3688b.m18507a(this.f14935a.f4746t).m18509a(vehicleSearchResult);
                        if (this.f14935a.f4751y != null) {
                            C1540d.m5815b();
                        }
                        C1540d.m5822c(vehicleSearchResult.getVehicleNum());
                        C1570t.m5980a(this.f14935a.f4746t, C1570t.m5973a());
                        C1570t.m6021g(this.f14935a.f4746t);
                        C1540d.m5843o();
                        if (this.f14935a.f4747u != null) {
                            this.f14935a.f4747u.mo1168a(vehicleSearchResult);
                        }
                    } else if (this.f14935a.f4747u != null) {
                        this.f14935a.f4747u.mo1169b();
                    }
                    if (this.f14935a.f4751y != null) {
                        this.f14935a.m6081d();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static C1575u m6049a() {
        if (f4725d == null) {
            f4725d = new C1575u();
        }
        return f4725d;
    }

    /* renamed from: a */
    public void m6075a(Context context) {
        this.f4728a = context;
        this.f4729b = new CustomWebView(context);
        this.f4730c = m6080c();
        this.f4733g = C1541e.m5852a("webview_url");
        this.f4738l = C1541e.m5852a("webview_reg_num_field_1_id");
        this.f4739m = C1541e.m5852a("webview_reg_num_field_2_id");
        this.f4740n = C1541e.m5852a("webView_mob_num_field_id");
        this.f4741o = C1541e.m5852a("webview_otp_field_id");
        this.f4742p = C1541e.m5855b("webview_otp_button_index").intValue();
        this.f4743q = C1541e.m5855b("webview_search_button_index").intValue();
        this.f4744r = C1541e.m5852a("webViewSuccessResponseCheckParam");
        this.f4745s = C1541e.m5852a("webViewOtpFieldVisibleCheckParam");
        this.f4750x = C1541e.m5852a("webview_incorrect_reg_num_msg");
        C1575u.m6049a().m6078a(C1541e.m5852a("webview_url"), true);
    }

    /* renamed from: a */
    public void m6077a(String str, String str2, C1572a c1572a, Activity activity, boolean z) {
        this.f4746t = (AppCompatActivity) activity;
        this.f4736j = str2;
        this.f4737k = str;
        this.f4747u = c1572a;
        this.f4751y = z;
        if (this.f4730c == null) {
            m6075a((Context) activity);
        }
        this.f4732f = C1575u.m6049a().m6078a(this.f4733g, false);
        m6053a(str);
        if (!(C1562q.m5947b(this.f4734h) == null && C1562q.m5947b(this.f4735i) == null)) {
            if (c1572a != null) {
                c1572a.mo1167a();
            }
            if (z) {
                m6081d();
            }
        }
        if (this.f4730c != null) {
            this.f4730c.addJavascriptInterface(new C1573b(this), "HTMLOUT");
            this.f4730c.setWebViewClient(new C1574c());
            if (this.f4732f == null) {
                m6063e();
                m6076a(this.f4730c);
            }
        } else {
            m6067g();
        }
        this.f4726A.sendEmptyMessageDelayed(100, 50000);
    }

    /* renamed from: e */
    private void m6063e() {
        this.f4730c.loadUrl(C1541e.m5852a("js_remove_header_image"));
        this.f4730c.loadUrl(C1541e.m5852a("js_remove_t_and_c"));
    }

    /* renamed from: a */
    private void m6053a(java.lang.String r3) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
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
        r2.f4734h = r0;	 Catch:{ Exception -> 0x001c }
        r0 = r2.f4734h;	 Catch:{ Exception -> 0x001c }
        r1 = "";	 Catch:{ Exception -> 0x001c }
        r0 = r3.replace(r0, r1);	 Catch:{ Exception -> 0x001c }
        r2.f4735i = r0;	 Catch:{ Exception -> 0x001c }
        goto L_0x0021;
    L_0x001c:
        r2.f4734h = r3;
        r3 = 0;
        r2.f4735i = r3;
    L_0x0021:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cuvora.carinfo.helpers.u.a(java.lang.String):void");
    }

    /* renamed from: a */
    public void m6076a(WebView webView) {
        if (C1562q.m5947b(this.f4734h)) {
            this.f4734h = "";
        }
        if (C1562q.m5947b(this.f4735i)) {
            this.f4735i = "";
        }
        if (C1562q.m5947b(this.f4736j)) {
            this.f4736j = "";
        }
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("javascript: (function(){document.getElementById('");
            stringBuilder.append(this.f4738l);
            stringBuilder.append("').value = '");
            stringBuilder.append(this.f4734h);
            stringBuilder.append("';document.getElementById('");
            stringBuilder.append(this.f4739m);
            stringBuilder.append("').value = '");
            stringBuilder.append(this.f4735i);
            stringBuilder.append("';document.getElementById('");
            stringBuilder.append(this.f4740n);
            stringBuilder.append("').value = '");
            stringBuilder.append(this.f4736j);
            stringBuilder.append("';})()");
            webView.loadUrl(stringBuilder.toString());
            String toLowerCase = C1541e.m5852a("webViewOtpButton").toLowerCase();
            if (this.f4751y) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("javascript: $(\"button\").each(function(){  if($(this).text() && $(this).text().toLowerCase() == \"");
                stringBuilder2.append(toLowerCase);
                stringBuilder2.append("\"){      $(this).click();  }});");
                webView.loadUrl(stringBuilder2.toString());
                m6056b(webView);
            }
        } catch (WebView webView2) {
            webView2.printStackTrace();
        }
    }

    /* renamed from: a */
    public boolean m6078a(String str, boolean z) {
        z = m6065f();
        if (this.f4729b) {
            this.f4729b.m6244a(str);
            this.f4731e = System.currentTimeMillis();
            return true;
        } else if (this.f4729b == null || this.f4729b.m6245a() == null) {
            return null;
        } else {
            return true;
        }
    }

    /* renamed from: f */
    private boolean m6065f() {
        return System.currentTimeMillis() - this.f4731e > 3600000;
    }

    /* renamed from: b */
    public CustomWebView m6079b() {
        return this.f4729b;
    }

    /* renamed from: c */
    public WebView m6080c() {
        return this.f4729b != null ? this.f4729b.getWebView() : null;
    }

    /* renamed from: g */
    private void m6067g() {
        this.f4752z = true;
        if (this.f4747u != null) {
            this.f4747u.mo1169b();
        }
        if (this.f4751y) {
            m6081d();
        }
    }

    /* renamed from: b */
    private String m6055b(String str) {
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("(input id=\"");
            stringBuilder.append(this.f4740n);
            stringBuilder.append("\")(.*)(value=\")(\\d+)");
            str = Pattern.compile(stringBuilder.toString()).matcher(str);
            if (str.find()) {
                return str.group(4);
            }
        } catch (String str2) {
            str2.printStackTrace();
        }
        return null;
    }

    /* renamed from: b */
    private void m6056b(WebView webView) {
        if (!(this.f4752z || this.f4746t == null)) {
            if (!this.f4746t.isFinishing()) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                this.f4746t.runOnUiThread(new -$$Lambda$u$IbE7L81h6bFt0--iOFD_9T4HdfY(webView));
            }
        }
    }

    /* renamed from: d */
    public void m6081d() {
        if (this.f4746t != null && this.f4730c != null) {
            this.f4746t.runOnUiThread(new -$$Lambda$u$Dem6vO9673lSuJ-vHrhyHzVvE40());
        }
    }

    /* renamed from: h */
    private /* synthetic */ void m6068h() {
        this.f4730c.removeJavascriptInterface("HTMLOUT");
        this.f4730c.setWebViewClient(null);
        this.f4747u = null;
        this.f4749w = null;
        if (this.f4726A != null) {
            this.f4726A.removeCallbacksAndMessages(null);
        }
    }
}
