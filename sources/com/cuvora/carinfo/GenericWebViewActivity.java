package com.cuvora.carinfo;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.cuvora.carinfo.helpers.C1533a;
import com.cuvora.carinfo.helpers.C1547j;
import com.google.android.gms.ads.AdView;

public class GenericWebViewActivity extends AppCompatActivity {
    /* renamed from: n */
    private AdView f21735n;
    /* renamed from: o */
    private ProgressBar f21736o;
    /* renamed from: p */
    private Button f21737p;
    /* renamed from: q */
    private LinearLayout f21738q;
    /* renamed from: r */
    private RelativeLayout f21739r;
    /* renamed from: s */
    private WebView f21740s;

    /* renamed from: com.cuvora.carinfo.GenericWebViewActivity$2 */
    class C14182 extends WebViewClient {
        /* renamed from: a */
        final /* synthetic */ GenericWebViewActivity f4390a;

        C14182(GenericWebViewActivity genericWebViewActivity) {
            this.f4390a = genericWebViewActivity;
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            webView.loadUrl(str);
            return true;
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            this.f4390a.f21736o.setVisibility(8);
            this.f4390a.f21740s.setVisibility(null);
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (C1547j.m5914d(this.f4390a) == null) {
                this.f4390a.f21739r.setVisibility(8);
                this.f4390a.f21738q.setVisibility(0);
                return;
            }
            this.f4390a.f21736o.setVisibility(8);
            this.f4390a.f21740s.setVisibility(0);
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_generic_web_view);
        m29816a((Toolbar) findViewById(R.id.toolbar));
        mo4973h().mo538b(true);
        mo4973h().mo531a(getIntent().getStringExtra("KEY_WEB_VIEW_TITLE"));
        m29957l();
        final String stringExtra = getIntent().getStringExtra("KEY_WEB_VIEW_URL");
        this.f21737p.setOnClickListener(new OnClickListener(this) {
            /* renamed from: b */
            final /* synthetic */ GenericWebViewActivity f4389b;

            public void onClick(View view) {
                this.f4389b.m29953a(stringExtra);
            }
        });
        m29953a(stringExtra);
    }

    /* renamed from: l */
    private void m29957l() {
        this.f21737p = (Button) findViewById(R.id.btn_try_again);
        this.f21736o = (ProgressBar) findViewById(R.id.progress_bar);
        this.f21738q = (LinearLayout) findViewById(R.id.ll_error);
        this.f21739r = (RelativeLayout) findViewById(R.id.rl_web_view_container);
        this.f21735n = (AdView) findViewById(R.id.adView);
        this.f21740s = (WebView) findViewById(R.id.webview);
        this.f21740s.getSettings().setJavaScriptEnabled(true);
        this.f21740s.setWebViewClient(new C14182(this));
        this.f21740s.setVisibility(8);
    }

    /* renamed from: a */
    private void m29953a(String str) {
        this.f21736o.setVisibility(0);
        this.f21740s.setVisibility(8);
        this.f21739r.setVisibility(0);
        this.f21738q.setVisibility(8);
        this.f21740s.loadUrl(str);
        C1533a.m5787a(this.f21735n, (Context) this);
    }

    protected void onDestroy() {
        this.f21735n.destroy();
        super.onDestroy();
    }
}
