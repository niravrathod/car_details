package com.facebook.ads;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.facebook.ads.internal.p094m.C1827c;
import com.facebook.ads.internal.p101q.p102a.C1920j;
import com.facebook.ads.internal.view.C2081k;
import com.facebook.ads.internal.view.C4662j;
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
import com.facebook.ads.internal.view.p116f.p118b.C3881p;
import com.facebook.ads.internal.view.p116f.p118b.C3882q;
import com.facebook.ads.internal.view.p116f.p118b.C3887v;
import com.facebook.ads.internal.view.p116f.p118b.C3888w;

public abstract class MediaViewVideoRenderer extends FrameLayout {
    /* renamed from: d */
    private static final String f5097d = "MediaViewVideoRenderer";
    /* renamed from: a */
    protected C4589h f5098a;
    /* renamed from: b */
    protected VideoAutoplayBehavior f5099b;
    /* renamed from: c */
    final C4662j f5100c;
    /* renamed from: e */
    private final C3878m f5101e = new C45821(this);
    /* renamed from: f */
    private final C3876k f5102f = new C45832(this);
    /* renamed from: g */
    private final C3874i f5103g = new C45843(this);
    /* renamed from: h */
    private final C3882q f5104h = new C45854(this);
    /* renamed from: i */
    private final C3868c f5105i = new C45865(this);
    /* renamed from: j */
    private final C3888w f5106j = new C45876(this);
    /* renamed from: k */
    private final C3870e f5107k = new C45887(this);

    /* renamed from: com.facebook.ads.MediaViewVideoRenderer$1 */
    class C45821 extends C3878m {
        /* renamed from: a */
        final /* synthetic */ MediaViewVideoRenderer f18978a;

        C45821(MediaViewVideoRenderer mediaViewVideoRenderer) {
            this.f18978a = mediaViewVideoRenderer;
        }

        /* renamed from: a */
        public void m25244a(C3877l c3877l) {
            this.f18978a.mo1284b();
        }
    }

    /* renamed from: com.facebook.ads.MediaViewVideoRenderer$2 */
    class C45832 extends C3876k {
        /* renamed from: a */
        final /* synthetic */ MediaViewVideoRenderer f18979a;

        C45832(MediaViewVideoRenderer mediaViewVideoRenderer) {
            this.f18979a = mediaViewVideoRenderer;
        }

        /* renamed from: a */
        public void m25246a(C3875j c3875j) {
            if (this.f18979a.f5098a != null) {
                this.f18979a.f5098a.m18724g().m6998a(true, true);
            }
            this.f18979a.m6419d();
        }
    }

    /* renamed from: com.facebook.ads.MediaViewVideoRenderer$3 */
    class C45843 extends C3874i {
        /* renamed from: a */
        final /* synthetic */ MediaViewVideoRenderer f18980a;

        C45843(MediaViewVideoRenderer mediaViewVideoRenderer) {
            this.f18980a = mediaViewVideoRenderer;
        }

        /* renamed from: a */
        public void m25248a(C3873h c3873h) {
            this.f18980a.m6420e();
        }
    }

    /* renamed from: com.facebook.ads.MediaViewVideoRenderer$4 */
    class C45854 extends C3882q {
        /* renamed from: a */
        final /* synthetic */ MediaViewVideoRenderer f18981a;

        C45854(MediaViewVideoRenderer mediaViewVideoRenderer) {
            this.f18981a = mediaViewVideoRenderer;
        }

        /* renamed from: a */
        public void m25250a(C3881p c3881p) {
            this.f18981a.m6421f();
        }
    }

    /* renamed from: com.facebook.ads.MediaViewVideoRenderer$5 */
    class C45865 extends C3868c {
        /* renamed from: a */
        final /* synthetic */ MediaViewVideoRenderer f18982a;

        C45865(MediaViewVideoRenderer mediaViewVideoRenderer) {
            this.f18982a = mediaViewVideoRenderer;
        }

        /* renamed from: a */
        public void m25252a(C3867b c3867b) {
            this.f18982a.m6422g();
        }
    }

    /* renamed from: com.facebook.ads.MediaViewVideoRenderer$6 */
    class C45876 extends C3888w {
        /* renamed from: a */
        final /* synthetic */ MediaViewVideoRenderer f18983a;

        C45876(MediaViewVideoRenderer mediaViewVideoRenderer) {
            this.f18983a = mediaViewVideoRenderer;
        }

        /* renamed from: a */
        public void m25254a(C3887v c3887v) {
            this.f18983a.m6423h();
        }
    }

    /* renamed from: com.facebook.ads.MediaViewVideoRenderer$7 */
    class C45887 extends C3870e {
        /* renamed from: a */
        final /* synthetic */ MediaViewVideoRenderer f18984a;

        C45887(MediaViewVideoRenderer mediaViewVideoRenderer) {
            this.f18984a = mediaViewVideoRenderer;
        }

        /* renamed from: a */
        public void m25256a(C3869d c3869d) {
            if (this.f18984a.f5098a != null) {
                this.f18984a.f5098a.m18724g().m6998a(false, true);
            }
            this.f18984a.m6424i();
        }
    }

    public MediaViewVideoRenderer(Context context) {
        super(context);
        this.f5100c = new C4662j(context);
        m6414k();
    }

    public MediaViewVideoRenderer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5100c = new C4662j(context, attributeSet);
        m6414k();
    }

    public MediaViewVideoRenderer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5100c = new C4662j(context, attributeSet, i);
        m6414k();
    }

    /* renamed from: k */
    private void m6414k() {
        this.f5100c.setEnableBackgroundVideo(m6425j());
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        this.f5100c.setLayoutParams(layoutParams);
        super.addView(this.f5100c, -1, layoutParams);
        C1920j.m7291a(this.f5100c, C1920j.INTERNAL_AD_MEDIA);
        this.f5100c.getEventBus().m6830a(this.f5101e, this.f5102f, this.f5103g, this.f5104h, this.f5105i, this.f5106j, this.f5107k);
    }

    /* renamed from: a */
    protected void mo1283a() {
        m6416a(false);
        this.f5100c.m25673a(null, null);
        this.f5100c.setVideoMPD(null);
        this.f5100c.setVideoURI((Uri) null);
        this.f5100c.setVideoCTA(null);
        this.f5100c.setNativeAd(null);
        this.f5099b = VideoAutoplayBehavior.DEFAULT;
        if (this.f5098a != null) {
            this.f5098a.m18724g().m6998a(false, false);
        }
        this.f5098a = null;
    }

    /* renamed from: a */
    public final void m6416a(boolean z) {
        this.f5100c.m19258a(z);
    }

    public void addView(View view) {
    }

    public void addView(View view, int i) {
    }

    public void addView(View view, int i, int i2) {
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
    }

    public void addView(View view, LayoutParams layoutParams) {
    }

    /* renamed from: b */
    public void mo1284b() {
    }

    /* renamed from: c */
    public void m6418c() {
        this.f5100c.m19266i();
    }

    /* renamed from: d */
    public void m6419d() {
    }

    /* renamed from: e */
    public void m6420e() {
    }

    /* renamed from: f */
    public void m6421f() {
    }

    /* renamed from: g */
    public void m6422g() {
    }

    public final int getCurrentTimeMs() {
        return this.f5100c.getCurrentPositionInMillis();
    }

    public final int getDuration() {
        return this.f5100c.getDuration();
    }

    final View getVideoView() {
        return this.f5100c.getVideoView();
    }

    public final float getVolume() {
        return this.f5100c.getVolume();
    }

    /* renamed from: h */
    public void m6423h() {
    }

    /* renamed from: i */
    public void m6424i() {
    }

    /* renamed from: j */
    public boolean m6425j() {
        return false;
    }

    final void setAdEventManager(C1827c c1827c) {
        this.f5100c.setAdEventManager(c1827c);
    }

    final void setListener(C2081k c2081k) {
        this.f5100c.setListener(c2081k);
    }

    protected void setNativeAd(C4589h c4589h) {
        this.f5098a = c4589h;
        this.f5100c.m25673a(c4589h.m25259c(), c4589h.m18733p());
        this.f5100c.setVideoMPD(c4589h.m25258b());
        this.f5100c.setVideoURI(c4589h.m25257a());
        this.f5100c.setVideoProgressReportIntervalMs(c4589h.m18725h().mo3962s());
        this.f5100c.setVideoCTA(c4589h.m18730m());
        this.f5100c.setNativeAd(c4589h);
        this.f5099b = c4589h.m25260d();
    }

    public final void setVolume(float f) {
        this.f5100c.setVolume(f);
    }
}
