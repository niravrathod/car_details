package com.facebook.ads.internal.view.p110c.p111a;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.p091j.C1817f;
import com.facebook.ads.internal.p094m.C1827c;
import com.facebook.ads.internal.p101q.p102a.C1936w;
import com.facebook.ads.internal.view.C4672t;
import com.facebook.ads.internal.view.p116f.C4617b;
import com.facebook.ads.internal.view.p116f.p117a.C2038a;
import com.facebook.ads.internal.view.p116f.p119c.C3894d;
import com.facebook.ads.internal.view.p116f.p119c.C3894d.C2054a;
import com.facebook.ads.internal.view.p116f.p119c.C3895f;
import com.facebook.ads.internal.view.p116f.p119c.C4622b;
import com.facebook.ads.internal.view.p116f.p119c.C4630g;
import com.facebook.ads.internal.view.p116f.p119c.C4644l;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.view.c.a.e */
public class C1997e extends FrameLayout {
    /* renamed from: a */
    private static final int f6160a = ((int) (C1936w.f5934b * 16.0f));
    /* renamed from: b */
    private final C1827c f6161b;
    /* renamed from: c */
    private C4672t f6162c;
    /* renamed from: d */
    private C3895f f6163d;
    /* renamed from: e */
    private C4644l f6164e;
    /* renamed from: f */
    private C4630g f6165f;
    /* renamed from: g */
    private C4617b f6166g;

    /* renamed from: com.facebook.ads.internal.view.c.a.e$1 */
    class C19961 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C1997e f6159a;

        C19961(C1997e c1997e) {
            this.f6159a = c1997e;
        }

        public void onClick(View view) {
            this.f6159a.f6164e.performClick();
        }
    }

    public C1997e(Context context, C1827c c1827c) {
        super(context);
        this.f6161b = c1827c;
        setUpView(context);
    }

    private void setUpPlugins(Context context) {
        this.f6162c.m19259b();
        this.f6165f = new C4630g(context);
        this.f6162c.m19256a(this.f6165f);
        this.f6163d = new C3895f(context);
        this.f6162c.m19256a(new C4622b(context));
        this.f6162c.m19256a(this.f6163d);
        this.f6164e = new C4644l(context, true);
        this.f6162c.m19256a(this.f6164e);
        this.f6162c.m19256a(new C3894d(this.f6164e, C2054a.FADE_OUT_ON_PLAY, true, true));
        LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(11);
        layoutParams.setMargins(f6160a, f6160a, f6160a, f6160a);
        this.f6163d.setLayoutParams(layoutParams);
        this.f6162c.addView(this.f6163d);
    }

    private void setUpVideo(Context context) {
        this.f6162c = new C4672t(context);
        this.f6162c.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        C1936w.m7327a(this.f6162c);
        addView(this.f6162c);
        setOnClickListener(new C19961(this));
    }

    private void setUpView(Context context) {
        setUpVideo(context);
        setUpPlugins(context);
    }

    /* renamed from: a */
    public void m7512a() {
        this.f6162c.m19258a(true);
    }

    /* renamed from: a */
    public void m7513a(C1817f c1817f) {
        this.f6162c.getEventBus().m6831a(c1817f);
    }

    /* renamed from: a */
    public void m7514a(C1827c c1827c, String str, Map<String, String> map) {
        m7517c();
        this.f6166g = new C4617b(getContext(), c1827c, this.f6162c, str, (Map) map);
    }

    /* renamed from: a */
    public void m7515a(C2038a c2038a) {
        this.f6162c.m19255a(c2038a);
    }

    /* renamed from: b */
    public boolean m7516b() {
        return this.f6162c.m19264g();
    }

    /* renamed from: c */
    public void m7517c() {
        if (this.f6166g != null) {
            this.f6166g.mo3983a();
            this.f6166g = null;
        }
    }

    public float getVolume() {
        return this.f6162c.getVolume();
    }

    public void setPlaceholderUrl(String str) {
        this.f6165f.setImage(str);
    }

    public void setVideoURI(String str) {
        this.f6162c.setVideoURI(str);
    }

    public void setVolume(float f) {
        this.f6162c.setVolume(f);
        this.f6163d.m19340a();
    }
}
