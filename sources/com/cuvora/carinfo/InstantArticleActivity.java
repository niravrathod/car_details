package com.cuvora.carinfo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.TextView;
import com.cuvora.carinfo.helpers.C1533a;
import com.cuvora.carinfo.models.homepage.InstantArticleData;
import com.cuvora.carinfo.views.AsyncImageView;
import com.google.android.gms.ads.AdView;

public class InstantArticleActivity extends AppCompatActivity {
    /* renamed from: n */
    private InstantArticleData f21756n;
    /* renamed from: o */
    private TextView f21757o;
    /* renamed from: p */
    private TextView f21758p;
    /* renamed from: q */
    private WebView f21759q;
    /* renamed from: r */
    private AsyncImageView f21760r;
    /* renamed from: s */
    private AdView f21761s;

    /* renamed from: com.cuvora.carinfo.InstantArticleActivity$1 */
    class C14251 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ InstantArticleActivity f4402a;

        C14251(InstantArticleActivity instantArticleActivity) {
            this.f4402a = instantArticleActivity;
        }

        public void onClick(View view) {
            this.f4402a.onBackPressed();
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_instant_article);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        m29816a(toolbar);
        if (mo4973h() != null) {
            mo4973h().mo538b(true);
        }
        toolbar.setNavigationOnClickListener(new C14251(this));
        this.f21756n = (InstantArticleData) getIntent().getSerializableExtra("KEY_DATA");
        mo4973h().mo531a(this.f21756n.getToolbarTitle());
        m29987l();
        C1533a.m5787a(this.f21761s, (Context) this);
        if (TextUtils.isEmpty(this.f21756n.getImageUrl()) != null) {
            this.f21760r.getLayoutParams().height = getResources().getDimensionPixelSize(R.dimen.dp50);
            this.f21760r.requestLayout();
            this.f21760r.setBackground(null);
        } else {
            this.f21760r.getLayoutParams().height = getResources().getDimensionPixelSize(R.dimen.dp50);
            this.f21760r.requestLayout();
            this.f21760r.setBackground(null);
        }
        m29986a(this.f21756n.getContent());
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (!TextUtils.isEmpty(this.f21756n.getShareText())) {
            menu.add(0, 1, 1, "Share").setIcon(2131165396).setShowAsAction(2);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 1) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", this.f21756n.getShareText());
            intent.putExtra("android.intent.extra.SUBJECT", this.f21756n.getTitle());
            startActivity(intent);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    protected void onDestroy() {
        this.f21761s.destroy();
        super.onDestroy();
    }

    /* renamed from: l */
    private void m29987l() {
        this.f21757o = (TextView) findViewById(R.id.tv_news_title);
        this.f21758p = (TextView) findViewById(R.id.tv_source_date);
        this.f21759q = (WebView) findViewById(R.id.webview_news_detail);
        this.f21760r = (AsyncImageView) findViewById(R.id.iv_news_image);
        this.f21761s = (AdView) findViewById(R.id.adView);
    }

    /* renamed from: a */
    private void m29986a(java.lang.String r9) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r8 = this;
        r0 = "yyyy-MM-dd'T'hh:mm:ss";
        r1 = r8.f21756n;
        r1 = r1.getDate();
        r0 = com.cuvora.carinfo.helpers.C1539c.m5804a(r0, r1);
        r1 = r8.f21758p;
        r2 = "dd MMM, yyyy";
        r0 = com.cuvora.carinfo.helpers.C1539c.m5803a(r0, r2);
        r1.setText(r0);
        r0 = r8.f21757o;
        r1 = r8.f21756n;
        r1 = r1.getTitle();
        r0.setText(r1);
        r0 = r8.f21759q;
        r0 = r0.getSettings();
        r1 = 1;
        r0.setJavaScriptCanOpenWindowsAutomatically(r1);
        r0.setJavaScriptEnabled(r1);
        r1 = 0;
        r0.setSupportZoom(r1);
        r0.setBuiltInZoomControls(r1);
        r1 = android.webkit.WebSettings.PluginState.ON;
        r0.setPluginState(r1);
        r1 = android.webkit.WebSettings.LayoutAlgorithm.SINGLE_COLUMN;
        r0.setLayoutAlgorithm(r1);
        r2 = r8.f21759q;	 Catch:{ OutOfMemoryError -> 0x005d }
        r3 = "http://www.ixigo.com";	 Catch:{ OutOfMemoryError -> 0x005d }
        r0 = new java.lang.StringBuilder;	 Catch:{ OutOfMemoryError -> 0x005d }
        r0.<init>();	 Catch:{ OutOfMemoryError -> 0x005d }
        r1 = "<style>img{display: inline;height: auto;max-width: 100%;} table {display: inline;border: 1px solid black; max-width: 100%;}</style>";	 Catch:{ OutOfMemoryError -> 0x005d }
        r0.append(r1);	 Catch:{ OutOfMemoryError -> 0x005d }
        r0.append(r9);	 Catch:{ OutOfMemoryError -> 0x005d }
        r4 = r0.toString();	 Catch:{ OutOfMemoryError -> 0x005d }
        r5 = "text/html";	 Catch:{ OutOfMemoryError -> 0x005d }
        r6 = "UTF-8";	 Catch:{ OutOfMemoryError -> 0x005d }
        r7 = 0;	 Catch:{ OutOfMemoryError -> 0x005d }
        r2.loadDataWithBaseURL(r3, r4, r5, r6, r7);	 Catch:{ OutOfMemoryError -> 0x005d }
    L_0x005d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cuvora.carinfo.InstantArticleActivity.a(java.lang.String):void");
    }
}
