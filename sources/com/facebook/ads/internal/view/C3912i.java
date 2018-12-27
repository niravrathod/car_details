package com.facebook.ads.internal.view;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.RelativeLayout;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.adapters.p082a.C1720a;
import com.facebook.ads.internal.adapters.p082a.C1727d;
import com.facebook.ads.internal.adapters.p082a.C1730g;
import com.facebook.ads.internal.adapters.p082a.C1731h;
import com.facebook.ads.internal.p094m.C1827c;
import com.facebook.ads.internal.p101q.p102a.C1931r;
import com.facebook.ads.internal.p101q.p102a.C1931r.C1930a;
import com.facebook.ads.internal.p101q.p102a.C1936w;
import com.facebook.ads.internal.view.C1980a.C1965a;
import com.facebook.ads.internal.view.C3906f.C2032a;

/* renamed from: com.facebook.ads.internal.view.i */
public abstract class C3912i extends RelativeLayout implements C1980a {
    /* renamed from: a */
    protected static final int f15570a = ((int) (C1936w.f5934b * 56.0f));
    /* renamed from: b */
    protected final C1827c f15571b;
    /* renamed from: c */
    protected final C3906f f15572c = new C3906f(getContext());
    /* renamed from: d */
    protected C1720a f15573d;
    /* renamed from: e */
    private C1965a f15574e;
    /* renamed from: f */
    private final C1931r f15575f = new C1931r(this);

    protected C3912i(Context context, C1827c c1827c) {
        super(context.getApplicationContext());
        this.f15571b = c1827c;
    }

    /* renamed from: a */
    private void mo3978a() {
        removeAllViews();
        C1936w.m7332b(this);
    }

    /* renamed from: a */
    protected void m19465a(View view, boolean z, int i) {
        C3906f c3906f;
        C1727d a;
        this.f15575f.m7312a(C1930a.DEFAULT);
        mo3978a();
        LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(0, z ? 0 : f15570a, 0, 0);
        addView(view, layoutParams);
        LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, f15570a);
        layoutParams2.addRule(10);
        if (i == 1) {
            i = this.f15573d.m6481a().m6527d(z);
            c3906f = this.f15572c;
            a = this.f15573d.m6481a();
        } else {
            i = this.f15573d.m6482b().m6527d(z);
            c3906f = this.f15572c;
            a = this.f15573d.m6482b();
        }
        c3906f.m19449a(a, z);
        addView(this.f15572c, layoutParams2);
        C1936w.m7328a((View) this, i);
        if (this.f15574e != null) {
            this.f15574e.mo1279a((View) this);
            if (z && VERSION.SDK_INT >= 19) {
                this.f15575f.m7312a(C1930a.FULL_SCREEN);
            }
        }
    }

    /* renamed from: a */
    public void m19466a(final AudienceNetworkActivity audienceNetworkActivity, C1730g c1730g) {
        this.f15575f.m7311a(audienceNetworkActivity.getWindow());
        this.f15573d = c1730g.m6543b();
        this.f15572c.m19450a(c1730g.m6541a(), c1730g.m6544c(), ((C1731h) c1730g.m6545d().get(0)).m6553c().m6505c());
        this.f15572c.setToolbarListener(new C2032a(this) {
            /* renamed from: b */
            final /* synthetic */ C3912i f15569b;

            /* renamed from: a */
            public void mo1482a() {
                audienceNetworkActivity.finish();
            }
        });
    }

    /* renamed from: e */
    public void mo1422e() {
        this.f15575f.m7310a();
        this.f15572c.setToolbarListener(null);
        mo3978a();
    }

    protected C1965a getAudienceNetworkListener() {
        return this.f15574e;
    }

    protected void onConfigurationChanged(Configuration configuration) {
        this.f15572c.m19457d();
        super.onConfigurationChanged(configuration);
        final ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        viewTreeObserver.addOnGlobalLayoutListener(new OnGlobalLayoutListener(this) {
            /* renamed from: b */
            final /* synthetic */ C3912i f6393b;

            public void onGlobalLayout() {
                this.f6393b.f15572c.m19458e();
                if (VERSION.SDK_INT >= 14) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
            }
        });
    }

    public void setListener(C1965a c1965a) {
        this.f15574e = c1965a;
    }
}
