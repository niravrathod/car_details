package com.facebook.ads.internal.view;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.AudienceNetworkActivity.C1691a;
import com.facebook.ads.internal.adapters.p082a.C1730g;
import com.facebook.ads.internal.adapters.p082a.C1731h;
import com.facebook.ads.internal.p085d.C1779b;
import com.facebook.ads.internal.p091j.C1812a;
import com.facebook.ads.internal.p091j.C1812a.C1810a;
import com.facebook.ads.internal.p091j.C1813b;
import com.facebook.ads.internal.p094m.C1827c;
import com.facebook.ads.internal.p101q.p102a.C1921k;
import com.facebook.ads.internal.p101q.p102a.C1933t;
import com.facebook.ads.internal.p101q.p102a.C1936w;
import com.facebook.ads.internal.p107r.C1958a;
import com.facebook.ads.internal.p107r.C1958a.C1957a;
import com.facebook.ads.internal.view.component.p112a.C2008c;
import com.facebook.ads.internal.view.component.p112a.C2011d.C2010a;
import com.facebook.ads.internal.view.p116f.C3859a;
import com.facebook.ads.internal.view.p116f.C3903c;
import com.facebook.ads.internal.view.p116f.C4617b;
import com.facebook.ads.internal.view.p116f.p117a.C2038a;
import com.facebook.ads.internal.view.p116f.p117a.C2039b;
import com.facebook.ads.internal.view.p116f.p118b.C3867b;
import com.facebook.ads.internal.view.p116f.p118b.C3868c;
import com.facebook.ads.internal.view.p116f.p118b.C3869d;
import com.facebook.ads.internal.view.p116f.p118b.C3870e;
import com.facebook.ads.internal.view.p116f.p118b.C3873h;
import com.facebook.ads.internal.view.p116f.p118b.C3874i;
import com.facebook.ads.internal.view.p116f.p118b.C3875j;
import com.facebook.ads.internal.view.p116f.p118b.C3876k;
import com.facebook.ads.internal.view.p116f.p118b.C3877l;
import com.facebook.ads.internal.view.p116f.p118b.C3878m;
import com.facebook.ads.internal.view.p116f.p119c.C3894d;
import com.facebook.ads.internal.view.p116f.p119c.C3894d.C2054a;
import com.facebook.ads.internal.view.p116f.p119c.C3895f;
import com.facebook.ads.internal.view.p116f.p119c.C3902o;
import com.facebook.ads.internal.view.p116f.p119c.C4630g;
import com.facebook.ads.internal.view.p116f.p119c.C4640k;
import com.facebook.ads.internal.view.p116f.p119c.C4644l;
import com.facebook.ads.internal.view.p116f.p120d.C2072d;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.internal.view.h */
public class C4657h extends C3912i {
    /* renamed from: e */
    private final C1691a f19248e = new C39091(this);
    /* renamed from: f */
    private final C3870e f19249f = new C46522(this);
    /* renamed from: g */
    private final C3876k f19250g = new C46533(this);
    /* renamed from: h */
    private final C3874i f19251h = new C46544(this);
    /* renamed from: i */
    private final C3868c f19252i = new C46555(this);
    /* renamed from: j */
    private final C3878m f19253j = new C46566(this);
    /* renamed from: k */
    private final C3859a f19254k = new C3859a(getContext());
    /* renamed from: l */
    private final C3902o f19255l;
    /* renamed from: m */
    private final C3895f f19256m;
    /* renamed from: n */
    private final C1730g f19257n;
    /* renamed from: o */
    private final C1731h f19258o;
    /* renamed from: p */
    private final C1958a f19259p;
    /* renamed from: q */
    private final C1957a f19260q;
    /* renamed from: r */
    private final C1933t f19261r = new C1933t();
    /* renamed from: s */
    private final C1779b f19262s;
    /* renamed from: t */
    private final AtomicBoolean f19263t = new AtomicBoolean(false);
    /* renamed from: u */
    private final AtomicBoolean f19264u = new AtomicBoolean(false);
    /* renamed from: v */
    private final C3903c f19265v;
    /* renamed from: w */
    private AudienceNetworkActivity f19266w;
    /* renamed from: x */
    private C2038a f19267x;
    /* renamed from: y */
    private long f19268y;
    /* renamed from: z */
    private boolean f19269z = false;

    /* renamed from: com.facebook.ads.internal.view.h$1 */
    class C39091 implements C1691a {
        /* renamed from: a */
        final /* synthetic */ C4657h f15566a;

        C39091(C4657h c4657h) {
            this.f15566a = c4657h;
        }

        /* renamed from: a */
        public boolean mo1343a() {
            return this.f15566a.c.m19453a() ^ 1;
        }
    }

    /* renamed from: com.facebook.ads.internal.view.h$7 */
    class C39107 extends C1957a {
        /* renamed from: a */
        final /* synthetic */ C4657h f15567a;

        C39107(C4657h c4657h) {
            this.f15567a = c4657h;
        }

        /* renamed from: a */
        public void mo1338a() {
            if (!this.f15567a.f19261r.m7318b()) {
                this.f15567a.f19261r.m7316a();
                Map hashMap = new HashMap();
                if (!TextUtils.isEmpty(this.f15567a.f19257n.m6544c())) {
                    this.f15567a.f19259p.m7419a(hashMap);
                    hashMap.put("touch", C1921k.m7293a(this.f15567a.f19261r.m7321e()));
                    this.f15567a.b.mo1355a(this.f15567a.f19257n.m6544c(), hashMap);
                    if (this.f15567a.getAudienceNetworkListener() != null) {
                        this.f15567a.getAudienceNetworkListener().mo1280a("com.facebook.ads.interstitial.impression.logged");
                    }
                }
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.h$2 */
    class C46522 extends C3870e {
        /* renamed from: a */
        final /* synthetic */ C4657h f19243a;

        C46522(C4657h c4657h) {
            this.f19243a = c4657h;
        }

        /* renamed from: a */
        public void m25626a(C3869d c3869d) {
            if (this.f19243a.getAudienceNetworkListener() != null) {
                this.f19243a.getAudienceNetworkListener().mo1281a("videoInterstitalEvent", c3869d);
            }
            if (!this.f19243a.f19269z) {
                this.f19243a.f19254k.m19261d();
                this.f19243a.f19254k.m19266i();
                this.f19243a.f19269z = true;
            }
            if (this.f19243a.f19266w != null) {
                this.f19243a.f19266w.finish();
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.h$3 */
    class C46533 extends C3876k {
        /* renamed from: a */
        final /* synthetic */ C4657h f19244a;

        C46533(C4657h c4657h) {
            this.f19244a = c4657h;
        }

        /* renamed from: a */
        public void m25628a(C3875j c3875j) {
            if (this.f19244a.getAudienceNetworkListener() != null) {
                this.f19244a.getAudienceNetworkListener().mo1281a("videoInterstitalEvent", c3875j);
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.h$4 */
    class C46544 extends C3874i {
        /* renamed from: a */
        final /* synthetic */ C4657h f19245a;

        C46544(C4657h c4657h) {
            this.f19245a = c4657h;
        }

        /* renamed from: a */
        public void m25630a(C3873h c3873h) {
            if (this.f19245a.getAudienceNetworkListener() != null) {
                this.f19245a.getAudienceNetworkListener().mo1281a("videoInterstitalEvent", c3873h);
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.h$5 */
    class C46555 extends C3868c {
        /* renamed from: a */
        final /* synthetic */ C4657h f19246a;

        C46555(C4657h c4657h) {
            this.f19246a = c4657h;
        }

        /* renamed from: a */
        public void m25632a(C3867b c3867b) {
            this.f19246a.f19263t.set(true);
            if (this.f19246a.getAudienceNetworkListener() != null) {
                this.f19246a.getAudienceNetworkListener().mo1281a("videoInterstitalEvent", c3867b);
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.h$6 */
    class C46566 extends C3878m {
        /* renamed from: a */
        final /* synthetic */ C4657h f19247a;

        C46566(C4657h c4657h) {
            this.f19247a = c4657h;
        }

        /* renamed from: a */
        public void m25634a(C3877l c3877l) {
            if (!this.f19247a.f19269z) {
                this.f19247a.f19264u.set(this.f19247a.f19254k.m19265h());
                this.f19247a.m25636a();
            }
            if (this.f19247a.getAudienceNetworkListener() != null) {
                this.f19247a.getAudienceNetworkListener().mo1281a("videoInterstitalEvent", c3877l);
            }
            this.f19247a.f19259p.m7417a();
        }
    }

    public C4657h(Context context, C1827c c1827c, C1730g c1730g, C1779b c1779b) {
        super(context, c1827c);
        this.f19254k.setVideoProgressReportIntervalMs(c1730g.m6549h());
        C1936w.m7327a(this.f19254k);
        C1936w.m7328a(this.f19254k, 0);
        this.f19257n = c1730g;
        this.f19258o = (C1731h) this.f19257n.m6545d().get(0);
        this.f19262s = c1779b;
        this.f19255l = new C3902o(getContext());
        this.f19256m = new C3895f(context);
        this.f19254k.getEventBus().m6830a(this.f19250g, this.f19251h, this.f19252i, this.f19249f, this.f19253j);
        setupPlugins(this.f19258o);
        this.f19260q = new C39107(this);
        this.f19259p = new C1958a(this, 1, this.f19260q);
        this.f19259p.m7418a(c1730g.m6547f());
        this.f19259p.m7420b(c1730g.m6548g());
        this.f19265v = new C4617b(getContext(), this.b, this.f19254k, this.f19257n.m6544c());
        this.f19254k.setVideoURI(m25635a(this.f19258o.m6553c().m6502a()));
    }

    /* renamed from: a */
    private String m25635a(String str) {
        CharSequence charSequence = "";
        if (!(this.f19262s == null || str == null)) {
            charSequence = this.f19262s.m6690b(str);
        }
        return TextUtils.isEmpty(charSequence) ? str : charSequence;
    }

    /* renamed from: a */
    private void m25636a() {
        this.f19256m.setVisibility(this.f19264u.get() ? 0 : 8);
    }

    private void setUpContent(int i) {
        View a = C2008c.m7538a(new C2010a(getContext(), this.b, getAudienceNetworkListener(), this.f19257n, this.f19254k, this.f19259p, this.f19261r).m7554a(a).m7558b(i).m7556a(this.f19255l).m7555a(this.f19256m).m7557a());
        m25636a();
        m19465a(a, a.mo1433a(), i);
    }

    private void setupPlugins(C1731h c1731h) {
        C2039b c4630g;
        this.f19254k.m19259b();
        this.f19254k.m19256a(this.f19255l);
        this.f19254k.m19256a(this.f19256m);
        if (!TextUtils.isEmpty(c1731h.m6553c().m6509g())) {
            c4630g = new C4630g(getContext());
            this.f19254k.m19256a(c4630g);
            c4630g.setImage(c1731h.m6553c().m6509g());
        }
        c4630g = new C4644l(getContext(), true);
        this.f19254k.m19256a(c4630g);
        this.f19254k.m19256a(new C3894d(c4630g, c1731h.m6553c().m6507e() ? C2054a.FADE_OUT_ON_PLAY : C2054a.VISIBLE, true));
        this.f19254k.m19256a(new C4640k(getContext()));
        this.f19254k.m19256a(this.c);
    }

    /* renamed from: a */
    public void mo1420a(Intent intent, Bundle bundle, AudienceNetworkActivity audienceNetworkActivity) {
        super.m19466a(audienceNetworkActivity, this.f19257n);
        this.f19266w = audienceNetworkActivity;
        setUpContent(audienceNetworkActivity.getResources().getConfiguration().orientation);
        this.f19266w.m6412a(this.f19248e);
        C1731h c1731h = (C1731h) this.f19257n.m6545d().get(0);
        if (c1731h.m6553c().m6507e()) {
            this.f19254k.setVolume(c1731h.m6553c().m6508f() ? 1.0f : 0.0f);
            this.f19254k.m19255a(C2038a.AUTO_STARTED);
        }
        this.f19268y = System.currentTimeMillis();
    }

    /* renamed from: a */
    public void mo1421a(Bundle bundle) {
    }

    /* renamed from: e */
    public void mo1422e() {
        if (!this.f19269z) {
            if (!this.f19263t.get()) {
                this.f19254k.m19260c();
            }
            if (this.f19257n != null) {
                C1813b.m6823a(C1812a.m6818a(this.f19268y, C1810a.XOUT, this.f19257n.m6546e()));
                if (!TextUtils.isEmpty(this.f19257n.m6544c())) {
                    Map hashMap = new HashMap();
                    this.f19259p.m7419a(hashMap);
                    hashMap.put("touch", C1921k.m7293a(this.f19261r.m7321e()));
                    this.b.mo1364i(this.f19257n.m6544c(), hashMap);
                }
            }
            this.f19254k.m19261d();
            this.f19254k.m19266i();
            this.f19269z = true;
        }
        this.f19259p.m7422c();
        this.f19266w = null;
        super.mo1422e();
    }

    /* renamed from: k */
    public void mo1423k() {
        if (!this.f19269z && this.f19254k.getState() == C2072d.STARTED) {
            this.f19267x = this.f19254k.getVideoStartReason();
            this.f19254k.m19258a(false);
        }
    }

    /* renamed from: l */
    public void mo1424l() {
        if (!this.f19269z && this.f19267x != null) {
            this.f19254k.m19255a(this.f19267x);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        removeAllViews();
        C1936w.m7332b(this.f19254k);
        C1936w.m7332b(this.f19255l);
        C1936w.m7332b(this.f19256m);
        setUpContent(configuration.orientation);
        super.onConfigurationChanged(configuration);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f19261r.m7317a(motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
