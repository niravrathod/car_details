package com.facebook.ads.internal.view.component.p112a.p113a;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.internal.adapters.p082a.C1727d;
import com.facebook.ads.internal.p101q.p102a.C1936w;
import com.facebook.ads.internal.view.C2091s;
import com.facebook.ads.internal.view.component.p112a.C2007b;
import com.facebook.ads.internal.view.component.p112a.C2011d;
import com.facebook.ads.internal.view.p109b.C1991d;
import com.facebook.ads.internal.view.p109b.C1992e;
import com.facebook.ads.internal.view.p110c.p111a.C1997e;
import com.facebook.ads.internal.view.p110c.p111a.C3840a;
import com.facebook.ads.internal.view.p116f.p117a.C2038a;
import com.facebook.ads.internal.view.p116f.p118b.C3867b;
import com.facebook.ads.internal.view.p116f.p118b.C3868c;
import com.facebook.ads.internal.view.p116f.p118b.C3873h;
import com.facebook.ads.internal.view.p116f.p118b.C3874i;
import com.facebook.ads.internal.view.p116f.p118b.C3875j;
import com.facebook.ads.internal.view.p116f.p118b.C3876k;
import com.facebook.ads.internal.view.p116f.p118b.C3877l;
import com.facebook.ads.internal.view.p116f.p118b.C3878m;
import com.facebook.ads.internal.view.p116f.p118b.C3887v;
import com.facebook.ads.internal.view.p116f.p118b.C3888w;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.view.component.a.a.b */
public abstract class C3849b extends C2007b {
    /* renamed from: c */
    private static final int f15355c = ((int) (C1936w.f5934b * 1.0f));
    /* renamed from: d */
    private static final int f15356d = ((int) (C1936w.f5934b * 4.0f));
    /* renamed from: e */
    private static final int f15357e = ((int) (C1936w.f5934b * 6.0f));
    /* renamed from: f */
    private C2091s f15358f;
    /* renamed from: g */
    private C1997e f15359g;
    /* renamed from: h */
    private RelativeLayout f15360h;
    /* renamed from: i */
    private final String f15361i;
    /* renamed from: j */
    private final Paint f15362j;
    /* renamed from: k */
    private boolean f15363k;
    /* renamed from: l */
    private C3840a f15364l;
    /* renamed from: m */
    private final Path f15365m = new Path();
    /* renamed from: n */
    private final RectF f15366n = new RectF();
    /* renamed from: o */
    private boolean f15367o;
    /* renamed from: p */
    private boolean f15368p;
    /* renamed from: q */
    private C2002a f15369q;
    /* renamed from: r */
    private final C3888w f15370r = new C46051(this);
    /* renamed from: s */
    private final C3868c f15371s = new C46062(this);
    /* renamed from: t */
    private final C3876k f15372t = new C46073(this);
    /* renamed from: u */
    private final C3874i f15373u = new C46084(this);
    /* renamed from: v */
    private final C3878m f15374v = new C46095(this);

    /* renamed from: com.facebook.ads.internal.view.component.a.a.b$a */
    public interface C2002a {
        /* renamed from: a */
        void mo1432a();
    }

    /* renamed from: com.facebook.ads.internal.view.component.a.a.b$c */
    public interface C2003c {
        /* renamed from: a */
        void mo1428a(int i);
    }

    /* renamed from: com.facebook.ads.internal.view.component.a.a.b$d */
    public interface C2004d {
        /* renamed from: a */
        void mo1429a(View view);

        /* renamed from: b */
        void mo1430b(View view);
    }

    /* renamed from: com.facebook.ads.internal.view.component.a.a.b$e */
    public interface C2005e {
        /* renamed from: a */
        float mo1426a();

        /* renamed from: a */
        void mo1427a(float f);
    }

    /* renamed from: com.facebook.ads.internal.view.component.a.a.b$b */
    private static class C3848b implements C1992e {
        /* renamed from: a */
        final WeakReference<C3849b> f15354a;

        private C3848b(C3849b c3849b) {
            this.f15354a = new WeakReference(c3849b);
        }

        /* renamed from: a */
        public void mo1272a(boolean z) {
            C3849b c3849b = (C3849b) this.f15354a.get();
            if (c3849b != null) {
                c3849b.f15367o = z;
                c3849b.m19194k();
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.component.a.a.b$1 */
    class C46051 extends C3888w {
        /* renamed from: a */
        final /* synthetic */ C3849b f19149a;

        C46051(C3849b c3849b) {
            this.f19149a = c3849b;
        }

        /* renamed from: a */
        public void m25483a(C3887v c3887v) {
            this.f19149a.f15364l.m19167a().mo1427a(this.f19149a.getVideoView().getVolume());
        }
    }

    /* renamed from: com.facebook.ads.internal.view.component.a.a.b$2 */
    class C46062 extends C3868c {
        /* renamed from: a */
        final /* synthetic */ C3849b f19150a;

        C46062(C3849b c3849b) {
            this.f19150a = c3849b;
        }

        /* renamed from: a */
        public void m25485a(C3867b c3867b) {
            this.f19150a.f15364l.m19171b().mo1428a(((Integer) this.f19150a.getTag(-1593835536)).intValue());
        }
    }

    /* renamed from: com.facebook.ads.internal.view.component.a.a.b$3 */
    class C46073 extends C3876k {
        /* renamed from: a */
        final /* synthetic */ C3849b f19151a;

        C46073(C3849b c3849b) {
            this.f19151a = c3849b;
        }

        /* renamed from: a */
        public void m25487a(C3875j c3875j) {
            this.f19151a.f15364l.m19172c().mo1429a(this.f19151a);
        }
    }

    /* renamed from: com.facebook.ads.internal.view.component.a.a.b$4 */
    class C46084 extends C3874i {
        /* renamed from: a */
        final /* synthetic */ C3849b f19152a;

        C46084(C3849b c3849b) {
            this.f19152a = c3849b;
        }

        /* renamed from: a */
        public void m25489a(C3873h c3873h) {
            this.f19152a.f15364l.m19172c().mo1430b(this.f19152a);
        }
    }

    /* renamed from: com.facebook.ads.internal.view.component.a.a.b$5 */
    class C46095 extends C3878m {
        /* renamed from: a */
        final /* synthetic */ C3849b f19153a;

        C46095(C3849b c3849b) {
            this.f19153a = c3849b;
        }

        /* renamed from: a */
        public void m25491a(C3877l c3877l) {
            this.f19153a.f15368p = true;
            this.f19153a.m19194k();
        }
    }

    C3849b(C2011d c2011d, C1727d c1727d, boolean z, String str, C3840a c3840a) {
        super(c2011d, c1727d, z);
        this.f15364l = c3840a;
        this.f15361i = str;
        setGravity(17);
        setPadding(f15355c, 0, f15355c, f15355c);
        C1936w.m7328a((View) this, 0);
        setUpView(getContext());
        this.f15362j = new Paint();
        this.f15362j.setColor(-16777216);
        this.f15362j.setStyle(Style.FILL);
        this.f15362j.setAlpha(16);
        this.f15362j.setAntiAlias(true);
        if (VERSION.SDK_INT < 18) {
            setLayerType(1, null);
        }
    }

    /* renamed from: a */
    private void m19190a(View view) {
        view.setLayoutParams(new LayoutParams(-1, -2));
        C1936w.m7327a(view);
    }

    /* renamed from: k */
    private void m19194k() {
        if (this.f15369q != null) {
            if ((m19201d() && this.f15368p) || (!m19201d() && this.f15367o)) {
                this.f15369q.mo1432a();
            }
        }
    }

    private void setUpView(Context context) {
        setUpImageView(context);
        setUpVideoView(context);
        setUpMediaContainer(context);
        this.f15360h.addView(this.f15358f);
        this.f15360h.addView(this.f15359g);
        mo3980a(context);
    }

    /* renamed from: a */
    protected abstract void mo3980a(Context context);

    /* renamed from: a */
    public void m19196a(String str, String str2) {
        getTitleDescContainer().m7580a(str, str2, true, false);
    }

    /* renamed from: a */
    public void m19197a(String str, String str2, Map<String, String> map) {
        getCtaButton().m7578a(str, str2, this.f15361i, map);
    }

    /* renamed from: a */
    public void m19198a(Map<String, String> map) {
        this.f15359g.m7517c();
        if (m19201d()) {
            this.f15359g.m7514a(getAdEventManager(), this.f15361i, map);
        }
    }

    /* renamed from: a */
    public boolean mo1433a() {
        return false;
    }

    /* renamed from: c */
    protected boolean mo1434c() {
        return false;
    }

    /* renamed from: d */
    public boolean m19201d() {
        return this.f15363k;
    }

    /* renamed from: e */
    public boolean m19202e() {
        return m19201d() && this.f15359g.m7516b();
    }

    /* renamed from: f */
    public void m19203f() {
        if (m19201d()) {
            m19205h();
            this.f15359g.m7515a(C2038a.AUTO_STARTED);
        }
    }

    /* renamed from: g */
    public void m19204g() {
        if (m19201d()) {
            this.f15359g.m7512a();
        }
    }

    protected final RelativeLayout getMediaContainer() {
        return this.f15360h;
    }

    protected final C1997e getVideoView() {
        return this.f15359g;
    }

    /* renamed from: h */
    public void m19205h() {
        float a = this.f15364l.m19167a().mo1426a();
        if (m19201d() && a != this.f15359g.getVolume()) {
            this.f15359g.setVolume(a);
        }
    }

    protected void onDraw(Canvas canvas) {
        this.f15365m.reset();
        this.f15366n.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
        this.f15365m.addRoundRect(this.f15366n, (float) f15357e, (float) f15357e, Direction.CW);
        canvas.drawPath(this.f15365m, this.f15362j);
        this.f15366n.set((float) f15355c, 0.0f, (float) (getWidth() - f15355c), (float) (getHeight() - f15355c));
        this.f15365m.addRoundRect(this.f15366n, (float) f15356d, (float) f15356d, Direction.CW);
        canvas.clipPath(this.f15365m);
        super.onDraw(canvas);
    }

    public void setImageUrl(String str) {
        this.f15358f.setVisibility(0);
        this.f15359g.setVisibility(8);
        new C1991d(this.f15358f).m7499a().m7501a(new C3848b()).m7503a(str);
    }

    public void setIsVideo(boolean z) {
        this.f15363k = z;
    }

    public void setOnAssetsLoadedListener(C2002a c2002a) {
        this.f15369q = c2002a;
    }

    protected void setUpImageView(Context context) {
        this.f15358f = new C2091s(context);
        m19190a(this.f15358f);
    }

    protected void setUpMediaContainer(Context context) {
        this.f15360h = new RelativeLayout(context);
        m19190a(this.f15360h);
    }

    protected void setUpVideoView(Context context) {
        this.f15359g = new C1997e(context, getAdEventManager());
        m19190a(this.f15359g);
    }

    public void setVideoPlaceholderUrl(String str) {
        this.f15359g.setPlaceholderUrl(str);
    }

    public void setVideoUrl(String str) {
        this.f15358f.setVisibility(8);
        this.f15359g.setVisibility(0);
        this.f15359g.setVideoURI(str);
        this.f15359g.m7513a(this.f15370r);
        this.f15359g.m7513a(this.f15371s);
        this.f15359g.m7513a(this.f15372t);
        this.f15359g.m7513a(this.f15373u);
        this.f15359g.m7513a(this.f15374v);
    }
}
