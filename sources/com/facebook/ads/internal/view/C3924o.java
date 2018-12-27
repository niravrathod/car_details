package com.facebook.ads.internal.view;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.transition.AutoTransition;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.AudienceNetworkActivity.C1691a;
import com.facebook.ads.internal.adapters.p082a.C1727d;
import com.facebook.ads.internal.adapters.p082a.C1736k;
import com.facebook.ads.internal.p093l.C1820a;
import com.facebook.ads.internal.p094m.C1827c;
import com.facebook.ads.internal.p101q.p102a.C1921k;
import com.facebook.ads.internal.p101q.p102a.C1933t;
import com.facebook.ads.internal.p101q.p102a.C1936w;
import com.facebook.ads.internal.p107r.C1958a;
import com.facebook.ads.internal.p107r.C1958a.C1957a;
import com.facebook.ads.internal.view.C1980a.C1965a;
import com.facebook.ads.internal.view.C3906f.C2032a;
import com.facebook.ads.internal.view.p109b.C1991d;
import com.facebook.ads.internal.view.p115e.C2023a;
import com.facebook.ads.internal.view.p115e.C2027b;
import com.facebook.ads.internal.view.p115e.C2027b.C2026a;
import com.facebook.ads.internal.view.p116f.C3859a;
import com.facebook.ads.internal.view.p116f.C4617b;
import com.facebook.ads.internal.view.p116f.p117a.C2038a;
import com.facebook.ads.internal.view.p116f.p117a.C2039b;
import com.facebook.ads.internal.view.p116f.p118b.C2041z;
import com.facebook.ads.internal.view.p116f.p118b.C3867b;
import com.facebook.ads.internal.view.p116f.p118b.C3868c;
import com.facebook.ads.internal.view.p116f.p118b.C3869d;
import com.facebook.ads.internal.view.p116f.p118b.C3870e;
import com.facebook.ads.internal.view.p116f.p118b.C3877l;
import com.facebook.ads.internal.view.p116f.p118b.C3878m;
import com.facebook.ads.internal.view.p116f.p118b.C3879n;
import com.facebook.ads.internal.view.p116f.p118b.C3880o;
import com.facebook.ads.internal.view.p116f.p119c.C3894d;
import com.facebook.ads.internal.view.p116f.p119c.C3894d.C2054a;
import com.facebook.ads.internal.view.p116f.p119c.C3895f;
import com.facebook.ads.internal.view.p116f.p119c.C3899j;
import com.facebook.ads.internal.view.p116f.p119c.C3899j.C2059a;
import com.facebook.ads.internal.view.p116f.p119c.C3902o;
import com.facebook.ads.internal.view.p116f.p119c.C4640k;
import com.facebook.ads.internal.view.p116f.p119c.C4644l;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.internal.view.o */
public class C3924o extends RelativeLayout implements C1980a {
    /* renamed from: a */
    static final /* synthetic */ boolean f15615a = (C3924o.class.desiredAssertionStatus() ^ 1);
    /* renamed from: b */
    private static final int f15616b = ((int) (C1936w.f5934b * 12.0f));
    /* renamed from: c */
    private static final int f15617c = ((int) (C1936w.f5934b * 18.0f));
    /* renamed from: d */
    private static final int f15618d = ((int) (C1936w.f5934b * 16.0f));
    /* renamed from: e */
    private static final int f15619e = ((int) (C1936w.f5934b * 72.0f));
    /* renamed from: f */
    private static final int f15620f = ((int) (C1936w.f5934b * 56.0f));
    /* renamed from: g */
    private static final int f15621g = ((int) (C1936w.f5934b * 56.0f));
    /* renamed from: h */
    private static final int f15622h = ((int) (C1936w.f5934b * 28.0f));
    /* renamed from: i */
    private static final int f15623i = ((int) (C1936w.f5934b * 20.0f));
    /* renamed from: j */
    private static final LayoutParams f15624j = new LayoutParams(-1, -1);
    /* renamed from: A */
    private Context f15625A;
    /* renamed from: B */
    private C3859a f15626B;
    /* renamed from: C */
    private C1965a f15627C;
    /* renamed from: D */
    private C2023a f15628D;
    /* renamed from: E */
    private C3894d f15629E;
    /* renamed from: F */
    private C4644l f15630F;
    /* renamed from: G */
    private C3899j f15631G;
    /* renamed from: H */
    private C3906f f15632H;
    /* renamed from: I */
    private C2027b f15633I;
    /* renamed from: J */
    private boolean f15634J = false;
    /* renamed from: k */
    private final C1691a f15635k = new C39211(this);
    /* renamed from: l */
    private final C3868c f15636l = new C46682(this);
    /* renamed from: m */
    private final C3870e f15637m = new C46693(this);
    /* renamed from: n */
    private final C3878m f15638n = new C46704(this);
    /* renamed from: o */
    private final C3880o f15639o = new C46715(this);
    /* renamed from: p */
    private final C1736k f15640p;
    /* renamed from: q */
    private final C1827c f15641q;
    /* renamed from: r */
    private final C1958a f15642r;
    /* renamed from: s */
    private final C1957a f15643s;
    /* renamed from: t */
    private final C1933t f15644t = new C1933t();
    /* renamed from: u */
    private final C3902o f15645u;
    /* renamed from: v */
    private final C4617b f15646v;
    /* renamed from: w */
    private final RelativeLayout f15647w;
    /* renamed from: x */
    private final C3895f f15648x;
    /* renamed from: y */
    private final C1727d f15649y;
    /* renamed from: z */
    private final AtomicBoolean f15650z = new AtomicBoolean(false);

    /* renamed from: com.facebook.ads.internal.view.o$7 */
    class C20867 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C3924o f6401a;

        C20867(C3924o c3924o) {
            this.f6401a = c3924o;
        }

        public void onClick(View view) {
            if (this.f6401a.f15631G == null) {
                return;
            }
            if (!this.f6401a.f15631G.m19358a()) {
                return;
            }
            if (this.f6401a.f15631G.getSkipSeconds() != 0 && this.f6401a.f15626B != null) {
                this.f6401a.f15626B.m19260c();
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.o$1 */
    class C39211 implements C1691a {
        /* renamed from: a */
        final /* synthetic */ C3924o f15612a;

        C39211(C3924o c3924o) {
            this.f15612a = c3924o;
        }

        /* renamed from: a */
        public boolean mo1343a() {
            return this.f15612a.f15634J ^ 1;
        }
    }

    /* renamed from: com.facebook.ads.internal.view.o$6 */
    class C39226 extends C1957a {
        /* renamed from: a */
        final /* synthetic */ C3924o f15613a;

        C39226(C3924o c3924o) {
            this.f15613a = c3924o;
        }

        /* renamed from: a */
        public void mo1338a() {
            if (!this.f15613a.f15644t.m7318b()) {
                this.f15613a.f15644t.m7316a();
                Map hashMap = new HashMap();
                if (!TextUtils.isEmpty(this.f15613a.f15640p.m6583g())) {
                    this.f15613a.f15642r.m7419a(hashMap);
                    hashMap.put("touch", C1921k.m7293a(this.f15613a.f15644t.m7321e()));
                    this.f15613a.f15641q.mo1355a(this.f15613a.f15640p.m6583g(), hashMap);
                }
                if (this.f15613a.f15627C != null) {
                    this.f15613a.f15627C.mo1280a(C2041z.REWARDED_VIDEO_IMPRESSION.m7604a());
                }
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.o$8 */
    class C39238 implements C2032a {
        /* renamed from: a */
        final /* synthetic */ C3924o f15614a;

        C39238(C3924o c3924o) {
            this.f15614a = c3924o;
        }

        /* renamed from: a */
        public void mo1482a() {
            if (!this.f15614a.f15634J && this.f15614a.f15626B != null) {
                this.f15614a.f15634J = true;
                this.f15614a.f15626B.m19260c();
            } else if (this.f15614a.f15634J && this.f15614a.f15627C != null) {
                this.f15614a.f15627C.mo1280a(C2041z.REWARDED_VIDEO_END_ACTIVITY.m7604a());
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.o$2 */
    class C46682 extends C3868c {
        /* renamed from: a */
        final /* synthetic */ C3924o f19301a;

        C46682(C3924o c3924o) {
            this.f19301a = c3924o;
        }

        /* renamed from: a */
        public void m25687a(C3867b c3867b) {
            if (this.f19301a.f15627C != null) {
                this.f19301a.f15633I.m7599d();
                this.f19301a.m19517c();
                this.f19301a.f15627C.mo1281a(C2041z.REWARDED_VIDEO_COMPLETE.m7604a(), c3867b);
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.o$3 */
    class C46693 extends C3870e {
        /* renamed from: a */
        final /* synthetic */ C3924o f19302a;

        C46693(C3924o c3924o) {
            this.f19302a = c3924o;
        }

        /* renamed from: a */
        public void m25689a(C3869d c3869d) {
            if (this.f19302a.f15627C != null) {
                this.f19302a.f15627C.mo1280a(C2041z.REWARDED_VIDEO_ERROR.m7604a());
            }
            this.f19302a.m19531a();
        }
    }

    /* renamed from: com.facebook.ads.internal.view.o$4 */
    class C46704 extends C3878m {
        /* renamed from: a */
        final /* synthetic */ C3924o f19303a;

        C46704(C3924o c3924o) {
            this.f19303a = c3924o;
        }

        /* renamed from: a */
        public void m25691a(C3877l c3877l) {
            if (this.f19303a.f15626B != null) {
                this.f19303a.f15626B.m19255a(C2038a.USER_STARTED);
                this.f19303a.f15642r.m7417a();
                this.f19303a.f15650z.set(this.f19303a.f15626B.m19265h());
                this.f19303a.m19524g();
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.o$5 */
    class C46715 extends C3880o {
        /* renamed from: a */
        final /* synthetic */ C3924o f19304a;

        C46715(C3924o c3924o) {
            this.f19304a = c3924o;
        }

        /* renamed from: a */
        public void m25693a(C3879n c3879n) {
            if (this.f19304a.f15626B == null) {
                return;
            }
            if (this.f19304a.f15629E != null) {
                if (this.f19304a.f15626B.getDuration() - this.f19304a.f15626B.getCurrentPositionInMillis() <= 3000 && this.f19304a.f15629E.m19332a()) {
                    this.f19304a.f15629E.m19333b();
                }
            }
        }
    }

    public C3924o(Context context, C1827c c1827c, C3859a c3859a, C1965a c1965a, C1736k c1736k) {
        super(context);
        this.f15625A = context;
        this.f15627C = c1965a;
        this.f15626B = c3859a;
        this.f15641q = c1827c;
        this.f15640p = c1736k;
        this.f15649y = this.f15640p.m6580d().m6481a();
        this.f15647w = new RelativeLayout(context);
        this.f15645u = new C3902o(this.f15625A);
        this.f15648x = new C3895f(this.f15625A);
        new C1991d(this.f15647w, f15623i).m7499a().m7502a(C1820a.m6850e(this.f15625A)).m7503a(this.f15640p.m6581e().m6509g());
        this.f15643s = new C39226(this);
        this.f15642r = new C1958a(this, 1, this.f15643s);
        this.f15642r.m7418a(250);
        this.f15646v = new C4617b(this.f15625A, this.f15641q, this.f15626B, this.f15640p.m6583g());
        this.f15633I = new C2027b(this.f15625A, this.f15641q, this.f15640p, this.f15627C, this.f15642r, this.f15644t);
        if (!f15615a) {
            if (this.f15626B == null) {
                throw new AssertionError();
            }
        }
        this.f15626B.setVideoProgressReportIntervalMs(c1736k.m6584h());
        C1936w.m7328a(this.f15626B, -16777216);
        this.f15626B.getEventBus().m6830a(this.f15636l, this.f15637m, this.f15638n, this.f15639o);
    }

    /* renamed from: b */
    private void m19515b() {
        if (this.f15626B != null) {
            C3859a c3859a;
            C2039b c2039b;
            this.f15626B.m19259b();
            this.f15626B.m19256a(new C4640k(this.f15625A));
            this.f15626B.m19256a(this.f15648x);
            this.f15626B.m19256a(this.f15645u);
            this.f15630F = new C4644l(this.f15625A, true);
            C2039b c3894d = new C3894d(this.f15630F, C2054a.FADE_OUT_ON_PLAY, true);
            this.f15626B.m19256a(this.f15630F);
            this.f15626B.m19256a(c3894d);
            this.f15628D = new C2023a(this.f15625A, f15619e, this.f15649y, this.f15641q, this.f15627C, this.f15633I.m7597b() == C2026a.INFO, this.f15633I.m7597b() == C2026a.INFO, this.f15642r, this.f15644t);
            this.f15628D.setInfo(this.f15640p);
            this.f15629E = new C3894d(this.f15628D, C2054a.FADE_OUT_ON_PLAY, true);
            this.f15626B.m19256a(this.f15629E);
            if (!this.f15633I.m7596a() || this.f15640p.m6581e().m6505c() <= 0) {
                if (!this.f15633I.m7596a()) {
                    this.f15632H = new C3906f(this.f15625A);
                    this.f15632H.m19450a(this.f15640p.m6574a(), this.f15640p.m6583g(), this.f15640p.m6581e().m6505c());
                    if (this.f15640p.m6581e().m6505c() <= 0) {
                        this.f15632H.m19454b();
                    }
                    if (this.f15633I.m7597b() != C2026a.INFO) {
                        this.f15632H.m19456c();
                    }
                    this.f15632H.setToolbarListener(new C39238(this));
                    c3859a = this.f15626B;
                    c2039b = this.f15632H;
                }
            }
            this.f15631G = new C3899j(this.f15625A, this.f15640p.m6581e().m6505c(), -12286980);
            this.f15631G.setButtonMode(C2059a.SKIP_BUTTON_MODE);
            this.f15631G.setOnClickListener(new C20867(this));
            c3859a = this.f15626B;
            c2039b = this.f15631G;
            c3859a.m19256a(c2039b);
        }
    }

    /* renamed from: c */
    private void m19517c() {
        ViewGroup.LayoutParams layoutParams;
        this.f15634J = true;
        m19522f();
        m19518d();
        if (this.f15626B != null) {
            this.f15626B.m19259b();
            this.f15626B.setVisibility(4);
        }
        if (this.f15632H != null) {
            this.f15632H.m19452a(true);
            this.f15632H.m19456c();
        }
        C1936w.m7331a(this.f15626B, this.f15631G, this.f15648x, this.f15645u);
        Pair c = this.f15633I.m7598c();
        switch ((C2026a) c.first) {
            case MARKUP:
                C1936w.m7331a(this.f15628D);
                this.f15647w.addView((View) c.second, f15624j);
                return;
            case SCREENSHOTS:
                if (this.f15628D != null) {
                    this.f15628D.setVisibility(0);
                    this.f15628D.m7583a();
                }
                layoutParams = new LayoutParams(-1, -1);
                layoutParams.setMargins(0, f15621g, 0, 0);
                layoutParams.addRule(2, this.f15628D.getId());
                break;
            case INFO:
                C1936w.m7331a(this.f15628D);
                layoutParams = new LayoutParams(-1, -2);
                layoutParams.addRule(15);
                layoutParams.setMargins(f15618d, f15618d, f15618d, f15618d);
                break;
            default:
                return;
        }
        this.f15647w.addView((View) c.second, layoutParams);
        this.f15644t.m7316a();
    }

    /* renamed from: d */
    private void m19518d() {
        if (VERSION.SDK_INT > 19) {
            Transition autoTransition = new AutoTransition();
            autoTransition.setDuration(200);
            autoTransition.setInterpolator(new AccelerateDecelerateInterpolator());
            TransitionManager.beginDelayedTransition(this.f15647w, autoTransition);
        }
    }

    /* renamed from: f */
    private void m19522f() {
        if (this.f15625A != null) {
            View frameLayout = new FrameLayout(this.f15625A);
            frameLayout.setLayoutParams(f15624j);
            C1936w.m7328a(frameLayout, -1509949440);
            this.f15647w.addView(frameLayout, 0);
        }
    }

    /* renamed from: g */
    private void m19524g() {
        this.f15648x.setVisibility(this.f15650z.get() ? 0 : 8);
    }

    private void setUpContentLayoutForVideo(int i) {
        ViewGroup.LayoutParams layoutParams;
        this.f15647w.removeAllViews();
        this.f15647w.addView(this.f15626B, f15624j);
        if (this.f15628D != null) {
            C1936w.m7327a(this.f15628D);
            this.f15628D.m7584a(i);
            layoutParams = new LayoutParams(-1, -2);
            layoutParams.addRule(12);
            this.f15628D.setPadding(f15618d, f15618d, f15618d, f15618d);
            this.f15647w.addView(this.f15628D, layoutParams);
        }
        if (this.f15631G != null) {
            layoutParams = new LayoutParams(f15620f, f15620f);
            layoutParams.addRule(10);
            layoutParams.addRule(11);
            this.f15631G.setPadding(f15618d, f15618d, f15618d, f15618d);
            this.f15647w.addView(this.f15631G, layoutParams);
        }
        layoutParams = new LayoutParams(f15622h, f15622h);
        layoutParams.addRule(10);
        layoutParams.addRule(11);
        layoutParams.setMargins(f15616b, f15616b + f15621g, f15616b, f15617c);
        this.f15647w.addView(this.f15648x, layoutParams);
        m19524g();
        layoutParams = new LayoutParams(-1, -2);
        layoutParams.addRule(12);
        this.f15647w.addView(this.f15645u, layoutParams);
    }

    /* renamed from: a */
    public void m19531a() {
        if (this.f15626B != null) {
            this.f15626B.m19261d();
            this.f15626B.m19266i();
        }
        if (this.f15642r != null) {
            this.f15642r.m7422c();
        }
    }

    /* renamed from: a */
    public void mo1420a(Intent intent, Bundle bundle, AudienceNetworkActivity audienceNetworkActivity) {
        if (this.f15626B == null) {
            return;
        }
        if (this.f15627C != null) {
            m19515b();
            audienceNetworkActivity.m6412a(this.f15635k);
            this.f15626B.setVideoURI(!TextUtils.isEmpty(this.f15640p.m6581e().m6504b()) ? this.f15640p.m6581e().m6504b() : this.f15640p.m6581e().m6502a());
            setUpContentLayoutForVideo(audienceNetworkActivity.getResources().getConfiguration().orientation);
            addView(this.f15647w, f15624j);
            if (this.f15632H != null) {
                C1936w.m7327a(this.f15632H);
                this.f15632H.m19449a(this.f15649y, true);
                addView(this.f15632H, new LayoutParams(-1, f15621g));
            }
            setLayoutParams(f15624j);
            this.f15627C.mo1279a((View) this);
        }
    }

    /* renamed from: a */
    public void mo1421a(Bundle bundle) {
    }

    /* renamed from: e */
    public void mo1422e() {
        m19531a();
        if (this.f15626B != null) {
            this.f15626B.getEventBus().m6832b(this.f15636l, this.f15637m, this.f15638n, this.f15639o);
        }
        if (!TextUtils.isEmpty(this.f15640p.m6583g())) {
            Map hashMap = new HashMap();
            this.f15642r.m7419a(hashMap);
            hashMap.put("touch", C1921k.m7293a(this.f15644t.m7321e()));
            this.f15641q.mo1364i(this.f15640p.m6583g(), hashMap);
        }
        if (this.f15632H != null) {
            this.f15632H.setToolbarListener(null);
        }
        this.f15646v.mo3983a();
        this.f15626B = null;
        this.f15633I.m7600e();
        this.f15631G = null;
        this.f15628D = null;
        this.f15629E = null;
        this.f15627C = null;
        this.f15625A = null;
        this.f15645u.m19374a();
    }

    public int getCurrentPosition() {
        return this.f15626B != null ? this.f15626B.getCurrentPositionInMillis() : 0;
    }

    /* renamed from: k */
    public void mo1423k() {
        if (this.f15626B != null) {
            this.f15626B.m19258a(false);
        }
    }

    /* renamed from: l */
    public void mo1424l() {
        if (this.f15626B == null) {
            return;
        }
        if (this.f15627C != null) {
            if (this.f15626B.m19267j() && !this.f15626B.m19268k()) {
                this.f15626B.m19255a(C2038a.USER_STARTED);
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (this.f15628D != null) {
            this.f15628D.m7584a(configuration.orientation);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f15644t.m7317a(motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }

    void setEndCardController(C2027b c2027b) {
        this.f15633I = c2027b;
    }

    public void setListener(C1965a c1965a) {
    }
}
