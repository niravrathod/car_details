package android.support.v7.p026e.p027a;

import android.support.v7.p026e.p027a.C0689a.C0688a;
import android.support.v7.p029g.C0702c.C0698c;
import android.support.v7.p029g.C3214a;
import android.support.v7.widget.RecyclerView.C0771a;
import android.support.v7.widget.RecyclerView.C0798v;
import java.util.List;

/* renamed from: android.support.v7.e.a.c */
public abstract class C3213c<T, VH extends C0798v> extends C0771a<VH> {
    /* renamed from: a */
    private final C0692b<T> f13490a;

    protected C3213c(C0698c<T> c0698c) {
        this.f13490a = new C0692b(new C3214a(this), new C0688a(c0698c).m2719a());
    }

    /* renamed from: a */
    public void m16038a(List<T> list) {
        this.f13490a.m2728a((List) list);
    }

    /* renamed from: c */
    protected T m16039c(int i) {
        return this.f13490a.m2727a().get(i);
    }

    /* renamed from: a */
    public int mo91a() {
        return this.f13490a.m2727a().size();
    }
}
