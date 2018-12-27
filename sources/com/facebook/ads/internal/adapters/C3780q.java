package com.facebook.ads.internal.adapters;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView.C0771a;
import android.support.v7.widget.RecyclerView.C0798v;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import com.facebook.ads.internal.p095n.C1837d;
import com.facebook.ads.internal.p095n.C1839f;
import com.facebook.ads.internal.p095n.C1840g;
import com.facebook.ads.internal.p101q.p102a.C1936w;
import com.facebook.ads.internal.p107r.C1958a.C1957a;
import com.facebook.ads.internal.view.C2091s;
import com.facebook.ads.internal.view.C3847c;
import com.facebook.ads.internal.view.C3913l;
import com.facebook.ads.internal.view.hscroll.C4861b;
import com.facebook.ads.internal.view.p109b.C1991d;
import com.facebook.ads.internal.view.p109b.C1992e;
import java.util.List;

/* renamed from: com.facebook.ads.internal.adapters.q */
public class C3780q extends C0771a<C3847c> {
    /* renamed from: a */
    private static final int f15156a = Color.argb(51, 0, 0, 0);
    /* renamed from: b */
    private final C1957a f15157b = new C37781(this);
    /* renamed from: c */
    private final List<C1837d> f15158c;
    /* renamed from: d */
    private final int f15159d;
    /* renamed from: e */
    private final int f15160e;
    /* renamed from: f */
    private C1754a f15161f;

    /* renamed from: com.facebook.ads.internal.adapters.q$a */
    public interface C1754a {
        /* renamed from: a */
        void mo1287a();
    }

    /* renamed from: com.facebook.ads.internal.adapters.q$1 */
    class C37781 extends C1957a {
        /* renamed from: a */
        final /* synthetic */ C3780q f15151a;

        C37781(C3780q c3780q) {
            this.f15151a = c3780q;
        }

        /* renamed from: a */
        public void mo1338a() {
            if (this.f15151a.f15161f != null) {
                this.f15151a.f15161f.mo1287a();
            }
        }
    }

    public C3780q(C4861b c4861b, List<C1837d> list) {
        float f = c4861b.getContext().getResources().getDisplayMetrics().density;
        this.f15158c = list;
        this.f15159d = Math.round(f * 1.0f);
        this.f15160e = c4861b.getChildSpacing();
    }

    /* renamed from: a */
    public int mo91a() {
        return this.f15158c.size();
    }

    /* renamed from: a */
    public C3847c m18911a(ViewGroup viewGroup, int i) {
        return new C3847c(new C3913l(viewGroup.getContext()));
    }

    /* renamed from: a */
    public /* synthetic */ void mo94a(C0798v c0798v, int i) {
        m18914a((C3847c) c0798v, i);
    }

    /* renamed from: a */
    public void m18913a(C1754a c1754a) {
        this.f15161f = c1754a;
    }

    /* renamed from: a */
    public void m18914a(C3847c c3847c, final int i) {
        LayoutParams marginLayoutParams = new MarginLayoutParams(-2, -1);
        marginLayoutParams.setMargins(i == 0 ? this.f15160e * 2 : this.f15160e, 0, i >= this.f15158c.size() + -1 ? this.f15160e * 2 : this.f15160e, 0);
        View view = (C3913l) c3847c.f15353n;
        view.setLayoutParams(marginLayoutParams);
        view.setPadding(this.f15159d, this.f15159d, this.f15159d, this.f15159d);
        final ImageView imageView = (C2091s) view.getAdContentsView();
        C1936w.m7328a((View) imageView, 0);
        imageView.setImageDrawable(null);
        final C1837d c1837d = (C1837d) this.f15158c.get(i);
        c1837d.m6991a(view, (C1840g) view);
        C1839f e = c1837d.m7004e();
        if (e != null) {
            C1991d a = new C1991d(imageView).m7499a();
            a.m7501a(new C1992e(this) {
                /* renamed from: d */
                final /* synthetic */ C3780q f15155d;

                /* renamed from: a */
                public void mo1272a(boolean z) {
                    if (i == 0) {
                        c1837d.m6996a(this.f15155d.f15157b);
                    }
                    c1837d.m6998a(z, true);
                    C1936w.m7328a(imageView, C3780q.f15156a);
                }
            });
            a.m7503a(e.m7018a());
        }
    }

    /* renamed from: b */
    public /* synthetic */ C0798v mo96b(ViewGroup viewGroup, int i) {
        return m18911a(viewGroup, i);
    }
}
