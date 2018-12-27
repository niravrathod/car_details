package com.facebook.ads.internal.p095n;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.p101q.p102a.C1936w;
import com.facebook.ads.internal.p107r.C1958a;
import com.facebook.ads.internal.p107r.C1958a.C1957a;
import com.facebook.ads.internal.settings.C1964b;
import com.facebook.ads.internal.view.C4662j;
import com.facebook.ads.internal.view.p109b.C1992e;
import com.facebook.ads.internal.view.p116f.C2074d;
import com.facebook.ads.internal.view.p116f.C2074d.C2064a;
import com.facebook.ads.internal.view.p116f.p117a.C2038a;
import com.facebook.ads.internal.view.p116f.p117a.C2039b;
import com.facebook.ads.internal.view.p116f.p119c.C4630g;
import com.facebook.ads.internal.view.p116f.p119c.C4635h;
import com.facebook.ads.internal.view.p116f.p120d.C2072d;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.internal.n.c */
public class C1834c {
    /* renamed from: a */
    private static final String f5560a = "c";
    /* renamed from: b */
    private final C4630g f5561b;
    /* renamed from: c */
    private final C1958a f5562c;
    /* renamed from: d */
    private final C1957a f5563d;
    /* renamed from: e */
    private final View f5564e;
    /* renamed from: f */
    private final C2064a f5565f = new C38011(this);
    /* renamed from: g */
    private C4662j f5566g;
    /* renamed from: h */
    private C1833a f5567h;
    /* renamed from: i */
    private Context f5568i;
    /* renamed from: j */
    private boolean f5569j;
    /* renamed from: k */
    private boolean f5570k;
    /* renamed from: l */
    private boolean f5571l;
    /* renamed from: m */
    private final AtomicBoolean f5572m = new AtomicBoolean(false);
    /* renamed from: n */
    private final AtomicBoolean f5573n = new AtomicBoolean(false);
    /* renamed from: o */
    private C1844m f5574o = C1844m.DEFAULT;

    /* renamed from: com.facebook.ads.internal.n.c$3 */
    class C18323 implements OnTouchListener {
        /* renamed from: a */
        final /* synthetic */ C1834c f5559a;

        C18323(C1834c c1834c) {
            this.f5559a = c1834c;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (this.f5559a.f5566g != null && motionEvent.getAction() == 1) {
                this.f5559a.f5566g.mo3991r();
            }
            return true;
        }
    }

    /* renamed from: com.facebook.ads.internal.n.c$a */
    public interface C1833a {
        /* renamed from: a */
        void mo1282a(boolean z);
    }

    /* renamed from: com.facebook.ads.internal.n.c$1 */
    class C38011 implements C2064a {
        /* renamed from: a */
        final /* synthetic */ C1834c f15233a;

        C38011(C1834c c1834c) {
            this.f15233a = c1834c;
        }

        /* renamed from: a */
        public void mo1371a() {
            this.f15233a.f5573n.set(true);
            if (this.f15233a.f5567h != null) {
                this.f15233a.f5567h.mo1282a(this.f15233a.f5572m.get());
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.n.c$2 */
    class C38022 implements C1992e {
        /* renamed from: a */
        final /* synthetic */ C1834c f15234a;

        C38022(C1834c c1834c) {
            this.f15234a = c1834c;
        }

        /* renamed from: a */
        public void mo1272a(boolean z) {
            this.f15234a.f5572m.set(z);
            if (this.f15234a.f5573n.get() && this.f15234a.f5567h != null) {
                this.f15234a.f5567h.mo1282a(z);
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.n.c$4 */
    class C38034 extends C1957a {
        /* renamed from: a */
        final /* synthetic */ C1834c f15235a;

        C38034(C1834c c1834c) {
            this.f15235a = c1834c;
        }

        /* renamed from: a */
        public void mo1338a() {
            if (this.f15235a.f5566g != null) {
                if (!this.f15235a.f5571l && (this.f15235a.f5570k || this.f15235a.m6948m())) {
                    this.f15235a.m6931a(C2038a.AUTO_STARTED);
                }
                this.f15235a.f5570k = false;
                this.f15235a.f5571l = false;
            }
        }

        /* renamed from: b */
        public void mo1372b() {
            if (this.f15235a.f5566g != null) {
                if (this.f15235a.f5566g.getState() == C2072d.PAUSED) {
                    this.f15235a.f5571l = true;
                } else if (this.f15235a.f5566g.getState() == C2072d.STARTED) {
                    this.f15235a.f5570k = true;
                }
                this.f15235a.m6932a(this.f15235a.f5571l);
            }
        }
    }

    public C1834c(Context context, View view) {
        this.f5568i = context;
        this.f5564e = view;
        this.f5561b = new C4630g(context);
        this.f5563d = m6946k();
        this.f5562c = m6945j();
        m6941g();
    }

    /* renamed from: a */
    private void m6931a(C2038a c2038a) {
        if (this.f5566g != null) {
            this.f5566g.m19255a(c2038a);
        } else if (C1964b.m7441f()) {
            Log.e(f5560a, "MediaViewVideo is null; unable to find it.");
        }
    }

    /* renamed from: a */
    private void m6932a(boolean z) {
        if (this.f5566g != null) {
            this.f5566g.m19258a(z);
        } else if (C1964b.m7441f()) {
            Log.e(f5560a, "MediaViewVideo is null; unable to find it.");
        }
    }

    /* renamed from: g */
    private void m6941g() {
        float f = C1936w.f5934b;
        int i = (int) (2.0f * f);
        int i2 = (int) (f * 25.0f);
        C2039b c4635h = new C4635h(this.f5568i);
        LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(9);
        layoutParams.addRule(12);
        c4635h.setPadding(i, i2, i2, i);
        c4635h.setLayoutParams(layoutParams);
        for (i = 0; i < ((ViewGroup) this.f5564e).getChildCount(); i++) {
            View childAt = ((ViewGroup) this.f5564e).getChildAt(0);
            if (childAt instanceof C4662j) {
                this.f5566g = (C4662j) childAt;
                break;
            }
        }
        if (this.f5566g != null) {
            this.f5566g.m19256a(this.f5561b);
            this.f5566g.m19256a(c4635h);
        } else if (C1964b.m7441f()) {
            Log.e(f5560a, "Unable to find MediaViewVideo child.");
        }
        this.f5562c.m7418a(0);
        this.f5562c.m7420b(250);
    }

    /* renamed from: h */
    private void m6943h() {
        if (this.f5566g != null) {
            ((C2074d) this.f5566g.getVideoView()).setViewImplInflationListener(this.f5565f);
        }
    }

    /* renamed from: i */
    private void m6944i() {
        if (this.f5566g != null) {
            ((C2074d) this.f5566g.getVideoView()).setViewImplInflationListener(null);
        }
    }

    /* renamed from: j */
    private C1958a m6945j() {
        return new C1958a(this.f5564e, 50, true, this.f5563d);
    }

    /* renamed from: k */
    private C1957a m6946k() {
        return new C38034(this);
    }

    /* renamed from: l */
    private void m6947l() {
        if (this.f5564e.getVisibility() == 0 && this.f5569j && this.f5564e.hasWindowFocus()) {
            this.f5562c.m7417a();
            return;
        }
        if (this.f5566g != null && this.f5566g.getState() == C2072d.PAUSED) {
            this.f5571l = true;
        }
        this.f5562c.m7422c();
    }

    /* renamed from: m */
    private boolean m6948m() {
        return this.f5566g != null ? this.f5566g.getState() == C2072d.PLAYBACK_COMPLETED ? false : this.f5574o == C1844m.ON : false;
    }

    /* renamed from: a */
    public void m6949a() {
        this.f5574o = C1844m.DEFAULT;
        m6944i();
    }

    /* renamed from: a */
    public void m6950a(C1837d c1837d, C1833a c1833a) {
        this.f5570k = false;
        this.f5571l = false;
        this.f5567h = c1833a;
        m6943h();
        C4630g c4630g = this.f5561b;
        String a = (c1837d == null || c1837d.m7004e() == null) ? null : c1837d.m7004e().m7018a();
        c4630g.m25560a(a, new C38022(this));
        this.f5574o = c1837d.m7012m();
        this.f5562c.m7417a();
    }

    /* renamed from: b */
    public void m6951b() {
        if (this.f5566g != null) {
            this.f5566g.getVideoView().setOnTouchListener(new C18323(this));
        }
    }

    /* renamed from: c */
    public void m6952c() {
        this.f5569j = true;
        m6947l();
    }

    /* renamed from: d */
    public void m6953d() {
        this.f5569j = false;
        m6947l();
    }

    /* renamed from: e */
    public void m6954e() {
        m6947l();
    }

    /* renamed from: f */
    public void m6955f() {
        m6947l();
    }
}
