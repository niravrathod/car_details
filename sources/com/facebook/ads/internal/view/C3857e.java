package com.facebook.ads.internal.view;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.adapters.C1750n;
import com.facebook.ads.internal.adapters.C3791z;
import com.facebook.ads.internal.adapters.aa;
import com.facebook.ads.internal.p081a.C1712b;
import com.facebook.ads.internal.p081a.C1713c;
import com.facebook.ads.internal.p091j.C1812a;
import com.facebook.ads.internal.p091j.C1812a.C1810a;
import com.facebook.ads.internal.p091j.C1813b;
import com.facebook.ads.internal.p094m.C1827c;
import com.facebook.ads.internal.p101q.p102a.C1921k;
import com.facebook.ads.internal.p101q.p104c.C1945b;
import com.facebook.ads.internal.view.C1980a.C1965a;
import com.facebook.ads.internal.view.p109b.C3835a;
import com.facebook.ads.internal.view.p109b.C3835a.C1982b;
import com.facebook.ads.internal.view.p109b.C3835a.C3834c;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.view.e */
public class C3857e implements C1980a {
    /* renamed from: a */
    private static final String f15383a = "e";
    /* renamed from: b */
    private final C1965a f15384b;
    /* renamed from: c */
    private final C3835a f15385c;
    /* renamed from: d */
    private final C1982b f15386d;
    /* renamed from: e */
    private final aa f15387e;
    /* renamed from: f */
    private final C1827c f15388f;
    /* renamed from: g */
    private C3791z f15389g;
    /* renamed from: h */
    private long f15390h = System.currentTimeMillis();
    /* renamed from: i */
    private long f15391i;
    /* renamed from: j */
    private C1810a f15392j;

    /* renamed from: com.facebook.ads.internal.view.e$2 */
    class C38522 extends C1750n {
        /* renamed from: a */
        final /* synthetic */ C3857e f15377a;

        C38522(C3857e c3857e) {
            this.f15377a = c3857e;
        }

        /* renamed from: a */
        public void mo1339a() {
            this.f15377a.f15384b.mo1280a("com.facebook.ads.interstitial.impression.logged");
        }
    }

    public C3857e(final AudienceNetworkActivity audienceNetworkActivity, final C1827c c1827c, C1965a c1965a) {
        this.f15384b = c1965a;
        this.f15388f = c1827c;
        this.f15386d = new C3834c(this) {
            /* renamed from: c */
            final /* synthetic */ C3857e f19158c;
            /* renamed from: d */
            private long f19159d = 0;

            /* renamed from: a */
            public void mo1415a() {
                this.f19158c.f15387e.m18846b();
            }

            /* renamed from: a */
            public void mo1418a(String str, Map<String, String> map) {
                Uri parse = Uri.parse(str);
                if ("fbad".equals(parse.getScheme()) && "close".equals(parse.getAuthority())) {
                    audienceNetworkActivity.finish();
                    return;
                }
                long j = this.f19159d;
                this.f19159d = System.currentTimeMillis();
                if (this.f19159d - j >= 1000) {
                    if ("fbad".equals(parse.getScheme()) && C1713c.m6463a(parse.getAuthority())) {
                        this.f19158c.f15384b.mo1280a("com.facebook.ads.interstitial.clicked");
                    }
                    C1712b a = C1713c.m6462a(audienceNetworkActivity, c1827c, this.f19158c.f15389g.mo1346c(), parse, map);
                    if (a != null) {
                        try {
                            this.f19158c.f15392j = a.mo1329a();
                            this.f19158c.f15391i = System.currentTimeMillis();
                            a.mo1328b();
                        } catch (Throwable e) {
                            Log.e(C3857e.f15383a, "Error executing action", e);
                        }
                    }
                }
            }

            /* renamed from: b */
            public void mo1419b() {
                this.f19158c.f15387e.m6633a();
            }
        };
        this.f15385c = new C3835a(audienceNetworkActivity, new WeakReference(this.f15386d), 1);
        this.f15385c.setLayoutParams(new LayoutParams(-1, -1));
        Context context = audienceNetworkActivity;
        C1827c c1827c2 = c1827c;
        this.f15387e = new aa(context, c1827c2, this.f15385c, this.f15385c.getViewabilityChecker(), new C38522(this));
        c1965a.mo1279a(this.f15385c);
    }

    /* renamed from: a */
    public void mo1420a(Intent intent, Bundle bundle, AudienceNetworkActivity audienceNetworkActivity) {
        if (bundle == null || !bundle.containsKey("dataModel")) {
            this.f15389g = C3791z.m18951b(intent);
            if (this.f15389g != null) {
                this.f15387e.m18844a(this.f15389g);
                this.f15385c.loadDataWithBaseURL(C1945b.m7351a(), this.f15389g.m18956d(), "text/html", "utf-8", null);
                this.f15385c.m19125a(this.f15389g.m18960h(), this.f15389g.m18961i());
            }
            return;
        }
        this.f15389g = C3791z.m18949a(bundle.getBundle("dataModel"));
        if (this.f15389g != null) {
            this.f15385c.loadDataWithBaseURL(C1945b.m7351a(), this.f15389g.m18956d(), "text/html", "utf-8", null);
            this.f15385c.m19125a(this.f15389g.m18960h(), this.f15389g.m18961i());
        }
    }

    /* renamed from: a */
    public void mo1421a(Bundle bundle) {
        if (this.f15389g != null) {
            bundle.putBundle("dataModel", this.f15389g.m18962j());
        }
    }

    /* renamed from: e */
    public void mo1422e() {
        if (this.f15389g != null) {
            C1813b.m6823a(C1812a.m6818a(this.f15390h, C1810a.XOUT, this.f15389g.m18959g()));
            if (!TextUtils.isEmpty(this.f15389g.mo1346c())) {
                Map hashMap = new HashMap();
                this.f15385c.getViewabilityChecker().m7419a(hashMap);
                hashMap.put("touch", C1921k.m7293a(this.f15385c.getTouchData()));
                this.f15388f.mo1364i(this.f15389g.mo1346c(), hashMap);
            }
        }
        C1945b.m7352a(this.f15385c);
        this.f15385c.destroy();
    }

    /* renamed from: k */
    public void mo1423k() {
        this.f15385c.onPause();
    }

    /* renamed from: l */
    public void mo1424l() {
        if (!(this.f15391i <= 0 || this.f15392j == null || this.f15389g == null)) {
            C1813b.m6823a(C1812a.m6818a(this.f15391i, this.f15392j, this.f15389g.m18959g()));
        }
        this.f15385c.onResume();
    }

    public void setListener(C1965a c1965a) {
    }
}
