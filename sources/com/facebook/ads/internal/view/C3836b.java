package com.facebook.ads.internal.view;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.AudienceNetworkActivity.C1691a;
import com.facebook.ads.internal.p094m.C1827c;
import com.facebook.ads.internal.p101q.p102a.C1936w;
import com.facebook.ads.internal.p101q.p104c.C1945b;
import com.facebook.ads.internal.view.C1980a.C1965a;
import com.facebook.ads.internal.view.p108a.C1970a;
import com.facebook.ads.internal.view.p108a.C1970a.C1969a;
import com.facebook.ads.internal.view.p108a.C1971b;
import com.facebook.ads.internal.view.p108a.C1974c.C1973a;
import com.facebook.ads.internal.view.p108a.C3829f;
import com.facebook.ads.internal.view.p108a.C3829f.C1977a;

@TargetApi(19)
/* renamed from: com.facebook.ads.internal.view.b */
public class C3836b implements C1980a {
    /* renamed from: a */
    private static final String f15291a = "b";
    /* renamed from: b */
    private final AudienceNetworkActivity f15292b;
    /* renamed from: c */
    private final C1970a f15293c;
    /* renamed from: d */
    private final C3829f f15294d;
    /* renamed from: e */
    private final C1971b f15295e;
    /* renamed from: f */
    private final C1827c f15296f;
    /* renamed from: g */
    private final C1691a f15297g = new C38301(this);
    /* renamed from: h */
    private String f15298h;
    /* renamed from: i */
    private String f15299i;
    /* renamed from: j */
    private long f15300j;
    /* renamed from: k */
    private boolean f15301k = true;
    /* renamed from: l */
    private long f15302l = -1;
    /* renamed from: m */
    private boolean f15303m = true;

    /* renamed from: com.facebook.ads.internal.view.b$1 */
    class C38301 implements C1691a {
        /* renamed from: a */
        final /* synthetic */ C3836b f15276a;

        C38301(C3836b c3836b) {
            this.f15276a = c3836b;
        }

        /* renamed from: a */
        public boolean mo1343a() {
            if (!this.f15276a.f15294d.canGoBack()) {
                return false;
            }
            this.f15276a.f15294d.goBack();
            return true;
        }
    }

    /* renamed from: com.facebook.ads.internal.view.b$3 */
    class C38323 implements C1977a {
        /* renamed from: a */
        final /* synthetic */ C3836b f15279a;

        C38323(C3836b c3836b) {
            this.f15279a = c3836b;
        }

        /* renamed from: a */
        public void mo1411a(int i) {
            if (this.f15279a.f15301k) {
                this.f15279a.f15295e.setProgress(i);
            }
        }

        /* renamed from: a */
        public void mo1412a(String str) {
            this.f15279a.f15301k = true;
            this.f15279a.f15293c.setUrl(str);
        }

        /* renamed from: b */
        public void mo1413b(String str) {
            this.f15279a.f15293c.setTitle(str);
        }

        /* renamed from: c */
        public void mo1414c(String str) {
            this.f15279a.f15295e.setProgress(100);
            this.f15279a.f15301k = false;
        }
    }

    public C3836b(final AudienceNetworkActivity audienceNetworkActivity, C1827c c1827c, C1965a c1965a) {
        this.f15292b = audienceNetworkActivity;
        this.f15296f = c1827c;
        int i = (int) (C1936w.f5934b * 2.0f);
        this.f15293c = new C1970a(audienceNetworkActivity);
        this.f15293c.setId(View.generateViewId());
        LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(10);
        this.f15293c.setLayoutParams(layoutParams);
        this.f15293c.setListener(new C1969a(this) {
            /* renamed from: b */
            final /* synthetic */ C3836b f15278b;

            /* renamed from: a */
            public void mo1410a() {
                audienceNetworkActivity.finish();
            }
        });
        c1965a.mo1279a(this.f15293c);
        this.f15294d = new C3829f(audienceNetworkActivity);
        layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(3, this.f15293c.getId());
        layoutParams.addRule(12);
        this.f15294d.setLayoutParams(layoutParams);
        this.f15294d.setListener(new C38323(this));
        c1965a.mo1279a(this.f15294d);
        this.f15295e = new C1971b(audienceNetworkActivity, null, 16842872);
        layoutParams = new RelativeLayout.LayoutParams(-1, i);
        layoutParams.addRule(3, this.f15293c.getId());
        this.f15295e.setLayoutParams(layoutParams);
        this.f15295e.setProgress(0);
        c1965a.mo1279a(this.f15295e);
        audienceNetworkActivity.m6412a(this.f15297g);
    }

    /* renamed from: a */
    public void mo1420a(Intent intent, Bundle bundle, AudienceNetworkActivity audienceNetworkActivity) {
        long longExtra;
        if (this.f15302l < 0) {
            this.f15302l = System.currentTimeMillis();
        }
        if (bundle == null) {
            this.f15298h = intent.getStringExtra("browserURL");
            this.f15299i = intent.getStringExtra("clientToken");
            longExtra = intent.getLongExtra("handlerTime", -1);
        } else {
            this.f15298h = bundle.getString("browserURL");
            this.f15299i = bundle.getString("clientToken");
            longExtra = bundle.getLong("handlerTime", -1);
        }
        this.f15300j = longExtra;
        String str = this.f15298h != null ? this.f15298h : "about:blank";
        this.f15293c.setUrl(str);
        this.f15294d.loadUrl(str);
    }

    /* renamed from: a */
    public void mo1421a(Bundle bundle) {
        bundle.putString("browserURL", this.f15298h);
    }

    /* renamed from: e */
    public void mo1422e() {
        this.f15292b.m6413b(this.f15297g);
        C1945b.m7352a(this.f15294d);
        this.f15294d.destroy();
    }

    /* renamed from: k */
    public void mo1423k() {
        this.f15294d.onPause();
        if (this.f15303m) {
            this.f15303m = false;
            this.f15296f.mo1362g(this.f15299i, new C1973a(this.f15294d.getFirstUrl()).m7452a(this.f15300j).m7454b(this.f15302l).m7455c(this.f15294d.getResponseEndMs()).m7456d(this.f15294d.getDomContentLoadedMs()).m7457e(this.f15294d.getScrollReadyMs()).m7458f(this.f15294d.getLoadFinishMs()).m7459g(System.currentTimeMillis()).m7453a().m7460a());
        }
    }

    /* renamed from: l */
    public void mo1424l() {
        this.f15294d.onResume();
    }

    public void setListener(C1965a c1965a) {
    }
}
