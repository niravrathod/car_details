package com.facebook.ads.internal.adapters;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.Handler;
import android.provider.Settings.System;
import android.support.v4.content.C0396d;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.C1700b;
import com.facebook.ads.internal.adapters.p082a.C1736k;
import com.facebook.ads.internal.p085d.C1774a;
import com.facebook.ads.internal.p085d.C1779b;
import com.facebook.ads.internal.p089h.C1804d;
import com.facebook.ads.internal.p093l.C1820a;
import com.facebook.ads.internal.settings.C1963a.C1962a;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.adapters.w */
public class C4598w extends C3770j {
    /* renamed from: c */
    private static final String f19101c = "w";
    /* renamed from: d */
    private static final int[] f19102d = new int[]{-1, -6, -7, -8};
    /* renamed from: e */
    private final String f19103e = UUID.randomUUID().toString();
    /* renamed from: f */
    private Context f19104f;
    /* renamed from: g */
    private C1748l f19105g;
    /* renamed from: h */
    private boolean f19106h = false;
    /* renamed from: i */
    private String f19107i;
    /* renamed from: j */
    private String f19108j;
    /* renamed from: k */
    private long f19109k;
    /* renamed from: l */
    private C1736k f19110l;
    /* renamed from: m */
    private ad f19111m;

    /* renamed from: a */
    private void m25419a(Context context, final boolean z) {
        if (C1820a.m6851f(context)) {
            Log.d(f19101c, "Playable Ads pre-caching is disabled.");
            this.f19106h = true;
            this.f19105g.mo1301a(this);
            return;
        }
        WebView webView = new WebView(context);
        webView.getSettings().setCacheMode(1);
        webView.setWebViewClient(new WebViewClient(this) {
            /* renamed from: a */
            boolean f5304a = false;
            /* renamed from: c */
            final /* synthetic */ C4598w f5306c;

            /* renamed from: com.facebook.ads.internal.adapters.w$1$1 */
            class C17581 implements Runnable {
                /* renamed from: a */
                final /* synthetic */ C17591 f5303a;

                C17581(C17591 c17591) {
                    this.f5303a = c17591;
                }

                public void run() {
                    if (!this.f5303a.f5304a) {
                        this.f5303a.m6645a(null);
                    }
                }
            }

            /* renamed from: a */
            private void m6644a() {
                this.f5306c.f19106h = true;
                this.f5306c.f19105g.mo1301a(this.f5306c);
            }

            /* renamed from: a */
            private void m6645a(WebResourceError webResourceError) {
                if (!z) {
                    if (this.f5306c.m25420a(webResourceError)) {
                        m6644a();
                        return;
                    }
                }
                this.f5306c.f19105g.mo1302a(this.f5306c, C1700b.f5124f);
            }

            public void onPageFinished(WebView webView, String str) {
                this.f5304a = true;
                m6644a();
            }

            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                super.onPageStarted(webView, str, bitmap);
                new Handler().postDelayed(new C17581(this), 10000);
            }

            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                this.f5304a = true;
                m6645a(webResourceError);
            }
        });
        webView.loadUrl(this.f19110l.m6581e().m6512j().m6567a());
    }

    /* renamed from: a */
    private boolean m25420a(WebResourceError webResourceError) {
        if (webResourceError != null) {
            if (VERSION.SDK_INT >= 23) {
                for (int i : f19102d) {
                    if (webResourceError.getErrorCode() == i) {
                        return true;
                    }
                }
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private void m25424b(Context context, final boolean z) {
        final C1779b c1779b = new C1779b(context);
        c1779b.m6688a(this.f19110l.m6581e().m6502a());
        c1779b.m6689a(this.f19110l.m6581e().m6509g(), this.f19110l.m6581e().m6511i(), this.f19110l.m6581e().m6510h());
        c1779b.m6689a(this.f19110l.m6574a().m6564b(), -1, -1);
        for (String a : this.f19110l.m6582f().m6538d()) {
            c1779b.m6689a(a, -1, -1);
        }
        c1779b.m6687a(new C1774a(this) {
            /* renamed from: c */
            final /* synthetic */ C4598w f15172c;

            /* renamed from: c */
            private void m18933c() {
                this.f15172c.f19106h = true;
                this.f15172c.f19105g.mo1301a(this.f15172c);
                this.f15172c.f19110l.m6578b(c1779b.m6690b(this.f15172c.f19110l.m6581e().m6502a()));
            }

            /* renamed from: a */
            public void mo1334a() {
                m18933c();
            }

            /* renamed from: b */
            public void mo1335b() {
                if (z) {
                    this.f15172c.f19105g.mo1302a(this.f15172c, C1700b.f5124f);
                } else {
                    m18933c();
                }
            }
        });
    }

    /* renamed from: c */
    private boolean m25425c() {
        return this.f19110l.m6581e().m6512j() != null;
    }

    /* renamed from: f */
    private void m25426f() {
        C0396d.m1465a(this.f19104f).m1469a(this.f19111m, this.f19111m.m6587a());
    }

    /* renamed from: g */
    private void m25427g() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = r2.f19111m;
        if (r0 == 0) goto L_0x000f;
    L_0x0004:
        r0 = r2.f19104f;	 Catch:{ Exception -> 0x000f }
        r0 = android.support.v4.content.C0396d.m1465a(r0);	 Catch:{ Exception -> 0x000f }
        r1 = r2.f19111m;	 Catch:{ Exception -> 0x000f }
        r0.m1468a(r1);	 Catch:{ Exception -> 0x000f }
    L_0x000f:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.adapters.w.g():void");
    }

    /* renamed from: h */
    private String m25428h() {
        if (this.a == null) {
            return null;
        }
        Uri parse;
        Builder builder;
        String a = AdSettings.m6374a();
        if (a != null) {
            if (!a.isEmpty()) {
                a = String.format("https://www.%s.facebook.com/audience_network/server_side_reward", new Object[]{a});
                parse = Uri.parse(a);
                builder = new Builder();
                builder.scheme(parse.getScheme());
                builder.authority(parse.getAuthority());
                builder.path(parse.getPath());
                builder.query(parse.getQuery());
                builder.fragment(parse.getFragment());
                builder.appendQueryParameter("puid", this.a.m7645a());
                builder.appendQueryParameter("pc", this.a.m7646b());
                builder.appendQueryParameter("ptid", this.f19103e);
                builder.appendQueryParameter("appid", this.f19107i);
                return builder.build().toString();
            }
        }
        a = "https://www.facebook.com/audience_network/server_side_reward";
        parse = Uri.parse(a);
        builder = new Builder();
        builder.scheme(parse.getScheme());
        builder.authority(parse.getAuthority());
        builder.path(parse.getPath());
        builder.query(parse.getQuery());
        builder.fragment(parse.getFragment());
        builder.appendQueryParameter("puid", this.a.m7645a());
        builder.appendQueryParameter("pc", this.a.m7646b());
        builder.appendQueryParameter("ptid", this.f19103e);
        builder.appendQueryParameter("appid", this.f19107i);
        return builder.build().toString();
    }

    /* renamed from: a */
    public void mo3973a(Context context, C1748l c1748l, Map<String, Object> map, boolean z) {
        this.f19104f = context;
        this.f19105g = c1748l;
        this.f19106h = false;
        this.f19108j = (String) map.get("placementId");
        this.f19109k = ((Long) map.get("requestTime")).longValue();
        int k = ((C1804d) map.get("definition")).m6804k();
        this.f19107i = this.f19108j != null ? this.f19108j.split("_")[0] : "";
        this.f19110l = C1736k.m6570a((JSONObject) map.get("data"));
        this.f19110l.m6575a(k);
        if (!TextUtils.isEmpty(this.f19110l.m6581e().m6502a()) || m25425c()) {
            this.f19111m = new ad(this.f19103e, this, c1748l);
            m25426f();
            if (m25425c()) {
                m25419a(context, z);
            } else {
                m25424b(context, z);
            }
            return;
        }
        this.f19105g.mo1302a(this, C1700b.f5123e);
    }

    /* renamed from: a */
    public boolean mo3974a() {
        if (!this.f19106h) {
            return false;
        }
        int i;
        String h = m25428h();
        this.f19110l.m6576a(h);
        Intent intent = new Intent(this.f19104f, AudienceNetworkActivity.class);
        intent.putExtra("viewType", C1962a.REWARDED_VIDEO);
        intent.putExtra("rewardedVideoAdDataBundle", this.f19110l);
        intent.putExtra("uniqueId", this.f19103e);
        intent.putExtra("rewardServerURL", h);
        intent.putExtra("placementId", this.f19108j);
        intent.putExtra("requestTime", this.f19109k);
        if (this.b == -1 || System.getInt(this.f19104f.getContentResolver(), "accelerometer_rotation", 0) == 1) {
            if (!C1820a.m6861p(this.f19104f)) {
                h = "predefinedOrientationKey";
                i = 6;
            }
            if (!(this.f19104f instanceof Activity)) {
                intent.setFlags(intent.getFlags() | 268435456);
            }
            this.f19104f.startActivity(intent);
            return true;
        }
        h = "predefinedOrientationKey";
        i = this.b;
        intent.putExtra(h, i);
        if (this.f19104f instanceof Activity) {
            intent.setFlags(intent.getFlags() | 268435456);
        }
        this.f19104f.startActivity(intent);
        return true;
    }

    /* renamed from: b */
    public int mo3975b() {
        return this.f19110l == null ? -1 : this.f19110l.m6581e().m6506d();
    }

    /* renamed from: e */
    public void mo3946e() {
        m25427g();
    }
}
