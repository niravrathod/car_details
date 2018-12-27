package com.facebook.ads.internal.view.p116f;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.p091j.C1815d;
import com.facebook.ads.internal.p091j.C1816e;
import com.facebook.ads.internal.p091j.C1817f;
import com.facebook.ads.internal.p093l.C1820a;
import com.facebook.ads.internal.p101q.p102a.C1936w;
import com.facebook.ads.internal.settings.C1964b;
import com.facebook.ads.internal.view.p116f.C3903c.C2042a;
import com.facebook.ads.internal.view.p116f.p117a.C2038a;
import com.facebook.ads.internal.view.p116f.p117a.C2039b;
import com.facebook.ads.internal.view.p116f.p117a.C3858c;
import com.facebook.ads.internal.view.p116f.p118b.C3867b;
import com.facebook.ads.internal.view.p116f.p118b.C3869d;
import com.facebook.ads.internal.view.p116f.p118b.C3873h;
import com.facebook.ads.internal.view.p116f.p118b.C3875j;
import com.facebook.ads.internal.view.p116f.p118b.C3877l;
import com.facebook.ads.internal.view.p116f.p118b.C3879n;
import com.facebook.ads.internal.view.p116f.p118b.C3881p;
import com.facebook.ads.internal.view.p116f.p118b.C3883r;
import com.facebook.ads.internal.view.p116f.p118b.C3884s;
import com.facebook.ads.internal.view.p116f.p118b.C3885t;
import com.facebook.ads.internal.view.p116f.p118b.C3887v;
import com.facebook.ads.internal.view.p116f.p118b.C3889x;
import com.facebook.ads.internal.view.p116f.p118b.C3890y;
import com.facebook.ads.internal.view.p116f.p119c.C4630g;
import com.facebook.ads.internal.view.p116f.p120d.C2071c;
import com.facebook.ads.internal.view.p116f.p120d.C2072d;
import com.facebook.ads.internal.view.p116f.p120d.C2073e;
import com.facebook.ads.internal.view.p116f.p120d.C3904a;
import com.facebook.ads.internal.view.p116f.p120d.C3905b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.internal.view.f.a */
public class C3859a extends RelativeLayout implements C2042a, C2073e {
    /* renamed from: b */
    private static final C3877l f15394b = new C3877l();
    /* renamed from: c */
    private static final C3869d f15395c = new C3869d();
    /* renamed from: d */
    private static final C3883r f15396d = new C3883r();
    /* renamed from: e */
    private static final C3873h f15397e = new C3873h();
    /* renamed from: f */
    private static final C3884s f15398f = new C3884s();
    /* renamed from: g */
    private static final C3875j f15399g = new C3875j();
    /* renamed from: h */
    private static final C3887v f15400h = new C3887v();
    /* renamed from: i */
    private static final C3890y f15401i = new C3890y();
    /* renamed from: j */
    private static final C3889x f15402j = new C3889x();
    /* renamed from: a */
    protected final C2071c f15403a;
    /* renamed from: k */
    private C2074d f15404k;
    /* renamed from: l */
    private final List<C2039b> f15405l = new ArrayList();
    /* renamed from: m */
    private final Handler f15406m = new Handler();
    /* renamed from: n */
    private final Handler f15407n = new Handler();
    /* renamed from: o */
    private final C1816e<C1817f, C1815d> f15408o = new C1816e();
    /* renamed from: p */
    private boolean f15409p;
    /* renamed from: q */
    private boolean f15410q;
    /* renamed from: r */
    private boolean f15411r = false;
    /* renamed from: s */
    private int f15412s = 200;
    /* renamed from: t */
    private final OnTouchListener f15413t = new C20364(this);

    /* renamed from: com.facebook.ads.internal.view.f.a$1 */
    class C20331 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C3859a f6293a;

        C20331(C3859a c3859a) {
            this.f6293a = c3859a;
        }

        public void run() {
            if (!this.f6293a.f15409p) {
                this.f6293a.f15408o.m6829a(new C3879n(this.f6293a.getCurrentPositionInMillis()));
                this.f6293a.f15406m.postDelayed(this, (long) this.f6293a.f15412s);
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.f.a$4 */
    class C20364 implements OnTouchListener {
        /* renamed from: a */
        final /* synthetic */ C3859a f6301a;

        C20364(C3859a c3859a) {
            this.f6301a = c3859a;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            this.f6301a.f15408o.m6829a(new C3885t(view, motionEvent));
            return false;
        }
    }

    /* renamed from: com.facebook.ads.internal.view.f.a$5 */
    class C20375 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C3859a f6302a;

        C20375(C3859a c3859a) {
            this.f6302a = c3859a;
        }

        public void run() {
            this.f6302a.getEventBus().m6829a(C3859a.f15396d);
        }
    }

    public C3859a(Context context) {
        super(context);
        this.f15403a = C1820a.m6845a(context) ? new C3904a(context) : new C3905b(context);
        mo3991r();
    }

    public C3859a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15403a = C1820a.m6845a(context) ? new C3904a(context, attributeSet) : new C3905b(context, attributeSet);
        mo3991r();
    }

    public C3859a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f15403a = C1820a.m6845a(context) ? new C3904a(context, attributeSet, i) : new C3905b(context, attributeSet, i);
        mo3991r();
    }

    /* renamed from: a */
    private void m19236a(C3858c c3858c) {
        if (c3858c.getParent() != null) {
            return;
        }
        if (c3858c instanceof C4630g) {
            this.f15404k.m7628a(c3858c);
        } else {
            addView(c3858c);
        }
    }

    /* renamed from: b */
    private void m19240b(C3858c c3858c) {
        if (c3858c instanceof C4630g) {
            this.f15404k.m7629b(c3858c);
        } else {
            C1936w.m7332b(c3858c);
        }
    }

    /* renamed from: r */
    private void mo3991r() {
        if (mo1444e() && (this.f15403a instanceof C3904a)) {
            ((C3904a) this.f15403a).setTestMode(C1964b.m7435a(getContext()));
        }
        this.f15403a.setRequestedVolume(1.0f);
        this.f15403a.setVideoStateChangeListener(this);
        this.f15404k = new C2074d(getContext(), this.f15403a);
        LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView(this.f15404k, layoutParams);
        setOnTouchListener(this.f15413t);
    }

    /* renamed from: s */
    private void mo3992s() {
        this.f15406m.postDelayed(new C20331(this), (long) this.f15412s);
    }

    /* renamed from: a */
    public void m19252a() {
        for (C2039b c2039b : this.f15405l) {
            if (c2039b instanceof C3858c) {
                m19236a((C3858c) c2039b);
            }
            c2039b.mo1440a(this);
        }
    }

    /* renamed from: a */
    public void m19253a(int i) {
        this.f15406m.removeCallbacksAndMessages(null);
        this.f15403a.mo1451a(i);
    }

    /* renamed from: a */
    public void mo1442a(final int i, final int i2) {
        this.f15407n.post(new Runnable(this) {
            /* renamed from: c */
            final /* synthetic */ C3859a f6300c;

            public void run() {
                this.f6300c.f15408o.m6829a(new C3881p(i, i2));
            }
        });
        mo3992s();
    }

    /* renamed from: a */
    public void m19255a(C2038a c2038a) {
        if (this.f15409p && this.f15403a.getState() == C2072d.PLAYBACK_COMPLETED) {
            this.f15409p = false;
        }
        this.f15403a.mo1453a(c2038a);
    }

    /* renamed from: a */
    public void m19256a(C2039b c2039b) {
        this.f15405l.add(c2039b);
    }

    /* renamed from: a */
    public void mo1443a(final C2072d c2072d) {
        final int currentPositionInMillis = getCurrentPositionInMillis();
        final int duration = getDuration();
        this.f15407n.post(new Runnable(this) {
            /* renamed from: d */
            final /* synthetic */ C3859a f6297d;

            public void run() {
                C1816e b;
                C1815d l;
                if (c2072d == C2072d.PREPARED) {
                    b = this.f6297d.f15408o;
                    l = C3859a.f15394b;
                } else if (c2072d == C2072d.ERROR) {
                    this.f6297d.f15409p = true;
                    b = this.f6297d.f15408o;
                    l = C3859a.f15395c;
                } else if (c2072d == C2072d.PLAYBACK_COMPLETED) {
                    this.f6297d.f15409p = true;
                    this.f6297d.f15406m.removeCallbacksAndMessages(null);
                    b = this.f6297d.f15408o;
                    l = new C3867b(currentPositionInMillis, duration);
                } else if (c2072d == C2072d.STARTED) {
                    this.f6297d.f15408o.m6829a(C3859a.f15399g);
                    this.f6297d.f15406m.removeCallbacksAndMessages(null);
                    this.f6297d.mo3992s();
                    return;
                } else {
                    if (c2072d == C2072d.PAUSED) {
                        b = this.f6297d.f15408o;
                        l = C3859a.f15397e;
                    } else if (c2072d == C2072d.IDLE) {
                        b = this.f6297d.f15408o;
                        l = C3859a.f15398f;
                    } else {
                        return;
                    }
                    b.m6829a(l);
                    this.f6297d.f15406m.removeCallbacksAndMessages(null);
                    return;
                }
                b.m6829a(l);
            }
        });
    }

    /* renamed from: a */
    public void m19258a(boolean z) {
        if (!m19267j()) {
            this.f15403a.mo1458a(z);
            this.f15411r = z;
        }
    }

    /* renamed from: b */
    public void m19259b() {
        for (C2039b c2039b : this.f15405l) {
            if (c2039b instanceof C3858c) {
                m19240b((C3858c) c2039b);
            }
            c2039b.mo1441b(this);
        }
    }

    /* renamed from: c */
    public void m19260c() {
        this.f15407n.post(new C20375(this));
        this.f15403a.mo1461c();
    }

    /* renamed from: d */
    public void m19261d() {
        this.f15403a.mo1462d();
    }

    /* renamed from: e */
    public boolean mo1444e() {
        return C1820a.m6845a(getContext());
    }

    /* renamed from: f */
    public boolean mo1445f() {
        return this.f15410q;
    }

    /* renamed from: g */
    public boolean m19264g() {
        return getState() == C2072d.STARTED;
    }

    public int getCurrentPositionInMillis() {
        return this.f15403a.getCurrentPosition();
    }

    public int getDuration() {
        return this.f15403a.getDuration();
    }

    public C1816e<C1817f, C1815d> getEventBus() {
        return this.f15408o;
    }

    public long getInitialBufferTime() {
        return this.f15403a.getInitialBufferTime();
    }

    public C2072d getState() {
        return this.f15403a.getState();
    }

    protected Handler getStateHandler() {
        return this.f15407n;
    }

    public TextureView getTextureView() {
        return (TextureView) this.f15403a;
    }

    public int getVideoHeight() {
        return this.f15403a.getVideoHeight();
    }

    public int getVideoProgressReportIntervalMs() {
        return this.f15412s;
    }

    public C2038a getVideoStartReason() {
        return this.f15403a.getStartReason();
    }

    public View getVideoView() {
        return this.f15404k;
    }

    public int getVideoWidth() {
        return this.f15403a.getVideoWidth();
    }

    public float getVolume() {
        return this.f15403a.getVolume();
    }

    /* renamed from: h */
    public boolean m19265h() {
        return this.f15403a.mo1463e();
    }

    /* renamed from: i */
    public void m19266i() {
        this.f15403a.setVideoStateChangeListener(null);
        this.f15403a.mo1465g();
    }

    /* renamed from: j */
    public boolean m19267j() {
        return getState() == C2072d.PAUSED;
    }

    /* renamed from: k */
    public boolean m19268k() {
        return m19267j() && this.f15411r;
    }

    protected void onAttachedToWindow() {
        this.f15408o.m6829a(f15402j);
        super.onAttachedToWindow();
    }

    protected void onDetachedFromWindow() {
        this.f15408o.m6829a(f15401i);
        super.onDetachedFromWindow();
    }

    public void setControlsAnchorView(View view) {
        if (this.f15403a != null) {
            this.f15403a.setControlsAnchorView(view);
        }
    }

    public void setIsFullScreen(boolean z) {
        this.f15410q = z;
        this.f15403a.setFullScreen(z);
    }

    public void setLayoutParams(LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    public void setVideoMPD(String str) {
        this.f15403a.setVideoMPD(str);
    }

    public void setVideoProgressReportIntervalMs(int i) {
        this.f15412s = i;
    }

    public void setVideoURI(Uri uri) {
        if (uri == null) {
            m19259b();
        } else {
            m19252a();
            this.f15403a.setup(uri);
        }
        this.f15409p = false;
    }

    public void setVideoURI(String str) {
        setVideoURI(str != null ? Uri.parse(str) : null);
    }

    public void setVolume(float f) {
        this.f15403a.setRequestedVolume(f);
        getEventBus().m6829a(f15400h);
    }
}
