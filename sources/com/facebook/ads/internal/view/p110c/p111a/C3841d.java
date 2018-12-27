package com.facebook.ads.internal.view.p110c.p111a;

import android.support.v7.widget.RecyclerView.C0771a;
import android.support.v7.widget.RecyclerView.C0798v;
import android.view.ViewGroup;
import com.facebook.ads.internal.adapters.p082a.C1727d;
import com.facebook.ads.internal.p085d.C1779b;
import com.facebook.ads.internal.p094m.C1827c;
import com.facebook.ads.internal.p101q.p102a.C1933t;
import com.facebook.ads.internal.p107r.C1958a;
import com.facebook.ads.internal.view.C1980a.C1965a;
import com.facebook.ads.internal.view.component.p112a.C2011d.C2010a;
import com.facebook.ads.internal.view.component.p112a.p113a.C2006c;
import java.util.List;

/* renamed from: com.facebook.ads.internal.view.c.a.d */
public class C3841d extends C0771a<C3846g> {
    /* renamed from: a */
    private final C1827c f15322a;
    /* renamed from: b */
    private final C1779b f15323b;
    /* renamed from: c */
    private final C1958a f15324c;
    /* renamed from: d */
    private final C1933t f15325d;
    /* renamed from: e */
    private final C1727d f15326e;
    /* renamed from: f */
    private C1965a f15327f;
    /* renamed from: g */
    private int f15328g;
    /* renamed from: h */
    private int f15329h;
    /* renamed from: i */
    private String f15330i;
    /* renamed from: j */
    private int f15331j;
    /* renamed from: k */
    private int f15332k;
    /* renamed from: l */
    private List<C1994b> f15333l;
    /* renamed from: m */
    private final C3840a f15334m;

    /* renamed from: com.facebook.ads.internal.view.c.a.d$a */
    public interface C1995a {
        /* renamed from: a */
        void mo1431a(int i);
    }

    C3841d(List<C1994b> list, C1827c c1827c, C1779b c1779b, C1958a c1958a, C1933t c1933t, C1965a c1965a, C1727d c1727d, String str, int i, int i2, int i3, int i4, C3840a c3840a) {
        this.f15322a = c1827c;
        this.f15323b = c1779b;
        this.f15324c = c1958a;
        this.f15325d = c1933t;
        this.f15327f = c1965a;
        this.f15333l = list;
        this.f15329h = i;
        this.f15326e = c1727d;
        this.f15331j = i4;
        this.f15330i = str;
        this.f15328g = i3;
        this.f15332k = i2;
        this.f15334m = c3840a;
    }

    /* renamed from: a */
    public int mo91a() {
        return this.f15333l.size();
    }

    /* renamed from: a */
    public C3846g m19174a(ViewGroup viewGroup, int i) {
        return new C3846g(C2006c.m7529a(new C2010a(viewGroup.getContext(), this.f15322a, this.f15327f, null, null, this.f15324c, this.f15325d).m7557a(), this.f15331j, this.f15326e, this.f15330i, this.f15334m), this.f15324c, this.f15329h, this.f15328g, this.f15332k, this.f15333l.size());
    }

    /* renamed from: a */
    public /* synthetic */ void mo94a(C0798v c0798v, int i) {
        m19176a((C3846g) c0798v, i);
    }

    /* renamed from: a */
    public void m19176a(C3846g c3846g, int i) {
        c3846g.m19187a((C1994b) this.f15333l.get(i), this.f15322a, this.f15323b, this.f15325d, this.f15330i, false);
    }

    /* renamed from: b */
    public /* synthetic */ C0798v mo96b(ViewGroup viewGroup, int i) {
        return m19174a(viewGroup, i);
    }
}
