package com.facebook.ads.internal.view.p110c.p111a;

import android.support.v7.widget.RecyclerView.C0798v;
import android.text.TextUtils;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.facebook.ads.internal.p085d.C1779b;
import com.facebook.ads.internal.p094m.C1827c;
import com.facebook.ads.internal.p101q.p102a.C1921k;
import com.facebook.ads.internal.p101q.p102a.C1933t;
import com.facebook.ads.internal.p107r.C1958a;
import com.facebook.ads.internal.p107r.C1958a.C1957a;
import com.facebook.ads.internal.view.component.p112a.p113a.C3849b;
import com.facebook.ads.internal.view.component.p112a.p113a.C3849b.C2002a;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.view.c.a.g */
class C3846g extends C0798v {
    /* renamed from: n */
    private final C3849b f15344n;
    /* renamed from: o */
    private final int f15345o;
    /* renamed from: p */
    private final int f15346p;
    /* renamed from: q */
    private final int f15347q;
    /* renamed from: r */
    private final int f15348r;
    /* renamed from: s */
    private boolean f15349s = false;
    /* renamed from: t */
    private C1958a f15350t;
    /* renamed from: u */
    private C1957a f15351u;
    /* renamed from: v */
    private C1958a f15352v;

    C3846g(C3849b c3849b, C1958a c1958a, int i, int i2, int i3, int i4) {
        super(c3849b);
        this.f15344n = c3849b;
        this.f15352v = c1958a;
        this.f15345o = i;
        this.f15346p = i2;
        this.f15347q = i3;
        this.f15348r = i4;
    }

    /* renamed from: a */
    private String m19183a(C1779b c1779b, String str) {
        Object b = (c1779b == null || str == null) ? "" : c1779b.m6690b(str);
        return !TextUtils.isEmpty(b) ? b : str;
    }

    /* renamed from: a */
    private void m19184a(C1827c c1827c, C1933t c1933t, String str, final C1994b c1994b) {
        if (!this.f15349s) {
            if (this.f15350t != null) {
                this.f15350t.m7422c();
                this.f15350t = null;
            }
            final Map a = c1994b.m7507a();
            final String str2 = str;
            final C1933t c1933t2 = c1933t;
            final C1827c c1827c2 = c1827c;
            this.f15351u = new C1957a(this) {
                /* renamed from: e */
                final /* synthetic */ C3846g f15341e;

                /* renamed from: a */
                public void mo1338a() {
                    if (!(this.f15341e.f15352v.m7421b() || TextUtils.isEmpty(str2))) {
                        if (this.f15341e.f15350t != null) {
                            this.f15341e.f15350t.m7419a(a);
                        }
                        a.put("touch", C1921k.m7293a(c1933t2.m7321e()));
                        c1827c2.mo1355a(str2, a);
                    }
                    this.f15341e.f15349s = true;
                }
            };
            this.f15350t = new C1958a(this.f15344n, 10, this.f15351u);
            this.f15350t.m7418a(100);
            this.f15350t.m7420b(100);
            this.f15344n.setOnAssetsLoadedListener(new C2002a(this) {
                /* renamed from: b */
                final /* synthetic */ C3846g f15343b;

                /* renamed from: a */
                public void mo1432a() {
                    if (c1994b.m7508b() == 0) {
                        this.f15343b.f15352v.m7417a();
                    }
                    this.f15343b.f15350t.m7417a();
                }
            });
        }
    }

    /* renamed from: a */
    void m19187a(C1994b c1994b, C1827c c1827c, C1779b c1779b, C1933t c1933t, String str, boolean z) {
        int b = c1994b.m7508b();
        this.f15344n.setTag(-1593835536, Integer.valueOf(b));
        LayoutParams marginLayoutParams = new MarginLayoutParams(this.f15345o, -2);
        marginLayoutParams.setMargins(b == 0 ? this.f15346p : this.f15347q, 0, b >= this.f15348r + -1 ? this.f15346p : this.f15347q, 0);
        String g = c1994b.m7509c().m6553c().m6509g();
        String a = c1994b.m7509c().m6553c().m6502a();
        this.f15344n.setIsVideo(TextUtils.isEmpty(a) ^ 1);
        if (this.f15344n.m19201d()) {
            this.f15344n.setVideoPlaceholderUrl(g);
            this.f15344n.setVideoUrl(m19183a(c1779b, a));
            if (z) {
                this.f15344n.m19203f();
            }
        } else {
            this.f15344n.setImageUrl(g);
        }
        this.f15344n.setLayoutParams(marginLayoutParams);
        this.f15344n.m19196a(c1994b.m7509c().m6551a().m6520a(), c1994b.m7509c().m6551a().m6522c());
        this.f15344n.m19197a(c1994b.m7509c().m6552b().m6533b(), c1994b.m7509c().m6552b().m6532a(), c1994b.m7507a());
        this.f15344n.m19198a(c1994b.m7507a());
        m19184a(c1827c, c1933t, str, c1994b);
    }
}
