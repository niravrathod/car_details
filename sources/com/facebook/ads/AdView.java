package com.facebook.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.C3766a;
import com.facebook.ads.internal.adapters.C1737a;
import com.facebook.ads.internal.adapters.C1746h;
import com.facebook.ads.internal.p093l.C1820a;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.protocol.C1894a;
import com.facebook.ads.internal.protocol.C1898d;
import com.facebook.ads.internal.protocol.C1899e;
import com.facebook.ads.internal.protocol.C1901g;
import com.facebook.ads.internal.view.p109b.C1990c;
import com.facebook.ads.internal.view.p109b.C3835a;

public class AdView extends RelativeLayout implements C1699a {
    /* renamed from: a */
    private static final C1898d f15033a = C1898d.ADS;
    /* renamed from: b */
    private final DisplayMetrics f15034b;
    /* renamed from: c */
    private final C1899e f15035c;
    /* renamed from: d */
    private final String f15036d;
    /* renamed from: e */
    private C3766a f15037e;
    /* renamed from: f */
    private C1701c f15038f;
    /* renamed from: g */
    private View f15039g;
    /* renamed from: h */
    private C1990c f15040h;

    public AdView(Context context, final String str, AdSize adSize) {
        super(context);
        if (adSize == null || adSize == AdSize.f5067d) {
            throw new IllegalArgumentException("adSize");
        }
        this.f15034b = getContext().getResources().getDisplayMetrics();
        this.f15035c = adSize.m6382c();
        this.f15036d = str;
        this.f15037e = new C3766a(context, str, C1901g.m7242a(this.f15035c), AdPlacementType.BANNER, adSize.m6382c(), f15033a, 1, true);
        this.f15037e.m18832a(new C1746h(this) {
            /* renamed from: b */
            final /* synthetic */ AdView f15032b;

            /* renamed from: com.facebook.ads.AdView$1$1 */
            class C16891 implements OnLongClickListener {
                /* renamed from: a */
                final /* synthetic */ C37451 f5073a;

                C16891(C37451 c37451) {
                    this.f5073a = c37451;
                }

                public boolean onLongClick(View view) {
                    this.f5073a.f15032b.f15040h.setBounds(0, 0, this.f5073a.f15032b.f15039g.getWidth(), this.f5073a.f15032b.f15039g.getHeight());
                    this.f5073a.f15032b.f15040h.m7495a(this.f5073a.f15032b.f15040h.m7496a() ^ true);
                    return true;
                }
            }

            /* renamed from: a */
            public void mo1274a() {
                if (this.f15032b.f15038f != null) {
                    this.f15032b.f15038f.mo1512b(this.f15032b);
                }
            }

            /* renamed from: a */
            public void mo1275a(View view) {
                if (view != null) {
                    this.f15032b.f15039g = view;
                    this.f15032b.removeAllViews();
                    this.f15032b.addView(this.f15032b.f15039g);
                    if (this.f15032b.f15039g instanceof C3835a) {
                        C1901g.m7243a(this.f15032b.f15034b, this.f15032b.f15039g, this.f15032b.f15035c);
                    }
                    if (this.f15032b.f15038f != null) {
                        this.f15032b.f15038f.mo1510a(this.f15032b);
                    }
                    if (C1820a.m6846b(this.f15032b.getContext())) {
                        this.f15032b.f15040h = new C1990c();
                        this.f15032b.f15040h.m7494a(str);
                        this.f15032b.f15040h.m7498b(this.f15032b.getContext().getPackageName());
                        if (this.f15032b.f15037e.m18830a() != null) {
                            this.f15032b.f15040h.m7492a(this.f15032b.f15037e.m18830a().m6794a());
                        }
                        if (this.f15032b.f15039g instanceof C3835a) {
                            this.f15032b.f15040h.m7493a(((C3835a) this.f15032b.f15039g).getViewabilityChecker());
                        }
                        this.f15032b.f15039g.setOnLongClickListener(new C16891(this));
                        this.f15032b.f15039g.getOverlay().add(this.f15032b.f15040h);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("Cannot present null view");
            }

            /* renamed from: a */
            public void mo1276a(C1737a c1737a) {
                if (this.f15032b.f15037e != null) {
                    this.f15032b.f15037e.m18837b();
                }
            }

            /* renamed from: a */
            public void mo1277a(C1894a c1894a) {
                if (this.f15032b.f15038f != null) {
                    this.f15032b.f15038f.mo1511a(this.f15032b, C1700b.m6434a(c1894a));
                }
            }

            /* renamed from: b */
            public void mo1278b() {
                if (this.f15032b.f15038f != null) {
                    this.f15032b.f15038f.mo1490c(this.f15032b);
                }
            }
        });
    }

    /* renamed from: a */
    private void m18672a(String str) {
        this.f15037e.m18835a(str);
    }

    /* renamed from: a */
    public void m18678a() {
        m18672a(null);
    }

    /* renamed from: b */
    public void m18679b() {
        if (this.f15037e != null) {
            this.f15037e.m18838b(true);
            this.f15037e = null;
        }
        if (this.f15040h != null && C1820a.m6846b(getContext())) {
            this.f15040h.m7497b();
            this.f15039g.getOverlay().remove(this.f15040h);
        }
        removeAllViews();
        this.f15039g = null;
        this.f15038f = null;
    }

    public String getPlacementId() {
        return this.f15036d;
    }

    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f15039g != null) {
            C1901g.m7243a(this.f15034b, this.f15039g, this.f15035c);
        }
    }

    public void setAdListener(C1701c c1701c) {
        this.f15038f = c1701c;
    }
}
