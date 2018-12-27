package com.facebook.ads.internal.view;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.adapters.p082a.C1730g;
import com.facebook.ads.internal.adapters.p082a.C1731h;
import com.facebook.ads.internal.p091j.C1812a;
import com.facebook.ads.internal.p091j.C1812a.C1810a;
import com.facebook.ads.internal.p091j.C1813b;
import com.facebook.ads.internal.p094m.C1827c;
import com.facebook.ads.internal.p101q.p102a.C1921k;
import com.facebook.ads.internal.p101q.p102a.C1933t;
import com.facebook.ads.internal.p107r.C1958a;
import com.facebook.ads.internal.p107r.C1958a.C1957a;
import com.facebook.ads.internal.view.component.p112a.C2008c;
import com.facebook.ads.internal.view.component.p112a.C2011d.C2010a;
import com.facebook.ads.internal.view.p109b.C1991d;
import com.facebook.ads.internal.view.p109b.C1992e;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.view.g */
public class C4651g extends C3912i {
    /* renamed from: e */
    private final C1730g f19238e;
    /* renamed from: f */
    private final C1958a f19239f;
    /* renamed from: g */
    private final C1933t f19240g = new C1933t();
    /* renamed from: h */
    private final C1957a f19241h;
    /* renamed from: i */
    private long f19242i;

    /* renamed from: com.facebook.ads.internal.view.g$1 */
    class C39071 extends C1957a {
        /* renamed from: a */
        final /* synthetic */ C4651g f15564a;

        C39071(C4651g c4651g) {
            this.f15564a = c4651g;
        }

        /* renamed from: a */
        public void mo1338a() {
            if (!this.f15564a.f19240g.m7318b()) {
                this.f15564a.f19240g.m7316a();
                Map hashMap = new HashMap();
                this.f15564a.f19239f.m7419a(hashMap);
                hashMap.put("touch", C1921k.m7293a(this.f15564a.f19240g.m7321e()));
                this.f15564a.b.mo1355a(this.f15564a.f19238e.m6544c(), hashMap);
                if (this.f15564a.getAudienceNetworkListener() != null) {
                    this.f15564a.getAudienceNetworkListener().mo1280a("com.facebook.ads.interstitial.impression.logged");
                }
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.g$2 */
    class C39082 implements C1992e {
        /* renamed from: a */
        final /* synthetic */ C4651g f15565a;

        C39082(C4651g c4651g) {
            this.f15565a = c4651g;
        }

        /* renamed from: a */
        public void mo1272a(boolean z) {
            if (z) {
                this.f15565a.f19239f.m7417a();
            }
        }
    }

    public C4651g(Context context, C1730g c1730g, C1827c c1827c) {
        super(context, c1827c);
        this.f19238e = c1730g;
        this.f19241h = new C39071(this);
        this.f19239f = new C1958a(this, 100, this.f19241h);
        this.f19239f.m7418a(c1730g.m6547f());
    }

    private void setUpContent(int i) {
        C1731h c1731h = (C1731h) this.f19238e.m6545d().get(0);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ScaleType.CENTER);
        imageView.setAdjustViewBounds(true);
        C1991d a = new C1991d(imageView).m7500a(c1731h.m6553c().m6511i(), c1731h.m6553c().m6510h());
        a.m7501a(new C39082(this));
        a.m7503a(c1731h.m6553c().m6509g());
        View a2 = C2008c.m7538a(new C2010a(getContext(), this.b, getAudienceNetworkListener(), this.f19238e, imageView, this.f19239f, this.f19240g).m7554a(a).m7558b(i).m7557a());
        m19465a(a2, a2.mo1433a(), i);
    }

    /* renamed from: a */
    public void mo1420a(Intent intent, Bundle bundle, AudienceNetworkActivity audienceNetworkActivity) {
        super.m19466a(audienceNetworkActivity, this.f19238e);
        setUpContent(audienceNetworkActivity.getResources().getConfiguration().orientation);
        this.f19242i = System.currentTimeMillis();
    }

    /* renamed from: a */
    public void mo1421a(Bundle bundle) {
    }

    /* renamed from: e */
    public void mo1422e() {
        if (this.f19238e != null) {
            C1813b.m6823a(C1812a.m6818a(this.f19242i, C1810a.XOUT, this.f19238e.m6546e()));
            if (!TextUtils.isEmpty(this.f19238e.m6544c())) {
                Map hashMap = new HashMap();
                this.f19239f.m7419a(hashMap);
                hashMap.put("touch", C1921k.m7293a(this.f19240g.m7321e()));
                this.b.mo1364i(this.f19238e.m6544c(), hashMap);
            }
        }
        this.f19239f.m7422c();
        super.mo1422e();
    }

    /* renamed from: k */
    public void mo1423k() {
    }

    /* renamed from: l */
    public void mo1424l() {
    }

    public void onConfigurationChanged(Configuration configuration) {
        removeAllViews();
        setUpContent(configuration.orientation);
        super.onConfigurationChanged(configuration);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f19240g.m7317a(motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
