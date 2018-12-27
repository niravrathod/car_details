package com.facebook.ads.internal.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebResourceError;
import android.webkit.WebSettings;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.AudienceNetworkActivity.C1691a;
import com.facebook.ads.internal.adapters.C1750n;
import com.facebook.ads.internal.adapters.C3769i;
import com.facebook.ads.internal.adapters.p082a.C1720a;
import com.facebook.ads.internal.adapters.p082a.C1735j;
import com.facebook.ads.internal.adapters.p082a.C1736k;
import com.facebook.ads.internal.p094m.C1827c;
import com.facebook.ads.internal.p101q.p102a.C1915f;
import com.facebook.ads.internal.p101q.p102a.C1915f.C1914a;
import com.facebook.ads.internal.p101q.p102a.C1921k;
import com.facebook.ads.internal.p101q.p102a.C1936w;
import com.facebook.ads.internal.p101q.p104c.C1950e;
import com.facebook.ads.internal.p101q.p104c.C1950e.C1949a;
import com.facebook.ads.internal.p101q.p104c.C1951f;
import com.facebook.ads.internal.view.C1980a.C1965a;
import com.facebook.ads.internal.view.C3906f.C2032a;
import com.facebook.ads.internal.view.component.C2013a;
import com.facebook.ads.internal.view.p109b.C3835a;
import com.facebook.ads.internal.view.p109b.C3835a.C1982b;
import com.facebook.ads.internal.view.p109b.C3835a.C1983d;
import com.facebook.ads.internal.view.p109b.C3835a.C3834c;
import com.facebook.ads.internal.view.p114d.C2021a;
import com.facebook.ads.internal.view.p116f.p118b.C2041z;
import com.facebook.ads.internal.view.p116f.p118b.C3867b;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

@TargetApi(16)
/* renamed from: com.facebook.ads.internal.view.n */
public class C3920n extends RelativeLayout implements C1914a, C1980a, C1983d {
    /* renamed from: a */
    private static final LayoutParams f15592a = new LayoutParams(-1, -1);
    /* renamed from: b */
    private final RelativeLayout f15593b;
    /* renamed from: c */
    private final C1827c f15594c;
    /* renamed from: d */
    private final C1736k f15595d;
    /* renamed from: e */
    private final C1735j f15596e;
    /* renamed from: f */
    private final C1720a f15597f;
    /* renamed from: g */
    private final C3906f f15598g;
    /* renamed from: h */
    private final C1915f f15599h;
    /* renamed from: i */
    private final C1915f f15600i;
    /* renamed from: j */
    private int f15601j;
    /* renamed from: k */
    private WeakReference<C3835a> f15602k;
    /* renamed from: l */
    private boolean f15603l = false;
    /* renamed from: m */
    private Context f15604m;
    /* renamed from: n */
    private AudienceNetworkActivity f15605n;
    /* renamed from: o */
    private C1965a f15606o;
    /* renamed from: p */
    private C1982b f15607p;
    /* renamed from: q */
    private final AtomicBoolean f15608q = new AtomicBoolean();
    /* renamed from: r */
    private Executor f15609r = AsyncTask.THREAD_POOL_EXECUTOR;
    /* renamed from: s */
    private final C1691a f15610s = new C39151(this);
    /* renamed from: t */
    private C3769i f15611t;

    /* renamed from: com.facebook.ads.internal.view.n$a */
    private static class C2084a implements OnTouchListener {
        /* renamed from: a */
        final WeakReference<C3835a> f6397a;
        /* renamed from: b */
        final C1827c f6398b;
        /* renamed from: c */
        final C1736k f6399c;

        private C2084a(C3835a c3835a, C1827c c1827c, C1736k c1736k) {
            this.f6397a = new WeakReference(c3835a);
            this.f6398b = c1827c;
            this.f6399c = c1736k;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (this.f6397a.get() != null && motionEvent.getAction() == 1) {
                Map hashMap = new HashMap();
                ((C3835a) this.f6397a.get()).getViewabilityChecker().m7419a(hashMap);
                hashMap.put("touch", C1921k.m7293a(((C3835a) this.f6397a.get()).getTouchDataRecorder().m7321e()));
                this.f6398b.mo1359d(this.f6399c.m6583g(), hashMap);
            }
            return false;
        }
    }

    /* renamed from: com.facebook.ads.internal.view.n$b */
    private class C2085b {
        /* renamed from: a */
        final /* synthetic */ C3920n f6400a;

        private C2085b(C3920n c3920n) {
            this.f6400a = c3920n;
        }

        @JavascriptInterface
        public void onCTAClick() {
            if (this.f6400a.f15602k.get() != null) {
                C3835a c3835a = (C3835a) this.f6400a.f15602k.get();
                C2013a c2013a = new C2013a(this.f6400a.f15604m, true, false, C2041z.REWARDED_VIDEO_AD_CLICK.m7604a(), this.f6400a.f15597f.m6481a(), this.f6400a.f15594c, this.f6400a.f15606o, c3835a.getViewabilityChecker(), c3835a.getTouchDataRecorder());
                c2013a.m7577a(this.f6400a.f15595d.m6579c(), this.f6400a.f15595d.m6583g(), new HashMap());
                c2013a.performClick();
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.n$1 */
    class C39151 implements C1691a {
        /* renamed from: a */
        final /* synthetic */ C3920n f15587a;

        C39151(C3920n c3920n) {
            this.f15587a = c3920n;
        }

        /* renamed from: a */
        public boolean mo1343a() {
            return this.f15587a.f15599h.m7276d() ^ 1;
        }
    }

    /* renamed from: com.facebook.ads.internal.view.n$2 */
    class C39162 implements C1914a {
        /* renamed from: a */
        final /* synthetic */ C3920n f15588a;

        C39162(C3920n c3920n) {
            this.f15588a = c3920n;
        }

        /* renamed from: a */
        public void mo1483a() {
            this.f15588a.m19490c();
        }

        /* renamed from: a */
        public void mo1484a(int i) {
        }
    }

    /* renamed from: com.facebook.ads.internal.view.n$3 */
    class C39173 implements C2032a {
        /* renamed from: a */
        final /* synthetic */ C3920n f15589a;

        C39173(C3920n c3920n) {
            this.f15589a = c3920n;
        }

        /* renamed from: a */
        public void mo1482a() {
            if (this.f15589a.f15606o != null) {
                this.f15589a.f15606o.mo1280a(C2041z.REWARDED_VIDEO_END_ACTIVITY.m7604a());
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.n$5 */
    class C39185 extends C1750n {
        /* renamed from: a */
        final /* synthetic */ C3920n f15590a;

        C39185(C3920n c3920n) {
            this.f15590a = c3920n;
        }

        /* renamed from: a */
        public void mo1339a() {
            if (this.f15590a.f15606o != null) {
                this.f15590a.f15606o.mo1280a(C2041z.REWARDED_VIDEO_IMPRESSION.m7604a());
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.n$c */
    private static class C3919c implements C1949a {
        /* renamed from: a */
        final WeakReference<C1965a> f15591a;

        private C3919c(WeakReference<C1965a> weakReference) {
            this.f15591a = weakReference;
        }

        /* renamed from: a */
        public void mo1437a() {
            if (this.f15591a.get() != null) {
                ((C1965a) this.f15591a.get()).mo1280a(C2041z.REWARD_SERVER_FAILED.m7604a());
            }
        }

        /* renamed from: a */
        public void mo1438a(C1951f c1951f) {
            if (this.f15591a.get() != null) {
                C1965a c1965a;
                C2041z c2041z;
                if (c1951f == null || !c1951f.m7372a()) {
                    c1965a = (C1965a) this.f15591a.get();
                    c2041z = C2041z.REWARD_SERVER_FAILED;
                } else {
                    c1965a = (C1965a) this.f15591a.get();
                    c2041z = C2041z.REWARD_SERVER_SUCCESS;
                }
                c1965a.mo1280a(c2041z.m7604a());
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.n$4 */
    class C46674 extends C3834c {
        /* renamed from: a */
        final /* synthetic */ C3920n f19300a;

        C46674(C3920n c3920n) {
            this.f19300a = c3920n;
        }

        /* renamed from: a */
        public void mo1417a(WebResourceError webResourceError) {
            this.f19300a.f15603l = true;
            if (this.f19300a.f15602k.get() != null) {
                ((C3835a) this.f19300a.f15602k.get()).setVisibility(4);
            }
            if (this.f19300a.f15606o != null) {
                this.f19300a.f15606o.mo1280a(C2041z.REWARDED_VIDEO_ERROR.m7604a());
            }
        }

        /* renamed from: b */
        public void mo1419b() {
            if (this.f19300a.f15608q.compareAndSet(false, true)) {
                this.f19300a.f15599h.m7273a();
                this.f19300a.f15611t.m6633a();
            }
        }
    }

    public C3920n(Context context, C1827c c1827c, C1965a c1965a, C1736k c1736k) {
        super(context);
        this.f15604m = context;
        this.f15606o = c1965a;
        this.f15594c = c1827c;
        this.f15595d = c1736k;
        this.f15596e = c1736k.m6581e().m6512j();
        this.f15597f = c1736k.m6580d();
        this.f15593b = new RelativeLayout(context);
        this.f15598g = new C3906f(context);
        this.f15599h = new C1915f(this.f15596e.m6568b(), this);
        this.f15600i = new C1915f(3, new C39162(this));
    }

    /* renamed from: a */
    private void m19485a(AudienceNetworkActivity audienceNetworkActivity) {
        this.f15601j = audienceNetworkActivity.getRequestedOrientation();
        audienceNetworkActivity.setRequestedOrientation(1);
    }

    /* renamed from: a */
    private void m19486a(C3835a c3835a) {
        if (this.f15604m != null) {
            this.f15611t = new C3769i(this.f15604m, this.f15594c, c3835a.getViewabilityChecker(), c3835a.getTouchDataRecorder(), new C39185(this));
            this.f15611t.m18882a(this.f15595d);
        }
    }

    /* renamed from: c */
    private void m19490c() {
        View d = m19491d();
        d.loadUrl(this.f15596e.m6567a());
        d.setOnTouchListener(new C2084a(d, this.f15594c, this.f15595d));
        d.addJavascriptInterface(new C2085b(), "FbPlayableAd");
        C1936w.m7328a(this.f15593b, this.f15597f.m6481a().m6527d(true));
        ViewGroup.LayoutParams layoutParams = new LayoutParams(-1, -1);
        layoutParams.addRule(3, this.f15598g.getId());
        d.setLayoutParams(layoutParams);
        d.setVisibility(4);
        d.setOnAssetsLoadedListener(this);
        this.f15593b.addView(this.f15598g);
        this.f15593b.addView(d);
    }

    /* renamed from: d */
    private C3835a m19491d() {
        this.f15607p = new C46674(this);
        C3835a c3835a = new C3835a(this.f15604m, new WeakReference(this.f15607p), 10);
        c3835a.setLogMultipleImpressions(false);
        c3835a.setWaitForAssetsToLoad(true);
        c3835a.setCheckAssetsByJavascriptBridge(false);
        WebSettings settings = c3835a.getSettings();
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        m19486a(c3835a);
        this.f15602k = new WeakReference(c3835a);
        return c3835a;
    }

    /* renamed from: f */
    private void m19495f() {
        CharSequence a = this.f15595d.m6582f().m6534a();
        if (this.f15604m != null || !TextUtils.isEmpty(a)) {
            C1950e c1950e = new C1950e(this.f15604m, new HashMap());
            c1950e.m7370a(new C3919c(new WeakReference(this.f15606o)));
            c1950e.executeOnExecutor(this.f15609r, new String[]{a});
        }
    }

    /* renamed from: g */
    private void m19497g() {
        if (this.f15606o != null) {
            this.f15606o.mo1281a(C2041z.REWARDED_VIDEO_COMPLETE.m7604a(), new C3867b(0, 0));
        }
    }

    /* renamed from: a */
    public void mo1483a() {
        this.f15598g.m19452a(true);
        m19495f();
        m19497g();
    }

    /* renamed from: a */
    public void mo1484a(int i) {
        this.f15598g.setProgress((1.0f - (((float) i) / ((float) this.f15596e.m6568b()))) * 100.0f);
    }

    /* renamed from: a */
    public void mo1420a(Intent intent, Bundle bundle, AudienceNetworkActivity audienceNetworkActivity) {
        if (this.f15606o == null) {
            return;
        }
        if (this.f15604m != null) {
            this.f15605n = audienceNetworkActivity;
            this.f15605n.m6412a(this.f15610s);
            m19485a(audienceNetworkActivity);
            this.f15598g.m19449a(this.f15597f.m6481a(), true);
            this.f15598g.setShowPageDetails(false);
            this.f15598g.m19450a(this.f15595d.m6574a(), this.f15595d.m6583g(), this.f15596e.m6568b());
            this.f15598g.setToolbarListener(new C39173(this));
            C1936w.m7327a(this.f15598g);
            ViewGroup.LayoutParams layoutParams = new LayoutParams(-1, -2);
            layoutParams.addRule(10);
            this.f15598g.setLayoutParams(layoutParams);
            View c2021a = new C2021a(this.f15604m, this.f15595d);
            this.f15593b.setLayoutParams(f15592a);
            C1936w.m7328a(this.f15593b, this.f15597f.m6481a().m6527d(true));
            this.f15593b.addView(c2021a, f15592a);
            addView(this.f15593b);
            setLayoutParams(f15592a);
            this.f15606o.mo1279a((View) this);
            this.f15600i.m7273a();
        }
    }

    /* renamed from: a */
    public void mo1421a(Bundle bundle) {
    }

    /* renamed from: b */
    public void mo1485b() {
        if (!this.f15603l && this.f15602k.get() != null) {
            ((C3835a) this.f15602k.get()).setVisibility(0);
        }
    }

    /* renamed from: e */
    public void mo1422e() {
        this.f15600i.m7274b();
        this.f15599h.m7274b();
        this.f15598g.setToolbarListener(null);
        if (this.f15605n != null) {
            this.f15605n.m6413b(this.f15610s);
            this.f15605n.setRequestedOrientation(this.f15601j);
        }
        C3835a c3835a = (C3835a) this.f15602k.get();
        if (c3835a != null) {
            c3835a.removeJavascriptInterface("FbPlayableAd");
        }
        if (!(c3835a == null || TextUtils.isEmpty(this.f15595d.m6583g()))) {
            Map hashMap = new HashMap();
            c3835a.getViewabilityChecker().m7419a(hashMap);
            hashMap.put("touch", C1921k.m7293a(c3835a.getTouchDataRecorder().m7321e()));
            this.f15594c.mo1364i(this.f15595d.m6583g(), hashMap);
        }
        this.f15606o = null;
        this.f15607p = null;
        this.f15605n = null;
        this.f15604m = null;
    }

    /* renamed from: k */
    public void mo1423k() {
        this.f15600i.m7274b();
        this.f15599h.m7274b();
    }

    /* renamed from: l */
    public void mo1424l() {
        C1915f c1915f;
        if (!this.f15600i.m7276d()) {
            c1915f = this.f15600i;
        } else if (!this.f15599h.m7275c()) {
            c1915f = this.f15599h;
        } else {
            return;
        }
        c1915f.m7273a();
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.f15602k == null) {
            return;
        }
        if (this.f15602k.get() != null) {
            if (z) {
                mo1424l();
            } else {
                mo1423k();
            }
        }
    }

    public void setListener(C1965a c1965a) {
        this.f15606o = c1965a;
    }
}
