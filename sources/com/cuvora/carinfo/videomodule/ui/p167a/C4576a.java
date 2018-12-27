package com.cuvora.carinfo.videomodule.ui.p167a;

import android.arch.lifecycle.C0035q;
import android.databinding.C0060f;
import android.databinding.ViewDataBinding;
import android.support.v7.p026e.p027a.C3213c;
import android.support.v7.p029g.C0702c.C0698c;
import android.support.v7.widget.RecyclerView.C0798v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.cuvora.carinfo.videomodule.ui.C1596b;
import kotlin.jvm.internal.C2885g;

/* renamed from: com.cuvora.carinfo.videomodule.ui.a.a */
public final class C4576a<T extends C1596b> extends C3213c<T, C0798v> {
    /* renamed from: a */
    private C0035q f18956a;

    /* renamed from: com.cuvora.carinfo.videomodule.ui.a.a$1 */
    public static final class C37141 extends C0698c<T> {
        C37141() {
        }

        /* renamed from: a */
        public boolean m18545a(T t, T t2) {
            if (t != null) {
                t = t.mo1248b();
                if (t != null) {
                    return t.equals(t2 != null ? t2.mo1248b() : null);
                }
            }
            return null;
        }

        /* renamed from: b */
        public boolean m18547b(T t, T t2) {
            return t != null ? t.equals(t2) : null;
        }
    }

    /* renamed from: com.cuvora.carinfo.videomodule.ui.a.a$a */
    public final class C3715a extends C0798v {
        /* renamed from: n */
        final /* synthetic */ C4576a f14938n;
        /* renamed from: o */
        private final ViewDataBinding f14939o;

        public C3715a(C4576a c4576a, ViewDataBinding viewDataBinding) {
            C2885g.m13910b(viewDataBinding, "binding");
            this.f14938n = c4576a;
            super(viewDataBinding.m24026d());
            this.f14939o = viewDataBinding;
        }

        /* renamed from: a */
        public final void m18549a(Object obj, int i) {
            C2885g.m13910b(obj, "obj");
            this.f14939o.mo4903a(i, obj);
            if (this.f14938n.m25181b() != null) {
                this.f14939o.mo4903a(3, this.f14938n.m25181b());
            }
            this.f14939o.m24021a();
        }
    }

    public C4576a() {
        super(new C37141());
    }

    /* renamed from: a */
    public final void m25178a(C0035q c0035q) {
        this.f18956a = c0035q;
    }

    /* renamed from: b */
    public final C0035q m25181b() {
        return this.f18956a;
    }

    /* renamed from: b */
    public int mo95b(int i) {
        return ((C1596b) m16039c(i)).mo1247a();
    }

    /* renamed from: b */
    public C0798v mo96b(ViewGroup viewGroup, int i) {
        C2885g.m13910b(viewGroup, "parent");
        return new C3715a(this, m25177a(viewGroup, i));
    }

    /* renamed from: a */
    private final ViewDataBinding m25177a(ViewGroup viewGroup, int i) {
        Object a = C0060f.m134a(LayoutInflater.from(viewGroup.getContext()), i, viewGroup, false);
        C2885g.m13907a(a, "DataBindingUtil.inflate(… layoutId, parent, false)");
        return a;
    }

    /* renamed from: a */
    public void mo94a(C0798v c0798v, int i) {
        C2885g.m13910b(c0798v, "holder");
        C3715a c3715a = (C3715a) c0798v;
        Object c = m16039c(i);
        C2885g.m13907a(c, "getItem(position)");
        c3715a.m18549a(c, ((C1596b) m16039c(i)).mo1249c());
    }
}
